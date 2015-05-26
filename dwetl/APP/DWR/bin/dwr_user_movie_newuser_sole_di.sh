#!/bin/sh
if [ -z $1 ];then
	date=$(date -d '1 days ago' '+%Y%m%d')
else 
	date=$( expr $1 : '.*\(\([0-9]-*\)\{8\}\).*' )
fi
read_date=$(date -d "0 day ago $date" +%Y-%m-%d)
date_ye=$(date -d "1 day ago $read_date" +%Y-%m-%d)
sudo -u desdev /home/q/hadoop/hive-default/bin/hive <<-EOF
	insert overwrite table dwr.dwr_user_movie_newuser_sole_di partition (dt='$read_date')
	select distinct '$read_date',coalesce((case when length(o1.id)>=12 then o1.user_id else o2.user_center_id end),o1.user_id) as center_id,o1.id,o1.uid
	from
	(select cast(id as string) as id,cast(user_id as string) as user_id,pay_time,uid from  
	(select user_id,first_value(pay_time) over (partition by user_id order by pay_time) as pay_time,
	 first_value(id) over (partition by user_id order by pay_time) as id,
	 first_value(uid) over (partition by user_id order by pay_time) as uid
	 from stg.stg_qunar_group_non_hotel_order where dt='$read_date'
	 and vid like "9%" and product_line=5 and state in('pay','partial_refund') and substring(from_unixtime(pay_time),0,10)<='$read_date') a 
	where substring(from_unixtime(a.pay_time),0,10)='$read_date') o1
	left outer join
	(select cast(id as string) as id,regexp_extract(profile,'\\\\d+',0) as user_center_id from stg.stg_qunar_group_public_user_da where dt='$read_date') o2
	on o1.user_id=o2.id and length(o1.id)<12;
	
EOF
export PGPASSWORD=1adff040-bdbb-4bc0-b9ea-c810af1a7a77&& /usr/bin/psql -h l-tuandb3.des.cn8.qunar.com -U des_report -d qunar_group -p 5432 -c "delete from report.dwr_user_movie_newuser_sole_di where stat_date='$read_date'"
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from hive:dwr:dwr_user_movie_newuser_sole_di --to tuandb3:qunar_group:report.dwr_user_movie_newuser_sole_di --split "\\001" --cond "select dt,user_center_id,first_order_no,user_device_id from dwr.dwr_user_movie_newuser_sole_di where dt='${read_date}'" --choose choose
