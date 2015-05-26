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
insert overwrite table dwa.dwa_hotel_quoted_price_distribute_di partition (dt = '""" + data_dt + """')
select
  daqu,
  quyu,
  city_name,
  hotel_star,
  count(*),
  sum(direct_hotel_cnt) as direct_hotel_cnt,
  sum(cash_hotel_cnt) as cash_hotel_cnt,
  sum(prepay_hotel_cnt) as prepay_hotel_cnt,
  sum(team_hotel_cnt) as team_hotel_cnt,
  sum(direct_team_hotel_cnt) as direct_team_hotel_cnt
from
(
select
  q.daqu,
  q.quyu,
  p.city_name,
  n.hotel_star,
  case when direct_hotel_cnt > 0 then 1 else 0 end as direct_hotel_cnt,
  case when cash_hotel_cnt > 0 then 1 else 0 end as cash_hotel_cnt,
  case when prepay_hotel_cnt > 0 then 1 else 0 end as prepay_hotel_cnt,
  case when team_hotel_cnt > 0 then 1 else 0 end as team_hotel_cnt,
  case when direct_hotel_cnt > 0 and team_hotel_cnt > 0 then 1 else 0 end as direct_team_hotel_cnt
from
(
select
  a.city_name,
  a.hotel_seq,
  sum(cash_hotel_cnt + prepay_hotel_cnt) as direct_hotel_cnt,
  sum(cash_hotel_cnt) as cash_hotel_cnt,
  sum(prepay_hotel_cnt) as prepay_hotel_cnt,
  sum(team_hotel_cnt) as team_hotel_cnt
from
(
  select
    city_name,
    hotel_seq,
    case when code_base <> 'wituanhotel' and payment = 0 then 1 else 0 end as cash_hotel_cnt,
    case when code_base <> 'wituanhotel' and payment = 1 then 1 else 0 end as prepay_hotel_cnt,
    case when code_base = 'wituanhotel' then 1 else 0 end as team_hotel_cnt
  from 
    default.dw_hotel_price_log 
  where 
    dt = '""" + data_dt_int + """' 
  and 
    code_base in ('wiqunarqta2', 'wiqunarqta3', 'wiqunarqta5', 'wiqtafshmin', 'qtav2000001', 'qtav2000002', 'qtav2000004', 'qtav2000005', 'wituanhotel')
) a
group by
  a.city_name, a.hotel_seq
) p
join
(select hotel_seq, hotel_star from dwr.dwr_hotel_info_di where dt = '""" + data_dt + """') n
on p.hotel_seq = n.hotel_seq
join
(select city_name, daqu, quyu from dim.dim_city where dt = '""" + data_dt + """') q
on p.city_name = q.city_name
) m
group by 
  daqu, quyu, city_name, hotel_star;"""


#case
#when hotel_grade in ('3','4') and coalesce(onlinechannel,'abc') NOT IN('bnb','bnb|gongyu','gongyu') then '1' --高星级 
#when hotel_grade in ('2') and coalesce(onlinechannel,'abc') NOT IN('bnb','bnb|gongyu','gongyu') then '2' --三星级 
#when hotel_grade in ('5') and coalesce(onlinechannel,'abc') NOT IN('bnb','bnb|gongyu','gongyu') then '3' --二星级 
#when hotel_grade in ('1') and coalesce(onlinechannel,'abc') NOT IN('bnb','bnb|gongyu','gongyu') then '4' --经济连锁 
#when coalesce(onlinechannel,'abc') IN('bnb','bnb|gongyu') then '5' --客栈 
#else '6' --其它 
#END as hotel_star,

print SQL1

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():
    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_dwa_hotel_quoted_price_distribute_di.py """ + data_dt 
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwa:dwa_hotel_quoted_price_distribute_di --from hive:dwa:dwa_hotel_quoted_price_distribute_di --split '\\001'  --choose choose --cond "select dt,daqu,quyu,city_name,hotel_star,hotel_cnt,direct_hotel_cnt,cash_hotel_cnt,prepay_hotel_cnt,team_hotel_cnt,direct_team_hotel_cnt from dwa.dwa_hotel_quoted_price_distribute_di where dt = '""" + data_dt  + """'\""""
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
