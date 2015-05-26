#!/bin/sh
source /etc/profile
if [ -z $1 ];then
	date=$(date -d '1 days ago' '+%Y%m%d')
else 
	date=$( expr $1 : '.*\(\([0-9]-*\)\{8\}\).*' )
fi
read_date=$(date -d "0 day ago $date" +%Y-%m-%d)
read_date_no=$(date -d "0 day ago $read_date" +%Y%m%d)
time=$2
sudo -u desdev /home/q/hadoop/hive-default/bin/hive <<-EOF  >>"/home/q/mingxiang.yan/hive_tmp/result${time}.log" 2>&1
	insert overwrite table des_bi.order_source_whole_app_tuan partition(dt='$read_date')                     
	select distinct o2.create_time,o2.order_id,o1.channel_id,o2.create_platform                    
	from (select distinct get_json_object(result_log['data'],'$.orderId') as id,channel_id,access_time  
	from des_bi.log_app_base_tuan_trade where biz_api_label='gp_createorder' and app_id='10010' and dt='$read_date') o1                         
	join (select order_id,create_platform,create_time from des_bi.order_create_tuan where dt='$read_date_no') o2                        
	on o1.id=o2.order_id                    
	join (select get_json_object(result_log['data'],'$.orderId') as id,min(distinct access_time) time  
	from des_bi.log_app_base_tuan_trade where biz_api_label='gp_createorder' and app_id='10010' and dt='$read_date' 
	group by get_json_object(result_log['data'],'$.orderId')) o3                       
	on o1.access_time=o3.time and o1.id=o3.id;

	select * from des_bi.log_app_base_tuan_trade where biz_api_label='gp_createorder' and app_id='10010' and dt='$read_date' limit 100;

	select * from des_bi.order_create_tuan where dt='$read_date_no' limit 100;

	select distinct o2.create_time,o2.order_id,o1.channel_id,o2.create_platform                    
	from (select distinct get_json_object(result_log['data'],'$.orderId') as id,channel_id,access_time  
	from des_bi.log_app_base_tuan_trade where biz_api_label='gp_createorder' and app_id='10010' and dt='$read_date') o1                         
	join (select order_id,create_platform,create_time from des_bi.order_create_tuan where dt='$read_date_no') o2                        
	on o1.id=o2.order_id                    
	join (select get_json_object(result_log['data'],'$.orderId') as id,min(distinct access_time) time  
	from des_bi.log_app_base_tuan_trade where biz_api_label='gp_createorder' and app_id='10010' and dt='$read_date' 
	group by get_json_object(result_log['data'],'$.orderId')) o3                       
	on o1.access_time=o3.time and o1.id=o3.id;
EOF
