#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
pre60day=Time.date_add(data_dt,-60)
def deal_db_sync_hotel_product_tuan():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    sql1="""
    insert into db_sync.db_sync_log(db_sync_job_name,job_status,begin_time,end_time) values('db_sync_hotel_product_tuan','Running','"""+now_time+"""','');
    """
    sql2="""
    truncate table db_sync.hotel_product_tuan;
    """
    dbi.connect()
    dbi.execute(sql1)
    dbi.execute('commit;')
    dbi.execute(sql2)
    dbi.execute('commit;')
    dbi.close()
    imp_cmd="""
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:db_sync.hotel_product_tuan --from hive:des_bi:hotel_product_tuan  --split '\\001'  --choose choose --cond "select id,type,title,sale_price,market_price,cost_price,num_room_night,source_system,city,usage_begin_time,usage_end_time,online_begin_time,online_end_time,is_online,parent_team_id,bd_id,bd_name,bd_bu,bd_city,bd_areas,hotel_seq,hotel_title,hotel_address,hotel_biz_area,hotel_city,hotel_area,hotel_room_type,hotel_star,hotel_brand,hotel_telephone,hotel_baidu_poi,hotel_google_poi,delivery_type,red_envelope,provider_id,provider_type from des_bi.hotel_product_tuan"
    """
    #print imp_cmd
    os.system(imp_cmd)
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    sql3="""
    UPDATE db_sync.db_sync_log t1 JOIN (SELECT MAX(id) AS id FROM db_sync.db_sync_log where db_sync_job_name='db_sync_hotel_product_tuan') t2 ON  t1.id=t2.id SET end_time='"""+now_time+"""',job_status='Done';
    """
    dbi.connect()
    dbi.execute(sql3)
    dbi.execute('commit;')
    dbi.close()
def main():
    deal_db_sync_hotel_product_tuan()
if __name__ == '__main__':
    main()