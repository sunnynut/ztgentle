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

    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/delete_non_hotel_order.py """ + data_dt
    os.system(SH_CMD1)

    SH_CMD2 = """python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:db_sync:non_hotel_order --from tuandb3:qunar_group:public.non_hotel_order  --split '\\001'  --choose choose --cond "select id,pay_id,buy_id,service,user_id,admin_id,team_id,city_id,card_id,state,quantity,realname,mobile,c_mobile,zipcode,address,express,express_xx,express_id,express_no,price,money,origin,credit,card,fare,condbuy,remark,to_timestamp(create_time)::TIMESTAMP(0) without time zone,to_timestamp(pay_time)::TIMESTAMP(0) without time zone,comment_content,comment_display,comment_grade,to_timestamp(comment_time)::TIMESTAMP(0) without time zone,partner_id,sms_express,luky_id,order_type,to_timestamp(express_time)::TIMESTAMP(0) without time zone,express_note,user_set_state,refund_money,refund_times,to_timestamp(last_refund_time)::TIMESTAMP(0) without time zone,refund_quantity,flight_tts_state,flight_tts_order_id,flight_tts_bookurl,flight_tts_oid,red_envelope,p_order_id,type_id,type,express_send_time,cancel_time,other_tuan_info,version,tppcode,reach_shop_time,merchant_code,other_tuan_state,vid,pid,uid,gid,cid,org,order_version,cost_price,product_line from public.non_hotel_order \""""
    print SH_CMD2
    os.system(SH_CMD2)

def main():
    load_data_to_mysql()
if __name__ == '__main__':
    main()


