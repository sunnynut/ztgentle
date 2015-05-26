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
	insert overwrite table dwr.dwr_hotel_meituan_sale_match_detail_di partition(dt='${read_date}')
	select o3.daqu,o3.quyu,o2.city_name,o2.hotel_star,o2.hotel_seq,o2.hotel_name,o2.baidu_point,sum(sales_cnt) from 
	(select hotel_seq,if(sales_cnt<0,0,sales_cnt) as sales_cnt from default.tuan_sales_valumn_update_hotel_seq 
	where dt='$read_date_no' and category = '过夜房' 
	and url != 'http://www.meituan.com/deal/7607399.html' 
	and hotel_seq!='' and hotel_seq is not null) o1
	inner join
	(select hotel_seq,city_code,city_name,baidu_point,hotel_name,
	case when hotel_grade in ('3','4') and coalesce(onlinechannel,'abc') NOT IN('bnb','bnb|gongyu','gongyu') then '1' 
	when hotel_grade in ('2') and coalesce(onlinechannel,'abc') NOT IN('bnb','bnb|gongyu','gongyu') then '2' 
	when hotel_grade in ('5') and coalesce(onlinechannel,'abc') NOT IN('bnb','bnb|gongyu','gongyu') then '3' 
	when hotel_grade in ('1') and coalesce(onlinechannel,'abc') NOT IN('bnb','bnb|gongyu','gongyu') then '4'
	when coalesce(onlinechannel,'abc')  IN('bnb','bnb|gongyu') then '5' else '6'  END as hotel_star 
	from default.dim_hotel_info where dt='$read_date_no') o2
	on o1.hotel_seq=o2.hotel_seq
	inner join
	(select * from dim.dim_city where dt='$read_date') o3
	on o2.city_code=o3.city_code group by o3.daqu,o3.quyu,o2.city_name,o2.hotel_seq,o2.baidu_point,o2.hotel_star,o2.hotel_name;
EOF

/usr/bin/mysql  -hl-dw03.des.cn8.qunar.com -P3306 -udb_data_discover -p07XDgXuYyS --database=dwr --default-character-set=utf8 -N -B --quick -e "delete from dwr_hotel_meituan_sale_match_detail_di where stat_date='$read_date'"
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from hive:dwr:dwr_hotel_meituan_sale_match_detail_di --to dw03Mysql:dwr:dwr_hotel_meituan_sale_match_detail_di  --cond "select regexp_replace(dt,'-',''),* from dwr.dwr_hotel_meituan_sale_match_detail_di where dt='${read_date}'" --choose choose --split "\001"
