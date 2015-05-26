#!/usr/bin/env python
#-*- coding:utf-8 -*-

class BaseDBC(object):
    def __init__(self):
        self.dbc={}
        self.set_dbc()
        
    def __call__(self):
        return self.dbc
        
    def register(self,dbn,db=None,**dbc):
        dbc['db']=db
        if dbn not in self.dbc:
            self.dbc[dbn]=dbc
	    
    def set_dbc(self):
        for k in dir(self.__class__):
            if k.startswith('_') and k.endswith('_dbs'):
                getattr(self,k)()

class WubaDBC(BaseDBC):
    def __init__(self):
        self.dbc={}
        self.set_dbc()
        
    def _stat_dbs(self):
        for dbn,db in [
            ('db_gb_stat','dbwww58com_groupbuy_stats'),
            ('db_hy_stat','dbwww58com_huangye_stats'),
            ('db_shop_stat','dbwww58com_shop_stats'),
            ('db_pre_ads','dbwww58com_precision_ads'),
            ('db_58_stat','dbwww58com_58_stats'),
            ('db_base_dict','dbwww58com_base_dicts'),
            ('db_kezhan_stat','dbwww58com_kezhan_stats'),
            ('db_es_stat','dbwww58com_ershou_stats'),
            ('db_or_stat','dbwww58com_online_revenue_stats'),
            ('db_api_stat','dbwww58com_api_stat'),
            ('db_gb_open','dbwww58com_groupbuy_open'),
            ('db_data_ms','cronhub_manage_system'),
	    ('db_test_stat','test'),]:
            self.register(dbn,db=db,host='10.5.20.16',port=58885,user='ec_stat',passwd='L#c8UM5RGh5C')
            
    def _ib_dbs(self):
        for dbn,db in [
            ('db_gb_ib','groupbuy'),
            ('db_hy_ib','huangye'),
            ('db_zp_ib','zhaopin'),
            ('db_58_ib','58'),
            ('db_precise_ib','precise'),]:
            self.register(dbn,db=db,host='10.5.20.15',port=5029,user='root',passwd='group_buytj1140')
            
    def _resume_dbs(self):
        for dbn,db in [
            ('db_58_jianli','DBWWW58COM_Recruitment'),
            ('db_58_jianli01','DBWWW58COM_Recruitment0'),
            ('db_58_jianli02','DBWWW58COM_Recruitment1'),
            ('db_58_jianli03','DBWWW58COM_Recruitment2'),
            ('db_58_jianli04','DBWWW58COM_Recruitment3'),
            ('db_58_jianli05','DBWWW58COM_Recruitment4'),
            ('db_58_jianli06','DBWWW58COM_Recruitment5'),
            ('db_58_jianli07','DBWWW58COM_Recruitment6'),
            ('db_58_jianli08','DBWWW58COM_Recruitment7'),
            ('db_58_jianli09','DBWWW58COM_Recruitment8'),
            ('db_58_jianli10','DBWWW58COM_Recruitment9'),
            ('db_58_jianli11','DBWWW58COM_Recruitment10'),
            ('db_58_jianli12','DBWWW58COM_Recruitment11'),
            ('db_58_jianli13','DBWWW58COM_Recruitment12'),
            ('db_58_jianli14','DBWWW58COM_Recruitment13'),
            ('db_58_jianli15','DBWWW58COM_Recruitment14'),
            ('db_58_jianli16','DBWWW58COM_Recruitment15'),]:
            self.register(dbn,db=db,host='recruitment-s.db.58dns.org',port=58885,user='export58user',passwd='UxkrTllu4QLbVu7T')
            
    def _pmc_dbs(self):
        for dbn,db,port in [
            ('db_pay_order_0','dbwww58com_pay_order_0',58885),
            ('db_pay_order_1','dbwww58com_pay_order_1',58885),
            ('db_pay_order_2','dbwww58com_pay_order_2',58886),
            ('db_pay_order_3','dbwww58com_pay_order_3',58886),
            ('db_pay_account_0','dbwww58com_pay_account_new0',58885),
            ('db_pay_account_1','dbwww58com_pay_account_new1',58885),
            ('db_pay_account_2','dbwww58com_pay_account_new2',58886),
            ('db_pay_account_3','dbwww58com_pay_account_new3',58886),]:
            self.register(dbn,db=db,host='192.168.12.81',port=port,user='syzn58user_rd',passwd='FwE6dfgtpas12t6m')
            
    def _other_dbs(self):
        self.register('db_shop_emc',db='dbwww58com_shopemc',host='shopemc-s.db.58dns.org',port=58885,user='shopemc58user',passwd='q5wtgdtbJvZSc2EQ')
        self.register('db_emc_product',db='dbwww58com_emcproduct_0',host='ecmproduct0-s.db.58dns.org',port=58885,user='emcproduct_hprro',passwd='OqX1jJ3Qjy')
        self.register('db_emc_order',db='dbwww58com_emcorder',host='emcorder-s.db.58dns.org',port=58885,user='emcorder_hprro',passwd='Yb%LEfmLO5')
        self.register('db_es_order',db='dbwww58com_emcorder',host='emcorder-s.db.58dns.org',port=58885,user='orderuser_fenxi',passwd='20KCM@GqxJ')
        self.register('db_api_150',db='dbwww58com_api',host='eapi-s.db.58dns.org',port=58885,user='user_api',passwd='X+N+=2j0$3epP0u')
        self.register('db_58_ent',db='dbwww58com_enterprise',host='enterprise-s.db.58dns.org',port=58885,user='rdetda58user',passwd='A5doGsv8msxYF7dYVI')
        self.register('db_58_bossv10',db='dbwww58com_bossv10',host='bossv10-s.db.58dns.org',port=58885,user='bossv58user',passwd='uKeBwzO9yQrReev')
        self.register('db_58_bsp',db='dbwww58com_bsponline',host='bsponline-s.db.58dns.org',port=58885,user='rdda58user',passwd='QvShfxFgiXxbQ0r0ya')
        self.register('db_58_productv3',db='dbwww58com_product_v3',host='productv3-s.db.58dns.org',port=58885,user='rdpln58read',passwd='H5t8uV59niBZ5ABe5')
        self.register('db_58_jingjiainfo',db='dbwww58com_jingjiainfo',host='jingjiainfo-s.db.58dns.org',port=58885,user='jj58user_rd',passwd='cVJrlY8wcLlZdfgtt')
        self.register('db_gb_kefu',db='dbwww58com_groupbuy_customer',host='grpbuycustomer-s.db.58dns.org',port=58885,user='user_customer',passwd='l@#jsaf(*safd1')
        self.register('db_gb_31',db='dbwww58com_groupbuy_v2',host='tgorder-s.db.58dns.org',port=58885,user='tg_order_ro',passwd='Jp8%$aNzXc&b')
        self.register('db_gb_26',db='dbwww58com_groupbuy_v2',host='groupbuyv2-s.db.58dns.org',port=58885,user='user_fenxi',passwd='Jd&6&eJ8PR')
        self.register('db_ad_code',db='dbwww58com_datacount',host='datacount.db.58dns.org',port=58885,user='rdtuanguser',passwd='d865lvfr4Rny&tt')
        self.register('db_ad_62',db='dbwww58com_newadvts',host='newadvts-s.db.58dns.org',port=58885,user='newas58user',passwd='cOA8tgbw7TpVxk6Ced')
        self.register('db_ad_iadvt',db='dbwww58com_iadvt',host='eiadvt.db.58dns.org',port=58885,user='sjfx_rd',passwd='l2FGdq84yRt5L8w0Fn')
        self.register('db_58_top',db='dbwww58com_topinfo',host='topinfo-s.db.58dns.org',port=58885,user='topolr58user',passwd='qy#u$#3sfuHn$qJe')
        self.register('db_bid_promotion',db='dbwww58com_bidding_promotion',host='bidpromotion-s.db.58dns.org',port=58885,user='user_houpr_ro',passwd='iGpg3REtP@')
        self.register('db_bid_stat',db='dbwww58com_bidding_stat',host='bidstat-s.db.58dns.org',port=58885,user='user_houpr_ro',passwd='iGpg3REtP@')
        self.register('db_wlt_info',db='dbwww58com_wltinfo',host='wltinfo-s.db.58dns.org',port=58885,user='wltinfo_read',passwd='t4rfRSc2tP5re45r')
        
class DajieDBC(BaseDBC):
    def __init__(self):
        self.dbc={}
        self.set_dbc()
	
    def _stat_dbs(self):
	for dbn,db in [
	    ('db_stat_stat','DB_STAT'),
	    ('db_stat_kpi','DB_KPI'),
	    ('db_stat_center','DB_CENTER'),
	    ('db_stat_log','DB_LOG'),
	    ]:
	    self.register(dbn,db=db,host='10.10.67.17',port=3351,user='stat',passwd='stat_25530')
	    
    def _user_dbs(self):
	for dbn,db in [
	    ('db_3306_core','DB_CORE'),
	    ('db_3306_group','DB_GROUP'),
	    ('db_3306_salary','DB_SALARY'),
	    ]:
	    self.register(dbn,db=db,host='10.10.67.24',port=3306,user='data_sel',passwd='dajie.data&')
	for dbn,db in [
	    ('db_3307_recruit','DB_RECRUIT'),
	    ]:
	    self.register(dbn,db=db,host='10.10.67.24',port=3307,user='data_sel',passwd='dajie.data&')
	for dbn,db in [
	    ('db_3351_center','DB_CENTER'),
	    ]:
	    self.register(dbn,db=db,host='10.10.67.40',port=3351,user='data_sel',passwd='dajie.data&')
	for dbn,db in [
	    ('db_3352_business','DB_BUSINESS'),
	    ]:
	    self.register(dbn,db=db,host='10.10.67.40',port=3352,user='data_sel',passwd='dajie.data&')
	
    def _dw_dbs(self):
	for dbn,db in [
	    ('db_dw_dw','dw'),
	    ('db_dw_plat','dw_plat')]:
	    self.register(dbn,db=db,host='10.10.67.30',port=6001,user='statol',passwd='statol-5')
	for dbn,db in [
	    ('local_dw_dw','dw'),
	    ('local_dw_plat','dw_plat')]:
	    self.register(dbn,db=db,host='10.10.67.30',port=6001,user='wei.an',passwd='dajie.wei&')
	    
    def _rec_dbs(self):
	for dbn,db in [
	    ('db_rec_app','DB_APP'),
	    ('db_rec_ask','DB_ASK'),
	    ('db_rec_club','DB_CLUB')
	    ]:
	    self.register(dbn,db=db,host='192.168.10.11',port=3316,user='recruit',passwd='uc1q2w3e4r')
	    
    def _dm_dbs(self):
	for dbn,db in [
	    ('db_dm_cfg','db_datamgrcfg'),
	    ('db_data_discover','db_data_discover'),
	    ]:
	    self.register(dbn,db=db,host='10.10.67.17',port=3353,user='dataol',passwd='dataol-13')
	    
    def _hive_test_dbs(self):
	self.register('hive_test_dss','dss',host='192.168.11.122',port=10000)
	
    def _hive_dbs(self):
	self.register('hive_dw_dss','dss',host='64-67.bjyz.dajie-inc.com',port=10000)
	self.register('hive_dw_default','dss',host='64-67.bjyz.dajie-inc.com',port=10000)

class QunarDBC(BaseDBC):
    def __init__(self):
        self.dbc={}
        self.set_dbc()
	
    def _stat_dbs(self):
	for dbn,db in [
	    ('db_data_discover_new','dwr'),
	    ]:
	    self.register(dbn,db=db,host='l-dw03.des.cn8',port=3306,user='db_data_discover',passwd='07XDgXuYyS')  
	for dbn,db in [
	    ('db_data_discover_04','dwr'),
	    ]:
	    self.register(dbn,db=db,host='l-dw04.des.cn5.qunar.com',port=3306,user='db_data_discover',passwd='8XGscMfxyCQS4HW3rWz3cTod')  
	for dbn,db in [
	    ('db_data_discover','dwr'),
	    ]:
	    self.register(dbn,db=db,host='l-dw01.des.cn6',port=3306,user='db_data_discover',passwd='07XDgXuYyS')    
	for dbn,db in [
	    ('qunar_group','qunar_group'),
	    ]:
	    self.register(dbn,db=db,host='l-tuandbvip2.des.cn8.qunar.com',port=5432,user='doubhor',passwd='dab64072-3b1e-400a-adac-83e494c90eb6')
	for dbn,db in [
	    ('qunar_group_congku2','qunar_group'),
	    ]:
	    self.register(dbn,db=db,host='l-tuandb3.des.cn8.qunar.com',port=5432,user='des_report',passwd='1adff040-bdbb-4bc0-b9ea-c810af1a7a77')
	for dbn,db in [
	    ('crm_doctor','crm_doctor'),
	    ]:
	    self.register(dbn,db=db,host='192.168.224.122',port=6458,user='des_bi_r',passwd='YFIvn50M3SxIbxS5Im')
	for dbn,db in [
	    ('des_mall','des_mall'),
	    ]:
	    self.register(dbn,db=db,host='192.168.39.84',port=3306,user='des_mall_r',passwd='jkC39p5X6qRigsBI')	    
	for dbn,db in [
	    ('tuan_report','tuan_report'),
	    ]:
	    self.register(dbn,db=db,host='l-appcrwl1.wap.cn6.qunar.com',port=3306,user='pppadmin',passwd='d1d87f4f-8da7-47b6-b780-34aa95659e9b')		    
class DBC(dict):
    def __init__(self,dbc=QunarDBC()()):
        self.dbc=dbc
        self._set_attrs()
        self.update(self.dbc)
        
    def __getitem__(self,dbn):
        if dbn in self.dbc:
            return self.dbc.get(dbn)
        raise Exception('No defined dbn: %s in dbc.' % dbn)
        
    def _set_attrs(self):
        for dbn,dbc in self.dbc.items():
            setattr(self,dbn,dbc)
            
dbc=DBC()
