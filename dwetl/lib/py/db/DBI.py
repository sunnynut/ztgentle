#!/usr/bin/env python
#-*- coding:utf-8 -*-
import os,sys,re
import decimal
import datetime
import MySQLdb
import psycopg2
import psycopg2.extras
sys.path.append('/home/q/dwetl/lib/py/util')
from Logger import logger
sys.path.append('/home/q/dwetl/lib/py/db')
from DBC import DBC,dbc

def show_dbcs():
    for k,v in dbc.items():
        print '%s=%s' % (k,v)
        
class BaseDBI(object):
    
    def __init__(self,charset='utf8'):
        self.charset=charset
        self._connection=None
        self._cursor=None
        
    def _set_charset(self):
        self.do("SET NAMES %s" % self.charset)
        
    def connect(self):
        raise Exception('Not implemented')
    
    @property
    def connected(self):
        if self._connection is None:
            return False
        return True
    
    @property
    def cursor(self):
        if not self.connected:
            self.connect()
        if self._cursor is not None:
            return self._cursor
        self._cursor=_get_cursor(self._connection)
        return self._cursor
    
    def execute(self,sql):
        return _execute_sql(self.cursor,sql)
    
    def do(self,sql):
        effected_rows=self.execute(sql)
        _auto_commit(self._connection)
        return effected_rows
    
    def fields(self):
        return _get_fields(self.cursor)
    
    def row(self):
        return _get_row(self.cursor)
        
    def rows(self,has_fields=False):
        if has_fields:
            yield self.fields()
        for row in _get_rows(self.cursor):
            yield row
            
    def records(self):
        return _get_rows(self.cursor,to_dict=True)
    
    results=rows
    
    def close_cursor(self):
        _close_cursor(self._cursor)
        self._cursor=None
        
    def close_connection(self):
        _close_connection(self._connection)
        self._connection=None
        
    def close(self):
        self.close_cursor()
        self.close_connection()
        
    def fetch(self,sql,has_fields=False,row_func=None,out_style='to_list',sep='\t'):
        self.execute(sql)
        if out_style=='to_dict':
            rows=self.records()
        else:
            rows=self.rows(has_fields)
        if row_func is None:
            if out_style=='to_string':
                row_func=lambda row:sep.join(str(field if field is not None else '') for field in row)
            else:
                row_func=lambda row:row
        for row in rows:
            row=row_func(row)
            if row is not None:
                yield row
                
    def _row_func(self,row,info=None):
        info=info or []
        info.append(row)
        return info
    
    def memorize(self,rows,row_func=None):
        info=None
        row_func=row_func or self._row_func
        for row in rows:
            info=row_func(row,info)
        return info
    
    def scan(self,rows,sep='\t'):
        return self.store(rows,sep=sep)
        
    def store(self,rows,sep='\t',out=sys.stdout):
        if isinstance(out,basestring):
            f=open(out,'w')
        for row in rows:
            f.write(sep.join(str(field) for field in row)+'\n')
        if isinstance(out,basestring):
            f.close()
            
    def add_conditions(self,conditions):
        if isinstance(conditions,(basestring,tuple,list,dict)):
            if isinstance(conditions,basestring):
                cdts=conditions
            elif isinstance(conditions,(tuple,list)):
                cdts=' AND '.join(conditions)
            else:
                def _set_kv(k,v):
                    v=py2db(v)
                    if v=='NULL':
                        return '{k} IS {v}'.format(k=k,v=v)
                    return '{k}={v}'.format(k=k,v=v)
                cdts=' AND '.join(map(lambda (k,v):_set_kv(k,v),conditions.iteritems()))
            return cdts
        return None

class MySQL(BaseDBI):

    def __init__(self,host='localhost',port=3306,user=None,passwd=None,db=None,charset='utf8'):
        self.host=host
        self.port=int(port)
        self.user=user
        self.passwd=passwd
        self.db=db
        BaseDBI.__init__(self,charset)
        
    def get_dbc(self):
        return dict(
            host=self.host,
            port=self.port,
            user=self.user,
            passwd=self.passwd,
            db=self.db,
            charset=self.charset,
        )
        
    def set_dbc(self,**dbc):
        self.host=dbc.get('host',self.host)
        self.port=int(dbc.get('port',self.port))
        self.user=dbc.get('user',self.user)
        self.passwd=dbc.get('passwd',self.passwd)
        self.db=dbc.get('db',self.db)
        self.charset=dbc.get('charset',self.charset)
        self._connection=None
        self._cursor=None
        
    def connect(self):
        self._connection=MySQLdb.connect(host=self.host,port=self.port,user=self.user,passwd=self.passwd,db=self.db)
        self._set_charset()
        
    def create(self,table,fields,is_update=False,options={'ENGINE':'InnoDB'},defaults={'CHARSET':'utf8'}):
        if self.has_table(table) and (not is_update):
            return
        sql="CREATE TABLE %s " % table
        if isinstance(fields,(tuple,list)):
            sql+='('+','.join(fields)+') '
        sql+=' '.join(map(lambda (k,v):'='.join([k,str(v)]),options.items()))
        sql+=' DEFAULT %s ' % ' '.join(map(lambda (k,v):'='.join([k,str(v)]),defaults.items()))
        return self.do(sql)
        
    def load(self,file,table,fields=None,
             priority='LOW_PRIORITY',local='LOCAL',cover='IGNORE',
             field_sep=r'\t',optionally=False,enclosed_char='',escaped_char='',
             line_sep=r'\n',started_char='',ignore=None,sets=None):
        sql="LOAD DATA %s %s INFILE '%s' %s INTO TABLE %s " % (priority,local,file,cover,table)
        sql+="FIELDS TERMINATED BY '%s' " % (field_sep)
        if optionally:
            sql+="OPTIONALLY "
        if enclosed_char:
            sql+="ENCLOSED BY '%s' " % enclosed_char
        if escaped_char:
            sql+="ESCAPED BY '%s' " % escaped_char
        sql+='LINES '
        if started_char:
            sql+="STARTING BY '%s' " % started_char
        sql+="TERMINATED BY '%s' " % line_sep
        if isinstance(ignore,int):
            sql+="IGNORE %s LINES " % ignore
        if isinstance(fields,(list,tuple)):
            sql+="(%s) " % ','.join(fields)
        if isinstance(sets,(list,tuple)):
            sql+="SET %s " % ','.join(sets)
        logger.info("Load file %s into table %s" % (file,table))
        return self.do(sql)
        
    def save(self,file,table,table_fields=None,sep=r'\t',is_drop=False,is_update=True,is_split=False,is_check=True,**kwargs):
        files=file if isinstance(file,(tuple,list)) else [file]
        options=kwargs.pop('options',{'ENGINE':'InnoDB'})
        defaults=kwargs.pop('defaults',{'CHARSET':'utf8'})
        if is_drop:
            self.delete(table,is_drop)
        if table_fields is not None:
            self.create(table,table_fields,options=options,defaults=defaults)
        where=kwargs.pop('where',None)
        where=self.add_conditions(where)
        if (not is_drop) and is_update:
            self.delete(table,conditions=where)
        if (not is_drop) and is_check:
            sql="SELECT COUNT(1) FROM %s WHERE 1=1 " % table
            if where:
                sql+='AND %s ' % where
            rows=[row for row in self.fetch(sql)]
            count=int(rows[0][0])
            if count>0:
                return
        part_size=kwargs.pop('part_size',64)
        if is_split:
            from wwpy.file.Spliter import SizeSpliter
            part_files=[]
            for file in files:
                s=SizeSpliter(file)
                s.set_part_size(part_size)
                parts=s.split()
                part_files.extend(parts)
            files=part_files
        from wwpy.file.File import File
        for file in files:
            f=File(file)
            if f.is_compressed:
                dest_file=f.decompress()
                self.load(dest_file,table,field_sep=sep,**kwargs)
                f.set(dest_file)
                f.remove()
            else:
                self.load(file,table,field_sep=sep,**kwargs)
        if is_split:
            map(os.remove,files)
            
    def dump(self,sql,file=None,has_fields=False,sep='\t'):
        if file is None:
            file='dump_records_from_sql.txt'
        rows=self.fetch(sql,has_fields)
        self.store(rows,sep,out=file)
        
    def delete(self,table,is_drop=False,conditions=None,order=None,limit=None):
        if is_drop:
            tables=table if isinstance(table,(list,tuple)) else [table]
            sql="DROP TABLE IF EXISTS %s " % ','.join(tables)
        else:
            sql="DELETE FROM %s WHERE 1=1 " % table
            if conditions is not None:
                sql+='AND %s ' % self.add_conditions(conditions)
                if limit is not None:
                    if order_by is not None:
                        if isinstance(order,(tuple,list)):
                            order=','.join(order)
                        sql+="ORDER BY %s " % order
                    sql+="LIMIT %s " % limit
        return self.do(sql)
        
    def insert(self,table,fields=None,values=None,select=None,sets=None,others=None):
        sql="INSERT INTO %s " % (table,)
        if isinstance(fields,(tuple,list)):
            sql+='('+','.join(fields)+') '
        if isinstance(values,(tuple,list)):
            if isinstance(values,tuple):
                values=[values]
            sql+="VALUES "+','.join("("+",".join(py2db(v) for v in value)+")" for value in values)+" "
        elif isinstance(select,basestring):
            sql+="%s " % select
        elif isinstance(sets,dict):
            sql+="SET %s " % ','.join('='.join([k,py2db(v)]) for k,v in sets.items())
        if isinstance(others,basestring):
            sql+="%s " % others
        return self.do(sql)
        
    def update(self,table,sets,conditions=None,order=None,limit=None):
        sql="UPDATE %s SET %s WHERE 1=1 " % (table,','.join('='.join([k,py2db(v)]) for k,v in sets.items()))
        conditions=self.add_conditions(conditions)
        if conditions:
            sql+='AND %s ' % conditions
        if limit is not None:
            if order is not None:
                if isinstance(order,(tuple,list,set)):
                    order=','.join(order)
                sql+="ORDER BY %s " % order
            sql+="LIMIT %s " % limit
        return self.do(sql)
        
    def table_fields(self,table,cols=None):
        sql="SHOW FULL FIELDS FROM %s " % table
        rows=self.fetch(sql)
        if cols is None or not isinstance(cols,(tuple,list)):
            cols=[0]
        if cols==[0]:
            return tuple(row[0] for row in rows)
        return tuple(tuple(map(lambda col:row[col],cols)) for row in rows)
        
    def has_db(self,db):
        db=db.lower()
        sql="SHOW DATABASES"
        dbs=map(lambda t:t[0].lower(),self.fetch(sql))
        if db in dbs:
            return True
        return False
        
    def has_table(self,table):
        table=table.lower()
        sql="SHOW TABLES"
        tables=map(lambda t:t[0].lower(),self.fetch(sql))
        if table in tables:
            return True
        return False
    
    def has_record(self,table,where=None):
        if not self.has_table(table):
            return False
        sql="SELECT COUNT(1) FROM %s WHERE 1=1 " % (table)
        where=self.add_conditions(where)
        if where:
            sql+='AND %s ' % where
        records=map(lambda t:t[0],self.fetch(sql))
        if int(records[0]):
            return True
        return False
    
    def batch(self,sql,once_num=1000000,has_fields=False):
        sql=sql.strip().strip(' ; ')
        n=-1
        while True:
            _sql=sql
            n+=1
            offset=n * once_num
            _sql+=" LIMIT %s,%s" % (offset,once_num)
            logger.info("Execute SQL: %s" % _sql)
            rows=list(self.fetch(_sql,has_fields))
            if not rows:
                break
            for row in rows:
                yield row
                
    def batch2(self,sql,once_num=1000000,has_fields=False):
        sql=sql.strip(' ; ')
        regex=re.compile(r'(select) .+?(from .+?) ?(where .+?)? ',re.I)
        m=regex.search(sql)
        if m:
            new_sql="%s COUNT(1) %s" % (m.group(1),m.group(2))
            if m.group(3):
                new_sql+=" %s" % (m.group(3))
            rows=list(self.fetch(new_sql))
            record_num=int(rows[0][0])
        else:
            record_num=once_num
        if record_num<=once_num:
            rows=self.fetch(sql,has_fields)
            for row in rows:
                yield row
        else:
            logger.info("SQL record number is %s" % record_num)
            num=int(record_num/once_num)
            for n in range(num+1):
                _sql=sql
                offset=n * once_num
                _sql+=" LIMIT %s,%s" % (offset,once_num)
                logger.info("Execute SQL: %s" % _sql)
                rows=self.fetch(_sql,has_fields)
                for row in rows:
                    yield row
class PostgreSQL(BaseDBI):

    def __init__(self,host='localhost',port=5432,user=None,passwd=None,db=None,charset='utf8'):
        self.host=host
        self.port=int(port)
        self.user=user
        self.passwd=passwd
        self.db=db
        self.charset=charset
    def get_dbc(self):
        return dict(
            host=self.host,
            port=self.port,
            user=self.user,
            passwd=self.passwd,
            db=self.db,
            charset=self.charset,
        )
    def set_dbc(self,**dbc):
        self.host=dbc.get('host',self.host)
        self.port=int(dbc.get('port',self.port))
        self.user=dbc.get('user',self.user)
        self.passwd=dbc.get('passwd',self.passwd)
        self.db=dbc.get('db',self.db)
        self.charset=dbc.get('charset',self.charset)
        self._connection=None
        self._cursor=None        
    def connect(self):
        self._connection=psycopg2.connect(host=self.host,port=self.port,user=self.user,password=self.passwd,database=self.db)
        self._connection.set_isolation_level(psycopg2.extensions.ISOLATION_LEVEL_AUTOCOMMIT)
        self._cursor=self._connection.cursor(cursor_factory=psycopg2.extras.DictCursor)
        #self._set_charset() 
    def execute_sql(self,sql):
        self._connection=psycopg2.connect(host=self.host,port=self.port,user=self.user,password=self.passwd,database=self.db)
        self._connection.set_isolation_level(psycopg2.extensions.ISOLATION_LEVEL_AUTOCOMMIT)
        self._cursor=self._connection.cursor(cursor_factory=psycopg2.extras.DictCursor)
        self._cursor.execute(sql)         
    def dump(self,sql,file=None,has_fields=False,sep='\t'):
        if file is None:
            file='dump_records_from_sql.txt'
        rows=self.fetch(sql,has_fields)
        self.store(rows,sep,out=file)
    def fetch(self,sql,has_fields=False,row_func=None,out_style='to_list',sep='\t'):
        self.execute_sql(sql)
        if out_style=='to_dict':
            rows=self.records()
        else:
            rows=self.rows(has_fields)
        if row_func is None:
            if out_style=='to_string':
                row_func=lambda row:sep.join(str(field if field is not None else '') for field in row)
            else:
                row_func=lambda row:row
        for row in rows:
            row=row_func(row)
            if row is not None:
                yield row    
            
        
class DBI(object):
    drivers={
        'mysql':MySQL,
        'postgre':PostgreSQL,
    }
    
    def __new__(cls,*args,**kwargs):
        driver=kwargs.pop('driver')
        _check_driver(driver)
        cls=cls.drivers.get(driver)
        if 'dbc' in kwargs:
            db=kwargs.pop('dbc')
            if db in dbc:
                return cls(**dbc[db])
            else:
                raise Exception('No such db %s in dbc' % db)
        return cls(*args,**kwargs)
            
    
def execute_sql(dbc,sql,driver='mysql',**kwargs):
    if isinstance(dbc,basestring):
        dbi=DBI(driver=driver,dbc=dbc) #eg: dbc='db_dm_cfg'
    elif isinstance(dbc,dict):
        dbi=DBI(driver=driver,**dbc) #eg: dbc=dict(host='10.10.67.17',port=3353,user='dataol',passwd='dataol-13',db='db_data_discover')
    if _is_query(sql):
        return dbi.fetch(sql,**kwargs)
    return dbi.do(sql)

def _check_driver(driver):
    driver=driver.lower()
    if driver not in ('mysql','sqlite','postgre'):
        raise Exception('No such driver %s' % driver)
    return driver
    
def _get_connection(driver,**dbc):
    if driver=='mysql':
        conn=MySQLdb.connect(**dbc)
    elif driver=='sqlite':
        conn=sqlite.connect(database=dbc['db'])
    elif driver=='postgre':
        conn=postgre.connect(**dbc)
    return conn

def _get_cursor(conn):
    if hasattr(conn,'cursor') and callable(conn.cursor):
        cursor=conn.cursor()
    elif callable(conn):
        cursor=conn()
    else:
        raise Exception('Could not find callable execute method from connection or cursor')
    return cursor

def _set_charset(driver,cursor,charset):
    if driver=='sqlite':
        cursor.execute('PRAGMA encoding="%s"' % charset)
    else:
        cursor.execute("SET NAMES %s" % charset)

def _auto_commit(conn):
    if hasattr(conn,'commit') and callable(conn.commit):
        conn.commit()
        
def _auto_rollback(conn):
    if conn and hasattr(conn,'rollback') and callable(conn.rollback):
        conn.rollback()
        
def _close_cursor(cursor):
    if cursor and hasattr(cursor,'close') and callable(cursor.close):
        cursor.close()
        
def _close_connection(conn):
    if conn and hasattr(conn,'close') and callable(conn.close):
        conn.close()
        
def _execute_sql(cursor,sql):
    return int(cursor.execute(sql))

def _is_query(sql):
    cmd=re.split(r'\s|\n',sql.strip())[0].upper()
    if cmd in ('SELECT','SHOW','DESC'):
        return True
    return False

def _get_fields(cursor):
    if hasattr(cursor,'description'):
        fields=tuple(map(lambda a:a[0],cursor.description))
    elif hasattr(cursor,'keys') and callable(cursor.keys):
        fields=tuple(cursor.keys())
    else:
        raise Exception('Could not determine field names from cursor: %r' % cursor)
    return fields

def _get_row(cursor):
    if hasattr(cursor,'fetchone') and callable(cursor.fetchone):
        return map(db2py,cursor.fetchone())
    else:
        raise Exception('Could not find fetchone method from cursor: %r' % cursor)
    
def _get_rows(cursor,to_dict=False):
    fields=_get_fields(cursor)
    if hasattr(cursor,'fetchmany') and callable(cursor.fetchmany):
        cursor.arraysize=10000
        while True:
            rows=cursor.fetchmany()
            if not rows:
                break
            for row in rows:
                row=tuple(map(db2py,row))
                if to_dict:
                    yield dict(zip(fields,row))
                else:
                    yield row
    elif hasattr(cursor,'fetchall') and callable(cursor.fetchall):
        for row in cursor.fetchall():
            row=tuple(map(db2py,row))
            if to_dict:
                yield dict(zip(fields,row))
            else:
                yield row
    else:
        raise Exception('Could not find fetchall method from cursor: %r' % cursor)
    
def db2py(data):
    """db table data type to python object data type"""
    if data in ('NULL',None):
        return None
    if isinstance(data,(long,int)):
        return int(data)
    if isinstance(data,float):
        return data
    if isinstance(data,decimal.Decimal):
	if data._isinteger():
            return int(data)
        return float(data)
    if isinstance(data,(basestring,datetime.datetime,datetime.date)):
        return str(data)
    return data

def py2db(data):
    """python object data type to db table data type"""
    if data is None:
        return 'NULL'
    if data in (True,False) or isinstance(data,(int,long)):
        return repr(int(data))
    if isinstance(data,(basestring,datetime.datetime,datetime.date)):
        return "'{obj}'".format(obj=str(data))
    if isinstance(data,(float,decimal.Decimal)):
        return repr(float(data))
    return repr(data)

def do_sql(sql,driver='mysql',charset='utf8',retries=3,to_dict=False,**dbc):
    conn,cursor=None,None
    try:
        driver=_check_driver(driver)
        conn=_get_connection(driver,**dbc)
        cursor=_get_cursor(conn)
        _set_charset(driver,cursor,charset)
        effected_rows=_execute_sql(cursor,sql)
        if _is_query(sql):
            return list(_get_rows(cursor,to_dict))
        else:
            _auto_commit(conn)
            return effected_rows
    except Exception as error:
        _auto_rollback(conn)
        if retries>0:
            return do_sql(sql,driver=driver,charset=charset,retries=retries-1,to_dict=to_dict,**dbc)
        else:
            raise error
    finally:
        _close_cursor(cursor)
        _close_connection(conn)
        
class DBConnector(object):
    
    def __init__(self,driver='mysql',charset='utf8',**dbc):
        self._driver=_check_driver(driver)
        self._charset=charset
        self._dbc=dbc
        self._connection,self._cursor=None,None
        
    def __enter__(self):
        try:
            self._connection=_get_connection(self._driver,**self._dbc)
            self._cursor=_get_cursor(self._connection)
            _set_charset(self._driver,self._cursor,self._charset)
        except Exception as error:
            raise error
        return self._connection,self._cursor
    
    def __exit__(self,type,value,tb):
        _close_cursor(self._cursor)
        _close_connection(self._connection)
        
class SafeDBI(object):
    
    def __init__(self,driver='mysql',charset='utf8',retries=3,**dbc):
        self._driver=_check_driver(driver)
        self._charset=charset
        self._retries=retries
        self._dbc=dbc
        self._sqls=[]
        self._results=dict()
        self._connection=None
        self._cursor=None
        
    def set_driver(self,driver):
        self._driver=driver
        return self
    
    def set_dbc(self,dbc):
        self._dbc=dbc
        return self
    
    def set_charset(self,charset):
        self._charset=charset
        return self
    
    def set_retries(self,retries):
        self._retries=retries
        return self
    
    def add_sql(self,sql,name='sql'):
        if name=='sql':
            name='{name}{idx}'.format(name=name,idx=len(self._sqls)+1)
        self._sqls.append((sql,name))
        return self
    
    def connect(self,retries=None):
        if retries is None:
            retries=self._retries
        try:
            driver=_check_driver(self._driver)
            self._connection=_get_connection(driver,**self._dbc)
            self._cursor=_get_cursor(self._connection)
            _set_charset(driver,self._cursor,self._charset)
        except Exception,error:
            self.close()
            if retries>0:
                self.connect(retries=retries-1)
            else:
                raise error
            
    def execute(self,sql,to_dict=True,retries=None):
        if retries is None:
            retries=self._retries
        try:
            effected_rows=_execute_sql(self._cursor,sql)
            if _is_query(sql):
                result=list(_get_rows(self._cursor,to_dict=to_dict))
            else:
                result=effected_rows
                _auto_commit(self._connection)
            return result
        except Exception,error:
            _auto_rollback(self._connection)
            if retries>0:
                self.close()
                self.connect()
                self.execute(sql,retries=retries-1)
            else:
                raise error
            
    def close(self):
        _close_cursor(self._cursor)
        _close_connection(self._connection)
        self._cursor=None
        self._connection=None
        
    def run(self):
        self.connect()
        for sql,name in self._sqls:
            result=self.execute(sql)
            self._results[name]=result
        self.close()
        
    def fetch(self,name=None):
        if name is None:
            return len(self._results)==1 and self._results.values()[0] or self._results
        return self._results.get(name)
    
    def get_sqls(self):
        return map(lambda s:s[0],self._sqls)
    

