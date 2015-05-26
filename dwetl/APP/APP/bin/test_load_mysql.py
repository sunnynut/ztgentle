#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
path=os.getcwd()
file = "/home/q/changkai.lu/daily_report/plat_tuan/dwr_platform_rpt_day.txt"
table = 'dwr.dwr_platform_rpt_day'
#export_cmd="""$HIVE_HOME/bin/hive -S -e"select dt,platform,total_pv from dwr.dwr_platform_rpt_day WHERE dt='"""+data_dt+"""';">""" + file
#os.system(export_cmd)
dbi=DBI(driver='mysql',dbc='db_data_discover')
dbi.set_dbc(db='dwr')
dbi.delete(table,conditions=dict(stat_date=data_dt))
dbi.load(file,table)
dbi.close()