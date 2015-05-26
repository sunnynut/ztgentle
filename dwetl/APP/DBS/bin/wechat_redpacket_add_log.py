#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

data_month = data_dt[:7]

print data_month

def load_data_to_pg():

    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_wechat_redpacket_add_log.py """ + data_dt
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to tuandb3:qunar_group:report.wechat_redpacket_add_log --from hive:default:wechat_redpacket_add_log  --split '\\001'  --choose choose --cond "select id,user_id,user_name,amount,from_date,to_date,create_time,remark,red_id,total_amount,source,serial_no from default.wechat_redpacket_add_log where substr(create_time,0,7) = '""" + data_month + """'\""""
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


