#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
pre60day=Time.date_add(data_dt,-60)

def db_sync_partner_shop():
	
	dbi=DBI(driver='mysql',dbc='db_data_discover_new')
	dbi.set_dbc(db='db_sync')
	
	sql="""
	truncate table db_sync.partner_shop;
	commit;
	"""
	dbi.connect()
	dbi.execute(sql)
	dbi.close()
	
	from_pg_to_my="""
	python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:db_sync.partner_shop --from tuandb3:qunar_group:public.partner_shop --choose choose --split '\\001' --cond "select id,title,phone,business,bus,metro,car,work_time,location,map,other,partner_id,area1,area2,area3,username,password,seq,hotel_seq_detail,saltkey,weak_password,seq_password,type,user_center_name,email,mobile,address,host_city,cinema_id,status from public.partner_shop"
	"""

	os.system(from_pg_to_my)


def main():
	db_sync_partner_shop()

if __name__=='__main__':
	main()

