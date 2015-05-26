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

    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_commission_redpacket_new.py """ + data_dt
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to tuandb3:qunar_group:report.commission_redpacket_new --from hive:default:commission_redpacket_new  --split '\\001'  --choose choose --cond "select id,flag,name,source,use_scope,uid,regexp_replace(gid,'\\\\\\\\\\\\\\\\','\\\\\\\\/'),client_vid,pid,user_id,user_name,user_mobile,from_date,to_date,create_time,status,param_type,param_value,user_remark,update_time,is_delete,h_send_id,h_send_type,h_send_time,h_send_data_seq from default.commission_redpacket_new where substr(create_time,0,7) = '""" + data_month + """'\""""
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


