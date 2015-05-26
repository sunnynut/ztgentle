// ORM class for table 'dim_hotel_info'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Jan 31 03:13:25 CST 2015
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class dim_hotel_info extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String stat_date;
  public String get_stat_date() {
    return stat_date;
  }
  public void set_stat_date(String stat_date) {
    this.stat_date = stat_date;
  }
  public dim_hotel_info with_stat_date(String stat_date) {
    this.stat_date = stat_date;
    return this;
  }
  private String hotel_seq;
  public String get_hotel_seq() {
    return hotel_seq;
  }
  public void set_hotel_seq(String hotel_seq) {
    this.hotel_seq = hotel_seq;
  }
  public dim_hotel_info with_hotel_seq(String hotel_seq) {
    this.hotel_seq = hotel_seq;
    return this;
  }
  private String hotel_id;
  public String get_hotel_id() {
    return hotel_id;
  }
  public void set_hotel_id(String hotel_id) {
    this.hotel_id = hotel_id;
  }
  public dim_hotel_info with_hotel_id(String hotel_id) {
    this.hotel_id = hotel_id;
    return this;
  }
  private String hotel_name;
  public String get_hotel_name() {
    return hotel_name;
  }
  public void set_hotel_name(String hotel_name) {
    this.hotel_name = hotel_name;
  }
  public dim_hotel_info with_hotel_name(String hotel_name) {
    this.hotel_name = hotel_name;
    return this;
  }
  private String city_code;
  public String get_city_code() {
    return city_code;
  }
  public void set_city_code(String city_code) {
    this.city_code = city_code;
  }
  public dim_hotel_info with_city_code(String city_code) {
    this.city_code = city_code;
    return this;
  }
  private String city_ename;
  public String get_city_ename() {
    return city_ename;
  }
  public void set_city_ename(String city_ename) {
    this.city_ename = city_ename;
  }
  public dim_hotel_info with_city_ename(String city_ename) {
    this.city_ename = city_ename;
    return this;
  }
  private String city_name;
  public String get_city_name() {
    return city_name;
  }
  public void set_city_name(String city_name) {
    this.city_name = city_name;
  }
  public dim_hotel_info with_city_name(String city_name) {
    this.city_name = city_name;
    return this;
  }
  private String inter_region_code;
  public String get_inter_region_code() {
    return inter_region_code;
  }
  public void set_inter_region_code(String inter_region_code) {
    this.inter_region_code = inter_region_code;
  }
  public dim_hotel_info with_inter_region_code(String inter_region_code) {
    this.inter_region_code = inter_region_code;
    return this;
  }
  private String province_ename;
  public String get_province_ename() {
    return province_ename;
  }
  public void set_province_ename(String province_ename) {
    this.province_ename = province_ename;
  }
  public dim_hotel_info with_province_ename(String province_ename) {
    this.province_ename = province_ename;
    return this;
  }
  private String province_name;
  public String get_province_name() {
    return province_name;
  }
  public void set_province_name(String province_name) {
    this.province_name = province_name;
  }
  public dim_hotel_info with_province_name(String province_name) {
    this.province_name = province_name;
    return this;
  }
  private String country_ename;
  public String get_country_ename() {
    return country_ename;
  }
  public void set_country_ename(String country_ename) {
    this.country_ename = country_ename;
  }
  public dim_hotel_info with_country_ename(String country_ename) {
    this.country_ename = country_ename;
    return this;
  }
  private String country_name;
  public String get_country_name() {
    return country_name;
  }
  public void set_country_name(String country_name) {
    this.country_name = country_name;
  }
  public dim_hotel_info with_country_name(String country_name) {
    this.country_name = country_name;
    return this;
  }
  private String hotel_area;
  public String get_hotel_area() {
    return hotel_area;
  }
  public void set_hotel_area(String hotel_area) {
    this.hotel_area = hotel_area;
  }
  public dim_hotel_info with_hotel_area(String hotel_area) {
    this.hotel_area = hotel_area;
    return this;
  }
  private String hotel_trading_area;
  public String get_hotel_trading_area() {
    return hotel_trading_area;
  }
  public void set_hotel_trading_area(String hotel_trading_area) {
    this.hotel_trading_area = hotel_trading_area;
  }
  public dim_hotel_info with_hotel_trading_area(String hotel_trading_area) {
    this.hotel_trading_area = hotel_trading_area;
    return this;
  }
  private String hotel_grade;
  public String get_hotel_grade() {
    return hotel_grade;
  }
  public void set_hotel_grade(String hotel_grade) {
    this.hotel_grade = hotel_grade;
  }
  public dim_hotel_info with_hotel_grade(String hotel_grade) {
    this.hotel_grade = hotel_grade;
    return this;
  }
  private String hotel_star;
  public String get_hotel_star() {
    return hotel_star;
  }
  public void set_hotel_star(String hotel_star) {
    this.hotel_star = hotel_star;
  }
  public dim_hotel_info with_hotel_star(String hotel_star) {
    this.hotel_star = hotel_star;
    return this;
  }
  private String hotel_type;
  public String get_hotel_type() {
    return hotel_type;
  }
  public void set_hotel_type(String hotel_type) {
    this.hotel_type = hotel_type;
  }
  public dim_hotel_info with_hotel_type(String hotel_type) {
    this.hotel_type = hotel_type;
    return this;
  }
  private String hotel_brand_code;
  public String get_hotel_brand_code() {
    return hotel_brand_code;
  }
  public void set_hotel_brand_code(String hotel_brand_code) {
    this.hotel_brand_code = hotel_brand_code;
  }
  public dim_hotel_info with_hotel_brand_code(String hotel_brand_code) {
    this.hotel_brand_code = hotel_brand_code;
    return this;
  }
  private String hotel_brand_name;
  public String get_hotel_brand_name() {
    return hotel_brand_name;
  }
  public void set_hotel_brand_name(String hotel_brand_name) {
    this.hotel_brand_name = hotel_brand_name;
  }
  public dim_hotel_info with_hotel_brand_name(String hotel_brand_name) {
    this.hotel_brand_name = hotel_brand_name;
    return this;
  }
  private String hotel_group_id;
  public String get_hotel_group_id() {
    return hotel_group_id;
  }
  public void set_hotel_group_id(String hotel_group_id) {
    this.hotel_group_id = hotel_group_id;
  }
  public dim_hotel_info with_hotel_group_id(String hotel_group_id) {
    this.hotel_group_id = hotel_group_id;
    return this;
  }
  private String hotel_group_name;
  public String get_hotel_group_name() {
    return hotel_group_name;
  }
  public void set_hotel_group_name(String hotel_group_name) {
    this.hotel_group_name = hotel_group_name;
  }
  public dim_hotel_info with_hotel_group_name(String hotel_group_name) {
    this.hotel_group_name = hotel_group_name;
    return this;
  }
  private String hotel_addr;
  public String get_hotel_addr() {
    return hotel_addr;
  }
  public void set_hotel_addr(String hotel_addr) {
    this.hotel_addr = hotel_addr;
  }
  public dim_hotel_info with_hotel_addr(String hotel_addr) {
    this.hotel_addr = hotel_addr;
    return this;
  }
  private String hotel_phone_number;
  public String get_hotel_phone_number() {
    return hotel_phone_number;
  }
  public void set_hotel_phone_number(String hotel_phone_number) {
    this.hotel_phone_number = hotel_phone_number;
  }
  public dim_hotel_info with_hotel_phone_number(String hotel_phone_number) {
    this.hotel_phone_number = hotel_phone_number;
    return this;
  }
  private String operating_status;
  public String get_operating_status() {
    return operating_status;
  }
  public void set_operating_status(String operating_status) {
    this.operating_status = operating_status;
  }
  public dim_hotel_info with_operating_status(String operating_status) {
    this.operating_status = operating_status;
    return this;
  }
  private String baidu_point;
  public String get_baidu_point() {
    return baidu_point;
  }
  public void set_baidu_point(String baidu_point) {
    this.baidu_point = baidu_point;
  }
  public dim_hotel_info with_baidu_point(String baidu_point) {
    this.baidu_point = baidu_point;
    return this;
  }
  private String google_point;
  public String get_google_point() {
    return google_point;
  }
  public void set_google_point(String google_point) {
    this.google_point = google_point;
  }
  public dim_hotel_info with_google_point(String google_point) {
    this.google_point = google_point;
    return this;
  }
  private String online_status;
  public String get_online_status() {
    return online_status;
  }
  public void set_online_status(String online_status) {
    this.online_status = online_status;
  }
  public dim_hotel_info with_online_status(String online_status) {
    this.online_status = online_status;
    return this;
  }
  private String one_sentence_commment;
  public String get_one_sentence_commment() {
    return one_sentence_commment;
  }
  public void set_one_sentence_commment(String one_sentence_commment) {
    this.one_sentence_commment = one_sentence_commment;
  }
  public dim_hotel_info with_one_sentence_commment(String one_sentence_commment) {
    this.one_sentence_commment = one_sentence_commment;
    return this;
  }
  private String hotel_desc;
  public String get_hotel_desc() {
    return hotel_desc;
  }
  public void set_hotel_desc(String hotel_desc) {
    this.hotel_desc = hotel_desc;
  }
  public dim_hotel_info with_hotel_desc(String hotel_desc) {
    this.hotel_desc = hotel_desc;
    return this;
  }
  private String attrs;
  public String get_attrs() {
    return attrs;
  }
  public void set_attrs(String attrs) {
    this.attrs = attrs;
  }
  public dim_hotel_info with_attrs(String attrs) {
    this.attrs = attrs;
    return this;
  }
  private String hotel_extend_info;
  public String get_hotel_extend_info() {
    return hotel_extend_info;
  }
  public void set_hotel_extend_info(String hotel_extend_info) {
    this.hotel_extend_info = hotel_extend_info;
  }
  public dim_hotel_info with_hotel_extend_info(String hotel_extend_info) {
    this.hotel_extend_info = hotel_extend_info;
    return this;
  }
  private String city_pinyin;
  public String get_city_pinyin() {
    return city_pinyin;
  }
  public void set_city_pinyin(String city_pinyin) {
    this.city_pinyin = city_pinyin;
  }
  public dim_hotel_info with_city_pinyin(String city_pinyin) {
    this.city_pinyin = city_pinyin;
    return this;
  }
  private String province_pinyin;
  public String get_province_pinyin() {
    return province_pinyin;
  }
  public void set_province_pinyin(String province_pinyin) {
    this.province_pinyin = province_pinyin;
  }
  public dim_hotel_info with_province_pinyin(String province_pinyin) {
    this.province_pinyin = province_pinyin;
    return this;
  }
  private String bu;
  public String get_bu() {
    return bu;
  }
  public void set_bu(String bu) {
    this.bu = bu;
  }
  public dim_hotel_info with_bu(String bu) {
    this.bu = bu;
    return this;
  }
  private String city_tags;
  public String get_city_tags() {
    return city_tags;
  }
  public void set_city_tags(String city_tags) {
    this.city_tags = city_tags;
  }
  public dim_hotel_info with_city_tags(String city_tags) {
    this.city_tags = city_tags;
    return this;
  }
  private String onlinechannel;
  public String get_onlinechannel() {
    return onlinechannel;
  }
  public void set_onlinechannel(String onlinechannel) {
    this.onlinechannel = onlinechannel;
  }
  public dim_hotel_info with_onlinechannel(String onlinechannel) {
    this.onlinechannel = onlinechannel;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_hotel_info)) {
      return false;
    }
    dim_hotel_info that = (dim_hotel_info) o;
    boolean equal = true;
    equal = equal && (this.stat_date == null ? that.stat_date == null : this.stat_date.equals(that.stat_date));
    equal = equal && (this.hotel_seq == null ? that.hotel_seq == null : this.hotel_seq.equals(that.hotel_seq));
    equal = equal && (this.hotel_id == null ? that.hotel_id == null : this.hotel_id.equals(that.hotel_id));
    equal = equal && (this.hotel_name == null ? that.hotel_name == null : this.hotel_name.equals(that.hotel_name));
    equal = equal && (this.city_code == null ? that.city_code == null : this.city_code.equals(that.city_code));
    equal = equal && (this.city_ename == null ? that.city_ename == null : this.city_ename.equals(that.city_ename));
    equal = equal && (this.city_name == null ? that.city_name == null : this.city_name.equals(that.city_name));
    equal = equal && (this.inter_region_code == null ? that.inter_region_code == null : this.inter_region_code.equals(that.inter_region_code));
    equal = equal && (this.province_ename == null ? that.province_ename == null : this.province_ename.equals(that.province_ename));
    equal = equal && (this.province_name == null ? that.province_name == null : this.province_name.equals(that.province_name));
    equal = equal && (this.country_ename == null ? that.country_ename == null : this.country_ename.equals(that.country_ename));
    equal = equal && (this.country_name == null ? that.country_name == null : this.country_name.equals(that.country_name));
    equal = equal && (this.hotel_area == null ? that.hotel_area == null : this.hotel_area.equals(that.hotel_area));
    equal = equal && (this.hotel_trading_area == null ? that.hotel_trading_area == null : this.hotel_trading_area.equals(that.hotel_trading_area));
    equal = equal && (this.hotel_grade == null ? that.hotel_grade == null : this.hotel_grade.equals(that.hotel_grade));
    equal = equal && (this.hotel_star == null ? that.hotel_star == null : this.hotel_star.equals(that.hotel_star));
    equal = equal && (this.hotel_type == null ? that.hotel_type == null : this.hotel_type.equals(that.hotel_type));
    equal = equal && (this.hotel_brand_code == null ? that.hotel_brand_code == null : this.hotel_brand_code.equals(that.hotel_brand_code));
    equal = equal && (this.hotel_brand_name == null ? that.hotel_brand_name == null : this.hotel_brand_name.equals(that.hotel_brand_name));
    equal = equal && (this.hotel_group_id == null ? that.hotel_group_id == null : this.hotel_group_id.equals(that.hotel_group_id));
    equal = equal && (this.hotel_group_name == null ? that.hotel_group_name == null : this.hotel_group_name.equals(that.hotel_group_name));
    equal = equal && (this.hotel_addr == null ? that.hotel_addr == null : this.hotel_addr.equals(that.hotel_addr));
    equal = equal && (this.hotel_phone_number == null ? that.hotel_phone_number == null : this.hotel_phone_number.equals(that.hotel_phone_number));
    equal = equal && (this.operating_status == null ? that.operating_status == null : this.operating_status.equals(that.operating_status));
    equal = equal && (this.baidu_point == null ? that.baidu_point == null : this.baidu_point.equals(that.baidu_point));
    equal = equal && (this.google_point == null ? that.google_point == null : this.google_point.equals(that.google_point));
    equal = equal && (this.online_status == null ? that.online_status == null : this.online_status.equals(that.online_status));
    equal = equal && (this.one_sentence_commment == null ? that.one_sentence_commment == null : this.one_sentence_commment.equals(that.one_sentence_commment));
    equal = equal && (this.hotel_desc == null ? that.hotel_desc == null : this.hotel_desc.equals(that.hotel_desc));
    equal = equal && (this.attrs == null ? that.attrs == null : this.attrs.equals(that.attrs));
    equal = equal && (this.hotel_extend_info == null ? that.hotel_extend_info == null : this.hotel_extend_info.equals(that.hotel_extend_info));
    equal = equal && (this.city_pinyin == null ? that.city_pinyin == null : this.city_pinyin.equals(that.city_pinyin));
    equal = equal && (this.province_pinyin == null ? that.province_pinyin == null : this.province_pinyin.equals(that.province_pinyin));
    equal = equal && (this.bu == null ? that.bu == null : this.bu.equals(that.bu));
    equal = equal && (this.city_tags == null ? that.city_tags == null : this.city_tags.equals(that.city_tags));
    equal = equal && (this.onlinechannel == null ? that.onlinechannel == null : this.onlinechannel.equals(that.onlinechannel));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dim_hotel_info)) {
      return false;
    }
    dim_hotel_info that = (dim_hotel_info) o;
    boolean equal = true;
    equal = equal && (this.stat_date == null ? that.stat_date == null : this.stat_date.equals(that.stat_date));
    equal = equal && (this.hotel_seq == null ? that.hotel_seq == null : this.hotel_seq.equals(that.hotel_seq));
    equal = equal && (this.hotel_id == null ? that.hotel_id == null : this.hotel_id.equals(that.hotel_id));
    equal = equal && (this.hotel_name == null ? that.hotel_name == null : this.hotel_name.equals(that.hotel_name));
    equal = equal && (this.city_code == null ? that.city_code == null : this.city_code.equals(that.city_code));
    equal = equal && (this.city_ename == null ? that.city_ename == null : this.city_ename.equals(that.city_ename));
    equal = equal && (this.city_name == null ? that.city_name == null : this.city_name.equals(that.city_name));
    equal = equal && (this.inter_region_code == null ? that.inter_region_code == null : this.inter_region_code.equals(that.inter_region_code));
    equal = equal && (this.province_ename == null ? that.province_ename == null : this.province_ename.equals(that.province_ename));
    equal = equal && (this.province_name == null ? that.province_name == null : this.province_name.equals(that.province_name));
    equal = equal && (this.country_ename == null ? that.country_ename == null : this.country_ename.equals(that.country_ename));
    equal = equal && (this.country_name == null ? that.country_name == null : this.country_name.equals(that.country_name));
    equal = equal && (this.hotel_area == null ? that.hotel_area == null : this.hotel_area.equals(that.hotel_area));
    equal = equal && (this.hotel_trading_area == null ? that.hotel_trading_area == null : this.hotel_trading_area.equals(that.hotel_trading_area));
    equal = equal && (this.hotel_grade == null ? that.hotel_grade == null : this.hotel_grade.equals(that.hotel_grade));
    equal = equal && (this.hotel_star == null ? that.hotel_star == null : this.hotel_star.equals(that.hotel_star));
    equal = equal && (this.hotel_type == null ? that.hotel_type == null : this.hotel_type.equals(that.hotel_type));
    equal = equal && (this.hotel_brand_code == null ? that.hotel_brand_code == null : this.hotel_brand_code.equals(that.hotel_brand_code));
    equal = equal && (this.hotel_brand_name == null ? that.hotel_brand_name == null : this.hotel_brand_name.equals(that.hotel_brand_name));
    equal = equal && (this.hotel_group_id == null ? that.hotel_group_id == null : this.hotel_group_id.equals(that.hotel_group_id));
    equal = equal && (this.hotel_group_name == null ? that.hotel_group_name == null : this.hotel_group_name.equals(that.hotel_group_name));
    equal = equal && (this.hotel_addr == null ? that.hotel_addr == null : this.hotel_addr.equals(that.hotel_addr));
    equal = equal && (this.hotel_phone_number == null ? that.hotel_phone_number == null : this.hotel_phone_number.equals(that.hotel_phone_number));
    equal = equal && (this.operating_status == null ? that.operating_status == null : this.operating_status.equals(that.operating_status));
    equal = equal && (this.baidu_point == null ? that.baidu_point == null : this.baidu_point.equals(that.baidu_point));
    equal = equal && (this.google_point == null ? that.google_point == null : this.google_point.equals(that.google_point));
    equal = equal && (this.online_status == null ? that.online_status == null : this.online_status.equals(that.online_status));
    equal = equal && (this.one_sentence_commment == null ? that.one_sentence_commment == null : this.one_sentence_commment.equals(that.one_sentence_commment));
    equal = equal && (this.hotel_desc == null ? that.hotel_desc == null : this.hotel_desc.equals(that.hotel_desc));
    equal = equal && (this.attrs == null ? that.attrs == null : this.attrs.equals(that.attrs));
    equal = equal && (this.hotel_extend_info == null ? that.hotel_extend_info == null : this.hotel_extend_info.equals(that.hotel_extend_info));
    equal = equal && (this.city_pinyin == null ? that.city_pinyin == null : this.city_pinyin.equals(that.city_pinyin));
    equal = equal && (this.province_pinyin == null ? that.province_pinyin == null : this.province_pinyin.equals(that.province_pinyin));
    equal = equal && (this.bu == null ? that.bu == null : this.bu.equals(that.bu));
    equal = equal && (this.city_tags == null ? that.city_tags == null : this.city_tags.equals(that.city_tags));
    equal = equal && (this.onlinechannel == null ? that.onlinechannel == null : this.onlinechannel.equals(that.onlinechannel));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.stat_date = JdbcWritableBridge.readString(1, __dbResults);
    this.hotel_seq = JdbcWritableBridge.readString(2, __dbResults);
    this.hotel_id = JdbcWritableBridge.readString(3, __dbResults);
    this.hotel_name = JdbcWritableBridge.readString(4, __dbResults);
    this.city_code = JdbcWritableBridge.readString(5, __dbResults);
    this.city_ename = JdbcWritableBridge.readString(6, __dbResults);
    this.city_name = JdbcWritableBridge.readString(7, __dbResults);
    this.inter_region_code = JdbcWritableBridge.readString(8, __dbResults);
    this.province_ename = JdbcWritableBridge.readString(9, __dbResults);
    this.province_name = JdbcWritableBridge.readString(10, __dbResults);
    this.country_ename = JdbcWritableBridge.readString(11, __dbResults);
    this.country_name = JdbcWritableBridge.readString(12, __dbResults);
    this.hotel_area = JdbcWritableBridge.readString(13, __dbResults);
    this.hotel_trading_area = JdbcWritableBridge.readString(14, __dbResults);
    this.hotel_grade = JdbcWritableBridge.readString(15, __dbResults);
    this.hotel_star = JdbcWritableBridge.readString(16, __dbResults);
    this.hotel_type = JdbcWritableBridge.readString(17, __dbResults);
    this.hotel_brand_code = JdbcWritableBridge.readString(18, __dbResults);
    this.hotel_brand_name = JdbcWritableBridge.readString(19, __dbResults);
    this.hotel_group_id = JdbcWritableBridge.readString(20, __dbResults);
    this.hotel_group_name = JdbcWritableBridge.readString(21, __dbResults);
    this.hotel_addr = JdbcWritableBridge.readString(22, __dbResults);
    this.hotel_phone_number = JdbcWritableBridge.readString(23, __dbResults);
    this.operating_status = JdbcWritableBridge.readString(24, __dbResults);
    this.baidu_point = JdbcWritableBridge.readString(25, __dbResults);
    this.google_point = JdbcWritableBridge.readString(26, __dbResults);
    this.online_status = JdbcWritableBridge.readString(27, __dbResults);
    this.one_sentence_commment = JdbcWritableBridge.readString(28, __dbResults);
    this.hotel_desc = JdbcWritableBridge.readString(29, __dbResults);
    this.attrs = JdbcWritableBridge.readString(30, __dbResults);
    this.hotel_extend_info = JdbcWritableBridge.readString(31, __dbResults);
    this.city_pinyin = JdbcWritableBridge.readString(32, __dbResults);
    this.province_pinyin = JdbcWritableBridge.readString(33, __dbResults);
    this.bu = JdbcWritableBridge.readString(34, __dbResults);
    this.city_tags = JdbcWritableBridge.readString(35, __dbResults);
    this.onlinechannel = JdbcWritableBridge.readString(36, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.stat_date = JdbcWritableBridge.readString(1, __dbResults);
    this.hotel_seq = JdbcWritableBridge.readString(2, __dbResults);
    this.hotel_id = JdbcWritableBridge.readString(3, __dbResults);
    this.hotel_name = JdbcWritableBridge.readString(4, __dbResults);
    this.city_code = JdbcWritableBridge.readString(5, __dbResults);
    this.city_ename = JdbcWritableBridge.readString(6, __dbResults);
    this.city_name = JdbcWritableBridge.readString(7, __dbResults);
    this.inter_region_code = JdbcWritableBridge.readString(8, __dbResults);
    this.province_ename = JdbcWritableBridge.readString(9, __dbResults);
    this.province_name = JdbcWritableBridge.readString(10, __dbResults);
    this.country_ename = JdbcWritableBridge.readString(11, __dbResults);
    this.country_name = JdbcWritableBridge.readString(12, __dbResults);
    this.hotel_area = JdbcWritableBridge.readString(13, __dbResults);
    this.hotel_trading_area = JdbcWritableBridge.readString(14, __dbResults);
    this.hotel_grade = JdbcWritableBridge.readString(15, __dbResults);
    this.hotel_star = JdbcWritableBridge.readString(16, __dbResults);
    this.hotel_type = JdbcWritableBridge.readString(17, __dbResults);
    this.hotel_brand_code = JdbcWritableBridge.readString(18, __dbResults);
    this.hotel_brand_name = JdbcWritableBridge.readString(19, __dbResults);
    this.hotel_group_id = JdbcWritableBridge.readString(20, __dbResults);
    this.hotel_group_name = JdbcWritableBridge.readString(21, __dbResults);
    this.hotel_addr = JdbcWritableBridge.readString(22, __dbResults);
    this.hotel_phone_number = JdbcWritableBridge.readString(23, __dbResults);
    this.operating_status = JdbcWritableBridge.readString(24, __dbResults);
    this.baidu_point = JdbcWritableBridge.readString(25, __dbResults);
    this.google_point = JdbcWritableBridge.readString(26, __dbResults);
    this.online_status = JdbcWritableBridge.readString(27, __dbResults);
    this.one_sentence_commment = JdbcWritableBridge.readString(28, __dbResults);
    this.hotel_desc = JdbcWritableBridge.readString(29, __dbResults);
    this.attrs = JdbcWritableBridge.readString(30, __dbResults);
    this.hotel_extend_info = JdbcWritableBridge.readString(31, __dbResults);
    this.city_pinyin = JdbcWritableBridge.readString(32, __dbResults);
    this.province_pinyin = JdbcWritableBridge.readString(33, __dbResults);
    this.bu = JdbcWritableBridge.readString(34, __dbResults);
    this.city_tags = JdbcWritableBridge.readString(35, __dbResults);
    this.onlinechannel = JdbcWritableBridge.readString(36, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(stat_date, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_seq, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_ename, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_name, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(inter_region_code, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(province_ename, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(province_name, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country_ename, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country_name, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_area, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_trading_area, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_grade, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_star, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_type, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_brand_code, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_brand_name, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_group_id, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_group_name, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_addr, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_phone_number, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(operating_status, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(baidu_point, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(google_point, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(online_status, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(one_sentence_commment, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_desc, 29 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(attrs, 30 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(hotel_extend_info, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_pinyin, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(province_pinyin, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bu, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_tags, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(onlinechannel, 36 + __off, 12, __dbStmt);
    return 36;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(stat_date, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_seq, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_ename, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_name, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(inter_region_code, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(province_ename, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(province_name, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country_ename, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country_name, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_area, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_trading_area, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_grade, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_star, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_type, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_brand_code, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_brand_name, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_group_id, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_group_name, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_addr, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_phone_number, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(operating_status, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(baidu_point, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(google_point, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(online_status, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(one_sentence_commment, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_desc, 29 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(attrs, 30 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(hotel_extend_info, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_pinyin, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(province_pinyin, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bu, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_tags, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(onlinechannel, 36 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.stat_date = null;
    } else {
    this.stat_date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_seq = null;
    } else {
    this.hotel_seq = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_id = null;
    } else {
    this.hotel_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_name = null;
    } else {
    this.hotel_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city_code = null;
    } else {
    this.city_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city_ename = null;
    } else {
    this.city_ename = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city_name = null;
    } else {
    this.city_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.inter_region_code = null;
    } else {
    this.inter_region_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.province_ename = null;
    } else {
    this.province_ename = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.province_name = null;
    } else {
    this.province_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.country_ename = null;
    } else {
    this.country_ename = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.country_name = null;
    } else {
    this.country_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_area = null;
    } else {
    this.hotel_area = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_trading_area = null;
    } else {
    this.hotel_trading_area = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_grade = null;
    } else {
    this.hotel_grade = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_star = null;
    } else {
    this.hotel_star = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_type = null;
    } else {
    this.hotel_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_brand_code = null;
    } else {
    this.hotel_brand_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_brand_name = null;
    } else {
    this.hotel_brand_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_group_id = null;
    } else {
    this.hotel_group_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_group_name = null;
    } else {
    this.hotel_group_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_addr = null;
    } else {
    this.hotel_addr = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_phone_number = null;
    } else {
    this.hotel_phone_number = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.operating_status = null;
    } else {
    this.operating_status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.baidu_point = null;
    } else {
    this.baidu_point = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.google_point = null;
    } else {
    this.google_point = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.online_status = null;
    } else {
    this.online_status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.one_sentence_commment = null;
    } else {
    this.one_sentence_commment = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_desc = null;
    } else {
    this.hotel_desc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.attrs = null;
    } else {
    this.attrs = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_extend_info = null;
    } else {
    this.hotel_extend_info = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city_pinyin = null;
    } else {
    this.city_pinyin = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.province_pinyin = null;
    } else {
    this.province_pinyin = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bu = null;
    } else {
    this.bu = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city_tags = null;
    } else {
    this.city_tags = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.onlinechannel = null;
    } else {
    this.onlinechannel = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.stat_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stat_date);
    }
    if (null == this.hotel_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_seq);
    }
    if (null == this.hotel_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_id);
    }
    if (null == this.hotel_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_name);
    }
    if (null == this.city_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_code);
    }
    if (null == this.city_ename) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_ename);
    }
    if (null == this.city_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_name);
    }
    if (null == this.inter_region_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, inter_region_code);
    }
    if (null == this.province_ename) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province_ename);
    }
    if (null == this.province_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province_name);
    }
    if (null == this.country_ename) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country_ename);
    }
    if (null == this.country_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country_name);
    }
    if (null == this.hotel_area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_area);
    }
    if (null == this.hotel_trading_area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_trading_area);
    }
    if (null == this.hotel_grade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_grade);
    }
    if (null == this.hotel_star) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_star);
    }
    if (null == this.hotel_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_type);
    }
    if (null == this.hotel_brand_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_brand_code);
    }
    if (null == this.hotel_brand_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_brand_name);
    }
    if (null == this.hotel_group_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_group_id);
    }
    if (null == this.hotel_group_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_group_name);
    }
    if (null == this.hotel_addr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_addr);
    }
    if (null == this.hotel_phone_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_phone_number);
    }
    if (null == this.operating_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, operating_status);
    }
    if (null == this.baidu_point) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, baidu_point);
    }
    if (null == this.google_point) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, google_point);
    }
    if (null == this.online_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, online_status);
    }
    if (null == this.one_sentence_commment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, one_sentence_commment);
    }
    if (null == this.hotel_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_desc);
    }
    if (null == this.attrs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, attrs);
    }
    if (null == this.hotel_extend_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_extend_info);
    }
    if (null == this.city_pinyin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_pinyin);
    }
    if (null == this.province_pinyin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province_pinyin);
    }
    if (null == this.bu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bu);
    }
    if (null == this.city_tags) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_tags);
    }
    if (null == this.onlinechannel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, onlinechannel);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.stat_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stat_date);
    }
    if (null == this.hotel_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_seq);
    }
    if (null == this.hotel_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_id);
    }
    if (null == this.hotel_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_name);
    }
    if (null == this.city_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_code);
    }
    if (null == this.city_ename) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_ename);
    }
    if (null == this.city_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_name);
    }
    if (null == this.inter_region_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, inter_region_code);
    }
    if (null == this.province_ename) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province_ename);
    }
    if (null == this.province_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province_name);
    }
    if (null == this.country_ename) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country_ename);
    }
    if (null == this.country_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country_name);
    }
    if (null == this.hotel_area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_area);
    }
    if (null == this.hotel_trading_area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_trading_area);
    }
    if (null == this.hotel_grade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_grade);
    }
    if (null == this.hotel_star) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_star);
    }
    if (null == this.hotel_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_type);
    }
    if (null == this.hotel_brand_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_brand_code);
    }
    if (null == this.hotel_brand_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_brand_name);
    }
    if (null == this.hotel_group_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_group_id);
    }
    if (null == this.hotel_group_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_group_name);
    }
    if (null == this.hotel_addr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_addr);
    }
    if (null == this.hotel_phone_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_phone_number);
    }
    if (null == this.operating_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, operating_status);
    }
    if (null == this.baidu_point) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, baidu_point);
    }
    if (null == this.google_point) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, google_point);
    }
    if (null == this.online_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, online_status);
    }
    if (null == this.one_sentence_commment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, one_sentence_commment);
    }
    if (null == this.hotel_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_desc);
    }
    if (null == this.attrs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, attrs);
    }
    if (null == this.hotel_extend_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_extend_info);
    }
    if (null == this.city_pinyin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_pinyin);
    }
    if (null == this.province_pinyin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province_pinyin);
    }
    if (null == this.bu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bu);
    }
    if (null == this.city_tags) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_tags);
    }
    if (null == this.onlinechannel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, onlinechannel);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(stat_date==null?"null":stat_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_seq==null?"null":hotel_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_id==null?"null":hotel_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_name==null?"null":hotel_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_code==null?"null":city_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_ename==null?"null":city_ename, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_name==null?"null":city_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(inter_region_code==null?"null":inter_region_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(province_ename==null?"null":province_ename, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(province_name==null?"null":province_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country_ename==null?"null":country_ename, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country_name==null?"null":country_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_area==null?"null":hotel_area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_trading_area==null?"null":hotel_trading_area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_grade==null?"null":hotel_grade, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_star==null?"null":hotel_star, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_type==null?"null":hotel_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_brand_code==null?"null":hotel_brand_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_brand_name==null?"null":hotel_brand_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_group_id==null?"null":hotel_group_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_group_name==null?"null":hotel_group_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_addr==null?"null":hotel_addr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_phone_number==null?"null":hotel_phone_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(operating_status==null?"null":operating_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(baidu_point==null?"null":baidu_point, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(google_point==null?"null":google_point, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(online_status==null?"null":online_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(one_sentence_commment==null?"null":one_sentence_commment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_desc==null?"null":hotel_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(attrs==null?"null":attrs, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_extend_info==null?"null":hotel_extend_info, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_pinyin==null?"null":city_pinyin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(province_pinyin==null?"null":province_pinyin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bu==null?"null":bu, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_tags==null?"null":city_tags, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(onlinechannel==null?"null":onlinechannel, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(stat_date==null?"null":stat_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_seq==null?"null":hotel_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_id==null?"null":hotel_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_name==null?"null":hotel_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_code==null?"null":city_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_ename==null?"null":city_ename, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_name==null?"null":city_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(inter_region_code==null?"null":inter_region_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(province_ename==null?"null":province_ename, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(province_name==null?"null":province_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country_ename==null?"null":country_ename, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country_name==null?"null":country_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_area==null?"null":hotel_area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_trading_area==null?"null":hotel_trading_area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_grade==null?"null":hotel_grade, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_star==null?"null":hotel_star, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_type==null?"null":hotel_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_brand_code==null?"null":hotel_brand_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_brand_name==null?"null":hotel_brand_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_group_id==null?"null":hotel_group_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_group_name==null?"null":hotel_group_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_addr==null?"null":hotel_addr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_phone_number==null?"null":hotel_phone_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(operating_status==null?"null":operating_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(baidu_point==null?"null":baidu_point, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(google_point==null?"null":google_point, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(online_status==null?"null":online_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(one_sentence_commment==null?"null":one_sentence_commment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_desc==null?"null":hotel_desc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(attrs==null?"null":attrs, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_extend_info==null?"null":hotel_extend_info, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_pinyin==null?"null":city_pinyin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(province_pinyin==null?"null":province_pinyin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bu==null?"null":bu, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_tags==null?"null":city_tags, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(onlinechannel==null?"null":onlinechannel, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.stat_date = null; } else {
      this.stat_date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_seq = null; } else {
      this.hotel_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_id = null; } else {
      this.hotel_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_name = null; } else {
      this.hotel_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.city_code = null; } else {
      this.city_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.city_ename = null; } else {
      this.city_ename = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.city_name = null; } else {
      this.city_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.inter_region_code = null; } else {
      this.inter_region_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.province_ename = null; } else {
      this.province_ename = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.province_name = null; } else {
      this.province_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.country_ename = null; } else {
      this.country_ename = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.country_name = null; } else {
      this.country_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_area = null; } else {
      this.hotel_area = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_trading_area = null; } else {
      this.hotel_trading_area = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_grade = null; } else {
      this.hotel_grade = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_star = null; } else {
      this.hotel_star = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_type = null; } else {
      this.hotel_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_brand_code = null; } else {
      this.hotel_brand_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_brand_name = null; } else {
      this.hotel_brand_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_group_id = null; } else {
      this.hotel_group_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_group_name = null; } else {
      this.hotel_group_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_addr = null; } else {
      this.hotel_addr = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_phone_number = null; } else {
      this.hotel_phone_number = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.operating_status = null; } else {
      this.operating_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.baidu_point = null; } else {
      this.baidu_point = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.google_point = null; } else {
      this.google_point = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.online_status = null; } else {
      this.online_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.one_sentence_commment = null; } else {
      this.one_sentence_commment = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_desc = null; } else {
      this.hotel_desc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.attrs = null; } else {
      this.attrs = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_extend_info = null; } else {
      this.hotel_extend_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.city_pinyin = null; } else {
      this.city_pinyin = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.province_pinyin = null; } else {
      this.province_pinyin = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.bu = null; } else {
      this.bu = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.city_tags = null; } else {
      this.city_tags = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.onlinechannel = null; } else {
      this.onlinechannel = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.stat_date = null; } else {
      this.stat_date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_seq = null; } else {
      this.hotel_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_id = null; } else {
      this.hotel_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_name = null; } else {
      this.hotel_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.city_code = null; } else {
      this.city_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.city_ename = null; } else {
      this.city_ename = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.city_name = null; } else {
      this.city_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.inter_region_code = null; } else {
      this.inter_region_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.province_ename = null; } else {
      this.province_ename = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.province_name = null; } else {
      this.province_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.country_ename = null; } else {
      this.country_ename = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.country_name = null; } else {
      this.country_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_area = null; } else {
      this.hotel_area = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_trading_area = null; } else {
      this.hotel_trading_area = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_grade = null; } else {
      this.hotel_grade = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_star = null; } else {
      this.hotel_star = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_type = null; } else {
      this.hotel_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_brand_code = null; } else {
      this.hotel_brand_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_brand_name = null; } else {
      this.hotel_brand_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_group_id = null; } else {
      this.hotel_group_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_group_name = null; } else {
      this.hotel_group_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_addr = null; } else {
      this.hotel_addr = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_phone_number = null; } else {
      this.hotel_phone_number = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.operating_status = null; } else {
      this.operating_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.baidu_point = null; } else {
      this.baidu_point = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.google_point = null; } else {
      this.google_point = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.online_status = null; } else {
      this.online_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.one_sentence_commment = null; } else {
      this.one_sentence_commment = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_desc = null; } else {
      this.hotel_desc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.attrs = null; } else {
      this.attrs = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_extend_info = null; } else {
      this.hotel_extend_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.city_pinyin = null; } else {
      this.city_pinyin = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.province_pinyin = null; } else {
      this.province_pinyin = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.bu = null; } else {
      this.bu = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.city_tags = null; } else {
      this.city_tags = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.onlinechannel = null; } else {
      this.onlinechannel = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    dim_hotel_info o = (dim_hotel_info) super.clone();
    return o;
  }

  public void clone0(dim_hotel_info o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("stat_date", this.stat_date);
    __sqoop$field_map.put("hotel_seq", this.hotel_seq);
    __sqoop$field_map.put("hotel_id", this.hotel_id);
    __sqoop$field_map.put("hotel_name", this.hotel_name);
    __sqoop$field_map.put("city_code", this.city_code);
    __sqoop$field_map.put("city_ename", this.city_ename);
    __sqoop$field_map.put("city_name", this.city_name);
    __sqoop$field_map.put("inter_region_code", this.inter_region_code);
    __sqoop$field_map.put("province_ename", this.province_ename);
    __sqoop$field_map.put("province_name", this.province_name);
    __sqoop$field_map.put("country_ename", this.country_ename);
    __sqoop$field_map.put("country_name", this.country_name);
    __sqoop$field_map.put("hotel_area", this.hotel_area);
    __sqoop$field_map.put("hotel_trading_area", this.hotel_trading_area);
    __sqoop$field_map.put("hotel_grade", this.hotel_grade);
    __sqoop$field_map.put("hotel_star", this.hotel_star);
    __sqoop$field_map.put("hotel_type", this.hotel_type);
    __sqoop$field_map.put("hotel_brand_code", this.hotel_brand_code);
    __sqoop$field_map.put("hotel_brand_name", this.hotel_brand_name);
    __sqoop$field_map.put("hotel_group_id", this.hotel_group_id);
    __sqoop$field_map.put("hotel_group_name", this.hotel_group_name);
    __sqoop$field_map.put("hotel_addr", this.hotel_addr);
    __sqoop$field_map.put("hotel_phone_number", this.hotel_phone_number);
    __sqoop$field_map.put("operating_status", this.operating_status);
    __sqoop$field_map.put("baidu_point", this.baidu_point);
    __sqoop$field_map.put("google_point", this.google_point);
    __sqoop$field_map.put("online_status", this.online_status);
    __sqoop$field_map.put("one_sentence_commment", this.one_sentence_commment);
    __sqoop$field_map.put("hotel_desc", this.hotel_desc);
    __sqoop$field_map.put("attrs", this.attrs);
    __sqoop$field_map.put("hotel_extend_info", this.hotel_extend_info);
    __sqoop$field_map.put("city_pinyin", this.city_pinyin);
    __sqoop$field_map.put("province_pinyin", this.province_pinyin);
    __sqoop$field_map.put("bu", this.bu);
    __sqoop$field_map.put("city_tags", this.city_tags);
    __sqoop$field_map.put("onlinechannel", this.onlinechannel);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("stat_date", this.stat_date);
    __sqoop$field_map.put("hotel_seq", this.hotel_seq);
    __sqoop$field_map.put("hotel_id", this.hotel_id);
    __sqoop$field_map.put("hotel_name", this.hotel_name);
    __sqoop$field_map.put("city_code", this.city_code);
    __sqoop$field_map.put("city_ename", this.city_ename);
    __sqoop$field_map.put("city_name", this.city_name);
    __sqoop$field_map.put("inter_region_code", this.inter_region_code);
    __sqoop$field_map.put("province_ename", this.province_ename);
    __sqoop$field_map.put("province_name", this.province_name);
    __sqoop$field_map.put("country_ename", this.country_ename);
    __sqoop$field_map.put("country_name", this.country_name);
    __sqoop$field_map.put("hotel_area", this.hotel_area);
    __sqoop$field_map.put("hotel_trading_area", this.hotel_trading_area);
    __sqoop$field_map.put("hotel_grade", this.hotel_grade);
    __sqoop$field_map.put("hotel_star", this.hotel_star);
    __sqoop$field_map.put("hotel_type", this.hotel_type);
    __sqoop$field_map.put("hotel_brand_code", this.hotel_brand_code);
    __sqoop$field_map.put("hotel_brand_name", this.hotel_brand_name);
    __sqoop$field_map.put("hotel_group_id", this.hotel_group_id);
    __sqoop$field_map.put("hotel_group_name", this.hotel_group_name);
    __sqoop$field_map.put("hotel_addr", this.hotel_addr);
    __sqoop$field_map.put("hotel_phone_number", this.hotel_phone_number);
    __sqoop$field_map.put("operating_status", this.operating_status);
    __sqoop$field_map.put("baidu_point", this.baidu_point);
    __sqoop$field_map.put("google_point", this.google_point);
    __sqoop$field_map.put("online_status", this.online_status);
    __sqoop$field_map.put("one_sentence_commment", this.one_sentence_commment);
    __sqoop$field_map.put("hotel_desc", this.hotel_desc);
    __sqoop$field_map.put("attrs", this.attrs);
    __sqoop$field_map.put("hotel_extend_info", this.hotel_extend_info);
    __sqoop$field_map.put("city_pinyin", this.city_pinyin);
    __sqoop$field_map.put("province_pinyin", this.province_pinyin);
    __sqoop$field_map.put("bu", this.bu);
    __sqoop$field_map.put("city_tags", this.city_tags);
    __sqoop$field_map.put("onlinechannel", this.onlinechannel);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("stat_date".equals(__fieldName)) {
      this.stat_date = (String) __fieldVal;
    }
    else    if ("hotel_seq".equals(__fieldName)) {
      this.hotel_seq = (String) __fieldVal;
    }
    else    if ("hotel_id".equals(__fieldName)) {
      this.hotel_id = (String) __fieldVal;
    }
    else    if ("hotel_name".equals(__fieldName)) {
      this.hotel_name = (String) __fieldVal;
    }
    else    if ("city_code".equals(__fieldName)) {
      this.city_code = (String) __fieldVal;
    }
    else    if ("city_ename".equals(__fieldName)) {
      this.city_ename = (String) __fieldVal;
    }
    else    if ("city_name".equals(__fieldName)) {
      this.city_name = (String) __fieldVal;
    }
    else    if ("inter_region_code".equals(__fieldName)) {
      this.inter_region_code = (String) __fieldVal;
    }
    else    if ("province_ename".equals(__fieldName)) {
      this.province_ename = (String) __fieldVal;
    }
    else    if ("province_name".equals(__fieldName)) {
      this.province_name = (String) __fieldVal;
    }
    else    if ("country_ename".equals(__fieldName)) {
      this.country_ename = (String) __fieldVal;
    }
    else    if ("country_name".equals(__fieldName)) {
      this.country_name = (String) __fieldVal;
    }
    else    if ("hotel_area".equals(__fieldName)) {
      this.hotel_area = (String) __fieldVal;
    }
    else    if ("hotel_trading_area".equals(__fieldName)) {
      this.hotel_trading_area = (String) __fieldVal;
    }
    else    if ("hotel_grade".equals(__fieldName)) {
      this.hotel_grade = (String) __fieldVal;
    }
    else    if ("hotel_star".equals(__fieldName)) {
      this.hotel_star = (String) __fieldVal;
    }
    else    if ("hotel_type".equals(__fieldName)) {
      this.hotel_type = (String) __fieldVal;
    }
    else    if ("hotel_brand_code".equals(__fieldName)) {
      this.hotel_brand_code = (String) __fieldVal;
    }
    else    if ("hotel_brand_name".equals(__fieldName)) {
      this.hotel_brand_name = (String) __fieldVal;
    }
    else    if ("hotel_group_id".equals(__fieldName)) {
      this.hotel_group_id = (String) __fieldVal;
    }
    else    if ("hotel_group_name".equals(__fieldName)) {
      this.hotel_group_name = (String) __fieldVal;
    }
    else    if ("hotel_addr".equals(__fieldName)) {
      this.hotel_addr = (String) __fieldVal;
    }
    else    if ("hotel_phone_number".equals(__fieldName)) {
      this.hotel_phone_number = (String) __fieldVal;
    }
    else    if ("operating_status".equals(__fieldName)) {
      this.operating_status = (String) __fieldVal;
    }
    else    if ("baidu_point".equals(__fieldName)) {
      this.baidu_point = (String) __fieldVal;
    }
    else    if ("google_point".equals(__fieldName)) {
      this.google_point = (String) __fieldVal;
    }
    else    if ("online_status".equals(__fieldName)) {
      this.online_status = (String) __fieldVal;
    }
    else    if ("one_sentence_commment".equals(__fieldName)) {
      this.one_sentence_commment = (String) __fieldVal;
    }
    else    if ("hotel_desc".equals(__fieldName)) {
      this.hotel_desc = (String) __fieldVal;
    }
    else    if ("attrs".equals(__fieldName)) {
      this.attrs = (String) __fieldVal;
    }
    else    if ("hotel_extend_info".equals(__fieldName)) {
      this.hotel_extend_info = (String) __fieldVal;
    }
    else    if ("city_pinyin".equals(__fieldName)) {
      this.city_pinyin = (String) __fieldVal;
    }
    else    if ("province_pinyin".equals(__fieldName)) {
      this.province_pinyin = (String) __fieldVal;
    }
    else    if ("bu".equals(__fieldName)) {
      this.bu = (String) __fieldVal;
    }
    else    if ("city_tags".equals(__fieldName)) {
      this.city_tags = (String) __fieldVal;
    }
    else    if ("onlinechannel".equals(__fieldName)) {
      this.onlinechannel = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("stat_date".equals(__fieldName)) {
      this.stat_date = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_seq".equals(__fieldName)) {
      this.hotel_seq = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_id".equals(__fieldName)) {
      this.hotel_id = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_name".equals(__fieldName)) {
      this.hotel_name = (String) __fieldVal;
      return true;
    }
    else    if ("city_code".equals(__fieldName)) {
      this.city_code = (String) __fieldVal;
      return true;
    }
    else    if ("city_ename".equals(__fieldName)) {
      this.city_ename = (String) __fieldVal;
      return true;
    }
    else    if ("city_name".equals(__fieldName)) {
      this.city_name = (String) __fieldVal;
      return true;
    }
    else    if ("inter_region_code".equals(__fieldName)) {
      this.inter_region_code = (String) __fieldVal;
      return true;
    }
    else    if ("province_ename".equals(__fieldName)) {
      this.province_ename = (String) __fieldVal;
      return true;
    }
    else    if ("province_name".equals(__fieldName)) {
      this.province_name = (String) __fieldVal;
      return true;
    }
    else    if ("country_ename".equals(__fieldName)) {
      this.country_ename = (String) __fieldVal;
      return true;
    }
    else    if ("country_name".equals(__fieldName)) {
      this.country_name = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_area".equals(__fieldName)) {
      this.hotel_area = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_trading_area".equals(__fieldName)) {
      this.hotel_trading_area = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_grade".equals(__fieldName)) {
      this.hotel_grade = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_star".equals(__fieldName)) {
      this.hotel_star = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_type".equals(__fieldName)) {
      this.hotel_type = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_brand_code".equals(__fieldName)) {
      this.hotel_brand_code = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_brand_name".equals(__fieldName)) {
      this.hotel_brand_name = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_group_id".equals(__fieldName)) {
      this.hotel_group_id = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_group_name".equals(__fieldName)) {
      this.hotel_group_name = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_addr".equals(__fieldName)) {
      this.hotel_addr = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_phone_number".equals(__fieldName)) {
      this.hotel_phone_number = (String) __fieldVal;
      return true;
    }
    else    if ("operating_status".equals(__fieldName)) {
      this.operating_status = (String) __fieldVal;
      return true;
    }
    else    if ("baidu_point".equals(__fieldName)) {
      this.baidu_point = (String) __fieldVal;
      return true;
    }
    else    if ("google_point".equals(__fieldName)) {
      this.google_point = (String) __fieldVal;
      return true;
    }
    else    if ("online_status".equals(__fieldName)) {
      this.online_status = (String) __fieldVal;
      return true;
    }
    else    if ("one_sentence_commment".equals(__fieldName)) {
      this.one_sentence_commment = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_desc".equals(__fieldName)) {
      this.hotel_desc = (String) __fieldVal;
      return true;
    }
    else    if ("attrs".equals(__fieldName)) {
      this.attrs = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_extend_info".equals(__fieldName)) {
      this.hotel_extend_info = (String) __fieldVal;
      return true;
    }
    else    if ("city_pinyin".equals(__fieldName)) {
      this.city_pinyin = (String) __fieldVal;
      return true;
    }
    else    if ("province_pinyin".equals(__fieldName)) {
      this.province_pinyin = (String) __fieldVal;
      return true;
    }
    else    if ("bu".equals(__fieldName)) {
      this.bu = (String) __fieldVal;
      return true;
    }
    else    if ("city_tags".equals(__fieldName)) {
      this.city_tags = (String) __fieldVal;
      return true;
    }
    else    if ("onlinechannel".equals(__fieldName)) {
      this.onlinechannel = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
