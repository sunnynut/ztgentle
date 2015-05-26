#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

def load_data_to_pg():

    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_prd_show_schedule.py """ + data_dt
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to tuandb3:qunar_group:report.prd_show_schedule --from movieMysql:des_movie:prd_show_schedule  --split '\\001'  --choose choose --cond "select id,movie_id,cinema_id,hall_id,agent_id,case when show_start_time = '0000-00-00 00:00:00' then str_to_date('1970-01-01 00:00:00','%Y-%m-%d %h:%i:%s') else show_start_time end as show_start_time, case when show_end_time = '0000-00-00 00:00:00' then str_to_date('1970-01-01 00:00:00','%Y-%m-%d %h:%i:%s') else show_end_time end as show_end_time,case when stop_sell_time = '0000-00-00 00:00:00' then str_to_date('1970-01-01 00:00:00','%Y-%m-%d %h:%i:%s') else stop_sell_time end as stop_sell_time,language,hall_name,dimensional,carrier,sale_price,market_price,min_price,cost_price,service_fee,available_seats,hall_seats,cinema_code,hall_type,agent_movie_code,schedule_code,inner_schedule_code,hall_code,sale_num,ext_info,ori_show_type,agent_last_update_time,through_flag,seq_no,status,create_time,update_time from des_movie.prd_show_schedule \""""
    print SH_CMD2
    os.system(SH_CMD2)

def main():
    #hive=Hive()
    #hive.set_date(data_dt)
    #for sql in sqls:
    #    hive.add_sql(sql)
    #hive.run()
    load_data_to_pg()
if __name__ == '__main__':
    main()


