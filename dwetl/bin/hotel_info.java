// ORM class for table 'hotel_info'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Nov 18 18:22:41 CST 2014
// For connector: org.apache.sqoop.manager.PostgresqlManager
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

public class hotel_info extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public hotel_info with_id(Long id) {
    this.id = id;
    return this;
  }
  private String hotel_seq;
  public String get_hotel_seq() {
    return hotel_seq;
  }
  public void set_hotel_seq(String hotel_seq) {
    this.hotel_seq = hotel_seq;
  }
  public hotel_info with_hotel_seq(String hotel_seq) {
    this.hotel_seq = hotel_seq;
    return this;
  }
  private String city_code;
  public String get_city_code() {
    return city_code;
  }
  public void set_city_code(String city_code) {
    this.city_code = city_code;
  }
  public hotel_info with_city_code(String city_code) {
    this.city_code = city_code;
    return this;
  }
  private String name;
  public String get_name() {
    return name;
  }
  public void set_name(String name) {
    this.name = name;
  }
  public hotel_info with_name(String name) {
    this.name = name;
    return this;
  }
  private String address;
  public String get_address() {
    return address;
  }
  public void set_address(String address) {
    this.address = address;
  }
  public hotel_info with_address(String address) {
    this.address = address;
    return this;
  }
  private String area;
  public String get_area() {
    return area;
  }
  public void set_area(String area) {
    this.area = area;
  }
  public hotel_info with_area(String area) {
    this.area = area;
    return this;
  }
  private String city_tags;
  public String get_city_tags() {
    return city_tags;
  }
  public void set_city_tags(String city_tags) {
    this.city_tags = city_tags;
  }
  public hotel_info with_city_tags(String city_tags) {
    this.city_tags = city_tags;
    return this;
  }
  private Integer star;
  public Integer get_star() {
    return star;
  }
  public void set_star(Integer star) {
    this.star = star;
  }
  public hotel_info with_star(Integer star) {
    this.star = star;
    return this;
  }
  private Integer grade;
  public Integer get_grade() {
    return grade;
  }
  public void set_grade(Integer grade) {
    this.grade = grade;
  }
  public hotel_info with_grade(Integer grade) {
    this.grade = grade;
    return this;
  }
  private String brand;
  public String get_brand() {
    return brand;
  }
  public void set_brand(String brand) {
    this.brand = brand;
  }
  public hotel_info with_brand(String brand) {
    this.brand = brand;
    return this;
  }
  private String notes;
  public String get_notes() {
    return notes;
  }
  public void set_notes(String notes) {
    this.notes = notes;
  }
  public hotel_info with_notes(String notes) {
    this.notes = notes;
    return this;
  }
  private String one_sentence;
  public String get_one_sentence() {
    return one_sentence;
  }
  public void set_one_sentence(String one_sentence) {
    this.one_sentence = one_sentence;
  }
  public hotel_info with_one_sentence(String one_sentence) {
    this.one_sentence = one_sentence;
    return this;
  }
  private Integer lowest_price;
  public Integer get_lowest_price() {
    return lowest_price;
  }
  public void set_lowest_price(Integer lowest_price) {
    this.lowest_price = lowest_price;
  }
  public hotel_info with_lowest_price(Integer lowest_price) {
    this.lowest_price = lowest_price;
    return this;
  }
  private String phone_number;
  public String get_phone_number() {
    return phone_number;
  }
  public void set_phone_number(String phone_number) {
    this.phone_number = phone_number;
  }
  public hotel_info with_phone_number(String phone_number) {
    this.phone_number = phone_number;
    return this;
  }
  private String baidu_point;
  public String get_baidu_point() {
    return baidu_point;
  }
  public void set_baidu_point(String baidu_point) {
    this.baidu_point = baidu_point;
  }
  public hotel_info with_baidu_point(String baidu_point) {
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
  public hotel_info with_google_point(String google_point) {
    this.google_point = google_point;
    return this;
  }
  private Integer operating_status;
  public Integer get_operating_status() {
    return operating_status;
  }
  public void set_operating_status(Integer operating_status) {
    this.operating_status = operating_status;
  }
  public hotel_info with_operating_status(Integer operating_status) {
    this.operating_status = operating_status;
    return this;
  }
  private String comment_summary;
  public String get_comment_summary() {
    return comment_summary;
  }
  public void set_comment_summary(String comment_summary) {
    this.comment_summary = comment_summary;
  }
  public hotel_info with_comment_summary(String comment_summary) {
    this.comment_summary = comment_summary;
    return this;
  }
  private String types;
  public String get_types() {
    return types;
  }
  public void set_types(String types) {
    this.types = types;
  }
  public hotel_info with_types(String types) {
    this.types = types;
    return this;
  }
  private String thumbnail_id;
  public String get_thumbnail_id() {
    return thumbnail_id;
  }
  public void set_thumbnail_id(String thumbnail_id) {
    this.thumbnail_id = thumbnail_id;
  }
  public hotel_info with_thumbnail_id(String thumbnail_id) {
    this.thumbnail_id = thumbnail_id;
    return this;
  }
  private String trading_areas;
  public String get_trading_areas() {
    return trading_areas;
  }
  public void set_trading_areas(String trading_areas) {
    this.trading_areas = trading_areas;
  }
  public hotel_info with_trading_areas(String trading_areas) {
    this.trading_areas = trading_areas;
    return this;
  }
  private Integer online_status;
  public Integer get_online_status() {
    return online_status;
  }
  public void set_online_status(Integer online_status) {
    this.online_status = online_status;
  }
  public hotel_info with_online_status(Integer online_status) {
    this.online_status = online_status;
    return this;
  }
  private String comment;
  public String get_comment() {
    return comment;
  }
  public void set_comment(String comment) {
    this.comment = comment;
  }
  public hotel_info with_comment(String comment) {
    this.comment = comment;
    return this;
  }
  private Integer level;
  public Integer get_level() {
    return level;
  }
  public void set_level(Integer level) {
    this.level = level;
  }
  public hotel_info with_level(Integer level) {
    this.level = level;
    return this;
  }
  private String attrs;
  public String get_attrs() {
    return attrs;
  }
  public void set_attrs(String attrs) {
    this.attrs = attrs;
  }
  public hotel_info with_attrs(String attrs) {
    this.attrs = attrs;
    return this;
  }
  private java.sql.Timestamp last_mod;
  public java.sql.Timestamp get_last_mod() {
    return last_mod;
  }
  public void set_last_mod(java.sql.Timestamp last_mod) {
    this.last_mod = last_mod;
  }
  public hotel_info with_last_mod(java.sql.Timestamp last_mod) {
    this.last_mod = last_mod;
    return this;
  }
  private Boolean is_inland;
  public Boolean get_is_inland() {
    return is_inland;
  }
  public void set_is_inland(Boolean is_inland) {
    this.is_inland = is_inland;
  }
  public hotel_info with_is_inland(Boolean is_inland) {
    this.is_inland = is_inland;
    return this;
  }
  private Long area_id;
  public Long get_area_id() {
    return area_id;
  }
  public void set_area_id(Long area_id) {
    this.area_id = area_id;
  }
  public hotel_info with_area_id(Long area_id) {
    this.area_id = area_id;
    return this;
  }
  private String short_addr;
  public String get_short_addr() {
    return short_addr;
  }
  public void set_short_addr(String short_addr) {
    this.short_addr = short_addr;
  }
  public hotel_info with_short_addr(String short_addr) {
    this.short_addr = short_addr;
    return this;
  }
  private String operator;
  public String get_operator() {
    return operator;
  }
  public void set_operator(String operator) {
    this.operator = operator;
  }
  public hotel_info with_operator(String operator) {
    this.operator = operator;
    return this;
  }
  private Double score;
  public Double get_score() {
    return score;
  }
  public void set_score(Double score) {
    this.score = score;
  }
  public hotel_info with_score(Double score) {
    this.score = score;
    return this;
  }
  private Double formattedscore;
  public Double get_formattedscore() {
    return formattedscore;
  }
  public void set_formattedscore(Double formattedscore) {
    this.formattedscore = formattedscore;
  }
  public hotel_info with_formattedscore(Double formattedscore) {
    this.formattedscore = formattedscore;
    return this;
  }
  private Integer comm_cnt;
  public Integer get_comm_cnt() {
    return comm_cnt;
  }
  public void set_comm_cnt(Integer comm_cnt) {
    this.comm_cnt = comm_cnt;
  }
  public hotel_info with_comm_cnt(Integer comm_cnt) {
    this.comm_cnt = comm_cnt;
    return this;
  }
  private String des_trading_areas;
  public String get_des_trading_areas() {
    return des_trading_areas;
  }
  public void set_des_trading_areas(String des_trading_areas) {
    this.des_trading_areas = des_trading_areas;
  }
  public hotel_info with_des_trading_areas(String des_trading_areas) {
    this.des_trading_areas = des_trading_areas;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof hotel_info)) {
      return false;
    }
    hotel_info that = (hotel_info) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.hotel_seq == null ? that.hotel_seq == null : this.hotel_seq.equals(that.hotel_seq));
    equal = equal && (this.city_code == null ? that.city_code == null : this.city_code.equals(that.city_code));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.area == null ? that.area == null : this.area.equals(that.area));
    equal = equal && (this.city_tags == null ? that.city_tags == null : this.city_tags.equals(that.city_tags));
    equal = equal && (this.star == null ? that.star == null : this.star.equals(that.star));
    equal = equal && (this.grade == null ? that.grade == null : this.grade.equals(that.grade));
    equal = equal && (this.brand == null ? that.brand == null : this.brand.equals(that.brand));
    equal = equal && (this.notes == null ? that.notes == null : this.notes.equals(that.notes));
    equal = equal && (this.one_sentence == null ? that.one_sentence == null : this.one_sentence.equals(that.one_sentence));
    equal = equal && (this.lowest_price == null ? that.lowest_price == null : this.lowest_price.equals(that.lowest_price));
    equal = equal && (this.phone_number == null ? that.phone_number == null : this.phone_number.equals(that.phone_number));
    equal = equal && (this.baidu_point == null ? that.baidu_point == null : this.baidu_point.equals(that.baidu_point));
    equal = equal && (this.google_point == null ? that.google_point == null : this.google_point.equals(that.google_point));
    equal = equal && (this.operating_status == null ? that.operating_status == null : this.operating_status.equals(that.operating_status));
    equal = equal && (this.comment_summary == null ? that.comment_summary == null : this.comment_summary.equals(that.comment_summary));
    equal = equal && (this.types == null ? that.types == null : this.types.equals(that.types));
    equal = equal && (this.thumbnail_id == null ? that.thumbnail_id == null : this.thumbnail_id.equals(that.thumbnail_id));
    equal = equal && (this.trading_areas == null ? that.trading_areas == null : this.trading_areas.equals(that.trading_areas));
    equal = equal && (this.online_status == null ? that.online_status == null : this.online_status.equals(that.online_status));
    equal = equal && (this.comment == null ? that.comment == null : this.comment.equals(that.comment));
    equal = equal && (this.level == null ? that.level == null : this.level.equals(that.level));
    equal = equal && (this.attrs == null ? that.attrs == null : this.attrs.equals(that.attrs));
    equal = equal && (this.last_mod == null ? that.last_mod == null : this.last_mod.equals(that.last_mod));
    equal = equal && (this.is_inland == null ? that.is_inland == null : this.is_inland.equals(that.is_inland));
    equal = equal && (this.area_id == null ? that.area_id == null : this.area_id.equals(that.area_id));
    equal = equal && (this.short_addr == null ? that.short_addr == null : this.short_addr.equals(that.short_addr));
    equal = equal && (this.operator == null ? that.operator == null : this.operator.equals(that.operator));
    equal = equal && (this.score == null ? that.score == null : this.score.equals(that.score));
    equal = equal && (this.formattedscore == null ? that.formattedscore == null : this.formattedscore.equals(that.formattedscore));
    equal = equal && (this.comm_cnt == null ? that.comm_cnt == null : this.comm_cnt.equals(that.comm_cnt));
    equal = equal && (this.des_trading_areas == null ? that.des_trading_areas == null : this.des_trading_areas.equals(that.des_trading_areas));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof hotel_info)) {
      return false;
    }
    hotel_info that = (hotel_info) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.hotel_seq == null ? that.hotel_seq == null : this.hotel_seq.equals(that.hotel_seq));
    equal = equal && (this.city_code == null ? that.city_code == null : this.city_code.equals(that.city_code));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.area == null ? that.area == null : this.area.equals(that.area));
    equal = equal && (this.city_tags == null ? that.city_tags == null : this.city_tags.equals(that.city_tags));
    equal = equal && (this.star == null ? that.star == null : this.star.equals(that.star));
    equal = equal && (this.grade == null ? that.grade == null : this.grade.equals(that.grade));
    equal = equal && (this.brand == null ? that.brand == null : this.brand.equals(that.brand));
    equal = equal && (this.notes == null ? that.notes == null : this.notes.equals(that.notes));
    equal = equal && (this.one_sentence == null ? that.one_sentence == null : this.one_sentence.equals(that.one_sentence));
    equal = equal && (this.lowest_price == null ? that.lowest_price == null : this.lowest_price.equals(that.lowest_price));
    equal = equal && (this.phone_number == null ? that.phone_number == null : this.phone_number.equals(that.phone_number));
    equal = equal && (this.baidu_point == null ? that.baidu_point == null : this.baidu_point.equals(that.baidu_point));
    equal = equal && (this.google_point == null ? that.google_point == null : this.google_point.equals(that.google_point));
    equal = equal && (this.operating_status == null ? that.operating_status == null : this.operating_status.equals(that.operating_status));
    equal = equal && (this.comment_summary == null ? that.comment_summary == null : this.comment_summary.equals(that.comment_summary));
    equal = equal && (this.types == null ? that.types == null : this.types.equals(that.types));
    equal = equal && (this.thumbnail_id == null ? that.thumbnail_id == null : this.thumbnail_id.equals(that.thumbnail_id));
    equal = equal && (this.trading_areas == null ? that.trading_areas == null : this.trading_areas.equals(that.trading_areas));
    equal = equal && (this.online_status == null ? that.online_status == null : this.online_status.equals(that.online_status));
    equal = equal && (this.comment == null ? that.comment == null : this.comment.equals(that.comment));
    equal = equal && (this.level == null ? that.level == null : this.level.equals(that.level));
    equal = equal && (this.attrs == null ? that.attrs == null : this.attrs.equals(that.attrs));
    equal = equal && (this.last_mod == null ? that.last_mod == null : this.last_mod.equals(that.last_mod));
    equal = equal && (this.is_inland == null ? that.is_inland == null : this.is_inland.equals(that.is_inland));
    equal = equal && (this.area_id == null ? that.area_id == null : this.area_id.equals(that.area_id));
    equal = equal && (this.short_addr == null ? that.short_addr == null : this.short_addr.equals(that.short_addr));
    equal = equal && (this.operator == null ? that.operator == null : this.operator.equals(that.operator));
    equal = equal && (this.score == null ? that.score == null : this.score.equals(that.score));
    equal = equal && (this.formattedscore == null ? that.formattedscore == null : this.formattedscore.equals(that.formattedscore));
    equal = equal && (this.comm_cnt == null ? that.comm_cnt == null : this.comm_cnt.equals(that.comm_cnt));
    equal = equal && (this.des_trading_areas == null ? that.des_trading_areas == null : this.des_trading_areas.equals(that.des_trading_areas));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.hotel_seq = JdbcWritableBridge.readString(2, __dbResults);
    this.city_code = JdbcWritableBridge.readString(3, __dbResults);
    this.name = JdbcWritableBridge.readString(4, __dbResults);
    this.address = JdbcWritableBridge.readString(5, __dbResults);
    this.area = JdbcWritableBridge.readString(6, __dbResults);
    this.city_tags = JdbcWritableBridge.readString(7, __dbResults);
    this.star = JdbcWritableBridge.readInteger(8, __dbResults);
    this.grade = JdbcWritableBridge.readInteger(9, __dbResults);
    this.brand = JdbcWritableBridge.readString(10, __dbResults);
    this.notes = JdbcWritableBridge.readString(11, __dbResults);
    this.one_sentence = JdbcWritableBridge.readString(12, __dbResults);
    this.lowest_price = JdbcWritableBridge.readInteger(13, __dbResults);
    this.phone_number = JdbcWritableBridge.readString(14, __dbResults);
    this.baidu_point = JdbcWritableBridge.readString(15, __dbResults);
    this.google_point = JdbcWritableBridge.readString(16, __dbResults);
    this.operating_status = JdbcWritableBridge.readInteger(17, __dbResults);
    this.comment_summary = JdbcWritableBridge.readString(18, __dbResults);
    this.types = JdbcWritableBridge.readString(19, __dbResults);
    this.thumbnail_id = JdbcWritableBridge.readString(20, __dbResults);
    this.trading_areas = JdbcWritableBridge.readString(21, __dbResults);
    this.online_status = JdbcWritableBridge.readInteger(22, __dbResults);
    this.comment = JdbcWritableBridge.readString(23, __dbResults);
    this.level = JdbcWritableBridge.readInteger(24, __dbResults);
    this.attrs = JdbcWritableBridge.readString(25, __dbResults);
    this.last_mod = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.is_inland = JdbcWritableBridge.readBoolean(27, __dbResults);
    this.area_id = JdbcWritableBridge.readLong(28, __dbResults);
    this.short_addr = JdbcWritableBridge.readString(29, __dbResults);
    this.operator = JdbcWritableBridge.readString(30, __dbResults);
    this.score = JdbcWritableBridge.readDouble(31, __dbResults);
    this.formattedscore = JdbcWritableBridge.readDouble(32, __dbResults);
    this.comm_cnt = JdbcWritableBridge.readInteger(33, __dbResults);
    this.des_trading_areas = JdbcWritableBridge.readString(34, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.hotel_seq = JdbcWritableBridge.readString(2, __dbResults);
    this.city_code = JdbcWritableBridge.readString(3, __dbResults);
    this.name = JdbcWritableBridge.readString(4, __dbResults);
    this.address = JdbcWritableBridge.readString(5, __dbResults);
    this.area = JdbcWritableBridge.readString(6, __dbResults);
    this.city_tags = JdbcWritableBridge.readString(7, __dbResults);
    this.star = JdbcWritableBridge.readInteger(8, __dbResults);
    this.grade = JdbcWritableBridge.readInteger(9, __dbResults);
    this.brand = JdbcWritableBridge.readString(10, __dbResults);
    this.notes = JdbcWritableBridge.readString(11, __dbResults);
    this.one_sentence = JdbcWritableBridge.readString(12, __dbResults);
    this.lowest_price = JdbcWritableBridge.readInteger(13, __dbResults);
    this.phone_number = JdbcWritableBridge.readString(14, __dbResults);
    this.baidu_point = JdbcWritableBridge.readString(15, __dbResults);
    this.google_point = JdbcWritableBridge.readString(16, __dbResults);
    this.operating_status = JdbcWritableBridge.readInteger(17, __dbResults);
    this.comment_summary = JdbcWritableBridge.readString(18, __dbResults);
    this.types = JdbcWritableBridge.readString(19, __dbResults);
    this.thumbnail_id = JdbcWritableBridge.readString(20, __dbResults);
    this.trading_areas = JdbcWritableBridge.readString(21, __dbResults);
    this.online_status = JdbcWritableBridge.readInteger(22, __dbResults);
    this.comment = JdbcWritableBridge.readString(23, __dbResults);
    this.level = JdbcWritableBridge.readInteger(24, __dbResults);
    this.attrs = JdbcWritableBridge.readString(25, __dbResults);
    this.last_mod = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.is_inland = JdbcWritableBridge.readBoolean(27, __dbResults);
    this.area_id = JdbcWritableBridge.readLong(28, __dbResults);
    this.short_addr = JdbcWritableBridge.readString(29, __dbResults);
    this.operator = JdbcWritableBridge.readString(30, __dbResults);
    this.score = JdbcWritableBridge.readDouble(31, __dbResults);
    this.formattedscore = JdbcWritableBridge.readDouble(32, __dbResults);
    this.comm_cnt = JdbcWritableBridge.readInteger(33, __dbResults);
    this.des_trading_areas = JdbcWritableBridge.readString(34, __dbResults);
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
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(hotel_seq, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(area, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_tags, 7 + __off, 2003, __dbStmt);
    JdbcWritableBridge.writeInteger(star, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(grade, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(brand, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(notes, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(one_sentence, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(lowest_price, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(phone_number, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(baidu_point, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(google_point, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(operating_status, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(comment_summary, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(types, 19 + __off, 2003, __dbStmt);
    JdbcWritableBridge.writeString(thumbnail_id, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(trading_areas, 21 + __off, 2003, __dbStmt);
    JdbcWritableBridge.writeInteger(online_status, 22 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(comment, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(level, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(attrs, 25 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeTimestamp(last_mod, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_inland, 27 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeLong(area_id, 28 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(short_addr, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(operator, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(score, 31 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(formattedscore, 32 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(comm_cnt, 33 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(des_trading_areas, 34 + __off, 12, __dbStmt);
    return 34;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(hotel_seq, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(area, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_tags, 7 + __off, 2003, __dbStmt);
    JdbcWritableBridge.writeInteger(star, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(grade, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(brand, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(notes, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(one_sentence, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(lowest_price, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(phone_number, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(baidu_point, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(google_point, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(operating_status, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(comment_summary, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(types, 19 + __off, 2003, __dbStmt);
    JdbcWritableBridge.writeString(thumbnail_id, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(trading_areas, 21 + __off, 2003, __dbStmt);
    JdbcWritableBridge.writeInteger(online_status, 22 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(comment, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(level, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(attrs, 25 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeTimestamp(last_mod, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_inland, 27 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeLong(area_id, 28 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(short_addr, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(operator, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(score, 31 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(formattedscore, 32 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(comm_cnt, 33 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(des_trading_areas, 34 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_seq = null;
    } else {
    this.hotel_seq = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city_code = null;
    } else {
    this.city_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.name = null;
    } else {
    this.name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.address = null;
    } else {
    this.address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.area = null;
    } else {
    this.area = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city_tags = null;
    } else {
    this.city_tags = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.star = null;
    } else {
    this.star = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.grade = null;
    } else {
    this.grade = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.brand = null;
    } else {
    this.brand = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.notes = null;
    } else {
    this.notes = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.one_sentence = null;
    } else {
    this.one_sentence = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lowest_price = null;
    } else {
    this.lowest_price = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.phone_number = null;
    } else {
    this.phone_number = Text.readString(__dataIn);
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
        this.operating_status = null;
    } else {
    this.operating_status = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.comment_summary = null;
    } else {
    this.comment_summary = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.types = null;
    } else {
    this.types = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.thumbnail_id = null;
    } else {
    this.thumbnail_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.trading_areas = null;
    } else {
    this.trading_areas = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.online_status = null;
    } else {
    this.online_status = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.comment = null;
    } else {
    this.comment = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.level = null;
    } else {
    this.level = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.attrs = null;
    } else {
    this.attrs = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.last_mod = null;
    } else {
    this.last_mod = new Timestamp(__dataIn.readLong());
    this.last_mod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.is_inland = null;
    } else {
    this.is_inland = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.area_id = null;
    } else {
    this.area_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.short_addr = null;
    } else {
    this.short_addr = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.operator = null;
    } else {
    this.operator = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.score = null;
    } else {
    this.score = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.formattedscore = null;
    } else {
    this.formattedscore = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.comm_cnt = null;
    } else {
    this.comm_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.des_trading_areas = null;
    } else {
    this.des_trading_areas = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.hotel_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_seq);
    }
    if (null == this.city_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_code);
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, area);
    }
    if (null == this.city_tags) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_tags);
    }
    if (null == this.star) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.star);
    }
    if (null == this.grade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.grade);
    }
    if (null == this.brand) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, brand);
    }
    if (null == this.notes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, notes);
    }
    if (null == this.one_sentence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, one_sentence);
    }
    if (null == this.lowest_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.lowest_price);
    }
    if (null == this.phone_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, phone_number);
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
    if (null == this.operating_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.operating_status);
    }
    if (null == this.comment_summary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, comment_summary);
    }
    if (null == this.types) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, types);
    }
    if (null == this.thumbnail_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, thumbnail_id);
    }
    if (null == this.trading_areas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, trading_areas);
    }
    if (null == this.online_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.online_status);
    }
    if (null == this.comment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, comment);
    }
    if (null == this.level) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.level);
    }
    if (null == this.attrs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, attrs);
    }
    if (null == this.last_mod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_mod.getTime());
    __dataOut.writeInt(this.last_mod.getNanos());
    }
    if (null == this.is_inland) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.is_inland);
    }
    if (null == this.area_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.area_id);
    }
    if (null == this.short_addr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, short_addr);
    }
    if (null == this.operator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, operator);
    }
    if (null == this.score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.score);
    }
    if (null == this.formattedscore) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.formattedscore);
    }
    if (null == this.comm_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.comm_cnt);
    }
    if (null == this.des_trading_areas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, des_trading_areas);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.hotel_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_seq);
    }
    if (null == this.city_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_code);
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, area);
    }
    if (null == this.city_tags) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_tags);
    }
    if (null == this.star) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.star);
    }
    if (null == this.grade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.grade);
    }
    if (null == this.brand) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, brand);
    }
    if (null == this.notes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, notes);
    }
    if (null == this.one_sentence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, one_sentence);
    }
    if (null == this.lowest_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.lowest_price);
    }
    if (null == this.phone_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, phone_number);
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
    if (null == this.operating_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.operating_status);
    }
    if (null == this.comment_summary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, comment_summary);
    }
    if (null == this.types) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, types);
    }
    if (null == this.thumbnail_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, thumbnail_id);
    }
    if (null == this.trading_areas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, trading_areas);
    }
    if (null == this.online_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.online_status);
    }
    if (null == this.comment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, comment);
    }
    if (null == this.level) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.level);
    }
    if (null == this.attrs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, attrs);
    }
    if (null == this.last_mod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_mod.getTime());
    __dataOut.writeInt(this.last_mod.getNanos());
    }
    if (null == this.is_inland) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.is_inland);
    }
    if (null == this.area_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.area_id);
    }
    if (null == this.short_addr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, short_addr);
    }
    if (null == this.operator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, operator);
    }
    if (null == this.score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.score);
    }
    if (null == this.formattedscore) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.formattedscore);
    }
    if (null == this.comm_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.comm_cnt);
    }
    if (null == this.des_trading_areas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, des_trading_areas);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hotel_seq==null?"null":hotel_seq, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(city_code==null?"null":city_code, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(name==null?"null":name, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(address==null?"null":address, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(area==null?"null":area, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(city_tags==null?"null":city_tags, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(star==null?"null":"" + star, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(grade==null?"null":"" + grade, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(brand==null?"null":brand, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(notes==null?"null":notes, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(one_sentence==null?"null":one_sentence, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lowest_price==null?"null":"" + lowest_price, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(phone_number==null?"null":phone_number, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(baidu_point==null?"null":baidu_point, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(google_point==null?"null":google_point, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(operating_status==null?"null":"" + operating_status, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(comment_summary==null?"null":comment_summary, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(types==null?"null":types, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(thumbnail_id==null?"null":thumbnail_id, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(trading_areas==null?"null":trading_areas, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(online_status==null?"null":"" + online_status, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(comment==null?"null":comment, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(level==null?"null":"" + level, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(attrs==null?"null":attrs, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_mod==null?"null":"" + last_mod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_inland==null?"null":"" + is_inland, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(area_id==null?"null":"" + area_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(short_addr==null?"null":short_addr, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(operator==null?"null":operator, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(score==null?"null":"" + score, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(formattedscore==null?"null":"" + formattedscore, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(comm_cnt==null?"null":"" + comm_cnt, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(des_trading_areas==null?"null":des_trading_areas, "\005", delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hotel_seq==null?"null":hotel_seq, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(city_code==null?"null":city_code, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(name==null?"null":name, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(address==null?"null":address, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(area==null?"null":area, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(city_tags==null?"null":city_tags, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(star==null?"null":"" + star, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(grade==null?"null":"" + grade, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(brand==null?"null":brand, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(notes==null?"null":notes, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(one_sentence==null?"null":one_sentence, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lowest_price==null?"null":"" + lowest_price, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(phone_number==null?"null":phone_number, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(baidu_point==null?"null":baidu_point, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(google_point==null?"null":google_point, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(operating_status==null?"null":"" + operating_status, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(comment_summary==null?"null":comment_summary, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(types==null?"null":types, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(thumbnail_id==null?"null":thumbnail_id, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(trading_areas==null?"null":trading_areas, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(online_status==null?"null":"" + online_status, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(comment==null?"null":comment, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(level==null?"null":"" + level, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(attrs==null?"null":attrs, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_mod==null?"null":"" + last_mod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_inland==null?"null":"" + is_inland, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(area_id==null?"null":"" + area_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(short_addr==null?"null":short_addr, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(operator==null?"null":operator, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(score==null?"null":"" + score, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(formattedscore==null?"null":"" + formattedscore, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(comm_cnt==null?"null":"" + comm_cnt, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(des_trading_areas==null?"null":des_trading_areas, "\005", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hotel_seq = null; } else {
      this.hotel_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city_code = null; } else {
      this.city_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.area = null; } else {
      this.area = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city_tags = null; } else {
      this.city_tags = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.star = null; } else {
      this.star = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.grade = null; } else {
      this.grade = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.brand = null; } else {
      this.brand = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.notes = null; } else {
      this.notes = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.one_sentence = null; } else {
      this.one_sentence = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lowest_price = null; } else {
      this.lowest_price = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.phone_number = null; } else {
      this.phone_number = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.baidu_point = null; } else {
      this.baidu_point = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.google_point = null; } else {
      this.google_point = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.operating_status = null; } else {
      this.operating_status = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.comment_summary = null; } else {
      this.comment_summary = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.types = null; } else {
      this.types = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.thumbnail_id = null; } else {
      this.thumbnail_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.trading_areas = null; } else {
      this.trading_areas = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.online_status = null; } else {
      this.online_status = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.comment = null; } else {
      this.comment = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.level = null; } else {
      this.level = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.attrs = null; } else {
      this.attrs = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_mod = null; } else {
      this.last_mod = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_inland = null; } else {
      this.is_inland = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.area_id = null; } else {
      this.area_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.short_addr = null; } else {
      this.short_addr = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.operator = null; } else {
      this.operator = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.score = null; } else {
      this.score = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.formattedscore = null; } else {
      this.formattedscore = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.comm_cnt = null; } else {
      this.comm_cnt = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.des_trading_areas = null; } else {
      this.des_trading_areas = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hotel_seq = null; } else {
      this.hotel_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city_code = null; } else {
      this.city_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.area = null; } else {
      this.area = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city_tags = null; } else {
      this.city_tags = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.star = null; } else {
      this.star = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.grade = null; } else {
      this.grade = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.brand = null; } else {
      this.brand = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.notes = null; } else {
      this.notes = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.one_sentence = null; } else {
      this.one_sentence = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lowest_price = null; } else {
      this.lowest_price = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.phone_number = null; } else {
      this.phone_number = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.baidu_point = null; } else {
      this.baidu_point = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.google_point = null; } else {
      this.google_point = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.operating_status = null; } else {
      this.operating_status = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.comment_summary = null; } else {
      this.comment_summary = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.types = null; } else {
      this.types = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.thumbnail_id = null; } else {
      this.thumbnail_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.trading_areas = null; } else {
      this.trading_areas = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.online_status = null; } else {
      this.online_status = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.comment = null; } else {
      this.comment = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.level = null; } else {
      this.level = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.attrs = null; } else {
      this.attrs = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_mod = null; } else {
      this.last_mod = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_inland = null; } else {
      this.is_inland = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.area_id = null; } else {
      this.area_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.short_addr = null; } else {
      this.short_addr = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.operator = null; } else {
      this.operator = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.score = null; } else {
      this.score = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.formattedscore = null; } else {
      this.formattedscore = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.comm_cnt = null; } else {
      this.comm_cnt = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.des_trading_areas = null; } else {
      this.des_trading_areas = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    hotel_info o = (hotel_info) super.clone();
    o.last_mod = (o.last_mod != null) ? (java.sql.Timestamp) o.last_mod.clone() : null;
    return o;
  }

  public void clone0(hotel_info o) throws CloneNotSupportedException {
    o.last_mod = (o.last_mod != null) ? (java.sql.Timestamp) o.last_mod.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("hotel_seq", this.hotel_seq);
    __sqoop$field_map.put("city_code", this.city_code);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("area", this.area);
    __sqoop$field_map.put("city_tags", this.city_tags);
    __sqoop$field_map.put("star", this.star);
    __sqoop$field_map.put("grade", this.grade);
    __sqoop$field_map.put("brand", this.brand);
    __sqoop$field_map.put("notes", this.notes);
    __sqoop$field_map.put("one_sentence", this.one_sentence);
    __sqoop$field_map.put("lowest_price", this.lowest_price);
    __sqoop$field_map.put("phone_number", this.phone_number);
    __sqoop$field_map.put("baidu_point", this.baidu_point);
    __sqoop$field_map.put("google_point", this.google_point);
    __sqoop$field_map.put("operating_status", this.operating_status);
    __sqoop$field_map.put("comment_summary", this.comment_summary);
    __sqoop$field_map.put("types", this.types);
    __sqoop$field_map.put("thumbnail_id", this.thumbnail_id);
    __sqoop$field_map.put("trading_areas", this.trading_areas);
    __sqoop$field_map.put("online_status", this.online_status);
    __sqoop$field_map.put("comment", this.comment);
    __sqoop$field_map.put("level", this.level);
    __sqoop$field_map.put("attrs", this.attrs);
    __sqoop$field_map.put("last_mod", this.last_mod);
    __sqoop$field_map.put("is_inland", this.is_inland);
    __sqoop$field_map.put("area_id", this.area_id);
    __sqoop$field_map.put("short_addr", this.short_addr);
    __sqoop$field_map.put("operator", this.operator);
    __sqoop$field_map.put("score", this.score);
    __sqoop$field_map.put("formattedscore", this.formattedscore);
    __sqoop$field_map.put("comm_cnt", this.comm_cnt);
    __sqoop$field_map.put("des_trading_areas", this.des_trading_areas);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("hotel_seq", this.hotel_seq);
    __sqoop$field_map.put("city_code", this.city_code);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("area", this.area);
    __sqoop$field_map.put("city_tags", this.city_tags);
    __sqoop$field_map.put("star", this.star);
    __sqoop$field_map.put("grade", this.grade);
    __sqoop$field_map.put("brand", this.brand);
    __sqoop$field_map.put("notes", this.notes);
    __sqoop$field_map.put("one_sentence", this.one_sentence);
    __sqoop$field_map.put("lowest_price", this.lowest_price);
    __sqoop$field_map.put("phone_number", this.phone_number);
    __sqoop$field_map.put("baidu_point", this.baidu_point);
    __sqoop$field_map.put("google_point", this.google_point);
    __sqoop$field_map.put("operating_status", this.operating_status);
    __sqoop$field_map.put("comment_summary", this.comment_summary);
    __sqoop$field_map.put("types", this.types);
    __sqoop$field_map.put("thumbnail_id", this.thumbnail_id);
    __sqoop$field_map.put("trading_areas", this.trading_areas);
    __sqoop$field_map.put("online_status", this.online_status);
    __sqoop$field_map.put("comment", this.comment);
    __sqoop$field_map.put("level", this.level);
    __sqoop$field_map.put("attrs", this.attrs);
    __sqoop$field_map.put("last_mod", this.last_mod);
    __sqoop$field_map.put("is_inland", this.is_inland);
    __sqoop$field_map.put("area_id", this.area_id);
    __sqoop$field_map.put("short_addr", this.short_addr);
    __sqoop$field_map.put("operator", this.operator);
    __sqoop$field_map.put("score", this.score);
    __sqoop$field_map.put("formattedscore", this.formattedscore);
    __sqoop$field_map.put("comm_cnt", this.comm_cnt);
    __sqoop$field_map.put("des_trading_areas", this.des_trading_areas);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Long) __fieldVal;
    }
    else    if ("hotel_seq".equals(__fieldName)) {
      this.hotel_seq = (String) __fieldVal;
    }
    else    if ("city_code".equals(__fieldName)) {
      this.city_code = (String) __fieldVal;
    }
    else    if ("name".equals(__fieldName)) {
      this.name = (String) __fieldVal;
    }
    else    if ("address".equals(__fieldName)) {
      this.address = (String) __fieldVal;
    }
    else    if ("area".equals(__fieldName)) {
      this.area = (String) __fieldVal;
    }
    else    if ("city_tags".equals(__fieldName)) {
      this.city_tags = (String) __fieldVal;
    }
    else    if ("star".equals(__fieldName)) {
      this.star = (Integer) __fieldVal;
    }
    else    if ("grade".equals(__fieldName)) {
      this.grade = (Integer) __fieldVal;
    }
    else    if ("brand".equals(__fieldName)) {
      this.brand = (String) __fieldVal;
    }
    else    if ("notes".equals(__fieldName)) {
      this.notes = (String) __fieldVal;
    }
    else    if ("one_sentence".equals(__fieldName)) {
      this.one_sentence = (String) __fieldVal;
    }
    else    if ("lowest_price".equals(__fieldName)) {
      this.lowest_price = (Integer) __fieldVal;
    }
    else    if ("phone_number".equals(__fieldName)) {
      this.phone_number = (String) __fieldVal;
    }
    else    if ("baidu_point".equals(__fieldName)) {
      this.baidu_point = (String) __fieldVal;
    }
    else    if ("google_point".equals(__fieldName)) {
      this.google_point = (String) __fieldVal;
    }
    else    if ("operating_status".equals(__fieldName)) {
      this.operating_status = (Integer) __fieldVal;
    }
    else    if ("comment_summary".equals(__fieldName)) {
      this.comment_summary = (String) __fieldVal;
    }
    else    if ("types".equals(__fieldName)) {
      this.types = (String) __fieldVal;
    }
    else    if ("thumbnail_id".equals(__fieldName)) {
      this.thumbnail_id = (String) __fieldVal;
    }
    else    if ("trading_areas".equals(__fieldName)) {
      this.trading_areas = (String) __fieldVal;
    }
    else    if ("online_status".equals(__fieldName)) {
      this.online_status = (Integer) __fieldVal;
    }
    else    if ("comment".equals(__fieldName)) {
      this.comment = (String) __fieldVal;
    }
    else    if ("level".equals(__fieldName)) {
      this.level = (Integer) __fieldVal;
    }
    else    if ("attrs".equals(__fieldName)) {
      this.attrs = (String) __fieldVal;
    }
    else    if ("last_mod".equals(__fieldName)) {
      this.last_mod = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("is_inland".equals(__fieldName)) {
      this.is_inland = (Boolean) __fieldVal;
    }
    else    if ("area_id".equals(__fieldName)) {
      this.area_id = (Long) __fieldVal;
    }
    else    if ("short_addr".equals(__fieldName)) {
      this.short_addr = (String) __fieldVal;
    }
    else    if ("operator".equals(__fieldName)) {
      this.operator = (String) __fieldVal;
    }
    else    if ("score".equals(__fieldName)) {
      this.score = (Double) __fieldVal;
    }
    else    if ("formattedscore".equals(__fieldName)) {
      this.formattedscore = (Double) __fieldVal;
    }
    else    if ("comm_cnt".equals(__fieldName)) {
      this.comm_cnt = (Integer) __fieldVal;
    }
    else    if ("des_trading_areas".equals(__fieldName)) {
      this.des_trading_areas = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Long) __fieldVal;
      return true;
    }
    else    if ("hotel_seq".equals(__fieldName)) {
      this.hotel_seq = (String) __fieldVal;
      return true;
    }
    else    if ("city_code".equals(__fieldName)) {
      this.city_code = (String) __fieldVal;
      return true;
    }
    else    if ("name".equals(__fieldName)) {
      this.name = (String) __fieldVal;
      return true;
    }
    else    if ("address".equals(__fieldName)) {
      this.address = (String) __fieldVal;
      return true;
    }
    else    if ("area".equals(__fieldName)) {
      this.area = (String) __fieldVal;
      return true;
    }
    else    if ("city_tags".equals(__fieldName)) {
      this.city_tags = (String) __fieldVal;
      return true;
    }
    else    if ("star".equals(__fieldName)) {
      this.star = (Integer) __fieldVal;
      return true;
    }
    else    if ("grade".equals(__fieldName)) {
      this.grade = (Integer) __fieldVal;
      return true;
    }
    else    if ("brand".equals(__fieldName)) {
      this.brand = (String) __fieldVal;
      return true;
    }
    else    if ("notes".equals(__fieldName)) {
      this.notes = (String) __fieldVal;
      return true;
    }
    else    if ("one_sentence".equals(__fieldName)) {
      this.one_sentence = (String) __fieldVal;
      return true;
    }
    else    if ("lowest_price".equals(__fieldName)) {
      this.lowest_price = (Integer) __fieldVal;
      return true;
    }
    else    if ("phone_number".equals(__fieldName)) {
      this.phone_number = (String) __fieldVal;
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
    else    if ("operating_status".equals(__fieldName)) {
      this.operating_status = (Integer) __fieldVal;
      return true;
    }
    else    if ("comment_summary".equals(__fieldName)) {
      this.comment_summary = (String) __fieldVal;
      return true;
    }
    else    if ("types".equals(__fieldName)) {
      this.types = (String) __fieldVal;
      return true;
    }
    else    if ("thumbnail_id".equals(__fieldName)) {
      this.thumbnail_id = (String) __fieldVal;
      return true;
    }
    else    if ("trading_areas".equals(__fieldName)) {
      this.trading_areas = (String) __fieldVal;
      return true;
    }
    else    if ("online_status".equals(__fieldName)) {
      this.online_status = (Integer) __fieldVal;
      return true;
    }
    else    if ("comment".equals(__fieldName)) {
      this.comment = (String) __fieldVal;
      return true;
    }
    else    if ("level".equals(__fieldName)) {
      this.level = (Integer) __fieldVal;
      return true;
    }
    else    if ("attrs".equals(__fieldName)) {
      this.attrs = (String) __fieldVal;
      return true;
    }
    else    if ("last_mod".equals(__fieldName)) {
      this.last_mod = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("is_inland".equals(__fieldName)) {
      this.is_inland = (Boolean) __fieldVal;
      return true;
    }
    else    if ("area_id".equals(__fieldName)) {
      this.area_id = (Long) __fieldVal;
      return true;
    }
    else    if ("short_addr".equals(__fieldName)) {
      this.short_addr = (String) __fieldVal;
      return true;
    }
    else    if ("operator".equals(__fieldName)) {
      this.operator = (String) __fieldVal;
      return true;
    }
    else    if ("score".equals(__fieldName)) {
      this.score = (Double) __fieldVal;
      return true;
    }
    else    if ("formattedscore".equals(__fieldName)) {
      this.formattedscore = (Double) __fieldVal;
      return true;
    }
    else    if ("comm_cnt".equals(__fieldName)) {
      this.comm_cnt = (Integer) __fieldVal;
      return true;
    }
    else    if ("des_trading_areas".equals(__fieldName)) {
      this.des_trading_areas = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
