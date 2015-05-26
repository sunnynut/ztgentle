#!/usr/bin/python
#coding=utf-8
import sys,codecs,operator,os,time,datetime;
import smtplib,traceback;
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
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
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

def close_database(hive_t_socket):
	hive_t_socket.close();
#date=sys.argv[1];
#date=datetime.datetime.now()-datetime.timedelta(days=1);
#date=datetime.datetime.strftime(date,'%Y-%m-%d');
#date=date if len(sys.argv[1])>10 else sys.argv[1];
date=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
#date=time.strftime('%Y-%m-%d',time.localtime(time.time()));
print date
date_no=date.replace('-','');
hive_client,hive_conn=init_database();
hive_init_sql="add jar /home/q/hiveUDF/udfs_des.jar ";
hive_client.execute(hive_init_sql);
hive_init_sql="add jar /home/q/hiveUDF/des.jar";
hive_client.execute(hive_init_sql);
hive_init_sql="add jar /home/q/hiveUDF/UDFjar.jar";
hive_client.execute(hive_init_sql);
hive_init_sql="create temporary function json_decode as 'com.qunar.JsonDecode'";
hive_client.execute(hive_init_sql);
hive_init_sql="create temporary function urlDecode AS 'com.qunar.des.UDFDecoderUrl'";
hive_client.execute(hive_init_sql);
hive_init_sql="create temporary function iDDecode as 'com.qunar.TeamIDDecode'";
hive_client.execute(hive_init_sql);
hive_init_sql="create temporary function team_id_decode as 'com.qunar.des.TeamDecoder'";
hive_client.execute(hive_init_sql);
hive_init_sql="create temporary function team_decode as 'com.qunar.des.TeamIDSDecoder'";
hive_client.execute(hive_init_sql);
hive_init_sql="create temporary function jsonIDdecode as 'com.qunar.DetailJsonId'";
hive_client.execute(hive_init_sql);

hive_list_sql="insert overwrite table dwr.dwr_team_show_detail_di partition (dt='"+date+"')  \
				select * from  \
				(select 'www' as platform,split(id,':')[0] as tid,split(id,':')[1] as sornum from \
				(select team_decode(parse_url(concat('http://a.b.com',req_uri),'QUERY','ids')) as array_id,dt \
				 from stg.beacon_track_log where dt='"+date+"' and parse_url(concat('http://a.b.com',req_uri),'PATH')='/tg_b.html') log \
				lateral view explode(log.array_id) ids as id      \
				union all \
				select 'app' as platform,b.id as tid,cast(b.num+(nvl(private_b['currentPage'],1000)-1)*15 as int) as sornum from des_bi.gp_v3_productlist \
				lateral view explode(json_decode(private_b['prodList'])) a as b \
				where dt='"+date+"' ) un";

hive_app_sql="insert overwrite table dwr.dwr_team_web_traffic_stat_di partition (dt='"+date+"') \
			  select d.team_id,dpv,duv,nvl(bpv,0),nvl(buv,0),'app',0 from \
			  (select team_id,count(1) as dpv,count(distinct global_id) duv from \
			   (select log_array['id'] as team_id,global_id  \
				from des_bi.gp_user_logger where dt='"+date+"' and  \
				(biz_api_label='gp_productdetail' or biz_api_label='gp_v2_groupdetail')) a \
			   group by team_id) d  \
			  left outer join  \
			  (select log_array['tid'] as team_id,count(global_id) as bpv,count(distinct global_id) as buv  \
			   from des_bi.log_app_base_tuan_trade where dt='"+date+"' and biz_api_label='gp_bforder' group by log_array['tid']) b \
			  on d.team_id=b.team_id";
hive_touch_sql="insert into table dwr.dwr_team_web_traffic_stat_di partition (dt='"+date+"') \
				select d.team_id,dpv,duv,nvl(bpv,0),nvl(buv,0),'touch',0 from \
				(select team_id, count(1) as dpv,count (distinct user_id) as duv \
				 from (select if(iDDecode(urlDecode(page_uri))='',regexp_extract(page_uri,'\\\\d+',0),iDDecode(urlDecode(page_uri))) as team_id,user_id  \
					 from des_bi.channel_tuan_update  \
					 where dt='"+date.replace('-','')+"' and page_uri like 'http://touch.qunar.com/h5/group/_roup_etail%' and page_uri not like '%location%' \
					 ) a group by team_id) d  \
				left outer join  \
				(select team_id, count(1) as bpv,count (distinct user_id) as buv  \
				 from (select if(iDDecode(urlDecode(page_uri))='',regexp_extract(page_uri,'\\\\d+',0),iDDecode(urlDecode(page_uri))) as team_id, user_id  \
					 from des_bi.channel_tuan_update  \
					 where dt='"+date.replace('-','')+"' and sid in ('1999','2001') \
					 ) a  group by team_id) b   \
				on d.team_id=b.team_id";
hive_www_sql="insert into table dwr.dwr_team_web_traffic_stat_di partition (dt='"+date+"') \
			  select team_id,sum(if(sid='210',pv,0)) as dpv,sum(if(sid='210',uv,0)) as duv,  \
			  sum(if(sid='212',pv,0)) as bpv,sum(if(sid='212',uv,0)) as buv,'www',0  \
			  from  (select team_id,sid,count(1) as pv,count(distinct user_id) as uv from  \
					  (select if(iDDecode(urlDecode(page_uri))='',regexp_extract(page_uri,'\\\\d+',0),iDDecode(urlDecode(page_uri))) as team_id,user_id,sid from des_bi.channel_tuan_update  \
					   where dt ='"+date.replace('-','')+"' and sid in ('210','212')) a group by team_id,sid) o  \
			  group by team_id";
hive_combine_list_sql="insert overwrite table dwr.dwr_team_web_traffic_stat_di partition (dt='"+date+"') \
					   select nvl(a.team_id,b.team_id),nvl(a.total_pv,0),nvl(a.total_uv,0),nvl(a.book_pv,0),nvl(a.book_uv,0),nvl(a.platform_type,b.platform_type),nvl(b.list_show,0) from \
					   (select * from dwr.dwr_team_web_traffic_stat_di where dt='"+date+"' and team_id is not null) a \
					   full outer join \
					   (select team_id,platform_type,count(1) as list_show from dwr.dwr_team_show_detail_di where dt='"+date+"' group by team_id,platform_type) b \
					   on a.team_id=b.team_id and a.platform_type=b.platform_type";
def hive_sql_execute(hive_client,*hive_sqls):
	for sql in hive_sqls:
		print sql;
		hive_client.execute(sql);

try:
	hive_sql_execute(hive_client,hive_list_sql,hive_app_sql,hive_touch_sql,hive_www_sql,hive_combine_list_sql);
	hive_conn.close();
except Exception as e:
	print traceback.format_exc();
	#send_email("there is error"+traceback.format_exc(),date,hive_dwr_team_web_sql);
	os._exit(1);
