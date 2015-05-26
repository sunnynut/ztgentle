#!/bin/sh
source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile

create_table(){
echo create table stg.deal_id_unique_from_meituan_tuan_sales
$HIVE_HOME/bin/hive -e "
        create table if not exists stg.deal_id_unique_from_meituan_tuan_sales(
        deal_id string,
	tuan_name string,
	hotel_seq string,
	qunar_city_code string,
	sold_count bigint,
	room_night bigint
)
partitioned by (dt string)
row format delimited
fields terminated by '\001'
 "
}
insert_data(){
today=$1
echo ~~~~~~~~~~~~~~~~~~~~~~~from stg.new_meituan_tuan_sales:$today~~~~~~~~~~~to stg.deal_id_unique_from_meituan_tuan_sales:$today~~~~~~~~~~~~
	$HIVE_HOME/bin/hive -e "
	insert overwrite table stg.deal_id_unique_from_meituan_tuan_sales partition (dt='$today')
	select deal_id,collect_set(title)[0] as tuan_name,concat_ws(',',collect_set(hotel_seq)) as hotel_seq,concat_ws(',',collect_set(qunar_city_code)) as qunar_city_code,
	max(case when sold_count>=0 then sold_count else 0 end) as sold_count,
	max(case when room_night<=0 then 1 else room_night end) as room_night
	from stg.stg_new_meituan_tuan_sales 
	where dt='$today'
	group by deal_id
	"
}


today=$(date -d '2 days ago' +%Y%m%d)
endday=$today
startday=$(date -d "-1 days $today" +%Y%m%d)
while [[ $endday -gt $startday ]]
do
        data_today=$(date -d "-0 days $endday" +%Y-%m-%d)
        insert_data $data_today
        endday=$(date -d "-1 days $endday" +%Y%m%d)

done
