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
insert overwrite table dwr.dwr_wireless_user_first_order
select
  coalesce(a.uid, b.uid, c.uid, d.uid, e.uid, f.uid, g.uid),
  coalesce(g.first_movie_time, '4712-12-31 23:59:59') as first_movie_time,
  coalesce(b.first_hotel_time, '4712-12-31 23:59:59') as first_hotel_time,
  coalesce(c.first_flight_time, '4712-12-31 23:59:59') as first_flight_time,
  coalesce(d.first_ticket_time, '4712-12-31 23:59:59') as first_ticket_time,
  coalesce(e.first_train_time, '4712-12-31 23:59:59') as first_train_time,
  coalesce(f.first_travel_time, '4712-12-31 23:59:59') as first_travel_time,
  coalesce(a.first_team_hotel_time, '4712-12-31 23:59:59') as first_team_hotel_time
from
(
  select
    uid,min(from_unixtime(create_time)) as first_team_hotel_time
  from
    stg.stg_qunar_group_order_da where dt = '""" + data_dt + """'
  group by 
    uid
) a
full outer join
(
  select
    uid,min(create_time) as first_hotel_time
  from
    default.mppb_order
  group by 
    uid 
) b
on
  a.uid = b.uid
full outer join
(
  select
    deviceuid as uid,min(ordercreatetime) as first_flight_time
  from
    default.orderinfo
  group by 
    deviceuid
) c
on
  coalesce(a.uid, b.uid) = c.uid
full outer join
(
  select
    uid,min(create_time) as first_ticket_time
  from
    default.rdb_piao_order
  group by
    uid
) d
on
  coalesce(a.uid, b.uid, c.uid) = d.uid
full outer join
(
  select
    uid, min(create_time) as first_train_time
  from
    default.ods_train_order
  group by 
    uid
) e
on
  coalesce(a.uid, b.uid, c.uid, d.uid) = e.uid
full outer join
(
  select
    uid, min(create_time) as first_travel_time
  from
    default.ods_vacation_order
  group by
    uid
) f
on
  coalesce(a.uid, b.uid, c.uid, d.uid, e.uid) = f.uid
full outer join
(
  select
    uid, min(from_unixtime(create_time)) as first_movie_time
  from
    stg.stg_qunar_group_non_hotel_order where dt = '""" + data_dt + """'
  group by 
    uid
) g
on
  coalesce(a.uid, b.uid, c.uid, d.uid, e.uid, f.uid) = g.uid
;"""

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def main():
    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
if __name__ == '__main__':
    main()
