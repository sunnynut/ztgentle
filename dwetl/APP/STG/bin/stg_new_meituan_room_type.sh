#!/bin/sh
source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile

$HIVE_HOME/bin/hive -e"
CREATE  TABLE if not exists stg.stg_new_meituan_room_type(
  id string,
  qunar_city_code string,
  meituan_city_code string,
  deal_id string,
  hotel_seq string,
  hotel_id string,
  name string,
  address string,
  physical_room_type string,
  meituan_room_name string,
  meituan_room_type_name string,
  rtid bigint,
  price double,
  can_appoint string,
  has_window string,
  wifi string,
  breakfast string,
  broadbrand string,
  deal_title string,
  orginal_price double COMMENT 'value in new_meituan_room_type',
  use_time string,
  page_num int,
  is_kuaiding string)
PARTITIONED BY (
  dt string)
ROW FORMAT DELIMITED
  FIELDS TERMINATED BY '\001'
"
import_data(){
dt=$1
dt_yestoday=$2
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from dw04Mysql:db_data_capture:new_meituan_room_type --to hive:stg:stg_new_meituan_room_type --split '\001' --partition dt=$dt_yestoday   --overwrite overwrite --cond "select id,qunar_city_code,meituan_city_code,deal_id, hotel_seq,hotel_id ,name,address,physical_room_type,meituan_room_name,meituan_room_type_name,rtid,price,can_appoint,window,wifi,breakfast,broadbrand,deal_title,value,use_time,page_num,is_kuaiding from db_data_capture.new_meituan_room_type where dt='$dt'"
}

date=$(date -d '0 days ago' +%Y%m%d)
enddate=$date
startdate=$(date -d "-1 days $date" +%Y%m%d)
while [[ $enddate -gt $startdate ]]
do
        data_time=`date -d "-0 days $enddate" +%Y-%m-%d`
        data_time_yestoday=`date -d "-1 days $data_time" +%Y-%m-%d`
	echo ~~~~~~~~~~~~~~~~~~~~~~from dw04Mysql:db_data_capture:new_meituan_room_type dt=$data_time~~~~~~~~~~~~~to hive:stg:stg_new_meituan_room_type partition=$data_time_yestoday~~~~~~~~~~~~
	import_data $data_time $data_time_yestoday
	enddate=`date -d "-1 days $enddate" +%Y%m%d`
done
