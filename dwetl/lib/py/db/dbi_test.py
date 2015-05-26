#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
from Hive import Hive

#data_dt='2014-09-08'
#table='dwr_supplier_rpt_day'
##driver='postgre'指向postgresql数据库，目前qunar_group_congku2指向l-tuandb3.des.cn8.qunar.com,qunar_group指向l-tuandbvip2.des.cn8.qunar.com
#dbi=DBI(driver='postgre',dbc='qunar_group_congku2')
##指定执行sql的数据库名称
#dbi.set_dbc(db='qunar_group')
#sql="""
#select * from address limit 100
#"""
#dbi.connect()
#dbi.execute_sql(sql)
#dbi.dump(sql,file='/home/denchen.yang/lib/py/db/test_dump.txt')
#dbi.close()

#mysql导出数据测试
dbi=DBI(driver='mysql',dbc='db_data_discover')
dbi.set_dbc(db='dwr')
sql="""
select col1,col2 from dwr.test1
"""
dbi.connect()
dbi.dump(sql,file='/home/q/test1.txt')
dbi.close()
