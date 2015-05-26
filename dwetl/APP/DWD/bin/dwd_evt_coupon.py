#!/usr/bin/python
#coding=utf-8
import sys,codecs,operator,os,commands;
import smtplib,traceback;
from email.MIMEText import MIMEText;
sys.path.append('/home/q/dwetl/lib/py/util');
sys.path.append('/home/q/dwetl/lib/py/db');
from DBI import DBI;
from Time import Time;
reload(sys);
sys.setdefaultencoding('utf-8');
sys.path.append('/home/q/hadoop/hive-default/lib/py');
from hive_service import ThriftHive;
from hive_service.ttypes import HiveServerException;
from thrift import Thrift;
from thrift.transport import TSocket;
from thrift.transport import TTransport;
from thrift.protocol import TBinaryProtocol;
def init_database():
	hive_ip="localhost";
	hive_port="10000";
	hive_t_socket=TSocket.TSocket(hive_ip,hive_port);
	hive_t_socket=TSocket.TBufferedTransport(hive_t_socket);
	hive_protocol=TBinaryProtocol.TBinaryProtocol(hive_t_socket);
	hive_client=ThriftHive.Client(hive_protocol);
	hive_t_socket.open();
	return hive_client,hive_t_socket;
def send_email(message,date,sql):
	head=" <h2> "+date+sql+"</h2>";
	message=head+message; 
	message.encode("utf-8");
	msg = MIMEText(message,_subtype='html',_charset="utf-8");
	msg.set_charset('utf-8'); 
	msg['From'] = 'des-bi@qunar.com';
	msg['To'] ='mingxiang.yan@qunar.com';
	msg['Subject']='运行错误';
	s = smtplib.SMTP();
	s.connect('mail.corp.qunar.com');
	s.sendmail(msg['From'], msg['To'].split(","), msg.as_string());
	s.close();


def main(date):
	hive_client,hive_conn=init_database();
	hive_sql="insert overwrite table dwd.dwd_evt_coupon \
			  select nvl(b.voucher_id,a.id),nvl(b.user_id,a.user_id),nvl(b.partner_id,a.partner_id),if(b.goods_id is NULL,a.team_id,b.goods_id),nvl(b.order_id,a.order_id),a.balance_pay_amt,  \
			  a.coupon_secret,nvl(case when b.status='CONSUMED' then 'Y' when b.status is null then b.status else 'N' end,a.consume_flag),if(a.user_ip='null',NULL,a.user_ip),a.sms_times, \
			  if(nvl(b.expire_time,a.expire_time)='null',NULL,nvl(b.expire_time,a.expire_time)), \
			  if(nvl(b.consume_time,a.consume_time)='null',NULL,nvl(b.consume_time,a.consume_time)), \
			  if(nvl(b.create_time,a.create_time)='null',NULL,nvl(b.create_time,a.create_time)), \
			  if(a.sms_time='null',NULL,a.sms_time),a.buy_seq,if(a.expire_notify_time='null',NULL,a.expire_notify_time), \
			  a.freeze_flag,a.disable_flag,if(a.disable_time='null',NULL,a.disable_time), \
			  nvl(b.shop_id,a.partner_shop_id),a.freeze_from,if(a.from_type='null',NULL,a.from_type),a.team_use_total,a.pay_state,nvl(b.voucher_type_x,a.coupon_type),b.status,b.refund_result,b.consume_source, \
			  b.is_half,b.goods_price,b.goods_price,b.room_time_key,if(b.checkin_date='null',NULL,b.checkin_date),b.activity_type \
			  from (select *,case when voucher_type='COUPON' then 'coupon' when voucher_type='THROUGHCOUPON' then 'through_coupon' else voucher_type end as voucher_type_x from stg.stg_qunar_group_voucher_list_da where dt='"+date+"') b  \
			  full  outer join  \
			  (select cast(c2.through_coupon_id as string) as id,c2.user_id,c2.partner_id,c2.team_id,c2.order_id,NULL as balance_pay_amt, \
			   cast(c2.secret as string) as coupon_secret,case when c2.is_used=0 then 'N' else 'Y' end as consume_flag ,NULL as user_ip ,c2.sms as sms_times, \
			   c2.expire_time,NULL as consume_time,c2.create_time,c2.sms_time,NULL as buy_seq ,NULL as expire_notify_time, \
			   case when c2.is_freeze=0 then 'N' else 'Y' end as freeze_flag,case when c2.is_del=0 then 'N' else 'Y' end as disable_flag,c2.del_time as disable_time, \
			   NULL as partner_shop_id,c2.freeze_from,c2.from_type,c2.team_use_total,  \
			   pay_state,'through_coupon' as coupon_type,NULL as coupon_status,NULL as refund_result,NULL as consume_source,NULL as half_price_flag,NULL as team_price,  \
			   NULL as team_version,NULL as room_time_key,NULL as checkin_date,NULL as activity_type \
			   from \
			   (select through_coupon_id,max(id) as id from stg.stg_qunar_group_through_coupon_da where dt='"+date+"' group by through_coupon_id) c1 \
			   inner join \
			   (select * from stg.stg_qunar_group_through_coupon_da where dt='"+date+"') c2 \
			   on c1.through_coupon_id=c2.through_coupon_id and c1.id =c2.id \
			   union all \
			   select id,user_id,partner_id,team_id,order_id,credit as balance_pay_amt ,secret as coupon_secret ,consume as consume_flag ,ip as user_ip ,sms as sms_times , \
			   from_unixtime(expire_time) as expire_time,from_unixtime(consume_time) as consume_time,from_unixtime(create_time) as create_time,from_unixtime(sms_time) as sms_time, \
			   buy_id as buy_seq ,from_unixtime(expire_notify_time) as expire_notify_time, \
			   freeze as freeze_flag ,disabled as disable_flag,if(disable_time='null',NULL,disable_time) as disable_time, \
			   shop_id as partner_shop_id,freeze_from,from_type,NULL as team_use_total,NULL as pay_state ,'coupon' as coupon_type,NULL as coupon_status,NULL as refund_result, \
			   NULL as consume_source,NULL as half_price_flag,NULL as team_price,NULL as team_version,NULL as room_time_key,NULL as checkin_date,NULL as activity_type  \
			   from stg.stg_qunar_group_coupon_da where dt='"+date+"') a \
			  on b.voucher_id=a.id and b.voucher_type_x=a.coupon_type";
	print hive_sql;
	hive_client.execute(hive_sql);
	hive_conn.close();
	

	dbi=DBI(driver='mysql',dbc='db_data_discover_new');
	dbi.set_dbc(db='dwd');
	dbi.connect();
	dbi.execute("TRUNCATE dwd_evt_coupon;");
	dbi.execute("commit;");
	dbi.close();
	

	dbi=DBI(driver='postgre',dbc='qunar_group_congku2');
	dbi.set_dbc(db='qunar_group');
	dbi.connect();
	dbi.execute_sql("TRUNCATE table public.dwd_evt_coupon;");
	dbi.execute_sql("commit;");
	dbi.close();
	
	to_mysql="python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwd:dwd_evt_coupon --from hive:stg:dwd_evt_coupon --split '\\001'  --dir /user/desdev/hive/warehouse/dwd/dwd_evt_coupon --map_num 10";	
	
	status,message=commands.getstatusoutput(to_mysql);
	print message;
	if status !=0:
		send_email(message,date,to_mysql);
		os._exit(1);
	
	to_pg="python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to tuandb3:qunar_group:dwd_evt_coupon --from hive:stg:dwd_evt_coupon --split '\\001'  --dir /user/desdev/hive/warehouse/dwd/dwd_evt_coupon --map_num 10";
	
	status,message=commands.getstatusoutput(to_pg);
	print message;
	if status !=0:
		send_email(message,date,to_pg);
		os._exit(1);
	
if __name__=='__main__':
	date_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday();
	try:
		main(date_dt);
	except Exception,e:
		send_email("dwd_evt_coupon failed",traceback.format_exc(),date_dt);
		os._exit(1);
