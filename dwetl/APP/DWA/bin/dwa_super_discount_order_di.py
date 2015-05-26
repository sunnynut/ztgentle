#!/usr/bin/python
#coding=utf-8
import sys,codecs,operator,os,commands;
import smtplib,psycopg2,MySQLdb;
from email.MIMEText import MIMEText;
sys.path.append('/home/q/dwetl/lib/py/util');
from Time import Time;
reload(sys);
sys.setdefaultencoding('utf-8');

def main(begin_time):
	conn = psycopg2.connect(host='l-tuandb3.des.cn8.qunar.com', user='des_report',password='1adff040-bdbb-4bc0-b9ea-c810af1a7a77',
			database='qunar_group', port=5432);
	conn.set_isolation_level(psycopg2.extensions.ISOLATION_LEVEL_AUTOCOMMIT);
	cur = conn.cursor();
	get_total="""select dc.city_code,count(1),sum(case when oe.activity_type=32 and oe.rebate_type=1 then 1 else 0 end)
	from public.order o 
	join public.order_ext oe on o.id = oe.oid 
	join public.team t on o.team_id = t.id 
	join report.team_city tc on tc.team_id = t.id 
	join report.seven_dim_city dc on dc.city_code = tc.team_city
	where to_timestamp(o.create_time) BETWEEN to_timestamp('{0}','YYYY-MM-DD HH24:MI:SS') - interval '1 hours' 
	and to_timestamp('{0}','YYYY-MM-DD HH24:MI:SS')
	group by dc.city_code""".format(begin_time+':00:00');
	print get_total;
	cur.execute(get_total);
	results=cur.fetchall();
	cur.close();
	conn.close();
	
	my_conn = MySQLdb.connect(user="db_data_discover",passwd="07XDgXuYyS",host="l-dw03.des.cn8.qunar.com",db="dwa",port=3306);
	cursor = connection.cursor();
	for result in results:
		cursor.execute("insert into dwa_super_discount_order_di value ({0},{1},{2},0,{3},0)");
	cursor.commit();
	combine_sql="""update dwa_super_discount_order_di a,dwa_super_discount_order_di b
	set a.lastweek_create_order_cnt=b.lastweek_create_order_cnt,
	a.lastweek_super_discount_order_cnt=b.lastweek_super_discount_order_cnt
	where a.date_hour=b.date_hour and a.date_hour
	""";
	cursor.execute(combine_sql);
	cursor.commit();
	cursor.close();
	my_conn.close();

if __name__=='__main__':
	begin_time=sys.argv[1]+' '+sys.argv[2];
	main(begin_time)
