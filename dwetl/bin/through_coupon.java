// ORM class for table 'through_coupon'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Nov 17 18:25:25 CST 2014
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

public class through_coupon extends SqoopRecord  implements DBWritable, Writable {
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
  public through_coupon with_id(Integer id) {
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
  public through_coupon with_through_coupon_id(Long through_coupon_id) {
    this.through_coupon_id = through_coupon_id;
    return this;
  }
  private Long partner_id;
  public Long get_partner_id() {
    return partner_id;
  }
  public void set_partner_id(Long partner_id) {
    this.partner_id = partner_id;
  }
  public through_coupon with_partner_id(Long partner_id) {
    this.partner_id = partner_id;
    return this;
  }
  private Long team_id;
  public Long get_team_id() {
    return team_id;
  }
  public void set_team_id(Long team_id) {
    this.team_id = team_id;
  }
  public through_coupon with_team_id(Long team_id) {
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
  public through_coupon with_order_id(Long order_id) {
    this.order_id = order_id;
    return this;
  }
  private Long secret;
  public Long get_secret() {
    return secret;
  }
  public void set_secret(Long secret) {
    this.secret = secret;
  }
  public through_coupon with_secret(Long secret) {
    this.secret = secret;
    return this;
  }
  private java.sql.Timestamp expire_time;
  public java.sql.Timestamp get_expire_time() {
    return expire_time;
  }
  public void set_expire_time(java.sql.Timestamp expire_time) {
    this.expire_time = expire_time;
  }
  public through_coupon with_expire_time(java.sql.Timestamp expire_time) {
    this.expire_time = expire_time;
    return this;
  }
  private java.sql.Timestamp create_time;
  public java.sql.Timestamp get_create_time() {
    return create_time;
  }
  public void set_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
  }
  public through_coupon with_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
    return this;
  }
  private Integer is_freeze;
  public Integer get_is_freeze() {
    return is_freeze;
  }
  public void set_is_freeze(Integer is_freeze) {
    this.is_freeze = is_freeze;
  }
  public through_coupon with_is_freeze(Integer is_freeze) {
    this.is_freeze = is_freeze;
    return this;
  }
  private Integer team_use_total;
  public Integer get_team_use_total() {
    return team_use_total;
  }
  public void set_team_use_total(Integer team_use_total) {
    this.team_use_total = team_use_total;
  }
  public through_coupon with_team_use_total(Integer team_use_total) {
    this.team_use_total = team_use_total;
    return this;
  }
  private Integer sms;
  public Integer get_sms() {
    return sms;
  }
  public void set_sms(Integer sms) {
    this.sms = sms;
  }
  public through_coupon with_sms(Integer sms) {
    this.sms = sms;
    return this;
  }
  private java.sql.Timestamp sms_time;
  public java.sql.Timestamp get_sms_time() {
    return sms_time;
  }
  public void set_sms_time(java.sql.Timestamp sms_time) {
    this.sms_time = sms_time;
  }
  public through_coupon with_sms_time(java.sql.Timestamp sms_time) {
    this.sms_time = sms_time;
    return this;
  }
  private Long user_id;
  public Long get_user_id() {
    return user_id;
  }
  public void set_user_id(Long user_id) {
    this.user_id = user_id;
  }
  public through_coupon with_user_id(Long user_id) {
    this.user_id = user_id;
    return this;
  }
  private Integer is_used;
  public Integer get_is_used() {
    return is_used;
  }
  public void set_is_used(Integer is_used) {
    this.is_used = is_used;
  }
  public through_coupon with_is_used(Integer is_used) {
    this.is_used = is_used;
    return this;
  }
  private Integer is_del;
  public Integer get_is_del() {
    return is_del;
  }
  public void set_is_del(Integer is_del) {
    this.is_del = is_del;
  }
  public through_coupon with_is_del(Integer is_del) {
    this.is_del = is_del;
    return this;
  }
  private java.sql.Timestamp del_time;
  public java.sql.Timestamp get_del_time() {
    return del_time;
  }
  public void set_del_time(java.sql.Timestamp del_time) {
    this.del_time = del_time;
  }
  public through_coupon with_del_time(java.sql.Timestamp del_time) {
    this.del_time = del_time;
    return this;
  }
  private Integer pay_state;
  public Integer get_pay_state() {
    return pay_state;
  }
  public void set_pay_state(Integer pay_state) {
    this.pay_state = pay_state;
  }
  public through_coupon with_pay_state(Integer pay_state) {
    this.pay_state = pay_state;
    return this;
  }
  private Integer freeze_from;
  public Integer get_freeze_from() {
    return freeze_from;
  }
  public void set_freeze_from(Integer freeze_from) {
    this.freeze_from = freeze_from;
  }
  public through_coupon with_freeze_from(Integer freeze_from) {
    this.freeze_from = freeze_from;
    return this;
  }
  private String from_type;
  public String get_from_type() {
    return from_type;
  }
  public void set_from_type(String from_type) {
    this.from_type = from_type;
  }
  public through_coupon with_from_type(String from_type) {
    this.from_type = from_type;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof through_coupon)) {
      return false;
    }
    through_coupon that = (through_coupon) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.through_coupon_id == null ? that.through_coupon_id == null : this.through_coupon_id.equals(that.through_coupon_id));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.secret == null ? that.secret == null : this.secret.equals(that.secret));
    equal = equal && (this.expire_time == null ? that.expire_time == null : this.expire_time.equals(that.expire_time));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.is_freeze == null ? that.is_freeze == null : this.is_freeze.equals(that.is_freeze));
    equal = equal && (this.team_use_total == null ? that.team_use_total == null : this.team_use_total.equals(that.team_use_total));
    equal = equal && (this.sms == null ? that.sms == null : this.sms.equals(that.sms));
    equal = equal && (this.sms_time == null ? that.sms_time == null : this.sms_time.equals(that.sms_time));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.is_used == null ? that.is_used == null : this.is_used.equals(that.is_used));
    equal = equal && (this.is_del == null ? that.is_del == null : this.is_del.equals(that.is_del));
    equal = equal && (this.del_time == null ? that.del_time == null : this.del_time.equals(that.del_time));
    equal = equal && (this.pay_state == null ? that.pay_state == null : this.pay_state.equals(that.pay_state));
    equal = equal && (this.freeze_from == null ? that.freeze_from == null : this.freeze_from.equals(that.freeze_from));
    equal = equal && (this.from_type == null ? that.from_type == null : this.from_type.equals(that.from_type));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof through_coupon)) {
      return false;
    }
    through_coupon that = (through_coupon) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.through_coupon_id == null ? that.through_coupon_id == null : this.through_coupon_id.equals(that.through_coupon_id));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.secret == null ? that.secret == null : this.secret.equals(that.secret));
    equal = equal && (this.expire_time == null ? that.expire_time == null : this.expire_time.equals(that.expire_time));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.is_freeze == null ? that.is_freeze == null : this.is_freeze.equals(that.is_freeze));
    equal = equal && (this.team_use_total == null ? that.team_use_total == null : this.team_use_total.equals(that.team_use_total));
    equal = equal && (this.sms == null ? that.sms == null : this.sms.equals(that.sms));
    equal = equal && (this.sms_time == null ? that.sms_time == null : this.sms_time.equals(that.sms_time));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.is_used == null ? that.is_used == null : this.is_used.equals(that.is_used));
    equal = equal && (this.is_del == null ? that.is_del == null : this.is_del.equals(that.is_del));
    equal = equal && (this.del_time == null ? that.del_time == null : this.del_time.equals(that.del_time));
    equal = equal && (this.pay_state == null ? that.pay_state == null : this.pay_state.equals(that.pay_state));
    equal = equal && (this.freeze_from == null ? that.freeze_from == null : this.freeze_from.equals(that.freeze_from));
    equal = equal && (this.from_type == null ? that.from_type == null : this.from_type.equals(that.from_type));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.through_coupon_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.partner_id = JdbcWritableBridge.readLong(3, __dbResults);
    this.team_id = JdbcWritableBridge.readLong(4, __dbResults);
    this.order_id = JdbcWritableBridge.readLong(5, __dbResults);
    this.secret = JdbcWritableBridge.readLong(6, __dbResults);
    this.expire_time = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.is_freeze = JdbcWritableBridge.readInteger(9, __dbResults);
    this.team_use_total = JdbcWritableBridge.readInteger(10, __dbResults);
    this.sms = JdbcWritableBridge.readInteger(11, __dbResults);
    this.sms_time = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.user_id = JdbcWritableBridge.readLong(13, __dbResults);
    this.is_used = JdbcWritableBridge.readInteger(14, __dbResults);
    this.is_del = JdbcWritableBridge.readInteger(15, __dbResults);
    this.del_time = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.pay_state = JdbcWritableBridge.readInteger(17, __dbResults);
    this.freeze_from = JdbcWritableBridge.readInteger(18, __dbResults);
    this.from_type = JdbcWritableBridge.readString(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.through_coupon_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.partner_id = JdbcWritableBridge.readLong(3, __dbResults);
    this.team_id = JdbcWritableBridge.readLong(4, __dbResults);
    this.order_id = JdbcWritableBridge.readLong(5, __dbResults);
    this.secret = JdbcWritableBridge.readLong(6, __dbResults);
    this.expire_time = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.is_freeze = JdbcWritableBridge.readInteger(9, __dbResults);
    this.team_use_total = JdbcWritableBridge.readInteger(10, __dbResults);
    this.sms = JdbcWritableBridge.readInteger(11, __dbResults);
    this.sms_time = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.user_id = JdbcWritableBridge.readLong(13, __dbResults);
    this.is_used = JdbcWritableBridge.readInteger(14, __dbResults);
    this.is_del = JdbcWritableBridge.readInteger(15, __dbResults);
    this.del_time = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.pay_state = JdbcWritableBridge.readInteger(17, __dbResults);
    this.freeze_from = JdbcWritableBridge.readInteger(18, __dbResults);
    this.from_type = JdbcWritableBridge.readString(19, __dbResults);
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
    JdbcWritableBridge.writeLong(partner_id, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(team_id, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(order_id, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(secret, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(expire_time, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(is_freeze, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(team_use_total, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(sms, 11 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(sms_time, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(user_id, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(is_used, 14 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(is_del, 15 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(del_time, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(pay_state, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(freeze_from, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(from_type, 19 + __off, 12, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(through_coupon_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(partner_id, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(team_id, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(order_id, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(secret, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(expire_time, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(is_freeze, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(team_use_total, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(sms, 11 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(sms_time, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(user_id, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(is_used, 14 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(is_del, 15 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(del_time, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(pay_state, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(freeze_from, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(from_type, 19 + __off, 12, __dbStmt);
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
        this.partner_id = null;
    } else {
    this.partner_id = Long.valueOf(__dataIn.readLong());
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
    if (__dataIn.readBoolean()) { 
        this.secret = null;
    } else {
    this.secret = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.expire_time = null;
    } else {
    this.expire_time = new Timestamp(__dataIn.readLong());
    this.expire_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.create_time = null;
    } else {
    this.create_time = new Timestamp(__dataIn.readLong());
    this.create_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.is_freeze = null;
    } else {
    this.is_freeze = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.team_use_total = null;
    } else {
    this.team_use_total = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.sms = null;
    } else {
    this.sms = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.sms_time = null;
    } else {
    this.sms_time = new Timestamp(__dataIn.readLong());
    this.sms_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_id = null;
    } else {
    this.user_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.is_used = null;
    } else {
    this.is_used = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.is_del = null;
    } else {
    this.is_del = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.del_time = null;
    } else {
    this.del_time = new Timestamp(__dataIn.readLong());
    this.del_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.pay_state = null;
    } else {
    this.pay_state = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.freeze_from = null;
    } else {
    this.freeze_from = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.from_type = null;
    } else {
    this.from_type = Text.readString(__dataIn);
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
    if (null == this.partner_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.partner_id);
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
    if (null == this.secret) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.secret);
    }
    if (null == this.expire_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expire_time.getTime());
    __dataOut.writeInt(this.expire_time.getNanos());
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time.getTime());
    __dataOut.writeInt(this.create_time.getNanos());
    }
    if (null == this.is_freeze) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_freeze);
    }
    if (null == this.team_use_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.team_use_total);
    }
    if (null == this.sms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sms);
    }
    if (null == this.sms_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sms_time.getTime());
    __dataOut.writeInt(this.sms_time.getNanos());
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_id);
    }
    if (null == this.is_used) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_used);
    }
    if (null == this.is_del) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_del);
    }
    if (null == this.del_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.del_time.getTime());
    __dataOut.writeInt(this.del_time.getNanos());
    }
    if (null == this.pay_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.pay_state);
    }
    if (null == this.freeze_from) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.freeze_from);
    }
    if (null == this.from_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, from_type);
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
    if (null == this.partner_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.partner_id);
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
    if (null == this.secret) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.secret);
    }
    if (null == this.expire_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expire_time.getTime());
    __dataOut.writeInt(this.expire_time.getNanos());
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time.getTime());
    __dataOut.writeInt(this.create_time.getNanos());
    }
    if (null == this.is_freeze) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_freeze);
    }
    if (null == this.team_use_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.team_use_total);
    }
    if (null == this.sms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sms);
    }
    if (null == this.sms_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sms_time.getTime());
    __dataOut.writeInt(this.sms_time.getNanos());
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_id);
    }
    if (null == this.is_used) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_used);
    }
    if (null == this.is_del) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_del);
    }
    if (null == this.del_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.del_time.getTime());
    __dataOut.writeInt(this.del_time.getNanos());
    }
    if (null == this.pay_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.pay_state);
    }
    if (null == this.freeze_from) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.freeze_from);
    }
    if (null == this.from_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, from_type);
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
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":"" + order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(secret==null?"null":"" + secret, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expire_time==null?"null":"" + expire_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_freeze==null?"null":"" + is_freeze, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_use_total==null?"null":"" + team_use_total, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sms==null?"null":"" + sms, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sms_time==null?"null":"" + sms_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_used==null?"null":"" + is_used, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_del==null?"null":"" + is_del, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(del_time==null?"null":"" + del_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_state==null?"null":"" + pay_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(freeze_from==null?"null":"" + freeze_from, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(from_type==null?"null":from_type, "\005", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":"" + order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(secret==null?"null":"" + secret, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expire_time==null?"null":"" + expire_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_freeze==null?"null":"" + is_freeze, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_use_total==null?"null":"" + team_use_total, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sms==null?"null":"" + sms, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sms_time==null?"null":"" + sms_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_used==null?"null":"" + is_used, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_del==null?"null":"" + is_del, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(del_time==null?"null":"" + del_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_state==null?"null":"" + pay_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(freeze_from==null?"null":"" + freeze_from, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(from_type==null?"null":from_type, "\005", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.partner_id = null; } else {
      this.partner_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_id = null; } else {
      this.order_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.secret = null; } else {
      this.secret = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.expire_time = null; } else {
      this.expire_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_freeze = null; } else {
      this.is_freeze = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_use_total = null; } else {
      this.team_use_total = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sms = null; } else {
      this.sms = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sms_time = null; } else {
      this.sms_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_used = null; } else {
      this.is_used = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_del = null; } else {
      this.is_del = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.del_time = null; } else {
      this.del_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pay_state = null; } else {
      this.pay_state = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.freeze_from = null; } else {
      this.freeze_from = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.from_type = null; } else {
      this.from_type = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.partner_id = null; } else {
      this.partner_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_id = null; } else {
      this.order_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.secret = null; } else {
      this.secret = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.expire_time = null; } else {
      this.expire_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_freeze = null; } else {
      this.is_freeze = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_use_total = null; } else {
      this.team_use_total = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sms = null; } else {
      this.sms = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sms_time = null; } else {
      this.sms_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_used = null; } else {
      this.is_used = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_del = null; } else {
      this.is_del = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.del_time = null; } else {
      this.del_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pay_state = null; } else {
      this.pay_state = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.freeze_from = null; } else {
      this.freeze_from = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.from_type = null; } else {
      this.from_type = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    through_coupon o = (through_coupon) super.clone();
    o.expire_time = (o.expire_time != null) ? (java.sql.Timestamp) o.expire_time.clone() : null;
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.sms_time = (o.sms_time != null) ? (java.sql.Timestamp) o.sms_time.clone() : null;
    o.del_time = (o.del_time != null) ? (java.sql.Timestamp) o.del_time.clone() : null;
    return o;
  }

  public void clone0(through_coupon o) throws CloneNotSupportedException {
    o.expire_time = (o.expire_time != null) ? (java.sql.Timestamp) o.expire_time.clone() : null;
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.sms_time = (o.sms_time != null) ? (java.sql.Timestamp) o.sms_time.clone() : null;
    o.del_time = (o.del_time != null) ? (java.sql.Timestamp) o.del_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("through_coupon_id", this.through_coupon_id);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("secret", this.secret);
    __sqoop$field_map.put("expire_time", this.expire_time);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("is_freeze", this.is_freeze);
    __sqoop$field_map.put("team_use_total", this.team_use_total);
    __sqoop$field_map.put("sms", this.sms);
    __sqoop$field_map.put("sms_time", this.sms_time);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("is_used", this.is_used);
    __sqoop$field_map.put("is_del", this.is_del);
    __sqoop$field_map.put("del_time", this.del_time);
    __sqoop$field_map.put("pay_state", this.pay_state);
    __sqoop$field_map.put("freeze_from", this.freeze_from);
    __sqoop$field_map.put("from_type", this.from_type);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("through_coupon_id", this.through_coupon_id);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("secret", this.secret);
    __sqoop$field_map.put("expire_time", this.expire_time);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("is_freeze", this.is_freeze);
    __sqoop$field_map.put("team_use_total", this.team_use_total);
    __sqoop$field_map.put("sms", this.sms);
    __sqoop$field_map.put("sms_time", this.sms_time);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("is_used", this.is_used);
    __sqoop$field_map.put("is_del", this.is_del);
    __sqoop$field_map.put("del_time", this.del_time);
    __sqoop$field_map.put("pay_state", this.pay_state);
    __sqoop$field_map.put("freeze_from", this.freeze_from);
    __sqoop$field_map.put("from_type", this.from_type);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("through_coupon_id".equals(__fieldName)) {
      this.through_coupon_id = (Long) __fieldVal;
    }
    else    if ("partner_id".equals(__fieldName)) {
      this.partner_id = (Long) __fieldVal;
    }
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Long) __fieldVal;
    }
    else    if ("order_id".equals(__fieldName)) {
      this.order_id = (Long) __fieldVal;
    }
    else    if ("secret".equals(__fieldName)) {
      this.secret = (Long) __fieldVal;
    }
    else    if ("expire_time".equals(__fieldName)) {
      this.expire_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("is_freeze".equals(__fieldName)) {
      this.is_freeze = (Integer) __fieldVal;
    }
    else    if ("team_use_total".equals(__fieldName)) {
      this.team_use_total = (Integer) __fieldVal;
    }
    else    if ("sms".equals(__fieldName)) {
      this.sms = (Integer) __fieldVal;
    }
    else    if ("sms_time".equals(__fieldName)) {
      this.sms_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Long) __fieldVal;
    }
    else    if ("is_used".equals(__fieldName)) {
      this.is_used = (Integer) __fieldVal;
    }
    else    if ("is_del".equals(__fieldName)) {
      this.is_del = (Integer) __fieldVal;
    }
    else    if ("del_time".equals(__fieldName)) {
      this.del_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("pay_state".equals(__fieldName)) {
      this.pay_state = (Integer) __fieldVal;
    }
    else    if ("freeze_from".equals(__fieldName)) {
      this.freeze_from = (Integer) __fieldVal;
    }
    else    if ("from_type".equals(__fieldName)) {
      this.from_type = (String) __fieldVal;
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
    else    if ("partner_id".equals(__fieldName)) {
      this.partner_id = (Long) __fieldVal;
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
    else    if ("secret".equals(__fieldName)) {
      this.secret = (Long) __fieldVal;
      return true;
    }
    else    if ("expire_time".equals(__fieldName)) {
      this.expire_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("is_freeze".equals(__fieldName)) {
      this.is_freeze = (Integer) __fieldVal;
      return true;
    }
    else    if ("team_use_total".equals(__fieldName)) {
      this.team_use_total = (Integer) __fieldVal;
      return true;
    }
    else    if ("sms".equals(__fieldName)) {
      this.sms = (Integer) __fieldVal;
      return true;
    }
    else    if ("sms_time".equals(__fieldName)) {
      this.sms_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Long) __fieldVal;
      return true;
    }
    else    if ("is_used".equals(__fieldName)) {
      this.is_used = (Integer) __fieldVal;
      return true;
    }
    else    if ("is_del".equals(__fieldName)) {
      this.is_del = (Integer) __fieldVal;
      return true;
    }
    else    if ("del_time".equals(__fieldName)) {
      this.del_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("pay_state".equals(__fieldName)) {
      this.pay_state = (Integer) __fieldVal;
      return true;
    }
    else    if ("freeze_from".equals(__fieldName)) {
      this.freeze_from = (Integer) __fieldVal;
      return true;
    }
    else    if ("from_type".equals(__fieldName)) {
      this.from_type = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
