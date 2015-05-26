#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

datadt=data_dt.replace("-","")

SQL1="""
insert overwrite table dwa.dwa_team_hotel_room_type_phy_rank_qty_di partition (dt = '""" + data_dt + """')
select
 'app',
 roomname_rank,
 count(distinct hotelseq, roomname)
from
(
 select 
   hotelseq, roomname,min(vendorinx) as roomname_rank
 from default.pricerank_hotel_qs2client 
 where logday = '""" + datadt + """' 
 and (action = 'QueryHotelDetail' or action = 'hdetailprice') 
 and wrapperid = 'wituanhotel' 
 group by hotelseq, roomname
) q
group by roomname_rank;
"""

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():
    
    SH_CMD1 = """
    python /home/q/desdev/sh_script/daily_report/delete_dwa_team_hotel_room_type_phy_rank_qty_di.py """ + data_dt
    os.system(SH_CMD1)
    
    SH_CMD2 = """
    python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwa:dwa_team_hotel_room_type_phy_rank_qty_di --from hive:dwa:dwa_team_hotel_room_type_phy_rank_qty_di  --split '\\001'  --choose choose --cond "select dt,platform_type,room_type_rank,room_type_rank_qty from dwa.dwa_team_hotel_room_type_phy_rank_qty_di where dt = '""" + data_dt  + """'\"
    """

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
