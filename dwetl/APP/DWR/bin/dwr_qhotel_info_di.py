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
insert overwrite table dwr.dwr_qhotel_info_di partition (dt = '""" + data_dt + """')
select
a.hotel_seq,
c.wrapper_id,
a.country_name,
b.daqu,
a.province_name,
a.city_name,
d.hotel_star,
a.hotel_grade,
a.onlinechannel,
a.hotel_area,
a.hotel_trading_area,
case
when a.online_status = 1 then 0
else 1 end as online_status,
case
when a.operating_status = 0 then 0
else 1 end as operating_status,
a.baidu_point,
a.google_point,
a.hotel_type,
attrs['numberFloors'],
attrs['numberRooms'],
attrs['hasWifiAccess'],
attrs['hasHeater'],
attrs['hasAirConditioning'],
attrs['hasHeatWater'],
attrs['meal'],
attrs['hasParkingArea2'],
attrs['hasFitnessRoom'],
attrs['hasSpa'],
attrs['hasHotSpring'],
attrs['hasChessRoom'],
attrs['internetAccess'],
attrs['hasStationPickUp'],
attrs['hasAirportPickUp']
from 
(select distinct hotel_seq, wrapper_id from default.ods_qhotel_hotel_linkage where dt = '""" + data_dt_int + """' and status = 'on') c
join
(select * from default.dim_hotel_info where dt = '""" + data_dt_int + """') a
on
c.hotel_seq = a.hotel_seq
join
(select hotel_seq, hotel_star from dwr.dwr_hotel_info_di where dt = '""" + data_dt + """') d
on
c.hotel_seq = d.hotel_seq
join 
(select city_name, daqu from dim.dim_city where dt = '""" + data_dt + """') b 
on a.city_name = b.city_name;"""

print SQL1

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():
   SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_dwr_qhotel_info_di.py"""
   os.system(SH_CMD1)

   SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwr:dwr_qhotel_info_di --from hive:dwr:dwr_qhotel_info_di --split '\\001'  --choose choose --cond "select hotel_seq,code_base,country_name,daqu,province_name,city_name,hotel_star,hotel_grade,onlinechannel,hotel_area,hotel_trading_area,online_flag,operating_flag,baidu_point,google_point,hotel_types,numberfloors,numberrooms,wifi_flag,hasheater_flag,hasairconditioning_flag,hasheatwater_flag,free_meal_flag,hasparkingarea_flag,hasfitnessroom_flag,hasspa_flag,hashotspring_flag,haschessroom_flag,internetaccess_flag,hasstationpickup_flag,hasairportpickup_flag from dwr.dwr_qhotel_info_di where dt = '""" + data_dt  + """'\""""
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
