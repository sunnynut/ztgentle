#!/bin/sh
if [ -z $1 ];then
	date=$(date -d '1 days ago' '+%Y%m%d')
else 
	date=$( expr $1 : '.*\(\([0-9]-*\)\{8\}\).*' )
fi
read_date=$(date -d "0 day ago $date" +%Y-%m-%d)
read_date_no=$(date -d "0 day ago $date" +%Y%m%d)
date_ye=$(date -d "1 day ago $read_date" +%Y-%m-%d)
cd /home/q/changkai.lu/supports/star2 
python star2_traffic.py ${read_date} release 1>>star2_traffic.log 2>&1

