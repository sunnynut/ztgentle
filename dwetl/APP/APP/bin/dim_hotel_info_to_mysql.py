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
	dbi=DBI(driver='mysql',dbc='db_data_discover_new');
	dbi.set_dbc(db='db_sync');
	dbi.connect();
	dbi.execute("truncate dim_hotel_info;");
	dbi.execute("commit;");
	dbi.close();
	to_mysql='''sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from hive:default:dim_hotel_info --to dw03Mysql:db_sync:dim_hotel_info --dir /user/qhstats/dim/dim_hotel_info/dt={date} --split '\\001' --num-mappers 6'''.format(date=date.replace('-',''));
	print to_mysql;
	status,message=commands.getstatusoutput(to_mysql);
	print message;
	if status !=0:
		print "dim_hotel_info to mysql error";
		send_email(message,date,mysql_sql);
		os._exit(1);
		send_email("hive _sql is error"+traceback.format_exc(),date,hive_sql);
	
if __name__=='__main__':
	date_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday();
	try:
		main(date_dt);
	except Exception,e:
		send_email("dim_hotel_info_to_mysql is error"+traceback.format_exc());
