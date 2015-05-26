#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
pre60day=Time.date_add(data_dt,-60)
def deal_db_sync_reserve():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    sql="""
    truncate table db_sync.reserve;
	commit;
    """
	
    dbi.connect()
    dbi.execute(sql)
    dbi.close()

    inveerted_table="""
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:db_sync.reserve   --from tuandb6:des_trade:public.reserve  --choose choose --split '\\001' --cond "select id,reserve_id,status,oid,team_id,partner_code,shop_id,in_time,out_time,room,quantity,order_quantity,real_name,mobile,to_shop_time,create_time,update_time,list_type,uid,partner_code,product,effective_quantity,request_source,relation_voucher from public.reserve"
    """
    os.system(inveerted_table)
    
def main():
    deal_db_sync_reserve()
if __name__ == '__main__':
    main()
