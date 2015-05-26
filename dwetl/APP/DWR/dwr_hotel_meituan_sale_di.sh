#!/bin/sh
source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile


$HIVE_HOME/bin/hive -e "
	set hive.table.parameters.default=null;
        create external table if not exists dwr.dwr_hotel_meituan_sale_di_without_room_night(
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


import_data(){
today=$1
yestoday=`date -d "-1 days $today" +%Y-%m-%d`
two_days_ago=`date -d "-2 days $today" +%Y-%m-%d`
three_days_ago=`date -d "-3 days $today" +%Y-%m-%d`
#today.sold_count应该是不可能为null的
echo ~~~~~~~~~~~~~~~~from deal_id_unique_from_meituan_tuan_sales $today ~~~~~~~~~~~~~~~ to dwr_hotel_meituan_sale_di_with_room_night $today~~~~~~~~~~~~~~~~~~~~~
sudo -u desdev $HIVE_HOME/bin/hive -e "
insert overwrite table dwr.dwr_hotel_meituan_sale_di partition (dt='$today')
select today.deal_id,today.tuan_name,today.hotel_seq,today.qunar_city_code,
case when meituan_sales.is_hour_room='False' then 'False' when meituan_sales.is_hour_room='True' then 'True' else 'unknown' end,
case when meituan_sales.is_vouchers='False' then 'False' when meituan_sales.is_vouchers='True' then 'True' else 'unknown' end,
coalesce(today.sold_count,0),
coalesce(yestoday.sold_count,coalesce(today.sold_count,0)),
coalesce(two_days_ago.sold_count,coalesce(yestoday.sold_count,coalesce(today.sold_count,0))),
coalesce(three_days_ago.sold_count,coalesce(two_days_ago.sold_count,coalesce(yestoday.sold_count,coalesce(today.sold_count,0)))),
case when cast(coalesce(today.sold_count,0)-coalesce(yestoday.sold_count,coalesce(today.sold_count,0)) as bigint)=coalesce(today.sold_count,0) then cast(0 as bigint) 
else cast(coalesce(today.sold_count,0)-coalesce(yestoday.sold_count,coalesce(today.sold_count,0)) as bigint) end,
cast(coalesce(today.room_night,0) as bigint)
from
  (select deal_id,tuan_name,hotel_seq,qunar_city_code,sold_count,room_night from stg.deal_id_unique_from_meituan_tuan_sales where dt='$today') today
left outer join 
  (select deal_id,sold_count from stg.deal_id_unique_from_meituan_tuan_sales where dt='$yestoday') yestoday
on
  today.deal_id=yestoday.deal_id 
left outer join
(select deal_id,sold_count from stg.deal_id_unique_from_meituan_tuan_sales where dt='$two_days_ago') two_days_ago on today.deal_id=two_days_ago.deal_id
left outer join
(select deal_id,sold_count from stg.deal_id_unique_from_meituan_tuan_sales where dt='$three_days_ago') three_days_ago on today.deal_id=three_days_ago.deal_id
left outer join
(select deal_id,collect_set(is_hour_room)[0] as is_hour_room ,collect_set(is_vouchers)[0] as is_vouchers from stg.stg_new_meituan_sales where dt='$today' group by deal_id) meituan_sales on today.deal_id=meituan_sales.deal_id;
"
}
# 设置定时任务时需要更改为1date=$(date -d '5 days ago' +%Y-%m-%d)
endday=$(date -d '2 days ago' +%Y-%m-%d)
startday=`date -d "8 days $endday" +%Y-%m-%d`
while [[ $startday -gt $endday  ]]  
do
  echo ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  import_data $endday
  endday=`date -d "-1 day $endday" +%Y-%m-%d`
done
