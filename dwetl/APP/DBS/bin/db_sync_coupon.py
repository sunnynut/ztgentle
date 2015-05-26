#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.today()
pre60day=Time.date_add(data_dt,-60)
def deal_db_sync_coupon():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    sql1="""
    insert into db_sync.db_sync_log(db_sync_job_name,job_status,begin_time,end_time) values('db_sync_coupon','Running','"""+now_time+"""','');
    """
    sql2="""
    truncate table db_sync.coupon_update_record;
    """
    print sql1
    dbi.connect()
    dbi.execute(sql1)
    dbi.execute('commit;')
    dbi.execute(sql2)
    dbi.execute('commit;')
    dbi.close()
    imp_cmd="""
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:db_sync.coupon_update_record   --from tuandb3:qunar_group:public.coupon  --choose choose --split '\\001' --cond "select id,user_id,partner_id,team_id,order_id,type,credit,secret,consume,ip,sms,to_timestamp(expire_time)::TIMESTAMP(0) without time zone,to_timestamp(consume_time)::TIMESTAMP(0) without time zone,to_timestamp(create_time)::TIMESTAMP(0) without time zone,to_timestamp(sms_time)::TIMESTAMP(0) without time zone,buy_id,expire_notify_time,disabled,disable_time::TIMESTAMP(0) without time zone,freeze_from,shop_id,from_type from coupon a where exists(select 1 from coupon_update_record b where update_time<to_timestamp(substr(to_char(current_timestamp,'yyyy-mm-dd hh24:mi:ss'),1,11)||substr(to_char(current_timestamp,'yyyy-mm-dd hh24:mi:ss'),12,2)||':00:00','yyyy-mm-dd hh24:mi:ss')::timestamp(0) without time zone and a.id=b.id)"
    """
    os.system(imp_cmd)
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    sql1="""
    DELETE a FROM db_sync.coupon a JOIN coupon_update_record b ON a.id=b.id;
    """
    sql2="""
    insert into db_sync.coupon select * from db_sync.coupon_update_record;
    """

    dbi.connect()
    dbi.execute(sql1)
    dbi.execute('commit;')
    dbi.execute(sql2)
    dbi.execute('commit;')

    dbi.close()
    now_time=Time.now()
    sql4="""
    UPDATE db_sync.db_sync_log t1 JOIN (SELECT MAX(id) AS id FROM db_sync.db_sync_log where db_sync_job_name='db_sync_coupon') t2 ON  t1.id=t2.id SET end_time='"""+now_time+"""',job_status='Done';
    """
    dbi.connect()
    dbi.execute(sql4)
    dbi.execute('commit;')
    dbi.close()
    
    dbi=DBI(driver='postgre',dbc='qunar_group_congku2')
    dbi.set_dbc(db='qunar_group')
    dbi.connect()
    sql="""
    delete from public.coupon_update_record 
    where update_time<to_timestamp(substr(to_char(current_timestamp,'yyyy-mm-dd hh24:mi:ss'),1,11)||substr(to_char(current_timestamp,'yyyy-mm-dd hh24:mi:ss'),12,2)||':00:00','yyyy-mm-dd hh24:mi:ss')::timestamp(0) without time zone;
    """
    dbi.execute_sql(sql)
    dbi.close()
    
    	
def main():
    deal_db_sync_coupon()
if __name__ == '__main__':
    main()