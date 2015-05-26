#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

def load_data_to_mysql():

    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_return_balance.py """ + data_dt
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:return_balance --from tuandb3:qunar_group:public.return_balance  --split '\\001'  --choose choose --cond "select id, return_no, state, oid, money, request_time, finish_time, ext, create_time, update_time, frozen, withdraw, frozen_deadline from public.return_balance \""""
    print SH_CMD2
    os.system(SH_CMD2)

def main():
    #hive=Hive()
    #hive.set_date(data_dt)
    #for sql in sqls:
    #    hive.add_sql(sql)
    #hive.run()
    load_data_to_mysql()
if __name__ == '__main__':
    main()


