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

def hive_sql_execute(hive_client,*hive_sqls):
	for hive_sql in hive_sqls:
		print hive_sql;
		hive_client.execute(hive_sql);

def main(date):
	hive_client,hive_conn=init_database();
	hive_sql_order_user="insert overwrite table dwd.dwd_evt_team_order partition (dt='"+date+"')\
						 select c1.id, case when c1.vid like '6%' or c1.vid like '8%' then 'app' when c1.vid like '9%' then 'touch'  else \
						 'www' end,c1.pay_id,c1.buy_id,c1.service,c1.user_id,c1.u_mobile,c1.email,c1.gender, \
						 c1.admin_id,c1.team_id,NULL,NULL,NULL,NULL,NULL,NULL,c1.card_id,c1.state,c1.quantity,c1.mobile,c2.city_name, \
						 c2.phone_brand,c2.area_id,c1.price,c1.money,c1.origin,c1.credit,c1.card,c1.condbuy,from_unixtime(c1.create_time),from_unixtime(c1.pay_time), \
						 c1.partner_id,c1.order_type,c1.refund_money,c1.refund_times,from_unixtime(c1.last_refund_time),c1.refund_quantity,c1.red_envelope, \
						 c1.p_order_id,c1.lock,c1.type_id,c1.type,c1.order_quick,from_unixtime(c1.cancel_time),c1.other_tuan_info,c1.version,c1.reach_shop_time, \
						 c1.merchant_code,c1.other_tuan_state,c1.vid,c1.pid,c1.uid,c1.gid,c1.cid,c1.org,substring(c1.order_version,1,19),c1.cost_price,NULL,NULL, \
						 c1.user_center_id from \
						 (select a.*,if(length(a.id)<12,b.mobile,NULL) as u_mobile,if(length(a.id)<12,b.email,NULL) as email,if(length(a.id)<12,b.gender,NULL) as gender,  \
						  case when length(a.id)<12 and regexp_extract(b.profile,'user_center_id',0) is not null then regexp_extract(b.profile,'\\\\d+',0) else cast(a.user_id as string)end as user_center_id from \
						  (select * from stg.stg_qunar_group_order_da where dt='"+date+"') a \
						  left outer join \
						  (select mobile,email,gender,id,profile from stg.stg_qunar_group_public_user_da where dt='"+date+"') b \
						  on a.user_id=b.id) c1 \
						 left outer join  \
						 (select * from stg.stg_qunar_group_report_dwr_res_phone_section where dt='"+date+"' ) c2 \
						 on substring(c1.mobile,1,7)=c2.phone_section";
	hive_sql_dim_team="insert overwrite table dwd.dwd_evt_team_order partition (dt='"+date+"')\
					   select c1.order_id ,c1.platform_type,c1.pay_seq,c1.buy_seq,c1.pay_method,c1.user_id,c1.user_mobile,c1.user_email,c1.user_sex, \
					   c1.admin_id,c1.team_id,c2.group_id,c2.hotel_seq,c2.hotel_name,c2.hotel_city,c2.hotel_city_name,c2.dept_code, \
					   if(c1.voucher_no='null',NULL,c1.voucher_no),c1.order_status,c1.buy_quantity,c1.buy_user_mobile,c1.buy_user_mobile_city, \
					   c1.buy_user_mobile_brand,c1.buy_user_mobile_area,c1.team_price,c1.actual_pay_amt,c1.should_pay_amt,c1.balance_pay_amt, \
					   c1.voucher_pay_amt,if(c1.buy_limit='null',NULL,c1.buy_limit),c1.order_time ,c1.pay_time, \
					   c1.partner_id,c1.order_type,c1.refund_amt,c1.refund_times,c1.last_refund_time,c1.refund_quantity,c1.red_envelope, \
					   c1.parent_order_id,c1.lock_flag,c1.package_id,c1.package_type,c1.order_quick_flag,c1.cancel_time,if(c1.other_tuan_info='null',NULL,c1.other_tuan_info),c1.product_version, \
					   if(c1.reach_shop_time='null',NULL,c1.reach_shop_time), \
					   if(c1.merchant_code='null',NULL,c1.merchant_code),if(c1.other_tuan_state='null',NULL,c1.other_tuan_state), \
					   if(c1.version_no='null',NULL,c1.version_no),if(c1.app_product_no='null',NULL,c1.app_product_no), \
					   if(c1.user_device_no='null',NULL,c1.user_device_no), \
					   if(c1.gid='null',NULL,c1.gid),if(c1.channel_no='null',NULL,c1.channel_no),if(c1.source_code='null',NULL,c1.source_code),if(c1.order_version='null',NULL,c1.order_version), \
					   c1.cost_price,NULL,c2.baojian_total,c1.user_center_id \
					   from  (select * from dwd.dwd_evt_team_order where dt='"+date+"') c1 \
					   left outer join \
					   (select * from dim.dim_team_his_da where dt='"+date+"') c2 \
					   on c1.team_id=c2.team_id and c2.dt between c2.effective_start_date and c2.effective_end_date";
	#hive_sql_execute(hive_client,hive_sql_order_user,hive_sql_dim_team);
	hive_conn.close();
		
	dbi=DBI(driver='mysql',dbc='db_data_discover_new');
	dbi.set_dbc(db='tmp');
	dbi.connect();
	dbi.execute("TRUNCATE tmp_dwd_evt_team_order;");
	dbi.execute("commit;");
	
	to_mysql='''sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --init "add jar /home/q/hiveUDF/UDFjar.jar;create temporary function isequal as 'com.qunar.ListEqual'" --from hive:dwd:dwd_evt_team_order --to dw03Mysql:tmp:tmp_dwd_evt_team_order --cond "select a.* from (select * from dwd.dwd_evt_team_order where dt='{date}') a left outer join (select * from dwd.dwd_evt_team_order where dt=date_sub('{date}',1)) b on a.order_id=b.order_id where isequal(2,a.*,b.*,6,61)=false"  --split "\\001" --choose choose'''.format(date=date);
	print to_mysql;
	
	status,message=commands.getstatusoutput(to_mysql);
	print message;
	if status !=0:
		send_email(message,date,to_mysql);
		os._exit(1);
	dbi.execute("DELETE b FROM tmp.tmp_dwd_evt_team_order a JOIN dwd.dwd_evt_team_order b ON a.order_id=b.order_id;");
	dbi.execute("commit;");
	dbi.execute("insert into dwd.dwd_evt_team_order select * from tmp.tmp_dwd_evt_team_order;");
	dbi.execute("commit;");
	
if __name__=='__main__':
	date_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday();
	try:
		main(date_dt);
	except Exception,e:
		send_email("dwd_evt_team_order failed",traceback.format_exc(),date_dt);
		os._exit(1);
