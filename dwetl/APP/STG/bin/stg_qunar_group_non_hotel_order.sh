#!/bin/sh
if [ -z $1 ];then
	date=$(date -d '1 days ago' '+%Y%m%d')
else 
	date=$( expr $1 : '.*\(\([0-9]-*\)\{8\}\).*' )
fi
read_date=$(date -d "0 day ago $date" +%Y-%m-%d)
date_ye=$(date -d "1 day ago $read_date" +%Y-%m-%d)
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to hive:stg:stg_qunar_group_non_hotel_order --from  tuandb3:qunar_group:public.non_hotel_order --overwrite overwrite --partition dt=${read_date} --map holiday_tts_info,trace_url_info
