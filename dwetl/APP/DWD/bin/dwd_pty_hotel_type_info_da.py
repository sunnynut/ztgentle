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
insert overwrite table dwd.dwd_pty_hotel_type_info_da partition (dt = '""" + data_dt + """')
select
a.hotel_seq,
a.country_name,
b.daqu,
a.province_name,
a.city_name,
case
when hotel_grade in ('3','4') and coalesce(onlinechannel,'abc') NOT rlike 'bnb' and coalesce(onlinechannel,'abc') NOT rlike 'gongyu' then '1' --高星级 
when hotel_grade in ('2') and coalesce(onlinechannel,'abc') NOT rlike 'bnb' and coalesce(onlinechannel,'abc') NOT rlike 'gongyu' then '2' --三星级 
when hotel_grade in ('5') and coalesce(onlinechannel,'abc') NOT rlike 'bnb' and coalesce(onlinechannel,'abc') NOT rlike 'gongyu' then '3' --二星级 
when hotel_grade in ('1') and coalesce(onlinechannel,'abc') NOT rlike 'bnb' and coalesce(onlinechannel,'abc') NOT rlike 'gongyu' then '4' --经济连锁 
when coalesce(onlinechannel,'abc') rlike 'bnb' then '5' --客栈 
else '6' --其它 
END as hotel_star,
a.hotel_grade,
case
when a.hotel_type = 'GUZHEN_HOTEL' and hotel_grade in ('5') and coalesce(onlinechannel,'abc') NOT IN('bnb','bnb|gongyu','gongyu') then 'UNKNOWN'
else a.hotel_type end as hotel_type,
a.hotel_trading_area
from 
(
  select
    hotel_seq,
    country_name,
    province_name,
    city_name,
    hotel_grade,
    onlinechannel,
    hotel_trading_area,
    split_hotel_type as hotel_type
  from 
    default.dim_hotel_info
  lateral view explode(split(hotel_type,'\\002')) adtable as split_hotel_type
  where dt = '""" + data_dt_int + """'
) a 
join 
(select city_name, daqu from dim.dim_city where dt = '""" + data_dt + """') b
on a.city_name = b.city_name;"""

print SQL1

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():
   SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_dwd_pty_hotel_type_info.py"""
   os.system(SH_CMD1)

   SH_CMD2 = """sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwd:dwd_pty_hotel_type_info --from hive:dwd:dwd_pty_hotel_type_info_da --split '\\001'  --choose choose --cond "select hotel_seq, country_name, daqu, province_name, city_name, hotel_star, hotel_grade, hotel_type, hotel_trading_area from dwd.dwd_pty_hotel_type_info_da where dt = '""" + data_dt  + """'\""""
   SH_CMD3 = """sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw04Mysql:dwd:dwd_pty_hotel_type_info --from hive:dwd:dwd_pty_hotel_type_info_da --split '\\001'  --choose choose --cond "select hotel_seq, country_name, daqu, province_name, city_name, hotel_star, hotel_grade, hotel_type, hotel_trading_area from dwd.dwd_pty_hotel_type_info_da where dt = '""" + data_dt  + """'\""""
   os.system(SH_CMD2)
   os.system(SH_CMD3)

def main():
    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
    load_data_to_mysql()
if __name__ == '__main__':
    main()
