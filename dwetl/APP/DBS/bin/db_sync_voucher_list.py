#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.today()
pre30day=Time.date_add(data_dt,-29)
def deal_db_sync_voucher_list():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    sql1="""
    insert into db_sync.db_sync_log(db_sync_job_name,job_status,begin_time,end_time) values('db_sync_voucher_list','Running','"""+now_time+"""','');
    """
    sql2="""
    truncate table db_sync.voucher_list_last30day;
    """
    print sql1
    dbi.connect()
    dbi.execute(sql1)
    dbi.execute('commit;')
    dbi.execute(sql2)
    dbi.execute('commit;')
    dbi.close()
    imp_cmd="""
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:db_sync.voucher_list_last30day   --from tuandb3:qunar_group:public.through_coupon_consume_trace  --choose choose --split '\\001' --cond "select id,voucher_id,order_id,status,voucher_type,partner_id,shop_id,user_id,refund_result,expire_time::TIMESTAMP(0) without time zone,update_time::TIMESTAMP(0) without time zone,create_time::TIMESTAMP(0) without time zone,goods_id,goods_name,consume_time::TIMESTAMP(0) without time zone,consume_source,is_half,goods_price,team_version,room_time_key,checkin_date,activity_type from public.voucher_list where create_time::TIMESTAMP(0) without time zone>='"""+pre30day+""" 00:00:00'"
    """
    os.system(imp_cmd)
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    sql1="""
    DELETE a FROM db_sync.voucher_list a JOIN voucher_list_last30day b ON a.id=b.id;
    """
    sql2="""
    insert into db_sync.voucher_list select * from voucher_list_last30day;
    """
    dbi.connect()
    dbi.execute(sql1)
    dbi.execute('commit;')
    dbi.execute(sql2)
    dbi.execute('commit;')
    dbi.close()
    now_time=Time.now()
    sql3="""
    UPDATE db_sync.db_sync_log t1 JOIN (SELECT MAX(id) AS id FROM db_sync.db_sync_log where db_sync_job_name='db_sync_voucher_list') t2 ON  t1.id=t2.id SET end_time='"""+now_time+"""',job_status='Done';
    """
    dbi.connect()
    dbi.execute(sql3)
    dbi.execute('commit;')
    dbi.close()
def main():
    deal_db_sync_voucher_list()
if __name__ == '__main__':
    main()