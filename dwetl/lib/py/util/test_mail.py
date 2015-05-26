#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
from Mail import HTML,send_mail




data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
pre6day=Time.date_add(data_dt,-6)
subject='测试日报'+data_dt
receive_list="denchen.yang@qunar.com"
cc_list="denchen.yang@qunar.com"
dbc='db_data_discover'
sql1="""
SELECT 
    stat_date AS '统计日期',
    supplier AS '供应商',
    online_tuan_qty AS '在线团品数',
    new_tuan_qty AS '新增团品数'
FROM dwr_supplier_rpt_day
"""
header1="团品统计(按供应商):"
#sql2="""
#SELECT 
#    stat_date AS '统计日期',
#    supplier AS '供应商',
#    online_tuan_qty AS '在线团品数',
#    new_tuan_qty AS '新增团品数'
#FROM dwr_supplier_rpt_day
#"""
#header2="团品统计(按供应商):"
#title2=(('统计日期',1),('供应商',1),('在线团品数',1),('新增团品数',1))


sqls=dict((int(re.match(r'^sql(\d+)$',k).group(1)),v) for k,v in locals().items() if re.match(r'^sql\d+$',k))
headers=dict((int(re.match(r'^header(\d+)$',k).group(1)),v) for k,v in locals().items() if re.match(r'^header\d+$',k))
titles=dict((int(re.match(r'^title(\d+)$',k).group(1)),v) for k,v in locals().items() if re.match(r'^title\d+$',k))

def main():
    html=HTML()
    for idx in sorted(sqls.keys()):
        sql=sqls.get(idx)
        if not sql:
            continue
        header=headers.get(idx,'')
        title=titles.get(idx,())
        html.add_dataset(sql,dbc=dbc,header=header,title=title)
    html=html.make()
    send_mail(to=receive_list,cc=cc_list,subject=subject,html=html)
    
if __name__ == '__main__':
    main()
