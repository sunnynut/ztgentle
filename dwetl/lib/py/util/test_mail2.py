#!/usr/bin/env python
#-*- coding:utf-8 -*-
##=========================================================================
# **AUTHOR:           denchen.yang
# **CREATED TIME:     2014-09-16
# **FUN DESC    :     test
# **MODIFIED BY :     
# **MODIFTED TIME:    
# **MODIFTED CONTENT:
# **REVIEWED BY:
# **REVIEWED TIME:
##===================META BEGIN=============================================
# **INPUT TABLE:  
# **MID TABLE :
# **DIM TABLE :
# **OUTPU TTABLE: app.
##===================META BEGIN=============================================
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
from Mail import HTML,send_mail
##=========================================================================
################################################################
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
################### SQL EDITE ##################################
##=========================================================================

#邮件发送

def mail_sender(sqls,subject,receive_list):
    dbc='db_data_discover'
    html=HTML()
    for sql_temp in sqls:
        sql_content=sql_temp.split(";")
        html.add_mysql_sql(sql_content[0],dbc,header=sql_content[1])
    html=html.make()
    send_mail(to=receive_list,subject=subject,html=html)


if __name__ == '__main__':
    receive_list='denchen.yang@qunar.com'
    subject='日报测试-'+data_dt

    sql="""
    SELECT 
        stat_date AS '统计日期',
        supplier AS '供应商',
        online_tuan_qty AS '在线团品数',
        new_tuan_qty AS '新增团品数'
    FROM dwr_supplier_rpt_day;测试效果
"""
    SQL=[]
    SQL.append(sql)
    mail_sender(SQL,subject,receive_list)
