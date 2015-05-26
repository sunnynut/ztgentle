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

    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_prd_movie.py """ + data_dt
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to tuandb3:qunar_group:report.prd_movie --from movieMysql:des_movie:prd_movie  --split '\\001'  --choose choose --cond "select id,gov_movie_code,name,eng_name,one_sentence,case when premiere_day = '0000-00-00' then str_to_date('1970-01-01','%Y-%m-%d') else premiere_day end as premiere_day,duration,director,protagonist,country,area,score,head_img,album,dimensional,carrier,produce_crop,is_new,language,synopsis,intro,genre,rank_no,ext_info,status,create_time,update_time from des_movie.prd_movie \""""
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


