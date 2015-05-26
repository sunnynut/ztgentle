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
dump_file="""/home/q/desdev/stg_data/stg_qunar_group_team_refund_room_night_da.dat"""
file="""/home/q/desdev/stg_data/scan_qr_code_team_room_night.txt"""
def exp_postgre_data():
    dbi=DBI(driver='postgre',dbc='qunar_group_congku2')
    dbi.set_dbc(db='qunar_group')
    sql="""
    select 
        t.id, 
         sum(case when r.refund_quantity is null then COALESCE(t.baojian_total,0) else r.refund_quantity*COALESCE(t.baojian_total,0)  end) as refund_total_room_night,
         sum(case when o.org='tw_code' then r.refund_quantity*t.baojian_total else 0 end) as refund_scan_qr_code_room_night
    from "public"."refund_log" r
    join "public"."order" o on o.id = r.order_id
    join team t on t.id = o.team_id
    where t.group_id = 4 and r.refund_method='online'
    and r.create_time::date>='"""+data_dt+"""'
    and r.create_time::date<'"""+today+"""'
    group by t.id
    """
    print sql
    dbi.connect()
    dbi.dump(sql,file=dump_file)
    dbi.close()

def imp_hive_data():
    sql1="""
    use stg;
    create table if not exists stg_qunar_group_team_refund_room_night_da (
    team_id int,
    total_refund_room_night int,
    scan_qr_code_refund_room_night int
    )
    partitioned by (dt string)
    ROW FORMAT DELIMITED FIELDS TERMINATED BY '\\t' 
    STORED AS INPUTFORMAT 'org.apache.hadoop.mapred.TextInputFormat' 
    OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
    location 'hdfs://qunarcluster/user/desdev/hive/warehouse/stg/stg_qunar_group_team_refund_room_night_da';
    """
    sql2="""
    use stg;
    load data local inpath \""""+dump_file+"""\" overwrite into table stg_qunar_group_team_refund_room_night_da partition(dt='"""+data_dt+"""') ;
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