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
    subject='商家验券返现项目(对比:团品维度)-'+data_dt

    sql1="""
    SELECT 
        team_id AS '团品ID',
        total_room_night AS '昨日验券数',
        last_month_room_night AS '同期验券数', 
        CASE WHEN last_month_room_night=0 THEN '\\\\\' ELSE CONCAT(ROUND(100*total_room_night/last_month_room_night,2),'%') END AS '比值',
        tuan_total_room_night AS '团购频道昨日验券数',
        last_month_total_room_night AS '团购频道同期验券数',
        CASE WHEN last_month_total_room_night=0 THEN '\\\\\' ELSE CONCAT(ROUND(100*tuan_total_room_night/last_month_total_room_night,2),'%') END AS '比值'
    FROM dwr_qunar_group_scan_qr_code_team_di
    WHERE stat_date='"""+data_dt+"""' order by scan_qr_code_room_night desc;对比:团品维度
    """
    SQL=[]
    SQL.append(sql1)
    mail_sender(SQL,subject,receive_list)
