#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
from DBI import DBI
import time
import datetime
path=os.getcwd()
file = path +"/dwr_qunar_group_scan_qr_code_team_di.txt"
table='dwr.dwr_qunar_group_scan_qr_code_team_di'
hive_home='/home/q/hadoop/hive-default/'
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
pre1day=Time.date_add(data_dt,-1)
pre30day=Time.date_add(data_dt,-30)
year=int(data_dt[0:4])
print year
month=int(data_dt[5:7])
print month
day=int(data_dt[8:10])
print day
week_day=datetime.datetime(year,month,day).strftime("%w")
print week_day
if week_day == '1':
    avg_price_dt='2014-09-01'
elif week_day == '2':
    avg_price_dt='2014-09-02'
elif week_day == '3':
    avg_price_dt='2014-09-03'
elif week_day == '4':
    avg_price_dt='2014-09-04'
elif week_day == '5':
    avg_price_dt='2014-09-05'
elif week_day == '6':
    avg_price_dt='2014-09-06'
else:
    avg_price_dt='2014-09-07'                   
today=Time.date_add(data_dt,1)

#SQL1="""
#use tmp;
#create table if not exists tmp1_qunar_group_scan_qr_code_team_da (
#team_id int,
#avg_price decimal
#)
#partitioned by (dt string)
#ROW FORMAT DELIMITED FIELDS TERMINATED BY '\\t' 
#STORED AS INPUTFORMAT 'org.apache.hadoop.mapred.TextInputFormat' 
#OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
#location 'hdfs://qunarcluster/user/desdev/hive/warehouse/tmp/tmp1_qunar_group_scan_qr_code_team_da';
#"""
#SQL2="""
#use tmp;
#INSERT OVERWRITE TABLE tmp1_qunar_group_scan_qr_code_team_da PARTITION (dt='2014-09-01')
#select 
#    id,
#    avg(sale_price) as avg_price
#from des_bi.team_online 
#where dt in('20140901','20140908','20140915')
#group by id;
#"""
#SQL3="""
#use tmp;
#INSERT OVERWRITE TABLE tmp1_qunar_group_scan_qr_code_team_da PARTITION (dt='2014-09-02')
#select 
#    id,
#    avg(sale_price) as avg_price
#from des_bi.team_online 
#where dt in('20140902','20140909','20140916')
#group by id;
#"""
#SQL4="""
#use tmp;
#INSERT OVERWRITE TABLE tmp1_qunar_group_scan_qr_code_team_da PARTITION (dt='2014-09-03')
#select 
#    id,
#    avg(sale_price) as avg_price
#from des_bi.team_online 
#where dt in('20140903','20140910','20140917')
#group by id;
#"""
#SQL5="""
#use tmp;
#INSERT OVERWRITE TABLE tmp1_qunar_group_scan_qr_code_team_da PARTITION (dt='2014-09-04')
#select 
#    id,
#    avg(sale_price) as avg_price
#from des_bi.team_online 
#where dt in('20140904','20140911','20140918')
#group by id;
#"""
#SQL6="""
#use tmp;
#INSERT OVERWRITE TABLE tmp1_qunar_group_scan_qr_code_team_da PARTITION (dt='2014-09-05')
#select 
#    id,
#    avg(sale_price) as avg_price
#from des_bi.team_online 
#where dt in('20140905','20140912','20140919')
#group by id;
#"""
#SQL7="""
#use tmp;
#INSERT OVERWRITE TABLE tmp1_qunar_group_scan_qr_code_team_da PARTITION (dt='2014-09-06')
#select 
#    id,
#    avg(sale_price) as avg_price
#from des_bi.team_online 
#where dt in('20140906','20140913','20140920')
#group by id;
#"""
#SQL8="""
#use tmp;
#INSERT OVERWRITE TABLE tmp1_qunar_group_scan_qr_code_team_da PARTITION (dt='2014-09-07')
#select 
#    id,
#    avg(sale_price) as avg_price
#from des_bi.team_online 
#where dt in('20140907','20140914','20140921')
#group by id;
#""" 
#SQL9="""
#use tmp;
#create table if not exists tmp2_qunar_group_scan_qr_code_team_da (
#team_id int,
#avg_room_night decimal
#)
#partitioned by (dt string)
#ROW FORMAT DELIMITED FIELDS TERMINATED BY '\\t' 
#STORED AS INPUTFORMAT 'org.apache.hadoop.mapred.TextInputFormat' 
#OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
#location 'hdfs://qunarcluster/user/desdev/hive/warehouse/tmp/tmp2_qunar_group_scan_qr_code_team_da';
#"""
#SQL10="""
#use tmp;
#INSERT OVERWRITE TABLE tmp2_qunar_group_scan_qr_code_team_da PARTITION (dt='2014-09-01')
#select 
#    team_id,
#    avg(total_room_night) as avg_room_night
#from stg.stg_qunar_group_team_room_night_da 
#where dt in('2014-09-01','2014-09-08','2014-09-15')
#group by team_id;
#"""
#SQL11="""
#use tmp;
#INSERT OVERWRITE TABLE tmp2_qunar_group_scan_qr_code_team_da PARTITION (dt='2014-09-02')
#select 
#    team_id,
#    avg(total_room_night) as avg_room_night
#from stg.stg_qunar_group_team_room_night_da 
#where dt in('2014-09-02','2014-09-09','2014-09-16')
#group by team_id;
#"""
#SQL12="""
#use tmp;
#INSERT OVERWRITE TABLE tmp2_qunar_group_scan_qr_code_team_da PARTITION (dt='2014-09-03')
#select 
#    team_id,
#    avg(total_room_night) as avg_room_night
#from stg.stg_qunar_group_team_room_night_da 
#where dt in('2014-09-03','2014-09-10','2014-09-17')
#group by team_id;
#"""
#SQL13="""
#use tmp;
#INSERT OVERWRITE TABLE tmp2_qunar_group_scan_qr_code_team_da PARTITION (dt='2014-09-04')
#select 
#    team_id,
#    avg(total_room_night) as avg_room_night
#from stg.stg_qunar_group_team_room_night_da 
#where dt in('2014-09-04','2014-09-11','2014-09-18')
#group by team_id;
#"""
#SQL14="""
#use tmp;
#INSERT OVERWRITE TABLE tmp2_qunar_group_scan_qr_code_team_da PARTITION (dt='2014-09-05')
#select 
#    team_id,
#    avg(total_room_night) as avg_room_night
#from stg.stg_qunar_group_team_room_night_da 
#where dt in('2014-09-05','2014-09-12','2014-09-19')
#group by team_id;
#"""
#SQL15="""
#use tmp;
#INSERT OVERWRITE TABLE tmp2_qunar_group_scan_qr_code_team_da PARTITION (dt='2014-09-06')
#select 
#    team_id,
#    avg(total_room_night) as avg_room_night
#from stg.stg_qunar_group_team_room_night_da
#where dt in('2014-09-06','2014-09-13','2014-09-20')
#group by team_id;
#"""
#SQL16="""
#use tmp;
#INSERT OVERWRITE TABLE tmp2_qunar_group_scan_qr_code_team_da PARTITION (dt='2014-09-07')
#select 
#    team_id,
#    avg(total_room_night) as avg_room_night
#from stg.stg_qunar_group_team_room_night_da 
#where dt in('2014-09-07','2014-09-14','2014-09-21')
#group by team_id;
#""" 
SQL17="""
use dwr;
create table if not exists dwr_qunar_group_scan_qr_code_team_di (
    team_id int,
    scan_qr_code_room_night int,
    last_day_scan_qr_code_room_night int,
    total_room_night int,
    same_period_avg_room_night decimal,
    team_price decimal,
    same_period_team_price decimal,
    tuan_total_room_night int,
    last_month_total_room_night int,
    commission decimal,
    profit decimal,
    total_refund_room_night int,
    scan_qr_code_refund_room_night int,
    last_month_room_night int
)
partitioned by (dt string)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\\t' 
STORED AS INPUTFORMAT 'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
location 'hdfs://qunarcluster/user/desdev/hive/warehouse/dwr/dwr_qunar_group_scan_qr_code_team_di';
"""
SQL18="""
use dwr;
INSERT OVERWRITE TABLE dwr_qunar_group_scan_qr_code_team_di PARTITION (dt='"""+data_dt+"""')
SELECT 
    t1.team_id,
    nvl(t2.scan_qr_code_room_night,0),
    nvl(t3.scan_qr_code_room_night,0),
    nvl(t2.total_room_night,0),
    nvl(round(t4.avg_room_night,2),0),
    nvl(round(t5.sale_price,2),0),
    nvl(round(t6.avg_price,2),0),
    nvl(t7.total_room_night,0),
    nvl(t8.total_room_night,0),
    case when nvl(t5.sale_price,0.0)>0 and nvl(t9.cost_price,0.0)>0 then round(nvl(t5.sale_price,0.0)-nvl(t9.cost_price,0.0),2) else 0.0 end,
    case when nvl(t5.sale_price,0.0)>0 and nvl(t9.cost_price,0.0)>0 then round(nvl(t5.sale_price,0.0)-nvl(t9.cost_price,0.0)-5,2) else 0.0 end,
    nvl(t10.total_refund_room_night,0),
    nvl(t10.scan_qr_code_refund_room_night,0),
    nvl(t11.total_room_night,0)
FROM tmp.tmp_team_scan_qr_code t1
LEFT OUTER JOIN (SELECT * FROM stg.stg_qunar_group_team_room_night_da WHERE dt='"""+data_dt+"""') t2
ON t1.team_id=t2.team_id
LEFT OUTER JOIN (SELECT * FROM stg.stg_qunar_group_team_room_night_da WHERE dt='"""+pre1day+"""') t3
ON t1.team_id=t3.team_id
LEFT OUTER  JOIN (SELECT * FROM tmp.tmp2_qunar_group_scan_qr_code_team_da WHERE dt='"""+avg_price_dt+"""') t4
ON t1.team_id=t4.team_id
LEFT OUTER JOIN (SELECT * FROM des_bi.hotel_product_tuan_history WHERE dt='"""+data_dt+"""')t5
ON t1.team_id=t5.id
LEFT OUTER  JOIN (SELECT * FROM tmp.tmp1_qunar_group_scan_qr_code_team_da WHERE dt='"""+avg_price_dt+"""') t6
ON t1.team_id=t6.team_id
LEFT OUTER JOIN (SELECT SUM(total_room_night) as total_room_night FROM stg.stg_qunar_group_team_room_night_da WHERE dt='"""+data_dt+"""')t7
ON 1=1
LEFT OUTER JOIN (SELECT SUM(total_room_night) as total_room_night FROM stg.stg_qunar_group_team_room_night_da WHERE dt='"""+pre30day+"""')t8
ON 1=1
LEFT OUTER JOIN (SELECT * FROM stg.stg_qunar_group_team_price_da WHERE dt='"""+data_dt+"""')t9
ON t1.team_id=t9.team_id
LEFT OUTER JOIN (SELECT * FROM stg.stg_qunar_group_team_refund_room_night_da WHERE dt='"""+data_dt+"""')t10
ON t1.team_id=t10.team_id
LEFT OUTER JOIN (SELECT * FROM stg.stg_qunar_group_team_room_night_da WHERE dt='"""+pre30day+"""') t11
ON t1.team_id=t11.team_id
"""
sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))
def exp_hive_data():
    export_cmd="""sudo -u desdev """+hive_home+"""/bin/hive -S -e"select dt,team_id,scan_qr_code_room_night,last_day_scan_qr_code_room_night,total_room_night,same_period_avg_room_night,team_price,same_period_team_price,tuan_total_room_night,last_month_total_room_night,commission,profit,total_refund_room_night,scan_qr_code_refund_room_night,last_month_room_night from dwr.dwr_qunar_group_scan_qr_code_team_di where dt='"""+data_dt+"""';">""" + file
    os.system(export_cmd)
def load_mysql_data():
    dbi=DBI(driver='mysql',dbc='db_data_discover')
    dbi.set_dbc(db='dwr')
    dbi.delete(table,conditions=dict(stat_date=data_dt))
    dbi.load(file,table)
    dbi.close()
def main():
    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
    exp_hive_data()
    load_mysql_data()
if __name__ == '__main__':
    main()