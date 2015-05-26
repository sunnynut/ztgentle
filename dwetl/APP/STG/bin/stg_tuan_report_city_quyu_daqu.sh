#!/bin/bash

source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile

if [ -z $1 ];then
day=`date -d "yesterday" +"%Y-%m-%d"`
else
tmp=${1/'.dir'/}
tmp=${tmp:(-8)}
day=`date -d "$tmp" +"%Y-%m-%d"`
fi

echo $day

python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from tuanreport:tuan_report:city_quyu_daqu --to hive:stg:stg_tuan_report_city_quyu_daqu --overwrite overwrite
