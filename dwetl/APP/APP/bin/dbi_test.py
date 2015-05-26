#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/denchen.yang/lib/py/util')
from Time import Time
sys.path.append('/home/denchen.yang/lib/py/db')
from Hive import Hive
from DBI import DBI

data_dt='2014-09-08'
table='dwr_supplier_rpt_day'
dbi=DBI(driver='postgre',dbc='qunar_group')
dbi.set_dbc(db='qunar_group')
sql="""
select * from address limit 100
"""
dbi.connect()
dbi.execute_sql(sql)
dbi.dump(sql,file='/home/denchen.yang/lib/py/db/test_dump.txt')
dbi.close()