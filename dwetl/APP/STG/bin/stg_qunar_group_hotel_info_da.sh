#!/bin/bash

source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile

#PG_HOST='l-tuandbvip2.des.cn8.qunar.com'
#PG_PORT=5432
#PG_USER='doubhor'
#PG_PWD='dab64072-3b1e-400a-adac-83e494c90eb6'
#PG_DB='qunar_group'

if [ -z $1 ];then
day=`date -d "yesterday" +"%Y-%m-%d"`
else
tmp=${1/'.dir'/}
tmp=${tmp:(-8)}
day=`date -d "$tmp" +"%Y-%m-%d"`
fi

echo $day

sudo python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from tuandbvip2:qunar_group:public.hotel_info --to hive:stg:stg_qunar_group_hotel_info_da --map attrs,city_tags,types,trading_areas --partition dt=${day} --overwrite overwrite
#sudo -u desdev /home/q/sqoop/bin/sqoop import --connect jdbc:postgresql://$PG_HOST:$PG_PORT/$PG_DB --username $PG_USER --password $PG_PWD --table hotel_info --hive-import --hive-overwrite --hive-table stg.stg_qunar_group_hotel_info_da --hive-delims-replacement '\005' --map-column-java attrs=String,city_tags=String,types=String,trading_areas=String --map-column-hive attrs=string,city_tags=string,types=string,trading_areas=string --num-mappers 10 --hive-partition-key dt --hive-partition-value $day --split-by id --fields-terminated-by '\001' --null-string '\\N'

