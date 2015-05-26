#!/usr/bin/env python
import time
import datetime
import re

class Time(object):
    
    time_fmt='%Y-%m-%d %X'
    
    @staticmethod
    def timestamp():
        return time.time()
    
    @staticmethod
    def date_fmt(sep='-'):
        return sep.join(['%Y','%m','%d'])
    
    @staticmethod
    def now():
        return time.strftime(Time.time_fmt,time.localtime(time.time()))
    
    @staticmethod
    def dt_now():
        return datetime.datetime.now()   
 
    @staticmethod
    def today(sep='-'):
        fmt=Time.date_fmt(sep)
        return time.strftime(fmt,time.localtime(time.time()))
    
    @staticmethod
    def yesterday(sep='-'):
        fmt=Time.date_fmt(sep)
        return time.strftime(fmt,time.localtime(time.time()-24*60*60))
    
    @staticmethod
    def tomorrow(sep='-'):
        fmt=Time.date_fmt(sep)
        return time.strftime(fmt,time.localtime(time.time()+24*60*60))
        
    @staticmethod
    def is_date(date):
        try:
            date=str(date)
        except Exception:
            return False
        m=re.compile(r'^(?:\d{4})([^\d]+)?(?:\d{2})([^\d]+)?(?:\d{2})$').match(date)
        if m:
            if m.group(1)==m.group(2):
                return True
        return False
    
    @staticmethod
    def is_month(month):
        try:
            month=int(month)
        except Exception:
            return False
        if month in range(1,13):
            return True
        return False
    
    @staticmethod
    def is_year(year):
        try:
            year=int(year)
        except Exception:
            return False
        try:
            year=str(year)
        except Exception:
            return False
        if re.search(r'^[1-9]\d{3}$',year):
            return True
        return False
    
    @staticmethod
    def date_format(date,sep='-'):
        if not Time.is_date(date):
            return Time.yesterday(sep)
        m=re.compile(r'^(\d{4})([^\d]+)?(\d{2})([^\d]+)?(\d{2})$').match(str(date))
        if m:
            return sep.join(m.group(1,3,5))
        else:
            return Time.yesterday(sep)
        
    @staticmethod
    def date_sep(date):
        sep=''
        m=re.compile(r'^(?:\d{4})([^\d]+)?(?:\d{2})([^\d]+)?(?:\d{2})$').match(str(date))
        if m:
            sep1,sep2=m.group(1) or sep,m.group(2) or sep
            assert sep1==sep2,"Date '%s''s seperator is not the same." % date
            return sep1
        return sep
        
    @staticmethod
    def _date_action(date,action,itv=1):
        date=str(date)
        if Time.is_date(date):
            sep=Time.date_sep(date)
            fmt=Time.date_fmt(sep)
        else:
            fmt=Time.time_fmt
        if action=='+':
            return time.strftime(fmt,time.localtime(time.mktime(time.strptime(date,fmt))+itv*24*60*60))
        elif action=='-':
            return time.strftime(fmt,time.localtime(time.mktime(time.strptime(date,fmt))-itv*24*60*60))
        else:
            return date
        
    _time_action=_date_action
    
    @staticmethod
    def date_add(date,itv=1):
        return Time._date_action(date,'+',itv)
    
    @staticmethod
    def date_sub(date,itv=1):
        return Time._date_action(date,'-',itv)
    
    time_add=date_add
    time_sub=date_sub
    
    @staticmethod
    def last_week(tm=None):
        tm=tm or Time.today()
        return Time.date_sub(tm,itv=7)
        
    @staticmethod
    def last_month(tm=None,itv=30):
        tm=tm or Time.today()
        return Time.date_sub(tm,itv=itv)
    
    @staticmethod
    def last_year(tm=None,itv=365):
        tm=tm or Time.today()
        return Time.date_sub(tm,itv=itv)
    
    @staticmethod
    def last_hour():
        return time.strftime('%H',time.localtime(time.time()-60*60))
    
    @staticmethod
    def is_leap_year(year=None):
        year=year or Time.year()
        if not Time.is_year(year):
            return False
        year=int(year)
        if (year%4==0 and year%100!=0) or year%400==0:
            return True
        return False
    
    @staticmethod
    def is_hour(hour):
        try:
            hour=int(hour)
        except Exception:
            return False
        if hour>=0 and hour<=23:
            return True
        return False
    
    @staticmethod
    def hour_format(hour,has_zero=True):
        m=re.match('^(\d{1,2})$',str(hour))
        if m:
            h=m.group(1)
            if int(h)<10:
                if has_zero:
                    return '0%s' % h
            return h
        else:
            return Time.last_hour()
    
    @staticmethod
    def _time(tm,fmt):
        tm=str(tm)
        if Time.is_date(tm):
            sep=Time.date_sep(tm)
            tm_fmt=Time.date_fmt(sep)
        else:
            tm_fmt=Time.time_fmt
        sth=time.strftime(fmt,time.localtime(time.mktime(time.strptime(tm,tm_fmt))))
        if fmt=='%Y':
            return sth
        elif fmt=='%m' or fmt=='%d':
            return int(sth)
        elif fmt=='%W':
            return int(sth)+1
        elif fmt=='%w':
            if sth=='0':
                sth=7
            return sth
        elif fmt=='%H':
            return sth
        else:
            return sth
        
    @staticmethod
    def date(tm=None,sep='-'):
        tm=tm or Time.today()
        fmt=Time.date_fmt(sep)
        return Time._time(tm,fmt=fmt)
    
    @staticmethod
    def year(tm=None):
        tm=tm or Time.today()
        return Time._time(tm,fmt='%Y')
    
    @staticmethod
    def month(tm=None):
        tm=tm or Time.today()
        return Time._time(tm,fmt='%m')
    
    @staticmethod
    def day(tm=None):
        tm=tm or Time.today()
        return Time._time(tm,fmt='%d')
    
    @staticmethod
    def week(tm=None):
        tm=tm or Time.today()
        return Time._time(tm,fmt='%w')
    
    @staticmethod
    def hour(tm=None):
        tm=tm or Time.now()
        return Time._time(tm,fmt='%H')
    
    @staticmethod
    def minute(tm=None):
        tm=tm or Time.now()
        return Time._time(tm,fmt='%M')
    
    @staticmethod
    def second(tm=None):
        tm=tm or Time.now()
        return Time._time(tm,fmt='%S')
    
    @staticmethod
    def year_week(tm=None):
        tm=tm or Time.today()
        return Time._time(tm,fmt='%W')
        
    @staticmethod
    def year_month(tm=None,sep=''):
        tm=tm or Time.today()
        fmt=sep.join(['%Y','%m'])
        return Time._time(tm,fmt=fmt)
    
    time_year=date_year=year
    time_month=date_month=month
    time_day=date_day=day
    time_hour=date_hour=hour
    time_week=date_week=week
    time_year_month=date_year_month=year_month
    time_year_week=date_year_week=year_week
    
    @staticmethod
    def str2time(tm):
        try:
            tm=str(tm)
            if Time.is_date(tm):
                sep=Time.date_sep(tm)
                fmt=Time.date_fmt(sep=sep)
            else:
                fmt=Time.time_fmt
            return time.mktime(time.strptime(tm,fmt))
        except:
            return 0
        
    @staticmethod
    def nginx_time(tm,fmt='%d/%b/%Y:%H:%M:%S'):
        return str(datetime.datetime.strptime(tm,fmt))
        
    @staticmethod
    def cst_time(tm,fmt='%a %b %d %H:%M:%S CST %Y'):
        return str(datetime.datetime.strptime(tm,fmt))
    
    @staticmethod
    def time2str(time_stamp):
        return time.strftime(Time.time_fmt,time.localtime(float(time_stamp)))
        
    @staticmethod
    def date_range(start=None,end=None,step=1,sep='-'):
        start=int(Time.date_format(start or Time.yesterday(),''))
        end=int(Time.date_format(end or start,''))
        if step<0 and start>end:
            dse=lambda d,s,e:d<=s and d>=e
            date_action=getattr(Time,'date_sub')
        else:
            dse=lambda d,s,e:d>=s and d<=e
            date_action=getattr(Time,'date_add')
        date=start
        while dse(date,start,end):
            yield Time.date_format(date,sep)
            date=int(date_action(date,abs(step)))
            
    @staticmethod
    def hour_range(start=0,end=23,step=1,has_zero=True):
        for hour in range(int(start),int(end)+1,step):
            yield Time.hour_format(hour,has_zero)
            
    @staticmethod
    def year_first_date(tm=None,sep='-'):
        year=str(Time.year(tm))
        return sep.join([year,'01','01'])
    
    @staticmethod
    def year_last_date(tm=None,sep='-'):
        year=str(Time.year(tm))
        return sep.join([year,'12','31'])
    
    @staticmethod
    def month_first_date(tm=None,sep='-'):
        tm=tm or Time.today()
        if Time.is_month(tm):
            year=str(Time.year())
            month=tm
        elif Time.is_year_month(tm):
            year,month=Time.year_month_parts(tm)
            year=str(year)
        else:
            year=str(Time.year(tm))
            month=Time.month(tm)
        month='0%s' % month if month<10 else str(month)
        return sep.join([year,month,'01'])
    
    @staticmethod
    def month_last_date(tm=None,sep='-'):
        tm=tm or Time.today()
        if Time.is_month(tm):
            year=str(Time.year())
            month=tm
        elif Time.is_year_month(tm):
            year,month=Time.year_month_parts(tm)
            year=str(year)
        else:
            year=str(Time.year(tm))
            month=Time.month(tm)
        next_month=int(month)+1
        if next_month==13:
            next_month='01'
            year=str(int(year)+1)
        elif next_month<10:
            next_month='0%s' % (next_month)
        else:
            next_month=str(next_month)
        next_month_first_date=sep.join([year,next_month,'01'])
        return Time.date_sub(next_month_first_date,1)
    
    @staticmethod
    def month_days(tm=None):
        first_date=Time.month_first_date(tm,'')
        last_date=Time.month_last_date(tm,'')
        return int(last_date)-int(first_date)+1
    
    @staticmethod
    def month_dates(tm=None,sep='-'):
        first_date=Time.month_first_date(tm,'')
        last_date=Time.month_last_date(tm,'')
        return list(Time.date_range(first_date,last_date,sep=sep))
    
    @staticmethod
    def year_days(tm=None):
        year=Time.year(tm)
        if Time.is_leap_year(year):
            return 366
        else:
            return 365
        
    @staticmethod
    def year_dates(tm=None,sep='-'):
        first_date=Time.year_first_date(tm,'')
        last_date=Time.year_last_date(tm,'')
        return list(Time.date_range(first_date,last_date,sep=sep))
    
    @staticmethod
    def time2date(tm,sep='-'):
        fmt=Time.date_fmt(sep)
        return Time._time(tm,fmt)
    
    @staticmethod
    def date_diff(start,end,mode='D'):
        modes=('D','H','M','S')
        assert mode in modes,"Mode must be one of %s" % str(modes)
        start_ts=Time.str2time(start)
        end_ts=Time.str2time(end)
        diff=end_ts-start_ts
        if mode=='D':
            return diff/24/60/60
        elif mode=='H':
            return diff/24/60
        elif mode=='M':
            return diff/24
        elif mode=='S':
            return diff
        
    time_diff=date_diff
    
    @staticmethod
    def is_year_month(ym):
        try:
            ym=str(ym)
        except:
            return False
        m=re.match(r'^\d{4}([^\d]+)?\d{2}$',ym)
        if m:
            return True
        return False
    
    is_ym=is_year_month
    
    @staticmethod
    def year_month_sep(ym):
        ym=str(ym)
        sep=''
        m=re.match(r'^\d{4}([^\d]+)?\d{2}$',ym)
        if m:
            return m.group(1) or sep
        return sep
    
    @staticmethod
    def year_month_parts(ym):
        ym=str(ym)
        m=re.match(r'^(\d{4})([^\d]+)?(\d{2})$',ym)
        if m:
            return int(m.group(1)),int(m.group(3))
        return ym
    
    ym_sep=year_month_sep
    
    @staticmethod
    def year_month_add(ym=None,itv=1):
        ym=str(ym or Time.year_month())
        m=re.match(r'^(\d{4})([^\d]+)?(\d{2})$',ym)
        if m:
            year,sep,month=int(m.group(1)),m.group(2) or '',int(m.group(3))
            while itv>0:
                if (month+1)>12:
                    year=year+1
                    month=1
                else:
                    month+=1
                itv-=1
            month='0%s' % month if month<10 else str(month)
            return sep.join([str(year),month])
        return ym
    
    @staticmethod
    def year_month_sub(ym=None,itv=1):
        ym=str(ym or Time.year_month())
        m=re.match(r'^(\d{4})([^\d]+)?(\d{2})$',ym)
        if m:
            year,sep,month=int(m.group(1)),m.group(2) or '',int(m.group(3))
            while itv>0:
                if (month-1)==0:
                    year=year-1
                    month=12
                else:
                    month-=1
                itv-=1
            month='0%s' % month if month<10 else str(month)
            return sep.join([str(year),month])
        return ym
    
    ym_add=year_month_add
    ym_sub=year_month_sub
    
    @staticmethod
    def txtime_add(tx_time,itv=-1):
        tx_time,itv=str(tx_time),int(itv)
        if len(tx_time)==4:
            return str(int(tx_time)+itv)
        elif len(tx_time)==6:
            abs_itv=abs(itv)
            year,month=int(tx_time[:4]),int(tx_time[4:])
            while abs_itv>0:
                if itv>0:
                    if (month+1)>12:
                        year=year+1
                        month=1
                    else:
                        month+=1
                else:
                    if (month-1)==0:
                        year=year-1
                        month=12
                    else:
                        month-=1
                abs_itv-=1
            month=month<10 and '0'+str(month) or str(month)
            return str(year)+month
        elif len(tx_time)==8:
            fmt,num='%Y%m%d',24*60*60
        elif len(tx_time)==10:
            fmt,num='%Y%m%d%H',60*60
        elif len(tx_time)==12:
            fmt,num='%Y%m%d%H%M',60
        elif len(tx_time)==14:
            fmt,num='%Y%m%d%H%M%S',1
        return time.strftime(fmt,time.localtime(time.mktime(time.strptime(tx_time,fmt))+itv*num))    
    
    @staticmethod
    def txtime_range(start_txtime,stop_txtime=None,step=1):
        start_txtime=int(start_txtime)
        stop_txtime=int(stop_txtime or start_txtime)
        if start_txtime>stop_txtime:
            step=step>0 and 0-step or step
            tx_time=start_txtime
            while tx_time<=start_txtime and tx_time>=stop_txtime:
                yield str(tx_time)
                tx_time=int(Time.txtime_add(tx_time,step))
        else:
            tx_time=start_txtime
            while tx_time>=start_txtime and tx_time<=stop_txtime:
                yield str(tx_time)
                tx_time=int(Time.txtime_add(tx_time,step))
    
    @staticmethod
    def txtime_dict(tx_time):
        tx_time=str(tx_time)
        if not (re.match(r'^\d{4,14}$',tx_time) and len(tx_time) in range(4,15,2)):
            raise Exception("tx_time's length must be in [4,6,8,10,12,14]")
        time_parts=('year','month','day','hour','minute','second')
        txtime_dict=dict(tx_time=tx_time)
        for i,idx in enumerate(range(4,len(tx_time)+1,2)):
            name=time_parts[i]
            s=i if i==0 else i*2+2
            value=tx_time[s:idx]
            txtime_dict[name]=value
        if 'day' in txtime_dict:
            txtime_dict['mini_date']=''.join(txtime_dict[part] for part in ('year','month','day'))
            txtime_dict['date']=Time.date_format(txtime_dict['mini_date'],'-')
        return txtime_dict
    
tm=Time()

