#!/bin/sh
source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile

if [ -z "$1" ]
then
        date=$(date -d '1 days ago' +%Y%m%d)
else
        date=$(date +%Y%m%d)
fi

if [ -z "$@" ]
then
        enddate=$date
else
        enddate=`date -d "+ 0 days $2" +%Y%m%d`
fi

import_data(){
date_dash=$1
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from dw04Mysql:db_data_capture:new_meituan_sales --to hive:stg:stg_meituan_room_type_order_by_solds_limit10000 --split '\001' --partition dt=$date_dash --overwrite overwrite --cond "select * from db_data_capture.new_meituan_sales as ms ORDER BY ms.solds DESC LIMIT 10000
"
}

create_table(){
$HIVE_HOME/bin/hive -e "
create table if not exists stg.stg_meituan_room_type_order_by_solds_limit10000(
id string,
dt string,
qunar_city_code string,
meiuan_city_code string,
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
price string,
breakfast string,
wifi string,
solds string,
is_hour_room string,
is_vouchers string,
has_deal string
)       
partitioned by (dt string)
row format delimited
fields terminated by '\001'     
"
}
echo $date
create_table
import_data $data_dash
