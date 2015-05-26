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
dump_file="""/home/q/desdev/stg_data/stg_qunar_group_team_room_night_da.dat"""
file="""/home/q/desdev/stg_data/scan_qr_code_team_room_night.txt"""
def exp_postgre_data():
    dbi=DBI(driver='postgre',dbc='qunar_group_congku2')
    dbi.set_dbc(db='qunar_group')
    sql="""
    select COALESCE(q1.team_id,q2.team_id) as team_id,    COALESCE(q1.c1,0)+COALESCE(q2.c2,0) as total_jianye,    COALESCE(q1.c3,0)+COALESCE(q2.c4,0) as scan_qr_code_jianye from(SELECT c.team_id as team_id, sum(b.baojian_total) as c1,sum(case when p.org='tw_code' then b.baojian_total else 0 end) as c3  from public.coupon c  join public.team b on c.team_id = b.id  join public.order p on p.id = c.order_id where b.delivery = 'coupon'    and c.consume = 'Y'   and b.group_id = 4    and (c.consume_time >= extract(epoch from '"""+data_dt+"""'::timestamptz)::bigint and c.consume_time < extract(epoch from '"""+today+"""'::timestamptz)::bigint) group by c.team_id)q1 full join(SELECT t_c.team_id  as team_id, sum(b.baojian_total) as c2,sum(case when p.org='tw_code' then b.baojian_total else 0 end) as c4       from through_coupon_history t_c      join team b on t_c.team_id = b.id       join public.order p on p.id = t_c.order_id     where b.delivery = 'through_coupon'    and b.group_id = 4   and t_c.consume_time::date >= '"""+data_dt+"""' and t_c.consume_time::date < '"""+today+"""'     group by t_c.team_id )q2    on q1.team_id=q2.team_id
    """
    print sql
    dbi.connect()
    dbi.dump(sql,file=dump_file)
    dbi.close()

def imp_hive_data():
    sql1="""
    use stg;
    create table if not exists stg_qunar_group_team_room_night_da (
    team_id int,
    total_room_night int,
    scan_qr_code_room_night int
    )
    partitioned by (dt string)
    ROW FORMAT DELIMITED FIELDS TERMINATED BY '\\t' 
    STORED AS INPUTFORMAT 'org.apache.hadoop.mapred.TextInputFormat' 
    OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
    location 'hdfs://qunarcluster/user/desdev/hive/warehouse/stg/stg_qunar_group_team_room_night_da';
    """
    sql2="""
    use stg;
    load data local inpath \""""+dump_file+"""\" overwrite into table stg_qunar_group_team_room_night_da partition(dt='"""+data_dt+"""') ;
    """
    hive=Hive()
    hive.set_date(data_dt)
    hive.add_sql(sql1)
    hive.add_sql(sql2)
    hive.run()

def main():
    exp_postgre_data()
    imp_hive_data()
    export_cmd="""sudo -u desdev $HIVE_HOME/bin/hive -S -e"select q1.team_id,q1.total_room_night,q1.scan_qr_code_room_night from (select * from stg.stg_qunar_group_team_room_night_da where dt='"""+data_dt+"""') q1 inner join tmp.tmp_team_scan_qr_code q2 on q1.team_id=q2.team_id;">""" + file
    os.system(export_cmd)
if __name__ == '__main__':
    main()