#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/denchen.yang/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/denchen.yang/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

SQL1="""
use des_bi;
create external table if not exists test_app
(
    kpi1       int
)
partitioned by (dt string)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\\t' 
STORED AS INPUTFORMAT 'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
location 'hdfs://qunarcluster/user/desdev/hive/warehouse/des_bi.db/test_app';
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