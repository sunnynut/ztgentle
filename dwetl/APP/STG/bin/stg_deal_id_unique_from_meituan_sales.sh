#!/bin/sh
source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile

create_table(){
echo create table stg.stg_deal_id_unique_from_meituan_sales
$HIVE_HOME/bin/hive -e "
        create table if not exists stg.deal_id_unique_from_meituan_sales(
        deal_id string,
	hotel_seq string,
	hotel_id string,
	qunar_city_code string,
        tuan_name string comment 'name from new_meituan_sales',
	title string comment 'title from new_meituan_sales',
	physical_room_type string,
	room_type_confidence string,
	room_type_meituan string,
	price decimal,
	sold_count bigint,
	is_hour_room string,
	is_vouchers string
)
partitioned by (dt string)
row format delimited
fields terminated by '\001'
 "
}
insert_data(){
today=$1
echo ~~~~~~~~~~~~~~~~~~~~~~~from stg.new_meituan_sales:$today~~~~~~~~~~~to stg.deal_id_unique_from_meituan_sales:$today~~~~~~~~~~~~
        $HIVE_HOME/bin/hive -e "
        insert overwrite table stg.deal_id_unique_from_meituan_sales partition (dt='$today')
        select deal_id,
	concat_ws(',',collect_set(hotel_seq)) as hotel_seq,
	concat_ws(',',collect_set(hotel_id)) as hotel_id,
	concat_ws(',',collect_set(qunar_city_code)) as qunar_city_code,
	collect_set(name)[0] as tuan_name,
	collect_set(title)[0] as title,
	collect_set(physical_room_type)[0] as physical_room_type,
	collect_set(case when rtid='-1' then 'unknown' else rtid end)[0] as room_type_confidence,
	collect_set(room_type)[0] as room_type_meituan,
	max(case when price<cast(0 as decimal) then cast(0 as decimal) else cast(price as decimal) end) as price,
        max(case when solds='-1' then '0' else solds end) as sold_count,
	collect_set(case when is_hour_room='-1' then 'unknown' else is_hour_room end)[0], 
	collect_set(case when is_vouchers='None' then 'unknown' when is_vouchers='-1' then 'unknown' else is_hour_room end) [0]
        from stg.stg_new_meituan_sales 
        where dt='$today'
        group by deal_id
        "
}

create_table
endday=$(date -d '2 days ago' +%Y%m%d)
startday=$(date -d "-29 days $endday" +%Y%m%d)
while [[ $endday -gt $startday ]]
do
        data_today=$(date -d "-0 days $endday" +%Y-%m-%d)
        insert_data $data_today
        endday=$(date -d "-1 days $endday" +%Y%m%d)

done

