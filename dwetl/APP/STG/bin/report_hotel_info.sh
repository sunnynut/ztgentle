#!/bin/sh
if [ -z $1 ];then
	date=$(date -d '1 days ago' '+%Y%m%d')
else 
	date=$( expr $1 : '.*\(\([0-9]-*\)\{8\}\).*' )
fi
read_date=$(date -d "0 day ago $date" +%Y-%m-%d)
date_ye=$(date -d "1 day ago $read_date" +%Y-%m-%d)
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from crm_statistic:crm_statistic:report_hotel_info --to hive:default:report_hotel_info --split '\001' --partition "dt=${read_date}" --choose choose --overwrite overwrite
