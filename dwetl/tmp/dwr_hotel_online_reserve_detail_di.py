#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
pre60day=Time.date_add(data_dt,-60)
def dwr_hotel_online_reserve_detail_di():
	dbi_del=DBI(driver='mysql',dbc='db_data_discover_new')
	dbi_del.set_dbc(db='dwr')
	sql_del="""
	delete from dwr.dwr_hotel_online_reserve_detail_di
	where stat_date=date_sub(date_format(now(), '%Y-%m-%d'),interval 1 day);
	commit;
	"""
	dbi_del.connect()
	dbi_del.execute(sql_del)
	dbi_del.close()
	
	
	
	dbi_dwr=DBI(driver='mysql',dbc='db_data_discover_new')
	dbi_dwr.set_dbc(db='dwr')
	sql_dwr="""
	insert into dwr.dwr_hotel_online_reserve_detail_di(stat_date,hotel_seq,hotel_name,today_reserve_order_qty,today_reserve_success_order_qty,today_reserve_faile_order_qty,total_reserve_order_qty,total_reserve_success_order_qty,total_reserve_fail_order_qty)
	select a.dt as stat_date,a.hotel_seq,a.hotel_seq,a.today_reserve_order_qty,a.today_reserve_success_order_qty,a.today_reserve_faile_order_qty,(a.today_reserve_order_qty+case when b.total_reserve_order_qty is null then 0 else b.total_reserve_order_qty end) as total_reserve_order_qty,(a.today_reserve_success_order_qty+case when b.total_reserve_success_order_qty is null then 0 else b.total_reserve_order_qty end) as total_reserve_success_order_qty,(a.today_reserve_faile_order_qty+case when b.total_reserve_fail_order_qty is null then 0 else b.total_reserve_fail_order_qty end) as total_reserve_fail_order_qty
	from
	(
		select date_sub(date_format(now(), '%Y-%m-%d'),interval 1 day) as dt,
			   reserve.shop_id as hotel_seq,
			   count(1) as today_reserve_order_qty,
			   sum(case when reserve.status=1 then 1 else 0 end) as today_reserve_success_order_qty,
			   sum(case when reserve.status=-1 then 1 else 0 end) as today_reserve_faile_order_qty
		from db_sync.reserve reserve
		where date_format(reserve.create_time, '%Y-%m-%d') = date_sub(date_format(now(), '%Y-%m-%d'),interval 1 day)
		group by reserve.shop_id
	)a
	left join
	(
		select hotel_seq,total_reserve_order_qty,total_reserve_success_order_qty,total_reserve_fail_order_qty
		from dwr.dwr_hotel_online_reserve_detail_di 
		where stat_date = date_sub(date_format(now(), '%Y-%m-%d'),interval 2 day)
	)b on a.hotel_seq=b.hotel_seq
	commit;
	"""

	dbi_dwr.connect()
	dbi_dwr.execute(sql_dwr)
	dbi_dwr.close()
		
    
def main():
	dwr_hotel_online_reserve_detail_di()
if __name__ == '__main__':
	main()
