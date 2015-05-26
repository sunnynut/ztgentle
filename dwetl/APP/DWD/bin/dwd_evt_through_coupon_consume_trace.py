#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()


SQL1="""
use dwd;
from stg.stg_qunar_group_through_coupon_consume_trace_da
insert overwrite table dwd_evt_through_coupon_consume_trace
select
id, 
through_coupon_id,
operate_type,
operate_time,
user_id,
partner_id,
shop_id,
team_id,
order_id
where dt = '""" + data_dt + """';"""

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def main():

    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
if __name__ == '__main__':
    main()
