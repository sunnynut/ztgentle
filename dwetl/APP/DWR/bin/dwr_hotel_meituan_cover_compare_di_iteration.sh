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
	insert overwrite table dwr.dwr_hotel_meituan_cover_compare_di partition (dt='$read_date')
	select q3.daqu,q3.quyu,q2.city_name,q2.hotel_star,q1.hotel_seq,sum(c1),sum(c2),sum(c3),sum(h1),sum(h2),sum(h3),sum(t1),sum(t2),sum(t3) from
	(select 
	hotel_seq,case when cash_flag=1 and meituan_flag=0 then 1 else 0 end as c1, 
	case when cash_flag=0 and meituan_flag=1 then 1 else 0 end as c2, 
	case when cash_flag=1 and meituan_flag=1 then 1 else 0 end as c3, 
	case when prepay_flag=1 and meituan_flag=0 then 1 else 0 end as h1 , 
	case when prepay_flag=0 and meituan_flag=1 then 1 else 0 end as h2, 
	case when prepay_flag=1 and meituan_flag=1 then 1 else 0 end as h3, 
	case when team_flag=1 and meituan_flag=0 then 1 else 0 end as t1, 
	case when team_flag=0 and meituan_flag=1 then 1 else 0 end as t2, 
	case when team_flag=1 and meituan_flag=1 then 1 else 0 end  as t3
	from( select hotel_seq, 
		case when sum(cash_flag)>=1 then 1 else 0 end as cash_flag, 
		case when sum(prepay_flag)>=1 then 1 else 0 end as prepay_flag, 
		case when sum(team_flag)>=1 then 1 else 0 end as team_flag, 
		case when sum(meituan_flag)>=1 then 1 else 0 end as meituan_flag 
		from( select hotel_seq, 
			case when code_base in('wiqunarqta2','wiqunarqta3','wiqunarqta5','wiqtafshmin','qtav2000001','qtav2000002','qtav2000004','qtav2000005') and payment=0 then 1 else 0 end as cash_flag,
			case when code_base in('wiqunarqta2','wiqunarqta3','wiqunarqta5','wiqtafshmin','qtav2000001','qtav2000002','qtav2000004','qtav2000005') and payment=1 then 1 else 0 end as prepay_flag,
			case when code_base in('wituanhotel') then 1 else 0 end as team_flag,
			case when code_base in('120meituan0') then 1 else 0 end as meituan_flag
			from default.dw_hotel_price_log 
			where dt='$read_date_no' 
			and code_base in('wiqunarqta2','wiqunarqta3','wiqunarqta5','wiqtafshmin','qtav2000001','qtav2000002','qtav2000004','qtav2000005','120meituan0','wituanhotel') 
			group by hotel_seq, 
			case when code_base in('wiqunarqta2','wiqunarqta3','wiqunarqta5','wiqtafshmin','qtav2000001','qtav2000002','qtav2000004','qtav2000005') and payment=0 then 1 else 0 end,
			case when code_base in('wiqunarqta2','wiqunarqta3','wiqunarqta5','wiqtafshmin','qtav2000001','qtav2000002','qtav2000004','qtav2000005') and payment=1 then 1 else 0 end, 
			case when code_base in('wituanhotel') then 1 else 0 end,case when code_base in('120meituan0') then 1 else 0 end)p 
		group by hotel_seq) t) q1
		inner join
		(select hotel_seq,daqu,city_name,hotel_star from dwr.dwr_hotel_info_di where dt='2015-04-07') q2
		on q1.hotel_seq=q2.hotel_seq
		inner join
		(select quyu,daqu,city_name from dim.dim_city where dt='2015-04-07') q3
		on q2.city_name=q3.city_name
		group by q3.daqu,q3.quyu,q2.city_name,q2.hotel_star,q1.hotel_seq;
EOF
/usr/bin/mysql  -hl-dw03.des.cn8.qunar.com -P3306 -udb_data_discover -p07XDgXuYyS --database=dwr --default-character-set=utf8 -N -B --quick -e "delete from dwr_hotel_meituan_cover_compare_di where stat_date='$read_date'"
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from hive:dwr:dwr_hotel_meituan_cover_compare_di --to dw03Mysql:dwr:dwr_hotel_meituan_cover_compare_di  --cond "select dt,* from dwr.dwr_hotel_meituan_cover_compare_di where dt='$read_date'" --split '\001' --choose choose
