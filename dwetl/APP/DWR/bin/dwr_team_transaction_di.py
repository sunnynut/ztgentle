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
insert overwrite table tmp.dwr_team_transaction_di partition (dt = '""" + data_dt + """')
select 
a.team_id, 
a.create_platform, 
case when b.create_count is null then  cast(0 as bigint) else b.create_count end as create_count,
case when c.pay_count is null then  cast(0 as bigint) else c.pay_count end as pay_count,
case when c.pay_quantity is null then  cast(0 as double) else c.pay_quantity * d.num_room_night end as pay_num_room_night,
case when c.pay_money is null then  cast(0 as double) else c.pay_money end as pay_money, 
case when e.refund_count is null then  cast(0 as bigint) else e.refund_count end as refund_count,
case when e.refund_quantity is null then  cast(0 as double) else  e.refund_quantity * d.num_room_night end as refund_num_room_night,
case when e.refund_money is null then  cast(0 as double) else  e.refund_money end as refund_money, 
case when f.consume_count is null then  cast(0 as double) else f.consume_count * d.num_room_night end as consume_num_room_night,
case when f.voucher_order_qty is null then cast(0 as bigint) else f.voucher_order_qty end as voucher_order_qty,
case when g.generate_room_night_qty is null then cast(0 as double) else g.generate_room_night_qty * d.num_room_night end as generate_room_night_qty,
case when h.total_cost_price is null then cast(0 as double) else h.total_cost_price end as total_cost_price,
case when h.total_price is null then cast(0 as double) else h.total_price end as total_price,
case when h.total_card_amt is null then cast(0 as double) else h.total_card_amt end as total_card_amt,
case when h.total_red_envelope_amt is null then cast(0 as double) else h.total_red_envelope_amt end as total_red_envelope_amt
from 
(select team_id, 'www' as create_platform from dwd.dwd_com_team_city_rel_da where dt = '""" + data_dt + """'
UNION ALL
select team_id, 'touch' as create_platform from dwd.dwd_com_team_city_rel_da where dt = '""" + data_dt + """'
UNION ALL
select team_id, 'android' as create_platform from dwd.dwd_com_team_city_rel_da where dt = '""" + data_dt + """'
UNION ALL
select team_id, 'iphone' as create_platform from dwd.dwd_com_team_city_rel_da where dt = '""" + data_dt + """') a 
left outer join 
(select team_id, create_platform, count(order_id) as create_count from des_bi.order_create_tuan where dt = '""" + datadt + """' group by team_id,create_platform) b on a.team_id = b.team_id and a.create_platform = b.create_platform
left outer join 
(select team_id, create_platform, count(order_id) as pay_count, sum(quantity) as pay_quantity, sum(money_required) as pay_money from des_bi.order_pay_tuan a where dt = '""" + datadt + """' group by team_id, create_platform) c on a.team_id = c.team_id and a.create_platform = c.create_platform 
left outer join 
(select team_id, create_platform, count(order_id) as refund_count, sum(refund_quantity) as refund_quantity, sum(refund_money) as refund_money from des_bi.order_refund_tuan where dt = '""" + datadt + """' group by team_id, create_platform) e on a.team_id = e.team_id and a.create_platform = e.create_platform 
left outer join 
(select distinct id,if (num_room_night is null,0, num_room_night) as num_room_night from des_bi.hotel_product_tuan where type = 'hotel') d on a.team_id = d.id 
left outer join 
(select a.team_id as team_id, b.create_platform, count(*) as consume_count, count(distinct a.order_id) as voucher_order_qty from (select * from des_bi.coupon_trace_tuan where operate_type = 'consume' and dt = '""" + data_dt + """') a left outer join (select order_id, create_platform from des_bi.order_pay_tuan) b on a.order_id = b.order_id group by a.team_id, b.create_platform) f on a.team_id = f.team_id and a.create_platform = f.create_platform
left outer join
(select team_id,create_platform,sum(quantity) as generate_room_night_qty from des_bi.order_create_tuan where dt = '""" + datadt + """' group by team_id,create_platform) g on a.team_id = g.team_id and a.create_platform = g.create_platform
left outer join
(
select team_id,create_platform,sum(total_cost_price) as total_cost_price,sum(total_price) as total_price,sum(ocard) as total_card_amt,sum(ored) as total_red_envelope_amt from 
(
select
  a.team_id,
  b.create_platform,
  case when a.operate_type = 'consume' then sum(b.cost_price) else sum(- b.cost_price) end as total_cost_price,
  case when a.operate_type = 'consume' then sum(b.price) else sum(- b.price) end as total_price,
  case when a.operate_type = 'consume' then sum(b.card/b.quantity) else sum(- b.card/b.quantity) end as ocard,
  case when a.operate_type = 'consume' then sum(b.red_envelope/b.quantity) else sum(- b.red_envelope/b.quantity) end as ored
from
  (select * from stg.stg_qunar_group_through_coupon_consume_trace_da where dt = '""" + data_dt + """' and to_date(operate_time) = '""" + data_dt + """' and operate_type in ('consume', 'restore')) a
  join
  (select id,quantity,cost_price,price,card,red_envelope,case when vid like '6%' then 'android' when vid like '8%' then 'iphone' when vid like '9%' then 'touch' else 'www' end as create_platform from stg.stg_qunar_group_order_da where dt = '""" + data_dt + """') b
  on a.order_id = b.id
  join
  (select id from stg.stg_qunar_group_team_da where dt = '""" + data_dt + """' and group_id = 4 and delivery = 'through_coupon') c
  on a.team_id = c.id
group by 
  a.team_id,b.create_platform,a.operate_type
order by
  team_id
UNION ALL
select
   a.team_id,
   b.create_platform,
   case when a.operate_type = 'consume' then sum(b.cost_price) else sum(- b.cost_price) end as total_cost_price,
   case when a.operate_type = 'consume' then sum(b.price) else sum(- b.price) end as total_price,
   case when a.operate_type = 'consume' then sum(b.card/b.quantity) else sum(- b.card/b.quantity) end as ocard,
   case when a.operate_type = 'consume' then sum(b.red_envelope/b.quantity) else sum(- b.red_envelope/b.quantity) end as ored
from
  (select * from stg.stg_qunar_group_coupon_consume_trace_da where dt = '""" + data_dt + """' and to_date(operate_time) = '""" + data_dt + """' and operate_type in ('consume', 'restore')) a
  join
  (select id,quantity,cost_price,price,card,red_envelope,case when vid like '6%' then 'android' when vid like '8%' then 'iphone' when vid like '9%' then 'touch' else 'www' end as create_platform from stg.stg_qunar_group_order_da where dt = '""" + data_dt + """') b
  on a.order_id = b.id
  join
  (select id from stg.stg_qunar_group_team_da where dt = '""" + data_dt + """' and group_id = 4 and delivery = 'coupon') c
  on a.team_id = c.id
group by 
  a.team_id,b.create_platform,a.operate_type
order by
  team_id
) q
group by 
  team_id,create_platform
) h
on a.team_id = h.team_id and a.create_platform = h.create_platform
cluster by team_id;"""

SQL2="""
insert overwrite table dwr.dwr_team_transaction_di partition (dt = '""" + data_dt + """')
select
team_id, platform_type, generate_order_qty, pay_order_qty, pay_room_night_qty, pay_amount, refund_order_qty,refund_room_night_qty,refund_amount,voucher_room_night_qty,voucher_order_qty,generate_room_night_qty,total_cost_price,total_price,total_card_amt,total_red_envelope_amt
from tmp.dwr_team_transaction_di
where dt = '""" + data_dt + """' and platform_type in ('www', 'touch');"""

SQL3="""
insert into table dwr.dwr_team_transaction_di partition (dt = '""" + data_dt + """')
select
team_id,'app',sum(generate_order_qty),sum(pay_order_qty),sum(pay_room_night_qty), sum(pay_amount),sum(refund_order_qty),sum(refund_room_night_qty),sum(refund_amount), sum(voucher_room_night_qty),sum(voucher_order_qty),sum(generate_room_night_qty),sum(total_cost_price),sum(total_price),sum(total_card_amt),sum(total_red_envelope_amt)
from tmp.dwr_team_transaction_di
where dt = '""" + data_dt + """' and platform_type in ('android', 'iphone') group by team_id;"""

sqls=map(lambda r:r[1],sorted([(int(k.split('SQL')[1]),v) for k,v in locals().items() if k.startswith('SQL')],key=lambda r:r[0]))

def main():
    hive=Hive()
    hive.set_date(data_dt)
    for sql in sqls:
        hive.add_sql(sql)
    hive.run()
if __name__ == '__main__':
    main()
