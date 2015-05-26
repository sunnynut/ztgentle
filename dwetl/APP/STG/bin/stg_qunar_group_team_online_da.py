#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
today=Time.date_add(data_dt,1)
pre59day=Time.date_add(data_dt,-59)
dump_file="""/home/q/desdev/stg_data/stg_qunar_group_team_online_da.dat"""
def exp_postgre_data():
    dbi=DBI(driver='postgre',dbc='qunar_group')
    dbi.set_dbc(db='qunar_group')
    sql="""
    select id,regexp_replace(stitle,'\t',' ','g'),group_id,partner_id,team_price,market_price,regexp_replace(product,'\t',' ','g'),sort_order,begin_time,end_time,regexp_replace(sales,'\t',' ','g'),regexp_replace(publish,'\t',' ','g'),profit,regexp_replace(departure,'\t',' ','g'),regexp_replace(arrive,'\t',' ','g'),regexp_replace(tags,'\t',' ','g'),cdate,p_team_id from public.team_online where cdate = '"""+data_dt+"""'
    """
    print sql
    dbi.connect()
    dbi.dump(sql,file=dump_file,sep=chr(001))
    dbi.close()

def imp_hive_data():
    sql1="""
    use stg;
    create table if not exists stg_qunar_group_team_online_da (
    id int,
    stitle string,
    group_id int,
    partner_id int,
    team_price double,
    market_price double,
    product string,
    sort_order int,
    begin_time string,
    end_time string,
    sales string,
    publish string,
    profit int,
    departure string,
    arrive string,
    tags string,
    cdate string,
    p_team_id int)
    partitioned by (dt string)
    ROW FORMAT DELIMITED FIELDS TERMINATED BY '\\t' 
    STORED AS INPUTFORMAT 'org.apache.hadoop.mapred.TextInputFormat' 
    OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
    location 'hdfs://qunarcluster/user/desdev/hive/warehouse/stg/stg_qunar_group_team_online_da';
    """
    sql2="""
    use stg;
    load data local inpath \""""+dump_file+"""\" overwrite into table stg_qunar_group_team_online_da partition(dt='"""+data_dt+"""') ;
    """
    hive=Hive()
    hive.set_date(data_dt)
    hive.add_sql(sql1)
    hive.add_sql(sql2)
    hive.run()



def main():
    exp_postgre_data()
    #imp_hive_data()
if __name__ == '__main__':
    main()