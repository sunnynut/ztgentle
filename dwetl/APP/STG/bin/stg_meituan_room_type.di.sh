#/bin/sh
source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile


if [ -z $1 ];then
  date=$(date -d '1 days ago' '+%Y%m%d')
else
  date=$(date -d "+0 day $1" '+%Y%m%d' )
fi

if [ -z $2 ];then
  enddate=$date
else
  enddate=`date -d "+0 day $2" +%Y%m%d`
fi

if [ -z $2 ];then
  enddate=$date
else
  enddate=`date -d "+0 day $2" +%Y%m%d`
fi

import_data(){
date_dash=$1
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from dw04Mysql:db_data_capture:new_meituan_sales --to hive:stg:stg_meituan_room_type_di --split '\001' --partition dt=$date_dash --overwrite overwrite --cond "select id,
  qunar_city_code , 
  meituan_city_code  , 
  deal_id , 
  hotel_seq , 
  hotel_id, 
  name , 
  address , 
  physical_room_type  , 
  meituan_room_name , 
  meituan_room_type_name , 
  rtid , 
  price, 
  can_appoint , 
  window as has_window ,
  wifi, 
  breakfast, 
  broadbrand, 
  deal_title , 
  value, 
  use_time, 
  page_num , 
  is_kuaiding from db_data_capture.new_meituan_room_type where dt='$date_dash'"
}


create_table(){
  $HIVE_HOME/bin/hive -e "
  create table if not exists stg.stg_meituan_room_type_di(
  id string, 
  qunar_city_code string  , 
  meituan_city_code string  , 
  deal_id string  , 
  hotel_seq string , 
  hotel_id string  , 
  name string , 
  address string , 
  physical_room_type  string , 
  meituan_room_name  string , 
  meituan_room_type_name string , 
  rtid string , 
  price double , 
  can_appoint string , 
  has_window string , 
  wifi string  , 
  breakfast string , 
  broadbrand string , 
  deal_title string , 
  value string , 
  use_time string , 
  page_num string , 
  is_kuaiding int 
  )
  partitioned by (dt string )
  row format delimited fields terminated by '\001'
"
}


while [[ $date -le $enddate  ]]  
do
  echo $date
  date_dash=`date -d "+0 day $date" +%Y-%m-%d`
  last_day=`date -d "-1 day $date" +%Y%m%d`
  create_table
  import_data $date_dash
  date=`date -d "+1 day $date" +%Y%m%d`
done