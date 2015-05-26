#!/usr/bin/python
#-*- coding: UTF-8 -*-
import csv,sys,codecs,os,re;
reload(sys);
sys.setdefaultencoding('utf-8');
class InitConf():
	def __init__(self,ins_conf,global_conf="/home/q/dwetl/lib/py/db/DBLoader/database.conf"):
		if os.path.exists(global_conf) is False:
			print "the file:"+global_conf+" is not exits,please check the conf file";
			os._exit(1);
		confData=codecs.open(global_conf,'r',encoding='utf-8');
		self._confs=self.create_confs(confData);
		confData.close();
		self._ins=None;
		self._section_list=None;
		if ins_conf is not None:
			if os.path.exists(ins_conf) is False:
				print "the file:"+ins_conf+" is not exits,please check the conf file";
				os._exit(1);
			confData=codecs.open(ins_conf,'r',encoding='utf-8');
			(self._ins,self._section_list)=self.create_confs(confData);
			confData.close();
	def create_confs(self,confData):
		confs_map={};
		section_list=[];
		if confData is None:
			print "the open conf file is not exits";
			os._exit();
		operator_map=None;
		for line in confData.readlines():
			line=line.strip();
			if line=='':
				continue;
			m=re.match(r"\[.*(global|section)\=\w+.*\]",line);
			if m is not None:
				m=re.search(r"(global|section)=\w+",line);
				section_value=m.group(0).split('=');
				if len(section_value)!=2:
					print "the gloabl conf is error, it must be like this [ global=you ]";
					os._exit(1);
				operator_map=confs_map.setdefault(m.group(0),{});
				if m.group(0).strip().find("section")==0:
					section_list.append(m.group(0));
				continue;
			if operator_map==None:
				continue;
			self.create_conf(operator_map,line);
		return confs_map,section_list;
			
	def create_conf(self,conf_map,line):
		index=line.find('=');
		if index<=0:
			print line+" conf error";
		conf_map.setdefault(line[:index].strip(),line[index+1:].strip());
	
	def get_conf(self,name):
		return self._confs.get(name);
	
class InitArgvs():
	def __init__(self,args):
		self._argv_map={};
		if args is None:
			self.init_gloabl();
			return;
		pos=0;
		while pos<len(args):
			if pos%2==0 and args[pos].startswith("-") is True and args[pos+1].startswith("-") is False:
				self._argv_map[args[pos][2:]]=args[pos+1];
				pos+=2;
			else :
				print "the in put args is not right";
				os._exit(1);
		self.init_gloabl();

	def init_gloabl(self):
		init=InitConf(self._argv_map.get("conf-file",None));
		self._confs=init._confs[0];
		self._ins=init._ins;
		self._section_list=init._section_list

	def get_argvs_section(self,se_list):
		argvs_section=self._argv_map;
		if argvs_section.get("from",None)==None or argvs_section.get("to",None)==None:
			return se_list;
		else:
			se_list.append(argvs_section);
			return se_list;

	def set_section(self):
		self.section=[];
		self.get_argvs_section(self.section);
		if self._ins is None or self._section_list is None:
			return self.section;
		for section in self._section_list:
			self.section.append(self._ins.get(section));
		return self.section;
	def get_section(self):
		sects=self.set_section();
		for sect in sects:
			sect["from"]=self.from_to("from",sect["from"]);
			sect["to"]=self.from_to("to",sect["to"]);
			se_table=sect["from"].get("table",None);
			sect.setdefault("cond",None);
			if se_table is not None and sect["cond"] is None:
				sect["cond"]="select * from "+se_table;
				if sect["from"].get("type",None)=='hive':
					sect["cond"]="select * from "+sect["from"].get("base","default")+"."+se_table;
			sect.setdefault("split",None);
		return sects;

	def from_to(self,key,sec):
		if sec.find("/")>=0:
			return {"file":sec};
		fro=sec.split(":");
		if len(fro)<3:
			print "the "+key+" conf must contain use:base:table";
			os._exit(1);
		global_sec=self._confs.get("global="+fro[0],None);
		if self._ins is not None:
			global_sec=self._ins.get("global="+fro[0],global_sec);
		if global_sec is None:
			print "the section "+sec.get(key)+" global conn't find";
			os._exit(1);
		global_sec["base"]=fro[1];
		global_sec["table"]=fro[2];
		return global_sec;

if __name__=='__main__':
	init_ins=InitArgvs(["--conf-file","/home/q/mingxiang.yan/DBLoader/test.conf"]);
	init_ins.get_section();

	#init_ins=InitArgvs(["--from","discover:base:table","--to","discover2:base:table"]);
	#init_ins.get_section();
	
	#init_ins=InitArgvs(["--from","discover:base:table","--to","discover2:base:table","--conf-file","/home/q/mingxiang.yan/DatabaseLoader/test.conf"]);
	#init_ins.get_section();
