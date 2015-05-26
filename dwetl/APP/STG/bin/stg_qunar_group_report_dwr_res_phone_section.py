#!/usr/bin/python
#coding=utf-8
import sys,codecs,operator,os,commands;
import smtplib
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
	mysql_sql="sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from tuandb3:qunar_group:report.dwr_res_phone_section  --to hive:stg:stg_qunar_group_report_dwr_res_phone_section  --split '\\001' --partition dt="+date;
	print mysql_sql;
	status,message=commands.getstatusoutput(mysql_sql);
	print message;
	if status !=0:
		send_email(message,date,mysql_sql);
		os._exit(1);
if __name__=='__main__':
	date_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday();
	try:
		main(date_dt);
	except Exception,e:
		send_email("stg_qunar_group_report_dwr_res_phone_section failed",str(e),date_dt);
		os._exit(1);
