#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os,math
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.today()
pre60day=Time.date_add(data_dt,-39)

def deal_db_sync_order_test():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    sql1="""
    insert into db_sync.db_sync_log(db_sync_job_name,job_status,begin_time,end_time) values('db_sync_order_test','Running','"""+now_time+"""','');
    """
    sql2="""
    truncate table db_sync.order_last60day;
    """
    print sql1
    #dbi.connect()
    #dbi.execute(sql1)
    #dbi.execute('commit;')
    #dbi.execute(sql2)
    #dbi.execute('commit;')
    #dbi.close()
    #imp_cmd="""
    #python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:db_sync.order_last60day   --from tuandb3:qunar_group:public.order  --choose  choose --split '\\001' --cond "select id,pay_id,buy_id,service,user_id,admin_id,team_id,card_id,state,quantity,mobile,price,money,origin,credit,card,condbuy,to_timestamp(create_time)::timestamp without time zone,to_timestamp(pay_time)::timestamp without time zone,partner_id,order_type,refund_money,refund_times,to_timestamp(last_refund_time)::timestamp without time zone,refund_quantity,red_envelope,p_order_id,lock,type_id,type,order_quick,to_timestamp(cancel_time)::timestamp without time zone,other_tuan_info,version,reach_shop_time,merchant_code,other_tuan_state,vid,pid,uid,gid,cid,org,order_version::timestamp(0),cost_price from public.order where create_time>=extract(epoch from timestamp without time zone '"""+pre60day+""" 00:00:00')"
    #"""
    #os.system(imp_cmd)
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    dbi.connect()
    for i in range(0,39):
        del_partition_day=Time.date_sub(data_dt,i)
        int_del_partition_day=del_partition_day.replace('-','')
        sql="""
        alter table db_sync.order_test truncate partition p_"""+int_del_partition_day+""";
        """
        print sql
        dbi.execute(sql)
        dbi.execute('commit;')
    sql="""
    insert into db_sync.order_test select id,pay_id,buy_id,service,user_id,admin_id,team_id,card_id,state,quantity,user_mobile,price,money,origin,credit,card,condbuy,create_time,pay_time,partner_id,order_type,refund_money,refund_times,last_refund_time,refund_quantity,red_envelope,p_order_id,lock_flag,type_id,type,order_quick,cancel_time,other_tuan_info,version,reach_shop_time,merchant_code,other_tuan_state,vid,pid,user_device_id,gid,cid,org,order_version,cost_price,concat(substr(create_time,1,4),substr(create_time,6,2),substr(create_time,9,2)) from db_sync.order_last60day;
    """    
    dbi.close()
    now_time=Time.now()
    sql3="""
    UPDATE db_sync.db_sync_log t1 JOIN (SELECT MAX(id) AS id FROM db_sync.db_sync_log where db_sync_job_name='db_sync_order_test') t2 ON  t1.id=t2.id SET end_time='"""+now_time+"""',job_status='Done';
    """
    dbi.connect()
    dbi.execute(sql3)
    dbi.execute('commit;')
    dbi.close()
def main():
    deal_db_sync_order_test()
if __name__ == '__main__':
    main()