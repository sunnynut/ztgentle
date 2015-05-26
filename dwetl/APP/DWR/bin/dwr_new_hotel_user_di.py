#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
today=Time.date_add(data_dt,1)

def deal_mysql_data():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='dwr')
    sql1="""
    TRUNCATE TABLE tmp.tmp1_hotel_new_user;
    """
    sql2="""
    INSERT INTO tmp.tmp1_hotel_new_user
    SELECT DISTINCT user_id FROM db_sync.dw_order_info_v2
    WHERE order_date<'"""+data_dt+"""'
    AND business_type IN('qta','hms_ppb','hms_commission');
    """
    sql3="""
    INSERT INTO tmp.tmp1_hotel_new_user
    SELECT DISTINCT user_id FROM db_sync.order WHERE create_time<'"""+data_dt+"""';
    """
    sql4="""
    DELETE FROM tmp.tmp2_hotel_new_user;
    """
    sql5="""
    INSERT INTO tmp.tmp2_hotel_new_user
    SELECT
        user_id,
        id
    FROM
    (
    SELECT q1.user_id,q1.id,q1.create_time,@rownum:=@rownum+1,IF(@user_id=q1.user_id,@rank:=@rank+1,@rank:=1) AS rank,@user_id:=q1.user_id
    FROM
    (SELECT user_id,id,create_time FROM db_sync.order WHERE create_time>='"""+data_dt+"""' AND create_time<'"""+today+"""'
    AND IFNULL(SUBSTR(vid,1,1),'0') IN('6','8')
    ORDER BY user_id,create_time
    )q1,(SELECT @rownum :=0 , @user_id := NULL ,@rank:=0) q2)p
    WHERE rank=1;
    """ 
    sql6="""
    DELETE FROM tmp.tmp3_hotel_new_user;
    """
    sql7="""
    INSERT INTO tmp.tmp3_hotel_new_user
    SELECT
        user_id,
        id
    FROM
    (
    SELECT q1.user_id,q1.id,q1.create_time,@rownum:=@rownum+1,IF(@user_id=q1.user_id,@rank:=@rank+1,@rank:=1) AS rank,@user_id:=q1.user_id
    FROM
    (SELECT user_id,id,create_time FROM db_sync.order WHERE create_time>='"""+data_dt+"""' AND create_time<'"""+today+"""'
    AND IFNULL(SUBSTR(vid,1,1),'0') IN('9')
    ORDER BY user_id,create_time
    )q1,(SELECT @rownum :=0 , @user_id := NULL ,@rank:=0) q2)p
    WHERE rank=1;
    """
    sql8="""
    DELETE FROM tmp.tmp4_hotel_new_user;
    """
    sql9="""
    INSERT INTO tmp.tmp4_hotel_new_user
    SELECT
        user_id,
        id
    FROM
    (
    SELECT q1.user_id,q1.id,q1.create_time,@rownum:=@rownum+1,IF(@user_id=q1.user_id,@rank:=@rank+1,@rank:=1) AS rank,@user_id:=q1.user_id
    FROM
    (SELECT user_id,id,create_time FROM db_sync.order WHERE create_time>='"""+data_dt+"""' AND create_time<'"""+today+"""'
    AND IFNULL(SUBSTR(vid,1,1),'0') NOT IN('6','8','9')
    ORDER BY user_id,create_time
    )q1,(SELECT @rownum :=0 , @user_id := NULL ,@rank:=0) q2)p
    WHERE rank=1;
    """
    sql10="""
    DELETE FROM dwr.dwr_new_hotel_user_di WHERE stat_date='"""+data_dt+"""';
    """
    sql11="""
    INSERT INTO dwr.dwr_new_hotel_user_di
    SELECT 
        '"""+data_dt+"""',
        p1.user_id,
        CASE WHEN p2.new_user_id IS NOT NULL THEN 'Y' ELSE 'N' END,
        p2.order_id,
        CASE WHEN p3.new_user_id IS NOT NULL THEN 'Y' ELSE 'N' END,
        p3.order_id,
        CASE WHEN p4.new_user_id IS NOT NULL THEN 'Y' ELSE 'N' END,
        p4.order_id
    FROM
    (SELECT DISTINCT t1.user_id FROM db_sync.order t1
    WHERE t1.create_time>='"""+data_dt+"""' AND t1.create_time<'"""+today+"""'
    AND NOT EXISTS(SELECT 1 FROM tmp.tmp1_hotel_new_user t2 WHERE t1.user_id=t2.user_id))p1
    LEFT JOIN tmp.tmp2_hotel_new_user p2
    ON p1.user_id=p2.new_user_id
    LEFT JOIN tmp.tmp3_hotel_new_user p3
    ON p1.user_id=p3.new_user_id
    LEFT JOIN tmp.tmp4_hotel_new_user p4
    ON p1.user_id=p4.new_user_id;
    """
    sql12="""
    delete from data_analyse.app_new_user_stat where stat_date='"""+data_dt+"""';
    """
    sql13="""
    INSERT INTO data_analyse.app_new_user_stat
    SELECT 
        p1.stat_date,
        p1.app_order_users,
        p1.app_orders,
        p2.app_new_users,
        p3.app_new_user_orders
    FROM
    (SELECT 
        '"""+data_dt+"""' AS stat_date,
        COUNT(DISTINCT user_id) AS app_order_users,
        COUNT(1) AS app_orders
    FROM db_sync.order 
    WHERE create_time>='"""+data_dt+"""' 
    AND create_time<'"""+today+"""'
    AND IFNULL(SUBSTR(vid,1,1),'0') IN ('6','8'))p1
    LEFT JOIN
    (SELECT 
        COUNT(1) AS app_new_users
    FROM dwr.dwr_new_hotel_user_di t1
    WHERE t1.stat_date='"""+data_dt+"""'
    AND (t1.app_new_user_flag='Y'))p2 
    ON 1=1
    LEFT JOIN(
    SELECT 
        COUNT(1) AS app_new_user_orders
    FROM db_sync.order t1 
    WHERE t1.create_time>='"""+data_dt+"""' 
    AND t1.create_time<'"""+today+"""'
    AND IFNULL(SUBSTR(t1.vid,1,1),'0') IN ('6','8')
    AND EXISTS(SELECT 1 FROM dwr.dwr_new_hotel_user_di t2 WHERE t1.user_id=t2.new_user_id AND t2.stat_date='"""+data_dt+"""'))p3
    ON 1=1;
    """
    dbi.connect()
    dbi.execute(sql1)
    dbi.execute('commit;')
    dbi.execute(sql2)
    dbi.execute('commit;')
    dbi.execute(sql3)
    dbi.execute('commit;')
    dbi.execute(sql4)
    dbi.execute('commit;')
    dbi.execute(sql5)
    dbi.execute('commit;')
    dbi.execute(sql6)
    dbi.execute('commit;')
    dbi.execute(sql7)
    dbi.execute('commit;')
    dbi.execute(sql8)
    dbi.execute('commit;')
    dbi.execute(sql9)
    dbi.execute('commit;')
    dbi.execute(sql10)
    dbi.execute('commit;')
    dbi.execute(sql11)
    dbi.execute('commit;')
    dbi.execute(sql12)
    dbi.execute('commit;')
    dbi.execute(sql13)
    dbi.execute('commit;')
    dbi.close()
def main():

    deal_mysql_data()
if __name__ == '__main__':
    main()