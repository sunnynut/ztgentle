#!/bin/sh
if [ -z $1 ];then
	date=$(date -d '1 days ago' '+%Y%m%d')
else 
	date=$( expr $1 : '.*\(\([0-9]-*\)\{8\}\).*' )
fi
read_date=$(date -d "0 day ago $date" +%Y-%m-%d)
date_ye=$(date -d "1 day ago $read_date" +%Y-%m-%d)
sudo -u desdev /home/q/hadoop/hive-default/bin/hive <<-EOF

	insert overwrite table dwr.dwr_user_movive_newuser_di partition (dt='$read_date')
	select  '$read_date',a.center_id,a.id,a.user_device_id from
	(select distinct id,user_id,center_id,from_unixtime(pay_time) as pay_time,uid as user_device_id from 
	 (select first_value(id) over(partition by center_id order by pay_time) as id,user_id,center_id,
	  first_value(pay_time) over(partition by center_id order by pay_time) as pay_time,
	  first_value(uid) over(partition by center_id order by pay_time) as uid from
	  (select o1.id ,o1.user_id,coalesce((case when length(o1.id)>=12 then o1.user_id else o2.user_center_id end),o1.user_id) as center_id,pay_time,uid from 
	   (select cast(id as string) as id,cast(user_id as string) as user_id,pay_time,uid from stg.stg_qunar_group_non_hotel_order where dt='$read_date'
		and vid like "9%" and product_line=5 and state in('pay','partial_refund') and substring(from_unixtime(pay_time),0,10)='$read_date') o1
	   left outer join
	   (select cast(id as string) as id,regexp_extract(profile,'\\\\d+',0) as user_center_id from stg.stg_qunar_group_public_user_da where dt='$read_date') o2
	   on o1.user_id=o2.id and length(o1.id)<12) o ) t ) a
	left outer join
	(select user_center_id,min(create_time) as create_time from tmp.tmp_old_user where dt='$read_date' and 
	 ((substring(create_time,0,10)='$read_date' and business_type!='movie') or substring(create_time,0,10)<'$read_date') group by user_center_id) b 
	on a.center_id=b.user_center_id
	where (b.user_center_id is null and b.create_time is null) or 
	(b.create_time>a.pay_time and b.user_center_id is not null and substring(create_time,0,10)='$read_date');

EOF
export PGPASSWORD=1adff040-bdbb-4bc0-b9ea-c810af1a7a77&& /usr/bin/psql -h l-tuandb3.des.cn8.qunar.com -U des_report -d qunar_group -p 5432 -c "delete from report.dwr_user_movive_newuser_di where stat_date='$read_date'"
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from hive:dwr:dwr_user_movive_newuser_di --to tuandb3:qunar_group:report.dwr_user_movive_newuser_di --split "\\001" --cond "select stat_date,user_center_id,first_order_no,user_device_id from dwr.dwr_user_movive_newuser_di where dt='${read_date}'" --choose choose
