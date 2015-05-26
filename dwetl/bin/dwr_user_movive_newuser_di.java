// ORM class for table 'dwr_user_movive_newuser_di'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Mar 03 20:19:05 CST 2015
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

public class dwr_user_movive_newuser_di extends SqoopRecord  implements DBWritable, Writable {
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
  public dwr_user_movive_newuser_di with_stat_date(String stat_date) {
    this.stat_date = stat_date;
    return this;
  }
  private String user_center_id;
  public String get_user_center_id() {
    return user_center_id;
  }
  public void set_user_center_id(String user_center_id) {
    this.user_center_id = user_center_id;
  }
  public dwr_user_movive_newuser_di with_user_center_id(String user_center_id) {
    this.user_center_id = user_center_id;
    return this;
  }
  private String first_order_no;
  public String get_first_order_no() {
    return first_order_no;
  }
  public void set_first_order_no(String first_order_no) {
    this.first_order_no = first_order_no;
  }
  public dwr_user_movive_newuser_di with_first_order_no(String first_order_no) {
    this.first_order_no = first_order_no;
    return this;
  }
  private String user_device_id;
  public String get_user_device_id() {
    return user_device_id;
  }
  public void set_user_device_id(String user_device_id) {
    this.user_device_id = user_device_id;
  }
  public dwr_user_movive_newuser_di with_user_device_id(String user_device_id) {
    this.user_device_id = user_device_id;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dwr_user_movive_newuser_di)) {
      return false;
    }
    dwr_user_movive_newuser_di that = (dwr_user_movive_newuser_di) o;
    boolean equal = true;
    equal = equal && (this.stat_date == null ? that.stat_date == null : this.stat_date.equals(that.stat_date));
    equal = equal && (this.user_center_id == null ? that.user_center_id == null : this.user_center_id.equals(that.user_center_id));
    equal = equal && (this.first_order_no == null ? that.first_order_no == null : this.first_order_no.equals(that.first_order_no));
    equal = equal && (this.user_device_id == null ? that.user_device_id == null : this.user_device_id.equals(that.user_device_id));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dwr_user_movive_newuser_di)) {
      return false;
    }
    dwr_user_movive_newuser_di that = (dwr_user_movive_newuser_di) o;
    boolean equal = true;
    equal = equal && (this.stat_date == null ? that.stat_date == null : this.stat_date.equals(that.stat_date));
    equal = equal && (this.user_center_id == null ? that.user_center_id == null : this.user_center_id.equals(that.user_center_id));
    equal = equal && (this.first_order_no == null ? that.first_order_no == null : this.first_order_no.equals(that.first_order_no));
    equal = equal && (this.user_device_id == null ? that.user_device_id == null : this.user_device_id.equals(that.user_device_id));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.stat_date = JdbcWritableBridge.readString(1, __dbResults);
    this.user_center_id = JdbcWritableBridge.readString(2, __dbResults);
    this.first_order_no = JdbcWritableBridge.readString(3, __dbResults);
    this.user_device_id = JdbcWritableBridge.readString(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.stat_date = JdbcWritableBridge.readString(1, __dbResults);
    this.user_center_id = JdbcWritableBridge.readString(2, __dbResults);
    this.first_order_no = JdbcWritableBridge.readString(3, __dbResults);
    this.user_device_id = JdbcWritableBridge.readString(4, __dbResults);
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
    JdbcWritableBridge.writeString(user_center_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(first_order_no, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(user_device_id, 4 + __off, 12, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(stat_date, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(user_center_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(first_order_no, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(user_device_id, 4 + __off, 12, __dbStmt);
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
        this.user_center_id = null;
    } else {
    this.user_center_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.first_order_no = null;
    } else {
    this.first_order_no = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.user_device_id = null;
    } else {
    this.user_device_id = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.stat_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stat_date);
    }
    if (null == this.user_center_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_center_id);
    }
    if (null == this.first_order_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, first_order_no);
    }
    if (null == this.user_device_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_device_id);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.stat_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stat_date);
    }
    if (null == this.user_center_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_center_id);
    }
    if (null == this.first_order_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, first_order_no);
    }
    if (null == this.user_device_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_device_id);
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
    __sb.append(FieldFormatter.escapeAndEnclose(user_center_id==null?"null":user_center_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_order_no==null?"null":first_order_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_device_id==null?"null":user_device_id, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(stat_date==null?"null":stat_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_center_id==null?"null":user_center_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_order_no==null?"null":first_order_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_device_id==null?"null":user_device_id, delimiters));
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
    if (__cur_str.equals("\\N")) { this.user_center_id = null; } else {
      this.user_center_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.first_order_no = null; } else {
      this.first_order_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.user_device_id = null; } else {
      this.user_device_id = __cur_str;
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
    if (__cur_str.equals("\\N")) { this.user_center_id = null; } else {
      this.user_center_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.first_order_no = null; } else {
      this.first_order_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.user_device_id = null; } else {
      this.user_device_id = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    dwr_user_movive_newuser_di o = (dwr_user_movive_newuser_di) super.clone();
    return o;
  }

  public void clone0(dwr_user_movive_newuser_di o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("stat_date", this.stat_date);
    __sqoop$field_map.put("user_center_id", this.user_center_id);
    __sqoop$field_map.put("first_order_no", this.first_order_no);
    __sqoop$field_map.put("user_device_id", this.user_device_id);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("stat_date", this.stat_date);
    __sqoop$field_map.put("user_center_id", this.user_center_id);
    __sqoop$field_map.put("first_order_no", this.first_order_no);
    __sqoop$field_map.put("user_device_id", this.user_device_id);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("stat_date".equals(__fieldName)) {
      this.stat_date = (String) __fieldVal;
    }
    else    if ("user_center_id".equals(__fieldName)) {
      this.user_center_id = (String) __fieldVal;
    }
    else    if ("first_order_no".equals(__fieldName)) {
      this.first_order_no = (String) __fieldVal;
    }
    else    if ("user_device_id".equals(__fieldName)) {
      this.user_device_id = (String) __fieldVal;
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
    else    if ("user_center_id".equals(__fieldName)) {
      this.user_center_id = (String) __fieldVal;
      return true;
    }
    else    if ("first_order_no".equals(__fieldName)) {
      this.first_order_no = (String) __fieldVal;
      return true;
    }
    else    if ("user_device_id".equals(__fieldName)) {
      this.user_device_id = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
