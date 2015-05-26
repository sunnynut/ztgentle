#!/usr/bin/env python
#-*- coding:utf-8 -*-
import os,sys
import traceback
sys.path.append('/home/denchen.yang/lib/py')
from Time import Time

class Tracer(object):
    
    def __init__(self):
        pass
    
    def _trace(self):
        return traceback.extract_stack()
        
    def _deep(self,trace):
        deep=len(trace)-1
        if deep>=3:
            deep-=3
        return deep
        
    def get_file(self):
        trace=traceback.extract_stack()
        deep=self._deep(trace)
        return trace[deep][0]
        
    def get_line(self):
        trace=traceback.extract_stack()
        deep=self._deep(trace)
        return trace[deep][1]
        
    def get_module(self):
        trace=traceback.extract_stack()
        deep=self._deep(trace)
        return trace[deep][2]
    
    def get_trace(self,fmt='to_string',sep=' '):
        trace=traceback.extract_stack()
        deep=self._deep(trace)
        file=trace[deep][0]
        line=trace[deep][1]
        module=trace[deep][2]
        container=[file,line,module]
        if fmt=='to_string':
            return self.to_string(container,sep=sep)
        elif fmt=='to_dict':
            return self.to_dict(container)
        return container
    
    def to_string(self,container,sep=' '):
        return sep.join([str(c) for c in container])
        
    def to_dict(self,container):
        return {'file':container[0],'line':container[1],'module':container[2]}

class Logger(object):
    def __init__(self,level=None,formatter=None,handler=None,**kwargs):
        self.tracer=Tracer()
        self.time=Time()
        if formatter is None:
            formatter='[%(time)s] [%(level)s] [%(file)s %(line)d %(module)s] %(msg)s'+"\n"
        self.formatter=formatter
        if handler is None:
            handler=sys.stdout
        self.handler=handler
        self.levels=['INFO','WARNNING','ERROR','DEBUG','CRITICAL']
        if level is None or level not in self.levels:
            level='INFO'
        self.level=level
        
    def get_formatter(self):
        return self.formatter
        
    def set_formatter(self,formatter):
        self.formatter=formatter
        
    def get_level(self,level):
        return self.level
    
    def set_level(self,level):
        self.level=level
        
    def get_handler(self):
        self.handler
    
    def set_handler(self,handler):
        self.handler=handler
    
    def var_dict(self,msg,**kwargs):
        time=self.time.now()
        tracer=self.tracer.get_trace(fmt='to_dict')
        if not kwargs.has_key('formatter'):
            kwargs['formatter']=self.formatter
        self.set_formatter(kwargs['formatter'])
        if not kwargs.has_key('level'):
            kwargs['level']=self.level
        self.set_level(kwargs['level'])
        if not kwargs.has_key('handler'):
            kwargs['handler']=self.handler
        self.set_handler(kwargs['handler'])
        return {
            'time':time,
            'level':self.level,
            'file':tracer['file'],
            'line':tracer['line'],
            'module':tracer['module'],
            'msg':msg,
        }
        
    def warnning(self,msg,**kwargs):
        var_dict=self.var_dict(msg,level='WARNNING',**kwargs)
        self.handler.write(self.formatter % var_dict)
        self.handler.flush()
    
    def info(self,msg,**kwargs):
        var_dict=self.var_dict(msg,level='INFO',**kwargs)
        self.handler.write(self.formatter % var_dict)
        self.handler.flush()
    
    def error(self,msg,**kwargs):
        var_dict=self.var_dict(msg,level='ERROR',**kwargs)
        self.handler.write(self.formatter % var_dict)
        self.handler.flush()
    
    def debug(self,msg,**kwargs):
        var_dict=self.var_dict(msg,level='DEBUG',**kwargs)
        self.handler.write(self.formatter % var_dict)
        self.handler.flush()
        
    def critical(self,msg,**kwargs):
        var_dict=self.var_dict(msg,level='CRITICAL',**kwargs)
        self.handler.write(self.formatter % var_dict)
        self.handler.flush()
        
logger=Logger()

def main():
    logger.info('this is a test info!')
    logger.error('this is a test error!',formatter='[%(time)s] [%(level)s] %(msg)s'+"\n")
    #logger.warnning('this is a test warn!',handler=open('test.log','w'))
    
if __name__=='__main__':
    main()
    