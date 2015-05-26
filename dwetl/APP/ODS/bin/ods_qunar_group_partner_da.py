#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

def deal_hive_data():
    sql1="""
    use ods;
    create table if not exists ods_qunar_group_partner_da(
        id int,
        username string,
        title string,
        group_id int,
        homepage string,
        city_id int,
        bank_name string,
        bank_no string,
        bank_user string,
        contact string,
        phone string,
        address string,
        mobile string,
        open string,
        enable string,
        head int,
        user_id int,
        create_time string,
        longlat string,
        display string,
        comment_good int,
        comment_none int,
        comment_bad int,
        mapimage string,
        partner_type int,
        shop_total int,
        display_title string,
        email string,
        message_type int,
        fwbao int,
        contract_code string,
        type int,
        resource_type int,
        user_center_name string,
        crm_city string
    )
    partitioned by (dt string)
    ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' 
    STORED AS INPUTFORMAT 'org.apache.hadoop.mapred.TextInputFormat' 
    OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
    location 'hdfs://qunarcluster/user/desdev/hive/warehouse/ods/ods_qunar_group_partner_da';
    """
    sql2="""
    use ods;
    insert overwrite table ods.ods_qunar_group_partner_da partition (dt = '"""+data_dt+"""')
        SELECT
        id                 ,
        username           ,
        title              ,
        group_id           ,
        homepage           ,
        city_id            ,
        bank_name          ,
        bank_no            ,
        bank_user          ,
        contact            ,
        phone              ,
        address            ,
        mobile             ,
        open               ,
        enable             ,
        head               ,
        user_id            ,
        create_time        ,
        longlat            ,
        display            ,
        comment_good       ,
        comment_none       ,
        comment_bad        ,
        mapimage           ,
        partner_type       ,
        shop_total         ,
        display_title      ,
        email              ,
        message_type       ,
        fwbao              ,
        contract_code      ,
        type               ,
        resource_type      ,
        user_center_name   ,
        crm_city
    FROM stg.stg_qunar_group_partner_da
    """
    hive=Hive()
    hive.set_date(data_dt)
    hive.add_sql(sql1)
    hive.add_sql(sql2)
    hive.run()



def main():
    deal_hive_data()
if __name__ == '__main__':
    main()