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
insert overwrite table dwa.dwa_hotel_star_web_traffic_sum_day_di partition (dt = '""" + data_dt + """')
select
  coalesce(d.hotel_star, e.hotel_star, f.hotel_star, g.hotel_star) as hotel_star,
  coalesce(d.platform_type, e.platform_type, f.platform_type, g.platform_type) as platform_type,
  coalesce(d.show_pv, 0) as show_pv,
  coalesce(d.show_uv, 0) as show_uv,
  coalesce(d.show_hotel_cnt, 0) as show_hotel_cnt,
  coalesce(e.first_screen_show_pv, 0) as first_screen_show_pv,
  coalesce(e.first_screen_show_uv, 0) as first_screen_show_uv,
  coalesce(e.first_screen_show_hotel_cnt, 0) as first_screen_show_hotel_cnt,
  coalesce(f.detail_pv, 0) as detail_pv,
  coalesce(f.detail_uv, 0) as detail_uv,
  coalesce(f.detail_hotel_cnt, 0) as detail_hotel_cnt,
  coalesce(g.book_pv, 0) as book_pv,
  coalesce(g.book_uv, 0) as book_uv,
  coalesce(g.book_hotel_cnt, 0) as book_hotel_cnt
from
(
select
  b.hotel_star,
  a.platform_type,
  count(*) as show_pv,
  count(distinct cookie_id) as show_uv,
  count(distinct a.hotel_seq) as show_hotel_cnt
from
(
  select
    'www' as platform_type,
    hotel_seq,
    cookie_id
  from
    default.ods_listpage_snapshot_log
  where
    dt = '""" + data_dt_int + """'
  union all
  select
    'wireless' as platform_type,
    trim(hotelseq) as hotel_seq,
    uid as cookie_id
  from
    default.rank_show
  where
    logday = '""" + data_dt_int + """'
) a 
join
  (select hotel_seq,hotel_star from dwr.dwr_hotel_info_di where dt = '""" + data_dt + """' and coalesce(country_name,'中国') = '中国' and coalesce(province_name,'abc') != '台湾') b
on
  a.hotel_seq = b.hotel_seq
group by 
  b.hotel_star, a.platform_type
) d 
full outer join
(
select
  b.hotel_star,
  a.platform_type,
  count(*) as first_screen_show_pv,
  count(distinct cookie_id) as first_screen_show_uv,
  count(distinct a.hotel_seq) as first_screen_show_hotel_cnt
from
(
  select
    'wireless' as platform_type,
    trim(hotelseq) as hotel_seq,
    uid as cookie_id
  from
    default.rank_show
  where
    logday = '""" + data_dt_int + """'
  and
    start = 0
) a 
join
  (select hotel_seq,hotel_star from dwr.dwr_hotel_info_di where dt = '""" + data_dt + """' and coalesce(country_name,'中国') = '中国' and coalesce(province_name,'abc') != '台湾') b
on
  a.hotel_seq = b.hotel_seq
group by 
  b.hotel_star, a.platform_type
) e
on
  d.hotel_star = e.hotel_star 
and 
  d.platform_type = e.platform_type
full outer join
(
select
  b.hotel_star,
  a.platform_type,
  count(*) as detail_pv,
  count(distinct cookie_id) as detail_uv,
  count(distinct a.hotel_seq) as detail_hotel_cnt
from
(
  select
    case
    when traffic_channel = '网站' then 'www' else 'wireless' end as platform_type,
    trim(hotel_seq) as hotel_seq,
    cookie_id
  from
    default.dw_detail_info_v2
  where
    dt = '""" + data_dt_int + """'
) a
join
  (select hotel_seq,hotel_star from dwr.dwr_hotel_info_di where dt = '""" + data_dt + """' and coalesce(country_name,'中国') = '中国' and coalesce(province_name,'abc') != '台湾') b
on
  a.hotel_seq = b.hotel_seq
group by
  b.hotel_star, a.platform_type
) f 
on
  coalesce(d.hotel_star, e.hotel_star) = f.hotel_star
and
  coalesce(d.platform_type, e.platform_type) = f.platform_type
full outer join
(
select
  b.hotel_star,
  a.platform_type,
  count(*) as book_pv,
  count(distinct cookie_id) as book_uv,
  count(distinct a.hotel_seq) as book_hotel_cnt
from
(
  select
    case
    when traffic_channel = '网站' then 'www' else 'wireless' end as platform_type,
    trim(hotel_seq) as hotel_seq,
    cookie_id
  from
    default.dw_booking_info_v2
  where
    dt = '""" + data_dt_int + """'
) a
join
  (select city_name,hotel_seq,hotel_star from dwr.dwr_hotel_info_di where dt = '""" + data_dt + """' and coalesce(country_name,'中国') = '中国' and coalesce(province_name,'abc') != '台湾') b
on
  a.hotel_seq = b.hotel_seq 
group by
  b.hotel_star, a.platform_type
) g 
on
  coalesce(d.hotel_star, e.hotel_star, f.hotel_star) = g.hotel_star
and 
  coalesce(d.platform_type, e.platform_type, f.platform_type) = g.platform_type
;
"""

print SQL1

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():
   SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_dwa_hotel_star_web_traffic_sum_day_di.py """ + data_dt
   os.system(SH_CMD1)

   SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwa:dwa_hotel_star_web_traffic_sum_day_di --from hive:dwa:dwa_hotel_star_web_traffic_sum_day_di --split '\\001'  --choose choose --cond "select dt,hotel_star,platform_type,show_pv,show_uv,show_hotel_cnt,first_screen_show_pv,first_screen_show_uv,first_screen_show_hotel_cnt,detail_pv,detail_uv,detail_hotel_cnt,book_pv,book_uv,book_hotel_cnt from dwa.dwa_hotel_star_web_traffic_sum_day_di where dt = '""" + data_dt  + """'\""""
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
