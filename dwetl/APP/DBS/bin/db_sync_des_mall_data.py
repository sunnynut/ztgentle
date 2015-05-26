#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI

def deal_m_order():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    log_start_sql="""
    insert into db_sync.db_sync_log(db_sync_job_name,job_status,begin_time,end_time) values('db_sync_m_order','Running','"""+now_time+"""','');
    """
    sql="""
    delete from db_sync.m_order;
    """
    dbi.connect()
    dbi.execute(log_start_sql)
    dbi.execute('commit;')
    dbi.execute(sql)
    dbi.execute('commit;')
    dbi.close()
    
    imp_cmd="""
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:db_sync.m_order --from des_mall:des_mall:m_order  --choice choice --split '\\001' --cond "select id,type,product_id,item_id,name,amount,status,user_id,username,version,create_time,update_time,target_mobile from des_mall.m_order"
    """
    os.system(imp_cmd)    
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    log_end_sql="""
    UPDATE db_sync.db_sync_log t1 JOIN (SELECT MAX(id) AS id FROM db_sync.db_sync_log where db_sync_job_name='db_sync_m_order') t2 ON  t1.id=t2.id SET end_time='"""+now_time+"""',job_status='Done';
    """
    dbi.connect()
    dbi.execute(log_end_sql)
    dbi.execute('commit;')
    dbi.close()

def deal_m_recharging():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    log_start_sql="""
    insert into db_sync.db_sync_log(db_sync_job_name,job_status,begin_time,end_time) values('db_sync_m_recharging','Running','"""+now_time+"""','');
    """
    sql="""
    delete from db_sync.m_recharging;
    """
    dbi.connect()
    dbi.execute(log_start_sql)
    dbi.execute('commit;')
    dbi.execute(sql)
    dbi.execute('commit;')
    dbi.close()
    
    imp_cmd="""
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:db_sync.m_recharging --from des_mall:des_mall:m_recharging  --choice choice --split '\\001' --cond "select id,order_id,user_id,username,mobile,amount,status,message,create_time,update_time from des_mall.m_recharging"
    """
    os.system(imp_cmd)    
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    log_end_sql="""
    UPDATE db_sync.db_sync_log t1 JOIN (SELECT MAX(id) AS id FROM db_sync.db_sync_log where db_sync_job_name='db_sync_m_recharging') t2 ON  t1.id=t2.id SET end_time='"""+now_time+"""',job_status='Done';
    """
    dbi.connect()
    dbi.execute(log_end_sql)
    dbi.execute('commit;')
    dbi.close()
    
def deal_m_score_account():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    log_start_sql="""
    insert into db_sync.db_sync_log(db_sync_job_name,job_status,begin_time,end_time) values('db_sync_m_score_account','Running','"""+now_time+"""','');
    """
    sql="""
    delete from db_sync.m_score_account;
    """
    dbi.connect()
    dbi.execute(log_start_sql)
    dbi.execute('commit;')
    dbi.execute(sql)
    dbi.execute('commit;')
    dbi.close()
    
    imp_cmd="""
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:db_sync.m_score_account --from des_mall:des_mall:m_score_account  --choice choice --split '\\001' --cond "select user_id,username,amount from des_mall.m_score_account"
    """
    os.system(imp_cmd)    
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    log_end_sql="""
    UPDATE db_sync.db_sync_log t1 JOIN (SELECT MAX(id) AS id FROM db_sync.db_sync_log where db_sync_job_name='db_sync_m_score_account') t2 ON  t1.id=t2.id SET end_time='"""+now_time+"""',job_status='Done';
    """
    dbi.connect()
    dbi.execute(log_end_sql)
    dbi.execute('commit;')
    dbi.close()
    
def deal_m_score_balance():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    log_start_sql="""
    insert into db_sync.db_sync_log(db_sync_job_name,job_status,begin_time,end_time) values('db_sync_m_score_balance','Running','"""+now_time+"""','');
    """
    sql="""
    delete from db_sync.m_score_balance;
    """
    dbi.connect()
    dbi.execute(log_start_sql)
    dbi.execute('commit;')
    dbi.execute(sql)
    dbi.execute('commit;')
    dbi.close()
    
    imp_cmd="""
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:db_sync.m_score_balance --from des_mall:des_mall:m_score_balance  --choice choice --split '\\001' --cond "select id,user_id,username,amount,order_id,order_type,order_version,message,caption,direct,create_time from des_mall.m_score_balance"
    """
    os.system(imp_cmd)    
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    log_end_sql="""
    UPDATE db_sync.db_sync_log t1 JOIN (SELECT MAX(id) AS id FROM db_sync.db_sync_log where db_sync_job_name='db_sync_m_score_balance') t2 ON  t1.id=t2.id SET end_time='"""+now_time+"""',job_status='Done';
    """
    dbi.connect()
    dbi.execute(log_end_sql)
    dbi.execute('commit;')
    dbi.close()
    
def deal_m_item():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    log_start_sql="""
    insert into db_sync.db_sync_log(db_sync_job_name,job_status,begin_time,end_time) values('db_sync_m_item','Running','"""+now_time+"""','');
    """
    sql="""
    delete from db_sync.m_item;
    """
    dbi.connect()
    dbi.execute(log_start_sql)
    dbi.execute('commit;')
    dbi.execute(sql)
    dbi.execute('commit;')
    dbi.close()
    
    imp_cmd="""
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:db_sync.m_item --from des_mall:des_mall:m_item  --choice choice --split '\\001' --cond "select id,name,qunar_coin,value,cost,validity,store,product_id,day_store from m_item"
    """
    os.system(imp_cmd)    
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    log_end_sql="""
    UPDATE db_sync.db_sync_log t1 JOIN (SELECT MAX(id) AS id FROM db_sync.db_sync_log where db_sync_job_name='db_sync_m_item') t2 ON  t1.id=t2.id SET end_time='"""+now_time+"""',job_status='Done';
    """
    dbi.connect()
    dbi.execute(log_end_sql)
    dbi.execute('commit;')
    dbi.close()
    
def deal_m_product():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    log_start_sql="""
    insert into db_sync.db_sync_log(db_sync_job_name,job_status,begin_time,end_time) values('db_sync_m_product','Running','"""+now_time+"""','');
    """
    sql="""
    delete from db_sync.m_product;
    """
    dbi.connect()
    dbi.execute(log_start_sql)
    dbi.execute('commit;')
    dbi.execute(sql)
    dbi.execute('commit;')
    dbi.close()
    
    imp_cmd="""
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:db_sync.m_product --from des_mall:des_mall:m_product  --choice choice --split '\\001' --cond "select id,title,sub_title,type,cat_id,partner_id,image,state,sort,detail_image,detail_html from m_product"
    """
    os.system(imp_cmd)    
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    log_end_sql="""
    UPDATE db_sync.db_sync_log t1 JOIN (SELECT MAX(id) AS id FROM db_sync.db_sync_log where db_sync_job_name='db_sync_m_product') t2 ON  t1.id=t2.id SET end_time='"""+now_time+"""',job_status='Done';
    """
    dbi.connect()
    dbi.execute(log_end_sql)
    dbi.execute('commit;')
    dbi.close()              
def main():
    deal_m_order()
    deal_m_recharging()
    deal_m_score_account()
    deal_m_score_balance()
    deal_m_item()
    deal_m_product()
if __name__ == '__main__':
    main()