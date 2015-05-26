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
insert overwrite table dwr.dwr_activity_order_client_info_di partition (dt = '""" + data_dt + """')
select
  c.uid,
  c.logdate,
  from_unixtime(b.create_time),
  b.order_id,
  b.team_id,
  b.price,
  cast((b.money / b.quantity) as double),
  b.quantity,
  d.hotel_seq,
  d.hotel_title,
  e.city_code,
  e.province_code
from 
  (select oid as order_id from stg.stg_qunar_group_order_ext_da where dt = '""" + data_dt + """' and activity_type in ('256', '512')) a
join 
  (select id as order_id, create_time, team_id, price, money, uid, quantity from stg.stg_qunar_group_order_da where dt = '""" + data_dt + """') b
on
  a.order_id = b.order_id
join
  default.client_user c
on
  lower(b.uid) = lower(c.uid) and from_unixtime(b.create_time,'yyyy-MM-dd') = c.logdate
join
  des_bi.hotel_product_tuan d
on
  b.team_id = d.id
join
  (select * from dim.dim_city where dt = '""" + data_dt + """') e
on
  d.hotel_city = e.city_code
;"""

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
