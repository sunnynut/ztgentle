#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
table='dwr.test_partition'
file='/home/q/test_partition.txt'
#mysql导出数据测试
dbi=DBI(driver='mysql',dbc='db_data_discover_new')
dbi.set_dbc(db='dwr')
dbi.delete(table,conditions=dict(stat_date=20141001))
dbi.load(file,table)
dbi.close()