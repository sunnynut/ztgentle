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
insert overwrite table dwa.dwa_team_all_stat_sum_di partition (dt = '""" + data_dt + """')
select 
q.platform_type,q.dept_code,q.city_code,p.generate_order_qty,p.pay_order_qty,p.pay_room_night_qty,p.pay_amount,p.refund_order_qty,p.refund_room_night_qty,p.refund_amount,p.voucher_room_night_qty,p.detail_pv,p.book_pv,p.show_pv
from
(
select 'app' AS platform_type,'D001' AS dept_code,city_code FROM dim.dim_city where dt = '""" + data_dt + """'
UNION ALL
select 'app' AS platform_type,'D002' AS dept_code,city_code FROM dim.dim_city where dt = '""" + data_dt + """'
UNION ALL
select 'app' AS platform_type,'D003' AS dept_code,city_code FROM dim.dim_city where dt = '""" + data_dt + """'
UNION ALL
select 'app' AS platform_type,'unknown' AS dept_code,city_code FROM dim.dim_city where dt = '""" + data_dt + """'
UNION ALL
select 'app' AS platform_type,'OTA' AS dept_code,city_code FROM dim.dim_city where dt = '""" + data_dt + """'
UNION ALL
select 'touch' AS platform_type,'D001' AS dept_code,city_code FROM dim.dim_city where dt = '""" + data_dt + """'
UNION ALL
select 'touch' AS platform_type,'D002' AS dept_code,city_code FROM dim.dim_city where dt = '""" + data_dt + """'
UNION ALL
select 'touch' AS platform_type,'D003' AS dept_code,city_code FROM dim.dim_city where dt = '""" + data_dt + """'
UNION ALL
select 'touch' AS platform_type,'unknown' AS dept_code,city_code FROM dim.dim_city where dt = '""" + data_dt + """'
UNION ALL
select 'touch' AS platform_type,'OTA' AS dept_code,city_code FROM dim.dim_city where dt = '""" + data_dt + """'
UNION ALL
select 'www' AS platform_type,'D001' AS dept_code,city_code FROM dim.dim_city where dt = '""" + data_dt + """'
UNION ALL
select 'www' AS platform_type,'D002' AS dept_code,city_code FROM dim.dim_city where dt = '""" + data_dt + """'
UNION ALL
select 'www' AS platform_type,'D003' AS dept_code,city_code FROM dim.dim_city where dt = '""" + data_dt + """'
UNION ALL
select 'www' AS platform_type,'unknown' AS dept_code,city_code FROM dim.dim_city where dt = '""" + data_dt + """'
UNION ALL
select 'www' AS platform_type,'OTA' AS dept_code,city_code FROM dim.dim_city where dt = '""" + data_dt + """'
) q 
left outer join
(
select if(b.dept_code is null or b.dept_code = 'NULL', 'unknown', b.dept_code) as dept_code,a.city_code as city_code, c.platform_type as platform_type, sum(generate_order_qty) as generate_order_qty, sum(pay_order_qty) as pay_order_qty, sum(pay_room_night_qty) as pay_room_night_qty, sum(pay_amount) as pay_amount, sum(refund_order_qty) as refund_order_qty, sum(refund_room_night_qty) as refund_room_night_qty, sum(refund_amount) as refund_amount, sum(voucher_room_night_qty) as voucher_room_night_qty, sum(detail_pv) as detail_pv, sum(book_pv) as book_pv,sum(show_pv) as show_pv
from (select * from dwd.dwd_com_team_city_rel_da where dt = '""" + data_dt + """') a left outer join (select * from dwd.dwd_com_team_dept_rel_da where dt = '""" + data_dt + """') b on a.team_id = b.team_id left outer join (select * from dwr.dwr_team_all_stat_di where dt = '""" + data_dt + """') c on a.team_id = c.team_id left outer join des_bi.hotel_product_tuan_temp d on a.team_id = d.id where d.source_system <> 'other' group by b.dept_code,a.city_code,c.platform_type
UNION ALL
select if(b.dept_code is null or b.dept_code = 'NULL', 'OTA', b.dept_code) as dept_code, a.city_code as city_code, c.platform_type as platform_type, sum(generate_order_qty) as generate_order_qty, sum(pay_order_qty) as pay_order_qty, sum(pay_room_night_qty) as pay_room_night_qty, sum(pay_amount) as pay_amount, sum(refund_order_qty) as refund_order_qty, sum(refund_room_night_qty) as refund_room_night_qty, sum(refund_amount) as refund_amount, sum(voucher_room_night_qty) as voucher_room_night_qty, sum(detail_pv) as detail_pv, sum(book_pv) as book_pv,sum(show_pv) as show_pv
from (select * from dwd.dwd_com_team_city_rel_da where dt = '""" + data_dt + """') a left outer join (select * from dwd.dwd_com_team_dept_rel_da where dt = '""" + data_dt + """') b on a.team_id = b.team_id left outer join (select * from dwr.dwr_team_all_stat_di where dt = '""" + data_dt + """') c on a.team_id = c.team_id left outer join des_bi.hotel_product_tuan_temp d on a.team_id = d.id where d.source_system = 'other' group by b.dept_code,a.city_code,c.platform_type
) p on q.dept_code = p.dept_code and q.city_code = p.city_code and q.platform_type = p.platform_type;"""

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def load_data_to_mysql():

    SH_CMD1 = """
        sudo -u desdev /home/q/hadoop/hive-default/bin/hive -e "select a.date,a.platform_type, a.dept_code, a.city_code, a.generate_order_qty, a.pay_order_qty,a.pay_room_night_qty, a.pay_amount, a.refund_order_qty, a.refund_room_night_qty, a.refund_amount, a.voucher_room_night_qty, a.detail_pv, a.book_pv, a.show_pv,b.generate_order_qty, b.pay_order_qty,b.pay_room_night_qty, b.pay_amount, b.refund_order_qty, b.refund_room_night_qty, b.refund_amount,b.voucher_room_night_qty, b.detail_pv, b.book_pv,b.show_pv,a.pay_room_night_qty-a.refund_room_night_qty,b.pay_room_night_qty-b.refund_room_night_qty from (select """ + datadt + """ as date,platform_type, dept_code, city_code, generate_order_qty, pay_order_qty,pay_room_night_qty, pay_amount, refund_order_qty, refund_room_night_qty, refund_amount, voucher_room_night_qty, detail_pv, book_pv, show_pv from dwa.dwa_team_all_stat_sum_di where dt ='""" + data_dt + """') a left outer join (select platform_type, dept_code, city_code, generate_order_qty, pay_order_qty,pay_room_night_qty, pay_amount, refund_order_qty, refund_room_night_qty, refund_amount, voucher_room_night_qty, detail_pv, book_pv, show_pv from dwa.dwa_team_all_stat_sum_di where dt=date_sub('""" + data_dt + """',7)) b on a.platform_type=b.platform_type and a.dept_code=b.dept_code and a.city_code=b.city_code;"> /home/q/desdev/sh_script/daily_report/dwa_team_all_stat_sum_di.txt""";
    os.system(SH_CMD1)

    SH_CMD2 = """sed -i "1d" /home/q/desdev/sh_script/daily_report/dwa_team_all_stat_sum_di.txt"""
    os.system(SH_CMD2)

    SH_CMD3 = """python /home/q/desdev/sh_script/daily_report/load_dwa_team_all_stat_sum_di_to_mysql.py """ + data_dt
    print SH_CMD3
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
