#!/bin/sh 
source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile

$HIVE_HOME/bin/hive -e "
    create table if not exists dwr.dwr_hotel_meituan_room_type_di(
    city_code string,
    city_code_meituan string,
    hotel_seq string,
    hotel_name string,
    hotel_name_meituan string,
    physical_room_type string,
    room_type_confidence string,
    room_type_meituan string,
    orginal_price decimal,
    user_price decimal,
    category string
)
partitioned by (dt string)
row format delimited
fields terminated by '/001'
"


import_data(){
dt=$1
date_in_hotel_info=`date -d "-0 days $dt" +%Y%m%d`
echo "~~~~~~~~~~~~~~~~~~~from stg_new_meituan_room_type&dim_hotel_info $date_in_hotel_info~~~~~~~~~to dwr_hotel_meituan_room_type_di $dt~~~~~~~~~~~"
$HIVE_HOME/bin/hive -e "

    insert overwrite table dwr.dwr_hotel_meituan_room_type_di partition (dt='$dt')
    select qunar_city_code,meituan_city_code,room.hotel_seq,info.hotel_name,name,
    physical_room_type,rtid,meituan_room_type_name,orginal_price,0.0,if(is_kuaiding=1,'快订','团购') 
    from 
    (select * from stg.stg_new_meituan_room_type room where room.dt='$dt') room
    inner join 
    (
    select hotel_seq,hotel_name from default.dim_hotel_info where dt='$date_in_hotel_info'
    ) info
    on room.hotel_seq=info.hotel_seq;
"
}
today=$(date -d '29 days ago' +%Y%m%d)
endday=$today
startday=$(date -d "-30 days $today" +%Y%m%d)
while [[ $endday -gt $startday ]]
do
        date_table=$(date -d "-1 days $endday" +%Y-%m-%d)
        import_data $date_table
        endday=$(date -d "-1 days $endday" +%Y%m%d)

done


