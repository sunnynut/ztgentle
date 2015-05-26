#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

data_month = data_dt[:7]

print data_month

def load_data_to_pg():

    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_part_hotel_info.py """ + data_dt
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:part_hotel_info --from tuandb3:qunar_group:public.hotel_info  --split '\\001'  --choose choose --cond \"select hotel_seq,city_code,name,brand,baidu_point,area from public.hotel_info\""""
    print SH_CMD2
    os.system(SH_CMD2)

def main():
    load_data_to_pg()
if __name__ == '__main__':
    main()


