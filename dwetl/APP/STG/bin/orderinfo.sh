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
	alter table orderinfo drop if exists partition (month='${read_date_no:0:6}');
	alter table orderinfo add partition (month='${read_date_no:0:6}') location '/user/wirelessdev/mysql-log/orderInfo/month=${read_date_no:0:6}';
EOF
echo "success"
