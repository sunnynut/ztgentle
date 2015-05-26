#!/bin/bash

source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile

PG_HOST='l-tuandb3.des.cn8.qunar.com'
PG_PORT=5432
PG_USER='des_report'
PG_PWD='1adff040-bdbb-4bc0-b9ea-c810af1a7a77'
PG_DB='qunar_group'
COUPON_PATH="/home/q/dwetl/APP/STG/bin/coupon.csv"

if [ -z $1 ];then
day=`date -d "yesterday" +"%Y-%m-%d"`
else
tmp=${1/'.dir'/}
tmp=${tmp:(-8)}
day=`date -d "$tmp" +"%Y-%m-%d"`
fi

echo $day

sudo -u desdev /home/q/sqoop/bin/sqoop import --connect jdbc:postgresql://$PG_HOST:$PG_PORT/$PG_DB --username $PG_USER --password $PG_PWD --table coupon --hive-import --hive-overwrite --hive-table stg.stg_qunar_group_coupon_da --hive-delims-replacement '\005' --num-mappers 1 --hive-partition-key dt --hive-partition-value $day

#export PGPASSWORD=$PG_PWD
#/usr/bin/psql -h $PG_HOST -U $PG_USER -d $PG_DB -c "copy (select * from public.coupon) to stdout csv" > $COUPON_PATH


#sudo -u desdev /home/q/sqoop/bin/sqoop import --connect jdbc:postgresql://$PG_HOST:$PG_PORT/$PG_DB --username $PG_USER --password $PG_PWD --query 'select id,user_id,partner_id,team_id,order_id,type,credit,consume,ip,sms,consume_time,create_time,sms_time,buy_id,expire_notify_time,freeze,disabled,disable_time,freeze_from,shop_id,from_type from public.coupon where $CONDITIONS ' --hive-import --hive-overwrite --hive-table stg.stg_qunar_group_coupon_da --hive-delims-replacement '\005' --num-mappers 10 --hive-partition-key dt --hive-partition-value $day --target-dir /user/desdev/hive/warehouse/tmp/stg_qunar_group_coupon_da --split-by id

#sudo -u desdev /home/q/sqoop/bin/sqoop import --connect jdbc:postgresql://$PG_HOST:$PG_PORT/$PG_DB --username $PG_USER --password $PG_PWD --query 'select id,user_id,partner_id,team_id,order_id,type,credit,secret,consume,ip,sms,expire_time,consume_time,create_time,sms_time,buy_id,expire_notify_time,"freeze",disabled,disable_time,freeze_from,shop_id,from_type from public.coupon where $CONDITIONS ' --hive-import --hive-overwrite --hive-table stg.stg_qunar_group_coupon_da --hive-delims-replacement '\005' --num-mappers 10 --hive-partition-key dt --hive-partition-value $day --target-dir /user/desdev/hive/warehouse/tmp/stg_qunar_group_coupon_da --split-by id
