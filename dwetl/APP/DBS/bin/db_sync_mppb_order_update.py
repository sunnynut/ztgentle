#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

def load_data_to_pg():

    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_mppb_order_tmp.py """ + data_dt
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to tuandb3:qunar_group:report.mppb_order_tmp --from hive:default:mppb_order  --split '\\001'  --choose choose --cond "select uid,vid,cid,regexp_replace(gid,'\\\\\\\\\\\\\\\\','\\\\\\\\/'),user_name,order_id,wrapper_id,hotel_seq,status,valid_order_status,pay_type,confirm_type,online_type,city_name,create_time,update_time,confirm_time,display_time,month from default.mppb_order where substr(update_time,0,10) = '""" + data_dt + """'\""""
    print SH_CMD2
    os.system(SH_CMD2)
    
    SH_CMD3 = """ python /home/q/desdev/sh_script/daily_report/update_mppb_order.py """
    os.system(SH_CMD3)

def main():
    #hive=Hive()
    #hive.set_date(data_dt)
    #for sql in sqls:
    #    hive.add_sql(sql)
    #hive.run()
    load_data_to_pg()
if __name__ == '__main__':
    main()


