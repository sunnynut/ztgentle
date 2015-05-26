#!/bin/bash

source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile


date=`date -d "20150202" +"%Y%m%d"`

terminal=`date -d "20150204" +"%Y%m%d"`


while [[ "$date"<"$terminal" ]]
do
data_dt="xxx_"$date".dir"

echo $date
echo $data_dt

python /home/q/dwetl/APP/DIM/bin/dim_team_his_da.py $data_dt

date=`date -d "+1 day $date" +"%Y%m%d"`

done

