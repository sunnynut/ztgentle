#!/usr/bin/env python
#-*- coding:utf-8 -*-
import os,sys,re
import subprocess
import commands
import socket
import time


class ExecuteFailed(Exception):
    pass

class TimeoutError(ExecuteFailed):
    pass

def timestamp_to_time(timestamp):
    return time.strftime('%Y-%m-%d %X',time.localtime(float(timestamp)))

class Shell(object):
    
    def __init__(self,cmd=None,timeout=None):
        self._cmd=(cmd or '').strip()
        self._timeout=int(timeout or 0)
        self._record=dict(cmd=self._cmd,start_time=None,end_time=None,output=None,error=None,pid=None,state=None)
        self._proc=None
        self._localhost=None
        
    def set_cmd(self,cmd):
        self._cmd=cmd.strip()
        return self
    
    def set_timeout(self,timeout):
        self._timeout=int(timeout or 0)
        return self
    
    @property
    def localhost(self):
        if self._localhost is None:
            self._localhost=get_localhost()
        return self._localhost
    
    def execute(self,cmd):
        self._cmd=cmd.strip()
        return self
    
    def run(self,cmd,fetch=False,timeout=None):
        self.set_cmd(cmd)
        self.set_timeout(timeout)
        lines=self.outs()
        if fetch:
            return lines
        for line in lines:
            print line
            
    def __getattr__(self,name):
        if name not in self.__dict__:
            value=lambda cmd='',**kwargs:self.run('%s %s' % (name,cmd),**kwargs)
            setattr(self,name,value)
        return getattr(name)
    
    def call(self):
        try:
            self._proc=subprocess.Popen(self._cmd,shell=True,stdout=subprocess.PIPE,stderr=subprocess.PIPE)
            self._record['cmd']=self._cmd
            start=time.time()
            self._record['start_time']=timestamp_to_time(start)
            self._record['output'],self._record['error']=self._proc.communicate()
            end=time.time()
            self._record['end_time']=timestamp_to_time(end)
            self._record['elapsed']=end-start
            self._record['pid']=self._proc.pid
            self._record['exit_code']=self._proc.returncode
            if self._record['exit_code']!=0:
                self._record['state']=1
            else:
                self._record['state']=0
        except OSError as error:
            error=str(error)
            self._record['error']=error
            print >>sys.stderr.write(error)
            sys.exit(1)
        return self._record
    
    @property
    def status(self):
        return self._record
    
    def show(self,sep=': '):
        for key,value in sorted(self._record.items()):
            print '%s%s%s' % (key,sep,value)
            
    def kill(self):
        if self._proc is not None:
            try:
                self._proc.terminate()
            except:
                self._proc.kill()
                
    def __iter__(self):
        self._proc=subprocess.Popen(self._cmd,shell=True,stdout=subprocess.PIPE,stderr=subprocess.STDOUT)
        start=time.time()
        while True:
            line=self._proc.stdout.readline().rstrip('\n')
            if self._proc.poll() is not None:
                exit_code=self._proc.returncode
                if exit_code!=0:
                    raise ExecuteFailed('Execute commond error code is %s.' % (exit_code))
                break
            if self._timeout and (time.time()-start)>self._timeout:
                self.kill()
                raise TimeoutError(self._cmd,self._timeout)
            else:
                if line!='':
                    yield line
    outs=__iter__
    
sh=shell=Shell()

class Launcher(object):
    
    def __init__(self,py,args=None,bg=False):
        self.py=py
        self.args=self._get_args(args)
        self.bg=bg
        
    def _get_args(self,args):
        if args is None:
            args=''
        elif isinstance(args,(tuple,list,set)):
            args=' '.join(str(arg) for arg in args)
        elif isinstance(args,basestring):
            args=args
        else:
            args=''
        return args
    
    @property
    def py_path(self):
        return sys.executable
    
    @property
    def cmd(self):
        cmd="%s %s %s " % (self.py_path,self.py,self.args)
        if self.bg:
            cmd+='&'
        return cmd
    
    def system(self):
        return os.system(self.cmd)
        
    def popen(self):
        output=os.popen(self.cmd)
        return output.read()
    
    def command(self):
        return commands.getstatusoutput(self.cmd)
    
    def spawn(self,wait=False):
        if wait:
            os.spawnv(os.P_WAIT,self.py_path,('python',self.py,self.args))
        else:
            os.spawnl(os.P_NOWAIT,self.py_path,'python',self.py,self.args)
            
    def start(self):
        os.startfile(' '.join([self.py,self.args]))
        
    def execute(self,globals={},locals={}):
        sys.argv=enumerate(self.args.split())
        execfile(self.py,globals=globals,locals=locals)
        
    def fork(self):
        assert hasattr(os,'fork'),'No fork method in os.'
        if os.fork()==0:
            os.execvp(self.py_path,[self.py]+self.args.split())
    
    def call(self):
        shell=Shell(self.cmd)
        shell.call()
        return shell.status
    
def get_localhost():
    return socket.gethostbyname(socket.gethostname())

def __expand_part(part):
    parts=[]
    if part.find(',')>-1:
        for p in map(__expand_part,part.split(',')):
            parts.extend(p)
    elif part.find('-')>-1:
        l,r=part.split('-')
        padding='%'+'0.%d' % len(l)+'d'
        for i in range(int(l),int(r)+1):
            parts.append(padding % i)
    else:
        parts.append(part)
    return parts

def __expand_parts(parts):
    return [__expand_part(part) for part in parts]

def expand_host(host):
    hosts=[]
    parts=__expand_parts(host.split('.'))
    for p0 in parts[0]:
        for p1 in parts[1]:
            for p2 in parts[2]:
                for p3 in parts[3]:
                    host='.'.join([p0,p1,p2,p3])
                    hosts.append(host)
    return hosts

class CMD(object):
    
    def __init__(self):
        self._localhost=None
        self.close()
        
    @property
    def localhost(self):
        if self._localhost is None:
            self._localhost=get_localhost()
        return self._localhost
    
    def close(self):
        self._cmds=[]
        self._is_bg=False
        return self
    
    def execute(self,cmd):
        cmd=cmd.strip()
        self._cmds.append(cmd)
        return self
    
    add_cmd=execute
    
    def _get_cmds(self):
        return ' && '.join(self._cmds)
    
    def _bg_cmd(self,cmd):
        if self._is_bg:
            cmd+=' &'
        return cmd
    
    def get_cmd(self):
        cmd=self._get_cmds()
        cmd=self._bg_cmd(cmd)
        return cmd
    
    def is_bg(self,is_bg):
        self._is_bg=is_bg
        return self
    
    def _fetch_one(self,cmd):
        print cmd
        for line in shell.execute(cmd):
            yield line
            
    def fetch(self):
        cmd=self.get_cmd()
        try:
            for line in self._fetch_one(cmd):
                yield line
        finally:
            self.close()
        
    def run(self):
        for line in self.fetch():
            print line
            
    __iter__=fetch
    
class SSH(CMD):
    
    def __init__(self):
        super(SSH,self).__init__()
        self.close()
    
    @property
    def hosts(self):
        return self._hosts
        
    def execute(self,cmd):
        cmd=cmd.strip().replace("'","\'")
        self._cmds.append(cmd)
        return self
        
    def has_krb(self,has_krb):
        self._has_krb=has_krb
        return self
    
    def close(self):
        self._cmds=[]
        self._hosts=[]
        self._has_krb=True
        self._is_bg=False
        self._user=None
        
    def connect(self,host=None):
        if host is None:
            host=self.localhost
        hosts=expand_host(host)
        self._hosts.extend(hosts)
        return self
    
    add_host=connect
    
    def _add_krb(self):
        cmd='kinit -k -t /etc/krb5.keytab; ' if self._has_krb else ''
        return cmd
    
    def set_user(self,user):
        self._user=user
        return self
    
    def _get_full_host(self,host):
        if self._user:
            host='{user}@{host}'.format(user=self._user,host=host)
        return host
    
    def get_host_cmd(self,host):
        cmd=self._add_krb()
        cmd+='ssh %s ' % (host)
        cmd+="'%s' " % (self._get_cmds())
        cmd=self._bg_cmd(cmd)
        return cmd
    
    def _fetch_host(self,host):
        host=self._get_full_host(host)
        cmd=self.get_host_cmd(host)
        return super(SSH,self)._fetch_one(cmd)
    
    def fetch(self):
        if not self._hosts:
            self._hosts=[self.localhost]
        try:
            for host in self._hosts:
                for line in self._fetch_host(host):
                    yield line
        finally:
            self.close()
        
    __iter__=fetch
    
ssh=SSH()

def remote_reader(log,host=None,line_func=lambda line:line.strip()):
    cat='zcat' if log.endswith('.gz') else 'cat'
    lines=ssh.connect(host).execute("%s %s" % (cat,log))
    for line in lines:
        line=line_func(line)
        if line is None:
            continue
        yield line
        
class SCP(SSH):
    
    def __init__(self):
        super(SCP,self).__init__()
        
    def _get_push_cmd(self,host,from_path,to_path):
        cmd=self._add_krb()
        cmd+='scp -o "StrictHostKeyChecking no" -r %s %s:%s ' % (from_path,host,to_path)
        cmd=self._bg_cmd(cmd)
        return cmd
    
    def _get_pull_cmd(self,host,from_path,to_path):
        cmd=self._add_krb()
        cmd+='scp -o "StrictHostKeyChecking no" -r %s:%s %s ' % (host,from_path,to_path)
        cmd=self._bg_cmd(cmd)
        return cmd
    
    def _push_host(self,host,from_path,to_path):
        host=self._get_full_host(host)
        cmd=self._get_push_cmd(host,from_path,to_path)
        return super(SCP,self)._fetch_one(cmd)
        
    def push(self,from_path,to_path=None):
        to_path=to_path if to_path is not None else from_path
        try:
            for host in self._hosts:
                for line in self._push_host(host,from_path,to_path):
                    print line
        finally:
            self.close()
            
    def _pull_host(self,host,from_path,to_path):
        host=self._get_full_host(host)
        cmd=self._get_pull_cmd(host,from_path,to_path)
        return super(SCP,self)._fetch_one(cmd)
    
    def pull(self,from_path,to_path=None):
        to_path=to_path if to_path is not None else from_path
        try:
            for host in self._hosts:
                for line in self._pull_host(host,from_path,to_path):
                    print line
        finally:
            self.close()
            
scp=SCP()


