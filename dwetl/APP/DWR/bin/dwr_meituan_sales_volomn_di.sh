#/bin/sh
source /home/desdev/.bash_profile
source /home/desdev/.bashrc
source /etc/profile


if [ -z $1 ];then
  date=$(date -d '1 days ago' '+%Y%m%d')
else
  date=$(date -d "+0 day $1" '+%Y%m%d' )
fi

if [ -z $2 ];then
  enddate=$date
else
  enddate=`date -d "+0 day $2" +%Y%m%d`
fi

if [ -z $2 ];then
  enddate=$date
else
  enddate=`date -d "+0 day $2" +%Y%m%d`
fi

create_table(){
SQL0="""
  create table if not exists dwr.dwr_meituan_sales_volomn_di(
  deal_id string  , 
  sales double ,
  flag int
  )
  partitioned by (dt string )
  row format delimited fields terminated by '\001'
"""
echo "$SQL0"
$HIVE_HOME/bin/hive -e "$SQL0"  
}


create_mysql_table(){
SQL0="""
  create table if not exists db_data_capture.dwr_meituan_sales_volumn_di(
  dt varchar(100) comment '计算日期',
  deal_id varchar(255) comment '团品id', 
  sales double comment '销量' ,
  flag int comment '减的哪天的销量-1没减,1昨天2前天,3,大前天' ,
  UNIQUE KEY dt_dwr_meituan_sales_volumn_di (dt, deal_id ) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
"""
echo "$SQL0"
mysql -h l-dw04.des.cn5.qunar.com -u db_data_discover -p8XGscMfxyCQS4HW3rWz3cTod -e "$SQL0"  

}

import_data(){
date_dash=$1
date_dash_yes=$2
date_dash_byes=$3
date_dash_bbyes=$4
SQL1="""
insert overwrite table dwr.dwr_meituan_sales_volomn_di partition (dt = '$date_dash')
select 
A.deal_id, 
case when B.solds is NULL and C.solds is NULL and D.solds is NULL then A.solds*1.0
     when B.solds is NULL and C.solds is NULL and D.solds is not NULL then  (A.solds - D.solds)*1.0/3
     when B.solds is NULL and C.solds is not NULL then (A.solds - C.solds)*1.0/2
     when B.solds is not NULL  then (A.solds - B.solds)*1.0
end as solds, 

case when B.solds is NULL and C.solds is NULL and D.solds is NULL then -1
     when B.solds is NULL and C.solds is NULL and D.solds is not NULL then 3
     when B.solds is NULL and C.solds is not NULL  then 2
     when B.solds is not NULL  then 1
end as flag 
from 
( select deal_id , max( solds ) as solds from stg.stg_meituan_sales_volomn_di 
  where dt='$date_dash' and deal_id !='-1' and deal_id !='None' and is_hour_room='False' and is_vouchers ='False'
  group by deal_id
) A left outer join 
( select deal_id , max(solds) as solds from stg.stg_meituan_sales_volomn_di 
  where dt='$date_dash_yes' and deal_id !='-1' and deal_id !='None' and is_hour_room='False' and is_vouchers ='False'
  group by deal_id)B 
on A.deal_id = B.deal_id
left outer join 
(select deal_id , max(solds) as solds from stg.stg_meituan_sales_volomn_di 
 where dt='$date_dash_byes'  and deal_id !='-1' and deal_id !='None' and is_hour_room='False' and is_vouchers ='False'
 group by deal_id )C
on A.deal_id=C.deal_id
left outer join 
(select deal_id , max(solds) as solds from stg.stg_meituan_sales_volomn_di 
  where dt='$date_dash_bbyes' and deal_id !='-1' and deal_id !='None' and is_hour_room='False' and is_vouchers ='False'
  group by deal_id) D
on A.deal_id=D.deal_id
"""
echo "$SQL1"
$HIVE_HOME/bin/hive -e "$SQL1"
}


load_to_mysql(){
 date_dash=$1
 mysql -h l-dw04.des.cn5.qunar.com -u db_data_discover -p8XGscMfxyCQS4HW3rWz3cTod -e "delete from db_data_capture.dwr_meituan_sales_volumn_di where dt='$date_dash'"
 sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw04Mysql:db_data_capture:dwr_meituan_sales_volumn_di  --from hive:dwr:dwr_meituan_sales_volomn_di --split '\001' --choose choose --cond "select dt, deal_id , sales, flag from dwr.dwr_meituan_sales_volomn_di where dt='$date_dash'"
}


while [[ $date -le $enddate  ]]  
do
  echo $date
  date_dash=`date -d "+0 day $date" +%Y-%m-%d`
  last_day=`date -d "-1 day $date" +%Y%m%d`
  date_dash_yes=`date -d "-1 day $date" +%Y-%m-%d`
  date_dash_byes=`date -d "-2 day $date" +%Y-%m-%d`
  date_dash_bbyes=`date -d "-3 day $date" +%Y-%m-%d`
  create_table
  import_data $date_dash $date_dash_yes $date_dash_byes $date_dash_bbyes
  create_mysql_table
  load_to_mysql $date_dash
  
  date=`date -d "+1 day $date" +%Y%m%d`
done

