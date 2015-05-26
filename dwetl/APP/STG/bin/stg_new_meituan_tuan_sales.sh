#!/bin/sh
source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile

create_table(){
$HIVE_HOME/bin/hive -e "
        create table if not exists stg.stg_new_meituan_tuan_sales(
        qunar_city_code string,
        meituan_city_code string,
        deal_id string,
        hotel_id string,
        hotel_seq string,
        title string,
        sub_title string,
        address string,
        room_night int,
        room_night_flag int,
        original_price decimal,
        price decimal,
        sold_count int,
        score decimal,
        valid_date string,
        collected_count int,
        commented_count int,
        page_num int
)
partitioned by (dt string)
row format delimited
fields terminated by '\001'
"
}
import_data(){
date_in_tuan_sales=$1
data_in_hive=$2
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from dw04Mysql:db_data_capture:new_meituan_tuan_sales --to hive:stg:stg_new_meituan_tuan_sales --split '\001' --partition dt=$data_in_hive --overwrite overwrite --cond "select qunar_city_code, meituan_city_code , deal_id,hotel_id, hotel_seq , title, sub_title,address,room_night,room_night_flag ,origional_price,price, sold_count , score, valid_date, collected_count, commented_count, page_num from db_data_capture.new_meituan_tuan_sales where dt='$date_in_tuan_sales'"
}



create_table
today=$(date -d '0 days ago' +%Y%m%d)
endday=$today
startday=$(date -d "-1 days $today" +%Y%m%d)
while [[ $endday -gt $startday ]]
do
        data_today=$(date -d "-0 days $endday" +%Y-%m-%d)
	data_yestoday=$(date -d "-1 days $endday" +%Y-%m-%d)
        echo ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~from $data_today~~~~~~to $data_yestoday~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        import_data $data_today $data_yestoday
	endday=$(date -d "-1 days $endday" +%Y%m%d)

done
