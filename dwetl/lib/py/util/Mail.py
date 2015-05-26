#!/usr/bin/env python
#-*- coding:utf-8 -*-
import os
import re
import smtplib
from email.header import Header
from email.mime.text import MIMEText
from email.mime.image import MIMEImage
from email.mime.multipart import MIMEMultipart

_style="""
<style type="text/css">
p
  {
    font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
    color:#A7C942;
    font-size:16px;
  }
  
#table_style
  {
  font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse:collapse;
  }

#table_style td, #table_style th 
  {
  font-size:14px;
  text-align:center;
  border:1px solid #98bf21;
  padding:2px 3px 2px 3px;
  }

#table_style th 
  {
  font-size:16px;
  padding-top:4px;
  padding-bottom:4px;
  background-color:#A7C942;
  color:#ffffff;
  }

#table_style tr.alt td 
  {
  color:#000000;
  background-color:#EAF2D3;
  }
  .tail { 
		border: 1px solid #000;
		text-align:left;
		background-color: #F7F2E0; 
	        width: 1300px;
		}
	table caption { 
		padding: 0 0 5px 0; 
		font: 20px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif; 
        font-weight:bold;
		}
</style>
"""

_html="""
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns=http://www.w3.org/1999/xhtml>
<head><meta http-equiv=Content-Type content="text/html;charset={charset}">
<title>{title}</title>
{style}
</head>
<body>
{tables}
</body>
{footer}
</html>
"""

_footer="""
本邮件包含内部数据信息，请勿转发他人。系统自动发出，请勿直接回复。
查看更多相关数据请访问 http://cameltalk.corp.qunar.com/
"""

signs={
    '>':'&gt;',
    '<':'&lt;',
    '&':'&amp;',
    "'":'&apos;',
    '"':'&quot;',
}

def replace_signs(string):
    for sign in signs:
        string=string.replace(sign,signs[sign])
    return string

class HTML(object):
    
    def __init__(self):
        self._html=''
        self._title=''
        self._charset='utf-8'
        self._footer=_footer
        self._datasets=[]
        self._dataset_rows=[]
        self._images=[]
        
    def set_charset(self,charset):
        self._charset=charset
        return self
    
    def set_title(self,title):
        self._title=title
        return self
    
    def set_footer(self,footer):
        self._footer=footer
        return self
    
    def _fill_href(self,name,value):
        return '<a href="{value}">{name}</a>'.format(name=name,value=value)
    
    def add_list(self,rows,header='',footer='',**kwargs):
        if isinstance(rows,tuple):
            rows=[rows]
        self._datasets.append(('list',dict(rows=rows,header=header,footer=footer,**kwargs)))
        return self
    
    def add_mysql_sql(self,sql,dbc=None,fields=(),has_fields=True,header='',footer='',title=(),**kwargs):
        if fields:
            had_fields=False
        self._datasets.append(('mysql_sql',dict(sql=sql,dbc=dbc,fields=fields,has_fields=has_fields,header=header,footer=footer,title=title,**kwargs)))
        return self
    def add_postgre_sql(self,sql,dbc=None,fields=(),has_fields=True,header='',footer='',title=(),**kwargs):
        if fields:
            had_fields=False
        self._datasets.append(('postgre_sql',dict(sql=sql,dbc=dbc,fields=fields,has_fields=has_fields,header=header,footer=footer,title=title,**kwargs)))
        return self    
    def add_hive_sql(self,sql,fields=(),has_fields=True,header='',footer='',title=(),**kwargs):
        if fields:
            has_fields=False
        self._datasets.append(('hive_sql',dict(sql=sql,fields=fields,has_fields=has_fields,header=header,footer=footer,title=title,**kwargs)))
        return self
    
    def add_file(self,file,sep='\t',header='',footer='',**kwargs):
        self._datasets.append(('file',dict(file=file,sep=sep,header=header,footer=footer,**kwargs)))
        return self
    
    def add_dataset(self,dataset,**kwargs):
        if isinstance(dataset,(list,tuple)) or hasattr(dataset,'next'):
            self.add_list(dataset,**kwargs)
        elif isinstance(dataset,basestring):
            if os.path.isfile(dataset):
                self.add_file(dataset,**kwargs)
            elif 'dbc' in kwargs:
                if 'driver' in kwargs:
                    if kwargs['driver']=='postgre':
                        self.add_postgre_sql(dataset,**kwargs)
                    elif kwargs['driver']=='mysql':
                        self.add_mysql_sql(dataset,**kwargs)    
                else:
                    self.add_mysql_sql(dataset,**kwargs)
            else:
                self.add_hive_sql(dataset,**kwargs)
        return self
    
    def __get_dataset(self,dataset):
        dt,kw=dataset[0],dataset[1]
        data=[]
        if dt=='mysql_sql':
            import sys,os
            sys.path.append('/home/q/dwetl/lib/py/db')
            from DBI import DBI
            from DBI import execute_sql
            sql=kw['sql']
            dbc=kw['dbc']
            fields=kw['fields']
            has_fields=kw['has_fields']
            if fields:
                data.append(fields)
            rows=execute_sql(dbc,sql,has_fields=has_fields)
            for row in rows:
                data.append(row)
        if dt=='postgre_sql':
            import sys,os
            sys.path.append('/home/q/dwetl/lib/py/db')
            from DBI import DBI
            from DBI import execute_sql
            sql=kw['sql']
            dbc=kw['dbc']
            fields=kw['fields']
            has_fields=kw['has_fields']
            if fields:
                data.append(fields)
            rows=execute_sql(dbc,sql,driver='postgre',has_fields=has_fields)
            for row in rows:
                data.append(row)        
        elif dt=='hive_sql':
            import sys,os
            sys.path.append('/home/q/dwetl/lib/py/db')
            from Hive import Hive
            sql=kw['sql']
            fields=kw['fields']
            has_fields=kw['has_fields']
            hive=Hive()
            hive.set_has_header(has_fields).set_sql(sql)
            if fields:
                data.append(fields)
            for line in hive.fetch():
                data.append(line.split('\t'))
        elif dt=='list':
            data=kw['rows']
        elif dt=='file':
            from ydc.io.Source import Source
            src=kw['file']
            sep=kw['sep']
            s=Source(src)
            for line in s.read():
                row=line.strip().split(sep)
                data.append(row)
        self._dataset_rows.append(data)
        return data
    
    def __get_table_rows(self,dataset,idx):
        rows=self._dataset_rows[idx-1]
        table_rows=[]
        title=dataset[1].get('title')
        col_title=dataset[1].get('col_title')
        col_header=dataset[1].get('col_header')
        if dataset[1].get('col_row') is None:
            col_row=dataset[1].get('col_row')
        else:        
            col_row=dict(dataset[1].get('col_row'))
        if title:
            if col_title:
                union_col_title=[]
                for idx,val in enumerate(title):
                    tmp_union_col_title=list(val)
                    tmp_union_col_title.append(str(col_title[idx]))
                    union_col_title.append(tmp_union_col_title)
                table_row='<tr>\n{fields}\n</tr>'.format(fields='\n'.join(['<th colspan="{span}" style="background-color:{color}">{field}</th>'.format(field=replace_signs(str(field)),span=span,color=color) for field,span,color in union_col_title]))
                print table_row
                table_rows.append(table_row)
            else:
                table_row='<tr>\n{fields}\n</tr>'.format(fields='\n'.join(['<th colspan="{span}">{field}</th>'.format(field=replace_signs(str(field)),span=span) for field,span in title]))
                table_rows.append(table_row)    
        for idx,row in enumerate(rows):
            if idx==0:
                if col_header:
                    table_row='<tr>\n{fields}\n</tr>'.format(fields='\n'.join(['<th style="background-color:{col_header}">{field}</th>'.format(col_header=col_header,field=replace_signs(str(field))) for field in row]))
                else:
                    table_row='<tr>\n{fields}\n</tr>'.format(fields='\n'.join(['<th>{field}</th>'.format(field=replace_signs(str(field))) for field in row]))    
            #elif idx==1:
            #    table_row='<tr>\n{fields}\n</tr>'.format(fields='\n'.join(['<td bgcolor="orangered">{field}</td>'.format(field=replace_signs(str(field))) for field in row]))    
            else:
                if col_row:
                    if col_row.has_key(idx):
                        bgcolor=col_row[idx]
                        table_row='<tr>\n{fields}\n</tr>'.format(fields='\n'.join(['<td bgcolor="{bgcolor}">{field}</td>'.format(bgcolor=bgcolor,field=replace_signs(str(field))) for field in row]))
                #if idx % 2==0:
                #    cls=' class="alt"'
                else:
                    cls=''
                    table_row='<tr{cls}>\n{fields}\n</tr>'.format(cls=cls,fields='\n'.join(['<td>{field}</td>'.format(field=replace_signs(str(field))) for field in row]))
            table_rows.append(table_row)        
        table_html='\n'.join(table_rows)
        return table_html    
        
    def __get_html_table(self,dataset,idx):
        if dataset:
            rows=self.__get_table_rows(dataset,idx)
            header=dataset[1].get('header')
            table='<table id="table_style">\n<caption><br><br></br></br>{header}</caption>\n{rows}\n</table>'.format(header=header,rows=rows)
            div=dataset[1].get('div')
            if div:
                table_div='<div class = "tail">\n<ul >{fields}\n</ul>\n</div>'.format(fields='\n'.join(['<li>{field}</li>'.format(field=replace_signs(str(field))) for field in div]))
                table=table+'\n'+table_div
            return table
        else:
            return ''
        
    def __get_html_lines(self,lines):
        return '\n'.join(map(lambda line:"<p style=\"color:#000000;\">"+replace_signs(line)+"</p>",lines.splitlines()))
    def __get_image(self,image,idx):
        if image:
            if isinstance(image,dict):
                image=self.make_image(idx,**image)
            self._images.append(image)
        return image
    
    def __get_html_image(self,dataset,idx):
        image=dataset[1].get('image')
        image=self.__get_image(image,idx)
        if not image:
            return ''
        return '<img src="cid:image{idx}" />'.format(idx=len(self._images))
    
    def __fill_table(self,dataset,idx):
        self.__get_dataset(dataset)
        table=self.__get_html_table(dataset,idx)
        image=self.__get_html_image(dataset,idx)
        footer=self.__get_html_lines(dataset[1].get('footer'))
        #return '\n'.join([header,table,image,footer])
        return '\n'.join([table,image,footer])
    
    def __fill_tables(self,datasets):
        return '\n'.join([self.__fill_table(dataset,idx) for idx,dataset in enumerate(datasets,1)])
    
    def __fill_footer(self,footer):
        footer='<br />\n'.join(map(replace_signs,footer.splitlines()))
        return re.sub(r'(http://[^\s,;:!]+)',r'<a href="\1">\1</a>',footer)
    
    def __fill_html(self):
        title=replace_signs(self._title)
        tables=self.__fill_tables(self._datasets)
        footer=self.__fill_footer(self._footer)
        self._html=_html.format(title=title,charset=self._charset,style=_style,tables=tables,footer=footer)
    def make(self):
        self.__fill_html()
        return self
    
    def get_html(self):
        return self._html
    
    def get_datasets(self):
        return self._dataset_rows
    
    def make_image(self,idx,**kwargs):
        if os.name!='nt':
            chart_path='/home/pcsmaster/dwetl/LIB/R'
            swicth_code=lambda string:str(string)
            cmd_env='export LANG=zh_CN.UTF-8 && '
            family='Monospace'
        else:
            chart_path='D:\Project\R'
            cmd_env=''
            family=''
            swicth_code=lambda string:str(string).decode('utf-8').encode('gbk')
        path=os.getcwd()
        data_file='{path}{sep}image_dataset_{idx}.txt'.format(path=path,sep=os.sep,idx=idx)
        kwargs.setdefault('width',800)
        kwargs.setdefault('height',320)
        mode=kwargs.pop('mode','line')
        if mode not in ('line','bar','pie'):
            raise Exception("No such chart type: {mode}".format(mode=mode))
        image=kwargs.pop('name','{path}{sep}dataset_image{idx}.jpg'.format(path=path,sep=os.sep,idx=idx))
        script=kwargs.pop('script','{chart_path}{sep}chart.R'.format(chart_path=chart_path,sep=os.sep))
        reverse=kwargs.pop('reverse',False)
        x=int(kwargs.pop('x',1))
        y=kwargs.pop('y',())
        rows=self._dataset_rows[idx-1]
        fields=rows[0]
        if isinstance(y,(tuple,list)):
            y=','.join(map(str,y))
        title=swicth_code(kwargs.pop('title',''))
        f=open(data_file,'w')
        if reverse:
            rows=sorted(rows[1:],key=lambda r:r[x-1],reverse=False)
            rows=[fields]+rows
        for row in rows:
            f.write('\t'.join(map(swicth_code,row))+'\n')
        f.close()
        cmd="{cmd_env}Rscript {script} {mode} {data_file} {x} {y} {name} {title} {width} {height} {family}"
        cmd=cmd.format(cmd_env=cmd_env,script=script,mode=mode,data_file=data_file,name=image,x=x,y=y,title=title,family=family,**kwargs)
        os.system(cmd)
        os.remove(data_file)
        return image
    
    def get_images(self):
        return self._images
    
class Mail(object):
    
    def __init__(self):
        self.initialize()
        
    def initialize(self):
        self._host=''
        self._port=25
        self._user=''
        self._passwd=''
        self._html=None
        self._text=''
        self._from=''
        self._from_alias=''
        self._to=[]
        self._cc=[]
        self._subject=''
        self._charset='utf-8'
        self._attaches=[]
        self._datasets=[]
        self._mail=MIMEMultipart()
        
    def set_host(self,host):
        self._host=host
        return self
    
    def set_port(self,port):
        self._port=port
        return self
    
    def set_user(self,user):
        self._user=user
        return self
    
    def set_passwd(self,passwd):
        self._passwd=passwd
        return self
    
    def set_from(self,_from):
        self._from=_from
        return self
    
    def set_from_alias(self,alias):
        self._from_alias=alias
        return self
    
    def set_to(self,to):
        if isinstance(to,(list,tuple)):
            self._to=to
        elif isinstance(to,basestring):
            self._to=re.split(r',|;',to)
        return self
    
    def set_cc(self,cc):
        if isinstance(cc,(list,tuple)):
            self._cc=cc
        elif isinstance(cc,basestring):
            self._cc=re.split(r',|;',cc)
        return self
    
    def set_subject(self,subject):
        self._subject=subject
        return self
    
    def set_html(self,html):
        self._html=html
        return self
    
    def set_text(self,text):
        self._text=text
        return self
    
    def set_charset(self,charset):
        self._charset=charset
        return self
    
    def add_dataset(self,dataset,**kwargs):
        self._datasets.append((dataset,kwargs))
        return self
    
    def add_attach(self,attach):
        self._attaches.append(attach)
        return self
    
    def add_attaches(self,attaches):
        for attach in attaches:
            self.add_attach(attach)
        return self
    
    def __add_attach(self,attach):
        f=open(attach,'rb')
        part=MIMEText(f.read(),'base64','gbk')
        part["Content-Type"]='application/octet-stream'
        part["Content-Disposition"]='attachment; filename="{name}"'.format(name=os.path.basename(attach))
        self._mail.attach(part)
        f.close()
        return self
    
    def __add_attaches(self,attaches=None):
        attaches=attaches or self._attaches
        for attach in attaches:
            self.__add_attach(attach)
        return self
    
    def __add_text(self,text=None):
        text=text or self._text
        part=MIMEText(text,'plain',self._charset)
        self._mail.attach(part)
        return self
    
    def __add_html(self,html=None):
        html=html or self._html.get_html()
        part=MIMEText(html,'html',self._charset)
        self._mail.attach(part)
        return self
    
    def __add_html_image(self,image,idx=1):
        f=open(image,'rb')
        part=MIMEImage(f.read())
        f.close()
        part.add_header('Content-ID','<image{idx}>'.format(idx=idx))
        self._mail.attach(part)
        return self
    
    def __add_html_images(self,html=None):
        html=html or self._html
        images=html.get_images()
        if not images:
            return self
        for idx,image in enumerate(images,1):
            self.__add_html_image(image,idx)
        return self
    
    def __add_datasets(self,datasets=None):
        datasets=datasets or self._datasets
        html=HTML()
        for dataset,kwargs in datasets:
            html.add_dataset(dataset,**kwargs)
        html.make()
        self.__add_html(html.get_html())
        self.__add_html_images(html)
        self.set_html(html)
        return self
    
    def __clear_images(self,html=None):
        html=html or self._html
        if not html:
            return self
        for image in html.get_images():
            if image.find('dataset_image')==-1:
                continue
            if os.path.exists(image):
                os.remove(image)
        return self
    
    def _get_from_alias(self):
        if not self._from_alias:
            self._from_alias=self._from.split('@')[0].upper()
        from_alias='{alias}<{mail}>'.format(alias=self._from_alias,mail=self._from).decode(self._charset)
        return from_alias
    
    def __set_mail(self):
        self._mail['From']=self._get_from_alias()
        self._mail['To']=','.join(self._to)
        self._mail['CC']=','.join(self._cc)
        self._mail['Subject']=Header(self._subject,charset=self._charset)
        self._mail["Accept-Language"]="zh-CN"
        self._mail["Accept-Charset"]="ISO-8859-1,utf-8"
        if self._text:
            self.__add_text()
        if self._html:
            self.__add_html()
            self.__add_html_images()
        if self._attaches:
            self.__add_attaches()
        if self._datasets:
            self.__add_datasets()
        return self
    
    def send(self):
        try:
            self.__set_mail()
            s=smtplib.SMTP()
            s.connect(self._host,self._port)
            if self._user and self._passwd:
                s.login(self._user,self._passwd)
            s.sendmail(self._get_from_alias(),self._to+self._cc,self._mail.as_string())
            s.quit()
            return True
        except Exception as error:
            print error
            return False
        finally:
            self.__clear_images()
            self.initialize()
            
def send_mail(_from='des-bi@qunar.com',to='denchen.yang@qunar.com',alias='Qunar目的地数据',host='mail.corp.qunar.com',user='des-bi@qunar.com',**kwargs):
    mail=Mail()
    mail.set_host(host)
    #mail.set_port(port)
    mail.set_from(_from)
    mail.set_from_alias(alias)
    mail.set_to(to)
    mail.set_user(user)
    #mail.set_passwd(passwd)
    for key,value in kwargs.items():
        set_attr='set_{attr}'.format(attr=key)
        add_attr='add_{attr}'.format(attr=key)
        if hasattr(mail,set_attr):
            getattr(mail,set_attr)(value)
        elif hasattr(mail,add_attr):
            func=getattr(mail,add_attr)
            if key=='dataset':
                if isinstance(value,(list,tuple)):
                    for kw in value:
                        ds=kw.pop('source')
                        func(ds,**kw)
                else:
                    ds=value.pop('source')
                    func(ds,**value)
            else:
                if isinstance(value,(list,tuple)):
                    for v in value:
                        func(v)
                else:
                    func(value)
    return mail.send()

def demo():
    sql='SELECT REPLACE(stat_date,"-","") AS stat_date,js_pv,js_uv,lv,passive_lv,new_registers,mobile_registers,new_emails,new_cards,new_jobs FROM app_kpi_day_di WHERE stat_date>=20140801 ORDER BY stat_date DESC'
    dbc=dict(host='10.10.67.17',port=3353,user='dataol',passwd='dataol-13',db='db_data_discover')
    dataset=dict(source=sql,dbc=dbc,header='基础数据报表',image=dict(mode='line',x=1,y=(2,3,4),title='基础数据趋势图',reverse=True))
    send_mail(to='wei.wang@dajie-inc.com',subject='基础数据报表',dataset=dataset)
    
if __name__ == '__main__':
    demo()
    