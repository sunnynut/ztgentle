#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

data_dt_int = data_dt.replace("-","")

print data_dt
print data_dt_int

SQL1="""
insert overwrite table dwr.dwr_hotel_web_traffic_di partition (dt = '""" + data_dt + """')
select
  coalesce(c.hotel_seq, d.hotel_seq, e.hotel_seq) as hotel_seq,
  coalesce(c.platform_type, d.platform_type, e.platform_type) as platform_type,
  coalesce(c.list_show_pv, 0) as list_show_pv,
  coalesce(c.list_first_screen_show_pv, 0) as list_first_screen_show_pv,
  coalesce(d.detail_pv, 0) as detail_pv,
  coalesce(d.detail_uv, 0) as detail_uv,
  coalesce(e.cash_book_pv, 0) as cash_book_pv,
  coalesce(e.prepay_book_pv, 0) as prepay_book_pv,
  coalesce(e.direct_book_pv, 0) as direct_book_pv,
  coalesce(e.team_book_pv, 0) as team_book_pv,
  coalesce(e.other_book_pv, 0) as other_book_pv
from
(
select
  platform_type,
  hotel_seq,
  list_show_pv,
  list_first_screen_show_pv
from
(
select
  'www' as platform_type,
  hotel_seq,
  count(*) as list_show_pv,
  sum(0) as list_first_screen_show_pv
from
  default.ods_listpage_snapshot_log
where
  dt = '""" + data_dt_int + """'
group by
  hotel_seq
union all
select
  'wireless' as platform_type,
  hotel_seq,
  count(*) as list_show_pv,
  sum(first_screen) as list_first_screen_show_pv
from
(
  select
    hotelseq as hotel_seq,
    case when start = 0 then 1 else 0 end as first_screen
  from
    default.rank_show
  where
    logday = '""" + data_dt_int + """'
) a
group by
  hotel_seq
) b
) c
full outer join
(
select
  platform_type,
  hotel_seq,
  count(*) as detail_pv,
  count(distinct cookie_id) as detail_uv
from
(
select
  case
  when traffic_channel = '网站' then 'www' else 'wireless' end as platform_type,
  hotel_seq,
  cookie_id
from
  default.dw_detail_info_v2
where
  dt = '""" + data_dt_int + """'
) q
group by
  platform_type, hotel_seq
) d
on
  c.platform_type = d.platform_type
and
  c.hotel_seq = d.hotel_seq
full outer join
(
select
  platform_type,
  hotel_seq,
  sum(cash_book_pv) as cash_book_pv,
  sum(prepay_book_pv) as prepay_book_pv,
  sum(direct_book_pv) as direct_book_pv,
  sum(team_book_pv) as team_book_pv,
  sum(other_book_pv) as other_book_pv
from
(
select
  case
  when a.traffic_channel = '网站' then 'www' else 'wireless' end as platform_type,
  a.hotel_seq,
  case
  when b.business_type in ('QTA' ,'直销系') 
  then 1 else 0 end as direct_book_pv,
  case
  when b.business_type in ('QTA' ,'直销系') and pay_type = 0
  then 1 else 0 end as cash_book_pv,
  case
  when b.business_type in ('QTA' ,'直销系') and pay_type = 1
  then 1 else 0 end as prepay_book_pv,
  case
  when b.wrapper_id in ('waptuan0000','wituanhotel') then 1 else 0 end as team_book_pv,
  case
  when b.business_type is null then 1 else 0 end as other_book_pv
from
  default.dw_booking_info_v2 a
left outer join
  (select * from default.dim_hotel_agents where dt='20150322' and (business_type in ('QTA' ,'直销系') or (wrapper_id in ('waptuan0000','wituanhotel')))) b
on
  a.code_base = b.wrapper_id
where
  a.dt = '""" + data_dt_int + """'
) q
group by
  platform_type, hotel_seq
) e
on
  coalesce(c.platform_type, d.platform_type) = e.platform_type
and
  coalesce(c.hotel_seq, d.hotel_seq) = e.hotel_seq
;
"""

print SQL1

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():
   SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_dwr_hotel_web_traffic_di.py """ + data_dt
   os.system(SH_CMD1)

   SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwr:dwr_hotel_web_traffic_di --from hive:dwr:dwr_hotel_web_traffic_di --split '\\001'  --choose choose --cond "select regexp_replace(dt,'-',''),hotel_seq,platform_type,show_pv,first_screen_show_pv,detail_pv,detail_uv,cash_book_pv,prepay_book_pv,direct_book_pv,team_book_pv,other_book_pv from dwr.dwr_hotel_web_traffic_di where dt = '""" + data_dt  + """'\""""
   os.system(SH_CMD2)

def main():
    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
    load_data_to_mysql()
if __name__ == '__main__':
    main()
