// ORM class for table 'team_2dcode'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Nov 17 16:55:31 CST 2014
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

public class team_2dcode extends SqoopRecord  implements DBWritable, Writable {
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
  public team_2dcode with_id(Long id) {
    this.id = id;
    return this;
  }
  private Integer team_id;
  public Integer get_team_id() {
    return team_id;
  }
  public void set_team_id(Integer team_id) {
    this.team_id = team_id;
  }
  public team_2dcode with_team_id(Integer team_id) {
    this.team_id = team_id;
    return this;
  }
  private Integer vendor_id;
  public Integer get_vendor_id() {
    return vendor_id;
  }
  public void set_vendor_id(Integer vendor_id) {
    this.vendor_id = vendor_id;
  }
  public team_2dcode with_vendor_id(Integer vendor_id) {
    this.vendor_id = vendor_id;
    return this;
  }
  private String events;
  public String get_events() {
    return events;
  }
  public void set_events(String events) {
    this.events = events;
  }
  public team_2dcode with_events(String events) {
    this.events = events;
    return this;
  }
  private String products;
  public String get_products() {
    return products;
  }
  public void set_products(String products) {
    this.products = products;
  }
  public team_2dcode with_products(String products) {
    this.products = products;
    return this;
  }
  private String scenery_id;
  public String get_scenery_id() {
    return scenery_id;
  }
  public void set_scenery_id(String scenery_id) {
    this.scenery_id = scenery_id;
  }
  public team_2dcode with_scenery_id(String scenery_id) {
    this.scenery_id = scenery_id;
    return this;
  }
  private String scenery_name;
  public String get_scenery_name() {
    return scenery_name;
  }
  public void set_scenery_name(String scenery_name) {
    this.scenery_name = scenery_name;
  }
  public team_2dcode with_scenery_name(String scenery_name) {
    this.scenery_name = scenery_name;
    return this;
  }
  private String tickettype_id;
  public String get_tickettype_id() {
    return tickettype_id;
  }
  public void set_tickettype_id(String tickettype_id) {
    this.tickettype_id = tickettype_id;
  }
  public team_2dcode with_tickettype_id(String tickettype_id) {
    this.tickettype_id = tickettype_id;
    return this;
  }
  private String tickettype_name;
  public String get_tickettype_name() {
    return tickettype_name;
  }
  public void set_tickettype_name(String tickettype_name) {
    this.tickettype_name = tickettype_name;
  }
  public team_2dcode with_tickettype_name(String tickettype_name) {
    this.tickettype_name = tickettype_name;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof team_2dcode)) {
      return false;
    }
    team_2dcode that = (team_2dcode) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.vendor_id == null ? that.vendor_id == null : this.vendor_id.equals(that.vendor_id));
    equal = equal && (this.events == null ? that.events == null : this.events.equals(that.events));
    equal = equal && (this.products == null ? that.products == null : this.products.equals(that.products));
    equal = equal && (this.scenery_id == null ? that.scenery_id == null : this.scenery_id.equals(that.scenery_id));
    equal = equal && (this.scenery_name == null ? that.scenery_name == null : this.scenery_name.equals(that.scenery_name));
    equal = equal && (this.tickettype_id == null ? that.tickettype_id == null : this.tickettype_id.equals(that.tickettype_id));
    equal = equal && (this.tickettype_name == null ? that.tickettype_name == null : this.tickettype_name.equals(that.tickettype_name));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof team_2dcode)) {
      return false;
    }
    team_2dcode that = (team_2dcode) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.vendor_id == null ? that.vendor_id == null : this.vendor_id.equals(that.vendor_id));
    equal = equal && (this.events == null ? that.events == null : this.events.equals(that.events));
    equal = equal && (this.products == null ? that.products == null : this.products.equals(that.products));
    equal = equal && (this.scenery_id == null ? that.scenery_id == null : this.scenery_id.equals(that.scenery_id));
    equal = equal && (this.scenery_name == null ? that.scenery_name == null : this.scenery_name.equals(that.scenery_name));
    equal = equal && (this.tickettype_id == null ? that.tickettype_id == null : this.tickettype_id.equals(that.tickettype_id));
    equal = equal && (this.tickettype_name == null ? that.tickettype_name == null : this.tickettype_name.equals(that.tickettype_name));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.team_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.vendor_id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.events = JdbcWritableBridge.readString(4, __dbResults);
    this.products = JdbcWritableBridge.readString(5, __dbResults);
    this.scenery_id = JdbcWritableBridge.readString(6, __dbResults);
    this.scenery_name = JdbcWritableBridge.readString(7, __dbResults);
    this.tickettype_id = JdbcWritableBridge.readString(8, __dbResults);
    this.tickettype_name = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.team_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.vendor_id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.events = JdbcWritableBridge.readString(4, __dbResults);
    this.products = JdbcWritableBridge.readString(5, __dbResults);
    this.scenery_id = JdbcWritableBridge.readString(6, __dbResults);
    this.scenery_name = JdbcWritableBridge.readString(7, __dbResults);
    this.tickettype_id = JdbcWritableBridge.readString(8, __dbResults);
    this.tickettype_name = JdbcWritableBridge.readString(9, __dbResults);
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
    JdbcWritableBridge.writeInteger(team_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(vendor_id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(events, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(products, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(scenery_id, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(scenery_name, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tickettype_id, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tickettype_name, 9 + __off, 12, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(team_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(vendor_id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(events, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(products, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(scenery_id, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(scenery_name, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tickettype_id, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tickettype_name, 9 + __off, 12, __dbStmt);
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
        this.team_id = null;
    } else {
    this.team_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.vendor_id = null;
    } else {
    this.vendor_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.events = null;
    } else {
    this.events = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.products = null;
    } else {
    this.products = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.scenery_id = null;
    } else {
    this.scenery_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.scenery_name = null;
    } else {
    this.scenery_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tickettype_id = null;
    } else {
    this.tickettype_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tickettype_name = null;
    } else {
    this.tickettype_name = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.team_id);
    }
    if (null == this.vendor_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.vendor_id);
    }
    if (null == this.events) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, events);
    }
    if (null == this.products) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, products);
    }
    if (null == this.scenery_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, scenery_id);
    }
    if (null == this.scenery_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, scenery_name);
    }
    if (null == this.tickettype_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tickettype_id);
    }
    if (null == this.tickettype_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tickettype_name);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.team_id);
    }
    if (null == this.vendor_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.vendor_id);
    }
    if (null == this.events) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, events);
    }
    if (null == this.products) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, products);
    }
    if (null == this.scenery_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, scenery_id);
    }
    if (null == this.scenery_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, scenery_name);
    }
    if (null == this.tickettype_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tickettype_id);
    }
    if (null == this.tickettype_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tickettype_name);
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
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vendor_id==null?"null":"" + vendor_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(events==null?"null":events, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(products==null?"null":products, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(scenery_id==null?"null":scenery_id, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(scenery_name==null?"null":scenery_name, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tickettype_id==null?"null":tickettype_id, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tickettype_name==null?"null":tickettype_name, "\005", delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vendor_id==null?"null":"" + vendor_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(events==null?"null":events, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(products==null?"null":products, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(scenery_id==null?"null":scenery_id, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(scenery_name==null?"null":scenery_name, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tickettype_id==null?"null":tickettype_id, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tickettype_name==null?"null":tickettype_name, "\005", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.vendor_id = null; } else {
      this.vendor_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.events = null; } else {
      this.events = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.products = null; } else {
      this.products = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.scenery_id = null; } else {
      this.scenery_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.scenery_name = null; } else {
      this.scenery_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tickettype_id = null; } else {
      this.tickettype_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tickettype_name = null; } else {
      this.tickettype_name = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.vendor_id = null; } else {
      this.vendor_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.events = null; } else {
      this.events = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.products = null; } else {
      this.products = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.scenery_id = null; } else {
      this.scenery_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.scenery_name = null; } else {
      this.scenery_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tickettype_id = null; } else {
      this.tickettype_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tickettype_name = null; } else {
      this.tickettype_name = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    team_2dcode o = (team_2dcode) super.clone();
    return o;
  }

  public void clone0(team_2dcode o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("vendor_id", this.vendor_id);
    __sqoop$field_map.put("events", this.events);
    __sqoop$field_map.put("products", this.products);
    __sqoop$field_map.put("scenery_id", this.scenery_id);
    __sqoop$field_map.put("scenery_name", this.scenery_name);
    __sqoop$field_map.put("tickettype_id", this.tickettype_id);
    __sqoop$field_map.put("tickettype_name", this.tickettype_name);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("vendor_id", this.vendor_id);
    __sqoop$field_map.put("events", this.events);
    __sqoop$field_map.put("products", this.products);
    __sqoop$field_map.put("scenery_id", this.scenery_id);
    __sqoop$field_map.put("scenery_name", this.scenery_name);
    __sqoop$field_map.put("tickettype_id", this.tickettype_id);
    __sqoop$field_map.put("tickettype_name", this.tickettype_name);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Long) __fieldVal;
    }
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Integer) __fieldVal;
    }
    else    if ("vendor_id".equals(__fieldName)) {
      this.vendor_id = (Integer) __fieldVal;
    }
    else    if ("events".equals(__fieldName)) {
      this.events = (String) __fieldVal;
    }
    else    if ("products".equals(__fieldName)) {
      this.products = (String) __fieldVal;
    }
    else    if ("scenery_id".equals(__fieldName)) {
      this.scenery_id = (String) __fieldVal;
    }
    else    if ("scenery_name".equals(__fieldName)) {
      this.scenery_name = (String) __fieldVal;
    }
    else    if ("tickettype_id".equals(__fieldName)) {
      this.tickettype_id = (String) __fieldVal;
    }
    else    if ("tickettype_name".equals(__fieldName)) {
      this.tickettype_name = (String) __fieldVal;
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
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("vendor_id".equals(__fieldName)) {
      this.vendor_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("events".equals(__fieldName)) {
      this.events = (String) __fieldVal;
      return true;
    }
    else    if ("products".equals(__fieldName)) {
      this.products = (String) __fieldVal;
      return true;
    }
    else    if ("scenery_id".equals(__fieldName)) {
      this.scenery_id = (String) __fieldVal;
      return true;
    }
    else    if ("scenery_name".equals(__fieldName)) {
      this.scenery_name = (String) __fieldVal;
      return true;
    }
    else    if ("tickettype_id".equals(__fieldName)) {
      this.tickettype_id = (String) __fieldVal;
      return true;
    }
    else    if ("tickettype_name".equals(__fieldName)) {
      this.tickettype_name = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
