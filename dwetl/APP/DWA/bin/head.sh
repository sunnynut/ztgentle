#!/bin/sh
read_date='2015-03-01'
read_date_no='20141101'
date_now='2015-03-12'
while [[ "$date_now" > "$read_date"  ]]
do
	sh dwa_meituan_sale_di.sh ${read_date}
	read_date=$(date -d "1 day ${read_date}" +%Y-%m-%d)
	read_date_no=$(date -d "1 day ${read_date_no}" +%Y%m%d)
done
