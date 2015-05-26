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
	insert overwrite table dwa.dwa_super_back_di partition (dt='$read_date')
	select checkout_date,city_code,sum(if(earn_type=1 and active='new',earn,0)),sum(if(earn_type=-1 and active='new',earn,0)),
	sum(if(earn_type=1 and active='super',earn,0)),sum(if(earn_type=-1 and active='super',earn,0)),
	sum(earn),
	sum(if(earn_type=1 and active='new',room_night,0)),sum(if(earn_type=-1 and active='new',room_night,0)),
	sum(if(earn_type=1 and active='super',room_night,0)),sum(if(earn_type=-1 and active='super',room_night,0)),
	sum(room_night)
	from
	(select city_code,room_night,coalesce(sell_price,0.0)-coalesce(real_back_rate,0.0)-
	 coalesce(regexp_extract(extend_info['basePrice'],'\\\\d+\\\\.\\\\d+',0),0.0) as earn,checkout_date,
	 case when coalesce(sell_price,0.0)-coalesce(real_back_rate,0.0)-
	 coalesce(regexp_extract(extend_info['basePrice'],'\\\\d+\\\\.\\\\d+',0),0.0)>=0 then 1 else -1 end as earn_type,
	 case when extend_info['sup_cashBack']='true' then 'super' 
	 when extend_info['product_type'] in ('21','22') then 'new' else 'non' end as active 
	 from default.dw_order_info_v21 where dt='$read_date_no' and order_status='CHECKED_OUT' and data_source='qta' and city_code in ('dandong','linfen','nanning','tangshan','weihai','wulumuqi','yantai','shenyang','haerbin','changchun') 
	 and checkout_date between date_sub('$read_date',7) and '$read_date')  o1
	group by city_code,checkout_date;
EOF
/usr/bin/mysql  -hl-dw03.des.cn8.qunar.com -P3306 -udb_data_discover -p07XDgXuYyS --database=dwa --default-character-set=utf8 -N -B --quick -e "delete from dwa_super_back_di where stat_date between date_sub('$read_date',interval 1 week) and date_sub('$read_date',interval 0 week) "
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from hive:dwa:dwa_super_back_di --to dw03Mysql:dwa:dwa_super_back_di --split "\\001" --cond "select * from dwa.dwa_super_back_di where dt='$read_date'" --choose choose
