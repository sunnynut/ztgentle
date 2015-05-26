#!/bin/sh
source /etc/profile
if [ -z $1 ];then
	date=$(date -d '1 days ago' '+%Y%m%d')
else 
	date=$( expr $1 : '.*\(\([0-9]-*\)\{8\}\).*' )
fi
read_date=$(date -d "0 day ago $date" +%Y-%m-%d)
read_date_no=$(date -d "0 day ago $read_date" +%Y%m%d)
time=$2
sudo -u desdev /home/q/hadoop/hive-default/bin/hive <<-EOF
	alter table ods_train_order drop if exists partition (dt='${read_date}');
	alter table ods_train_order add partition (dt='${read_date}') location '/user/wirelessdev/marmot_warehouse/ods/ods_train_order/dt=${read_date}';
EOF
