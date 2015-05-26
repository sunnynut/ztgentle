#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

def update_data_in_mysql():

    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/update_dwr_team_all_stat_31days_di.py """+data_dt 
    os.system(SH_CMD1)

def main():
    #hive=Hive()
    #hive.set_date(data_dt)
    #for sql in sqls:
    #    hive.add_sql(sql)
    #hive.run()
    update_data_in_mysql()
if __name__ == '__main__':
    main()
