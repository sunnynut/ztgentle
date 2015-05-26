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
dump_file="""/home/q/desdev/stg_data/stg_qunar_group_team_price_da.dat"""
file="""/home/q/desdev/stg_data/scan_qr_code_team_room_night.txt"""
def exp_postgre_data():
    dbi=DBI(driver='postgre',dbc='qunar_group')
    dbi.set_dbc(db='qunar_group')
    sql="""
    select 
        t1.id,
        case when coalesce(t2.cost_price,0.0)>0 then coalesce(t2.cost_price,0.0) else coalesce(t3.cost_price,0.0) end as cost_price
    from team_online t1
    left join team t2
    on t1.id=t2.id
    and t2.new_type='normal'
    left join (select a.team_id,max(a.cost_price) as cost_price  from team_hms_package a inner join team b on a.team_id=b.id and a.cost_price<=b.team_price group by a.team_id )t3
    on t1.id=t3.team_id
    where t1.cdate='"""+data_dt+"""'
    """
    print sql
    dbi.connect()
    dbi.dump(sql,file=dump_file)
    dbi.close()

def imp_hive_data():
    sql1="""
    use stg;
    create table if not exists stg_qunar_group_team_price_da (
    team_id int,
    cost_price double
    )
    partitioned by (dt string)
    ROW FORMAT DELIMITED FIELDS TERMINATED BY '\\t' 
    STORED AS INPUTFORMAT 'org.apache.hadoop.mapred.TextInputFormat' 
    OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
    location 'hdfs://qunarcluster/user/desdev/hive/warehouse/stg/stg_qunar_group_team_price_da';
    """
    sql2="""
    use stg;
    load data local inpath \""""+dump_file+"""\" overwrite into table stg_qunar_group_team_price_da partition(dt='"""+data_dt+"""') ;
    """
    hive=Hive()
    hive.set_date(data_dt)
    hive.add_sql(sql1)
    hive.add_sql(sql2)
    hive.run()

def main():
    exp_postgre_data()
    imp_hive_data()
if __name__ == '__main__':
    main()