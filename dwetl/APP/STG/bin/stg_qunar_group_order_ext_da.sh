#!/bin/sh
source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile
if [ -z $1 ];then
    date=$(date -d '1 days ago' '+%Y%m%d')
else 
	date=$( expr $1 : '.*\(\([0-9]-*\)\{8\}\).*' )
fi
read_date=$(date -d "0 day ago $date" +%Y-%m-%d)
date_ye=$(date -d "1 day ago $read_date" +%Y-%m-%d)
sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to hive:stg:stg_qunar_group_order_ext_da --from tuandb3:qunar_group:public.order_ext --split "\\001" --partition dt=${read_date} --overwrite overwrite
