#!/bin/bash

source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile


date=`date -d "20141114" +"%Y%m%d"`

terminal=`date -d "20150115" +"%Y%m%d"`


while [[ "$date"<"$terminal" ]]
do
data_dt="xxx_"$date".dir"

#echo $date
echo $data_dt

python /home/q/dwetl/APP/DWD/bin/dwd_com_team_ext_his_da.py $data_dt

date=`date -d "+1 day $date" +"%Y%m%d"`

done
