#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

data_month = data_dt[:7]

print data_month

def load_data_to_mysql():

    #SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_card_log_mysql.py """ + data_dt
    #os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:refund_log --from tuandb3:qunar_group:public.refund_log  --split '\\001'  --choose choose --cond "select id,order_id,operator_id,refund_quantity,refund_method,company_fee,vendor_fee,create_time::timestamp(0) without time zone,customer_fee,refund_way,refund_money,current_money,p_order_id,lost_card,lost_red_envelope,team_id from public.refund_log \""""
    print SH_CMD2
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


