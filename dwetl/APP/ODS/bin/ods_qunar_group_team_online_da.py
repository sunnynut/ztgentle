#!/usr/bin/env python
#-*- coding:utf-8 -*-
# **AUTHOR:           denchen.yang
# **CREATED TIME:     2014-09-24
# **FUN DESC    :     基础数据层
# **MODIFIED BY :     
# **MODIFTED TIME:    
# **MODIFTED CONTENT:
# **REVIEWED BY:      
# **REVIEWED TIME:    
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
from DBI import DBI
##===================META BEGIN=============================================
# **INPUT TABLE:  stg_qunar_group_team_online_da
# **MID TABLE :
# **DIM TABLE :
# **OUTPUT TABLE: ods_qunar_group_team_online_da
##===================META BEGIN=============================================

################################################################
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
pre1day=Time.date_add(data_dt,-1)
################### SQL EDITE ##################################
##=========================================================================
sql1="""
    use ods;
    create table if not exists ods_qunar_group_team_online_da (
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
    location 'hdfs://qunarcluster/user/desdev/hive/warehouse/ods/ods_qunar_group_team_online_da';
    """
sql2="""
    USE ods;
    INSERT OVERWRITE TABLE ods_qunar_group_team_online_da PARTITION (dt='"""+data_dt+"""')
    SELECT
    id            ,
    stitle        ,
    group_id      ,
    partner_id    ,
    team_price    ,
    market_price  ,
    product       ,
    sort_order    ,
    begin_time    ,
    end_time      ,
    sales         ,
    publish       ,
    profit        ,
    departure     ,
    arrive        ,
    tags          ,
    cdate         ,
    p_team_id         
    FROM stg.stg_qunar_group_team_online_da WHERE dt='"""+data_dt+"""';
    """.strip()
##=========================================================================

hive=Hive()
hive.set_date(data_dt)
hive.add_sql(sql1)
hive.add_sql(sql2)
hive.run()