#!/usr/bin/python
#coding=utf-8
import sys,codecs,operator,os,commands,traceback;
import smtplib,urllib2,urllib,json,time,codecs,datetime;
sys.path.append('/home/q/dwetl/lib/py/util')
sys.path.append('/home/q/dwetl/lib/py/db')
from DBI import DBI;
from Time import Time;
reload(sys);
sys.setdefaultencoding('utf-8')

data_dt=Time.date_format(sys.argv[1].split('.')[0].split('_')[-1]) if len(sys.argv)>1 else Time.yesterday()

class Excute_sql():
	def __init__(self,driver='mysql',dbc='db_data_discover',db='etlmetastore'):
		self._dbi=DBI(driver=driver,dbc=dbc);
		if db is not None:
			self._db=db;

	sql="""
	select ETL_System,etl_job,ETL_Server,RunningScript,Last_StartTime,Last_EndTime,Last_TXDate,Last_JobStatus,main_man,Mobile
	from etl_job o1 
	left join  etl_user o2 on o1.main_man=o2.UserName 
	where Enable=1 and main_man='tongyue.zhao'
	"""

	def monitor(self,sql=sql):
		print sql
		self._dbi.set_dbc(db=self._db)
		file=open('tmp.txt','a')
		
		self._dbi.connect()
		for running_content in self._dbi.fetch(sql):
			running_content='\t'.join(list(running_content))+'\n'
			file.write(running_content)
			
		self._dbi.close()

		file.close()

def monitor_running_job():
	Excute_sql().monitor()

if __name__=='__main__':
	monitor_running_job()	

