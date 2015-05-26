#!/bin/sh
source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile

create_table(){
$HIVE_HOME/bin/hive -e "
	create table if not exists stg.stg_new_meituan_sales(
	id bigint,
	qunar_city_code string,
	meituan_city_code string,
	deal_id string,
	hotel_id string,
	hotel_seq string,
	name string,
	address string,
	can_booking string,
	physical_room_type string,
	room_type string,
	rtid string,
	title string,
	price decimal,
	breakfast string,
	wifi string,
	solds string,
	is_hour_room string,
	is_vouchers string,
	has_deal int 
)
partitioned by (dt string)
row format delimited
fields terminated by '\001'
"
}
import_data(){
data_in_mysql=$1
data_in_hive=$2
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from dw04Mysql:db_data_capture:new_meituan_sales --to hive:stg:stg_new_meituan_sales --split '\001' --partition dt=$data_in_hive --overwrite overwrite --cond "select id,qunar_city_code, meituan_city_code , deal_id,hotel_id, hotel_seq , name, address,can_booking,physical_room_type,room_type,rtid,title,price,breakfast,wifi,solds,is_hour_room,is_vouchers,has_deal from db_data_capture.new_meituan_sales where dt='$data_in_mysql'"
}



create_table
today=$(date -d '0 days ago' +%Y%m%d)
endday=$today
startday=$(date -d "-1 days $today" +%Y%m%d)
while [[ $endday -gt $startday ]]
do
	data_today=$(date -d "-0 days $endday" +%Y-%m-%d)
	data_yestoday=$(date -d "-1 days $endday" +%Y-%m-%d)
	echo ~~~~~~~~~~~~~~~~~~~~~~~~~~~from dw04Mysql:db_data_capture:new_meituan_sales $data_today~~~~~~~~to hive:stg:stg_new_meituan_sales:$data_yestoday~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	import_data $data_today $data_yestoday
	endday=$(date -d "-1 days $endday" +%Y%m%d)

done
