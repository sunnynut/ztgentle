#!/bin/sh
if [ -z $1 ];then
	date=$(date -d '1 days ago' '+%Y%m%d')
else 
	date=$( expr $1 : '.*\(\([0-9]-*\)\{8\}\).*' )
fi
read_date=$(date -d "0 day ago $date" +%Y-%m-%d)
read_date_no=$(date -d "0 day ago $date" +%Y%m%d)
date_ye=$(date -d "1 day ago $read_date" +%Y-%m-%d)
sudo -u desdev /home/q/hadoop/hive-default/bin/hive <<-EOF
	insert overwrite table default.tuan_sales_valumn_update_hotel_seq partition (dt='$read_date_no')
	select city_ename,tuan_name,desc,url,price,selled_cnt,yes_selled_cnt,before_yes_selled_cnt,before_before_yes_selled_cnt,sales_cnt,
	new_tuan_team,category,if(o1.hotel_seq is null or trim(o1.hotel_seq)='',o2.hotel_seq,o1.hotel_seq) from
	(select *,if(tuan_name rlike '【',regexp_extract(tuan_name,'(【.*】)(.*)',2),trim(tuan_name)) as name 
	 from default.tuan_sales_valumn where dt='$read_date_no' and type='meituan') o1
	left outer join
	(select trim(hotel_name) as hotel_name,max(trim(hotel_seq)) as hotel_seq,city 
	 from default.ods_qhotel_hotel_linkage where wrapper_id='120meituan0' and dt='$read_date_no'
	 and (hotel_name is not null or trim(hotel_name)!='' or city is not null or trim(city)!='' or 
		 hotel_seq is not null or trim(hotel_seq)!='') group by trim(hotel_name),city) o2
	on o1.name=o2.hotel_name and o1.city_ename=o2.city;
EOF
