#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

SQL1="""
use dwd;
from (select * from stg.stg_qunar_group_team_ext_da where dt = '""" + data_dt + """') a 
insert overwrite table dwd_com_team_ext
select 
a.id,
a.team_id,
a.ctserial,
a.create_time,
a.update_time,
a.redenvelope_enable,
a.promotion_type,
a.meituan_ps_ext,
a.partner_id,
a.stock_status,
a.price_strategy_id,
a.price_strategy"""


sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():

    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_dwd_com_team_ext.py"""
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwd:dwd_com_team_ext --from hive:dwd:dwd_com_team_ext  --split '\\001'  --choose choose --cond "select * from dwd.dwd_com_team_ext\""""
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


