#!/usr/bin/python
#-*- coding: UTF-8 -*-
import csv,sys,codecs,os;
import commands;
reload(sys);
sys.setdefaultencoding('utf-8');

class Base():
	def __init__(self,section):
		self._sect=section;
	def get_host(self):
		return  self._sect.get("host",None);
	def get_base(self):
		return self._sect.get("base",None);
	def get_table(self):
		return self._sect.get("table",None);
	def get_password(self):
		return self._sect.get("password",None);
	def get_user(self):
		return self._sect.get("user",None);
	def get_type(self):
		return self._sect.get("type",None);
	def get_port(self):
		return self._sect.get("port",None);
	def get_file(self):
		return self._sect.get("file",None);

class OutBase(Base):
	def __init__(self,section):
		Base.__init__(self,section.get("from",None));
		self._section=section;
	def get_cond(self):
		return self._section.get("cond",None);
	def get_split(self):
		return self._section.get("split",None);
	def get_map(self):
		return self._section.get("map",None);
	def get_dir(self):
		return self._section["dir"];
	def get_map_num(self):
		return self._section.get("map_num",None);
	def get_hive_init(self):
		return self._section.get("init",None);

class InBase(Base):
	def __init__(self,section):
		Base.__init__(self,section.get("to",None));
		self._section=section;
	def get_split(self):
		return self._section.get("split",None);
	def get_overwrite(self):
		return self._section.get("overwrite",'');
	def get_partition(self):
		return self._section.get("partition",None);
	def get_concurrent(self):
		return self._section.get("concurrent",None);
