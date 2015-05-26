#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
pre60day=Time.date_add(data_dt,-60)
def deal_db_sync_order_ext():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    sql1="""
    insert into db_sync.db_sync_log(db_sync_job_name,job_status,begin_time,end_time) values('db_sync_order_ext','Running','"""+now_time+"""','');
    """
    sql2="""
    truncate table db_sync.order_ext;
    """
    dbi.connect()
    dbi.execute(sql1)
    dbi.execute('commit;')
    dbi.execute(sql2)
    dbi.execute('commit;')
    dbi.close()
    imp_cmd="""
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:db_sync.order_ext   --from tuandb3:qunar_group:public.order_ext  --choose choose --split '\\001' --cond "select id,oid,refund_type,team_price,ext,create_time::timestamp(0) without time zone,update_time::timestamp(0) without time zone,rebatable_money,rebate_money,token,activity_quantity,activity_type,is_can_reserve,rebate_type,order_source,activity_list from public.order_ext"
    """
    os.system(imp_cmd)
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    sql3="""
    UPDATE db_sync.db_sync_log t1 JOIN (SELECT MAX(id) AS id FROM db_sync.db_sync_log where db_sync_job_name='db_sync_order_ext') t2 ON  t1.id=t2.id SET end_time='"""+now_time+"""',job_status='Done';
    """
    dbi.connect()
    dbi.execute(sql3)
    dbi.execute('commit;')
    dbi.close()
def main():
    deal_db_sync_order_ext()
if __name__ == '__main__':
    main()