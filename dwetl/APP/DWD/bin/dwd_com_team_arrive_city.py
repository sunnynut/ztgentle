#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

SQL1="""
use dwd;
from (select * from stg.stg_qunar_group_team_arrive_city_da where dt = '""" + data_dt + """') a 
left outer join (select * from stg.stg_qunar_group_full_level_path_da where dt = '""" + data_dt + """') b on a.path_id = b.id
insert overwrite table dwd_com_team_arrive_city
select 
a.id,
a.team_id,
a.arrive,
a.order_flag,
a.path_id,
b.path;"""

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def main():

    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
if __name__ == '__main__':
    main()


