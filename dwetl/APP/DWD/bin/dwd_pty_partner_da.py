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
    use dwd;
    create table if not exists dwd_pty_partner_da
    (
        partner_id               int,  --"������ID"
        user_name                 string, --"�û�����"
        title                     string, --"����"
        group_id                  int, --"��ID"
        homepage                  string, --"��ҳ"
        city_id                   int, --"����ID",
        bank_name                 string, --"��������"
        bank_num                  string, --"�����˺�"
        bank_user                 string, --"�����û�"
        concat_person             string, --"��ϵ��"
        phone                     string, --"�̶��绰"
        address                   string, --"��ַ"
        mobile_phone              string, --"�ƶ��ֻ���"
        open_flag                 string, --"�򿪱�־"
        enable_flag               string, --"���ñ�־"
        user_id                   int, --"�û�ID"
        create_time               string, --"����ʱ��"
        display_flag              string, --"��ʾ��־"
        good_comments             int, --"������"
        no_comments               int, --"��������"
        bad_comments              int, --"������"
        supplier_type             int, --"��Ӧ������"
        shop_qty                  int, --"�̵���"
        display_title             string, --"��ʾ����"
        email                     string, --"��������"
        message_type              int, --"��Ϣ����"
        service_guarantee_flag    int, --"�����ϱ�־"
        contract_code             string, --"��ͬ����"
        type                      int, --"����"
        resource_type             int, --"��Դ����"
        user_center_name          string, --"�û���������"
        crm_city                  string --"CRM����"
    )
    ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' 
    STORED AS INPUTFORMAT 'org.apache.hadoop.mapred.TextInputFormat' 
    OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
    location 'hdfs://qunarcluster/user/desdev/hive/warehouse/dwd/dwd_pty_partner_da';
    """
    sql2="""
    use dwd;
    insert overwrite table dwd.dwd_pty_partner_da
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
        user_id            ,
        create_time        ,
        display            ,
        comment_good       ,
        comment_none       ,
        comment_bad        ,
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
    FROM ods.ods_qunar_group_partner_da where dt='"""+data_dt+"""'
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