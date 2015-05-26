#!/bin/bash

source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile


date=`date -d "20120801" +"%Y%m%d"`

terminal=`date -d "20110801" +"%Y%m%d"`


while [[ "$date">"$terminal" ]]
do
data_dt="xxx_"$date".dir"

#echo $date
echo $data_dt

python /home/q/dwetl/APP/DBS/bin/mppb_order.py $data_dt

date=`date -d "-1 month $date" +"%Y%m%d"`

done
