#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
pre60day=Time.date_add(data_dt,-60)
def deal_db_sync_team():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    sql1="""
    insert into db_sync.db_sync_log(db_sync_job_name,job_status,begin_time,end_time) values('db_sync_team','Running','"""+now_time+"""','');
    """
    sql2="""
    truncate table db_sync.team;
    """
    dbi.connect()
    dbi.execute(sql1)
    dbi.execute('commit;')
    dbi.execute(sql2)
    dbi.execute('commit;')
    dbi.close()
    imp_cmd="""
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:db_sync.team   --from tuandb3:qunar_group:public.team  --choose choose --split '\\001' --cond "select id,user_id,title,city_id,group_id,partner_id,system,team_price,market_price,product,condbuy,per_number,min_number,max_number,now_number,pre_number,image,image1,image2,flv,mobile,credit,card,fare,farefree,bonus,address,delivery,state,conduser,buyonce,team_type,sort_order,to_timestamp(expire_time)::TIMESTAMP(0) without time zone,to_timestamp(begin_time)::TIMESTAMP(0) without time zone,to_timestamp(end_time)::TIMESTAMP(0),to_timestamp(reach_time)::TIMESTAMP(0) without time zone,to_timestamp(close_time)::TIMESTAMP(0) without time zone,seo_title,seo_keyword,stitle,sales,publish,profit,order_type,hide_partner,room_type,express_fee,popularize,major_popularize,have_popularize,earliest_start,room_desc,cost_price,red_envelope,team_price_high,market_price_high,flight_max_discount,flight_max_save,voucher_val,travel_long,p_team_id,tuan_room_type,baojian_total,qqgid,through_coupon_total,subtitle,refund_support,if_need_visa,is_new_team,settlement_id,settlement_days,ticket_input_time::TIMESTAMP(0) without time zone,expressno_input_time::TIMESTAMP(0) without time zone,last_back_time::TIMESTAMP(0) without time zone,price_type,hms_can_book,hms_unlock,detail_table,new_type,tuanhide,team_display_type,new_attr,partner_source,other_tuan_type,other_tuan_id,refund_condition,sign_company,settlement_type,is_union_product,tuan_product_type,pre_date,tel_book,version,url_short,create_time::TIMESTAMP(0) without time zone,update_time::TIMESTAMP(0) without time zone,source_type  from public.team where group_id in(2,4)"
    """
    os.system(imp_cmd)
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='db_sync')
    now_time=Time.now()
    sql3="""
    UPDATE db_sync.db_sync_log t1 JOIN (SELECT MAX(id) AS id FROM db_sync.db_sync_log where db_sync_job_name='db_sync_team') t2 ON  t1.id=t2.id SET end_time='"""+now_time+"""',job_status='Done';
    """
    dbi.connect()
    dbi.execute(sql3)
    dbi.execute('commit;')
    dbi.close()
def main():
    deal_db_sync_team()
if __name__ == '__main__':
    main()