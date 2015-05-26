#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
pre60day=Time.date_add(data_dt,-60)
def deal_db_sync_order_redpacket():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    sql1="""
    insert into db_sync.db_sync_log(db_sync_job_name,job_status,begin_time,end_time) values('db_sync_order_redpacket','Running','"""+now_time+"""','');
    """
    dbi.connect()
    dbi.execute(sql1)
    dbi.execute('commit;')
    dbi.close()
    dbi=DBI(driver='postgre',dbc='qunar_group_congku2')
    dbi.set_dbc(db='qunar_group')
    sql2="""
    delete from report.order_redpacket;
    """
    dbi.connect()
    dbi.execute_sql(sql2)
    dbi.close()
    imp_cmd="""
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to tuandb3:qunar_group:report.order_redpacket --from tuandb6:des_trade:public.order_redpacket  --split '\\001'  --choose choose --cond "select id,order_id,serial_no,redpacket_type,origin_money,money,create_time,uid,result,redpacket_id from public.order_redpacket"
    """
    os.system(imp_cmd)
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    sql3="""
    UPDATE db_sync.db_sync_log t1 JOIN (SELECT MAX(id) AS id FROM db_sync.db_sync_log where db_sync_job_name='db_sync_order_redpacket') t2 ON  t1.id=t2.id SET end_time='"""+now_time+"""',job_status='Done';
    """
    dbi.connect()
    dbi.execute(sql3)
    dbi.execute('commit;')
    dbi.close()
def main():
    deal_db_sync_order_redpacket()
if __name__ == '__main__':
    main()