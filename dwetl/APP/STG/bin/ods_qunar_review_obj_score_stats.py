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

def date_load(hive_client,date,*tables):
	hive_client.execute("use default");
	for table in tables:
		print table;
		hive_client.execute("alter table {table} drop if exists partition (dt='{date}')".format(table=table,date=date));
		hive_client.execute("alter table {table} add partition (dt='{date}') location '/user/qhstats/ods/{table}/{date}'".format(table=table,date=date));
def clean_pg(pg_client,*pg_sqls):
	for pg_sql in pg_sqls:
		print pg_sql;
		pg_client.execute_sql(pg_sql);
		pg_client.execute_sql("commit;");

def clean_mysql(mysql,date,*tables):
	for table in tables:
		print table;
		rows=[row for row in mysql.fetch("alter table {table} check partition p{date};".format(table=table,date=date))];
		if rows[0][3]=='OK':
			mysql.execute("alter table {table} drop partition p{date}".format(table=table,date=date));
		mysql.execute("alter table {table} add partition (partition p{date} values in ({date}));".format(table=table,date=date));
		mysql.execute("commit;");

def main(date):
	hive_client,hive_conn=init_database();

	date_load(hive_client,date.replace('-',''),"ods_qunar_review_obj_score","ods_qunar_review_obj_stats");

if __name__=='__main__':
	date_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday();
	try:
		main(date_dt);
	except Exception,e:
		send_email("ods_qunar_review_obj_score_stats is false",traceback.format_exc(),date_dt);
		os._exit(1);
