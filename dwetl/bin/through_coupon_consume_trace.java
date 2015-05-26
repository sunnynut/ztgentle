// ORM class for table 'through_coupon_consume_trace'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Nov 17 18:24:25 CST 2014
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

public class through_coupon_consume_trace extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public through_coupon_consume_trace with_id(Integer id) {
    this.id = id;
    return this;
  }
  private Long through_coupon_id;
  public Long get_through_coupon_id() {
    return through_coupon_id;
  }
  public void set_through_coupon_id(Long through_coupon_id) {
    this.through_coupon_id = through_coupon_id;
  }
  public through_coupon_consume_trace with_through_coupon_id(Long through_coupon_id) {
    this.through_coupon_id = through_coupon_id;
    return this;
  }
  private String operate_type;
  public String get_operate_type() {
    return operate_type;
  }
  public void set_operate_type(String operate_type) {
    this.operate_type = operate_type;
  }
  public through_coupon_consume_trace with_operate_type(String operate_type) {
    this.operate_type = operate_type;
    return this;
  }
  private java.sql.Timestamp operate_time;
  public java.sql.Timestamp get_operate_time() {
    return operate_time;
  }
  public void set_operate_time(java.sql.Timestamp operate_time) {
    this.operate_time = operate_time;
  }
  public through_coupon_consume_trace with_operate_time(java.sql.Timestamp operate_time) {
    this.operate_time = operate_time;
    return this;
  }
  private Long user_id;
  public Long get_user_id() {
    return user_id;
  }
  public void set_user_id(Long user_id) {
    this.user_id = user_id;
  }
  public through_coupon_consume_trace with_user_id(Long user_id) {
    this.user_id = user_id;
    return this;
  }
  private Long partner_id;
  public Long get_partner_id() {
    return partner_id;
  }
  public void set_partner_id(Long partner_id) {
    this.partner_id = partner_id;
  }
  public through_coupon_consume_trace with_partner_id(Long partner_id) {
    this.partner_id = partner_id;
    return this;
  }
  private Long shop_id;
  public Long get_shop_id() {
    return shop_id;
  }
  public void set_shop_id(Long shop_id) {
    this.shop_id = shop_id;
  }
  public through_coupon_consume_trace with_shop_id(Long shop_id) {
    this.shop_id = shop_id;
    return this;
  }
  private Long team_id;
  public Long get_team_id() {
    return team_id;
  }
  public void set_team_id(Long team_id) {
    this.team_id = team_id;
  }
  public through_coupon_consume_trace with_team_id(Long team_id) {
    this.team_id = team_id;
    return this;
  }
  private Long order_id;
  public Long get_order_id() {
    return order_id;
  }
  public void set_order_id(Long order_id) {
    this.order_id = order_id;
  }
  public through_coupon_consume_trace with_order_id(Long order_id) {
    this.order_id = order_id;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof through_coupon_consume_trace)) {
      return false;
    }
    through_coupon_consume_trace that = (through_coupon_consume_trace) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.through_coupon_id == null ? that.through_coupon_id == null : this.through_coupon_id.equals(that.through_coupon_id));
    equal = equal && (this.operate_type == null ? that.operate_type == null : this.operate_type.equals(that.operate_type));
    equal = equal && (this.operate_time == null ? that.operate_time == null : this.operate_time.equals(that.operate_time));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.shop_id == null ? that.shop_id == null : this.shop_id.equals(that.shop_id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof through_coupon_consume_trace)) {
      return false;
    }
    through_coupon_consume_trace that = (through_coupon_consume_trace) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.through_coupon_id == null ? that.through_coupon_id == null : this.through_coupon_id.equals(that.through_coupon_id));
    equal = equal && (this.operate_type == null ? that.operate_type == null : this.operate_type.equals(that.operate_type));
    equal = equal && (this.operate_time == null ? that.operate_time == null : this.operate_time.equals(that.operate_time));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.shop_id == null ? that.shop_id == null : this.shop_id.equals(that.shop_id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.through_coupon_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.operate_type = JdbcWritableBridge.readString(3, __dbResults);
    this.operate_time = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.user_id = JdbcWritableBridge.readLong(5, __dbResults);
    this.partner_id = JdbcWritableBridge.readLong(6, __dbResults);
    this.shop_id = JdbcWritableBridge.readLong(7, __dbResults);
    this.team_id = JdbcWritableBridge.readLong(8, __dbResults);
    this.order_id = JdbcWritableBridge.readLong(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.through_coupon_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.operate_type = JdbcWritableBridge.readString(3, __dbResults);
    this.operate_time = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.user_id = JdbcWritableBridge.readLong(5, __dbResults);
    this.partner_id = JdbcWritableBridge.readLong(6, __dbResults);
    this.shop_id = JdbcWritableBridge.readLong(7, __dbResults);
    this.team_id = JdbcWritableBridge.readLong(8, __dbResults);
    this.order_id = JdbcWritableBridge.readLong(9, __dbResults);
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
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(through_coupon_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(operate_type, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(operate_time, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(user_id, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(partner_id, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(shop_id, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(team_id, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(order_id, 9 + __off, -5, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(through_coupon_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(operate_type, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(operate_time, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(user_id, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(partner_id, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(shop_id, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(team_id, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(order_id, 9 + __off, -5, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.through_coupon_id = null;
    } else {
    this.through_coupon_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.operate_type = null;
    } else {
    this.operate_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.operate_time = null;
    } else {
    this.operate_time = new Timestamp(__dataIn.readLong());
    this.operate_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_id = null;
    } else {
    this.user_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.partner_id = null;
    } else {
    this.partner_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.shop_id = null;
    } else {
    this.shop_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.team_id = null;
    } else {
    this.team_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.order_id = null;
    } else {
    this.order_id = Long.valueOf(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.through_coupon_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.through_coupon_id);
    }
    if (null == this.operate_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, operate_type);
    }
    if (null == this.operate_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.operate_time.getTime());
    __dataOut.writeInt(this.operate_time.getNanos());
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_id);
    }
    if (null == this.partner_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.partner_id);
    }
    if (null == this.shop_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.shop_id);
    }
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.team_id);
    }
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_id);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.through_coupon_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.through_coupon_id);
    }
    if (null == this.operate_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, operate_type);
    }
    if (null == this.operate_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.operate_time.getTime());
    __dataOut.writeInt(this.operate_time.getNanos());
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_id);
    }
    if (null == this.partner_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.partner_id);
    }
    if (null == this.shop_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.shop_id);
    }
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.team_id);
    }
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_id);
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
    __sb.append(FieldFormatter.escapeAndEnclose(through_coupon_id==null?"null":"" + through_coupon_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(operate_type==null?"null":operate_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(operate_time==null?"null":"" + operate_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shop_id==null?"null":"" + shop_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":"" + order_id, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(through_coupon_id==null?"null":"" + through_coupon_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(operate_type==null?"null":operate_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(operate_time==null?"null":"" + operate_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shop_id==null?"null":"" + shop_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":"" + order_id, delimiters));
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
      this.id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.through_coupon_id = null; } else {
      this.through_coupon_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.operate_type = null; } else {
      this.operate_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.operate_time = null; } else {
      this.operate_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.partner_id = null; } else {
      this.partner_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shop_id = null; } else {
      this.shop_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_id = null; } else {
      this.order_id = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.through_coupon_id = null; } else {
      this.through_coupon_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.operate_type = null; } else {
      this.operate_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.operate_time = null; } else {
      this.operate_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.partner_id = null; } else {
      this.partner_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shop_id = null; } else {
      this.shop_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_id = null; } else {
      this.order_id = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    through_coupon_consume_trace o = (through_coupon_consume_trace) super.clone();
    o.operate_time = (o.operate_time != null) ? (java.sql.Timestamp) o.operate_time.clone() : null;
    return o;
  }

  public void clone0(through_coupon_consume_trace o) throws CloneNotSupportedException {
    o.operate_time = (o.operate_time != null) ? (java.sql.Timestamp) o.operate_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("through_coupon_id", this.through_coupon_id);
    __sqoop$field_map.put("operate_type", this.operate_type);
    __sqoop$field_map.put("operate_time", this.operate_time);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("shop_id", this.shop_id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("order_id", this.order_id);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("through_coupon_id", this.through_coupon_id);
    __sqoop$field_map.put("operate_type", this.operate_type);
    __sqoop$field_map.put("operate_time", this.operate_time);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("shop_id", this.shop_id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("order_id", this.order_id);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("through_coupon_id".equals(__fieldName)) {
      this.through_coupon_id = (Long) __fieldVal;
    }
    else    if ("operate_type".equals(__fieldName)) {
      this.operate_type = (String) __fieldVal;
    }
    else    if ("operate_time".equals(__fieldName)) {
      this.operate_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Long) __fieldVal;
    }
    else    if ("partner_id".equals(__fieldName)) {
      this.partner_id = (Long) __fieldVal;
    }
    else    if ("shop_id".equals(__fieldName)) {
      this.shop_id = (Long) __fieldVal;
    }
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Long) __fieldVal;
    }
    else    if ("order_id".equals(__fieldName)) {
      this.order_id = (Long) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
      return true;
    }
    else    if ("through_coupon_id".equals(__fieldName)) {
      this.through_coupon_id = (Long) __fieldVal;
      return true;
    }
    else    if ("operate_type".equals(__fieldName)) {
      this.operate_type = (String) __fieldVal;
      return true;
    }
    else    if ("operate_time".equals(__fieldName)) {
      this.operate_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Long) __fieldVal;
      return true;
    }
    else    if ("partner_id".equals(__fieldName)) {
      this.partner_id = (Long) __fieldVal;
      return true;
    }
    else    if ("shop_id".equals(__fieldName)) {
      this.shop_id = (Long) __fieldVal;
      return true;
    }
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Long) __fieldVal;
      return true;
    }
    else    if ("order_id".equals(__fieldName)) {
      this.order_id = (Long) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
