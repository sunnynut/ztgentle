#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/denchen.yang/lib/py/util')
from Time import Time
sys.path.append('/home/denchen.yang/lib/py/db')
from Hive import Hive
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
dump_file="""/home/q/desdev/stg_data/stg_qunar_group_partner_da"""+data_dt+""".dat"""
def exp_postgre_data():
    dbi=DBI(driver='postgre',dbc='qunar_group')
    dbi.set_dbc(db='qunar_group')
    sql="""
    select id,username,password,title,group_id,homepage,city_id,bank_name,bank_no,bank_user,location,contact,image,image1,image2,phone,address,other,mobile,open,enable,head,user_id,to_timestamp(create_time)::timestamp without time zone as create_time,longlat,display,comment_good,comment_none,comment_bad,mapimage,partner_type,shop_total,display_title,saltkey,email,message_type,fwbao,weak_password,contract_code,type,resource_type,user_center_name,crm_city from public.partner
    """
    dbi.connect()
    dbi.dump(sql,file=dump_file)
    dbi.close()

def imp_hive_data():
    sql1="""
    use stg;
    create table if not exists stg_qunar_group_partner_da(
        id int,
        username string,
        password string,
        title string,
        group_id int,
        homepage string,
        city_id int,
        bank_name string,
        bank_no string,
        bank_user string,
        location string,
        contact string,
        image string,
        image1 string,
        image2 string,
        phone string,
        address string,
        other string,
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
        saltkey string,
        email string,
        message_type int,
        fwbao int,
        weak_password string,
        contract_code string,
        type int,
        resource_type int,
        user_center_name string,
        crm_city string
    )
    ROW FORMAT DELIMITED FIELDS TERMINATED BY '\\t' 
    STORED AS INPUTFORMAT 'org.apache.hadoop.mapred.TextInputFormat' 
    OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
    location 'hdfs://qunarcluster/user/desdev/hive/warehouse/stg/stg_qunar_group_partner_da';
    """
    sql2="""
    use stg;
    load data local inpath """+dump_file+""" overwrite into table stg_qunar_group_partner_da;
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