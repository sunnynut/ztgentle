#!/bin/sh
if [ -z $1 ];then
	date=$(date -d '1 days ago' '+%Y%m%d')
else 
	date=$( expr $1 : '.*\(\([0-9]-*\)\{8\}\).*' )
fi
read_date=$(date -d "0 day ago $date" +%Y-%m-%d)
read_date_no=$(date -d "0 day ago $date" +%Y%m%d)
date_ye=$(date -d "1 day ago $read_date" +%Y-%m-%d)
/usr/bin/mysql  -hl-dw03.des.cn8.qunar.com -P3306 -udb_data_discover -p07XDgXuYyS --database=dwr --default-character-set=utf8 -N -B --quick -e "delete from seven_city_meituan_wareless where stat_date='$read_date'"
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from hive:dwr:dwr_user_movie_newuser_hotel_di --to dw03Mysql:dwr:seven_city_meituan_wareless --split "\\001" --cond "select '$read_date',nvl(a.city_code,b.city_code),nvl(a.sale,0),nvl(b.sale,0) from \
		 (select o2.city_code,sum(sales_cnt) as sale from \
		  (select hotel_seq,datediff(to_date,from_date)*room_num  as sales_cnt from default.mppb_order where \
		   month=substring('${read_date_no}',0,6) and substring(create_time,0,10)='${read_date}' and \
		   ppb_order_status in (3,4,8,11,17,18,21,31,33,35,37,39,47,108,109,131,150,151,152,155,204,221,222,229,230,231)) o1 \
		  inner join \
		  (select hotel_seq,city_code,city_name \
		   from default.dim_hotel_info where dt='${read_date_no}' and \
		   city_code in ('linfen','dandong','wulumuqi','nanning','weihai','yantai','tangshan','shenyang','changchun','haerbin')) o2 \
		  on o1.hotel_seq=o2.hotel_seq group by o2.city_code) a \
		 full outer join \
		 (select o2.city_code,sum(sales_cnt) as sale from \
		  (select hotel_seq,if(sales_cnt<0,0,sales_cnt) as sales_cnt from default.tuan_sales_valumn_update_hotel_seq  \
		   where dt='${read_date_no}' and category = '过夜房' \
		   and url != 'http://www.meituan.com/deal/7607399.html' \
		   and (sales_cnt <= 200 or (sales_cnt > 200 and selled_cnt - yes_selled_cnt = sales_cnt)) \
		   and hotel_seq!='' and hotel_seq is not null) o1 \
		  inner join \
		  (select hotel_seq,city_code,city_name \
		   from default.dim_hotel_info where dt='${read_date_no}' and \
		   city_code in ('linfen','dandong','wulumuqi','nanning','weihai','yantai','tangshan','shenyang','changchun','haerbin')) o2 \
		  on o1.hotel_seq=o2.hotel_seq group by o2.city_code) b \
		 on a.city_code=b.city_code" --choose choose
