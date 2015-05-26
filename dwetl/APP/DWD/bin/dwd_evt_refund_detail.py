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
from stg.stg_qunar_group_refund_log_da
insert overwrite table dwd_evt_refund_detail
select
id,
order_id,
operator_id,
refund_quantity,
refund_method,
company_fee,
vendor_fee,
create_time,
customer_fee,
refund_way,
refund_money,
current_money,
p_order_id,
refund_uniq_id,
lost_card,
lost_red_envelope
where dt = '""" + data_dt + """';"""

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():

    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_dwd_evt_refund_detail.py"""
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwd:dwd_evt_refund_detail --from hive:dwd:dwd_evt_refund_detail  --split '\\001'  --choose choose --cond "select * from dwd.dwd_evt_refund_detail\""""
    os.system(SH_CMD2)

def main():

    #hive=Hive()
    #hive.set_date(data_dt)
    #for sql in sqls:
    #    hive.add_sql(sql)
    #hive.run()
    load_data_to_mysql()
if __name__ == '__main__':
    main()
