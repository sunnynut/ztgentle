// ORM class for table 'team_ext'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jan 08 15:48:39 CST 2015
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

public class team_ext extends SqoopRecord  implements DBWritable, Writable {
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
  public team_ext with_id(Long id) {
    this.id = id;
    return this;
  }
  private Long team_id;
  public Long get_team_id() {
    return team_id;
  }
  public void set_team_id(Long team_id) {
    this.team_id = team_id;
  }
  public team_ext with_team_id(Long team_id) {
    this.team_id = team_id;
    return this;
  }
  private String ctserial;
  public String get_ctserial() {
    return ctserial;
  }
  public void set_ctserial(String ctserial) {
    this.ctserial = ctserial;
  }
  public team_ext with_ctserial(String ctserial) {
    this.ctserial = ctserial;
    return this;
  }
  private java.sql.Timestamp create_time;
  public java.sql.Timestamp get_create_time() {
    return create_time;
  }
  public void set_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
  }
  public team_ext with_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
    return this;
  }
  private java.sql.Timestamp update_time;
  public java.sql.Timestamp get_update_time() {
    return update_time;
  }
  public void set_update_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
  }
  public team_ext with_update_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
    return this;
  }
  private Integer redenvelope_enable;
  public Integer get_redenvelope_enable() {
    return redenvelope_enable;
  }
  public void set_redenvelope_enable(Integer redenvelope_enable) {
    this.redenvelope_enable = redenvelope_enable;
  }
  public team_ext with_redenvelope_enable(Integer redenvelope_enable) {
    this.redenvelope_enable = redenvelope_enable;
    return this;
  }
  private Integer promotion_type;
  public Integer get_promotion_type() {
    return promotion_type;
  }
  public void set_promotion_type(Integer promotion_type) {
    this.promotion_type = promotion_type;
  }
  public team_ext with_promotion_type(Integer promotion_type) {
    this.promotion_type = promotion_type;
    return this;
  }
  private String meituan_ps_ext;
  public String get_meituan_ps_ext() {
    return meituan_ps_ext;
  }
  public void set_meituan_ps_ext(String meituan_ps_ext) {
    this.meituan_ps_ext = meituan_ps_ext;
  }
  public team_ext with_meituan_ps_ext(String meituan_ps_ext) {
    this.meituan_ps_ext = meituan_ps_ext;
    return this;
  }
  private Integer partner_id;
  public Integer get_partner_id() {
    return partner_id;
  }
  public void set_partner_id(Integer partner_id) {
    this.partner_id = partner_id;
  }
  public team_ext with_partner_id(Integer partner_id) {
    this.partner_id = partner_id;
    return this;
  }
  private Boolean stock_status;
  public Boolean get_stock_status() {
    return stock_status;
  }
  public void set_stock_status(Boolean stock_status) {
    this.stock_status = stock_status;
  }
  public team_ext with_stock_status(Boolean stock_status) {
    this.stock_status = stock_status;
    return this;
  }
  private Long price_strategy_id;
  public Long get_price_strategy_id() {
    return price_strategy_id;
  }
  public void set_price_strategy_id(Long price_strategy_id) {
    this.price_strategy_id = price_strategy_id;
  }
  public team_ext with_price_strategy_id(Long price_strategy_id) {
    this.price_strategy_id = price_strategy_id;
    return this;
  }
  private String price_strategy;
  public String get_price_strategy() {
    return price_strategy;
  }
  public void set_price_strategy(String price_strategy) {
    this.price_strategy = price_strategy;
  }
  public team_ext with_price_strategy(String price_strategy) {
    this.price_strategy = price_strategy;
    return this;
  }
  private Integer fast_payback;
  public Integer get_fast_payback() {
    return fast_payback;
  }
  public void set_fast_payback(Integer fast_payback) {
    this.fast_payback = fast_payback;
  }
  public team_ext with_fast_payback(Integer fast_payback) {
    this.fast_payback = fast_payback;
    return this;
  }
  private String camel_coin_strategy;
  public String get_camel_coin_strategy() {
    return camel_coin_strategy;
  }
  public void set_camel_coin_strategy(String camel_coin_strategy) {
    this.camel_coin_strategy = camel_coin_strategy;
  }
  public team_ext with_camel_coin_strategy(String camel_coin_strategy) {
    this.camel_coin_strategy = camel_coin_strategy;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof team_ext)) {
      return false;
    }
    team_ext that = (team_ext) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.ctserial == null ? that.ctserial == null : this.ctserial.equals(that.ctserial));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.redenvelope_enable == null ? that.redenvelope_enable == null : this.redenvelope_enable.equals(that.redenvelope_enable));
    equal = equal && (this.promotion_type == null ? that.promotion_type == null : this.promotion_type.equals(that.promotion_type));
    equal = equal && (this.meituan_ps_ext == null ? that.meituan_ps_ext == null : this.meituan_ps_ext.equals(that.meituan_ps_ext));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.stock_status == null ? that.stock_status == null : this.stock_status.equals(that.stock_status));
    equal = equal && (this.price_strategy_id == null ? that.price_strategy_id == null : this.price_strategy_id.equals(that.price_strategy_id));
    equal = equal && (this.price_strategy == null ? that.price_strategy == null : this.price_strategy.equals(that.price_strategy));
    equal = equal && (this.fast_payback == null ? that.fast_payback == null : this.fast_payback.equals(that.fast_payback));
    equal = equal && (this.camel_coin_strategy == null ? that.camel_coin_strategy == null : this.camel_coin_strategy.equals(that.camel_coin_strategy));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof team_ext)) {
      return false;
    }
    team_ext that = (team_ext) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.ctserial == null ? that.ctserial == null : this.ctserial.equals(that.ctserial));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.redenvelope_enable == null ? that.redenvelope_enable == null : this.redenvelope_enable.equals(that.redenvelope_enable));
    equal = equal && (this.promotion_type == null ? that.promotion_type == null : this.promotion_type.equals(that.promotion_type));
    equal = equal && (this.meituan_ps_ext == null ? that.meituan_ps_ext == null : this.meituan_ps_ext.equals(that.meituan_ps_ext));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.stock_status == null ? that.stock_status == null : this.stock_status.equals(that.stock_status));
    equal = equal && (this.price_strategy_id == null ? that.price_strategy_id == null : this.price_strategy_id.equals(that.price_strategy_id));
    equal = equal && (this.price_strategy == null ? that.price_strategy == null : this.price_strategy.equals(that.price_strategy));
    equal = equal && (this.fast_payback == null ? that.fast_payback == null : this.fast_payback.equals(that.fast_payback));
    equal = equal && (this.camel_coin_strategy == null ? that.camel_coin_strategy == null : this.camel_coin_strategy.equals(that.camel_coin_strategy));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.team_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.ctserial = JdbcWritableBridge.readString(3, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.redenvelope_enable = JdbcWritableBridge.readInteger(6, __dbResults);
    this.promotion_type = JdbcWritableBridge.readInteger(7, __dbResults);
    this.meituan_ps_ext = JdbcWritableBridge.readString(8, __dbResults);
    this.partner_id = JdbcWritableBridge.readInteger(9, __dbResults);
    this.stock_status = JdbcWritableBridge.readBoolean(10, __dbResults);
    this.price_strategy_id = JdbcWritableBridge.readLong(11, __dbResults);
    this.price_strategy = JdbcWritableBridge.readString(12, __dbResults);
    this.fast_payback = JdbcWritableBridge.readInteger(13, __dbResults);
    this.camel_coin_strategy = JdbcWritableBridge.readString(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.team_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.ctserial = JdbcWritableBridge.readString(3, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.redenvelope_enable = JdbcWritableBridge.readInteger(6, __dbResults);
    this.promotion_type = JdbcWritableBridge.readInteger(7, __dbResults);
    this.meituan_ps_ext = JdbcWritableBridge.readString(8, __dbResults);
    this.partner_id = JdbcWritableBridge.readInteger(9, __dbResults);
    this.stock_status = JdbcWritableBridge.readBoolean(10, __dbResults);
    this.price_strategy_id = JdbcWritableBridge.readLong(11, __dbResults);
    this.price_strategy = JdbcWritableBridge.readString(12, __dbResults);
    this.fast_payback = JdbcWritableBridge.readInteger(13, __dbResults);
    this.camel_coin_strategy = JdbcWritableBridge.readString(14, __dbResults);
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
    JdbcWritableBridge.writeLong(team_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(ctserial, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(redenvelope_enable, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(promotion_type, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(meituan_ps_ext, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(partner_id, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBoolean(stock_status, 10 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeLong(price_strategy_id, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(price_strategy, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(fast_payback, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(camel_coin_strategy, 14 + __off, 12, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(team_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(ctserial, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(redenvelope_enable, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(promotion_type, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(meituan_ps_ext, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(partner_id, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBoolean(stock_status, 10 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeLong(price_strategy_id, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(price_strategy, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(fast_payback, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(camel_coin_strategy, 14 + __off, 12, __dbStmt);
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
    this.team_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.ctserial = null;
    } else {
    this.ctserial = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.create_time = null;
    } else {
    this.create_time = new Timestamp(__dataIn.readLong());
    this.create_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.update_time = null;
    } else {
    this.update_time = new Timestamp(__dataIn.readLong());
    this.update_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.redenvelope_enable = null;
    } else {
    this.redenvelope_enable = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.promotion_type = null;
    } else {
    this.promotion_type = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.meituan_ps_ext = null;
    } else {
    this.meituan_ps_ext = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.partner_id = null;
    } else {
    this.partner_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.stock_status = null;
    } else {
    this.stock_status = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.price_strategy_id = null;
    } else {
    this.price_strategy_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.price_strategy = null;
    } else {
    this.price_strategy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fast_payback = null;
    } else {
    this.fast_payback = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.camel_coin_strategy = null;
    } else {
    this.camel_coin_strategy = Text.readString(__dataIn);
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
    __dataOut.writeLong(this.team_id);
    }
    if (null == this.ctserial) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ctserial);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time.getTime());
    __dataOut.writeInt(this.create_time.getNanos());
    }
    if (null == this.update_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_time.getTime());
    __dataOut.writeInt(this.update_time.getNanos());
    }
    if (null == this.redenvelope_enable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.redenvelope_enable);
    }
    if (null == this.promotion_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.promotion_type);
    }
    if (null == this.meituan_ps_ext) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, meituan_ps_ext);
    }
    if (null == this.partner_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.partner_id);
    }
    if (null == this.stock_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.stock_status);
    }
    if (null == this.price_strategy_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.price_strategy_id);
    }
    if (null == this.price_strategy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, price_strategy);
    }
    if (null == this.fast_payback) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fast_payback);
    }
    if (null == this.camel_coin_strategy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, camel_coin_strategy);
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
    __dataOut.writeLong(this.team_id);
    }
    if (null == this.ctserial) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ctserial);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time.getTime());
    __dataOut.writeInt(this.create_time.getNanos());
    }
    if (null == this.update_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_time.getTime());
    __dataOut.writeInt(this.update_time.getNanos());
    }
    if (null == this.redenvelope_enable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.redenvelope_enable);
    }
    if (null == this.promotion_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.promotion_type);
    }
    if (null == this.meituan_ps_ext) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, meituan_ps_ext);
    }
    if (null == this.partner_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.partner_id);
    }
    if (null == this.stock_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.stock_status);
    }
    if (null == this.price_strategy_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.price_strategy_id);
    }
    if (null == this.price_strategy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, price_strategy);
    }
    if (null == this.fast_payback) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fast_payback);
    }
    if (null == this.camel_coin_strategy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, camel_coin_strategy);
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(ctserial==null?"null":ctserial, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"null":"" + update_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(redenvelope_enable==null?"null":"" + redenvelope_enable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(promotion_type==null?"null":"" + promotion_type, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(meituan_ps_ext==null?"null":meituan_ps_ext, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_status==null?"null":"" + stock_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(price_strategy_id==null?"null":"" + price_strategy_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(price_strategy==null?"null":price_strategy, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fast_payback==null?"null":"" + fast_payback, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(camel_coin_strategy==null?"null":camel_coin_strategy, "\005", delimiters));
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(ctserial==null?"null":ctserial, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"null":"" + update_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(redenvelope_enable==null?"null":"" + redenvelope_enable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(promotion_type==null?"null":"" + promotion_type, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(meituan_ps_ext==null?"null":meituan_ps_ext, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_status==null?"null":"" + stock_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(price_strategy_id==null?"null":"" + price_strategy_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(price_strategy==null?"null":price_strategy, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fast_payback==null?"null":"" + fast_payback, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(camel_coin_strategy==null?"null":camel_coin_strategy, "\005", delimiters));
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
      this.team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ctserial = null; } else {
      this.ctserial = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_time = null; } else {
      this.update_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.redenvelope_enable = null; } else {
      this.redenvelope_enable = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.promotion_type = null; } else {
      this.promotion_type = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.meituan_ps_ext = null; } else {
      this.meituan_ps_ext = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.partner_id = null; } else {
      this.partner_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_status = null; } else {
      this.stock_status = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.price_strategy_id = null; } else {
      this.price_strategy_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.price_strategy = null; } else {
      this.price_strategy = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fast_payback = null; } else {
      this.fast_payback = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.camel_coin_strategy = null; } else {
      this.camel_coin_strategy = __cur_str;
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
      this.team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ctserial = null; } else {
      this.ctserial = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_time = null; } else {
      this.update_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.redenvelope_enable = null; } else {
      this.redenvelope_enable = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.promotion_type = null; } else {
      this.promotion_type = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.meituan_ps_ext = null; } else {
      this.meituan_ps_ext = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.partner_id = null; } else {
      this.partner_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_status = null; } else {
      this.stock_status = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.price_strategy_id = null; } else {
      this.price_strategy_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.price_strategy = null; } else {
      this.price_strategy = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fast_payback = null; } else {
      this.fast_payback = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.camel_coin_strategy = null; } else {
      this.camel_coin_strategy = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    team_ext o = (team_ext) super.clone();
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
    return o;
  }

  public void clone0(team_ext o) throws CloneNotSupportedException {
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("ctserial", this.ctserial);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("update_time", this.update_time);
    __sqoop$field_map.put("redenvelope_enable", this.redenvelope_enable);
    __sqoop$field_map.put("promotion_type", this.promotion_type);
    __sqoop$field_map.put("meituan_ps_ext", this.meituan_ps_ext);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("stock_status", this.stock_status);
    __sqoop$field_map.put("price_strategy_id", this.price_strategy_id);
    __sqoop$field_map.put("price_strategy", this.price_strategy);
    __sqoop$field_map.put("fast_payback", this.fast_payback);
    __sqoop$field_map.put("camel_coin_strategy", this.camel_coin_strategy);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("ctserial", this.ctserial);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("update_time", this.update_time);
    __sqoop$field_map.put("redenvelope_enable", this.redenvelope_enable);
    __sqoop$field_map.put("promotion_type", this.promotion_type);
    __sqoop$field_map.put("meituan_ps_ext", this.meituan_ps_ext);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("stock_status", this.stock_status);
    __sqoop$field_map.put("price_strategy_id", this.price_strategy_id);
    __sqoop$field_map.put("price_strategy", this.price_strategy);
    __sqoop$field_map.put("fast_payback", this.fast_payback);
    __sqoop$field_map.put("camel_coin_strategy", this.camel_coin_strategy);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Long) __fieldVal;
    }
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Long) __fieldVal;
    }
    else    if ("ctserial".equals(__fieldName)) {
      this.ctserial = (String) __fieldVal;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("update_time".equals(__fieldName)) {
      this.update_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("redenvelope_enable".equals(__fieldName)) {
      this.redenvelope_enable = (Integer) __fieldVal;
    }
    else    if ("promotion_type".equals(__fieldName)) {
      this.promotion_type = (Integer) __fieldVal;
    }
    else    if ("meituan_ps_ext".equals(__fieldName)) {
      this.meituan_ps_ext = (String) __fieldVal;
    }
    else    if ("partner_id".equals(__fieldName)) {
      this.partner_id = (Integer) __fieldVal;
    }
    else    if ("stock_status".equals(__fieldName)) {
      this.stock_status = (Boolean) __fieldVal;
    }
    else    if ("price_strategy_id".equals(__fieldName)) {
      this.price_strategy_id = (Long) __fieldVal;
    }
    else    if ("price_strategy".equals(__fieldName)) {
      this.price_strategy = (String) __fieldVal;
    }
    else    if ("fast_payback".equals(__fieldName)) {
      this.fast_payback = (Integer) __fieldVal;
    }
    else    if ("camel_coin_strategy".equals(__fieldName)) {
      this.camel_coin_strategy = (String) __fieldVal;
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
      this.team_id = (Long) __fieldVal;
      return true;
    }
    else    if ("ctserial".equals(__fieldName)) {
      this.ctserial = (String) __fieldVal;
      return true;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("update_time".equals(__fieldName)) {
      this.update_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("redenvelope_enable".equals(__fieldName)) {
      this.redenvelope_enable = (Integer) __fieldVal;
      return true;
    }
    else    if ("promotion_type".equals(__fieldName)) {
      this.promotion_type = (Integer) __fieldVal;
      return true;
    }
    else    if ("meituan_ps_ext".equals(__fieldName)) {
      this.meituan_ps_ext = (String) __fieldVal;
      return true;
    }
    else    if ("partner_id".equals(__fieldName)) {
      this.partner_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("stock_status".equals(__fieldName)) {
      this.stock_status = (Boolean) __fieldVal;
      return true;
    }
    else    if ("price_strategy_id".equals(__fieldName)) {
      this.price_strategy_id = (Long) __fieldVal;
      return true;
    }
    else    if ("price_strategy".equals(__fieldName)) {
      this.price_strategy = (String) __fieldVal;
      return true;
    }
    else    if ("fast_payback".equals(__fieldName)) {
      this.fast_payback = (Integer) __fieldVal;
      return true;
    }
    else    if ("camel_coin_strategy".equals(__fieldName)) {
      this.camel_coin_strategy = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
