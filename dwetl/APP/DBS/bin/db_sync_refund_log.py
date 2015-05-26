#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.today()
pre60day=Time.date_add(data_dt,-60)
def deal_db_sync_refund_log():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    sql1="""
    insert into db_sync.db_sync_log(db_sync_job_name,job_status,begin_time,end_time) values('db_sync_refund_log','Running','"""+now_time+"""','');
    """
    sql2="""
    truncate table db_sync.refund_log_update_record;
    """
    print sql1
    dbi.connect()
    dbi.execute(sql1)
    dbi.execute('commit;')
    dbi.execute(sql2)
    dbi.execute('commit;')
    dbi.close()
    imp_cmd="""
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:db_sync.refund_log_update_record   --from tuandb3:qunar_group:public.refund_log  --choose choose --split '\\001' --cond "select id,order_id,operator_id,refund_quantity,refund_method,company_fee,vendor_fee,create_time::timestamp(0) without time zone,customer_fee,refund_way,refund_money,current_money,p_order_id,lost_card,lost_red_envelope,team_id from public.refund_log a where exists(select 1 from refund_log_update_record b where update_time<to_timestamp(substr(to_char(current_timestamp,'yyyy-mm-dd hh24:mi:ss'),1,11)||substr(to_char(current_timestamp,'yyyy-mm-dd hh24:mi:ss'),12,2)||':01:00','yyyy-mm-dd hh24:mi:ss')::timestamp(0) without time zone and a.id=b.id)"
    """
    os.system(imp_cmd)
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    sql1="""
    DELETE a FROM db_sync.refund_log a JOIN refund_log_update_record b ON a.id=b.id;
    """
    sql2="""
    insert into db_sync.refund_log select * from db_sync.refund_log_update_record;
    """

    dbi.connect()
    dbi.execute(sql1)
    dbi.execute('commit;')
    dbi.execute(sql2)
    dbi.execute('commit;')

    dbi.close()
    now_time=Time.now()
    sql4="""
    UPDATE db_sync.db_sync_log t1 JOIN (SELECT MAX(id) AS id FROM db_sync.db_sync_log where db_sync_job_name='db_sync_refund_log') t2 ON  t1.id=t2.id SET end_time='"""+now_time+"""',job_status='Done';
    """
    dbi.connect()
    dbi.execute(sql4)
    dbi.execute('commit;')
    dbi.close()
    
    dbi=DBI(driver='postgre',dbc='qunar_group_congku2')
    dbi.set_dbc(db='qunar_group')
    dbi.connect()
    sql="""
    delete from public.refund_log_update_record 
    where update_time<to_timestamp(substr(to_char(current_timestamp,'yyyy-mm-dd hh24:mi:ss'),1,11)||substr(to_char(current_timestamp,'yyyy-mm-dd hh24:mi:ss'),12,2)||':01:00','yyyy-mm-dd hh24:mi:ss')::timestamp(0) without time zone;
    """
    dbi.execute_sql(sql)
    dbi.close()
    
    	
def main():
    deal_db_sync_refund_log()
if __name__ == '__main__':
    main()
