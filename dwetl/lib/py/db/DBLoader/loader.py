#!/usr/bin/python
#-*- coding: UTF-8 -*-
import csv,sys,codecs,os,datetime,shutil,commands;
import init,getconf,DBOper;
reload(sys);
sys.setdefaultencoding('utf-8');
#base_dir="/home/q/mingxiang.yan/hive_tmp/"
args=None;
if len(sys.argv)>1:
	args=sys.argv[1:];
conf=init.InitArgvs(args);
sections=conf.get_section();
for sect in sections:
	trans=DBOper.Transplant(sect);
	trans.transplant();
