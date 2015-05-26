#!/bin/sh
source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile

create_table(){
echo ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~create table :dwr.dwr_hotel_meituan_sale_di_union_all~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
$HIVE_HOME/bin/hive -e "
        create external table if not exists dwr.dwr_hotel_meituan_sale_di_union_all(
        deal_id string,
        tuan_name string,
        hotel_seq string,
        city_code string,
        is_hour_room string,
        is_vouchers string,
        sold_qty_today bigint,
        sold_qty_yes bigint,
        sold_qty_per2day bigint,
        sold_qty_per3day bigint,
        sold_qty bigint,
        room_night bigint
)
partitioned by (dt string)
row format delimited
fields terminated by '\001'
"
}

import_data(){
today=$1
echo "~~~~~~~~~~~~~~~~~~~~~~~union all:$today;dwr.dwr_hotel_meituan_sale_di++++++++++++++stg.stg_hotel_meituan_sales_from_new_meituan_sale~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
	$HIVE_HOME/bin/hive -e "
	insert overwrite table dwr.dwr_hotel_meituan_sale_di_union_all partition ( dt='$today' )
	select max(deal_id),
	concat_ws(',',collect_set(tuan_name)),
	concat_ws(',',collect_set(hotel_seq)),
	concat_ws(',',collect_set(city_code)),
	max(trim(concat_ws(' ',is_hour_room))),
	max(trim(concat_ws(' ',is_vouchers))),
	max(sold_qty_today),
	max(sold_qty_yes),
	max(sold_qty_per2day),
	max(sold_qty_per3day),
	max(sold_qty),
	max(trim(concat_ws(' ',room_night)))
from
	(select deal_id,tuan_name,hotel_seq, city_code,is_hour_room ,is_vouchers,sold_qty_today,sold_qty_yes,sold_qty_per2day,sold_qty_per3day,sold_qty,room_night 
		 from dwr.dwr_hotel_meituan_sale_di where dt='$today' and deal_id !='-1'
	union all
	select deal_id,tuan_name,hotel_seq,city_code,' ' as is_hour_room,' ' as is_vouchers,sold_qty_today,sold_qty_yes,sold_qty_per2day,sold_qty_per3day,sold_qty,' ' room_night
		from stg.stg_hotel_meituan_sales_from_new_meituan_sales where dt='$today' and deal_id !='-1') u_table
	group by deal_id;


"
}
date=$(date -d '8 days ago' +%Y-%m-%d)
endday=$date
startday=`date -d "-2 days $date" +%Y-%m-%d`
while [[ $startday -gt $endday  ]]  
do
  import_data $endday
  endday=`date -d "-1 day $endday" +%Y-%m-%d`
done
