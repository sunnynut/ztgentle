// ORM class for table 'dwa_meituan_sale_match_di'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Mar 13 15:51:12 CST 2015
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

public class dwa_meituan_sale_match_di extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private java.sql.Date stat_date;
  public java.sql.Date get_stat_date() {
    return stat_date;
  }
  public void set_stat_date(java.sql.Date stat_date) {
    this.stat_date = stat_date;
  }
  public dwa_meituan_sale_match_di with_stat_date(java.sql.Date stat_date) {
    this.stat_date = stat_date;
    return this;
  }
  private String daqu;
  public String get_daqu() {
    return daqu;
  }
  public void set_daqu(String daqu) {
    this.daqu = daqu;
  }
  public dwa_meituan_sale_match_di with_daqu(String daqu) {
    this.daqu = daqu;
    return this;
  }
  private String quyu;
  public String get_quyu() {
    return quyu;
  }
  public void set_quyu(String quyu) {
    this.quyu = quyu;
  }
  public dwa_meituan_sale_match_di with_quyu(String quyu) {
    this.quyu = quyu;
    return this;
  }
  private String city_name;
  public String get_city_name() {
    return city_name;
  }
  public void set_city_name(String city_name) {
    this.city_name = city_name;
  }
  public dwa_meituan_sale_match_di with_city_name(String city_name) {
    this.city_name = city_name;
    return this;
  }
  private String city_code;
  public String get_city_code() {
    return city_code;
  }
  public void set_city_code(String city_code) {
    this.city_code = city_code;
  }
  public dwa_meituan_sale_match_di with_city_code(String city_code) {
    this.city_code = city_code;
    return this;
  }
  private String hotel_star;
  public String get_hotel_star() {
    return hotel_star;
  }
  public void set_hotel_star(String hotel_star) {
    this.hotel_star = hotel_star;
  }
  public dwa_meituan_sale_match_di with_hotel_star(String hotel_star) {
    this.hotel_star = hotel_star;
    return this;
  }
  private Long room_night;
  public Long get_room_night() {
    return room_night;
  }
  public void set_room_night(Long room_night) {
    this.room_night = room_night;
  }
  public dwa_meituan_sale_match_di with_room_night(Long room_night) {
    this.room_night = room_night;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dwa_meituan_sale_match_di)) {
      return false;
    }
    dwa_meituan_sale_match_di that = (dwa_meituan_sale_match_di) o;
    boolean equal = true;
    equal = equal && (this.stat_date == null ? that.stat_date == null : this.stat_date.equals(that.stat_date));
    equal = equal && (this.daqu == null ? that.daqu == null : this.daqu.equals(that.daqu));
    equal = equal && (this.quyu == null ? that.quyu == null : this.quyu.equals(that.quyu));
    equal = equal && (this.city_name == null ? that.city_name == null : this.city_name.equals(that.city_name));
    equal = equal && (this.city_code == null ? that.city_code == null : this.city_code.equals(that.city_code));
    equal = equal && (this.hotel_star == null ? that.hotel_star == null : this.hotel_star.equals(that.hotel_star));
    equal = equal && (this.room_night == null ? that.room_night == null : this.room_night.equals(that.room_night));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dwa_meituan_sale_match_di)) {
      return false;
    }
    dwa_meituan_sale_match_di that = (dwa_meituan_sale_match_di) o;
    boolean equal = true;
    equal = equal && (this.stat_date == null ? that.stat_date == null : this.stat_date.equals(that.stat_date));
    equal = equal && (this.daqu == null ? that.daqu == null : this.daqu.equals(that.daqu));
    equal = equal && (this.quyu == null ? that.quyu == null : this.quyu.equals(that.quyu));
    equal = equal && (this.city_name == null ? that.city_name == null : this.city_name.equals(that.city_name));
    equal = equal && (this.city_code == null ? that.city_code == null : this.city_code.equals(that.city_code));
    equal = equal && (this.hotel_star == null ? that.hotel_star == null : this.hotel_star.equals(that.hotel_star));
    equal = equal && (this.room_night == null ? that.room_night == null : this.room_night.equals(that.room_night));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.stat_date = JdbcWritableBridge.readDate(1, __dbResults);
    this.daqu = JdbcWritableBridge.readString(2, __dbResults);
    this.quyu = JdbcWritableBridge.readString(3, __dbResults);
    this.city_name = JdbcWritableBridge.readString(4, __dbResults);
    this.city_code = JdbcWritableBridge.readString(5, __dbResults);
    this.hotel_star = JdbcWritableBridge.readString(6, __dbResults);
    this.room_night = JdbcWritableBridge.readLong(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.stat_date = JdbcWritableBridge.readDate(1, __dbResults);
    this.daqu = JdbcWritableBridge.readString(2, __dbResults);
    this.quyu = JdbcWritableBridge.readString(3, __dbResults);
    this.city_name = JdbcWritableBridge.readString(4, __dbResults);
    this.city_code = JdbcWritableBridge.readString(5, __dbResults);
    this.hotel_star = JdbcWritableBridge.readString(6, __dbResults);
    this.room_night = JdbcWritableBridge.readLong(7, __dbResults);
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
    JdbcWritableBridge.writeDate(stat_date, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(daqu, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(quyu, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_star, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(room_night, 7 + __off, -5, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(stat_date, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(daqu, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(quyu, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_star, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(room_night, 7 + __off, -5, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.stat_date = null;
    } else {
    this.stat_date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.daqu = null;
    } else {
    this.daqu = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.quyu = null;
    } else {
    this.quyu = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city_name = null;
    } else {
    this.city_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city_code = null;
    } else {
    this.city_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_star = null;
    } else {
    this.hotel_star = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.room_night = null;
    } else {
    this.room_night = Long.valueOf(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.stat_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.stat_date.getTime());
    }
    if (null == this.daqu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, daqu);
    }
    if (null == this.quyu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, quyu);
    }
    if (null == this.city_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_name);
    }
    if (null == this.city_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_code);
    }
    if (null == this.hotel_star) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_star);
    }
    if (null == this.room_night) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.room_night);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.stat_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.stat_date.getTime());
    }
    if (null == this.daqu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, daqu);
    }
    if (null == this.quyu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, quyu);
    }
    if (null == this.city_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_name);
    }
    if (null == this.city_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city_code);
    }
    if (null == this.hotel_star) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_star);
    }
    if (null == this.room_night) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.room_night);
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
    __sb.append(FieldFormatter.escapeAndEnclose(stat_date==null?"null":"" + stat_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(daqu==null?"null":daqu, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quyu==null?"null":quyu, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_name==null?"null":city_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_code==null?"null":city_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_star==null?"null":hotel_star, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(room_night==null?"null":"" + room_night, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(stat_date==null?"null":"" + stat_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(daqu==null?"null":daqu, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quyu==null?"null":quyu, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_name==null?"null":city_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_code==null?"null":city_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_star==null?"null":hotel_star, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(room_night==null?"null":"" + room_night, delimiters));
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.stat_date = null; } else {
      this.stat_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.daqu = null; } else {
      this.daqu = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.quyu = null; } else {
      this.quyu = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.city_name = null; } else {
      this.city_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.city_code = null; } else {
      this.city_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_star = null; } else {
      this.hotel_star = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.room_night = null; } else {
      this.room_night = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.stat_date = null; } else {
      this.stat_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.daqu = null; } else {
      this.daqu = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.quyu = null; } else {
      this.quyu = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.city_name = null; } else {
      this.city_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.city_code = null; } else {
      this.city_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_star = null; } else {
      this.hotel_star = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.room_night = null; } else {
      this.room_night = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    dwa_meituan_sale_match_di o = (dwa_meituan_sale_match_di) super.clone();
    o.stat_date = (o.stat_date != null) ? (java.sql.Date) o.stat_date.clone() : null;
    return o;
  }

  public void clone0(dwa_meituan_sale_match_di o) throws CloneNotSupportedException {
    o.stat_date = (o.stat_date != null) ? (java.sql.Date) o.stat_date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("stat_date", this.stat_date);
    __sqoop$field_map.put("daqu", this.daqu);
    __sqoop$field_map.put("quyu", this.quyu);
    __sqoop$field_map.put("city_name", this.city_name);
    __sqoop$field_map.put("city_code", this.city_code);
    __sqoop$field_map.put("hotel_star", this.hotel_star);
    __sqoop$field_map.put("room_night", this.room_night);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("stat_date", this.stat_date);
    __sqoop$field_map.put("daqu", this.daqu);
    __sqoop$field_map.put("quyu", this.quyu);
    __sqoop$field_map.put("city_name", this.city_name);
    __sqoop$field_map.put("city_code", this.city_code);
    __sqoop$field_map.put("hotel_star", this.hotel_star);
    __sqoop$field_map.put("room_night", this.room_night);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("stat_date".equals(__fieldName)) {
      this.stat_date = (java.sql.Date) __fieldVal;
    }
    else    if ("daqu".equals(__fieldName)) {
      this.daqu = (String) __fieldVal;
    }
    else    if ("quyu".equals(__fieldName)) {
      this.quyu = (String) __fieldVal;
    }
    else    if ("city_name".equals(__fieldName)) {
      this.city_name = (String) __fieldVal;
    }
    else    if ("city_code".equals(__fieldName)) {
      this.city_code = (String) __fieldVal;
    }
    else    if ("hotel_star".equals(__fieldName)) {
      this.hotel_star = (String) __fieldVal;
    }
    else    if ("room_night".equals(__fieldName)) {
      this.room_night = (Long) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("stat_date".equals(__fieldName)) {
      this.stat_date = (java.sql.Date) __fieldVal;
      return true;
    }
    else    if ("daqu".equals(__fieldName)) {
      this.daqu = (String) __fieldVal;
      return true;
    }
    else    if ("quyu".equals(__fieldName)) {
      this.quyu = (String) __fieldVal;
      return true;
    }
    else    if ("city_name".equals(__fieldName)) {
      this.city_name = (String) __fieldVal;
      return true;
    }
    else    if ("city_code".equals(__fieldName)) {
      this.city_code = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_star".equals(__fieldName)) {
      this.hotel_star = (String) __fieldVal;
      return true;
    }
    else    if ("room_night".equals(__fieldName)) {
      this.room_night = (Long) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
