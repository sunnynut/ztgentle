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
  $HIVE_HOME/bin/hive -e "
  create table if not exists dwd.dwd_meituan_team_city_his_di(
  deal_id string, 
  qunar_city_code string, 
  qunar_city_code_count int 
  )
  partitioned by (dt string )
  row format delimited fields terminated by '\001'
"
}





insert_data_into_team_city(){
  date_dash=$1
  sql="use dwd;insert overwrite table dwd.dwd_meituan_team_city_his_di partition(dt='$date_dash')
  select B.deal_id , 
  case when B.qunar_city_code_count > 1 then 'multi' 
       when B.qunar_city_code_count < 1 then 'unkown'
       else B.qunar_city_code 
  end as qcc , 
  B.qunar_city_code_count
  from 
  ( select A.deal_id as deal_id, 
    max( A.qunar_city_code ) as qunar_city_code,
    count( A.qunar_city_code ) as qunar_city_code_count
    from 
    (
      select  deal_id as deal_id, qunar_city_code as qunar_city_code from stg.stg_meituan_sales_volomn_di where dt='$date_dash' and deal_id !='-1' and deal_id !='None' group by deal_id , qunar_city_code
    )A
    group by A.deal_id
  )B
"
   echo "$sql"
   $HIVE_HOME/bin/hive -e "$sql"
}


create_mysql_table(){
SQL0="""
  create table if not exists db_data_capture.dwd_meituan_team_city(
  deal_id varchar(255) comment '团品id', 
  qunar_city_code varchar(255) comment '去哪儿城市代码', 
  qunar_city_code_count int  comment '去哪儿城市数'  ,
  UNIQUE KEY dt_dwd_meituan_team_city ( deal_id ) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
"""
echo "$SQL0"
mysql -h l-dw04.des.cn5.qunar.com -u db_data_discover -p8XGscMfxyCQS4HW3rWz3cTod -e "$SQL0" 
}

load_to_mysql(){
 date_dash=$1
 sudo -u desdev python /home/q/dwetl/lib/py/db/DBLoader/loader.py --to dw04Mysql:db_data_capture:dwd_meituan_team_city  --from hive:dwd:dwd_meituan_team_city_his_di --split '\001' --choose choose --cond "select  deal_id , qunar_city_code , qunar_city_code_count from dwd.dwd_meituan_team_city_his_di where dt='$date_dash'"
}



while [[ $date -le $enddate  ]]  
do
  echo $date
  date_dash=`date -d "+0 day $date" +%Y-%m-%d`
  last_day=`date -d "-1 day $date" +%Y%m%d`
  #create_table
  #insert_data_into_team_city $date_dash
  create_mysql_table
  load_to_mysql $date_dash
  date=`date -d "+1 day $date" +%Y%m%d`
done
