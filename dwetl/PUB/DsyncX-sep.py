#!/usr/bin/env python
import sys
import os
import re
import time
import datetime
import MySQLdb
if len(sys.argv)<2:
    day=time.strftime('%Y-%m-%d',time.localtime(time.time()))
    date=time.strftime('%Y%m%d',time.localtime(time.time()))
    cur = datetime.datetime.now()
    last_date = cur - datetime.timedelta(days=1)
    last_day = last_date.strftime("%Y-%m-%d")
else :
    date=sys.argv[1]
    hive_tb_name=sys.argv[2]
    print date
    print hive_tb_name
    #m=re.compile(r'^(\d{4})([^\d]+)?(\d{2})([^\d]+)?(\d{2})$').match(str(date))
    #day='-'.join(m.group(1,3,5))
    #last_day=date-1
    date2 = datetime.datetime.strptime(date,"%Y%m%d")
    day = date2.strftime("%Y-%m-%d")
    last_date=date2+datetime.timedelta(days=1)
    last_day=last_date.strftime("%Y-%m-%d")
#print date,day,last_day,hive_tb_name
def filejia(date):
    if os.path.isdir('/ROOT/LOGS/TB_DATA/'+date)==True :
        pass
    else :
        os.system('mkdir /ROOT/LOGS/TB_DATA/'+date)


def exe_sql(sql):
    db = MySQLdb.connect(host="10.10.67.17",port=3353,user="dataol",passwd="dataol-13",db="db_datamgrcfg")
    cursor = db.cursor()
    cursor.execute(sql)
    return cursor.fetchall()
    cursor.close()
    db.close()
    

filejia(date)
sql="select SUBSTRING(tb_name,1,INSTR(tb_name,'*')-1) as tb_name,sql_select,SUBSTRING(sql_from,1,INSTR(sql_from,'*')-1) as sql_from,sql_filter,is_increment,startwith,endwith,dbsrc_id,hive_tb_name from sep_tb_cfg where hive_tb_name='%s'" % (hive_tb_name)
print sql
result = exe_sql(sql)
for row in result:
    table_name,sql_select,sql_from,sql_filter,is_increment,startwith,endwith,dbsrc_id,hive_tb_name=row
    sql_2="select db_ip,db_port,db_user,db_password,db_name from db_source_cfg where dbsrc_id=%s" % (dbsrc_id)
    result2=exe_sql(sql_2)
    for i in range(startwith,endwith+1) :
        filename=table_name+ str(i)+'.txt'
        file_path="/ROOT/LOGS/TB_DATA/%s/%s" % (date,filename)
        if is_increment==0:
            sql=sql_select+sql_from + str(i)
            print sql
        else :
            sql_filter=sql_filter.replace('$data_dt_next','\'%s\'' % last_day).replace('$data_dt','\'%s\'' % day)
            sql=sql_select+sql_from+ str(i)+sql_filter
            print sql
        for row2 in result2 :
            db_ip,db_port,db_user,db_password,db_name=row2
            mysql="mysql -h %s -P %s -u %s -p\"%s\" -N -D %s -e \"%s\" --default utf8 >%s" % (db_ip,db_port,db_user,db_password,db_name,sql,file_path)
            if os.system(mysql)!=0 :
                sys.exit(1)
            os.system('rm -rf '+file_path+'.gz')
            if os.system('gzip '+file_path)!=0 :
                sys.exit("gzip error!")
            hql="hive -e \"load data local inpath '%s.gz' overwrite into table stg.%s partition(dt='%s',dp='%s');\"" % (file_path,hive_tb_name,day,i)
            print hql
            if os.system(hql)!=0 :
                sys.exit(1)
    
    
    
    
