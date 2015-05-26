#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
yes_date=Time.date_sub(data_dt,1)

print data_dt
print yes_date

MD5_PATH='/home/q/desdev/sh_script/daily_report/md5.jar'

SQL1="""
use dwd;
create table if not exists dwd_com_team_ext_his_da(
  ext_info_seq int, 
  team_id int, 
  ctserial string, 
  create_time string, 
  update_time string, 
  redenvelope_enable_flag int, 
  promotion_type int, 
  meituan_ps_ext string, 
  partner_id int, 
  stock_status string, 
  price_strategy_id int, 
  price_strategy string, 
  fast_payback int, 
  camel_coin_strategy string, 
  room_status int, 
  effective_start_date string, 
  effective_end_date string)
PARTITIONED BY ( 
  dt string)
ROW FORMAT SERDE 
  'org.apache.hadoop.hive.serde2.lazy.LazySimpleSerDe' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://qunarcluster/user/desdev/hive/warehouse/dwd/dwd_com_team_ext_his_da'
"""
SQL2="""
use tmp;
create table if not exists tmp1_dwd_com_team_ext_his_da(
ext_info_seq int, 
team_id int, 
ctserial string, 
create_time string, 
update_time string, 
redenvelope_enable_flag int, 
promotion_type int, 
meituan_ps_ext string, 
partner_id int, 
stock_status string, 
price_strategy_id int, 
price_strategy string, 
fast_payback int, 
camel_coin_strategy string, 
room_status int,
effective_start_date string);
"""
SQL3="""
from dwd.dwd_com_team_ext_his_da
insert overwrite table tmp.tmp1_dwd_com_team_ext_his_da
select
ext_info_seq, 
team_id, 
ctserial, 
create_time, 
update_time, 
redenvelope_enable_flag, 
promotion_type, 
meituan_ps_ext, 
partner_id, 
stock_status, 
price_strategy_id, 
price_strategy, 
fast_payback, 
camel_coin_strategy, 
room_status,
effective_start_date
where effective_end_date = '4712-12-31' and dt = '"""+yes_date+"""';
"""
SQL4="""
from dwd.dwd_com_team_ext_his_da
insert overwrite table dwd.dwd_com_team_ext_his_da partition (dt = '"""+data_dt+"""')
select 
ext_info_seq, 
team_id, 
ctserial, 
create_time, 
update_time, 
redenvelope_enable_flag, 
promotion_type, 
meituan_ps_ext, 
partner_id, 
stock_status, 
price_strategy_id, 
price_strategy, 
fast_payback, 
camel_coin_strategy, 
room_status,
effective_start_date,
effective_end_date
where effective_end_date < '4712-12-31' and dt = '"""+yes_date+"""';
"""
SQL5="""
use tmp;
create table if not exists tmp2_dwd_com_team_ext_his_da(
ext_info_seq int, 
team_id int, 
ctserial string, 
create_time string, 
update_time string, 
redenvelope_enable_flag int, 
promotion_type int, 
meituan_ps_ext string, 
partner_id int, 
stock_status string, 
price_strategy_id int, 
price_strategy string, 
fast_payback int, 
camel_coin_strategy string, 
room_status int,
data_type string);
"""
SQL6="""
add jar """+MD5_PATH+""";
create temporary function md5 as "com.qunar.md5.HiveMD5";
insert overwrite table tmp.tmp2_dwd_com_team_ext_his_da
select 
case when t1.id is not null then t1.id else t2.id end as id,
t1.team_id, 
t1.ctserial, 
t1.create_time, 
t1.update_time, 
t1.redenvelope_enable, 
t1.promotion_type, 
t1.meituan_ps_ext, 
t1.partner_id, 
t1.stock_status, 
t1.price_strategy_id, 
t1.price_strategy, 
NULL, 
NULL,
NULL,
case when t1.id is not null and t2.id is null then 'I'
when t1.id is null and t2.id is not null then 'D'
when t1.id is not null and t2.id is not null and md5(
t1.id,
t1.team_id, 
t1.ctserial, 
t1.create_time, 
t1.update_time, 
t1.redenvelope_enable, 
t1.promotion_type, 
t1.meituan_ps_ext, 
t1.partner_id, 
t1.stock_status, 
t1.price_strategy_id, 
t1.price_strategy) = md5(
t2.id,
t2.team_id, 
t2.ctserial, 
t2.create_time, 
t2.update_time, 
t2.redenvelope_enable, 
t2.promotion_type, 
t2.meituan_ps_ext, 
t2.partner_id, 
t2.stock_status, 
t2.price_strategy_id, 
t2.price_strategy) then 'R'
when t1.id is not null and t2.id is not null and md5(
t1.id,
t1.team_id, 
t1.ctserial, 
t1.create_time, 
t1.update_time, 
t1.redenvelope_enable, 
t1.promotion_type, 
t1.meituan_ps_ext, 
t1.partner_id, 
t1.stock_status, 
t1.price_strategy_id, 
t1.price_strategy) != md5(
t2.id,
t2.team_id, 
t2.ctserial, 
t2.create_time, 
t2.update_time, 
t2.redenvelope_enable, 
t2.promotion_type, 
t2.meituan_ps_ext, 
t2.partner_id, 
t2.stock_status, 
t2.price_strategy_id, 
t2.price_strategy) then 'U'
end as data_type
from
(select * from stg.stg_qunar_group_team_ext_da where dt = '"""+data_dt+"""') t1
full outer join
(select * from stg.stg_qunar_group_team_ext_da where dt = '"""+yes_date+"""') t2
on t1.id = t2.id;
"""
SQL7="""
insert into table dwd.dwd_com_team_ext_his_da partition (dt = '"""+data_dt+"""')
select 
ext_info_seq, 
team_id, 
ctserial, 
create_time, 
update_time, 
redenvelope_enable_flag, 
promotion_type, 
meituan_ps_ext, 
partner_id, 
stock_status, 
price_strategy_id, 
price_strategy, 
fast_payback, 
camel_coin_strategy, 
room_status,
'"""+data_dt+"""',
'4712-12-31'
from tmp.tmp2_dwd_com_team_ext_his_da
where data_type in ('U', 'I');
"""
print SQL7
SQL8="""
from tmp.tmp2_dwd_com_team_ext_his_da a join tmp.tmp1_dwd_com_team_ext_his_da b on a.ext_info_seq = b.ext_info_seq
insert into table dwd.dwd_com_team_ext_his_da partition (dt = '"""+data_dt+"""')
select 
b.ext_info_seq, 
b.team_id, 
b.ctserial, 
b.create_time, 
b.update_time, 
b.redenvelope_enable_flag, 
b.promotion_type, 
b.meituan_ps_ext, 
b.partner_id, 
b.stock_status, 
b.price_strategy_id, 
b.price_strategy, 
b.fast_payback, 
b.camel_coin_strategy, 
b.room_status,
b.effective_start_date,
'"""+yes_date+"""'
where data_type = 'U';
"""
SQL9="""
from tmp.tmp2_dwd_com_team_ext_his_da a left outer join tmp.tmp1_dwd_com_team_ext_his_da b on a.ext_info_seq = b.ext_info_seq
insert into table dwd.dwd_com_team_ext_his_da partition (dt = '"""+data_dt+"""')
select 
a.ext_info_seq, 
a.team_id, 
a.ctserial, 
a.create_time, 
a.update_time, 
a.redenvelope_enable_flag, 
a.promotion_type, 
a.meituan_ps_ext, 
a.partner_id, 
a.stock_status, 
a.price_strategy_id, 
a.price_strategy, 
a.fast_payback, 
a.camel_coin_strategy, 
a.room_status,
b.effective_start_date,
'4712-12-31'
where data_type = 'R';
"""

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def main():
    
    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
if __name__ == '__main__':
    main()
