#!/bin/sh
source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile
create_table(){
$HIVE_HOME/bin/hive -e "
        set hive.table.parameters.default=null;
        create external table if not exists stg.stg_hotel_meituan_sales_from_new_meituan_sales(
        deal_id string,
        tuan_name string,
        hotel_seq string,
        city_code string,
        sold_qty_today bigint,
        sold_qty_yes bigint,
        sold_qty_per2day bigint,
        sold_qty_per3day bigint,
        sold_qty bigint
)
partitioned by (dt string)
row format delimited
fields terminated by '\001'
"
}
import_data(){
today=$1
yestoday=`date -d "-1 days $today" +%Y-%m-%d`
two_days_ago=`date -d "-2 days $today" +%Y-%m-%d`
three_days_ago=`date -d "-3 days $today" +%Y-%m-%d`
echo ~~~~~~~~~~~~from stg.deal_id_unique_from_meituan_sales $today~~~~~~~to stg.stg_hotel_meituan_sales_from_new_meituan_sales $today~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
$HIVE_HOME/bin/hive -e "
insert overwrite table stg.stg_hotel_meituan_sales_from_new_meituan_sales partition (dt='$today')
select today.deal_id,today.tuan_name,today.hotel_seq,today.qunar_city_code,
coalesce(today.sold_count,0) as sold_qty_today,
coalesce(yestoday.sold_count,coalesce(today.sold_count,0)) as sold_qty_yes,
coalesce(two_days_ago.sold_count,coalesce(yestoday.sold_count,coalesce(today.sold_count,0))) as sold_qty_per2day,
coalesce(three_days_ago.sold_count,coalesce(two_days_ago.sold_count,coalesce(yestoday.sold_count,coalesce(today.sold_count,0)))) as sold_qty_per3day,
coalesce(today.sold_count,0)-coalesce(yestoday.sold_count,coalesce(today.sold_count,0)) as sold_qty

from
	(select deal_id,tuan_name,hotel_seq,qunar_city_code,sold_count from stg.deal_id_unique_from_meituan_sales where dt='$today' and deal_id!='-1') today

left outer join
	(select deal_id,sold_count from stg.deal_id_unique_from_meituan_sales where dt='$yestoday' and deal_id!='-1') yestoday on today.deal_id=yestoday.deal_id
left outer join
	(select deal_id,sold_count from stg.deal_id_unique_from_meituan_sales where dt='$two_days_ago' and deal_id!='-1') two_days_ago on today.deal_id=two_days_ago.deal_id
left outer join
	(select deal_id,sold_count from stg.deal_id_unique_from_meituan_sales where dt='$three_days_ago' and deal_id!='-1') three_days_ago on today.deal_id=three_days_ago.deal_id
	
"
}
create_table
date=$(date -d '2 days ago' +%Y-%m-%d)
endday=$date
startday=`date -d "8 days $date" +%Y-%m-%d`
while [[ $startday -gt $endday  ]]  
do
  echo ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  import_data $endday
  endday=`date -d "-1 day $endday" +%Y-%m-%d`
done
