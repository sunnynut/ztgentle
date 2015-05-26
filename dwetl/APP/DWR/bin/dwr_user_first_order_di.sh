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
	insert overwrite table dwr.dwr_user_first_order_di partition (dt='$read_date')
	select user_center_id,
	case min(create_time) when min(movie) then 'movie'
	when min(hotel) then 'hotel' when min(apartment) then 'apartment'
	when min(flight) then 'flight' when min(group) then 'group'
	when min(ticket) then 'ticket' when min(train) then 'train'
	when min(travel) then 'travel' when min(car) then 'car'
	when min(local) then 'local' else 'other' end,
	min(create_time),min(movie),min(hotel),min(apartment),min(flight),
	min(group),min(ticket),min(train),min(travel),min(car),min(local),min(other) from 
	(select user_center_id,create_time,
	 if(business_type='movie',create_time,null) as movie,
	 if(business_type='hotel' or (business_type='group' and business_sub_type in ('3001001','3002001')),create_time,null) as hotel,
	 if(business_type='new_apartment',create_time,null) as apartment,
	 if(business_type='flight',create_time,null) as flight,
	 if(business_type='group' and business_sub_type not in ('3001001','3002001'),create_time,null) as group,
	 if(business_type='ticket',create_time,null) as ticket,
	 if(business_type='train',create_time,null) as train,
	 if(business_type='travel',create_time,null) as travel,
	 if(business_type='car',create_time,null) as car,
	 if(business_type='local',create_time,null) as local,
	 if(business_type='common',create_time,null) as other
	 from tmp.tmp_old_user where dt='$read_date') a group by user_center_id;
EOF
/usr/bin/mysql  -hl-dw03.des.cn8.qunar.com -P3306 -udb_data_discover -p07XDgXuYyS --database=dwr --default-character-set=utf8 -N -B --quick -e "truncate table dwr_user_first_order_di;"
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from hive:dwr:dwr_user_first_order_di --to dw03Mysql:dwr:dwr_user_first_order_di --split "\\001" --cond "select * from dwr.dwr_user_first_order_di where dt='${read_date}'" --choose choose
