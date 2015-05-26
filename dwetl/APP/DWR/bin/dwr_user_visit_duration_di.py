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
def init_database(*init_sqls):
	hive_ip="localhost";
	hive_port="10000";
	hive_t_socket=TSocket.TSocket(hive_ip,hive_port);
	hive_t_socket=TSocket.TBufferedTransport(hive_t_socket);
	hive_protocol=TBinaryProtocol.TBinaryProtocol(hive_t_socket);
	hive_client=ThriftHive.Client(hive_protocol);
	hive_t_socket.open();
	for sql in init_sqls:
		hive_client.execute(sql);
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
	hive_client,hive_conn=init_database("add jar /home/q/hiveUDF/UDFjar.jar","create temporary function iDDecode as 'com.qunar.TeamIDDecode'");

	hive_sql="insert overwrite table dwr.dwr_user_visit_duration_di partition (dt='"+date.replace('-','')+"') select user_id,if(sid='210','www','touch') as plat_form,page_uri,sid,request_start_time,request_end_time, (unix_timestamp(request_end_time)-unix_timestamp(request_start_time)) as request_duration, iDDecode( page_uri) as team_id from  (select user_id,page_uri,sid,access_time as request_start_time,lead(access_time,1) over (partition by user_id order by access_time) as request_end_time from des_bi.channel_tuan_update where dt='"+date.replace('-','')+"' and user_id!='-') a where request_end_time is not null and (sid='210' or (page_uri like 'http://touch.qunar.com/h5/group/_roup_etail?%' and page_uri not like '%location%'))";
	print hive_sql;
	hive_client.execute(hive_sql);
	hive_conn.close();
	

	dbi=DBI(driver='mysql',dbc='db_data_discover_new');
	dbi.set_dbc(db='dwr');
	dbi.connect();
	dbi.execute("delete from dwr_user_visit_duration_di where stat_date="+date.replace('-','')+";");
	dbi.execute("commit;");
	dbi.close();
	
	to_mysql="""sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwr:dwr_user_visit_duration_di --from hive:dwr:dwr_user_visit_duration_di --split '\\001' --cond "select dt,user_id,platform_type,request_uri,sid,request_start_time,request_end_time,request_duration,team_id from dwr.dwr_user_visit_duration_di where dt='"""+date.replace('-','')+"""'" --choose choose""";	
	
	status,message=commands.getstatusoutput(to_mysql);
	print message;
	if status !=0:
		send_email(message,date,to_mysql);
		os._exit(1);
	
if __name__=='__main__':
	date_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday();
	try:
		main(date_dt);
	except Exception,e:
		send_email("dwr_user_visit_duration_di failed",traceback.format_exc(),date_dt);
		os._exit(1);
