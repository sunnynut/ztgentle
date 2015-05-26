#!/usr/bin/env python
#-*- coding:utf-8 -*-
import os,sys,re,time
sys.path.append('/home/q/dwetl/lib/py/util')
from Shell import Shell
from Time import Time
from Logger import logger


class BaseHive(object):
    
    def __init__(self):
        self._dbc=None
        self._sql=None
        self._sep=None
        self._timeout=7200
        self._has_header=False
        self._sqls=[]
        self._date=Time.yesterday()
        
    def set_timeout(self,timeout):
        self._timeout=timeout
        return self
    
    def get_timeout(self):
        return self._timeout
        
    def set_dbc(self,**dbc):
        self._dbc=dbc
        return self
    
    def get_dbc(self):
        return self._dbc
    
    def set_sql(self,sql):
        self._sql=sql
        self._sqls=[sql]
        return self
    
    def get_sql(self):
        return self._sql
    
    def get_real_sql(self,sql):
        return self.replace_date(sql.strip().rstrip(';'))
    
    def add_sql(self,sql):
        self._sqls.append(sql)
        return self
    
    def set_sep(self,sep):
        self._sep=sep
        return self
    
    def get_sep(self):
        return self._sep
    
    def set_date(self,date):
        self._date=Time.date_format(date)
        return self
    
    def get_date(self):
        return self._date
    
    def set_has_header(self,has_header):
        self._has_header=has_header
        return self
    
    def get_has_header(self):
        return self._has_header
    
    def replace_date(self,sql):
        regex=re.compile(r'\${date:?([^\}]+)?}')
        m=regex.search(sql)
        if m:
            sep='-'
            if m.group(1):
                sep=m.group(1)
                if sep=="''" or sep=='""' :
                    sep=''
            sql=regex.sub(Time.date_format(self._date,sep),sql)
        return sql
    
    def connect(self):
        pass
    
    def execute(self,sql):
        pass
    
    def handle_line(self,line,to_list=False):
        if to_list:
            return line.split('\t')
        if self._sep is None:
            return line
        return self._sep.join(line.split('\t'))
    
    def fetch_rows(self,sql,to_list=False):
        try:
            sql=self.get_real_sql(sql)
            full_sql=self.execute(sql)
            logger.info('Begin execute sql: \n%s' % full_sql)
            for line in self.get_lines(full_sql):
                row=self.handle_line(line,to_list=to_list)
                yield row
        except SystemExit,exit_code:
            sys.exit(exit_code)
        except Exception,msg:
            logger.error(str(msg))
            m=re.search(r'error code is ([^\.]+)\.',str(msg))
            if m:
                exit_code=int(m.group(1))
            else:
                exit_code=100
            sys.exit(exit_code)
        logger.info('End execute sql')
    
    def get_lines(self,sql=None):
        pass
    
    def close(self):
        pass
    
    def kill(self,job):
        pass
    
    def fetch(self,to_list=False):
        for sql in self._sqls:
            for row in self.fetch_rows(sql,to_list=to_list):
                yield row
                
    def run(self):
        for row in self.fetch():
            print row
    
    def export(self,out=sys.stdout,sep='\t',line_sep='\n'):
        if isinstance(out,basestring):
            f=open(out,'w')
        else:
            f=out
        to_list=False if sep=='\t' else True
        for row in self.fetch(to_list=to_list):
            if isinstance(row,list):
                f.write(sep.join(row)+line_sep)
            else:
                f.write(row+line_sep)
        if isinstance(out,basestring):
            f.close()
            
class ThriftHive(BaseHive):
    
    def __init__(self):
        super(self.__class__,self).__init__()
        from wwpy.util.Path import Path
        sys.path.append('/home/q/hadoop/hive-default/lib/py')
        from hive_service import ThriftHive as _ThriftHive
        from hive_service.ttypes import HiveServerException
        from thrift import Thrift
        from thrift.transport import TSocket
        from thrift.transport import TTransport
        from thrift.protocol import TBinaryProtocol
        self._ThriftHive=_ThriftHive
        self._HiveServerException=HiveServerException
        self._Thrift=Thrift
        self._TSocket=TSocket
        self._TTransport=TTransport
        self._TBinaryProtocol=TBinaryProtocol
        self._transport=None
        self._client=None
        
    def connect(self):
        assert self._dbc is not None,"Must set dbc at first."
        try:
            hive_ip = "localhost"
            hive_port = 10000
            self._transport=self._TSocket.TSocket(hive_ip,hive_port)
            self._transport=self._TTransport.TBufferedTransport(self._transport)
            self._protocol=self._TBinaryProtocol.TBinaryProtocol(self._transport)
            self._transport.open()
            self._client=self._ThriftHive.Client(self._protocol)
        except self._Thrift.TException,tx:
            logger.error('%s' % (tx.message))
            sys.exit(1)
        self.execute("use %s" % self._dbc['db'])
        
    def execute(self,sql):
        if self._client is None:
            self.connect()
        try:
            self._client.execute(sql)
        except self._Thrift.TException,tx:
            logger.error('%s' % (tx.message))
            sys.exit(2)
            
    def get_lines(self,sql=None):
        try:
            for line in self._client.fetchAll():
                yield line
        except self._Thrift.TException,tx:
            logger.error('%s' % (tx.message))
            sys.exit(3)
            
    def close(self):
        if self._transport is None:
            return
        try:
            self._transport.close()
            self._transport=None
            self._client=None
        except self._Thrift.TException,tx:
            logger.error('%s' % (tx.message))
            sys.exit(4)

SQL_REGEX=re.compile(r'-e "([^"]+)"',re.MULTILINE)
ERROR_REGEX=re.compile(r'(?:FAILED|Exception):',re.I)
TIME_TAKEN_REGEX=re.compile(r'Time taken: ([\d\.]+) seconds')
APP_ID_REGEX=re.compile(r'^Starting Job .+?(application_\d+_\d+)')

class ShellHive(BaseHive):
    
    def __init__(self):
        super(self.__class__,self).__init__()
        self._silent=False
        self._compress=False
        self._hive_home='/home/q/hadoop/hive-default'
        self._hadoop_home='/home/q/hadoop-2.2.0'
        self._sql_file=None
        
    def set_path(self,hive_home='/home/q/hadoop/hive-default',hadoop_home='/home/q/hadoop-2.2.0'):
        self._hive_home=hive_home
        self._hadoop_home=hadoop_home
        return self
    
    def set_compress(self,compress):
        self._compress=compress
        return self
    
    def get_compress(self):
        return self._compress
    
    def set_silent(self,silent):
        self._silent=silent
        return self
    
    def get_silent(self):
        return self._silent
    
    def set_sql_file(self,sql_file='hive_cms.sql'):
        self._sql_file=sql_file
        return self
    
    def execute(self,sql):
        if self._hive_home and self._hadoop_home:
            full_sql='export HADOOP_HOME={home} && '.format(home=self._hadoop_home.rstrip('/'))
            full_sql+='sudo -u desdev '+self._hive_home.rstrip('/')+'/bin/hive '
        else:
            full_sql='hive '
        if self._dbc:
            full_sql+='-h {host} -p {port} '.format(host=self._dbc['host'],port=self._dbc['port'])
        if self._silent:
            full_sql+='-S '
        if self._sql_file:
            full_sql+='-i {sql_file} '.format(sql_file=self._sql_file)
        if sql.endswith('.sql') and os.path.exists(sql):
            full_sql+='-f {sql}'.format(sql=sql)
        else:
            full_sql+='-e "\n'
            if self._compress:
                full_sql+='set mapred.output.compress=true;\n'
                full_sql+='set hive.exec.compress.output=true;\n'
                full_sql+='set mapred.output.compression.codec=com.hadoop.compression.lzo.LzopCodec;\n'
                full_sql+='set io.compression.codecs=com.hadoop.compression.lzo.LzopCodec;\n'
            if self._has_header:
                full_sql+='set hive.cli.print.header=true;\n'
            full_sql+=sql.replace('"', '\\"')+';"\n'
        return full_sql
        
    def get_lines(self,full_sql):
        shell=Shell(full_sql)
        outs=shell.outs()
        if self._silent:
            for line in outs:
                yield line
        else:
            app_id,start=None,0
            m=re.search(SQL_REGEX,full_sql)
            if m:
                parts=m.group(1).split(';')
            else:
                parts=full_sql
            idx=-1
            line=outs.next()
            outing=False
            while line:
                if line=='OK':
                    outing=True
                    line=outs.next()
                elif re.search(ERROR_REGEX,line):
                    raise Exception("Execute hive sql error: %s" % line)
                elif re.search(APP_ID_REGEX,line):
                    app_id=re.search(APP_ID_REGEX,line).group(1)
                    start=time.time()
                    print line
                    line=outs.next()
                else:
                    if not re.search(TIME_TAKEN_REGEX,line):
                        print line
                    line=outs.next()
                if app_id and time.time()-start>=self._timeout:
                    self.kill(app_id)
                while outing:
                    if app_id and time.time()-start>=self._timeout:
                        self.kill(app_id)
                    m=re.search(TIME_TAKEN_REGEX,line)
                    if m:
                        outing=False
                        idx+=1
                        print
                        logger.info('Sql "%s" take %s seconds.' % (parts[idx].strip(),m.group(1)))
                        print
                    elif re.search(ERROR_REGEX,line):
                        raise Exception("Execute hive sql error: %s" % line)
                    else:
                        yield line
                        line=outs.next()
                        
    def kill(self,job):
        print "Timeout error: {job}'s run time is over {time}s".format(job=job,time=self._timeout)
        cmd="yarn application -kill {job}".format(job=job)
        sh=Shell()
        sh.run(cmd)
        sys.exit(500)
        
class Hive(object):
    
    drivers=dict(
        shell=ShellHive,
        thrift=ThriftHive,
    )
    
    def __new__(cls,driver='shell'):
        driver_cls=cls.drivers.get(driver)
        if driver_cls is None:
            raise Exception("No such driver, must be shell or thrift")
        return driver_cls()

