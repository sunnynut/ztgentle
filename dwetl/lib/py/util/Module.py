#!/usr/bin/env python
#-*- coding:utf-8 -*-
try:
    import cPickle as pickle
except ImportError:
    import pickle
try:
    import cProfile as profile
except ImportError:
    import profile
try:
    import cStringIO as StringIO
except ImportError:
    import StringIO
    
try:
    import sqlite3 as sqlite
except ImportError:
    try:
        from pysqlite2 import dbapi2 as sqlite
    except ImportError:
        try:
            import sqlite
        except ImportError:
            sqlite=None
            pass
        
try:
    import psycopg2 as postgre
except ImportError:
    try:
        import psycopg as postgre
    except ImportError:
        try:
            import pgdb as postgre
        except ImportError:
            postgre=None
            pass
        
try:
    import xlrd
except ImportError:
    xlrd=None

try:
    import xlwt
except ImportError:
    xlwt=None

class Module(object):
    
    def __init__(self,object,has_private=False):
        self.object=object
        self.has_private=has_private
        
    def get_methods(self,to_func=False):
        methods=[method for method in dir(self.object) if callable(getattr(self.object,method)) and self.has_private or (not method.startswith('__'))]
        if to_func:
            methods=[getattr(self.object,method) for method in methods]
        return methods
        
    def func_help(self,space=10,collapse=True):
        methods=self.get_methods()
        process_func=collapse and (lambda s:' '.join(s.split())) or (lambda s:s)
        print '\n'.join(["%s %s" % (method.ljust(space),process_func(str(getattr(self.object,method).__doc__))) for method in methods])
        