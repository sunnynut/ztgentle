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
insert overwrite table dwa.dwa_hotel_distribute_di partition (dt = '""" + data_dt + """')
select
a.daqu,
b.quyu,
a.city_name,
a.hotel_star,
a.online_flag,
a.operating_flag,
count(1) as hotel_cnt
from (select daqu,city_name,hotel_star,online_flag,operating_flag from dwr.dwr_hotel_info_di where dt = '""" + data_dt + """') a
join 
(select city_name, quyu from dim.dim_city where dt = '""" + data_dt + """') b
on a.city_name = b.city_name
group by 
a.daqu,
b.quyu,
a.city_name,
a.hotel_star,
a.online_flag,
a.operating_flag;"""

print SQL1

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():
   SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_dwa_hotel_distribute_di.py """ + data_dt
   os.system(SH_CMD1)

   SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwa:dwa_hotel_distribute_di --from hive:dwa:dwa_hotel_distribute_di --split '\\001'  --choose choose --cond "select dt,daqu,quyu,city_name,hotel_star,online_flag,operating_flag,hotel_cnt from dwa.dwa_hotel_distribute_di where dt = '""" + data_dt  + """'\""""
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
