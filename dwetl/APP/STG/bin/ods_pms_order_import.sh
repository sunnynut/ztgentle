#!/bin/sh
if [ -z $1 ];then
	date=$(date -d '1 days ago' '+%Y%m%d')
else 
	date=$( expr $1 : '.*\(\([0-9]-*\)\{8\}\).*' )
fi
read_date=$(date -d "0 day ago $date" +%Y-%m-%d)
read_date_no=$(date -d "0 day ago $date" +%Y%m%d)
date_ye=$(date -d "1 day ago $read_date" +%Y-%m-%d)
sudo -u desdev /home/q/hadoop/hive-default/bin/hive <<-EOF
	alter table dw_pms_inn_info drop if exists partition (dt='$read_date_no');
	alter table dw_pms_inn_info add partition (dt='$read_date_no') location '/user/qhstats/dw/dw_pms_inn_info/dt=$read_date_no';
	alter table ods_pms_ota_inn_bind drop if exists partition (dt='$read_date_no');
	alter table ods_pms_ota_inn_bind add partition (dt='$read_date_no') location '/user/qhstats/ods/ods_pms_ota_inn_bind/$read_date_no';
	alter table ods_pms_main_order_info drop if exists partition (dt='$read_date_no');
	alter table ods_pms_main_order_info add partition (dt='$read_date_no') location '/user/qhstats/ods/ods_pms_main_order_info/$read_date_no';
	alter table ods_pms_customer_source drop if exists partition (dt='$read_date_no');
	alter table ods_pms_customer_source add partition (dt='$read_date_no') location '/user/qhstats/ods/ods_pms_customer_source/$read_date_no';
	alter table ods_pms_ota_coupon drop if exists partition (dt='$read_date_no');
	alter table ods_pms_ota_coupon add partition (dt='$read_date_no') location '/user/qhstats/ods/ods_pms_ota_coupon/$read_date_no';
	alter table ods_pms_order_detail_info drop if exists partition (dt='$read_date_no');
	alter table ods_pms_order_detail_info add partition (dt='$read_date_no') location '/user/qhstats/ods/ods_pms_order_detail_info/$read_date_no';
EOF
