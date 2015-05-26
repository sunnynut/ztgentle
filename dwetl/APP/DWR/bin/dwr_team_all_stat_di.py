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

SQL1="""
insert overwrite table dwr.dwr_team_all_stat_di partition (dt = '""" + data_dt + """')
select
a.team_id, a.platform_type, a.generate_order_qty, a.pay_order_qty, a.pay_room_night_qty, a.pay_amount, a.refund_order_qty,a.refund_room_night_qty,a.refund_amount,a.voucher_room_night_qty,
b.total_pv,b.total_uv,b.book_pv,b.book_uv,b.show_pv,a.voucher_order_qty,a.generate_room_night_qty,a.total_cost_price,a.total_price,a.total_card_amt,a.total_red_envelope_amt
from (select * from dwr.dwr_team_transaction_di where dt = '""" + data_dt + """') a
left outer join 
(select * from dwr.dwr_team_web_traffic_stat_di where dt = '""" + data_dt + """') b
on a.team_id = b.team_id and a.platform_type = b.platform_type;"""

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))


def load_data_to_mysql():
    SH_CMD1 = """
	sudo -u desdev /home/q/hadoop/hive-default/bin/hive -e "select """ + data_dt_int  + """, team_id, platform_type, generate_order_qty, pay_order_qty, pay_room_night_qty, pay_amount, refund_order_qty, refund_room_night_qty, refund_amount, voucher_room_night_qty, detail_pv, detail_uv, book_pv, book_uv, show_pv, voucher_order_qty, generate_room_night_qty,total_cost_price,total_price,total_card_amt,total_red_envelope_amt from dwr.dwr_team_all_stat_di where dt = '""" + data_dt + """' and (generate_order_qty > 0 OR pay_order_qty > 0 OR pay_room_night_qty > 0 OR pay_amount > 0 OR refund_order_qty > 0 OR refund_room_night_qty > 0 OR refund_amount > 0 OR voucher_room_night_qty > 0 OR detail_pv > 0 OR detail_uv > 0 OR book_pv > 0 OR book_uv > 0 OR show_pv > 0 OR voucher_order_qty > 0 OR generate_room_night_qty > 0 OR total_cost_price > 0 OR total_price > 0 OR total_card_amt > 0 OR total_red_envelope_amt > 0);" > /home/q/desdev/sh_script/daily_report/dwr_team_all_stat_di.txt"""
    os.system(SH_CMD1)
    
    SH_CMD2 = """sed -i "1d" /home/q/desdev/sh_script/daily_report/dwr_team_all_stat_di.txt"""
    os.system(SH_CMD2)

    SH_CMD3 = """python /home/q/desdev/sh_script/daily_report/load_dwr_team_all_stat_di_to_mysql.py """+data_dt 
    os.system(SH_CMD3)

def main():
    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
    load_data_to_mysql()
if __name__ == '__main__':
    main()
