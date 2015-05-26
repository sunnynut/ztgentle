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
read_date_no=$(date -d "0 day ago $date" +%Y%m%d)
date_ye=$(date -d "1 day ago $read_date" +%Y-%m-%d)
hive <<-EOF 
			alter table rpt_room_night_stats_gb_seq add if not exists partition (dt="${read_date_no}") location "/user/qhstats/rpt/rpt_room_night_stats_gb_seq/dt=${read_date_no}";
EOF
