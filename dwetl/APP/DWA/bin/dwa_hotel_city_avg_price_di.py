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
insert overwrite table dwa.dwa_hotel_city_avg_price_di partition (dt = '""" + data_dt + """')
select
  a.city_code,
  case when sum(a.qunar_cash_count) = 0 then 0.0
  else sum(a.qunar_cash_price) / sum(a.qunar_cash_count) end as qunar_cash_avg_price,
  case when sum(a.qunar_prepay_count) = 0 then 0.0
  else sum(a.qunar_prepay_price) / sum(a.qunar_prepay_count) end as qunar_prepay_avg_price,
  case when sum(a.qunar_team_count) = 0 then 0.0
  else sum(a.qunar_team_price) / sum(a.qunar_team_count) end as qunar_team_avg_price,
  case when count(b.quoted_price) = 0 then 0.0
  else sum(b.quoted_price) / count(b.quoted_price) end as meituan_price
from
(
  select
    city_code,
    hotel_seq,
    room_type,
    case when code_base <> 'wituanhotel' and payment = 0 then quoted_price else 0 end as qunar_cash_price,
    case when code_base <> 'wituanhotel' and payment = 0 then 1 else 0 end as qunar_cash_count,
    case when code_base <> 'wituanhotel' and payment = 1 then quoted_price else 0 end as qunar_prepay_price,
    case when code_base <> 'wituanhotel' and payment = 1 then 1 else 0 end as qunar_prepay_count,
    case when code_base = 'wituanhotel' then quoted_price else 0 end as qunar_team_price,
    case when code_base = 'wituanhotel' then 1 else 0 end as qunar_team_count,
    quoted_price
  from 
    default.dw_hotel_price_log 
  where 
    dt = '""" + data_dt_int + """' 
  and 
    code_base in ('wiqunarqta2', 'wiqunarqta3', 'wiqunarqta5', 'wiqtafshmin', 'qtav2000001', 'qtav2000002', 'qtav2000004', 'qtav2000005', 'wituanhotel')
  and
    quoted_price <= 300
) a
join
(
  select
    city_code,
    hotel_seq, 
    room_type,
    quoted_price
  from 
    default.dw_hotel_price_log 
  where 
    dt = '""" + data_dt_int + """'
  and
    code_base = '120meituan0'
  and 
    quoted_price <= 300
) b
on 
  a.hotel_seq = b.hotel_seq
and
  a.room_type = b.room_type
group by
  a.city_code;"""

print SQL1

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():
    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_dwa_hotel_city_avg_price_di.py """ + data_dt 
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwa:dwa_hotel_city_avg_price_di --from hive:dwa:dwa_hotel_city_avg_price_di --split '\\001'  --choose choose --cond "select dt, city_code, qunar_cash_avg_price, qunar_prepay_avg_price, qunar_team_avg_price, meituan_avg_price from dwa.dwa_hotel_city_avg_price_di where dt = '""" + data_dt  + """'\""""
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
