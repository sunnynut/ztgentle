#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
import datetime
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()


data_dt_int = data_dt.replace("-","")

print data_dt
print data_dt_int



print SQL1

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():
   SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_dwr_meituan_sales_volomn_di.py"""
   os.system(SH_CMD1)

   SH_CMD2 = """sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwr:dwr_meituan_sales_volomn_di --from hive:dwr:dwr_meituan_sales_volomn_di --split '\\001'  --choose choose --cond "select hotel_seq,country_name,daqu,province_name,city_name,hotel_star,hotel_grade,onlinechannel,hotel_area,hotel_trading_area,online_flag,operating_flag,baidu_point,google_point,hotel_types,numberfloors,numberrooms,wifi_flag,hasheater_flag,hasairconditioning_flag,hasheatwater_flag,free_meal_flag,hasparkingarea_flag,hasfitnessroom_flag,hasspa_flag,hashotspring_flag,haschessroom_flag,internetaccess_flag,hasstationpickup_flag,hasairportpickup_flag from dwr.dwr_meituan_sales_volomn_di where dt = '""" + data_dt  + """'\""""
   SH_CMD3 = """sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw04Mysql:dwr:dwr_meituan_sales_volomn_di --from hive:dwr:dwr_meituan_sales_volomn_di --split '\\001'  --choose choose --cond "select hotel_seq,country_name,daqu,province_name,city_name,hotel_star,hotel_grade,onlinechannel,hotel_area,hotel_trading_area,online_flag,operating_flag,baidu_point,google_point,hotel_types,numberfloors,numberrooms,wifi_flag,hasheater_flag,hasairconditioning_flag,hasheatwater_flag,free_meal_flag,hasparkingarea_flag,hasfitnessroom_flag,hasspa_flag,hashotspring_flag,haschessroom_flag,internetaccess_flag,hasstationpickup_flag,hasairportpickup_flag from dwr.dwr_meituan_sales_volomn_di where dt = '""" + data_dt  + """'\""""
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
