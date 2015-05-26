// ORM class for table 'dwd_pty_hotel_his_da'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Mar 03 01:21:05 CST 2015
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

public class dwd_pty_hotel_his_da extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String hotel_seq;
  public String get_hotel_seq() {
    return hotel_seq;
  }
  public void set_hotel_seq(String hotel_seq) {
    this.hotel_seq = hotel_seq;
  }
  public dwd_pty_hotel_his_da with_hotel_seq(String hotel_seq) {
    this.hotel_seq = hotel_seq;
    return this;
  }
  private String hotel_city_code;
  public String get_hotel_city_code() {
    return hotel_city_code;
  }
  public void set_hotel_city_code(String hotel_city_code) {
    this.hotel_city_code = hotel_city_code;
  }
  public dwd_pty_hotel_his_da with_hotel_city_code(String hotel_city_code) {
    this.hotel_city_code = hotel_city_code;
    return this;
  }
  private String hotel_city_name;
  public String get_hotel_city_name() {
    return hotel_city_name;
  }
  public void set_hotel_city_name(String hotel_city_name) {
    this.hotel_city_name = hotel_city_name;
  }
  public dwd_pty_hotel_his_da with_hotel_city_name(String hotel_city_name) {
    this.hotel_city_name = hotel_city_name;
    return this;
  }
  private String hotel_name;
  public String get_hotel_name() {
    return hotel_name;
  }
  public void set_hotel_name(String hotel_name) {
    this.hotel_name = hotel_name;
  }
  public dwd_pty_hotel_his_da with_hotel_name(String hotel_name) {
    this.hotel_name = hotel_name;
    return this;
  }
  private String hotel_address;
  public String get_hotel_address() {
    return hotel_address;
  }
  public void set_hotel_address(String hotel_address) {
    this.hotel_address = hotel_address;
  }
  public dwd_pty_hotel_his_da with_hotel_address(String hotel_address) {
    this.hotel_address = hotel_address;
    return this;
  }
  private String hotel_area;
  public String get_hotel_area() {
    return hotel_area;
  }
  public void set_hotel_area(String hotel_area) {
    this.hotel_area = hotel_area;
  }
  public dwd_pty_hotel_his_da with_hotel_area(String hotel_area) {
    this.hotel_area = hotel_area;
    return this;
  }
  private Integer hotel_star;
  public Integer get_hotel_star() {
    return hotel_star;
  }
  public void set_hotel_star(Integer hotel_star) {
    this.hotel_star = hotel_star;
  }
  public dwd_pty_hotel_his_da with_hotel_star(Integer hotel_star) {
    this.hotel_star = hotel_star;
    return this;
  }
  private Integer hotel_grade;
  public Integer get_hotel_grade() {
    return hotel_grade;
  }
  public void set_hotel_grade(Integer hotel_grade) {
    this.hotel_grade = hotel_grade;
  }
  public dwd_pty_hotel_his_da with_hotel_grade(Integer hotel_grade) {
    this.hotel_grade = hotel_grade;
    return this;
  }
  private String hotel_brand;
  public String get_hotel_brand() {
    return hotel_brand;
  }
  public void set_hotel_brand(String hotel_brand) {
    this.hotel_brand = hotel_brand;
  }
  public dwd_pty_hotel_his_da with_hotel_brand(String hotel_brand) {
    this.hotel_brand = hotel_brand;
    return this;
  }
  private String hotel_phone_number;
  public String get_hotel_phone_number() {
    return hotel_phone_number;
  }
  public void set_hotel_phone_number(String hotel_phone_number) {
    this.hotel_phone_number = hotel_phone_number;
  }
  public dwd_pty_hotel_his_da with_hotel_phone_number(String hotel_phone_number) {
    this.hotel_phone_number = hotel_phone_number;
    return this;
  }
  private String hotel_baidu_point;
  public String get_hotel_baidu_point() {
    return hotel_baidu_point;
  }
  public void set_hotel_baidu_point(String hotel_baidu_point) {
    this.hotel_baidu_point = hotel_baidu_point;
  }
  public dwd_pty_hotel_his_da with_hotel_baidu_point(String hotel_baidu_point) {
    this.hotel_baidu_point = hotel_baidu_point;
    return this;
  }
  private String hotel_google_point;
  public String get_hotel_google_point() {
    return hotel_google_point;
  }
  public void set_hotel_google_point(String hotel_google_point) {
    this.hotel_google_point = hotel_google_point;
  }
  public dwd_pty_hotel_his_da with_hotel_google_point(String hotel_google_point) {
    this.hotel_google_point = hotel_google_point;
    return this;
  }
  private String hotel_abcd_grade;
  public String get_hotel_abcd_grade() {
    return hotel_abcd_grade;
  }
  public void set_hotel_abcd_grade(String hotel_abcd_grade) {
    this.hotel_abcd_grade = hotel_abcd_grade;
  }
  public dwd_pty_hotel_his_da with_hotel_abcd_grade(String hotel_abcd_grade) {
    this.hotel_abcd_grade = hotel_abcd_grade;
    return this;
  }
  private Integer operating_status;
  public Integer get_operating_status() {
    return operating_status;
  }
  public void set_operating_status(Integer operating_status) {
    this.operating_status = operating_status;
  }
  public dwd_pty_hotel_his_da with_operating_status(Integer operating_status) {
    this.operating_status = operating_status;
    return this;
  }
  private String hotel_types;
  public String get_hotel_types() {
    return hotel_types;
  }
  public void set_hotel_types(String hotel_types) {
    this.hotel_types = hotel_types;
  }
  public dwd_pty_hotel_his_da with_hotel_types(String hotel_types) {
    this.hotel_types = hotel_types;
    return this;
  }
  private String hotel_trading_areas;
  public String get_hotel_trading_areas() {
    return hotel_trading_areas;
  }
  public void set_hotel_trading_areas(String hotel_trading_areas) {
    this.hotel_trading_areas = hotel_trading_areas;
  }
  public dwd_pty_hotel_his_da with_hotel_trading_areas(String hotel_trading_areas) {
    this.hotel_trading_areas = hotel_trading_areas;
    return this;
  }
  private Integer online_status;
  public Integer get_online_status() {
    return online_status;
  }
  public void set_online_status(Integer online_status) {
    this.online_status = online_status;
  }
  public dwd_pty_hotel_his_da with_online_status(Integer online_status) {
    this.online_status = online_status;
    return this;
  }
  private Integer hotel_level;
  public Integer get_hotel_level() {
    return hotel_level;
  }
  public void set_hotel_level(Integer hotel_level) {
    this.hotel_level = hotel_level;
  }
  public dwd_pty_hotel_his_da with_hotel_level(Integer hotel_level) {
    this.hotel_level = hotel_level;
    return this;
  }
  private String last_modify_time;
  public String get_last_modify_time() {
    return last_modify_time;
  }
  public void set_last_modify_time(String last_modify_time) {
    this.last_modify_time = last_modify_time;
  }
  public dwd_pty_hotel_his_da with_last_modify_time(String last_modify_time) {
    this.last_modify_time = last_modify_time;
    return this;
  }
  private Boolean is_inland_flag;
  public Boolean get_is_inland_flag() {
    return is_inland_flag;
  }
  public void set_is_inland_flag(Boolean is_inland_flag) {
    this.is_inland_flag = is_inland_flag;
  }
  public dwd_pty_hotel_his_da with_is_inland_flag(Boolean is_inland_flag) {
    this.is_inland_flag = is_inland_flag;
    return this;
  }
  private java.math.BigDecimal hotel_score;
  public java.math.BigDecimal get_hotel_score() {
    return hotel_score;
  }
  public void set_hotel_score(java.math.BigDecimal hotel_score) {
    this.hotel_score = hotel_score;
  }
  public dwd_pty_hotel_his_da with_hotel_score(java.math.BigDecimal hotel_score) {
    this.hotel_score = hotel_score;
    return this;
  }
  private java.math.BigDecimal hotel_formatted_score;
  public java.math.BigDecimal get_hotel_formatted_score() {
    return hotel_formatted_score;
  }
  public void set_hotel_formatted_score(java.math.BigDecimal hotel_formatted_score) {
    this.hotel_formatted_score = hotel_formatted_score;
  }
  public dwd_pty_hotel_his_da with_hotel_formatted_score(java.math.BigDecimal hotel_formatted_score) {
    this.hotel_formatted_score = hotel_formatted_score;
    return this;
  }
  private Integer comment_cnt;
  public Integer get_comment_cnt() {
    return comment_cnt;
  }
  public void set_comment_cnt(Integer comment_cnt) {
    this.comment_cnt = comment_cnt;
  }
  public dwd_pty_hotel_his_da with_comment_cnt(Integer comment_cnt) {
    this.comment_cnt = comment_cnt;
    return this;
  }
  private String des_trading_areas;
  public String get_des_trading_areas() {
    return des_trading_areas;
  }
  public void set_des_trading_areas(String des_trading_areas) {
    this.des_trading_areas = des_trading_areas;
  }
  public dwd_pty_hotel_his_da with_des_trading_areas(String des_trading_areas) {
    this.des_trading_areas = des_trading_areas;
    return this;
  }
  private java.sql.Date effective_start_date;
  public java.sql.Date get_effective_start_date() {
    return effective_start_date;
  }
  public void set_effective_start_date(java.sql.Date effective_start_date) {
    this.effective_start_date = effective_start_date;
  }
  public dwd_pty_hotel_his_da with_effective_start_date(java.sql.Date effective_start_date) {
    this.effective_start_date = effective_start_date;
    return this;
  }
  private java.sql.Date effective_end_date;
  public java.sql.Date get_effective_end_date() {
    return effective_end_date;
  }
  public void set_effective_end_date(java.sql.Date effective_end_date) {
    this.effective_end_date = effective_end_date;
  }
  public dwd_pty_hotel_his_da with_effective_end_date(java.sql.Date effective_end_date) {
    this.effective_end_date = effective_end_date;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dwd_pty_hotel_his_da)) {
      return false;
    }
    dwd_pty_hotel_his_da that = (dwd_pty_hotel_his_da) o;
    boolean equal = true;
    equal = equal && (this.hotel_seq == null ? that.hotel_seq == null : this.hotel_seq.equals(that.hotel_seq));
    equal = equal && (this.hotel_city_code == null ? that.hotel_city_code == null : this.hotel_city_code.equals(that.hotel_city_code));
    equal = equal && (this.hotel_city_name == null ? that.hotel_city_name == null : this.hotel_city_name.equals(that.hotel_city_name));
    equal = equal && (this.hotel_name == null ? that.hotel_name == null : this.hotel_name.equals(that.hotel_name));
    equal = equal && (this.hotel_address == null ? that.hotel_address == null : this.hotel_address.equals(that.hotel_address));
    equal = equal && (this.hotel_area == null ? that.hotel_area == null : this.hotel_area.equals(that.hotel_area));
    equal = equal && (this.hotel_star == null ? that.hotel_star == null : this.hotel_star.equals(that.hotel_star));
    equal = equal && (this.hotel_grade == null ? that.hotel_grade == null : this.hotel_grade.equals(that.hotel_grade));
    equal = equal && (this.hotel_brand == null ? that.hotel_brand == null : this.hotel_brand.equals(that.hotel_brand));
    equal = equal && (this.hotel_phone_number == null ? that.hotel_phone_number == null : this.hotel_phone_number.equals(that.hotel_phone_number));
    equal = equal && (this.hotel_baidu_point == null ? that.hotel_baidu_point == null : this.hotel_baidu_point.equals(that.hotel_baidu_point));
    equal = equal && (this.hotel_google_point == null ? that.hotel_google_point == null : this.hotel_google_point.equals(that.hotel_google_point));
    equal = equal && (this.hotel_abcd_grade == null ? that.hotel_abcd_grade == null : this.hotel_abcd_grade.equals(that.hotel_abcd_grade));
    equal = equal && (this.operating_status == null ? that.operating_status == null : this.operating_status.equals(that.operating_status));
    equal = equal && (this.hotel_types == null ? that.hotel_types == null : this.hotel_types.equals(that.hotel_types));
    equal = equal && (this.hotel_trading_areas == null ? that.hotel_trading_areas == null : this.hotel_trading_areas.equals(that.hotel_trading_areas));
    equal = equal && (this.online_status == null ? that.online_status == null : this.online_status.equals(that.online_status));
    equal = equal && (this.hotel_level == null ? that.hotel_level == null : this.hotel_level.equals(that.hotel_level));
    equal = equal && (this.last_modify_time == null ? that.last_modify_time == null : this.last_modify_time.equals(that.last_modify_time));
    equal = equal && (this.is_inland_flag == null ? that.is_inland_flag == null : this.is_inland_flag.equals(that.is_inland_flag));
    equal = equal && (this.hotel_score == null ? that.hotel_score == null : this.hotel_score.equals(that.hotel_score));
    equal = equal && (this.hotel_formatted_score == null ? that.hotel_formatted_score == null : this.hotel_formatted_score.equals(that.hotel_formatted_score));
    equal = equal && (this.comment_cnt == null ? that.comment_cnt == null : this.comment_cnt.equals(that.comment_cnt));
    equal = equal && (this.des_trading_areas == null ? that.des_trading_areas == null : this.des_trading_areas.equals(that.des_trading_areas));
    equal = equal && (this.effective_start_date == null ? that.effective_start_date == null : this.effective_start_date.equals(that.effective_start_date));
    equal = equal && (this.effective_end_date == null ? that.effective_end_date == null : this.effective_end_date.equals(that.effective_end_date));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dwd_pty_hotel_his_da)) {
      return false;
    }
    dwd_pty_hotel_his_da that = (dwd_pty_hotel_his_da) o;
    boolean equal = true;
    equal = equal && (this.hotel_seq == null ? that.hotel_seq == null : this.hotel_seq.equals(that.hotel_seq));
    equal = equal && (this.hotel_city_code == null ? that.hotel_city_code == null : this.hotel_city_code.equals(that.hotel_city_code));
    equal = equal && (this.hotel_city_name == null ? that.hotel_city_name == null : this.hotel_city_name.equals(that.hotel_city_name));
    equal = equal && (this.hotel_name == null ? that.hotel_name == null : this.hotel_name.equals(that.hotel_name));
    equal = equal && (this.hotel_address == null ? that.hotel_address == null : this.hotel_address.equals(that.hotel_address));
    equal = equal && (this.hotel_area == null ? that.hotel_area == null : this.hotel_area.equals(that.hotel_area));
    equal = equal && (this.hotel_star == null ? that.hotel_star == null : this.hotel_star.equals(that.hotel_star));
    equal = equal && (this.hotel_grade == null ? that.hotel_grade == null : this.hotel_grade.equals(that.hotel_grade));
    equal = equal && (this.hotel_brand == null ? that.hotel_brand == null : this.hotel_brand.equals(that.hotel_brand));
    equal = equal && (this.hotel_phone_number == null ? that.hotel_phone_number == null : this.hotel_phone_number.equals(that.hotel_phone_number));
    equal = equal && (this.hotel_baidu_point == null ? that.hotel_baidu_point == null : this.hotel_baidu_point.equals(that.hotel_baidu_point));
    equal = equal && (this.hotel_google_point == null ? that.hotel_google_point == null : this.hotel_google_point.equals(that.hotel_google_point));
    equal = equal && (this.hotel_abcd_grade == null ? that.hotel_abcd_grade == null : this.hotel_abcd_grade.equals(that.hotel_abcd_grade));
    equal = equal && (this.operating_status == null ? that.operating_status == null : this.operating_status.equals(that.operating_status));
    equal = equal && (this.hotel_types == null ? that.hotel_types == null : this.hotel_types.equals(that.hotel_types));
    equal = equal && (this.hotel_trading_areas == null ? that.hotel_trading_areas == null : this.hotel_trading_areas.equals(that.hotel_trading_areas));
    equal = equal && (this.online_status == null ? that.online_status == null : this.online_status.equals(that.online_status));
    equal = equal && (this.hotel_level == null ? that.hotel_level == null : this.hotel_level.equals(that.hotel_level));
    equal = equal && (this.last_modify_time == null ? that.last_modify_time == null : this.last_modify_time.equals(that.last_modify_time));
    equal = equal && (this.is_inland_flag == null ? that.is_inland_flag == null : this.is_inland_flag.equals(that.is_inland_flag));
    equal = equal && (this.hotel_score == null ? that.hotel_score == null : this.hotel_score.equals(that.hotel_score));
    equal = equal && (this.hotel_formatted_score == null ? that.hotel_formatted_score == null : this.hotel_formatted_score.equals(that.hotel_formatted_score));
    equal = equal && (this.comment_cnt == null ? that.comment_cnt == null : this.comment_cnt.equals(that.comment_cnt));
    equal = equal && (this.des_trading_areas == null ? that.des_trading_areas == null : this.des_trading_areas.equals(that.des_trading_areas));
    equal = equal && (this.effective_start_date == null ? that.effective_start_date == null : this.effective_start_date.equals(that.effective_start_date));
    equal = equal && (this.effective_end_date == null ? that.effective_end_date == null : this.effective_end_date.equals(that.effective_end_date));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.hotel_seq = JdbcWritableBridge.readString(1, __dbResults);
    this.hotel_city_code = JdbcWritableBridge.readString(2, __dbResults);
    this.hotel_city_name = JdbcWritableBridge.readString(3, __dbResults);
    this.hotel_name = JdbcWritableBridge.readString(4, __dbResults);
    this.hotel_address = JdbcWritableBridge.readString(5, __dbResults);
    this.hotel_area = JdbcWritableBridge.readString(6, __dbResults);
    this.hotel_star = JdbcWritableBridge.readInteger(7, __dbResults);
    this.hotel_grade = JdbcWritableBridge.readInteger(8, __dbResults);
    this.hotel_brand = JdbcWritableBridge.readString(9, __dbResults);
    this.hotel_phone_number = JdbcWritableBridge.readString(10, __dbResults);
    this.hotel_baidu_point = JdbcWritableBridge.readString(11, __dbResults);
    this.hotel_google_point = JdbcWritableBridge.readString(12, __dbResults);
    this.hotel_abcd_grade = JdbcWritableBridge.readString(13, __dbResults);
    this.operating_status = JdbcWritableBridge.readInteger(14, __dbResults);
    this.hotel_types = JdbcWritableBridge.readString(15, __dbResults);
    this.hotel_trading_areas = JdbcWritableBridge.readString(16, __dbResults);
    this.online_status = JdbcWritableBridge.readInteger(17, __dbResults);
    this.hotel_level = JdbcWritableBridge.readInteger(18, __dbResults);
    this.last_modify_time = JdbcWritableBridge.readString(19, __dbResults);
    this.is_inland_flag = JdbcWritableBridge.readBoolean(20, __dbResults);
    this.hotel_score = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.hotel_formatted_score = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.comment_cnt = JdbcWritableBridge.readInteger(23, __dbResults);
    this.des_trading_areas = JdbcWritableBridge.readString(24, __dbResults);
    this.effective_start_date = JdbcWritableBridge.readDate(25, __dbResults);
    this.effective_end_date = JdbcWritableBridge.readDate(26, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.hotel_seq = JdbcWritableBridge.readString(1, __dbResults);
    this.hotel_city_code = JdbcWritableBridge.readString(2, __dbResults);
    this.hotel_city_name = JdbcWritableBridge.readString(3, __dbResults);
    this.hotel_name = JdbcWritableBridge.readString(4, __dbResults);
    this.hotel_address = JdbcWritableBridge.readString(5, __dbResults);
    this.hotel_area = JdbcWritableBridge.readString(6, __dbResults);
    this.hotel_star = JdbcWritableBridge.readInteger(7, __dbResults);
    this.hotel_grade = JdbcWritableBridge.readInteger(8, __dbResults);
    this.hotel_brand = JdbcWritableBridge.readString(9, __dbResults);
    this.hotel_phone_number = JdbcWritableBridge.readString(10, __dbResults);
    this.hotel_baidu_point = JdbcWritableBridge.readString(11, __dbResults);
    this.hotel_google_point = JdbcWritableBridge.readString(12, __dbResults);
    this.hotel_abcd_grade = JdbcWritableBridge.readString(13, __dbResults);
    this.operating_status = JdbcWritableBridge.readInteger(14, __dbResults);
    this.hotel_types = JdbcWritableBridge.readString(15, __dbResults);
    this.hotel_trading_areas = JdbcWritableBridge.readString(16, __dbResults);
    this.online_status = JdbcWritableBridge.readInteger(17, __dbResults);
    this.hotel_level = JdbcWritableBridge.readInteger(18, __dbResults);
    this.last_modify_time = JdbcWritableBridge.readString(19, __dbResults);
    this.is_inland_flag = JdbcWritableBridge.readBoolean(20, __dbResults);
    this.hotel_score = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.hotel_formatted_score = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.comment_cnt = JdbcWritableBridge.readInteger(23, __dbResults);
    this.des_trading_areas = JdbcWritableBridge.readString(24, __dbResults);
    this.effective_start_date = JdbcWritableBridge.readDate(25, __dbResults);
    this.effective_end_date = JdbcWritableBridge.readDate(26, __dbResults);
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
    JdbcWritableBridge.writeString(hotel_seq, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_city_code, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_city_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_address, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_area, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(hotel_star, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(hotel_grade, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(hotel_brand, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_phone_number, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_baidu_point, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_google_point, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_abcd_grade, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(operating_status, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(hotel_types, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_trading_areas, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(online_status, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(hotel_level, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(last_modify_time, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_inland_flag, 20 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(hotel_score, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(hotel_formatted_score, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(comment_cnt, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(des_trading_areas, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(effective_start_date, 25 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(effective_end_date, 26 + __off, 91, __dbStmt);
    return 26;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(hotel_seq, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_city_code, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_city_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_address, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_area, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(hotel_star, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(hotel_grade, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(hotel_brand, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_phone_number, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_baidu_point, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_google_point, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_abcd_grade, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(operating_status, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(hotel_types, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_trading_areas, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(online_status, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(hotel_level, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(last_modify_time, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_inland_flag, 20 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(hotel_score, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(hotel_formatted_score, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(comment_cnt, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(des_trading_areas, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(effective_start_date, 25 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(effective_end_date, 26 + __off, 91, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.hotel_seq = null;
    } else {
    this.hotel_seq = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_city_code = null;
    } else {
    this.hotel_city_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_city_name = null;
    } else {
    this.hotel_city_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_name = null;
    } else {
    this.hotel_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_address = null;
    } else {
    this.hotel_address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_area = null;
    } else {
    this.hotel_area = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_star = null;
    } else {
    this.hotel_star = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_grade = null;
    } else {
    this.hotel_grade = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_brand = null;
    } else {
    this.hotel_brand = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_phone_number = null;
    } else {
    this.hotel_phone_number = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_baidu_point = null;
    } else {
    this.hotel_baidu_point = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_google_point = null;
    } else {
    this.hotel_google_point = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_abcd_grade = null;
    } else {
    this.hotel_abcd_grade = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.operating_status = null;
    } else {
    this.operating_status = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_types = null;
    } else {
    this.hotel_types = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_trading_areas = null;
    } else {
    this.hotel_trading_areas = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.online_status = null;
    } else {
    this.online_status = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_level = null;
    } else {
    this.hotel_level = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.last_modify_time = null;
    } else {
    this.last_modify_time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.is_inland_flag = null;
    } else {
    this.is_inland_flag = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_score = null;
    } else {
    this.hotel_score = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_formatted_score = null;
    } else {
    this.hotel_formatted_score = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.comment_cnt = null;
    } else {
    this.comment_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.des_trading_areas = null;
    } else {
    this.des_trading_areas = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.effective_start_date = null;
    } else {
    this.effective_start_date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.effective_end_date = null;
    } else {
    this.effective_end_date = new Date(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.hotel_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_seq);
    }
    if (null == this.hotel_city_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_city_code);
    }
    if (null == this.hotel_city_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_city_name);
    }
    if (null == this.hotel_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_name);
    }
    if (null == this.hotel_address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_address);
    }
    if (null == this.hotel_area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_area);
    }
    if (null == this.hotel_star) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hotel_star);
    }
    if (null == this.hotel_grade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hotel_grade);
    }
    if (null == this.hotel_brand) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_brand);
    }
    if (null == this.hotel_phone_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_phone_number);
    }
    if (null == this.hotel_baidu_point) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_baidu_point);
    }
    if (null == this.hotel_google_point) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_google_point);
    }
    if (null == this.hotel_abcd_grade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_abcd_grade);
    }
    if (null == this.operating_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.operating_status);
    }
    if (null == this.hotel_types) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_types);
    }
    if (null == this.hotel_trading_areas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_trading_areas);
    }
    if (null == this.online_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.online_status);
    }
    if (null == this.hotel_level) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hotel_level);
    }
    if (null == this.last_modify_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, last_modify_time);
    }
    if (null == this.is_inland_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.is_inland_flag);
    }
    if (null == this.hotel_score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.hotel_score, __dataOut);
    }
    if (null == this.hotel_formatted_score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.hotel_formatted_score, __dataOut);
    }
    if (null == this.comment_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.comment_cnt);
    }
    if (null == this.des_trading_areas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, des_trading_areas);
    }
    if (null == this.effective_start_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.effective_start_date.getTime());
    }
    if (null == this.effective_end_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.effective_end_date.getTime());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.hotel_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_seq);
    }
    if (null == this.hotel_city_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_city_code);
    }
    if (null == this.hotel_city_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_city_name);
    }
    if (null == this.hotel_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_name);
    }
    if (null == this.hotel_address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_address);
    }
    if (null == this.hotel_area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_area);
    }
    if (null == this.hotel_star) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hotel_star);
    }
    if (null == this.hotel_grade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hotel_grade);
    }
    if (null == this.hotel_brand) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_brand);
    }
    if (null == this.hotel_phone_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_phone_number);
    }
    if (null == this.hotel_baidu_point) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_baidu_point);
    }
    if (null == this.hotel_google_point) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_google_point);
    }
    if (null == this.hotel_abcd_grade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_abcd_grade);
    }
    if (null == this.operating_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.operating_status);
    }
    if (null == this.hotel_types) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_types);
    }
    if (null == this.hotel_trading_areas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_trading_areas);
    }
    if (null == this.online_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.online_status);
    }
    if (null == this.hotel_level) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hotel_level);
    }
    if (null == this.last_modify_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, last_modify_time);
    }
    if (null == this.is_inland_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.is_inland_flag);
    }
    if (null == this.hotel_score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.hotel_score, __dataOut);
    }
    if (null == this.hotel_formatted_score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.hotel_formatted_score, __dataOut);
    }
    if (null == this.comment_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.comment_cnt);
    }
    if (null == this.des_trading_areas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, des_trading_areas);
    }
    if (null == this.effective_start_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.effective_start_date.getTime());
    }
    if (null == this.effective_end_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.effective_end_date.getTime());
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
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_seq==null?"null":hotel_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_city_code==null?"null":hotel_city_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_city_name==null?"null":hotel_city_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_name==null?"null":hotel_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_address==null?"null":hotel_address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_area==null?"null":hotel_area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_star==null?"null":"" + hotel_star, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_grade==null?"null":"" + hotel_grade, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_brand==null?"null":hotel_brand, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_phone_number==null?"null":hotel_phone_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_baidu_point==null?"null":hotel_baidu_point, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_google_point==null?"null":hotel_google_point, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_abcd_grade==null?"null":hotel_abcd_grade, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(operating_status==null?"null":"" + operating_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_types==null?"null":hotel_types, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_trading_areas==null?"null":hotel_trading_areas, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(online_status==null?"null":"" + online_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_level==null?"null":"" + hotel_level, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_modify_time==null?"null":last_modify_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_inland_flag==null?"null":"" + is_inland_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_score==null?"null":hotel_score.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_formatted_score==null?"null":hotel_formatted_score.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(comment_cnt==null?"null":"" + comment_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(des_trading_areas==null?"null":des_trading_areas, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(effective_start_date==null?"null":"" + effective_start_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(effective_end_date==null?"null":"" + effective_end_date, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_seq==null?"null":hotel_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_city_code==null?"null":hotel_city_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_city_name==null?"null":hotel_city_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_name==null?"null":hotel_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_address==null?"null":hotel_address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_area==null?"null":hotel_area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_star==null?"null":"" + hotel_star, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_grade==null?"null":"" + hotel_grade, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_brand==null?"null":hotel_brand, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_phone_number==null?"null":hotel_phone_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_baidu_point==null?"null":hotel_baidu_point, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_google_point==null?"null":hotel_google_point, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_abcd_grade==null?"null":hotel_abcd_grade, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(operating_status==null?"null":"" + operating_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_types==null?"null":hotel_types, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_trading_areas==null?"null":hotel_trading_areas, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(online_status==null?"null":"" + online_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_level==null?"null":"" + hotel_level, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_modify_time==null?"null":last_modify_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_inland_flag==null?"null":"" + is_inland_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_score==null?"null":hotel_score.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_formatted_score==null?"null":hotel_formatted_score.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(comment_cnt==null?"null":"" + comment_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(des_trading_areas==null?"null":des_trading_areas, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(effective_start_date==null?"null":"" + effective_start_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(effective_end_date==null?"null":"" + effective_end_date, delimiters));
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
    if (__cur_str.equals("\\N")) { this.hotel_seq = null; } else {
      this.hotel_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_city_code = null; } else {
      this.hotel_city_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_city_name = null; } else {
      this.hotel_city_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_name = null; } else {
      this.hotel_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_address = null; } else {
      this.hotel_address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_area = null; } else {
      this.hotel_area = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.hotel_star = null; } else {
      this.hotel_star = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.hotel_grade = null; } else {
      this.hotel_grade = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_brand = null; } else {
      this.hotel_brand = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_phone_number = null; } else {
      this.hotel_phone_number = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_baidu_point = null; } else {
      this.hotel_baidu_point = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_google_point = null; } else {
      this.hotel_google_point = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_abcd_grade = null; } else {
      this.hotel_abcd_grade = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.operating_status = null; } else {
      this.operating_status = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_types = null; } else {
      this.hotel_types = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_trading_areas = null; } else {
      this.hotel_trading_areas = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.online_status = null; } else {
      this.online_status = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.hotel_level = null; } else {
      this.hotel_level = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.last_modify_time = null; } else {
      this.last_modify_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.is_inland_flag = null; } else {
      this.is_inland_flag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.hotel_score = null; } else {
      this.hotel_score = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.hotel_formatted_score = null; } else {
      this.hotel_formatted_score = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.comment_cnt = null; } else {
      this.comment_cnt = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.des_trading_areas = null; } else {
      this.des_trading_areas = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.effective_start_date = null; } else {
      this.effective_start_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.effective_end_date = null; } else {
      this.effective_end_date = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_seq = null; } else {
      this.hotel_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_city_code = null; } else {
      this.hotel_city_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_city_name = null; } else {
      this.hotel_city_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_name = null; } else {
      this.hotel_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_address = null; } else {
      this.hotel_address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_area = null; } else {
      this.hotel_area = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.hotel_star = null; } else {
      this.hotel_star = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.hotel_grade = null; } else {
      this.hotel_grade = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_brand = null; } else {
      this.hotel_brand = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_phone_number = null; } else {
      this.hotel_phone_number = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_baidu_point = null; } else {
      this.hotel_baidu_point = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_google_point = null; } else {
      this.hotel_google_point = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_abcd_grade = null; } else {
      this.hotel_abcd_grade = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.operating_status = null; } else {
      this.operating_status = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_types = null; } else {
      this.hotel_types = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_trading_areas = null; } else {
      this.hotel_trading_areas = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.online_status = null; } else {
      this.online_status = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.hotel_level = null; } else {
      this.hotel_level = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.last_modify_time = null; } else {
      this.last_modify_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.is_inland_flag = null; } else {
      this.is_inland_flag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.hotel_score = null; } else {
      this.hotel_score = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.hotel_formatted_score = null; } else {
      this.hotel_formatted_score = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.comment_cnt = null; } else {
      this.comment_cnt = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.des_trading_areas = null; } else {
      this.des_trading_areas = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.effective_start_date = null; } else {
      this.effective_start_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.effective_end_date = null; } else {
      this.effective_end_date = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    dwd_pty_hotel_his_da o = (dwd_pty_hotel_his_da) super.clone();
    o.effective_start_date = (o.effective_start_date != null) ? (java.sql.Date) o.effective_start_date.clone() : null;
    o.effective_end_date = (o.effective_end_date != null) ? (java.sql.Date) o.effective_end_date.clone() : null;
    return o;
  }

  public void clone0(dwd_pty_hotel_his_da o) throws CloneNotSupportedException {
    o.effective_start_date = (o.effective_start_date != null) ? (java.sql.Date) o.effective_start_date.clone() : null;
    o.effective_end_date = (o.effective_end_date != null) ? (java.sql.Date) o.effective_end_date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("hotel_seq", this.hotel_seq);
    __sqoop$field_map.put("hotel_city_code", this.hotel_city_code);
    __sqoop$field_map.put("hotel_city_name", this.hotel_city_name);
    __sqoop$field_map.put("hotel_name", this.hotel_name);
    __sqoop$field_map.put("hotel_address", this.hotel_address);
    __sqoop$field_map.put("hotel_area", this.hotel_area);
    __sqoop$field_map.put("hotel_star", this.hotel_star);
    __sqoop$field_map.put("hotel_grade", this.hotel_grade);
    __sqoop$field_map.put("hotel_brand", this.hotel_brand);
    __sqoop$field_map.put("hotel_phone_number", this.hotel_phone_number);
    __sqoop$field_map.put("hotel_baidu_point", this.hotel_baidu_point);
    __sqoop$field_map.put("hotel_google_point", this.hotel_google_point);
    __sqoop$field_map.put("hotel_abcd_grade", this.hotel_abcd_grade);
    __sqoop$field_map.put("operating_status", this.operating_status);
    __sqoop$field_map.put("hotel_types", this.hotel_types);
    __sqoop$field_map.put("hotel_trading_areas", this.hotel_trading_areas);
    __sqoop$field_map.put("online_status", this.online_status);
    __sqoop$field_map.put("hotel_level", this.hotel_level);
    __sqoop$field_map.put("last_modify_time", this.last_modify_time);
    __sqoop$field_map.put("is_inland_flag", this.is_inland_flag);
    __sqoop$field_map.put("hotel_score", this.hotel_score);
    __sqoop$field_map.put("hotel_formatted_score", this.hotel_formatted_score);
    __sqoop$field_map.put("comment_cnt", this.comment_cnt);
    __sqoop$field_map.put("des_trading_areas", this.des_trading_areas);
    __sqoop$field_map.put("effective_start_date", this.effective_start_date);
    __sqoop$field_map.put("effective_end_date", this.effective_end_date);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("hotel_seq", this.hotel_seq);
    __sqoop$field_map.put("hotel_city_code", this.hotel_city_code);
    __sqoop$field_map.put("hotel_city_name", this.hotel_city_name);
    __sqoop$field_map.put("hotel_name", this.hotel_name);
    __sqoop$field_map.put("hotel_address", this.hotel_address);
    __sqoop$field_map.put("hotel_area", this.hotel_area);
    __sqoop$field_map.put("hotel_star", this.hotel_star);
    __sqoop$field_map.put("hotel_grade", this.hotel_grade);
    __sqoop$field_map.put("hotel_brand", this.hotel_brand);
    __sqoop$field_map.put("hotel_phone_number", this.hotel_phone_number);
    __sqoop$field_map.put("hotel_baidu_point", this.hotel_baidu_point);
    __sqoop$field_map.put("hotel_google_point", this.hotel_google_point);
    __sqoop$field_map.put("hotel_abcd_grade", this.hotel_abcd_grade);
    __sqoop$field_map.put("operating_status", this.operating_status);
    __sqoop$field_map.put("hotel_types", this.hotel_types);
    __sqoop$field_map.put("hotel_trading_areas", this.hotel_trading_areas);
    __sqoop$field_map.put("online_status", this.online_status);
    __sqoop$field_map.put("hotel_level", this.hotel_level);
    __sqoop$field_map.put("last_modify_time", this.last_modify_time);
    __sqoop$field_map.put("is_inland_flag", this.is_inland_flag);
    __sqoop$field_map.put("hotel_score", this.hotel_score);
    __sqoop$field_map.put("hotel_formatted_score", this.hotel_formatted_score);
    __sqoop$field_map.put("comment_cnt", this.comment_cnt);
    __sqoop$field_map.put("des_trading_areas", this.des_trading_areas);
    __sqoop$field_map.put("effective_start_date", this.effective_start_date);
    __sqoop$field_map.put("effective_end_date", this.effective_end_date);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("hotel_seq".equals(__fieldName)) {
      this.hotel_seq = (String) __fieldVal;
    }
    else    if ("hotel_city_code".equals(__fieldName)) {
      this.hotel_city_code = (String) __fieldVal;
    }
    else    if ("hotel_city_name".equals(__fieldName)) {
      this.hotel_city_name = (String) __fieldVal;
    }
    else    if ("hotel_name".equals(__fieldName)) {
      this.hotel_name = (String) __fieldVal;
    }
    else    if ("hotel_address".equals(__fieldName)) {
      this.hotel_address = (String) __fieldVal;
    }
    else    if ("hotel_area".equals(__fieldName)) {
      this.hotel_area = (String) __fieldVal;
    }
    else    if ("hotel_star".equals(__fieldName)) {
      this.hotel_star = (Integer) __fieldVal;
    }
    else    if ("hotel_grade".equals(__fieldName)) {
      this.hotel_grade = (Integer) __fieldVal;
    }
    else    if ("hotel_brand".equals(__fieldName)) {
      this.hotel_brand = (String) __fieldVal;
    }
    else    if ("hotel_phone_number".equals(__fieldName)) {
      this.hotel_phone_number = (String) __fieldVal;
    }
    else    if ("hotel_baidu_point".equals(__fieldName)) {
      this.hotel_baidu_point = (String) __fieldVal;
    }
    else    if ("hotel_google_point".equals(__fieldName)) {
      this.hotel_google_point = (String) __fieldVal;
    }
    else    if ("hotel_abcd_grade".equals(__fieldName)) {
      this.hotel_abcd_grade = (String) __fieldVal;
    }
    else    if ("operating_status".equals(__fieldName)) {
      this.operating_status = (Integer) __fieldVal;
    }
    else    if ("hotel_types".equals(__fieldName)) {
      this.hotel_types = (String) __fieldVal;
    }
    else    if ("hotel_trading_areas".equals(__fieldName)) {
      this.hotel_trading_areas = (String) __fieldVal;
    }
    else    if ("online_status".equals(__fieldName)) {
      this.online_status = (Integer) __fieldVal;
    }
    else    if ("hotel_level".equals(__fieldName)) {
      this.hotel_level = (Integer) __fieldVal;
    }
    else    if ("last_modify_time".equals(__fieldName)) {
      this.last_modify_time = (String) __fieldVal;
    }
    else    if ("is_inland_flag".equals(__fieldName)) {
      this.is_inland_flag = (Boolean) __fieldVal;
    }
    else    if ("hotel_score".equals(__fieldName)) {
      this.hotel_score = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("hotel_formatted_score".equals(__fieldName)) {
      this.hotel_formatted_score = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("comment_cnt".equals(__fieldName)) {
      this.comment_cnt = (Integer) __fieldVal;
    }
    else    if ("des_trading_areas".equals(__fieldName)) {
      this.des_trading_areas = (String) __fieldVal;
    }
    else    if ("effective_start_date".equals(__fieldName)) {
      this.effective_start_date = (java.sql.Date) __fieldVal;
    }
    else    if ("effective_end_date".equals(__fieldName)) {
      this.effective_end_date = (java.sql.Date) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("hotel_seq".equals(__fieldName)) {
      this.hotel_seq = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_city_code".equals(__fieldName)) {
      this.hotel_city_code = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_city_name".equals(__fieldName)) {
      this.hotel_city_name = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_name".equals(__fieldName)) {
      this.hotel_name = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_address".equals(__fieldName)) {
      this.hotel_address = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_area".equals(__fieldName)) {
      this.hotel_area = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_star".equals(__fieldName)) {
      this.hotel_star = (Integer) __fieldVal;
      return true;
    }
    else    if ("hotel_grade".equals(__fieldName)) {
      this.hotel_grade = (Integer) __fieldVal;
      return true;
    }
    else    if ("hotel_brand".equals(__fieldName)) {
      this.hotel_brand = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_phone_number".equals(__fieldName)) {
      this.hotel_phone_number = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_baidu_point".equals(__fieldName)) {
      this.hotel_baidu_point = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_google_point".equals(__fieldName)) {
      this.hotel_google_point = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_abcd_grade".equals(__fieldName)) {
      this.hotel_abcd_grade = (String) __fieldVal;
      return true;
    }
    else    if ("operating_status".equals(__fieldName)) {
      this.operating_status = (Integer) __fieldVal;
      return true;
    }
    else    if ("hotel_types".equals(__fieldName)) {
      this.hotel_types = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_trading_areas".equals(__fieldName)) {
      this.hotel_trading_areas = (String) __fieldVal;
      return true;
    }
    else    if ("online_status".equals(__fieldName)) {
      this.online_status = (Integer) __fieldVal;
      return true;
    }
    else    if ("hotel_level".equals(__fieldName)) {
      this.hotel_level = (Integer) __fieldVal;
      return true;
    }
    else    if ("last_modify_time".equals(__fieldName)) {
      this.last_modify_time = (String) __fieldVal;
      return true;
    }
    else    if ("is_inland_flag".equals(__fieldName)) {
      this.is_inland_flag = (Boolean) __fieldVal;
      return true;
    }
    else    if ("hotel_score".equals(__fieldName)) {
      this.hotel_score = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("hotel_formatted_score".equals(__fieldName)) {
      this.hotel_formatted_score = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("comment_cnt".equals(__fieldName)) {
      this.comment_cnt = (Integer) __fieldVal;
      return true;
    }
    else    if ("des_trading_areas".equals(__fieldName)) {
      this.des_trading_areas = (String) __fieldVal;
      return true;
    }
    else    if ("effective_start_date".equals(__fieldName)) {
      this.effective_start_date = (java.sql.Date) __fieldVal;
      return true;
    }
    else    if ("effective_end_date".equals(__fieldName)) {
      this.effective_end_date = (java.sql.Date) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
