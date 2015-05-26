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

def pg_to_pg_load(date,*load_sqls):
	for load_sql in load_sqls:
		print load_sql;
		status,message=commands.getstatusoutput(load_sql);
		print message;
		if status !=0:
			print load_sql+"is false";
			#send_email(message,date,load_sql);
			#os._exit(1);

def clean_pg(pg_client,*pg_sqls):
	for pg_sql in pg_sqls:
		print pg_sql;
		pg_client.execute_sql(pg_sql);
		pg_client.execute_sql("commit;");

def clean_mysql(pg_client,*pg_sqls):
	for pg_sql in pg_sqls:
		print pg_sql;
		pg_client.execute(pg_sql);
		pg_client.execute("commit;");

def main(date):
	
	dbi=DBI(driver='postgre',dbc='qunar_group_congku2');
	dbi.set_dbc(db='qunar_group');
	dbi.connect();
	hotel_clean="delete from report.five_discount_hotel_his where dt::date='"+date+"';";
	wblist_clean="delete from report.five_discount_wblist_his where dt::date='"+date+"';";
	wblist_history="TRUNCATE report.five_discount_wblist_history;";
	clean_pg(dbi,hotel_clean,wblist_clean,wblist_history);
	dbi.close()
	
	dbi=DBI(driver='mysql',dbc='db_data_discover_new');
	dbi.set_dbc(db='db_sync');
	dbi.connect();
	hotel_clean="delete from five_discount_hotel_his where dt=str_to_date('"+date+"','%Y-%m-%d');";
	wblist_clean="delete from five_discount_wblist_his where dt=str_to_date('"+date+"','%Y-%m-%d');";
	wblist_history="TRUNCATE five_discount_wblist_history;";
	clean_mysql(dbi,hotel_clean,wblist_clean,wblist_history);
	dbi.close()

	five_discount_hotel_pg='''sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to tuandb3:qunar_group:report.five_discount_hotel_his  --from tuandbvip2:qunar_group:public.five_discount_hotel  --split '\\001' --choose choose --cond "select id,seq,create_time,status,'''+"'"+date+"'"+''' from public.five_discount_hotel"''';

	five_discount_wblist_pg='''sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to tuandb3:qunar_group:report.five_discount_wblist_his --from appcrwl1:tuan_report:five_discount_wblist --split '\\001' --choose choose --cond "select *,'''+"'"+date+"'"+''' from five_discount_wblist"''';

	five_discount_wblist_history_pg='''sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to tuandb3:qunar_group:report.five_discount_wblist_history --from appcrwl1:tuan_report:five_discount_wblist_history --split '\\001' --choose choose''';

	five_discount_hotel_mysql='''sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:five_discount_hotel_his  --from tuandbvip2:qunar_group:public.five_discount_hotel  --split '\\001' --choose choose --cond "select id,seq,create_time,status,'''+"'"+date+"'"+''' from public.five_discount_hotel"''';

	five_discount_wblist_mysql='''sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:five_discount_wblist_his --from appcrwl1:tuan_report:five_discount_wblist --split '\\001' --choose choose --cond "select *,'''+"'"+date+"'"+''' from five_discount_wblist"''';

	five_discount_wblist_history_mysql='''sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:five_discount_wblist_history --from appcrwl1:tuan_report:five_discount_wblist_history --split '\\001' --choose choose''';
	pg_to_pg_load(date,five_discount_hotel_pg,five_discount_wblist_pg,five_discount_wblist_history_pg,five_discount_hotel_mysql,five_discount_wblist_mysql,five_discount_wblist_history_mysql);

if __name__=='__main__':
	date_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday();
	try:
		main(date_dt);
	except Exception,e:
		send_email("pg to pg is false",traceback.format_exc(),date_dt);
		os._exit(1);
