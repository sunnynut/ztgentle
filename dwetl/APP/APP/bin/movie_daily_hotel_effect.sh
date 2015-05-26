#!/bin/bash

if [ -z $1 ];then
    start_day=$(date -d '-1 day' '+%Y%m%d')
else
    start_day=$( expr $1 : '.*\(\([0-9]-*\)\{8\}\).*' )
fi

date=$(date -d "0 day ago $start_day" +%Y%m%d)

base_dir=$(dirname $0)
cd /home/q/changkai.lu/supports/movie
python movie_daily_hotel_effect.py

