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
from stg.stg_qunar_group_through_coupon_da
insert overwrite table dwd_evt_through_coupon
select
id,
through_coupon_id,
partner_id,
team_id,
order_id,
secret,
expire_time,
create_time,
is_freeze,
team_use_total,
sms,
sms_time,
user_id,
is_used,
is_del,
del_time,
pay_state,
freeze_from,
from_type
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
