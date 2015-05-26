// ORM class for table 'dwd_com_team_hotle_rel'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jan 08 18:34:23 CST 2015
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

public class dwd_com_team_hotle_rel extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer team_id;
  public Integer get_team_id() {
    return team_id;
  }
  public void set_team_id(Integer team_id) {
    this.team_id = team_id;
  }
  public dwd_com_team_hotle_rel with_team_id(Integer team_id) {
    this.team_id = team_id;
    return this;
  }
  private String hotel_seq;
  public String get_hotel_seq() {
    return hotel_seq;
  }
  public void set_hotel_seq(String hotel_seq) {
    this.hotel_seq = hotel_seq;
  }
  public dwd_com_team_hotle_rel with_hotel_seq(String hotel_seq) {
    this.hotel_seq = hotel_seq;
    return this;
  }
  private String hotel_name;
  public String get_hotel_name() {
    return hotel_name;
  }
  public void set_hotel_name(String hotel_name) {
    this.hotel_name = hotel_name;
  }
  public dwd_com_team_hotle_rel with_hotel_name(String hotel_name) {
    this.hotel_name = hotel_name;
    return this;
  }
  private String hotel_city;
  public String get_hotel_city() {
    return hotel_city;
  }
  public void set_hotel_city(String hotel_city) {
    this.hotel_city = hotel_city;
  }
  public dwd_com_team_hotle_rel with_hotel_city(String hotel_city) {
    this.hotel_city = hotel_city;
    return this;
  }
  private String hotel_city_name;
  public String get_hotel_city_name() {
    return hotel_city_name;
  }
  public void set_hotel_city_name(String hotel_city_name) {
    this.hotel_city_name = hotel_city_name;
  }
  public dwd_com_team_hotle_rel with_hotel_city_name(String hotel_city_name) {
    this.hotel_city_name = hotel_city_name;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dwd_com_team_hotle_rel)) {
      return false;
    }
    dwd_com_team_hotle_rel that = (dwd_com_team_hotle_rel) o;
    boolean equal = true;
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.hotel_seq == null ? that.hotel_seq == null : this.hotel_seq.equals(that.hotel_seq));
    equal = equal && (this.hotel_name == null ? that.hotel_name == null : this.hotel_name.equals(that.hotel_name));
    equal = equal && (this.hotel_city == null ? that.hotel_city == null : this.hotel_city.equals(that.hotel_city));
    equal = equal && (this.hotel_city_name == null ? that.hotel_city_name == null : this.hotel_city_name.equals(that.hotel_city_name));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dwd_com_team_hotle_rel)) {
      return false;
    }
    dwd_com_team_hotle_rel that = (dwd_com_team_hotle_rel) o;
    boolean equal = true;
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.hotel_seq == null ? that.hotel_seq == null : this.hotel_seq.equals(that.hotel_seq));
    equal = equal && (this.hotel_name == null ? that.hotel_name == null : this.hotel_name.equals(that.hotel_name));
    equal = equal && (this.hotel_city == null ? that.hotel_city == null : this.hotel_city.equals(that.hotel_city));
    equal = equal && (this.hotel_city_name == null ? that.hotel_city_name == null : this.hotel_city_name.equals(that.hotel_city_name));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.team_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.hotel_seq = JdbcWritableBridge.readString(2, __dbResults);
    this.hotel_name = JdbcWritableBridge.readString(3, __dbResults);
    this.hotel_city = JdbcWritableBridge.readString(4, __dbResults);
    this.hotel_city_name = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.team_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.hotel_seq = JdbcWritableBridge.readString(2, __dbResults);
    this.hotel_name = JdbcWritableBridge.readString(3, __dbResults);
    this.hotel_city = JdbcWritableBridge.readString(4, __dbResults);
    this.hotel_city_name = JdbcWritableBridge.readString(5, __dbResults);
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
    JdbcWritableBridge.writeInteger(team_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(hotel_seq, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_city, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_city_name, 5 + __off, 12, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(team_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(hotel_seq, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_city, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_city_name, 5 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.team_id = null;
    } else {
    this.team_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_seq = null;
    } else {
    this.hotel_seq = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_name = null;
    } else {
    this.hotel_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_city = null;
    } else {
    this.hotel_city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_city_name = null;
    } else {
    this.hotel_city_name = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.team_id);
    }
    if (null == this.hotel_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_seq);
    }
    if (null == this.hotel_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_name);
    }
    if (null == this.hotel_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_city);
    }
    if (null == this.hotel_city_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_city_name);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.team_id);
    }
    if (null == this.hotel_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_seq);
    }
    if (null == this.hotel_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_name);
    }
    if (null == this.hotel_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_city);
    }
    if (null == this.hotel_city_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_city_name);
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
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_seq==null?"null":hotel_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_name==null?"null":hotel_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_city==null?"null":hotel_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_city_name==null?"null":hotel_city_name, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_seq==null?"null":hotel_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_name==null?"null":hotel_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_city==null?"null":hotel_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hotel_city_name==null?"null":hotel_city_name, delimiters));
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_seq = null; } else {
      this.hotel_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_name = null; } else {
      this.hotel_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_city = null; } else {
      this.hotel_city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_city_name = null; } else {
      this.hotel_city_name = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_seq = null; } else {
      this.hotel_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_name = null; } else {
      this.hotel_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_city = null; } else {
      this.hotel_city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.hotel_city_name = null; } else {
      this.hotel_city_name = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    dwd_com_team_hotle_rel o = (dwd_com_team_hotle_rel) super.clone();
    return o;
  }

  public void clone0(dwd_com_team_hotle_rel o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("hotel_seq", this.hotel_seq);
    __sqoop$field_map.put("hotel_name", this.hotel_name);
    __sqoop$field_map.put("hotel_city", this.hotel_city);
    __sqoop$field_map.put("hotel_city_name", this.hotel_city_name);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("hotel_seq", this.hotel_seq);
    __sqoop$field_map.put("hotel_name", this.hotel_name);
    __sqoop$field_map.put("hotel_city", this.hotel_city);
    __sqoop$field_map.put("hotel_city_name", this.hotel_city_name);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("team_id".equals(__fieldName)) {
      this.team_id = (Integer) __fieldVal;
    }
    else    if ("hotel_seq".equals(__fieldName)) {
      this.hotel_seq = (String) __fieldVal;
    }
    else    if ("hotel_name".equals(__fieldName)) {
      this.hotel_name = (String) __fieldVal;
    }
    else    if ("hotel_city".equals(__fieldName)) {
      this.hotel_city = (String) __fieldVal;
    }
    else    if ("hotel_city_name".equals(__fieldName)) {
      this.hotel_city_name = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("team_id".equals(__fieldName)) {
      this.team_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("hotel_seq".equals(__fieldName)) {
      this.hotel_seq = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_name".equals(__fieldName)) {
      this.hotel_name = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_city".equals(__fieldName)) {
      this.hotel_city = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_city_name".equals(__fieldName)) {
      this.hotel_city_name = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
