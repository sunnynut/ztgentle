#!/bin/bash

if [ -z $1 ];then
    start_day=$(date -d '-1 day' '+%Y%m%d')
else
    start_day=$( expr $1 : '.*\(\([0-9]-*\)\{8\}\).*' )
fi

date=$(date -d "0 day ago $start_day" +%Y%m%d)

base_dir=$(dirname $0)
cd /home/q/lixing.guo/daily/super_super_return
LOG="$base_dir/logs/supper_supper_return_$date.log"
echo $LOG
python import_dwr_supper_supper_return_compare_estimate_rpt_di.py $date
python update_meituan_of_qunar_rate.py $date
    
python import_seven_city_order_info.py $date 
python update_tuan_active_net_room_night.py $date
python update_tuan_net_loss_money.py $date
python update_tuan_sign_in_user_num.py $date
python update_hotel_active.py $date

python update_rate_and_sum.py $date
python supper_supper_return_compare_daily.py $date

