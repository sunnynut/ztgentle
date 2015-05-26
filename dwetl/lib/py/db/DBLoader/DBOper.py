#!/usr/bin/python
#-*- coding: UTF-8 -*-
import csv,sys,codecs,os,shutil,re,time;
import commands,string,getconf;
reload(sys);
sys.setdefaultencoding('utf-8');
sys.path.append('/home/q/hadoop/hive-default/lib/py');
from hive_service import ThriftHive;
from hive_service.ttypes import HiveServerException;
from thrift import Thrift;
from thrift.transport import TSocket;
from thrift.transport import TTransport;
from thrift.protocol import TBinaryProtocol;
class Mysql():
	def init(self,conf):
		self._conf=conf;
	def out_mysql_cmd(self,file):
		return "mysql "+" -h"+self._conf.get_host()+" -P"+self._conf.get_port()+" -u"+self._conf.get_user()+" -p"+self._conf.get_password()+ \
			" --database="+self._conf.get_base()+' --default-character-set=utf8 -N -B --quick -e "'+self._conf.get_cond()+'" >'+file;
	def out_db(self,file):
		cmd=self.out_mysql_cmd(file);
		print cmd
		status,message=commands.getstatusoutput(cmd);
		print message;
		if status !=0:
			print "out mysql is false";
			os._exit(1);
		if self._conf.get_split() is not None and self._conf.get_split()!='\\t':
			split="\\"+self.get_split().replace("'","");
			cmd='sed -i "s/\\t/'+split+'/g;s/NULL/\\\\\\\\N/g;s/null/\\\\\\\\N/g;s/\\r/\\\\\\\\r/g" '+file;
			print cmd;
			status,message=commands.getstatusoutput(cmd);
			print message;
		return file;
	def get_split(self):
		split=self._conf.get_split().replace('\\','');
		if split.isalnum() is True:
			split="x'"+hex(int(split,8)).replace('x','')+"'";
		else :
			split="'"+self._conf.get_split()+"'";
		return split;
	def in_mysql_cmd(self,file):
		split=self._conf.get_split().replace('\\','');

		return "mysql "+" -h"+self._conf.get_host()+" -P"+self._conf.get_port()+" -u"+self._conf.get_user()+" -p"+self._conf.get_password()+ \
			" --database="+self._conf.get_base()+' --default-character-set=utf8 -N -B --quick -e "load data local infile '+"'"+file+"' into table "+self._conf.get_table()+" fields terminated by "+self.get_split()+" lines terminated by '\\n'"+'"';
	def in_db(self,file):
		if os.path.isdir(file):
			for list_file in os.listdir(file):
				if list_file.startswith('.'):
					continue;
				cmd=self.in_mysql_cmd(file+'/'+list_file);
				print cmd;
				status,message=commands.getstatusoutput(cmd);
				print message;
				if status!=0:
					print "in mysql error";
					os._exit(1);
			return file;
		cmd=self.in_mysql_cmd(file);
		print cmd
		status,message=commands.getstatusoutput(cmd);
		if status !=0:
			print message
			print "in mysql is false";
			os._exit(1);
		return file;
	def close(self):
		return;

class Hive():
	def __init__(self):
		self._conf=None;
	def init(self,conf):
		if self._conf is not None:
			self._conf=conf;
			return;
		self._conf=conf;
		hive_ip=self._conf.get_host();
		hive_port=str(self._conf.get_port());
		hive_t_socket=TSocket.TSocket(hive_ip,hive_port);
		hive_t_socket=TSocket.TBufferedTransport(hive_t_socket);
		hive_protocol=TBinaryProtocol.TBinaryProtocol(hive_t_socket);
		hive_client=ThriftHive.Client(hive_protocol);
		hive_t_socket.open();
		self._client= hive_client;
		self._conn=hive_t_socket;

	def out_hive_cmd(self,file):
		split=self._conf.get_split();
		if split==None or split=='\t':
			split='\\001'
		return "insert overwrite local directory '"+file+"' row format delimited fields terminated by '"+split+"' "+self._conf.get_cond();
	def out_db(self,file):
		cmd=self.out_hive_cmd(file);
		print cmd;
		init="use "+self._conf.get_base();
		self._client.execute(init);
		init_sqls=self._conf.get_hive_init();
		if init_sqls is not None:
			for init_sql in init_sqls.split(";"):
				self._client.execute(init_sql);
		self._client.execute(cmd);
		return file;

	def in_hive_cmd(self,file):
		cmd=None;
		if self._conf.get_partition() is None:
			cmd= "load data local inpath '"+file+"' "+self._conf.get_overwrite()+" into table "+self._conf.get_base()+'.'+self._conf.get_table();
		else:
			part_value_str=self._conf.get_partition();
			part_value_list=re.split(';|=',part_value_str);
			if len(part_value_list)%2 !=0:
				print "the partition "+part_value_str+" conf is error";
				os._exit(1);
			partitions='';
			index=0;
			while index<len(part_value_list):
				partitions+=part_value_list[index]+"='"+part_value_list[index+1]+"',";
				index+=2;
			cmd="load data local inpath '"+file+"' "+self._conf.get_overwrite()+" into table "+self._conf.get_base()+'.'+self._conf.get_table()+" partition("+partitions[:len(partitions)-1]+")";	
		return cmd;
	def in_db(self,file):
		init="set hive.exec.dynamic.partition.mode=nonstrict";
		self._client.execute(init);
		init="use "+self._conf.get_base();
		self._client.execute(init);
		cmd=self.in_hive_cmd(file);
		print cmd;
		self._client.execute(cmd);
	def close(self):
		self._conn.close();

class Postpg():
	def init(self,conf):
		self._conf=conf;
	def out_pg_cmd(self,file):
		return 	"export PGPASSWORD="+self._conf.get_password()+"&&/usr/bin/psql -h "+self._conf.get_host()+" -U "+self._conf.get_user()+  \
			 " -d "+self._conf.get_base()+" -p "+self._conf.get_port()+' -c "copy ('+self._conf.get_cond()+ ') to stdout DELIMITER '+"E'"+self._conf.get_split()+"'"+'"' +">"+file
	def out_db(self,file):
		cmd=self.out_pg_cmd(file);
		print cmd;
		status,message=commands.getstatusoutput(cmd);
		print message;
		if status!=0:
			print "out_hive error";
			os._exit(1);
		return file
	def in_pg_cmd(self,file):
		return  "export PGPASSWORD="+self._conf.get_password()+"&& /usr/bin/psql -h "+self._conf.get_host()+" -U "+self._conf.get_user()+  \
			" -d "+self._conf.get_base()+" -p "+self._conf.get_port()+' -c " copy '+self._conf.get_table()+" from STDIN DELIMITER as E'"+self._conf.get_split()+"' NULL as '\\N'"+'"' +"<"+file;
	def in_db(self,file):
		if os.path.isdir(file):
			for list_file in os.listdir(file):
				if list_file.startswith('.'):
					continue;
				cmd=self.in_pg_cmd(file+"/"+list_file);
				print cmd;
				status,message=commands.getstatusoutput(cmd);
				print message;
				if status!=0:
					print "in pg error";
					os._exit(1);
			return;
		cmd=self.in_pg_cmd(file);
		print cmd;
		status,message=commands.getstatusoutput(cmd);
		print message;
		if status!=0:
			print "in pg error";
			os._exit(1);
	def close(self):
		return;

class_map={"mysql":Mysql(),"postgresql":Postpg(),"hive":Hive()};


def hive_in(hive_conf,out_conf):
	cmd ="sudo -u desdev /home/q/sqoop/bin/sqoop import --connect jdbc:"+out_conf.get_type()+"://"+out_conf.get_host()+":"+out_conf.get_port()+"/"+out_conf.get_base()+" --username "+out_conf.get_user()+" --password "+out_conf.get_password();
	cond=out_conf.get_cond();
	where=None;
	columns=None;
	where_before='';
	if cond is not None:
		columns_split=cond.split("from");
		columns=''.join(re.split("\s+",columns_split[0].strip())[1:]);
		where_split=cond.split("where");
		where_befor=where_split[0];
		if len(where_split)>=2:
			where=where_split[1].strip()+" and \\$CONDITIONS";
	if where_before.find('*')>0:
		cmd+=" --table "++out_conf.get_table();
	else :
		cmd+=" --target-dir "+hive_conf.get_table();
		cmd+=' --query "'+where_befor;
		if where!=None:
			cmd+=" where "+where+'"';
		else:
			cmd+=' where \\$CONDITIONS "';
	overwrite=''
	if hive_conf.get_overwrite() != '':
		overwrite="--hive-overwrite";
	cmd+=" --hive-import "+overwrite+" --hive-table "+hive_conf.get_base()+'.'+hive_conf.get_table()
	if hive_conf.get_partition() is not None:
		partition=hive_conf.get_partition().split('=');
		cmd+=" --hive-partition-key "+partition[0]+" --hive-partition-value "+partition[1];
	if out_conf.get_map() is not None:
		cmd+=" --map-column-java "+out_conf.get_map().replace(',','=String,')+'=String';
		cmd+=" --map-column-hive "+out_conf.get_map().replace(',','=String,')+'=String';
	if hive_conf.get_split() is None:
		cmd+=" --fields-terminated-by '\\001'";
	else :
		cmd+=" --fields-terminated-by '"+hive_conf.get_split()+"'";
	cmd+=" --null-string '\\\\N' --hive-delims-replacement '\\005'";
	if hive_conf.get_concurrent() is not None:
		cmd+=" --split-by "+hive_conf.get_concurrent()+" -m 10";
	else:
		cmd+=' -m 1';
	print cmd;
	
	status,message=commands.getstatusoutput(cmd);
	print message;
	if status!=0:
		print "in hive error";
		os._exit(1);

def hive_out(hive_conf,in_conf):
	cmd ="sudo -u desdev /home/q/sqoop/bin/sqoop export --connect jdbc:"+in_conf.get_type()+"://"+in_conf.get_host()+":"+in_conf.get_port()+"/"+in_conf.get_base()+" --username "+in_conf.get_user()+" --password "+in_conf.get_password()+" --table "+in_conf.get_table().split('.')[-1]+" --export-dir "+hive_conf.get_dir()
	if in_conf.get_split() is None:
		cmd+=" --input-fields-terminated-by '\\001'";
	else:
		cmd+=" --input-fields-terminated-by '"+in_conf.get_split()+"'";
	cmd+=" --input-null-string '\\\\N' --input-null-non-string '\\\\N' --num-mappers ";
	if hive_conf.get_map_num() is None:
		cmd+=" 10 ";
	else :
		cmd+=" "+hive_conf.get_map_num()+" ";
	print cmd;
	status,message=commands.getstatusoutput(cmd);
	print message;
	if status!=0:
		print "in hive error";
		os._exit(1);

class OutDBOpeClass():
	def init(self,in_conf):
		self._db=None;
		self.file=in_conf.get_file();
		if self.file==None:
			db=class_map.get(in_conf.get_type(),None);
			if db==None:
				print "the db type "+"doesn't support";
				os._exit(1);
			db.init(in_conf);
			self._db=db;

	def out_db(self,file):
		if os.path.exists(file):
			if os.path.isdir(file):
				shutil.rmtree(file);
			else:
				os.remove(file);
		if self.file ==None:
			self._db.out_db(file);
		else:
			file=self.file;
		if os.path.isdir(file):
			file_list=os.listdir(file);
			file_list=filter(lambda x:x.startswith('.')==False,file_list);
			file_list=map(lambda x:file+'/'+x,file_list);
			file=file+"/_total";
			status,message=commands.getstatusoutput('cat '+' '.join(file_list)+' >'+file);
			print message;
			if status!=0:
				print "combine file fault,file:"+file;
		return file;

	def close(self):
		if self._db !=None:
			self._db.close();

class InDBOpeClass():
	def init(self,in_conf):
		self._db=None;
		self.file=in_conf.get_file();
		if self.file==None:
			db=class_map.get(in_conf.get_type(),None);
			if db==None:
				print "the db type "+in_conf.get_type()+"doesn't support";
				os._exit(1);
			db.init(in_conf);
			self._db=db;
	def in_db(self,file):
		if os.path.exists(file) is False:
			print "the in db file "+file+"is not exist";
			os._exit(1);
		if self.file ==None:
			self._db.in_db(file);
			return file;
		else:
			status,message=commands.getstatusoutput('mv '+file+' '+self.file);
			print message;
			if status!=0:
				print "mv file from "+file+" to "+self.file+" fault";
				os._exit(1);
	def close(self,file):
		if self._db!=None:
			self._db.close();
		if os.path.exists(file):
			status,message=commands.getstatusoutput("sudo rm -r "+file);
			print message;
			if status!=0:
				print "rm tmp file:  "+file+" fault ";
				os._exit(1);

class Transplant():
	def __init__(self,sect):
		self._choose=sect.get("choose",None);
		self._inconf=getconf.InBase(sect);
		self._outconf=getconf.OutBase(sect);
	def transplant(self):
		if self._inconf.get_type() == "hive" and self._choose is None:
			hive_in(self._inconf,self._outconf);
			return
		elif self._outconf.get_type() == "hive" and self._choose is None:
			hive_out(self._outconf,self._inconf);
			return;
		base_dir="/home/q/hive_tmp/loader/";
		'''
		if len(os.listdir())>0:
			commands.getstatusoutput("sudo rm -r "+base_dir+"*");
			print message;
			if status!=0: 
				print "clear tmp dir:  "+base_dir+" fault ";
				os._exit(1);
		'''
		table_name=self._outconf.get_table();
		if table_name is None:
			table_name="tmp";
		out_file=base_dir+table_name+time.strftime('%Y-%m-%d-%H-%M-%S',time.localtime(time.time()));
		if os.path.exists(out_file):
			status,message=commands.getstatusoutput("sudo rm -r "+out_file);
			print message;
		in_db=InDBOpeClass();
		out_db=OutDBOpeClass();
		out_db.init(self._outconf);
		file=out_db.out_db(out_file);
		in_db.init(self._inconf);
		in_db.in_db(file);
		in_db.close(out_file);
		out_db.close();

if __name__=='__main__':
	print 'success';
	a=class_map['hive'];
