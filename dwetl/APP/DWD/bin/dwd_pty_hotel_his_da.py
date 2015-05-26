#!/usr/bin/python
#coding=utf-8
import sys,codecs,operator,os,commands;
import smtplib,traceback;
from email.MIMEText import MIMEText;
sys.path.append('/home/q/dwetl/lib/py/util');
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

sys.path.append('/home/q/dwetl/lib/py/db');
from DBI import DBI;

def init_database(*init_sql):
	hive_ip="localhost";
	hive_port="10000";
	hive_t_socket=TSocket.TSocket(hive_ip,hive_port);
	hive_t_socket=TSocket.TBufferedTransport(hive_t_socket);
	hive_protocol=TBinaryProtocol.TBinaryProtocol(hive_t_socket);
	hive_client=ThriftHive.Client(hive_protocol);
	hive_t_socket.open();
	for init in init_sql:
		hive_client.execute(init);
	return hive_client,hive_t_socket;
def send_email(message,date,sql=''):
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

def init_data(date,*init_cmd):
	for init in init_cmd:
		print init;
		status,message=commands.getstatusoutput(init);
		print message;
		if status !=0:
			send_email(message,date,init);
			os._exit(1);

def excute_sql(client,*sql_data):
	for sql in sql_data:
		print sql;
		client.execute(sql);

def main(date,date_ye,date_ye_3):
	
	hive_client,hive_conn=init_database("add jar /home/q/hiveUDF/UDFjar.jar","create temporary function isequal as 'com.qunar.ListEqual'");	

	new_state_hive="insert overwrite table dwd.dwd_pty_hotel_his_da partition (dt='"+date+"') \
					select nvl(c1.hotel_seq,c2.seq_number),nvl(c1.city_code,c2.city),nvl(c1.city_name,c2.city_name),nvl(c1.name,c2.name),  \
					nvl(c1.address,c2.address),nvl(c1.area,c2.area),nvl(c1.star,c2.star),nvl(c1.grade,c2.grade),nvl(c1.brand,c2.brand),  \
					nvl(c1.phone_number,c2.telephone),nvl(c1.baidu_point,c2.baidu_point),nvl(c1.google_point,c2.google_point),  \
					nvl(c1.abcd,c2.abcd),nvl(c1.operating_status,c2.business_status),nvl(c1.types,c2.type_names),nvl(c1.trading_areas,c2.trading_areas),  \
					nvl(c1.online_status,NULL),nvl(c1.level,NULL),nvl(c1.last_mod,NULL),nvl(c1.is_inland,NULL),nvl(c1.score,NULL),nvl(c1.formattedscore,NULL),  \
					nvl(c1.comm_cnt,null),nvl(c1.des_trading_areas,null),  \
					'"+date+"','4712-12-31' from  \
					(select b.*,a.level as abcd,a.city as city_name from  \
					 (select * from stg.stg_tuan_report_seq_level_12_da where dt='2015-02-03') a  \
					 right outer join   \
					 (select * from  stg.stg_qunar_group_hotel_info_da where dt='"+date+"') b  \
					 on a.seq=b.hotel_seq) c1  \
					full outer join   \
					(select b.*,a.level as abcd,a.city as city_name  from  \
					 (select * from stg.stg_tuan_report_seq_level_12_da where dt='2015-02-03') a  \
					 right outer join  \
					 (select * from stg.stg_crm_crm_hotel_da where dt='"+date+"') b  \
					 on a.seq=b.seq_number) c2  \
					on c1.hotel_seq=c2.seq_number  ";
	get_city_hive="insert overwrite table dwd.dwd_pty_hotel_his_da partition (dt='"+date+"') \
				   select a.hotel_seq,a.hotel_city_code,nvl(a.hotel_city_name,b.city_name),a.hotel_name,a.hotel_address,a.hotel_area, \
				   a.hotel_star,a.hotel_grade,a.hotel_brand,a.hotel_phone_number,a.hotel_baidu_point,a.hotel_google_point, \
				   a.hotel_abcd_grade,a.operating_status,a.hotel_types,a.hotel_trading_areas,a.online_status,a.hotel_level,  \
				   a.last_modify_time,a.is_inland_flag,a.hotel_score,a.hotel_formatted_score,a.comment_cnt,a.des_trading_areas, \
				   a.effective_start_date,a.effective_end_date  from  \
				   (select * from dwd.dwd_pty_hotel_his_da where dt='"+date+"') a  \
					left outer join  \
					(select distinct city_code,city_name from dim.dim_city ) b\
					on a.hotel_city_code=b.city_code";
	change_begintime_hive="insert overwrite table dwd.dwd_pty_hotel_his_da partition (dt='"+date+"')  \
						   select a.hotel_seq,a.hotel_city_code,a.hotel_city_name,a.hotel_name,a.hotel_address,a.hotel_area,  \
						   a.hotel_star,a.hotel_grade,a.hotel_brand,a.hotel_phone_number,a.hotel_baidu_point,a.hotel_google_point,  \
						   a.hotel_abcd_grade,a.operating_status,a.hotel_types,a.hotel_trading_areas,a.online_status,a.hotel_level,  \
						   a.last_modify_time,a.is_inland_flag,a.hotel_score,a.hotel_formatted_score,a.comment_cnt,a.des_trading_areas,  \
						   if(isequal(3,a.*,b.*,24,25,26),b.effective_start_date,a.effective_start_date ),a.effective_end_date from  \
						   (select * from dwd.dwd_pty_hotel_his_da  where dt='"+date+"') a   \
						   left outer join   \
						   (select * from dwd.dwd_pty_hotel_his_da  where dt='"+date_ye+"' and effective_end_date ='4712-12-31') b   \
						   on a.hotel_seq=b.hotel_seq  ";

	get_all_hive="insert into table dwd.dwd_pty_hotel_his_da partition (dt='"+date+"')  \
				  select * from  \
				  (select b.hotel_seq,b.hotel_city_code,b.hotel_city_name,b.hotel_name,b.hotel_address,b.hotel_area,  \
				   b.hotel_star,b.hotel_grade,b.hotel_brand,b.hotel_phone_number,b.hotel_baidu_point,b.hotel_google_point, \
				   b.hotel_abcd_grade,b.operating_status,b.hotel_types,b.hotel_trading_areas,b.online_status,b.hotel_level, \
				   b.last_modify_time,b.is_inland_flag,b.hotel_score,b.hotel_formatted_score,b.comment_cnt,b.des_trading_areas, \
				   b.effective_start_date,if(isequal(3,b.*,a.*,24,25,26),a.effective_end_date,'"+date_ye+"') as effective_end_date from  \
				   (select * from dwd.dwd_pty_hotel_his_da partition where dt='"+date+"') a  \
				   right outer join  \
				   (select * from dwd.dwd_pty_hotel_his_da partition where dt='"+date_ye+"' and effective_end_date ='4712-12-31') b  \
				   on a.hotel_seq=b.hotel_seq  \
				   union all  \
				   select hotel_seq,hotel_city_code,hotel_city_name,hotel_name,hotel_address,hotel_area,  \
				   hotel_star,hotel_grade,hotel_brand,hotel_phone_number,hotel_baidu_point,hotel_google_point,  \
				   hotel_abcd_grade,operating_status,hotel_types,hotel_trading_areas,online_status,hotel_level,   \
				   last_modify_time,is_inland_flag,hotel_score,hotel_formatted_score,comment_cnt,des_trading_areas,  \
				   effective_start_date,effective_end_date  \
				   from dwd.dwd_pty_hotel_his_da partition where dt='"+date_ye+"' and effective_end_date !='4712-12-31') c";

	duplicate_remove="insert overwrite table dwd.dwd_pty_hotel_his_da partition (dt='"+date+"') \
					  select distinct b.hotel_seq,b.hotel_city_code,b.hotel_city_name,b.hotel_name,b.hotel_address,b.hotel_area, \
					  b.hotel_star,b.hotel_grade,b.hotel_brand,b.hotel_phone_number,b.hotel_baidu_point,b.hotel_google_point, \
					  b.hotel_abcd_grade,b.operating_status,b.hotel_types,b.hotel_trading_areas,b.online_status,b.hotel_level, \
					  b.last_modify_time,b.is_inland_flag,b.hotel_score,b.hotel_formatted_score,b.comment_cnt,b.des_trading_areas, \
					  b.effective_start_date,b.effective_end_date from dwd.dwd_pty_hotel_his_da  b where dt='"+date+"' ";
	
	excute_sql(hive_client,new_state_hive,get_city_hive,change_begintime_hive,get_all_hive,duplicate_remove);
	hive_client.execute("use dwd");
	hive_client.execute("alter table dwd_pty_hotel_his_da drop if exists partition (dt='"+date_ye_3+"')");
	
	hive_conn.close();
	
	dbi=DBI(driver='mysql',dbc='db_data_discover_new');
	dbi.set_dbc(db='dwd');
	dbi.connect();
	print "delete old data";
	dbi.execute("truncate dwd_pty_hotel_his_da;");
	dbi.execute("commit;");
	dbi.close();
	hive_to_mysql="sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from hive:dwd:dwd_pty_hotel_his_da --to dw03Mysql:dwd:dwd_pty_hotel_his_da --dir /user/desdev/hive/warehouse/dwd/dwd_pty_hotel_his_da/dt="+date;
	#init_data(date,hive_to_mysql);

if __name__=='__main__':
	import datetime;
	date_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday();
	date_dt_ye=datetime.datetime.strptime(date_dt, "%Y-%m-%d").date()-datetime.timedelta(days=1);
	date_dt_3=datetime.datetime.strptime(date_dt, "%Y-%m-%d").date()-datetime.timedelta(days=30);
	date_dt_ye=date_dt_ye.strftime("%Y-%m-%d");
	date_dt_3=date_dt_3.strftime("%Y-%m-%d");
	try:
		main(date_dt,date_dt_ye,date_dt_3);
	except Exception as e:
		send_email("dwd_pty_hotel_his_da is error "+traceback.format_exc(),date_dt);
		os._exit(1);
