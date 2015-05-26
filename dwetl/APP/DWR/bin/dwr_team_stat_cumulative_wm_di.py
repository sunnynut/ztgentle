#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
pre7day=Time.date_sub(data_dt , 7 )
pre30day=Time.date_sub(data_dt , 30 )

SQL1="""
use dwr;
create table if not exists dwr.dwr_team_stat_cumulative_wm_di(
team_id int,
platform_type string ,
detail_pv_w bigint ,
pay_room_night_w bigint ,
refund_room_night_w bigint, 
net_room_night  bigint, 
voucher_room_night_w bigint , 
detail_pv_m bigint ,
pay_room_night_m bigint ,
refund_room_night_m bigint, 
net_room_night_m bigint, 
voucher_room_night_m bigint , 
city_code string, 
city_name string
)
partitioned by (dt string )
"""

SQL2="insert overwrite table dwr.dwr_team_stat_cumulative_wm_di partition(dt='" + data_dt + """')
select team_id , platform_type , detail_pv_w , pay_room_night_w , refund_room_night_w , net_room_night_w , voucher_room_night_w ,
detail_pv_m , pay_room_night_m , refund_room_night_m , net_room_night_m , voucher_room_night_m , city_code , city_name
from
(
select 
p1.team_id as team_id , 
p1.platform_type as platform_type , 
p1.detail_pv_cum - coalesce( p7.detail_pv_cum , 0 )  as detail_pv_w , 
p1.pay_room_night_cum - coalesce( p7.pay_room_night_cum , 0 ) as pay_room_night_w, 
p1.refund_room_night_cum - coalesce( p7.refund_room_night_cum , 0 ) as refund_room_night_w,  
p1.net_room_night_cum - coalesce( p7.net_room_night_cum , 0 ) as net_room_night_w, 
p1.voucher_room_night_cum - coalesce( p7.voucher_room_night_cum , 0 ) as voucher_room_night_w,
p1.detail_pv_cum - coalesce( p30.detail_pv_cum , 0 )  as detail_pv_m, 
p1.pay_room_night_cum - coalesce( p30.pay_room_night_cum , 0 ) as pay_room_night_m, 
p1.refund_room_night_cum - coalesce( p30.refund_room_night_cum , 0 ) as refund_room_night_m ,  
p1.net_room_night_cum - coalesce( p30.net_room_night_cum , 0 ) as net_room_night_m, 
p1.voucher_room_night_cum - coalesce( p30.voucher_room_night_cum , 0 ) as voucher_room_night_m,
p1.city_code as city_code , 
p1.city_name as city_name 
from 
(
select tsc.team_id , tsc.platform_type ,  tsc.detail_pv_cum, tsc.pay_room_night_cum , tsc.refund_room_night_cum ,  
tsc.net_room_night_cum , tsc.voucher_room_night_cum, dc.city_code , dc.city_name
from dwr.dwr_team_stat_cumulative_di tsc
join dwd.dwd_com_team_city_rel_da  h on h.team_id = tsc.team_id
join dim.dim_city dc on dc.city_code = h.city_code
where tsc.dt='""" + data_dt + """' and h.dt='""" + data_dt + """' and dc.dt='""" + data_dt + """'  
)p1
full outer join 
(
select *
from dwr.dwr_team_stat_cumulative_di where dt='""" + pre7day + """'
)p7 on p1.team_id = p7.team_id and p1.platform_type=p7.platform_type
full outer join 
(
select * 
from dwr.dwr_team_stat_cumulative_di where dt='""" + pre30day + """'
)p30 on p7.team_id = p30.team_id and p7.platform_type=p30.platform_type

union all

select 
p1.team_id as team_id , 
'total' as platform_type, 
sum(p1.detail_pv_cum) - sum(coalesce( p7.detail_pv_cum , 0 )) as detail_pv_w , 
sum(p1.pay_room_night_cum)  - sum(coalesce( p7.pay_room_night_cum , 0 ) ) as pay_room_night_w, 
sum( p1.refund_room_night_cum ) - sum( coalesce( p7.refund_room_night_cum , 0 ) ) as refund_room_night_w,  
sum( p1.net_room_night_cum ) - sum( coalesce( p7.net_room_night_cum , 0 ) )  as net_room_night_w, 
sum( p1.voucher_room_night_cum )  - sum( coalesce( p7.voucher_room_night_cum , 0 ) ) as voucher_room_night_w ,
sum( p1.detail_pv_cum ) - sum( coalesce( p30.detail_pv_cum , 0 ) ) as detail_pv_m, 
sum( p1.pay_room_night_cum)  - sum( coalesce( p30.pay_room_night_cum , 0 ) ) as pay_room_night_m, 
sum( p1.refund_room_night_cum )  - sum( coalesce( p30.refund_room_night_cum , 0 ) ) as refund_room_night_m,  
sum( p1.net_room_night_cum )  - sum( coalesce( p30.net_room_night_cum , 0 ) ) as net_room_night_m, 
sum( p1.voucher_room_night_cum )  - sum( coalesce( p30.voucher_room_night_cum , 0 ) ) as voucher_room_night_m,
max(p1.city_code) as city_code , 
max(p1.city_name) as city_name 
from 
(
select tsc.team_id , tsc.platform_type ,  tsc.detail_pv_cum, tsc.pay_room_night_cum , tsc.refund_room_night_cum ,  
tsc.net_room_night_cum , tsc.voucher_room_night_cum, dc.city_code , dc.city_name
from dwr.dwr_team_stat_cumulative_di tsc
join dwd.dwd_com_team_city_rel_da  h on h.team_id = tsc.team_id
join dim.dim_city dc on dc.city_code = h.city_code
where tsc.dt='""" + data_dt + """' and h.dt='""" + data_dt + """' and dc.dt='""" + data_dt + """'  
)p1
full outer join 
(
select * 
from dwr.dwr_team_stat_cumulative_di where dt='""" + pre7day + """'
)p7 on p1.team_id = p7.team_id and p1.platform_type=p7.platform_type
full outer join 
(
select * 
from dwr.dwr_team_stat_cumulative_di where dt='""" + pre30day + """'
)p30 on p7.team_id = p30.team_id and p7.platform_type=p30.platform_type
group by p1.team_id
)final
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
