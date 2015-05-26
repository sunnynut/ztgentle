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
        partner_id               int,  --"合作商ID"
        user_name                 string, --"用户名称"
        title                     string, --"标题"
        group_id                  int, --"组ID"
        homepage                  string, --"主页"
        city_id                   int, --"城市ID",
        bank_name                 string, --"银行名称"
        bank_num                  string, --"银行账号"
        bank_user                 string, --"银行用户"
        concat_person             string, --"联系人"
        phone                     string, --"固定电话"
        address                   string, --"地址"
        mobile_phone              string, --"移动手机号"
        open_flag                 string, --"打开标志"
        enable_flag               string, --"启用标志"
        user_id                   int, --"用户ID"
        create_time               string, --"创建时间"
        display_flag              string, --"显示标志"
        good_comments             int, --"好评量"
        no_comments               int, --"无评价量"
        bad_comments              int, --"差评量"
        supplier_type             int, --"供应商类型"
        shop_qty                  int, --"商店数"
        display_title             string, --"显示标题"
        email                     string, --"电子邮箱"
        message_type              int, --"消息类型"
        service_guarantee_flag    int, --"服务保障标志"
        contract_code             string, --"合同代码"
        type                      int, --"类型"
        resource_type             int, --"资源类型"
        user_center_name          string, --"用户中心名称"
        crm_city                  string --"CRM城市"
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