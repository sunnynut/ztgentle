#!/usr/bin/env python
#-*- coding:utf-8 -*-
import sys,re,os
sys.path.append('/home/q/dwetl/lib/py/util')
from Time import Time
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI
data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()
def deal_dwr_user_new_order_di():
    dbi=DBI(driver='postgre',dbc='qunar_group_congku2')
    dbi.set_dbc(db='qunar_group')
    now_time=Time.now()
    dbi.connect()
    sql="""
    delete from report.order_user_center_id;
    """
    dbi.execute_sql(sql)
    sql="""
    insert into report.order_user_center_id
    select 
        t1.id,
        t1.user_id,
        t1.create_time,
        coalesce((case when length(cast(t1.id as varchar(50)))>=12 then cast(t1.user_id as varchar(50)) else t2.profile->'user_center_id' end),cast(t1.user_id as varchar(50))),
        t1.state,
        t1.money,
        t1.team_id,
        t3.group_id
    from public.order t1
    left join public.user t2
    on t1.user_id=t2.id
    and length(cast(t1.id as varchar(50)))<12
    inner join public.team t3
    on t1.team_id=t3.id
    """
    dbi.execute_sql(sql)
    sql1="""
    delete from report.dwr_user_new_order_di where stat_date='"""+data_dt+"""';
    """
    dbi.connect()
    #dbi.execute_sql(sql1)
    print sql1
    sql2="""
    insert into report.dwr_user_new_order_di
    select 
        '"""+data_dt+"""' as stat_date,
        p1.user_center_id,
        case when p2.user_center_id is not null then 'N' else 'Y' end as new_user_flag,
        case when p2.user_center_id is null then p1.id end as first_buy_order_id
    from(
    select t1.user_center_id,row_number() over(partition by t1.user_center_id order by t1.create_time) as rn,t1.id 
    from report.order_user_center_id t1
    where t1.create_time >= extract(epoch from timestamp without time zone '"""+data_dt+"""') 
    and t1.create_time < extract(epoch from timestamp without time zone '"""+data_dt+"""'::date+interval '1 day'))p1
    left join (select distinct user_center_id from report.order_user_center_id where create_time<extract(epoch from timestamp without time zone '"""+data_dt+"""'))p2
    on p1.user_center_id=p2.user_center_id
    where p1.rn=1;
    """
    #dbi.execute_sql(sql2)
    print sql2
    dbi.close()
    
    
   
def main():
    deal_dwr_user_new_order_di()
if __name__ == '__main__':
    main()
