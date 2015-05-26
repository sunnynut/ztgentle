#/bin/sh
source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile


if [ -z $1 ];then
  date=$(date -d '0 days ago' '+%Y%m%d')
else
  date=$(date -d "+1 day $1" '+%Y%m%d' )
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
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from dw04Mysql:db_data_capture:new_meituan_sales --to hive:stg:stg_meituan_sales_volomn_di --split '\001' --partition dt=$last_day --overwrite overwrite --cond "select id , qunar_city_code, meituan_city_code , deal_id,hotel_id, hotel_seq , name , address , can_booking , physical_room_type , room_type , rtid , title , price , breakfast , wifi , solds, is_hour_room , is_vouchers , has_deal from db_data_capture.new_meituan_sales where dt='$date_dash'"
}


create_table(){
  $HIVE_HOME/bin/hive -e "
  create table if not exists stg.stg_meituan_sales_volomn_di(
  id string , 
  qunar_city_code string , 
  meituan_city_code string , 
  deal_id string ,
  hotel_id string , 
  hotel_seq string , 
  name string , 
  address string , 
  can_booking string , 
  physical_room_type string , 
  room_type string, 
  rtid string , 
  title string , 
  price double , 
  breakfast string, 
  wifi string, 
  solds int , 
  is_hour_room string ,
  is_vouchers string , 
  has_deal int 
  )
  partitioned by (dt string )
  row format delimited fields terminated by '\001'
"
}


while [[ $date -le $enddate  ]]  
do
  echo $date
  date_dash=`date -d "+0 day $date" +%Y-%m-%d`
  last_day=`date -d "-1 day $date" +%Y-%m-%d`
  echo $last_day
  create_table
  import_data $date_dash
  date=`date -d "+1 day $date" +%Y%m%d`
done






