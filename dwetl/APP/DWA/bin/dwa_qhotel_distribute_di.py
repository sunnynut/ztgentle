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
insert overwrite table dwa.dwa_qhotel_distribute_di partition (dt = '""" + data_dt + """')
select
  q.daqu,
  q.quyu,
  q.city_code,
  q.city_name,
  sum(out.hotel_cnt),
  sum(out.direct_hotel_cnt),
  sum(out.team_hotel_cnt),
  sum(out.direct_team_hotel_cnt),
  sum(out.meituan_hotel_cnt)
from
(
select
  city_code,
  count(*) as hotel_cnt,
  sum(direct_hotel_cnt) as direct_hotel_cnt,
  sum(team_hotel_cnt) as team_hotel_cnt,
  sum(direct_team_hotel_cnt) as direct_team_hotel_cnt,
  sum(meituan_hotel_cnt) as meituan_hotel_cnt
from
(
select
  city_code,
  hotel_seq,
  case when sum(direct_hotel_cnt) > 0 then 1 else 0 end as direct_hotel_cnt,
  case when sum(team_hotel_cnt) > 0 then 1 else 0 end as team_hotel_cnt,
  case when sum(direct_hotel_cnt + team_hotel_cnt) > 0 then 1 else 0 end as direct_team_hotel_cnt,
  case when sum(meituan_hotel_cnt) > 0 then 1 else 0 end as meituan_hotel_cnt
from
(
select
  city as city_code,
  hotel_seq,
  case when wrapper_id <> 'wituanhotel' and wrapper_id <> '120meituan0' then 1 else 0 end as direct_hotel_cnt,
  case when wrapper_id = 'wituanhotel' then 1 else 0 end as team_hotel_cnt,
  case when wrapper_id = '120meituan0' then 1 else 0 end as meituan_hotel_cnt
from
(
  select
    distinct city, hotel_seq, wrapper_id
  from 
    default.ods_qhotel_hotel_linkage
  where 
    dt = '""" + data_dt_int + """' 
  and
    status = 'on'
  and 
    wrapper_id in ('wiqunarqta2', 'wiqunarqta3', 'wiqunarqta5', 'wiqtafshmin', 'qtav2000001', 'qtav2000002', 'qtav2000004', 'qtav2000005', 'wituanhotel','120meituan0')
  and
    length(hotel_seq) > 4
) a
) m 
group by
  city_code, hotel_seq
) p
group by 
  city_code
union all
select 
  city_code,
  count(*) as hotel_cnt,
  sum(direct_hotel_cnt) as direct_hotel_cnt,
  sum(team_hotel_cnt) as team_hotel_cnt,
  sum(direct_hotel_cnt + team_hotel_cnt) as direct_team_hotel_cnt,
  sum(meituan_hotel_cnt) as meituan_hotel_cnt 
from
(
select
  city as city_code,
  case when wrapper_id <> 'wituanhotel' and wrapper_id <> '120meituan0' then 1 else 0 end as direct_hotel_cnt,
  case when wrapper_id = 'wituanhotel' then 1 else 0 end as team_hotel_cnt,
  case when wrapper_id = '120meituan0' then 1 else 0 end as meituan_hotel_cnt
from
  (
  select
    distinct city, hotel_name, wrapper_id
  from 
    default.ods_qhotel_hotel_linkage
  where 
    dt = '""" + data_dt_int + """' 
  and
    status = 'on'
  and 
    wrapper_id in ('wiqunarqta2', 'wiqunarqta3', 'wiqunarqta5', 'wiqtafshmin', 'qtav2000001', 'qtav2000002', 'qtav2000004', 'qtav2000005', 'wituanhotel','120meituan0')
  and
    length(hotel_seq) <= 4
  ) a
) q
group by
  city_code
) out
join
(select city_code, city_name, daqu, quyu from dim.dim_city where dt = '""" + data_dt + """') q
on out.city_code = q.city_code
group by 
  q.daqu, q.quyu, q.city_code, q.city_name;"""


print SQL1

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():
    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_dwa_qhotel_distribute_di.py """ + data_dt 
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwa:dwa_qhotel_distribute_di --from hive:dwa:dwa_qhotel_distribute_di --split '\\001'  --choose choose --cond "select dt,daqu,quyu,city_code,city_name,hotel_cnt,direct_hotel_cnt,team_hotel_cnt,direct_team_hotel_cnt,meituan_hotel_cnt from dwa.dwa_qhotel_distribute_di where dt = '""" + data_dt  + """'\""""
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
