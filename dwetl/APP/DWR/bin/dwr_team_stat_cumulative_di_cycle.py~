#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
pre1day=Time.date_sub(data_dt , 1 )

SQL1="""
use dwr;
create table if not exists dwr.dwr_team_stat_cumulative_di(
team_id int,
platform_type string , 
detail_pv string,
detail_pv_cum bigint, 
pay_room_night bigint ,
pay_room_night_cum bigint , 
refund_room_night bigint, 
refund_room_night_cum bigint, 
net_room_night bigint, 
net_room_night_cum bigint, 
voucher_room_night bigint, 
voucher_room_night_cum bigint
)
partitioned by (dt string )
"""

SQL2="insert overwrite table dwr.dwr_team_stat_cumulative_di partition(dt='" + data_dt + """')
select 
coalesce( ts.team_id , tsc.team_id),
coalesce( ts.platform_type , tsc.platform_type ) ,
coalesce( ts.detail_pv , cast(0 as bigint) ) ,
coalesce( ts.detail_pv , cast(0 as bigint) )  +  coalesce( tsc.detail_pv_cum , cast(0 as bigint) ) , 
coalesce( ts.pay_room_night_qty , cast(0 as bigint) ) , 
coalesce( ts.pay_room_night_qty , cast(0 as bigint ) ) + coalesce( tsc.pay_room_night_cum, cast(0 as bigint ) ),
coalesce( ts.refund_room_night_qty , cast(0 as bigint ) ) , 
coalesce( ts.refund_room_night_qty , cast(0 as bigint ) ) + coalesce( tsc.refund_room_night_cum , cast(0 as bigint ) ) , 
coalesce( ts.pay_room_night_qty , cast(0 as bigint ) ) - coalesce( ts.refund_room_night_qty , cast(0 as bigint ) ), 
coalesce( ts.pay_room_night_qty , cast(0 as bigint ) ) - coalesce( ts.refund_room_night_qty , cast(0 as bigint ) ) + coalesce( tsc.net_room_night_cum , cast(0 as bigint ) ) , 
coalesce( ts.voucher_room_night_qty , cast(0 as bigint)) , 
coalesce( ts.voucher_room_night_qty , cast(0 as bigint)) + coalesce( tsc.voucher_room_night_cum , cast(0 as bigint )) 
from( select * from dwr.dwr_team_all_stat_di where dt='""" + data_dt + """') ts 
full outer join ( select * from dwr.dwr_team_stat_cumulative_di where dt='""" + pre1day + """' ) tsc on ts.team_id=tsc.team_id
and ts.platform_type = tsc.platform_type"""

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def main():
    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
if __name__ == '__main__':
    main()
