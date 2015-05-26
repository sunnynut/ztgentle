#!/bin/bash

source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile


date=`date -d "20150426" +"%Y%m%d"`

terminal=`date -d "20150428" +"%Y%m%d"`
#terminal=`date -d "20140929" +"%Y%m%d"`


while [[ "$date"<"$terminal" ]]
do
data_dt="xxx_"$date".dir"

echo $date
echo $data_dt

python /home/q/dwetl/APP/DWR/bin/dwr_team_transaction_di.py $data_dt
python /home/q/dwetl/APP/DWR/bin/dwr_team_all_stat_di.py $data_dt
python /home/q/dwetl/APP/DWR/bin/dwr_team_all_stat_31days_di.py $data_dt

date=`date -d "+1 day $date" +"%Y%m%d"`

done
