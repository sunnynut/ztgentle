#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
int_data_dt=data_dt.replace('-','')
SQL1="""
insert overwrite table dwr.dwr_wireless_hotel_new_user_di partition(dt='"""+data_dt+"""')
select
    q1.uid
from (select uid from default.mppb_order where substr(create_time,1,10)='"""+data_dt+"""' group by uid)q1
left outer join (select uid from default.mppb_order where substr(create_time,1,10)<'"""+data_dt+"""' group by uid)q2
on q1.uid=q2.uid
where q2.uid is null;
"""
sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_to_mysql():
    dbi=DBI(driver='mysql',dbc='db_data_discover_new')
    dbi.set_dbc(db='dwr')
    sql1="""
    delete from dwr.dwr_wireless_hotel_new_user_di where stat_date='"""+data_dt+"""';
    """
    dbi.connect()
    dbi.execute(sql1)
    dbi.execute('commit;')
    dbi.close()
    imp_cmd="""
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwr:dwr.dwr_wireless_hotel_new_user_di --from hive:dwr:dwr_wireless_hotel_new_user_di  --split '\\001'  --choose choose --cond "select dt,uid from dwr.dwr_wireless_hotel_new_user_di where dt='"""+data_dt+"""'"
    """
    os.system(imp_cmd)


def main():
    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
    #load_to_mysql()
if __name__ == '__main__':
    main()