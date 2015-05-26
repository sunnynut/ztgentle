#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/db')
from Hive import Hive
reload(sys)
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
from datetime import datetime,timedelta
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

end_day_str = (datetime.strptime(data_dt,'%Y-%m-%d').date() + timedelta(1)).strftime('%Y-%m-%d')
print end_day_str

def compute_data_in_pg():
    SH_CMD1 = """python /home/q/desdev/sh_script/daily_report/compute_team_revenue_detail.py """ + data_dt
    print SH_CMD1
    os.system(SH_CMD1)

def load_data_to_mysql():
    SH_CMD1 = """
    python /home/q/desdev/sh_script/daily_report/delete_dwr_team_revenue_detail.py """ + data_dt + """
    """ 
    print SH_CMD1
    os.system(SH_CMD1)

    SH_CMD2 = """ sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw03Mysql:dwr:dwr_team_revenue_detail --from tuandb3:qunar_group:report.dwr_team_revenue_detail_bak --split '\\001' --cond "select account_month,account_date,team_id,team_name,team_price,team_cost_price,sale_channel,team_dispatching_type,is_other_tuan_flag,order_source,order_type,hotel_seq,hotel_name,sign_company,belong_dept_code,coupon_no,buy_qty,refund_qty,consume_qty,restore_qty,red_envelope_amt,card_amt,discount_amt,pay_amt,refund_amt,profit,revenue,channel_service_charge,activity_type from report.dwr_team_revenue_detail where account_date ='"""+ data_dt +"""'" --choose choose"""
    print SH_CMD2
    os.system(SH_CMD2)

def load_data_to_hive():
    SH_CMD1= """
    sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --from tuandb3:qunar_group:report.dwr_team_revenue_detail_bak --to hive:dwr:dwr_team_revenue_detail --split "\\001"  --partition dt="""+data_dt+""" --overwrite overwrite --cond \"select account_month,account_date,team_id,team_name,team_price,team_cost_price,sale_channel,team_dispatching_type,is_other_tuan_flag,order_source,order_type,hotel_seq,hotel_name,sign_company,belong_dept_code,coupon_no,buy_qty,refund_qty,consume_qty,restore_qty,red_envelope_amt,card_amt,discount_amt,pay_amt,refund_amt,profit,revenue,channel_service_charge,activity_type from report.dwr_team_revenue_detail where account_date ='"""+ data_dt +"""'\""""

    print SH_CMD1

    os.system(SH_CMD1)

def main():
    compute_data_in_pg()
    load_data_to_mysql()
    load_data_to_hive()
if __name__ == '__main__':
    main()
