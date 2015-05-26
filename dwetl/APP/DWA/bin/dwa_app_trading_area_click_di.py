#!/usr/bin/python
#coding=utf-8
import sys,codecs,operator,os,commands;
import smtplib
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
	hive_client,hive_conn=init_database();
	hive_sql="insert overwrite table dwa.dwa_app_trading_area_click_di partition (dt='"+date+"') \
			  select b.city,a.city_code,b.tradArea,b.smtotal,b.dftotal from \
			  (select distinct city_code,city_name from dim.dim_city) a \
			  right outer join  \
			  (select city,tradArea,sum(sm) as smtotal,sum(df) as dftotal from \
			   (select log_array['city'] as city,parse_url(concat('http://facebook.com/path/p1.php?',regexp_replace(log_array['moreFilter'],'\\\\|','&')),'QUERY','tradArea') as tradArea, \
				if (log_array['city']=log_array['locationCity'],1,0) as sm,if (log_array['city']=log_array['locationCity'],0,1) as df \
				from des_bi.gp_user_logger  where dt='"+date+"' and log_array['moreFilter'] like '%tradArea%' ) a \
			   group by city,tradArea) b \
			  on a.city_name=b.city";
	print hive_sql;

	hive_client.execute(hive_sql);
	hive_conn.close();
if __name__=='__main__':
	date_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday();
	try:
		main(date_dt);
	except Exception,e:
		send_email("dwa_app_trading_area_click_di",str(e),date_dt);
		os._exit(1);
