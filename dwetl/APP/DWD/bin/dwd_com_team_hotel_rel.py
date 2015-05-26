#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

print data_dt

#SQL1="""
#use dwd;
#insert overwrite table dwd.dwd_com_team_hotle_rel 
#select b.id,c.hotel_seq,c.hotel_title,c.hotel_city,d.city_name from
#(
#select id from (select distinct id, hotel_seq, hotel_title from des_bi.hotel_product_tuan where hotel_seq is not null and hotel_seq <> '') a group by id having count(1) > 1
#) b join des_bi.hotel_product_tuan c
#on b.id = c.id
#left outer join
#(select city_code,city_name from dim.dim_city where dt = '""" + data_dt + """') d
#on c.hotel_city = d.city_code
#where c.hotel_seq is not null and c.hotel_seq <> '';
#"""
SQL1="""
use dwd;
insert overwrite table dwd.dwd_com_team_hotel_rel 
select c.id,c.hotel_seq,c.hotel_title,c.hotel_city,d.city_name from
(select 
    id,
    hotel_seq,
    hotel_title,
    hotel_city 
from des_bi.hotel_product_tuan_history 
where dt='""" + data_dt + """' and hotel_seq is not null and hotel_seq <> ''
group by id,hotel_seq,hotel_title,hotel_city)c
left outer join
(select city_code,city_name from dim.dim_city where dt = '""" + data_dt + """') d
on c.hotel_city = d.city_code
where c.hotel_seq is not null and c.hotel_seq <> '';
"""
sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():

    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_dwd_com_team_hotel_rel.py"""
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwd:dwd_com_team_hotel_rel --from hive:dwd:dwd_com_team_hotel_rel  --split '\\001'  --dir /user/desdev/hive/warehouse/dwd/dwd_com_team_hotel_rel"""
    os.system(SH_CMD2)

def load_data_to_pg():

    SH_CMD1  = """python /home/q/desdev/sh_script/daily_report/delete_dwd_com_team_hotel_rel_pg.py"""
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to tuandb3:qunar_group:public.dwd_com_team_hotel_rel --from hive:dwd:dwd_com_team_hotel_rel  --split '\\001' --dir /user/desdev/hive/warehouse/dwd/dwd_com_team_hotel_rel"""
    os.system(SH_CMD2)

def main():
    
    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
    load_data_to_mysql()
    load_data_to_pg()
if __name__ == '__main__':
    main()
