#!/bin/bash

source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile


date=`date -d "20150109" +"%Y%m%d"`

#terminal=`date -d "20140901" +"%Y%m%d"`
terminal=`date -d "20141231" +"%Y%m%d"`


while [[ "$date">"$terminal" ]]
do
data_dt="xxx_"$date".dir"

echo $date
echo $data_dt

python /home/q/dwetl/APP/DWA/bin/dwa_team_hotel_room_type_max_phy_rank_qty_di.py $data_dt

date=`date -d "-1 day $date" +"%Y%m%d"`

done
