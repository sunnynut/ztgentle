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
	insert overwrite table dwa.dwa_meituan_sale_match_di partition (dt='${read_date}')
	select '${read_date}',o3.daqu,o3.quyu,o3.city_name,o3.city_code,o2.hotel_star,sum(sales_cnt) from 
	(select hotel_seq,if(sales_cnt<0,0,sales_cnt) as sales_cnt from default.tuan_sales_valumn_update_hotel_seq 
	 where dt='$read_date_no' and category = '过夜房' 
	 and url != 'http://www.meituan.com/deal/7607399.html' 
	 and hotel_seq!='' and hotel_seq is not null) o1
	inner join
	(select hotel_seq,city_name,hotel_star from dwr.dwr_hotel_info_di where dt='${read_date}') o2
	on o1.hotel_seq=o2.hotel_seq
	inner join
	(select * from dim.dim_city where dt='${read_date}') o3
	on o2.city_name=o3.city_name group by o3.daqu,o3.quyu,o3.city_name,o3.city_code,o2.hotel_star;

	insert overwrite table dwa.dwa_meituan_sale_not_match_di partition (dt='${read_date}')
	select '${read_date}',city_ename,sum(if(sales_cnt<0,0,sales_cnt)) 
	from default.tuan_sales_valumn_update_hotel_seq 
	 where dt='${read_date_no}' and category = '过夜房' 
	 and url != 'http://www.meituan.com/deal/7607399.html' 
	 and (hotel_seq='' or hotel_seq is null)
	 group by city_ename;
EOF

/usr/bin/mysql  -hl-dw03.des.cn8.qunar.com -P3306 -udb_data_discover -p07XDgXuYyS --database=dwa --default-character-set=utf8 -N -B --quick -e "delete from dwa_meituan_sale_match_di where stat_date='$read_date'"
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from hive:dwa:dwa_meituan_sale_match_di --to dw03Mysql:dwa:dwa_meituan_sale_match_di  --dir /user/desdev/hive/warehouse/dwa/dwa_meituan_sale_match_di/dt=${read_date}
/usr/bin/mysql  -hl-dw03.des.cn8.qunar.com -P3306 -udb_data_discover -p07XDgXuYyS --database=dwa --default-character-set=utf8 -N -B --quick -e "delete from dwa_meituan_sale_not_match_di where stat_date='$read_date'"
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from hive:dwa:dwa_meituan_sale_not_match_di --to dw03Mysql:dwa:dwa_meituan_sale_not_match_di  --dir /user/desdev/hive/warehouse/dwa/dwa_meituan_sale_not_match_di/dt=${read_date}
