#!/bin/bash

source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile

PG_HOST='l-tuandb3.des.cn8.qunar.com'
PG_PORT=5432
PG_USER='des_report'
PG_PWD='1adff040-bdbb-4bc0-b9ea-c810af1a7a77'
PG_DB='qunar_group'


if [ -z $1 ];then
day=`date -d "yesterday" +"%Y-%m-%d"`
else
tmp=${1/'.dir'/}
tmp=${tmp:(-8)}
day=`date -d "$tmp" +"%Y-%m-%d"`
fi

echo $day

sudo -u desdev /home/q/sqoop/bin/sqoop import --connect jdbc:postgresql://$PG_HOST:$PG_PORT/$PG_DB --username $PG_USER --password $PG_PWD --table refund_log --hive-import --hive-overwrite --hive-table stg.stg_qunar_group_refund_log_da --hive-delims-replacement '\005' --map-column-java refund_uniq_id=String --map-column-hive refund_uniq_id=string --num-mappers 10 --hive-partition-key dt --hive-partition-value $day --split-by id

