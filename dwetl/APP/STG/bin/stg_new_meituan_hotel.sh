#!/bin/sh
source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile




create_table(){
$HIVE_HOME/bin/hive -e "
CREATE  TABLE if not exists stg.stg_new_meituan_hotel(
  id bigint, 
  qunar_city_code string, 
  meituan_city_code string, 
  hotel_seq string,
  hotel_id string,  
  name string, 
  address string, 
  phone string, 
  wifi int, 
  park int, 
  area_id string, 
  area_name string, 
  brand_name string, 
  district_name string, 
  comment_num int,
  avg_score string, 
  latlng string,  
  sales string,
  deal_count int,
  page_num int)
PARTITIONED BY (dt string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\001' 
"
}

import_data(){
today=$1
yestoday=`date -d "-1 days $today" +%Y-%m-%d`
echo ~~~~~~~~~~~~~~~~~~~~~~from dw04Mysql:db_data_capture:new_meituan_hotel $today~~~~~~~~~~~~~~~~to hive:stg:stg_new_meituan_hotel $yestoday~~~~~~~~~~~~~~~~~~~~~~~~~~~
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from dw04Mysql:db_data_capture:new_meituan_hotel --to hive:stg:stg_new_meituan_hotel --split '\001' --partition dt=$yestoday --overwrite overwrite --cond "select id , qunar_city_code, meituan_city_code , hotel_seq, hotel_id , name, address , phone , wifi , park , area_id, area_name , brand_name , district_name , comment_num, avg_score, latlng, sales,deal_count,page_num from db_data_capture.new_meituan_hotel where dt='$today'"
}

date=$(date -d '0 days ago' +%Y-%m-%d)
endday=$date
startday=`date -d "-1 days $date" +%Y-%m-%d`
while [[ $startday -gt $endday  ]]  
do
  echo ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  import_data $endday
  endday=`date -d "-1 day $endday" +%Y-%m-%d`
done








