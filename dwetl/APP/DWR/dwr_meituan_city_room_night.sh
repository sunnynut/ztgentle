#!/bin/bash

source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile

base_dir=$(dirname $0)

if [ -z $1 ];then
  start_date=$(date -d '1 days ago' '+%Y%m%d')
  end_date=$(date -d '1 days ago' '+%Y%m%d')
  start_date_str=$(date -d '1 days ago' '+%Y-%m-%d')
  end_date_str=$(date -d '1 days ago' '+%Y-%m-%d')
else
  start_date=$(date -d '0 days'$1 '+%Y%m%d')
  end_date=$(date -d '0 days'$2 '+%Y%m%d')
  start_date_str=$(date -d '0 days'$1 '+%Y-%m-%d')
  end_date_str=$(date -d '0 days'$2 '+%Y-%m-%d')
fi

echo $start_date
echo $end_date

LOG="$base_dir/logs/import_meituan_room_night_$start_date.log"
mkdir -p $base_dir/logs

import_meituan_room_night() {
/usr/bin/mysql  -hl-dw03.des.cn8.qunar.com -P3306 -udb_data_discover -p07XDgXuYyS --database=dwr --default-character-set=utf8 -N -B --quick -e "delete from dwr_meituan_city_room_night where stat_date='$date'"

sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from hive:dwr:dwr_user_movie_newuser_hotel_di --to dw03Mysql:dwr:dwr_meituan_city_room_night --split "\\001" --cond "select a.dt, a.city_ename, sum(a.sales_cnt) \
from \
( \
select dt, city_ename, sales_cnt \
from default.tuan_sales_valumn \
where dt = '$date' and type = 'meituan' \
and category = '过夜房' \
and tuan_name not like '%多城市%' \
) a \
join \
( \
select distinct city_code \
from dim.dim_city \
where dt = '$date_str' \
) b \
on a.city_ename = b.city_code \
group by a.dt, a.city_ename" --choose choose
}


date=$start_date
echo $date

date_str=$start_date_str
echo $date_str

while [[ $date -le $end_date ]]
do
    echo "date:"$date
    LOG="$base_dir/logs/import_meituan_room_night_$date.log"
    echo $LOG
    import_meituan_room_night

    date=$(date -d "+1 day"$date '+%Y%m%d')
    echo $date
    date_str=$(date -d "+1 day"$date_str '+%Y-%m-%d')
    echo $date_str
done
