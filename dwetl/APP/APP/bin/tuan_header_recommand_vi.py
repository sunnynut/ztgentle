#!/usr/bin/python
#coding=utf-8
import sys,codecs,operator,os,time,json,urllib2;
import smtplib
from email.MIMEText import MIMEText;
reload(sys);
sys.setdefaultencoding('utf-8');
sys.path.append('/home/q/hadoop/hive-default/lib/py');
from hive_service import ThriftHive;
from hive_service.ttypes import HiveServerException;
from thrift import Thrift;
from thrift.transport import TSocket;
from thrift.transport import TTransport;
from thrift.protocol import TBinaryProtocol;
sys.path.append('/home/q/dwetl/lib/py/util');
from Time import Time;
def init_database():
	hive_ip="localhost";
	hive_port="10000";
	hive_t_socket=TSocket.TSocket(hive_ip,hive_port);
	hive_t_socket=TSocket.TBufferedTransport(hive_t_socket);
	hive_protocol=TBinaryProtocol.TBinaryProtocol(hive_t_socket);
	hive_client=ThriftHive.Client(hive_protocol);
	hive_t_socket.open();
	#hive_init_sql="add jar /home/q/mingxiang.yan/git/translatefile/tmp_udf.jar";
	#hive_client.execute(hive_init_sql);
	#hive_init_sql="create temporary function iDDecode as 'com.qunar.it.CityDecode'";
	#hive_client.execute(hive_init_sql);
	return hive_client,hive_t_socket;
def send_email(date,html):
	message=html; 
	message.encode("utf-8");
	msg = MIMEText(message,_subtype='html',_charset="utf-8");
	msg.set_charset('utf-8');
	msg['From'] = 'des-bi@qunar.com';
	msg['To'] ='mingxiang.yan@qunar.com,xingmei.han@qunar.com';
	msg['Subject']='团购首页与去哪儿力荐访问比较';
	s = smtplib.SMTP();
	s.connect('mail.corp.qunar.com');
	s.sendmail(msg['From'], msg['To'].split(","), msg.as_string());
	s.close();


date=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday();
hive_sql="select t1.city_name,t2.pv,t2.uv,t2.cpv,t2.cuv from \
		  (select distinct city_code,city_name from dim.dim_city) t1 \
		  right outer join \
		  (select o1.city,o1.pv as cpv,o1.uv as cuv,o2.pv,o2.uv from \
		   (select city,count(1) as pv,count(distinct user_id) as uv from \
			(select  parse_url(page_uri,'QUERY','bi_city') as city,user_id \
			 from des_bi.log_beacon_base_tuan_session_update where dt='"+date.replace('-','')+"' and sid='210' \
			 and parse_url(page_uri,'QUERY','bi_weizhi')='lijian') a where city!='' group by city) o1 \
		   left outer join \
		   (select city,count(1) as pv,count(distinct user_id) as uv from \
		   (select parse_url(concat('http://a.b.com',regexp_replace(request_uri,'#','')),'QUERY','bi_city') as city,user_id from des_bi.log_beacon_base_tuan_session_update where dt='"+date.replace('-','')+"' and sid='209') b \
		   where city is not null group by city) o2 \
		  on o1.city=o2.city ) t2 \
		  on t1.city_code=t2.city";

print hive_sql;
hive_client,hive_conn=init_database();

hive_client.execute(hive_sql);
results=hive_client.fetchAll();
hive_conn.close();
out_result=[];
for result in results:
	result=result.split('\t');
	result.append("%5.2f %%" % (int(result[-2])*100.0/int(result[1])));
	result.append("%5.2f %%" % (int(result[-2])*100.0/int(result[2])));
	out_result.append(result);
out_result.sort(lambda x,y:cmp(y[6],x[6]));
table_head='''<TABLE width=900 align=center border=1><CAPTION><h3>【团购首页与去哪儿力荐访问比较】</h3></CAPTION><TBODY align=center with="100px"><TR align=center bgColor=#cccccc><TD rowSpan=2>城市</TD><TD colSpan=6>'''+date+'''</TD></TR><TR align=center bgColor=#cccccc><TD>团购首页pv</TD><TD>团购首页uv</TD><TD>去哪儿力荐pv</TD><TD>去哪儿力荐uv</TD><TD>去哪儿力荐pv占比</TD><TD>去哪儿力荐uv占比</TD></TR>''';
table_body=''
for out in out_result:
    table_body+='<TR align=center>'+reduce(lambda x,y:x+'<TD>'+y+'</TD>',out,'');
table_end='</TBODY></TABLE>';
table=table_head+table_body+table_end;
send_email(date,table);
