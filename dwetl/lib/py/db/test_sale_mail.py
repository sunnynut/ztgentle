#!/usr/bin/env python
#-*- coding:utf-8 -*-
##=========================================================================
# **AUTHOR:           denchen.yang
# **CREATED TIME:     2014-12-18
# **FUN DESC    :     发送邮件测试
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

##本邮件模块支持多条数据库sql各自返回数据并生成相应的table,不过需要严格按照类似sql1、title1、col_title1、col_header1、col_row1这样的命名规则
##例如当需要返回两个以上的table时,就需要定义sql2、title2这样的命名变量等等

##=========================================================================
################################################################
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
################### SQL EDITE ##################################
##=========================================================================
##邮件标题
subject='发送邮件测试'+data_dt
##接收列表
receive_list="denchen.yang@qunar.com"
##==============================子报表1==============================##
##表格中包含数据的sql语句
sql1="""
SELECT
    t3.city_name AS '大区',
    t3.zhu_city AS '主城市',
    t3.quyu AS '区域',
    t3.daqu AS '大区',
    SUM(t.quantity) AS '间夜量'
FROM tuan_report.team_order t
LEFT JOIN tuan_report.old_team_dept t1 ON t.team_id = t1.team_id
LEFT JOIN tuan_report.team t2 ON t.team_id = t2.team_id
LEFT JOIN tuan_report.city_quyu_daqu t3 ON t1.TuanCity = t3.city_name
WHERE t.pay_time >=20141110
AND t.pay_time <=20141116
AND t2.new_type IN ('normal','purchase_option','hms')
AND t3.daqu IN ('北二','南二')
GROUP BY t3.city_name,t3.zhu_city,t3.quyu,t3.daqu
"""
##表格标题
table_header1='销售报表'
##指标组title,每个子括号里的内容是指标组的名称以及指标组所占的指标数,如('验券数',2)
title1=(('  ',1),('test1',1),('test2',3))
##指标组颜色,具体颜色列表请参考http://www.topve.com/color/coloreg.html
col_title1=('Gray','olivedrab','chartreuse')
##指标栏颜色
col_header1=('Gray') 
##指定数据行的颜色,每个子括号里的内容分别是数据行的行号和颜色
col_row1=((1,'PaleVioletRed'),(8,'PaleVioletRed'))
##指定每个子报表的相关指标描述
div1=('本报表用于测试邮件')

sqls=dict((int(re.match(r'^sql(\d+)$',k).group(1)),v) for k,v in locals().items() if re.match(r'^sql\d+$',k))
table_headers=dict((int(re.match(r'^table_header(\d+)$',k).group(1)),v) for k,v in locals().items() if re.match(r'^table_header\d+$',k))
titles=dict((int(re.match(r'^title(\d+)$',k).group(1)),v) for k,v in locals().items() if re.match(r'^title\d+$',k))
col_titles=dict((int(re.match(r'^col_title(\d+)$',k).group(1)),v) for k,v in locals().items() if re.match(r'^col_title\d+$',k))
col_headers=dict((int(re.match(r'^col_header(\d+)$',k).group(1)),v) for k,v in locals().items() if re.match(r'^col_header\d+$',k))
col_rows=dict((int(re.match(r'^col_row(\d+)$',k).group(1)),v) for k,v in locals().items() if re.match(r'^col_row\d+$',k))
divs=dict((int(re.match(r'^div(\d+)$',k).group(1)),v) for k,v in locals().items() if re.match(r'^div\d+$',k))


def main():
    html=HTML()
    for idx in sorted(sqls.keys()):
        sql=sqls.get(idx)
        if not sql:
            continue
        table_header=table_headers.get(idx,'')
        title=titles.get(idx,())
        col_title=col_titles.get(idx,())
        col_header=col_headers.get(idx,())
        col_row=col_rows.get(idx,())
        div=divs.get(idx,())
        #目前本例子是以postgresql为例的,所以需要指定driver='postgre'且dbc='qunar_group_congku2'
        #如果为mysql时且服务器是l-dw01.des.cn6时则dbc='db_data_discover'且driver='mysql'
        #如果为mysql时且服务器是l-dw03.des.cn8时则dbc='db_data_discover_new'且driver='mysql'
        #如果为mysql时且服务器是l-appcrwl1.wap.cn6.qunar.com时则dbc='tuan_report'且driver='mysql'
        html.add_dataset(sql,dbc='tuan_report',driver='mysql',header=table_header,title=title,col_title=col_title,col_header=col_header,col_row=col_row,div=div)
        #html.add_dataset(sql,dbc='tuan_report',driver='mysql',header=table_header,col_header=col_header,col_row=col_row,div=div)
    print sql
    html=html.make()
    #attach为可选参数,发送附件
    send_mail(to=receive_list,subject=subject,html=html,attach=('/home/q/dwetl/lib/py/db/Hive.py','/home/q/dwetl/lib/py/db/Hive.py'))
if __name__ == '__main__':
    main()
