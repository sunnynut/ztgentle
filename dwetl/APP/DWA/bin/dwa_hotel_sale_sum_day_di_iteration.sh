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
	insert overwrite table dwa.dwa_hotel_sale_sum_day_di partition(dt='$read_date')
	select daqu,quyu,o3.city_name,o3.city_code,hotel_star,platform_type,
	sum(estimate_cash_room_night),sum(estimate_prepay_room_night),sum(estimate_nightsell_room_night),
	sum(estimate_ota_room_night),sum(estimate_team_room_night),sum(actural_cash_room_night),
	sum(actural_prepay_room_night),sum(actural_nightsell_room_night),sum(actural_ota_room_night),sum(actural_team_room_night),sum(estimate_other_room_night)
	from 
	(select * from dwr.dwr_hotel_sale_day_di where dt='$read_date') o1
	inner join
	(select hotel_seq,city_name,hotel_star
	 from dwr.dwr_hotel_info_di where dt='2015-04-07') o2
	on o1.hotel_seq=o2.hotel_seq
	inner join
	(select daqu,quyu,city_name,city_code from dim.dim_city where dt='2015-04-07') o3
	on o2.city_name=o3.city_name
	group by daqu,quyu,o3.city_name,o3.city_code,hotel_star,platform_type;
	
EOF
/usr/bin/mysql  -hl-dw03.des.cn8.qunar.com -P3306 -udb_data_discover -p07XDgXuYyS --database=dwa --default-character-set=utf8 -N -B --quick -e "delete from dwa_hotel_sale_sum_day_di where stat_date='$read_date'"
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from hive:dwa:dwa_hotel_sale_sum_day_di --to dw03Mysql:dwa:dwa_hotel_sale_sum_day_di  --cond "select dt,* from dwa.dwa_hotel_sale_sum_day_di where dt='${read_date}'" --split '\001' --choose choose
