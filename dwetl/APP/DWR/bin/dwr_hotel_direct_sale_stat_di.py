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

	hive_client,hive_conn=init_database("set hive.exec.dynamic.partition.mode=nonstrict");
	hotel_detail_sql="insert overwrite table dwr.dwr_hotel_direct_sale_stat_di partition (dt='{date}') \
					  select hotel_seq,traffic_channel, \
					  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0, \
					  count(1) as pv,count(distinct cookie_id) as uv,\
					  0,0,0,0  \
					  from default.dw_detail_info_v2 where dt='{date_no}'  \
					  group by hotel_seq,traffic_channel".format(date_no=date.replace('-',''),date=date);


	hotel_ordercreate_sql="insert into table dwr.dwr_hotel_direct_sale_stat_di partition (dt) \
							  select nvl(o2.hotel_seq,o1.hotel_seq),nvl(o2.channel,o1.channel), \
							  nvl(x_t,0),nvl(x_j,0),0,0,0, \
							  nvl(y_t,0),nvl(y_j,0),0,0,0, \
							  nvl(yx_t,0),nvl(yx_j,0),0,0,0, \
							  nvl(yy_t,0),nvl(yy_j,0),0,0,0, \
							  nvl(detail_pv,0),nvl(detail_uv,0),nvl(qta_cash_book_pv,0),nvl(qta_prepay_book_pv,0),nvl(lm_cash_book_pv,0),nvl(lm_prepay_book_pv,0),nvl(o1.dt,o2.order_date) from  \
							  (select * from dwr.dwr_hotel_direct_sale_stat_di where dt between 'date_sub({date},30)' and '{date}' ) o1 \
							  full outer join \
							  (select hotel_seq,channel, \
							   sum(if (((data_source='qta' and business_type='direct') or data_source in ('hms_commission','hms_ppb')) and pay_type='CASH',1,0)) as x_t, \
							   sum(if (((data_source='qta' and business_type='direct') or data_source in ('hms_commission','hms_ppb')) and pay_type='CASH',room_night,0)) as x_j, \
							   sum(if (((data_source='qta' and business_type='direct') or data_source in ('hms_commission','hms_ppb')) and pay_type='PROXY',1,0)) as y_t, \
							   sum(if (((data_source='qta' and business_type='direct') or data_source in ('hms_commission','hms_ppb')) and pay_type='PROXY',room_night,0)) as y_j, \
							   sum(if(business_sub_type='NIGHT_SELL' and data_source!='ota' and pay_type='CASH',1,0)) as yx_t, \
							   sum(if(business_sub_type='NIGHT_SELL' and data_source!='ota' and pay_type='CASH',room_night,0)) as yx_j, \
							   sum(if(business_sub_type='NIGHT_SELL' and data_source!='ota' and pay_type='PROXY',1,0)) as yy_t, \
							   sum(if(business_sub_type='NIGHT_SELL' and data_source!='ota' and pay_type='PROXY',room_night,0)) as yy_j,order_date \
							   from \
							   (select *,if(is_wap=1,'无线','网站') as channel from default.dw_order_info_v21 where dt='{date_no}' and order_date between date_sub('{date}',30) and '{date}' and  \
								((data_source='qta' and business_type='direct') or data_source in ('hms_commission','hms_ppb','nightsell') or \
								 business_sub_type='NIGHT_SELL')) o2 \
							   group by hotel_seq,channel,order_date) o2 \
							  on o1.hotel_seq=o2.hotel_seq and o1.channel=o2.channel and o1.dt=o2.order_date".format(date=date,date_no.replace('-',''));

	hive_check_sql="insert into table dwr.dwr_hotel_direct_sale_stat_di partition (dt) \
					select nvl(o2.hotel_seq,o1.hotel_seq),nvl(o2.channel,o1.channel), \
					nvl(cash_total_order,0),nvl(cash_total_room_night,0),nvl(x_o,0),nvl(x_oj,0),nvl(x_r,0), \
					nvl(prepay_total_order,0),nvl(prepay_total_room_night,0),nvl(y_o,0),nvl(y_oj,0),nvl(y_r,0), \
					nvl(lm_cash_total_order,0),nvl(lm_cash_total_room_night,0),nvl(yx_o,0),nvl(yx_oj,0),nvl(yx_r,0), \
					nvl(lm_prepay_total_order,0),nvl(lm_prepay_total_room_night,0),nvl(yy_o,0),nvl(yy_oj,0),nvl(yy_r,0), \
					nvl(detail_pv,0),nvl(detail_uv,0),nvl(qta_cash_book_pv,0),nvl(qta_prepay_book_pv,0),nvl(lm_cash_book_pv,0),nvl(lm_prepay_book_pv,0),nvl(o1.dt,o2.checkout_date) from  \
					(select * from dwr.dwr_hotel_direct_sale_stat_di where dt between date_sub('{date}',30) and '{date}') o1 \
					full outer join \
					(select hotel_seq,channel, \
					 sum(if (((data_source='qta' and business_type='direct') or data_source in ('hms_commission','hms_ppb')) and pay_type='CASH' and order_status='CHECKED_OUT',1,0)) as x_o, \
					 sum(if (((data_source='qta' and business_type='direct') or data_source in ('hms_commission','hms_ppb')) and pay_type='CASH' and order_status='CHECKED_OUT',room_night,0)) as x_oj, \
					 sum(if (((data_source='qta' and business_type='direct') or data_source in ('hms_commission','hms_ppb')) and pay_type='CASH' and order_status='REJECTED',1,0)) as x_r,  \
					 sum(if (((data_source='qta' and business_type='direct') or data_source in ('hms_commission','hms_ppb')) and pay_type='PROXY' and order_status='CHECKED_OUT',1,0)) as y_o, \
					 sum(if (((data_source='qta' and business_type='direct') or data_source in ('hms_commission','hms_ppb')) and pay_type='PROXY' and order_status='CHECKED_OUT',room_night,0)) as y_oj, \
					 sum(if (((data_source='qta' and business_type='direct') or data_source in ('hms_commission','hms_ppb')) and pay_type='PROXY' and order_status='REJECTED',1,0)) as y_r, \
					 sum(if(business_sub_type='NIGHT_SELL' and data_source!='ota' and pay_type='CASH' and order_status='CHECKED_OUT',1,0)) as yx_o, \
					 sum(if(business_sub_type='NIGHT_SELL' and data_source!='ota' and pay_type='CASH' and order_status='CHECKED_OUT',room_night,0)) as yx_oj, \
					 sum(if(business_sub_type='NIGHT_SELL' and data_source!='ota' and pay_type='CASH' and order_status='REJECTED',1,0)) as yx_r, \
					 sum(if(business_sub_type='NIGHT_SELL' and data_source!='ota' and pay_type='PROXY' and order_status='CHECKED_OUT',1,0)) as yy_o, \
					 sum(if(business_sub_type='NIGHT_SELL' and data_source!='ota' and pay_type='PROXY' and order_status='CHECKED_OUT',room_night,0)) as yy_oj, \
					 sum(if(business_sub_type='NIGHT_SELL' and data_source!='ota' and pay_type='PROXY' and order_status='REJECTED',1,0)) as yy_r, \
					 checkout_date \
					 from \
					 (select *,if(is_wap=1,'无线','网站') as channel from default.dw_order_info_v21 where dt='{date_no}' and  \
					  checkout_date between date_sub('{date}',30) and '{date}' and  \
					  ((data_source='qta' and business_type='direct') or data_source in ('hms_commission','hms_ppb','nightsell') or  \
					   business_sub_type='NIGHT_SELL')) o2  \
					 group by hotel_seq,channel,checkout_date) o2 \
					on o1.hotel_seq=o2.hotel_seq and o1.channel=o2.channel and o1.dt=o2.checkout_date".format(date=date,date_no=date.replace('-',''));
	hive_execute_sql(hive_client,hotel_detail_sql,hotel_booking_sql,hotel_orderAndjianye_sql);
	hive_conn.close();
	
	'''
	dbi=DBI(driver='mysql',dbc='db_data_discover_new');
	dbi.set_dbc(db='dwr');
	dbi.connect();
	dbi.execute("delete from dwr_hotel_direct_sale_stat_di where stat_date="+date.replace('-','')+";");
	dbi.execute("commit;");
	dbi.close();
	
	to_mysql="""sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwr:dwr_hotel_direct_sale_stat_di --from hive:dwr:dwr_hotel_direct_sale_stat_di --split '\\001' --cond "select * from dwr.dwr_hotel_direct_sale_stat_di where dt='{date}' --choose choose""";	
	
	status,message=commands.getstatusoutput(to_mysql);
	print message;
	if status !=0:
		send_email(message,date,to_mysql);
		os._exit(1);
	'''
if __name__=='__main__':
	date_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday();
	try:
		main(date_dt);
	except Exception,e:
		send_email("dwr_hotel_all_stat_di",traceback.format_exc(),date_dt);
		os._exit(1);
