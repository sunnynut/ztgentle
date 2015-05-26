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
insert overwrite table dwa.dwa_meituan_city_sale_di partition (dt = '""" + data_dt + """')
select
  a.city_code,
  b.city_name,
  sales_cnt
from 
(
select
  city_code,
  sum(sales_cnt) as sales_cnt
from
  (
  select 
    case
    when tuan_name like '%多城市%' then 'multi'
    else city_ename end as city_code,
    sales_cnt
  from 
    default.meituan_sales_2014 
  where 
    dt = '""" + data_dt_int + """'
  and
    category = '过夜房'
  and
    ((sales_cnt <= 300 and sales_cnt >= -300) or (selled_cnt - yes_selled_cnt = sales_cnt))
  ) q
group by 
  city_code
) a
left outer join 
(
select city_code, city_name from dim.dim_city where dt = '2015-03-22'
) b
on a.city_code = b.city_code;"""

print SQL1

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():
   SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_dwa_meituan_city_sale_di.py """ + data_dt
   os.system(SH_CMD1)

   SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwa:dwa_meituan_city_sale_di --from hive:dwa:dwa_meituan_city_sale_di --split '\\001'  --choose choose --cond "select dt, city_code, city_name, room_night from dwa.dwa_meituan_city_sale_di where dt = '""" + data_dt  + """'\""""
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
