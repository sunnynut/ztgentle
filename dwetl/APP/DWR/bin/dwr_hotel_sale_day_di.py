#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
int_data_dt=data_dt.replace('-','')
SQL1="""
insert overwrite table dwr.dwr_hotel_sale_day_di partition (dt = '"""+data_dt+"""')
select
    hotel_seq,
    platform_type,
    sum(estimate_cash_room_night),
    sum(estimate_prepay_room_night),
    sum(estimate_nightsell_room_night),
    sum(estimate_ota_room_night),
    sum(estimate_team_room_night),
    sum(actural_cash_room_night),
    sum(actural_prepay_room_night),
    sum(actural_nightsell_room_night),
    sum(actural_ota_room_night),
    sum(actural_team_room_night),
    sum(estimate_other_room_night)
from
(select 
    hotel_seq,
    platform_type,
    sum(case when business_line='direct' and payment_type='现付' then stats_room_night else 0.0 end) as estimate_cash_room_night,
    sum(case when business_line='direct' and payment_type='预付' then stats_room_night else 0.0 end) as estimate_prepay_room_night,
    sum(case when business_line='nightsell' then stats_room_night else 0.0 end) as estimate_nightsell_room_night,
    sum(case when business_line='ota' then stats_room_night else 0.0 end) as estimate_ota_room_night,
    sum(case when business_line='tuan' then stats_room_night else 0.0 end) as estimate_team_room_night,
    0.0 as actural_cash_room_night,
    0.0 as actural_prepay_room_night,
    0.0 as actural_nightsell_room_night,
    0.0 as actural_ota_room_night,
    0 as actural_team_room_night,
    sum(case when business_line='unknown' then stats_room_night else 0.0 end) as estimate_other_room_night
from
(
select
  hotel_seq,
  case when is_wap=1 then 'wireless' when is_wap=0 then 'www' else 'unknown' end as platform_type,
  case when business_type in('qta','hms_commission','hms_discount','hms_ppb') or (business_type in('集团官网') and business_sub_type in('集团官网COMMON','hms_commission非担保','hms_ppb')) then 'direct' 
       when business_type in('ota_tts','otacpc','cpc跳转') or (business_type in('集团官网')  and business_sub_type in ('cpc跳转','ota_tts担保','ota_tts非担保','otacpc','ota担保','ota非担保','ota_tts')) then 'ota'
       when business_type in('NIGHT_SELL') or (business_type in('集团官网')  and business_sub_type in ('NIGHT_SELL','集团官网NIGHT_SELL')) then 'nightsell'
       when business_type in('tuan_hotel')  then 'tuan'
  else 'unknown' end as business_line,
  case when payment='CASH' then '现付'
       when payment='PROXY' then '预付'
  else 'unknown' end as payment_type,
  sum(stats_room_night) as stats_room_night
from default.rpt_room_night_stats_gb_seq
where dt='"""+int_data_dt+"""'
group by 
  hotel_seq,
  case when is_wap=1 then 'wireless' when is_wap=0 then 'www' else 'unknown' end ,
  case when business_type in('qta','hms_commission','hms_discount','hms_ppb') or (business_type in('集团官网') and business_sub_type in('集团官网COMMON','hms_commission非担保','hms_ppb')) then 'direct' 
       when business_type in('ota_tts','otacpc','cpc跳转') or (business_type in('集团官网')  and business_sub_type in ('cpc跳转','ota_tts担保','ota_tts非担保','otacpc','ota担保','ota非担保','ota_tts')) then 'ota'
       when business_type in('NIGHT_SELL') or (business_type in('集团官网')  and business_sub_type in ('NIGHT_SELL','集团官网NIGHT_SELL')) then 'nightsell'
       when business_type in('tuan_hotel')  then 'tuan'
  else 'unknown' end ,
  case when payment='CASH' then '现付'
       when payment='PROXY' then '预付'
  else 'unknown' end)q
group by hotel_seq,
platform_type 
union all
select 
    hotel_seq,
    platform_type,
    0.0 as estimate_cash_room_night,
    0.0 as estimate_prepay_room_night,
    0.0 as estimate_nightsell_room_night,
    0.0 as estimate_ota_room_night,
    0.0 as estimate_team_room_night,
    sum(cash_room_night) as actural_cash_room_night,
    sum(prepay_room_night) as actural_prepay_room_night,
    0.0 as actural_nightsell_room_night,
    0.0 as actural_ota_room_night,
    0 as actural_team_room_night,
    0.0 as estimate_other_room_night
from(
select 
    hotel_seq,
    case when is_wap=1 then 'wireless' when is_wap=0 then 'www' else 'unknown' end as platform_type,
    sum(case when pay_type='CASH' then room_night else 0.0 end) as cash_room_night,
    sum(case when pay_type='PROXY' then room_night else 0.0 end) as prepay_room_night
from default.dw_order_info_v21
where dt='"""+int_data_dt+"""' 
and business_type='direct' and data_source <>'hms_ppb' 
and business_sub_type in ('GROUP_SELL','COMMON','HSA')
and checkout_date='"""+data_dt+"""' 
and order_status in ('CHECKED_OUT','CHECKED_IN')
group by hotel_seq,
    case when is_wap=1 then 'wireless' when is_wap=0 then 'www' else 'unknown' end
union all
select 
    hotel_seq,
    case when is_wap=1 then 'wireless' when is_wap=0 then 'www' else 'unknown' end as platform_type,
    ceil(sum(case when pay_type='CASH' then room_night*0.5 else 0.0 end))  as cash_room_night,
    sum(case when pay_type in('PROXY', 'ONLINE') and coalesce(pay_status,'abc') not in ('REFUND', 'REFUND_SUCCESS') then room_night
             when pay_type in('PROXY', 'ONLINE') and pay_status in ('REFUND', 'REFUND_SUCCESS') then -1*room_night
        else 0.0 end) as prepay_room_night
from default.dw_order_info_v21
where dt='"""+int_data_dt+"""' 
and data_source ='hms_ppb' 
and confirmed_succ_time is not null
and business_sub_type in ('GROUP_SELL','COMMON','HSA')
and checkout_date ='"""+data_dt+"""' 
group by hotel_seq,
    case when is_wap=1 then 'wireless' when is_wap=0 then 'www' else 'unknown' end
)q
group by hotel_seq,platform_type
union all
select 
    hotel_seq,
    case when is_wap=1 then 'wireless' when is_wap=0 then 'www' else 'unknown' end as platform_type,
    0.0 as estimate_cash_room_night,
    0.0 as estimate_prepay_room_night,
    0.0 as estimate_nightsell_room_night,
    0.0 as estimate_ota_room_night,
    0.0 as estimate_team_room_night,
    0.0 as actural_cash_room_night,
    0.0 as actural_prepay_room_night,
    sum(case when business_sub_type='NIGHT_SELL' then room_night else 0.0 end) as actural_nightsell_room_night,
    sum(case when business_type='ota' and  business_sub_type='OTATTS' then room_night else 0.0 end) as actural_ota_room_night,
    0 as actural_team_room_night,
    0.0 as estimate_other_room_night
from default.dw_order_info_v21
where dt='"""+int_data_dt+"""'
and checkout_date ='"""+data_dt+"""'
group by hotel_seq,case when is_wap=1 then 'wireless' when is_wap=0 then 'www' else 'unknown' end
union all
select 
    t1.hotel_seq,
    case when coalesce(substring(t3.vid,1,1),'a')  in ('6','8','9') then 'wireless' else 'www' end as platform_type,
    0.0 as estimate_cash_room_night,
    0.0 as estimate_prepay_room_night,
    0.0 as estimate_nightsell_room_night,
    0.0 as estimate_ota_room_night,
    0.0 as estimate_team_room_night,
    0.0 as actural_cash_room_night,
    0.0 as actural_prepay_room_night,
    0.0 as actural_nightsell_room_night,
    0.0 as actural_ota_room_night,
    count(1) as actural_team_room_night,
    0.0 as estimate_other_room_night
from dwd.dwd_evt_coupon_consume_trace t1 
inner join(select * from dim.dim_team_his_da where dt='"""+data_dt+"""' and effective_end_date='4712-12-31' and group_id=4)t2
on t1.team_id=t2.team_id
inner join(select * from stg.stg_qunar_group_order_da where dt='"""+data_dt+"""')t3
on t1.order_id=t3.id
where substr(t1.operate_time,1,10)='"""+data_dt+"""'
and operate_type='consume'
group by t1.hotel_seq,
    case when coalesce(substring(t3.vid,1,1),'a')  in ('6','8','9') then 'wireless' else 'www' end
)p
group by hotel_seq,platform_type;
"""

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def main():
    
    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
if __name__ == '__main__':
    main()