#!/bin/sh
read_date='2015-03-06'
read_date_no='20141101'
date_now='2015-02-19'
while [[ "$date_now" < "$read_date"  ]]
do
	sh seven_city_meituan_wareless.sh ${read_date}
	read_date=$(date -d "-1 day ${read_date}" +%Y-%m-%d)
	read_date_no=$(date -d "-1 day ${read_date_no}" +%Y%m%d)
done
