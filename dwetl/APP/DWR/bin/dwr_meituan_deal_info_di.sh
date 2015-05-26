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
  create table if not exists dwr.dwr_meituan_room_type_di(
  qunar_city_code string , 
  rival_city_code string ,  
  deal_id string , 
  hotel_seq string , 
  hotel_id string , 
  name string , 
  address string ,
  physical_room_type string , 
  rival_room_type string , 
  rtid string , 
  price double , 
  room_night int , 
  can_appoint  string , 
  window string , 
  wifi  string , 
  breakfast string , 
  broadbrand string , 
  deal_title string , 
  value double , 
  is_hour_room string ,
  is_vouchers string , 
  is_kuaiding string 
  )
  partitioned by (dt string )
  row format delimited fields terminated by '\001'
"""
echo "$SQL0"
$HIVE_HOME/bin/hive -e "$SQL0"  
}


create_mysql_table(){
SQL0="""
  create table if not exists dwr.dwr_meituan_room_type_di(
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

caculate_data(){
date_dash=$1
SQL1="""
insert overwrite table dwr.dwr_meituan_sales_volomn_di partition (dt = '$date_dash')
select * from stg.stg_meituan_
"""
echo "$SQL1"
$HIVE_HOME/bin/hive -e "$SQL1"
}


load_to_mysql(){
 date_dash=$1
 sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw04Mysql:db_data_capture:dwr_meituan_sales_volumn_di  --from hive:dwr:dwr_meituan_sales_volomn_di --split '\001' --choose choose --cond "select dt, deal_id , sales, flag from dwr.dwr_meituan_sales_volomn_di where dt='$date_dash'"
}


while [[ $date -le $enddate  ]]  
do
  echo $date
  date_dash=`date -d "+0 day $date" +%Y-%m-%d`
  last_day=`date -d "-1 day $date" +%Y%m%d`
  create_table
  import_data $date_dash
  create_mysql_table
  load_to_mysql $date_dash
  
  date=`date -d "+1 day $date" +%Y%m%d`
done

