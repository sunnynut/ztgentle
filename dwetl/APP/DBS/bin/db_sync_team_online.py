#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

def load_data_to_mysql():

    #SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_return_balance.py """ + data_dt
    #os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:team_online --from tuandb3:qunar_group:public.team_online  --split '\\001'  --choose choose --cond "select id, stitle, group_id, partner_id, team_price, market_price, product, sort_order, begin_time, end_time, sales, publish, profit, departure, arrive, tags, cdate, p_team_id, new_type from public.team_online where cdate = '2015-03-20' \""""
    print SH_CMD2
    os.system(SH_CMD2)

def main():
    #hive=Hive()
    #hive.set_date(data_dt)
    #for sql in sqls:
    #    hive.add_sql(sql)
    #hive.run()
    load_data_to_mysql()
if __name__ == '__main__':
    main()


