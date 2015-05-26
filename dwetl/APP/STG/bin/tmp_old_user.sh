#!/bin/sh
if [ -z $1 ];then
	date=$(date -d '1 days ago' '+%Y%m%d')
else 
	date=$( expr $1 : '.*\(\([0-9]-*\)\{8\}\).*' )
fi
read_date=$(date -d "0 day ago $date" +%Y-%m-%d)
date_ye=$(date -d "1 day ago $read_date" +%Y-%m-%d)
sudo -u desdev /home/q/hadoop/hive-default/bin/hive <<-EOF
	insert overwrite table tmp.tmp_old_user partition (dt='$read_date')
	select distinct o2.uid,o1.order_type,o1.sub_type,o1.create_time from
	(select min(get_json_object(order_info, '$.base.createTime')) as create_time,
	 order_type,
	 get_json_object(order_info, '$.base.orderType') as sub_type,
	 get_json_object(order_info, '$.base.user.userName') as user_name from default.corp_order_all 
	 group by get_json_object(order_info, '$.base.user.userName'),order_type,get_json_object(order_info, '$.base.orderType')) o1
	join 
	default.corp_user o2
	on o1.user_name=o2.user_name;

EOF
