#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
data_datetime=data_dt + " 00:00:00"

yes_date=Time.date_sub(data_dt,1)
del_date=Time.date_sub(data_dt,4)

print data_dt
print data_datetime
print yes_date
print del_date

MD5_PATH='/home/q/desdev/sh_script/daily_report/md5.jar'

SQL1="""
insert overwrite table tmp.dim_team_his_da partition (dt = '""" + data_dt + """')
select 
a.team_id,
a.title,
a.sub_title,
a.group_id,
a.partner_id,
a.team_price,
a.market_price,
a.cost_price,
a.red_envelope,
a.team_type,
a.room_type,
a.sales,
a.baojian_total,
a.parent_team_id,
a.new_type,
a.source_type,
a.expire_time,
a.begin_time,
a.end_time,
a.create_time,
a.delivery,
a.publish_flag,
a.settlement_id,
a.settlement_days,
a.settlement_type,
a.purchase_option,
a.price_type,
b.is_online,
case when c.id is null or c.hotel_seq is null or c.hotel_seq = '' then 'unknown' else c.hotel_seq end,
case when c.id is null or c.hotel_name is null or c.hotel_name = '' then '未知' else c.hotel_name end,
case when d.id is null or d.hotel_city is null or d.hotel_city = '' then 'unknown' else d.hotel_city end,
case when d.id is null or d.hotel_city is null or d.hotel_city = '' then '未知' else e.city_name end,
f.dept_code,
CASE
WHEN g.team_id is not null and g.stay_type = '1' THEN 'Y'
WHEN g.team_id is null and h.team_id is not null THEN 'Y'
ELSE 'N' 
END
from
(
select 
team_id,
title,
sub_title,
group_id,
partner_id,
team_price,
market_price,
cost_price,
red_envelope,
team_type,
room_type,
sales,
baojian_total,
parent_team_id,
new_type,
source_type,
from_unixtime(cast(expire_time as bigint), 'yyyy-MM-dd HH:mm:dd') as expire_time,
from_unixtime(cast(begin_time as bigint), 'yyyy-MM-dd HH:mm:dd') as begin_time,
from_unixtime(cast(end_time as bigint), 'yyyy-MM-dd HH:mm:dd') as end_time,
create_time,
delivery,
publish_flag,
settlement_id,
settlement_days,
settlement_type,
purchase_option,
price_type
from dwd.dwd_com_team_his_da
where 
dt = '""" + data_dt + """'
and 
'""" + data_dt + """' between effective_start_date and effective_end_date
and group_id in ('2','4')
and new_type not in ('holiday_tts','flight_tts','flight','package')
) a 
left outer join 
(select distinct id, is_online from des_bi.hotel_product_tuan_history where dt = '""" + data_dt + """') b
on a.team_id = b.id
left outer join
(
select id, 'multi' as hotel_seq, '多酒店' as hotel_name from (select distinct id, hotel_seq, hotel_title from des_bi.hotel_product_tuan_history where dt = '""" + data_dt + """') a group by id having count(1) > 1
union all
select id, max(hotel_seq) as hotel_seq, max(hotel_title) as hotel_name from (select distinct id, hotel_seq, hotel_title from des_bi.hotel_product_tuan_history where dt = '""" + data_dt + """') b group by id having count(1) = 1
) c
on a.team_id = c.id
left outer join
(
select id, 'multi' as hotel_city from (select distinct id, hotel_city from des_bi.hotel_product_tuan_history where dt = '""" + data_dt + """')  a group by id having count(1) > 1
union all
select id, max(hotel_city) as hotel_city from (select distinct id, hotel_city from des_bi.hotel_product_tuan_history where dt = '""" + data_dt + """') b group by id having count(1) = 1
) d
on a.team_id = d.id
left outer join
(select city_code,city_name from dim.dim_city where dt = '""" + data_dt + """') e
on d.hotel_city = e.city_code
left outer join
(select team_id,dept_code from dwd.dwd_com_team_dept_rel_da where dt = '""" + data_dt + """') f
on a.team_id = f.team_id
left outer join
(
select distinct t.team_id,ht.stay_type from (select * from stg.stg_qunar_group_hotel_tuan_da where dt = '""" + data_dt + """') ht
right outer join (select * from stg.stg_qunar_group_tuan_da where dt = '""" + data_dt + """') t on ht.tuan_id = t.id
where t.publish = 'Y' and t.project_start_time <= '""" + data_dt + """' and t.project_end_time >= '""" + data_dt + """' and
t.qvalid_end_date >= '""" + data_dt + """' and t.tuan_type = 'HOTEL'
) g
on a.team_id = g.team_id
left outer join
(
select distinct t.id as team_id from (select * from stg.stg_qunar_group_team_da where dt = '""" + data_dt + """') t 
left outer join (select * from stg.stg_qunar_group_team_tags_assistant_da where dt = '""" + data_dt + """') b on t.id = b.team_id
where publish='Y' and t.begin_time < unix_timestamp('""" + data_datetime + """') and t.end_time >= unix_timestamp('""" + data_datetime + """')
and b.tag = '小时房' and t.expire_time >= unix_timestamp('""" + data_datetime + """')
) h
on a.team_id = h.team_id;
"""

SQL2="""
use tmp;
CREATE  TABLE if not exists tmp.tmp1_dim_team_his_da(
  team_id string,
  title string, 
  sub_title string, 
  group_id bigint, 
  partner_id bigint, 
  team_price string, 
  market_price string, 
  cost_price string, 
  red_envelope bigint, 
  team_type string, 
  room_type string, 
  sales string, 
  baojian_total int, 
  parent_team_id bigint, 
  new_type string, 
  source_type int, 
  expire_time string, 
  begin_time string, 
  end_time string, 
  create_time string, 
  delivery string, 
  publish_flag string, 
  settlement_id bigint, 
  settlement_days bigint, 
  settlement_type string, 
  purchase_option string, 
  price_type string, 
  is_online_flag string, 
  hotel_seq string, 
  hotel_name string, 
  hotel_city string, 
  hotel_city_name string, 
  dept_code string, 
  hour_room_flag string, 
  effective_start_date string)
ROW FORMAT SERDE
  'org.apache.hadoop.hive.serde2.lazy.LazySimpleSerDe'
STORED AS INPUTFORMAT
  'org.apache.hadoop.mapred.TextInputFormat'
OUTPUTFORMAT
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://qunarcluster/user/desdev/hive/warehouse/tmp/tmp1_dim_team_his_da';
"""

SQL3="""
from dim.dim_team_his_da
insert overwrite table tmp.tmp1_dim_team_his_da
select 
team_id,
title, 
sub_title, 
group_id, 
partner_id, 
team_price, 
market_price, 
cost_price, 
red_envelope, 
team_type, 
room_type, 
sales, 
baojian_total, 
parent_team_id, 
new_type, 
source_type, 
expire_time, 
begin_time, 
end_time, 
create_time, 
delivery, 
publish_flag, 
settlement_id, 
settlement_days, 
settlement_type, 
purchase_option, 
price_type, 
is_online_flag, 
hotel_seq, 
hotel_name, 
hotel_city, 
hotel_city_name, 
dept_code, 
hour_room_flag, 
effective_start_date
where effective_end_date = '4712-12-31' and dt = '"""+yes_date+"""';
"""

SQL4="""
from dim.dim_team_his_da
insert overwrite table dim.dim_team_his_da partition (dt = '"""+data_dt+"""')
select
team_id, 
title, 
sub_title, 
group_id, 
partner_id, 
team_price, 
market_price, 
cost_price, 
red_envelope, 
team_type, 
room_type, 
sales, 
baojian_total, 
parent_team_id, 
new_type, 
source_type, 
expire_time, 
begin_time, 
end_time, 
create_time, 
delivery, 
publish_flag, 
settlement_id, 
settlement_days, 
settlement_type, 
purchase_option, 
price_type, 
is_online_flag, 
hotel_seq, 
hotel_name, 
hotel_city, 
hotel_city_name, 
dept_code, 
hour_room_flag, 
effective_start_date, 
effective_end_date
where effective_end_date < '4712-12-31' and dt = '"""+yes_date+"""';
"""

SQL5="""
use tmp;
create table if not exists tmp2_dim_team_his_da(
  team_id bigint, 
  title string, 
  sub_title string, 
  group_id bigint, 
  partner_id bigint, 
  team_price string, 
  market_price string, 
  cost_price string, 
  red_envelope bigint, 
  team_type string, 
  room_type string, 
  sales string, 
  baojian_total int, 
  parent_team_id bigint, 
  new_type string, 
  source_type int, 
  expire_time string, 
  begin_time string, 
  end_time string, 
  create_time string, 
  delivery string, 
  publish_flag string, 
  settlement_id bigint, 
  settlement_days bigint, 
  settlement_type string, 
  purchase_option string, 
  price_type string, 
  is_online_flag string, 
  hotel_seq string, 
  hotel_name string, 
  hotel_city string, 
  hotel_city_name string, 
  dept_code string, 
  hour_room_flag string, 
  data_type string)
ROW FORMAT SERDE 
  'org.apache.hadoop.hive.serde2.lazy.LazySimpleSerDe' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://qunarcluster/user/desdev/hive/warehouse/tmp/tmp2_dim_team_his_da';
"""

SQL6="""
add jar """+MD5_PATH+""";
create temporary function md5 as "com.qunar.md5.HiveMD5";
insert overwrite table tmp.tmp2_dim_team_his_da
select
case when t1.team_id is not null then t1.team_id else t2.team_id end as team_id,
t1.title,
t1.sub_title,
t1.group_id,
t1.partner_id,
t1.team_price,
t1.market_price,
t1.cost_price,
t1.red_envelope,
t1.team_type,
t1.room_type,
t1.sales,
t1.baojian_total,
t1.parent_team_id,
t1.new_type,
t1.source_type,
t1.expire_time,
t1.begin_time,
t1.end_time,
t1.create_time,
t1.delivery,
t1.publish_flag,
t1.settlement_id,
t1.settlement_days,
t1.settlement_type,
t1.purchase_option,
t1.price_type,
t1.is_online_flag,
t1.hotel_seq,
t1.hotel_name,
t1.hotel_city,
t1.hotel_city_name,
t1.dept_code,
t1.hour_room_flag,
case when t1.team_id is not null and t2.team_id is null then 'I'
when t1.team_id is null and t2.team_id is not null then 'D'
when t1.team_id is not null and t2.team_id is not null and md5(
t1.team_id,
t1.title,
t1.sub_title,
t1.group_id,
t1.partner_id,
t1.team_price,
t1.market_price,
t1.cost_price,
t1.red_envelope,
t1.team_type,
t1.room_type,
t1.sales,
t1.baojian_total,
t1.parent_team_id,
t1.new_type,
t1.source_type,
t1.expire_time,
t1.begin_time,
t1.end_time,
t1.create_time,
t1.delivery,
t1.publish_flag,
t1.settlement_id,
t1.settlement_days,
t1.settlement_type,
t1.purchase_option,
t1.price_type,
t1.is_online_flag,
t1.hotel_seq,
t1.hotel_name,
t1.hotel_city,
t1.hotel_city_name,
t1.dept_code,
t1.hour_room_flag) = md5(
t2.team_id,
t2.title,
t2.sub_title,
t2.group_id,
t2.partner_id,
t2.team_price,
t2.market_price,
t2.cost_price,
t2.red_envelope,
t2.team_type,
t2.room_type,
t2.sales,
t2.baojian_total,
t2.parent_team_id,
t2.new_type,
t2.source_type,
t2.expire_time,
t2.begin_time,
t2.end_time,
t2.create_time,
t2.delivery,
t2.publish_flag,
t2.settlement_id,
t2.settlement_days,
t2.settlement_type,
t2.purchase_option,
t2.price_type,
t2.is_online_flag,
t2.hotel_seq,
t2.hotel_name,
t2.hotel_city,
t2.hotel_city_name,
t2.dept_code,
t2.hour_room_flag) then 'R'
when t1.team_id is not null and t2.team_id is not null and md5(
t1.team_id,
t1.title,
t1.sub_title,
t1.group_id,
t1.partner_id,
t1.team_price,
t1.market_price,
t1.cost_price,
t1.red_envelope,
t1.team_type,
t1.room_type,
t1.sales,
t1.baojian_total,
t1.parent_team_id,
t1.new_type,
t1.source_type,
t1.expire_time,
t1.begin_time,
t1.end_time,
t1.create_time,
t1.delivery,
t1.publish_flag,
t1.settlement_id,
t1.settlement_days,
t1.settlement_type,
t1.purchase_option,
t1.price_type,
t1.is_online_flag,
t1.hotel_seq,
t1.hotel_name,
t1.hotel_city,
t1.hotel_city_name,
t1.dept_code,
t1.hour_room_flag) != md5(
t2.team_id,
t2.title,
t2.sub_title,
t2.group_id,
t2.partner_id,
t2.team_price,
t2.market_price,
t2.cost_price,
t2.red_envelope,
t2.team_type,
t2.room_type,
t2.sales,
t2.baojian_total,
t2.parent_team_id,
t2.new_type,
t2.source_type,
t2.expire_time,
t2.begin_time,
t2.end_time,
t2.create_time,
t2.delivery,
t2.publish_flag,
t2.settlement_id,
t2.settlement_days,
t2.settlement_type,
t2.purchase_option,
t2.price_type,
t2.is_online_flag,
t2.hotel_seq,
t2.hotel_name,
t2.hotel_city,
t2.hotel_city_name,
t2.dept_code,
t2.hour_room_flag) then 'U' 
end as data_type
from
(select * from tmp.dim_team_his_da where dt = '"""+data_dt+"""') t1
full outer join
(select * from tmp.dim_team_his_da where dt = '"""+yes_date+"""') t2
on t1.team_id = t2.team_id;
"""

SQL7="""
use dim;
insert into table dim.dim_team_his_da partition (dt = '"""+data_dt+"""')
select
team_id,
title,
sub_title,
group_id,
partner_id,
team_price,
market_price,
cost_price,
red_envelope,
team_type,
room_type,
sales,
baojian_total,
parent_team_id,
new_type,
source_type,
expire_time,
begin_time,
end_time,
create_time,
delivery,
publish_flag,
settlement_id,
settlement_days,
settlement_type,
purchase_option,
price_type,
is_online_flag,
hotel_seq,
hotel_name,
hotel_city,
hotel_city_name,
dept_code,
hour_room_flag,
'"""+data_dt+"""',
'4712-12-31'
from tmp.tmp2_dim_team_his_da
where data_type in ('U', 'I');
"""

SQL8="""
from tmp.tmp2_dim_team_his_da a join tmp.tmp1_dim_team_his_da b on a.team_id = b.team_id
insert into table dim.dim_team_his_da partition (dt = '"""+data_dt+"""')
select
b.team_id,
b.title,
b.sub_title,
b.group_id,
b.partner_id,
b.team_price,
b.market_price,
b.cost_price,
b.red_envelope,
b.team_type,
b.room_type,
b.sales,
b.baojian_total,
b.parent_team_id,
b.new_type,
b.source_type,
b.expire_time,
b.begin_time,
b.end_time,
b.create_time,
b.delivery,
b.publish_flag,
b.settlement_id,
b.settlement_days,
b.settlement_type,
b.purchase_option,
b.price_type,
b.is_online_flag,
b.hotel_seq,
b.hotel_name,
b.hotel_city,
b.hotel_city_name,
b.dept_code,
b.hour_room_flag,
b.effective_start_date,
'"""+yes_date+"""'
where data_type = 'U';
"""

SQL9="""
from tmp.tmp2_dim_team_his_da a left outer join tmp.tmp1_dim_team_his_da b on a.team_id = b.team_id
insert into table dim.dim_team_his_da partition (dt = '"""+data_dt+"""')
select
a.team_id,
a.title,
a.sub_title,
a.group_id,
a.partner_id,
a.team_price,
a.market_price,
a.cost_price,
a.red_envelope,
a.team_type,
a.room_type,
a.sales,
a.baojian_total,
a.parent_team_id,
a.new_type,
a.source_type,
a.expire_time,
a.begin_time,
a.end_time,
a.create_time,
a.delivery,
a.publish_flag,
a.settlement_id,
a.settlement_days,
a.settlement_type,
a.purchase_option,
a.price_type,
a.is_online_flag,
a.hotel_seq,
a.hotel_name,
a.hotel_city,
a.hotel_city_name,
a.dept_code,
a.hour_room_flag,
b.effective_start_date,
'4712-12-31'
where data_type = 'R';
"""

#SQL10="""
#use dim;
#alter table dim_team_his_da drop if exists partition (dt = '"""+del_date+"""');
#"""

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():

    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_dim_team_his.py"""
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dim:dim_team_his --from hive:dim:dim_team_his_da  --split '\\001'  --choose choose --cond "select team_id,title,sub_title,group_id,partner_id,team_price,market_price,cost_price,red_envelope,team_type,room_type,sales,baojian_total,parent_team_id,new_type,source_type,expire_time,begin_time,end_time,create_time,delivery,publish_flag,settlement_id,settlement_days,settlement_type,purchase_option,price_type,is_online_flag,hotel_seq,hotel_name,hotel_city,hotel_city_name,dept_code,hour_room_flag,effective_start_date,effective_end_date from dim.dim_team_his_da where dt = '""" + data_dt + """'\"""" 
    os.system(SH_CMD2)

def load_data_to_pg():

    SH_CMD1  = """python /home/q/desdev/sh_script/daily_report/delete_dim_team_his_pg.py"""
    os.system(SH_CMD1)

    SH_CMD2 = """ python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to tuandb3:qunar_group:public.dim_team_his --from dw03Mysql:dim:dim_team_his  --split '\\001'  --choose choose --cond "select team_id,title,sub_title,group_id,partner_id,team_price,market_price,cost_price,red_envelope,team_type,room_type,sales,baojian_total,parent_team_id,new_type,source_type,expire_time,begin_time,end_time,create_time,delivery,publish_flag,settlement_id,settlement_days,settlement_type,purchase_option,price_type,is_online_flag,hotel_seq,hotel_name,hotel_city,hotel_city_name,dept_code,hour_room_flag,effective_start_date,effective_end_date from dim.dim_team_his\""""
    os.system(SH_CMD2)

def main():
    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
    load_data_to_mysql()
    load_data_to_pg()
if __name__ == '__main__':
    main()
