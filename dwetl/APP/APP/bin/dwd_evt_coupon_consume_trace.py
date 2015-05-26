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
	mysql_sql='''sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from tuandb3:qunar_group:public.partner_shop --to hive:stg:stg_qunar_group_partner_shop --overwrite overwrite --map hotel_seq_detail --partition dt=\''''+date+'''\'''';
	print mysql_sql;
	status,message=commands.getstatusoutput(mysql_sql);
	if status !=0:
		print "dwd_evt_coupon_consume_trace,partner_shop in hive false";
		send_email(message,date,mysql_sql);
		os._exit(1);
	hive_client,hive_conn=init_database();
	hive_sql1="insert overwrite table dwd.dwd_evt_coupon_consume_trace  \
			  select c.*,d.seq from \
			  (select distinct id,seq,partner_id from stg.stg_qunar_group_partner_shop where dt='"+date+"') d \
			  right outer join \
			  (select a.id,a.order_id,a.team_id ,a.admin_id,a.coupon_id,a.operate_type, \
			   a.operate_time,a.operate_count,b.partner_id,b.shop_id,'coupon' as  coupon_type from \
			   (select * from stg.stg_qunar_group_coupon_consume_trace_da where dt='"+date+"') a \
			   left outer join \
			   (select * from stg.stg_qunar_group_coupon_da where dt='"+date+"') b \
			   on a.coupon_id=b.id \
			   union all \
			   select id,order_id,team_id,user_id as admin_id,through_coupon_id as coupon_id, \
			   operate_type,operate_time,1 as operate_count,partner_id,shop_id,'through_coupon' as coupon_type  \
			   from stg.stg_qunar_group_through_coupon_consume_trace_da where dt='"+date+"' ) c \
			  on c.shop_id=d.id";
	hive_sql2="insert overwrite table dwd.dwd_evt_coupon_consume_trace \
			  select a.trace_id,a.order_id,a.team_id,a.operator_id,a.coupon_no,a.operate_type,a.operate_time,a.operate_count,a.partner_id,a.partner_shop_id,a.coupon_type,coalesce(a.hotel_seq,e.hotel_seq) from dwd.dwd_evt_coupon_consume_trace a left outer join \
			  (select * from stg.stg_qunar_group_team_da where dt='"+date+"') e \
			  on a.team_id=e.id";
	try:
		print hive_sql1;
		hive_client.execute(hive_sql1);
		print hive_sql2;
		hive_client.execute(hive_sql2);
		hive_conn.close();
		dbi=DBI(driver='mysql',dbc='db_data_discover_new');
		dbi.set_dbc(db='dwd');
		dbi.connect();
		dbi.execute("truncate dwd_evt_coupon_consume_trace;");
		dbi.execute("commit;");
		dbi.close();
		to_mysql='''sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from hive:dwd:dwd_evt_coupon_consume_trace --to dw03Mysql:dwd:dwd_evt_coupon_consume_trace --dir /user/desdev/hive/warehouse/dwd/dwd_evt_coupon_consume_trace --split '\\001' --choose choose''';
		print to_mysql;
		status,message=commands.getstatusoutput(to_mysql);
		print message;
		if status !=0:
			print "dwd_evt_coupon_consume_trace,partner_shop in hive false";
			send_email(message,date,mysql_sql);
			os._exit(1);
	except Exception as e:
		send_email("hive _sql is error"+traceback.format_exc(),date,hive_sql);
		os._exit(1);
	
if __name__=='__main__':
	date_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday();
	main(date_dt);
