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
def hive_execute_sql(hive_client,*hive_sqls):
	for sql in hive_sqls:
		print sql;
		hive_client.execute(sql);

def main(date):
	to_hive='''sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from qta_stats:qta_stats:order_index  --to hive:stg:stg_qta_stat_order_index_da  --split "\\001" --overwrite  overwrite --cond "select * from order_index where update_time between '{date} 00:00:00' and '{date} 23:59:59'"  --choose choose'''.format(date=date);
	print to_hive;
	status,message=commands.getstatusoutput(to_hive);
	print message;
	if status !=0:
		send_email(message,date,to_mysql);
		os._exit(1);

	#hive_client,hive_conn=init_database("add jar /home/q/hiveUDF/UDFjar.jar","create temporary function isequal as 'com.qunar.ListEqual'");
	hive_client,hive_conn=init_database();
	
	hive_client.execute("insert overwrite table ods.ods_qta_order_index \
			select b.* from stg.stg_qta_stat_order_index_da a right outer join ods.ods_qta_order_index b \
			on a.order_id=b.order_id where a.order_id is null");
	hive_client.execute("insert into table ods.ods_qta_order_index \
			select a.* from stg.stg_qta_stat_order_index_da a");
if __name__=='__main__':
	date_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday();
	try:
		main(date_dt);
	except Exception,e:
		send_email("stg_qta_stat_order_index_da",traceback.format_exc(),date_dt);
		os._exit(1);
