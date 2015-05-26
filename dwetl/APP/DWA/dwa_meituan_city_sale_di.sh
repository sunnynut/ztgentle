#!/bin/bash

source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile


date=`date -d "20140331" +"%Y%m%d"`

#terminal=`date -d "20140901" +"%Y%m%d"`
terminal=`date -d "20140228" +"%Y%m%d"`


while [[ "$date"<"$terminal" ]]
do
data_dt="xxx_"$date".dir"

echo $date
echo $data_dt

python /home/q/dwetl/APP/DWA/bin/dwa_meituan_city_sale_di.py $data_dt

date=`date -d "-1 day $date" +"%Y%m%d"`

done
