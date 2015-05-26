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
# **INPUT TABLE:  stg_qunar_group_order_da
# **MID TABLE :
# **DIM TABLE :
# **OUTPUT TABLE: ods_qunar_group_order_da
##===================META BEGIN=============================================

################################################################
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
pre1day=Time.date_add(data_dt,-1)
################### SQL EDITE ##################################
##=========================================================================
sql1="""
    use ods;
    create table if not exists ods_qunar_group_order_da (
    id int ,
    pay_id string ,
    buy_id int ,
    service string,
    user_id int ,
    admin_id int ,
    team_id int ,
    city_id int ,
    quantity int ,
    mobile string ,
    c_mobile string ,
    express_xx string ,
    express_id int,
    price double ,
    money double ,
    origin double ,
    credit double ,
    card double ,
    fare double ,
    condbuy string ,
    create_time int ,--
    pay_time int ,--
    comment_time int,--
    partner_id int ,
    luky_id int ,
    express_time int ,--
    refund_money double,
    refund_times int,
    last_refund_time int,--
    refund_quantity int ,
    flight_tts_state string,
    flight_tts_order_id string,
    flight_tts_bookurl string,
    flight_tts_oid string,
    red_envelope int,
    p_order_id int,
    lock int ,
    type_id int,
    type string,
    express_send_time string,
    holiday_tts_play_time string,
    order_quick int,
    cancel_time int ,--
    other_tuan_info string,
    version int,
    tppcode string,
    reach_shop_time string,
    merchant_code string,
    other_tuan_state string,
    vid string,
    pid string,
    uid string,
    gid string,
    cid string,
    org string,
    order_version string,
    cost_price double)
    partitioned by (dt string)
    ROW FORMAT DELIMITED FIELDS TERMINATED BY '\\t' 
    STORED AS INPUTFORMAT 'org.apache.hadoop.mapred.TextInputFormat' 
    OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
    location 'hdfs://qunarcluster/user/desdev/hive/warehouse/ods/ods_qunar_group_order_da';
    """
sql2="""
    USE ods;
    INSERT OVERWRITE TABLE ods_qunar_group_order_da PARTITION (dt='"""+data_dt+"""')
    SELECT
    CASE WHEN C.id                     IS NOT NULL THEN C.id                     ELSE H.id                    END id                   ,
    CASE WHEN C.pay_id                 IS NOT NULL THEN C.pay_id                 ELSE H.pay_id                END pay_id               ,
    CASE WHEN C.buy_id                 IS NOT NULL THEN C.buy_id                 ELSE H.buy_id                END buy_id               ,
    CASE WHEN C.service                IS NOT NULL THEN C.service                ELSE H.service               END service              ,
    CASE WHEN C.user_id                IS NOT NULL THEN C.user_id                ELSE H.user_id               END user_id              ,
    CASE WHEN C.admin_id               IS NOT NULL THEN C.admin_id               ELSE H.admin_id              END admin_id             ,
    CASE WHEN C.team_id                IS NOT NULL THEN C.team_id                ELSE H.team_id               END team_id              ,
    CASE WHEN C.city_id                IS NOT NULL THEN C.city_id                ELSE H.city_id               END city_id              ,
    CASE WHEN C.quantity               IS NOT NULL THEN C.quantity               ELSE H.quantity              END quantity             ,
    CASE WHEN C.mobile                 IS NOT NULL THEN C.mobile                 ELSE H.mobile                END mobile               ,
    CASE WHEN C.c_mobile               IS NOT NULL THEN C.c_mobile               ELSE H.c_mobile              END c_mobile             ,
    CASE WHEN C.express_xx             IS NOT NULL THEN C.express_xx             ELSE H.express_xx            END express_xx           ,
    CASE WHEN C.express_id             IS NOT NULL THEN C.express_id             ELSE H.express_id            END express_id           ,
    CASE WHEN C.price                  IS NOT NULL THEN C.price                  ELSE H.price                 END price                ,
    CASE WHEN C.money                  IS NOT NULL THEN C.money                  ELSE H.money                 END money                ,
    CASE WHEN C.origin                 IS NOT NULL THEN C.origin                 ELSE H.origin                END origin               ,
    CASE WHEN C.credit                 IS NOT NULL THEN C.credit                 ELSE H.credit                END credit               ,
    CASE WHEN C.card                   IS NOT NULL THEN C.card                   ELSE H.card                  END card                 ,
    CASE WHEN C.fare                   IS NOT NULL THEN C.fare                   ELSE H.fare                  END fare                 ,
    CASE WHEN C.condbuy                IS NOT NULL THEN C.condbuy                ELSE H.condbuy               END condbuy              ,
    CASE WHEN C.create_time            IS NOT NULL THEN C.create_time            ELSE H.create_time           END create_time          ,
    CASE WHEN C.pay_time               IS NOT NULL THEN C.pay_time               ELSE H.pay_time              END pay_time             ,
    CASE WHEN C.comment_time           IS NOT NULL THEN C.comment_time           ELSE H.comment_time          END comment_time         ,
    CASE WHEN C.partner_id             IS NOT NULL THEN C.partner_id             ELSE H.partner_id            END partner_id           ,
    CASE WHEN C.luky_id                IS NOT NULL THEN C.luky_id                ELSE H.luky_id               END luky_id              ,
    CASE WHEN C.express_time           IS NOT NULL THEN C.express_time           ELSE H.express_time          END express_time         ,
    CASE WHEN C.refund_money           IS NOT NULL THEN C.refund_money           ELSE H.refund_money          END refund_money         ,
    CASE WHEN C.refund_times           IS NOT NULL THEN C.refund_times           ELSE H.refund_times          END refund_times         ,
    CASE WHEN C.last_refund_time       IS NOT NULL THEN C.last_refund_time       ELSE H.last_refund_time      END last_refund_time     ,
    CASE WHEN C.refund_quantity        IS NOT NULL THEN C.refund_quantity        ELSE H.refund_quantity       END refund_quantity      ,
    CASE WHEN C.flight_tts_state       IS NOT NULL THEN C.flight_tts_state       ELSE H.flight_tts_state      END flight_tts_state     ,
    CASE WHEN C.flight_tts_order_id    IS NOT NULL THEN C.flight_tts_order_id    ELSE H.flight_tts_order_id   END flight_tts_order_id  ,
    CASE WHEN C.flight_tts_bookurl     IS NOT NULL THEN C.flight_tts_bookurl     ELSE H.flight_tts_bookurl    END flight_tts_bookurl   ,
    CASE WHEN C.flight_tts_oid         IS NOT NULL THEN C.flight_tts_oid         ELSE H.flight_tts_oid        END flight_tts_oid       ,
    CASE WHEN C.red_envelope           IS NOT NULL THEN C.red_envelope           ELSE H.red_envelope          END red_envelope         ,
    CASE WHEN C.p_order_id             IS NOT NULL THEN C.p_order_id             ELSE H.p_order_id            END p_order_id           ,
    CASE WHEN C.lock                   IS NOT NULL THEN C.lock                   ELSE H.lock                  END lock                 ,
    CASE WHEN C.type_id                IS NOT NULL THEN C.type_id                ELSE H.type_id               END type_id              ,
    CASE WHEN C.type                   IS NOT NULL THEN C.type                   ELSE H.type                  END type                 ,
    CASE WHEN C.express_send_time      IS NOT NULL THEN C.express_send_time      ELSE H.express_send_time     END express_send_time    ,
    CASE WHEN C.holiday_tts_play_time  IS NOT NULL THEN C.holiday_tts_play_time  ELSE H.holiday_tts_play_time END holiday_tts_play_time,
    CASE WHEN C.order_quick            IS NOT NULL THEN C.order_quick            ELSE H.order_quick           END order_quick          ,
    CASE WHEN C.cancel_time            IS NOT NULL THEN C.cancel_time            ELSE H.cancel_time           END cancel_time          ,
    CASE WHEN C.other_tuan_info        IS NOT NULL THEN C.other_tuan_info        ELSE H.other_tuan_info       END other_tuan_info      ,
    CASE WHEN C.version                IS NOT NULL THEN C.version                ELSE H.version               END version              ,
    CASE WHEN C.tppcode                IS NOT NULL THEN C.tppcode                ELSE H.tppcode               END tppcode              ,
    CASE WHEN C.reach_shop_time        IS NOT NULL THEN C.reach_shop_time        ELSE H.reach_shop_time       END reach_shop_time      ,
    CASE WHEN C.merchant_code          IS NOT NULL THEN C.merchant_code          ELSE H.merchant_code         END merchant_code        ,
    CASE WHEN C.other_tuan_state       IS NOT NULL THEN C.other_tuan_state       ELSE H.other_tuan_state      END other_tuan_state     ,
    CASE WHEN C.vid                    IS NOT NULL THEN C.vid                    ELSE H.vid                   END vid                  ,
    CASE WHEN C.pid                    IS NOT NULL THEN C.pid                    ELSE H.pid                   END pid                  ,
    CASE WHEN C.uid                    IS NOT NULL THEN C.uid                    ELSE H.uid                   END uid                  ,
    CASE WHEN C.gid                    IS NOT NULL THEN C.gid                    ELSE H.gid                   END gid                  ,
    CASE WHEN C.cid                    IS NOT NULL THEN C.cid                    ELSE H.cid                   END cid                  ,
    CASE WHEN C.org                    IS NOT NULL THEN C.org                    ELSE H.org                   END org                  ,
    CASE WHEN C.order_version          IS NOT NULL THEN C.order_version          ELSE H.order_version         END order_version        ,
    CASE WHEN C.cost_price             IS NOT NULL THEN C.cost_price             ELSE H.cost_price            END cost_price           
    FROM
    (SELECT * FROM stg.stg_qunar_group_order_da WHERE dt='"""+data_dt+"""') C
    FULL OUTER JOIN
    (SELECT * FROM ods.ods_qunar_group_order_da WHERE dt='"""+pre1day+"""') H
    ON C.id=H.id;
    """.strip()
##=========================================================================

hive=Hive()
hive.set_date(data_dt)
hive.add_sql(sql1)
hive.add_sql(sql2)
hive.run()