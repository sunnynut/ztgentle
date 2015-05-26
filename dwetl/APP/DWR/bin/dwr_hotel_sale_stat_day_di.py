#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

data_dt_int = data_dt.replace("-","")

print data_dt
print data_dt_int

SQL1="""
insert overwrite table dwr.dwr_hotel_sale_stat_day_di partition (dt = '""" + data_dt + """')
select
a.hotel_seq,
a.country_name,
a.daqu,
a.province_name,
a.city_name,
a.hotel_star,
a.hotel_grade,
a.onlinechannel,
a.hotel_area,
a.hotel_trading_area,
a.online_flag,
a.operating_flag,
a.baidu_point,
a.google_point,
a.hotel_types,
a.numberfloors,
a.numberrooms,
a.wifi_flag,
a.hasheater_flag,
a.hasairconditioning_flag,
a.hasheatwater_flag,
a.free_meal_flag,
a.hasparkingarea_flag,
a.hasfitnessroom_flag,
a.hasspa_flag,
a.hashotspring_flag,
a.haschessroom_flag,
a.internetaccess_flag,
a.hasstationpickup_flag,
a.hasairportpickup_flag,
b.estimate_cash_room_night,
b.estimate_prepay_room_night,
b.estimate_nightsell_room_night,
b.estimate_ota_room_night,
b.estimate_team_room_night,
b.actural_cash_room_night,	
b.actural_prepay_room_night,
b.actural_nightsell_room_night,
b.actural_ota_room_night,
b.actural_team_room_night
from (select * from dwr.dwr_hotel_info_di where dt = '""" + data_dt + """') a
join 
(
select
hotel_seq, 
estimate_cash_room_night,
estimate_prepay_room_night,
estimate_nightsell_room_night,
estimate_ota_room_night,
estimate_team_room_night,
actural_cash_room_night,
actural_prepay_room_night,
actural_nightsell_room_night,
actural_ota_room_night,
actural_team_room_night
from
(
  select
  hotel_seq, 
  sum(estimate_cash_room_night) as estimate_cash_room_night,
  sum(estimate_prepay_room_night) as estimate_prepay_room_night,
  sum(estimate_nightsell_room_night) as estimate_nightsell_room_night,
  sum(estimate_ota_room_night) as estimate_ota_room_night,
  sum(estimate_team_room_night) as estimate_team_room_night,
  sum(actural_cash_room_night) as actural_cash_room_night,
  sum(actural_prepay_room_night) as actural_prepay_room_night,
  sum(actural_nightsell_room_night) as actural_nightsell_room_night,
  sum(actural_ota_room_night) as actural_ota_room_night,
  sum(actural_team_room_night) as actural_team_room_night
  from
  dwr.dwr_hotel_sale_day_di
  where
  dt = '""" + data_dt + """'
  group by
  hotel_seq
) q
where
  estimate_cash_room_night > 0
or
  estimate_prepay_room_night > 0 
or
  estimate_nightsell_room_night > 0 
or
  estimate_ota_room_night > 0
or
  estimate_team_room_night > 0
or
  actural_cash_room_night > 0
or
  actural_prepay_room_night > 0
or
  actural_nightsell_room_night > 0
or
  actural_ota_room_night > 0
or
  actural_team_room_night > 0
) b
on a.hotel_seq = b.hotel_seq;"""

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():
   SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_dwr_hotel_sale_stat_day_di.py """ + data_dt
   os.system(SH_CMD1)

   SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwr:dwr_hotel_sale_stat_day_di --from hive:dwr:dwr_hotel_sale_stat_day_di --split '\\001'  --choose choose --cond "select regexp_replace(dt,'-',''),hotel_seq,country_name,daqu,province_name,city_name,hotel_star,hotel_grade,onlinechannel,hotel_area,hotel_trading_area,online_flag,operating_flag,baidu_point,google_point,hotel_types,numberfloors,numberrooms,wifi_flag,hasheater_flag,hasairconditioning_flag,hasheatwater_flag,free_meal_flag,hasparkingarea_flag,hasfitnessroom_flag,hasspa_flag,hashotspring_flag,haschessroom_flag,internetaccess_flag,hasstationpickup_flag,hasairportpickup_flag,estimate_cash_room_night,estimate_prepay_room_night,estimate_nightsell_room_night,estimate_ota_room_night,estimate_team_room_night,actural_cash_room_night,  actural_prepay_room_night,actural_nightsell_room_night,actural_ota_room_night,actural_team_room_night from dwr.dwr_hotel_sale_stat_day_di where dt = '""" + data_dt  + """'\""""
   print SH_CMD2
   os.system(SH_CMD2)

def main():
    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
    load_data_to_mysql()
if __name__ == '__main__':
    main()
