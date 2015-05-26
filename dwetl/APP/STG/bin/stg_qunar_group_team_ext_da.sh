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

python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from tuandb3:qunar_group:public.team_ext --to hive:stg:stg_qunar_group_team_ext_da --partition dt=$day --overwrite overwrite
