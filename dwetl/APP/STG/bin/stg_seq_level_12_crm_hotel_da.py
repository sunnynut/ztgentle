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
def init_data(date,*init_cmd):
	for init in init_cmd:
		print init;
		status,message=commands.getstatusoutput(init);
		print message;
		if status !=0:
			send_email(message,date,init_cmd);
			os._exit(1);

def main(date):
	#init_cmd_level='''sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from appcrwl1:tuan_report:seq_level_12 --to hive:stg:stg_tuan_report_seq_level_12_da --split '\\001' --overwrite overwrite --partition dt='''+date;
	init_cmd_hotel='''sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from crm_doctor:crm_doctor:crm_hotel --to hive:stg:stg_crm_crm_hotel_da --split '\\001' --overwrite overwrite --choose choose --partition dt='''+date;
	init_data(date,init_cmd_hotel);
if __name__=='__main__':
	date_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday();
	try:
		main(date_dt);
	except Exception,e:
		send_email("stg_seq_level_12_crm_hotel_da",str(e),date_dt);
		os._exit(1);
