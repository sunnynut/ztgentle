#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
date_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
pre60day=Time.date_add(date_dt,-60)
def dwr_hotel_online_reserve_detail_di(date_dt):
	dbi_del=DBI(driver='mysql',dbc='db_data_discover_new')
	dbi_del.set_dbc(db='dwr')
	sql_del="""
	delete from dwr.dwr_hotel_online_reserve_detail_di
	where stat_date='{date_dt}';
	commit;
	""".format(date_dt=date_dt)
	print sql_del
	dbi_del.connect()
	dbi_del.execute(sql_del)
	dbi_del.close()
	
	
	
	dbi_dwr=DBI(driver='mysql',dbc='db_data_discover_new')
	dbi_dwr.set_dbc(db='dwr')
	sql_dwr="""
	insert into dwr.dwr_hotel_online_reserve_detail_di(stat_date,hotel_seq,hotel_name,today_reserve_order_qty,today_reserve_success_order_qty,today_reserve_faile_order_qty,total_reserve_order_qty,total_reserve_success_order_qty,total_reserve_fail_order_qty)
	select a.dt as stat_date,a.hotel_seq,a.hotel_title,a.today_reserve_order_qty,a.today_reserve_success_order_qty,a.today_reserve_faile_order_qty,(a.today_reserve_order_qty+case when b.total_reserve_order_qty is null then 0 else b.total_reserve_order_qty end) as total_reserve_order_qty,(a.today_reserve_success_order_qty+case when b.total_reserve_success_order_qty is null then 0 else b.total_reserve_order_qty end) as total_reserve_success_order_qty,(a.today_reserve_faile_order_qty+case when b.total_reserve_fail_order_qty is null then 0 else b.total_reserve_fail_order_qty end) as total_reserve_fail_order_qty
	from
	(
	 select '{date_dt}' as dt,hotel_seq,hotel_title,count(1) as today_reserve_order_qty,sum(if(r.status in (1,2),1,0)) as today_reserve_success_order_qty,sum(if(r.status = -1,1,0)) as today_reserve_faile_order_qty
	 from db_sync.reserve r
	 inner join db_sync.order o
	 on r.oid=o.id and date_format(o.create_time, '%Y-%m-%d') = '{date_dt}'
	 inner join db_sync.team t on r.team_id=t.id
	 inner join db_sync.hotel_product_tuan h on h.team_id= o.team_id
	 group by h.hotel_seq,h.hotel_title
	)a
	left join
	(
		select hotel_seq,total_reserve_order_qty,total_reserve_success_order_qty,total_reserve_fail_order_qty
		from dwr.dwr_hotel_online_reserve_detail_di 
		where stat_date = date_sub(date_format('{date_dt}', '%Y-%m-%d'),interval 1 day)
	)b on a.hotel_seq=b.hotel_seq;
	commit;
	""".format(date_dt=date_dt)
	print sql_dwr;
	dbi_dwr.connect()
	dbi_dwr.execute(sql_dwr)
	dbi_dwr.close()
		
    
def main():
	global date_dt;
	for i in range (0,7)[::-1]:
		date=Time.date_add(date_dt,i*(-1));
		dwr_hotel_online_reserve_detail_di(date)
if __name__ == '__main__':
	main()
