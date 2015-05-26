#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

yes_dt=Time.date_sub(data_dt, 1)

print yes_dt

data_dt_int = data_dt.replace("-","")

print data_dt
print data_dt_int

SQL1="""
insert overwrite table dwr.dwr_hotel_meituan_roomtype_compare_di partition (dt = '""" + data_dt + """')
select
  daqu,
  quyu,
  city_name,
  hotel_star,
  hotel_seq,
  sum(cash_qunar_exclusive_room_types) as cash_qunar_exclusive_room_types,
  sum(cash_qunar_exclusive_room_types * qunar_price) as cash_qunar_exclusive_room_price,
  sum(cash_meituan_exclusive_room_types) as cash_meituan_exclusive_room_types,
  sum(cash_meituan_exclusive_room_types * meituan_price) as cash_meituan_exclusive_room_price,
  sum(cash_comm_room_types) as cash_comm_room_types,
  sum(cash_comm_room_types * qunar_price) as cash_common_room_qunar_price,
  sum(cash_comm_room_types * meituan_price) as cash_common_room_meituan_price,

  sum(prepay_qunar_exclusive_room_types) as prepay_qunar_exclusive_room_types,
  sum(prepay_qunar_exclusive_room_types * qunar_price) as prepay_qunar_exclusive_room_price,
  sum(prepay_meituan_exclusive_room_types) as prepay_meituan_exclusive_room_types,
  sum(prepay_meituan_exclusive_room_types * meituan_price) as prepay_meituan_exclusive_room_price,
  sum(prepay_comm_room_types) as prepay_comm_room_types,
  sum(prepay_comm_room_types * qunar_price) as prepay_common_room_qunar_price,
  sum(prepay_comm_room_types * meituan_price) as prepay_common_room_meituan_price,

  sum(team_qunar_exclusive_room_types) as team_qunar_exclusive_room_types,
  sum(team_qunar_exclusive_room_types * qunar_price) as team_qunar_exclusive_room_price,
  sum(team_meituan_exclusive_room_types) as team_meituan_exclusive_room_types,
  sum(team_meituan_exclusive_room_types * meituan_price) as team_meituan_exclusive_room_price,
  sum(team_comm_room_types) as team_comm_room_types,
  sum(team_comm_room_types * qunar_price) as team_common_room_qunar_price,
  sum(team_comm_room_types * meituan_price) as team_common_room_meituan_price,

  sum(cash_duel_room_types) as cash_duel_room_types,
  sum(cash_beat_room_types) as cash_beat_room_types,
  sum(cash_lose_room_types) as cash_lose_room_types,
  sum(prepay_duel_room_types) as prepay_duel_room_types,
  sum(prepay_beat_room_types) as prepay_beat_room_types,
  sum(prepay_lose_room_types) as prepay_lose_room_types,
  sum(team_duel_room_types) as team_duel_room_types,
  sum(team_beat_room_types) as team_beat_room_types,
  sum(team_lose_room_types) as team_lose_room_types
from
(
select
 c.daqu as daqu,
 c.quyu as quyu,
 coalesce(a.city_name, b.city_name) as city_name,
 d.hotel_star as hotel_star,
 coalesce(a.hotel_seq, b.hotel_seq) as hotel_seq,
 coalesce(a.quoted_price, 0.0) as qunar_price,
 coalesce(b.quoted_price, 0.0) as meituan_price,
 case when a.room_type is not null and b.room_type is null and a.code_base <> 'wituanhotel' and a.payment = 0 then 1 else 0 end as cash_qunar_exclusive_room_types,
 case when (a.room_type is null or (a.room_type is not null and !(a.code_base <> 'wituanhotel' and a.payment = 0))) and b.room_type is not null then 1 else 0 end as cash_meituan_exclusive_room_types,
 case when a.room_type is not null and b.room_type is not null and a.code_base <> 'wituanhotel' and a.payment = 0 then 1 else 0 end as cash_comm_room_types,

 case when a.room_type is not null and b.room_type is null and a.code_base <> 'wituanhotel' and a.payment = 1 then 1 else 0 end as prepay_qunar_exclusive_room_types,
 case when (a.room_type is null or (a.room_type is not null and !(a.code_base <> 'wituanhotel' and a.payment = 1))) and b.room_type is not null then 1 else 0 end as prepay_meituan_exclusive_room_types,
 case when a.room_type is not null and b.room_type is not null and a.code_base <> 'wituanhotel' and a.payment = 1 then 1 else 0 end as prepay_comm_room_types,

 case when a.room_type is not null and b.room_type is null and a.code_base = 'wituanhotel' then 1 else 0 end as team_qunar_exclusive_room_types,
 case when (a.room_type is null or (a.room_type is not null and a.code_base <> 'wituanhotel')) and b.room_type is not null then 1 else 0 end as team_meituan_exclusive_room_types,
 case when a.room_type is not null and b.room_type is not null and a.code_base = 'wituanhotel' then 1 else 0 end as team_comm_room_types,

 case when a.room_type is not null and b.room_type is not null and a.code_base <> 'wituanhotel' and a.payment = 0 and a.quoted_price = b.quoted_price then 1 else 0 end as cash_duel_room_types,
 case when a.room_type is not null and b.room_type is not null and a.code_base <> 'wituanhotel' and a.payment = 0 and a.quoted_price < b.quoted_price then 1 else 0 end as cash_beat_room_types,
 case when a.room_type is not null and b.room_type is not null and a.code_base <> 'wituanhotel' and a.payment = 0 and a.quoted_price > b.quoted_price then 1 else 0 end as cash_lose_room_types,
 case when a.room_type is not null and b.room_type is not null and a.code_base <> 'wituanhotel' and a.payment = 1 and a.quoted_price = b.quoted_price then 1 else 0 end as prepay_duel_room_types,
 case when a.room_type is not null and b.room_type is not null and a.code_base <> 'wituanhotel' and a.payment = 1 and a.quoted_price < b.quoted_price then 1 else 0 end as prepay_beat_room_types,
 case when a.room_type is not null and b.room_type is not null and a.code_base <> 'wituanhotel' and a.payment = 1 and a.quoted_price > b.quoted_price then 1 else 0 end as prepay_lose_room_types,
 case when a.room_type is not null and b.room_type is not null and a.code_base = 'wituanhotel' and a.quoted_price = b.quoted_price then 1 else 0 end as team_duel_room_types,
 case when a.room_type is not null and b.room_type is not null and a.code_base = 'wituanhotel' and a.quoted_price < b.quoted_price then 1 else 0 end as team_beat_room_types,
 case when a.room_type is not null and b.room_type is not null and a.code_base = 'wituanhotel' and a.quoted_price > b.quoted_price then 1 else 0 end as team_lose_room_types
from
(
  select 
    city_name,
    hotel_seq,
    room_type,
    code_base,
    payment,
    min(case when code_base <> 'wituanhotel' and payment = 0 then cast(quoted_price * 0.9 as decimal) else cast(quoted_price as decimal) end) as quoted_price
  from 
    default.dw_hotel_price_log 
  where 
    dt = '""" + data_dt_int + """' 
  and 
    code_base in ('wiqunarqta2', 'wiqunarqta3', 'wiqunarqta5', 'wiqtafshmin', 'qtav2000001', 'qtav2000002', 'qtav2000004', 'qtav2000005', 'wituanhotel')
  and
    quoted_price <= 300
  group by 
    city_name, hotel_seq, code_base, room_type, payment 
) a
full outer join
(
  select 
    city_name,
    hotel_seq, 
    room_type,
    cast(quoted_price as decimal) as quoted_price
  from 
    default.dw_hotel_price_log 
  where 
    dt = '""" + data_dt_int + """'
  and
    quoted_price <= 300
  and
    code_base = '120meituan0'
) b
on 
  a.city_name = b.city_name
and
  a.hotel_seq = b.hotel_seq
and
  a.room_type = b.room_type
join
(
  select daqu,quyu,city_name from dim.dim_city where dt = '""" + yes_dt + """'
) c
on
  coalesce(a.city_name, b.city_name) = c.city_name
join
(
 select
   hotel_seq, hotel_star
 from
   dwr.dwr_hotel_info_di
 where
   dt = '""" + data_dt + """'
) d
on
  coalesce(a.hotel_seq, b.hotel_seq) = d.hotel_seq
) q
group by
  daqu, quyu, city_name, hotel_star, hotel_seq;"""

print SQL1

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def main():
    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
if __name__ == '__main__':
    main()
