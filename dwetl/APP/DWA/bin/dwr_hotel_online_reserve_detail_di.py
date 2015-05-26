#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
date_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
pre60day=Time.date_add(date_dt,-60)
def dwa_online_reserve_sum_di():
	dbi_del=DBI(driver='mysql',dbc='db_data_discover_new')
	dbi_del.set_dbc(db='dwa')
	sql_del="""
	delete from dwa.dwa_online_reserve_sum_di
	where stat_date='{date_dt}';
	commit;
	""".format(date_dt=date_dt);
	print sql_del;
	dbi_del.connect()
	dbi_del.execute(sql_del)
	dbi_del.close()
	
	
	
	dbi_dwa=DBI(driver='mysql',dbc='db_data_discover_new')
	dbi_dwa.set_dbc(db='dwa')
	sql_dwa="""
	insert into dwa.dwa_online_reserve_sum_di(stat_date,support_reserve_hotel_cnt,support_reserve_team_cnt,actural_reserve_hotel_cnt,actural_reserve_team_cnt,platform_type,support_reserve_generate_order_qty,support_reserve_generate_room_night_qty,support_reserve_pay_order_qty,support_reserve_pay_room_night_qty,reserve_order_qty,reserve_room_night_qty,reserve_success_order_qty,reserve_success_room_night_qty,reserve_fail_order_qty,reserve_fail_room_night_qty,system_cancel_reserve_order_qty,user_cancel_reserve_order_qty)
	select a.dt,ifnull(a.support_reserve_hotel_cnt,0),ifnull(a.support_reserve_team_cnt,0),ifnull(b.actural_reserve_hotel_cnt,0),ifnull(b.actural_reserve_team_cnt,0),a.platform as platform_type,ifnull(c.support_reserve_generate_order_qty,0),ifnull(c.support_reserve_generate_room_night_qty,0),ifnull(d.support_reserve_pay_order_qty,0),ifnull(d.support_reserve_pay_room_night_qty,0),ifnull(e.reserve_order_qty,0),ifnull(e.reserve_room_night_qty,0),ifnull(f.reserve_success_order_qty,0),ifnull(f.reserve_success_room_night_qty,0),ifnull(g.reserve_fail_order_qty,0),ifnull(g.reserve_fail_room_night_qty,0),ifnull(h.system_cancel_reserve_order_qty,0),ifnull(i.user_cancel_reserve_order_qty,0)
	from 
	(
		SELECT  '{date_dt}' as dt,
				'touch' as platform,
				COUNT(DISTINCT h.hotel_seq) as support_reserve_hotel_cnt, 
				count(distinct team.ID) as support_reserve_team_cnt
		FROM db_sync.team team
		JOIN db_sync.team_ext ext ON team.ID = ext.team_id
		inner JOIN db_sync.hotel_product_tuan h on team.id = h.team_id
		WHERE ext.online_booking = 1
		AND team.publish = 'Y'
		AND substring(team.expire_time,1,10) >='{date_dt}'
		AND substring(team.begin_time,1,10) <='{date_dt}'
		AND substring(team.end_time,1,10) >= '{date_dt}'
		AND team.group_id = 4
		AND team.new_type = 'normal'
		AND team.source_type = 1
		
		union all
		SELECT  '{date_dt}' as dt,
				'app' as platform,
				COUNT(DISTINCT h.hotel_seq) as support_reserve_hotel_cnt, 
				count(distinct team.ID) as support_reserve_team_cnt
		FROM db_sync.team team
		JOIN db_sync.team_ext ext ON team.ID = ext.team_id
		inner JOIN db_sync.hotel_product_tuan h on team.id = h.team_id
		WHERE ext.online_booking = 1
		AND team.publish = 'Y'
		AND substring(team.expire_time,1,10) >='{date_dt}'
		AND substring(team.begin_time,1,10) <='{date_dt}'
		AND substring(team.end_time,1,10) >= '{date_dt}'
		AND team.group_id = 4
		AND team.new_type = 'normal'
		AND team.source_type = 1

		union all
		SELECT '{date_dt}' as dt,
				'www' as platform,
				COUNT(DISTINCT h.hotel_seq) as support_reserve_hotel_cnt, 
				count(distinct team.ID) as support_reserve_team_cnt
		FROM db_sync.team team
		JOIN db_sync.team_ext ext ON team.ID = ext.team_id
		inner JOIN db_sync.hotel_product_tuan h on team.id = h.team_id
		WHERE ext.online_booking = 1
		AND team.publish = 'Y'
		AND substring(team.expire_time,1,10) >='{date_dt}'
		AND substring(team.begin_time,1,10) <='{date_dt}'
		AND substring(team.end_time,1,10) >= '{date_dt}'
		AND team.group_id = 4
		AND team.new_type = 'normal'
		AND team.source_type = 1
	)a 
	left join
	(
		select  '{date_dt}' as dt,
				COUNT(DISTINCT h.hotel_seq) as actural_reserve_hotel_cnt, 
				count(distinct reserve.team_id) as actural_reserve_team_cnt
		from db_sync.reserve reserve
		inner join db_sync.hotel_product_tuan h
		on reserve.team_id = h.team_id
		AND date_format(reserve.create_time, '%Y-%m-%d') = '{date_dt}'
	)b on a.dt = b.dt
	left join
	(
		select '{date_dt}' as dt,
			   CASE  WHEN orde.vid LIKE '9%' THEN 'touch' 
					 WHEN orde.vid LIKE '6%' OR orde.vid LIKE '8%' THEN 'app' 
					 ELSE 'www' 
					 END AS platform,
			   count(1) as support_reserve_generate_order_qty, 
			   sum(orde.quantity * team.baojian_total) as support_reserve_generate_room_night_qty
		from db_sync.order orde
		inner join db_sync.team_ext ext on orde.team_id = ext.team_id
		inner join db_sync.team on team.id = orde.team_id
		where ext.online_booking = 1 and date_format(orde.create_time, '%Y-%m-%d') = '{date_dt}'
		group by CASE  WHEN orde.vid LIKE '9%' THEN 'touch' 
					   WHEN orde.vid LIKE '6%' OR orde.vid LIKE '8%' THEN 'app' 
					   ELSE 'www' 
					   END
	)c on a.dt = c.dt and a.platform=c.platform
	left join
	(
		select '{date_dt}' as dt,
			   CASE  WHEN orde.vid LIKE '9%' THEN 'touch' 
					 WHEN orde.vid LIKE '6%' OR orde.vid LIKE '8%' THEN 'app' 
					 ELSE 'www' 
					 END AS platform,
			   count(1) as support_reserve_pay_order_qty, 
			   sum(orde.quantity * team.baojian_total) as support_reserve_pay_room_night_qty
		from db_sync.reserve reserve
		inner join db_sync.order orde on reserve.oid=orde.id and date_format(orde.create_time, '%Y-%m-%d') = '{date_dt}'
		inner join db_sync.team team on reserve.team_id=team.id
		group by CASE  WHEN orde.vid LIKE '9%' THEN 'touch' 
					   WHEN orde.vid LIKE '6%' OR orde.vid LIKE '8%' THEN 'app' 
					   ELSE 'www' 
					   END
	)d on a.dt=d.dt and a.platform=d.platform
	left join
	(
		select '{date_dt}' as dt,
			   CASE  WHEN orde.vid LIKE '9%' THEN 'touch' 
					 WHEN orde.vid LIKE '6%' OR orde.vid LIKE '8%' THEN 'app' 
					 ELSE 'www' 
					 END AS platform,
			   count(1) as reserve_order_qty, 
			   sum(orde.quantity * team.baojian_total) as reserve_room_night_qty
		from db_sync.reserve reserve
		inner join db_sync.order orde 
		on reserve.oid=orde.id and date_format(orde.create_time, '%Y-%m-%d') = '{date_dt}'
		inner join db_sync.team team on reserve.team_id=team.id
		group by CASE  WHEN orde.vid LIKE '9%' THEN 'touch' 
					   WHEN orde.vid LIKE '6%' OR orde.vid LIKE '8%' THEN 'app' 
					   ELSE 'www' 
					   END
	)e on a.dt=e.dt and a.platform=e.platform
	left join
	(
		select '{date_dt}' as dt,
			   CASE  WHEN orde.vid LIKE '9%' THEN 'touch' 
					 WHEN orde.vid LIKE '6%' OR orde.vid LIKE '8%' THEN 'app' 
					 ELSE 'www' 
					 END AS platform,
			   count(1) as reserve_success_order_qty, 
			   sum(orde.quantity * team.baojian_total) as reserve_success_room_night_qty
		from db_sync.reserve reserve
		inner join db_sync.order orde 
		on reserve.oid=orde.id and date_format(orde.create_time, '%Y-%m-%d') = '{date_dt}'
		inner join db_sync.team team on reserve.team_id=team.id
		where reserve.status in (1,2)
		group by CASE  WHEN orde.vid LIKE '9%' THEN 'touch' 
					   WHEN orde.vid LIKE '6%' OR orde.vid LIKE '8%' THEN 'app' 
					   ELSE 'www' 
					   END
	)f on a.dt=f.dt and a.platform=f.platform
	left join
	(
		select '{date_dt}' as dt,
			   CASE  WHEN orde.vid LIKE '9%' THEN 'touch' 
					 WHEN orde.vid LIKE '6%' OR orde.vid LIKE '8%' THEN 'app' 
					 ELSE 'www' 
					 END AS platform,
			   count(1) as reserve_fail_order_qty, 
			   sum(orde.quantity * team.baojian_total) as reserve_fail_room_night_qty
		from db_sync.reserve reserve
		inner join db_sync.order orde 
		on reserve.oid=orde.id and date_format(orde.create_time, '%Y-%m-%d') = '{date_dt}'
		inner join db_sync.team team on reserve.team_id=team.id
		where reserve.status = -1
		group by CASE  WHEN orde.vid LIKE '9%' THEN 'touch' 
					   WHEN orde.vid LIKE '6%' OR orde.vid LIKE '8%' THEN 'app' 
					   ELSE 'www' 
					   END
	)g on a.dt=g.dt and a.platform=g.platform
	left join
	(
		select '{date_dt}' as dt,
			   CASE  WHEN orde.vid LIKE '9%' THEN 'touch' 
					 WHEN orde.vid LIKE '6%' OR orde.vid LIKE '8%' THEN 'app' 
					 ELSE 'www' 
					 END AS platform,
			   count(1) as system_cancel_reserve_order_qty
		from db_sync.reserve reserve
		inner join db_sync.order orde 
		on reserve.oid=orde.id and date_format(orde.create_time, '%Y-%m-%d') = '{date_dt}'
		where reserve.status in (-2,-4,-5)
		group by CASE  WHEN orde.vid LIKE '9%' THEN 'touch' 
					   WHEN orde.vid LIKE '6%' OR orde.vid LIKE '8%' THEN 'app' 
					   ELSE 'www' 
					   END
	)h on a.dt=h.dt and a.platform=h.platform
	left join
	(
		select '{date_dt}' as dt,
			   CASE  WHEN orde.vid LIKE '9%' THEN 'touch' 
					 WHEN orde.vid LIKE '6%' OR orde.vid LIKE '8%' THEN 'app' 
					 ELSE 'www' 
					 END AS platform,
			   count(1) as user_cancel_reserve_order_qty
		from db_sync.reserve reserve
		inner join db_sync.order orde 
		on reserve.oid=orde.id and date_format(orde.create_time, '%Y-%m-%d') = '{date_dt}'
		where reserve.status in (-3)
		group by CASE  WHEN orde.vid LIKE '9%' THEN 'touch' 
					   WHEN orde.vid LIKE '6%' OR orde.vid LIKE '8%' THEN 'app' 
					   ELSE 'www' 
					   END
	)i on a.dt=i.dt and a.platform=i.platform;
	commit;
	""".format(date_dt=date_dt);
	print sql_dwa;
	dbi_dwa.connect()
	dbi_dwa.execute(sql_dwa)
	dbi_dwa.close()
		
    
def main():
	inter=0;
	global date_dt;
	while(inter<7):
		dwa_online_reserve_sum_di();
		inter+=1;
		date_dt=Time.date_add(date_dt,-1);
	
if __name__ == '__main__':
	main()
