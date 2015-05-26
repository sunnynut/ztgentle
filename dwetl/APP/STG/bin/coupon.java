// ORM class for table 'coupon'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Nov 17 17:38:10 CST 2014
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

public class coupon extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String id;
  public String get_id() {
    return id;
  }
  public void set_id(String id) {
    this.id = id;
  }
  public coupon with_id(String id) {
    this.id = id;
    return this;
  }
  private Long user_id;
  public Long get_user_id() {
    return user_id;
  }
  public void set_user_id(Long user_id) {
    this.user_id = user_id;
  }
  public coupon with_user_id(Long user_id) {
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
  public coupon with_partner_id(Long partner_id) {
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
  public coupon with_team_id(Long team_id) {
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
  public coupon with_order_id(Long order_id) {
    this.order_id = order_id;
    return this;
  }
  private String type;
  public String get_type() {
    return type;
  }
  public void set_type(String type) {
    this.type = type;
  }
  public coupon with_type(String type) {
    this.type = type;
    return this;
  }
  private Long credit;
  public Long get_credit() {
    return credit;
  }
  public void set_credit(Long credit) {
    this.credit = credit;
  }
  public coupon with_credit(Long credit) {
    this.credit = credit;
    return this;
  }
  private String secret;
  public String get_secret() {
    return secret;
  }
  public void set_secret(String secret) {
    this.secret = secret;
  }
  public coupon with_secret(String secret) {
    this.secret = secret;
    return this;
  }
  private String consume;
  public String get_consume() {
    return consume;
  }
  public void set_consume(String consume) {
    this.consume = consume;
  }
  public coupon with_consume(String consume) {
    this.consume = consume;
    return this;
  }
  private String ip;
  public String get_ip() {
    return ip;
  }
  public void set_ip(String ip) {
    this.ip = ip;
  }
  public coupon with_ip(String ip) {
    this.ip = ip;
    return this;
  }
  private Long sms;
  public Long get_sms() {
    return sms;
  }
  public void set_sms(Long sms) {
    this.sms = sms;
  }
  public coupon with_sms(Long sms) {
    this.sms = sms;
    return this;
  }
  private Long expire_time;
  public Long get_expire_time() {
    return expire_time;
  }
  public void set_expire_time(Long expire_time) {
    this.expire_time = expire_time;
  }
  public coupon with_expire_time(Long expire_time) {
    this.expire_time = expire_time;
    return this;
  }
  private Long consume_time;
  public Long get_consume_time() {
    return consume_time;
  }
  public void set_consume_time(Long consume_time) {
    this.consume_time = consume_time;
  }
  public coupon with_consume_time(Long consume_time) {
    this.consume_time = consume_time;
    return this;
  }
  private Long create_time;
  public Long get_create_time() {
    return create_time;
  }
  public void set_create_time(Long create_time) {
    this.create_time = create_time;
  }
  public coupon with_create_time(Long create_time) {
    this.create_time = create_time;
    return this;
  }
  private Long sms_time;
  public Long get_sms_time() {
    return sms_time;
  }
  public void set_sms_time(Long sms_time) {
    this.sms_time = sms_time;
  }
  public coupon with_sms_time(Long sms_time) {
    this.sms_time = sms_time;
    return this;
  }
  private Long buy_id;
  public Long get_buy_id() {
    return buy_id;
  }
  public void set_buy_id(Long buy_id) {
    this.buy_id = buy_id;
  }
  public coupon with_buy_id(Long buy_id) {
    this.buy_id = buy_id;
    return this;
  }
  private Long expire_notify_time;
  public Long get_expire_notify_time() {
    return expire_notify_time;
  }
  public void set_expire_notify_time(Long expire_notify_time) {
    this.expire_notify_time = expire_notify_time;
  }
  public coupon with_expire_notify_time(Long expire_notify_time) {
    this.expire_notify_time = expire_notify_time;
    return this;
  }
  private String freeze;
  public String get_freeze() {
    return freeze;
  }
  public void set_freeze(String freeze) {
    this.freeze = freeze;
  }
  public coupon with_freeze(String freeze) {
    this.freeze = freeze;
    return this;
  }
  private String disabled;
  public String get_disabled() {
    return disabled;
  }
  public void set_disabled(String disabled) {
    this.disabled = disabled;
  }
  public coupon with_disabled(String disabled) {
    this.disabled = disabled;
    return this;
  }
  private java.sql.Timestamp disable_time;
  public java.sql.Timestamp get_disable_time() {
    return disable_time;
  }
  public void set_disable_time(java.sql.Timestamp disable_time) {
    this.disable_time = disable_time;
  }
  public coupon with_disable_time(java.sql.Timestamp disable_time) {
    this.disable_time = disable_time;
    return this;
  }
  private Integer freeze_from;
  public Integer get_freeze_from() {
    return freeze_from;
  }
  public void set_freeze_from(Integer freeze_from) {
    this.freeze_from = freeze_from;
  }
  public coupon with_freeze_from(Integer freeze_from) {
    this.freeze_from = freeze_from;
    return this;
  }
  private Long shop_id;
  public Long get_shop_id() {
    return shop_id;
  }
  public void set_shop_id(Long shop_id) {
    this.shop_id = shop_id;
  }
  public coupon with_shop_id(Long shop_id) {
    this.shop_id = shop_id;
    return this;
  }
  private String from_type;
  public String get_from_type() {
    return from_type;
  }
  public void set_from_type(String from_type) {
    this.from_type = from_type;
  }
  public coupon with_from_type(String from_type) {
    this.from_type = from_type;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof coupon)) {
      return false;
    }
    coupon that = (coupon) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.type == null ? that.type == null : this.type.equals(that.type));
    equal = equal && (this.credit == null ? that.credit == null : this.credit.equals(that.credit));
    equal = equal && (this.secret == null ? that.secret == null : this.secret.equals(that.secret));
    equal = equal && (this.consume == null ? that.consume == null : this.consume.equals(that.consume));
    equal = equal && (this.ip == null ? that.ip == null : this.ip.equals(that.ip));
    equal = equal && (this.sms == null ? that.sms == null : this.sms.equals(that.sms));
    equal = equal && (this.expire_time == null ? that.expire_time == null : this.expire_time.equals(that.expire_time));
    equal = equal && (this.consume_time == null ? that.consume_time == null : this.consume_time.equals(that.consume_time));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.sms_time == null ? that.sms_time == null : this.sms_time.equals(that.sms_time));
    equal = equal && (this.buy_id == null ? that.buy_id == null : this.buy_id.equals(that.buy_id));
    equal = equal && (this.expire_notify_time == null ? that.expire_notify_time == null : this.expire_notify_time.equals(that.expire_notify_time));
    equal = equal && (this.freeze == null ? that.freeze == null : this.freeze.equals(that.freeze));
    equal = equal && (this.disabled == null ? that.disabled == null : this.disabled.equals(that.disabled));
    equal = equal && (this.disable_time == null ? that.disable_time == null : this.disable_time.equals(that.disable_time));
    equal = equal && (this.freeze_from == null ? that.freeze_from == null : this.freeze_from.equals(that.freeze_from));
    equal = equal && (this.shop_id == null ? that.shop_id == null : this.shop_id.equals(that.shop_id));
    equal = equal && (this.from_type == null ? that.from_type == null : this.from_type.equals(that.from_type));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof coupon)) {
      return false;
    }
    coupon that = (coupon) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.type == null ? that.type == null : this.type.equals(that.type));
    equal = equal && (this.credit == null ? that.credit == null : this.credit.equals(that.credit));
    equal = equal && (this.secret == null ? that.secret == null : this.secret.equals(that.secret));
    equal = equal && (this.consume == null ? that.consume == null : this.consume.equals(that.consume));
    equal = equal && (this.ip == null ? that.ip == null : this.ip.equals(that.ip));
    equal = equal && (this.sms == null ? that.sms == null : this.sms.equals(that.sms));
    equal = equal && (this.expire_time == null ? that.expire_time == null : this.expire_time.equals(that.expire_time));
    equal = equal && (this.consume_time == null ? that.consume_time == null : this.consume_time.equals(that.consume_time));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.sms_time == null ? that.sms_time == null : this.sms_time.equals(that.sms_time));
    equal = equal && (this.buy_id == null ? that.buy_id == null : this.buy_id.equals(that.buy_id));
    equal = equal && (this.expire_notify_time == null ? that.expire_notify_time == null : this.expire_notify_time.equals(that.expire_notify_time));
    equal = equal && (this.freeze == null ? that.freeze == null : this.freeze.equals(that.freeze));
    equal = equal && (this.disabled == null ? that.disabled == null : this.disabled.equals(that.disabled));
    equal = equal && (this.disable_time == null ? that.disable_time == null : this.disable_time.equals(that.disable_time));
    equal = equal && (this.freeze_from == null ? that.freeze_from == null : this.freeze_from.equals(that.freeze_from));
    equal = equal && (this.shop_id == null ? that.shop_id == null : this.shop_id.equals(that.shop_id));
    equal = equal && (this.from_type == null ? that.from_type == null : this.from_type.equals(that.from_type));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readString(1, __dbResults);
    this.user_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.partner_id = JdbcWritableBridge.readLong(3, __dbResults);
    this.team_id = JdbcWritableBridge.readLong(4, __dbResults);
    this.order_id = JdbcWritableBridge.readLong(5, __dbResults);
    this.type = JdbcWritableBridge.readString(6, __dbResults);
    this.credit = JdbcWritableBridge.readLong(7, __dbResults);
    this.secret = JdbcWritableBridge.readString(8, __dbResults);
    this.consume = JdbcWritableBridge.readString(9, __dbResults);
    this.ip = JdbcWritableBridge.readString(10, __dbResults);
    this.sms = JdbcWritableBridge.readLong(11, __dbResults);
    this.expire_time = JdbcWritableBridge.readLong(12, __dbResults);
    this.consume_time = JdbcWritableBridge.readLong(13, __dbResults);
    this.create_time = JdbcWritableBridge.readLong(14, __dbResults);
    this.sms_time = JdbcWritableBridge.readLong(15, __dbResults);
    this.buy_id = JdbcWritableBridge.readLong(16, __dbResults);
    this.expire_notify_time = JdbcWritableBridge.readLong(17, __dbResults);
    this.freeze = JdbcWritableBridge.readString(18, __dbResults);
    this.disabled = JdbcWritableBridge.readString(19, __dbResults);
    this.disable_time = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.freeze_from = JdbcWritableBridge.readInteger(21, __dbResults);
    this.shop_id = JdbcWritableBridge.readLong(22, __dbResults);
    this.from_type = JdbcWritableBridge.readString(23, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readString(1, __dbResults);
    this.user_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.partner_id = JdbcWritableBridge.readLong(3, __dbResults);
    this.team_id = JdbcWritableBridge.readLong(4, __dbResults);
    this.order_id = JdbcWritableBridge.readLong(5, __dbResults);
    this.type = JdbcWritableBridge.readString(6, __dbResults);
    this.credit = JdbcWritableBridge.readLong(7, __dbResults);
    this.secret = JdbcWritableBridge.readString(8, __dbResults);
    this.consume = JdbcWritableBridge.readString(9, __dbResults);
    this.ip = JdbcWritableBridge.readString(10, __dbResults);
    this.sms = JdbcWritableBridge.readLong(11, __dbResults);
    this.expire_time = JdbcWritableBridge.readLong(12, __dbResults);
    this.consume_time = JdbcWritableBridge.readLong(13, __dbResults);
    this.create_time = JdbcWritableBridge.readLong(14, __dbResults);
    this.sms_time = JdbcWritableBridge.readLong(15, __dbResults);
    this.buy_id = JdbcWritableBridge.readLong(16, __dbResults);
    this.expire_notify_time = JdbcWritableBridge.readLong(17, __dbResults);
    this.freeze = JdbcWritableBridge.readString(18, __dbResults);
    this.disabled = JdbcWritableBridge.readString(19, __dbResults);
    this.disable_time = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.freeze_from = JdbcWritableBridge.readInteger(21, __dbResults);
    this.shop_id = JdbcWritableBridge.readLong(22, __dbResults);
    this.from_type = JdbcWritableBridge.readString(23, __dbResults);
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
    JdbcWritableBridge.writeString(id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(user_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(partner_id, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(team_id, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(order_id, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(type, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(credit, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(secret, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consume, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ip, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(sms, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(expire_time, 12 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(consume_time, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(create_time, 14 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(sms_time, 15 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(buy_id, 16 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(expire_notify_time, 17 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(freeze, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(disabled, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(disable_time, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(freeze_from, 21 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(shop_id, 22 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(from_type, 23 + __off, 12, __dbStmt);
    return 23;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(user_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(partner_id, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(team_id, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(order_id, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(type, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(credit, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(secret, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consume, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ip, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(sms, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(expire_time, 12 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(consume_time, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(create_time, 14 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(sms_time, 15 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(buy_id, 16 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(expire_notify_time, 17 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(freeze, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(disabled, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(disable_time, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(freeze_from, 21 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(shop_id, 22 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(from_type, 23 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Text.readString(__dataIn);
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
        this.type = null;
    } else {
    this.type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.credit = null;
    } else {
    this.credit = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.secret = null;
    } else {
    this.secret = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.consume = null;
    } else {
    this.consume = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ip = null;
    } else {
    this.ip = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sms = null;
    } else {
    this.sms = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.expire_time = null;
    } else {
    this.expire_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.consume_time = null;
    } else {
    this.consume_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.create_time = null;
    } else {
    this.create_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.sms_time = null;
    } else {
    this.sms_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.buy_id = null;
    } else {
    this.buy_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.expire_notify_time = null;
    } else {
    this.expire_notify_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.freeze = null;
    } else {
    this.freeze = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.disabled = null;
    } else {
    this.disabled = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.disable_time = null;
    } else {
    this.disable_time = new Timestamp(__dataIn.readLong());
    this.disable_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.freeze_from = null;
    } else {
    this.freeze_from = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.shop_id = null;
    } else {
    this.shop_id = Long.valueOf(__dataIn.readLong());
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
    Text.writeString(__dataOut, id);
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
    if (null == this.type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, type);
    }
    if (null == this.credit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.credit);
    }
    if (null == this.secret) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, secret);
    }
    if (null == this.consume) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consume);
    }
    if (null == this.ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ip);
    }
    if (null == this.sms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sms);
    }
    if (null == this.expire_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expire_time);
    }
    if (null == this.consume_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.consume_time);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time);
    }
    if (null == this.sms_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sms_time);
    }
    if (null == this.buy_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.buy_id);
    }
    if (null == this.expire_notify_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expire_notify_time);
    }
    if (null == this.freeze) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, freeze);
    }
    if (null == this.disabled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, disabled);
    }
    if (null == this.disable_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.disable_time.getTime());
    __dataOut.writeInt(this.disable_time.getNanos());
    }
    if (null == this.freeze_from) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.freeze_from);
    }
    if (null == this.shop_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.shop_id);
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
    Text.writeString(__dataOut, id);
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
    if (null == this.type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, type);
    }
    if (null == this.credit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.credit);
    }
    if (null == this.secret) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, secret);
    }
    if (null == this.consume) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consume);
    }
    if (null == this.ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ip);
    }
    if (null == this.sms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sms);
    }
    if (null == this.expire_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expire_time);
    }
    if (null == this.consume_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.consume_time);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time);
    }
    if (null == this.sms_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sms_time);
    }
    if (null == this.buy_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.buy_id);
    }
    if (null == this.expire_notify_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expire_notify_time);
    }
    if (null == this.freeze) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, freeze);
    }
    if (null == this.disabled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, disabled);
    }
    if (null == this.disable_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.disable_time.getTime());
    __dataOut.writeInt(this.disable_time.getNanos());
    }
    if (null == this.freeze_from) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.freeze_from);
    }
    if (null == this.shop_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.shop_id);
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(id==null?"null":id, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":"" + order_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(type==null?"null":type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(credit==null?"null":"" + credit, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(secret==null?"null":secret, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(consume==null?"null":consume, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(ip==null?"null":ip, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sms==null?"null":"" + sms, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expire_time==null?"null":"" + expire_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consume_time==null?"null":"" + consume_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sms_time==null?"null":"" + sms_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_id==null?"null":"" + buy_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expire_notify_time==null?"null":"" + expire_notify_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(freeze==null?"null":freeze, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(disabled==null?"null":disabled, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(disable_time==null?"null":"" + disable_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(freeze_from==null?"null":"" + freeze_from, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shop_id==null?"null":"" + shop_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(from_type==null?"null":from_type, "\005", delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(id==null?"null":id, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":"" + order_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(type==null?"null":type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(credit==null?"null":"" + credit, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(secret==null?"null":secret, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(consume==null?"null":consume, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(ip==null?"null":ip, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sms==null?"null":"" + sms, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expire_time==null?"null":"" + expire_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consume_time==null?"null":"" + consume_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sms_time==null?"null":"" + sms_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_id==null?"null":"" + buy_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expire_notify_time==null?"null":"" + expire_notify_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(freeze==null?"null":freeze, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(disabled==null?"null":disabled, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(disable_time==null?"null":"" + disable_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(freeze_from==null?"null":"" + freeze_from, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shop_id==null?"null":"" + shop_id, delimiters));
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
    if (__cur_str.equals("null")) { this.id = null; } else {
      this.id = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_id = null; } else {
      this.order_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.type = null; } else {
      this.type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.credit = null; } else {
      this.credit = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.secret = null; } else {
      this.secret = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.consume = null; } else {
      this.consume = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ip = null; } else {
      this.ip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sms = null; } else {
      this.sms = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.expire_time = null; } else {
      this.expire_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.consume_time = null; } else {
      this.consume_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sms_time = null; } else {
      this.sms_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.buy_id = null; } else {
      this.buy_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.expire_notify_time = null; } else {
      this.expire_notify_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.freeze = null; } else {
      this.freeze = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.disabled = null; } else {
      this.disabled = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.disable_time = null; } else {
      this.disable_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.freeze_from = null; } else {
      this.freeze_from = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shop_id = null; } else {
      this.shop_id = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.id = null; } else {
      this.id = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_id = null; } else {
      this.order_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.type = null; } else {
      this.type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.credit = null; } else {
      this.credit = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.secret = null; } else {
      this.secret = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.consume = null; } else {
      this.consume = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ip = null; } else {
      this.ip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sms = null; } else {
      this.sms = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.expire_time = null; } else {
      this.expire_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.consume_time = null; } else {
      this.consume_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sms_time = null; } else {
      this.sms_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.buy_id = null; } else {
      this.buy_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.expire_notify_time = null; } else {
      this.expire_notify_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.freeze = null; } else {
      this.freeze = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.disabled = null; } else {
      this.disabled = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.disable_time = null; } else {
      this.disable_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.freeze_from = null; } else {
      this.freeze_from = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shop_id = null; } else {
      this.shop_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.from_type = null; } else {
      this.from_type = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    coupon o = (coupon) super.clone();
    o.disable_time = (o.disable_time != null) ? (java.sql.Timestamp) o.disable_time.clone() : null;
    return o;
  }

  public void clone0(coupon o) throws CloneNotSupportedException {
    o.disable_time = (o.disable_time != null) ? (java.sql.Timestamp) o.disable_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("type", this.type);
    __sqoop$field_map.put("credit", this.credit);
    __sqoop$field_map.put("secret", this.secret);
    __sqoop$field_map.put("consume", this.consume);
    __sqoop$field_map.put("ip", this.ip);
    __sqoop$field_map.put("sms", this.sms);
    __sqoop$field_map.put("expire_time", this.expire_time);
    __sqoop$field_map.put("consume_time", this.consume_time);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("sms_time", this.sms_time);
    __sqoop$field_map.put("buy_id", this.buy_id);
    __sqoop$field_map.put("expire_notify_time", this.expire_notify_time);
    __sqoop$field_map.put("freeze", this.freeze);
    __sqoop$field_map.put("disabled", this.disabled);
    __sqoop$field_map.put("disable_time", this.disable_time);
    __sqoop$field_map.put("freeze_from", this.freeze_from);
    __sqoop$field_map.put("shop_id", this.shop_id);
    __sqoop$field_map.put("from_type", this.from_type);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("type", this.type);
    __sqoop$field_map.put("credit", this.credit);
    __sqoop$field_map.put("secret", this.secret);
    __sqoop$field_map.put("consume", this.consume);
    __sqoop$field_map.put("ip", this.ip);
    __sqoop$field_map.put("sms", this.sms);
    __sqoop$field_map.put("expire_time", this.expire_time);
    __sqoop$field_map.put("consume_time", this.consume_time);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("sms_time", this.sms_time);
    __sqoop$field_map.put("buy_id", this.buy_id);
    __sqoop$field_map.put("expire_notify_time", this.expire_notify_time);
    __sqoop$field_map.put("freeze", this.freeze);
    __sqoop$field_map.put("disabled", this.disabled);
    __sqoop$field_map.put("disable_time", this.disable_time);
    __sqoop$field_map.put("freeze_from", this.freeze_from);
    __sqoop$field_map.put("shop_id", this.shop_id);
    __sqoop$field_map.put("from_type", this.from_type);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (String) __fieldVal;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Long) __fieldVal;
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
    else    if ("type".equals(__fieldName)) {
      this.type = (String) __fieldVal;
    }
    else    if ("credit".equals(__fieldName)) {
      this.credit = (Long) __fieldVal;
    }
    else    if ("secret".equals(__fieldName)) {
      this.secret = (String) __fieldVal;
    }
    else    if ("consume".equals(__fieldName)) {
      this.consume = (String) __fieldVal;
    }
    else    if ("ip".equals(__fieldName)) {
      this.ip = (String) __fieldVal;
    }
    else    if ("sms".equals(__fieldName)) {
      this.sms = (Long) __fieldVal;
    }
    else    if ("expire_time".equals(__fieldName)) {
      this.expire_time = (Long) __fieldVal;
    }
    else    if ("consume_time".equals(__fieldName)) {
      this.consume_time = (Long) __fieldVal;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (Long) __fieldVal;
    }
    else    if ("sms_time".equals(__fieldName)) {
      this.sms_time = (Long) __fieldVal;
    }
    else    if ("buy_id".equals(__fieldName)) {
      this.buy_id = (Long) __fieldVal;
    }
    else    if ("expire_notify_time".equals(__fieldName)) {
      this.expire_notify_time = (Long) __fieldVal;
    }
    else    if ("freeze".equals(__fieldName)) {
      this.freeze = (String) __fieldVal;
    }
    else    if ("disabled".equals(__fieldName)) {
      this.disabled = (String) __fieldVal;
    }
    else    if ("disable_time".equals(__fieldName)) {
      this.disable_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("freeze_from".equals(__fieldName)) {
      this.freeze_from = (Integer) __fieldVal;
    }
    else    if ("shop_id".equals(__fieldName)) {
      this.shop_id = (Long) __fieldVal;
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
      this.id = (String) __fieldVal;
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
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Long) __fieldVal;
      return true;
    }
    else    if ("order_id".equals(__fieldName)) {
      this.order_id = (Long) __fieldVal;
      return true;
    }
    else    if ("type".equals(__fieldName)) {
      this.type = (String) __fieldVal;
      return true;
    }
    else    if ("credit".equals(__fieldName)) {
      this.credit = (Long) __fieldVal;
      return true;
    }
    else    if ("secret".equals(__fieldName)) {
      this.secret = (String) __fieldVal;
      return true;
    }
    else    if ("consume".equals(__fieldName)) {
      this.consume = (String) __fieldVal;
      return true;
    }
    else    if ("ip".equals(__fieldName)) {
      this.ip = (String) __fieldVal;
      return true;
    }
    else    if ("sms".equals(__fieldName)) {
      this.sms = (Long) __fieldVal;
      return true;
    }
    else    if ("expire_time".equals(__fieldName)) {
      this.expire_time = (Long) __fieldVal;
      return true;
    }
    else    if ("consume_time".equals(__fieldName)) {
      this.consume_time = (Long) __fieldVal;
      return true;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (Long) __fieldVal;
      return true;
    }
    else    if ("sms_time".equals(__fieldName)) {
      this.sms_time = (Long) __fieldVal;
      return true;
    }
    else    if ("buy_id".equals(__fieldName)) {
      this.buy_id = (Long) __fieldVal;
      return true;
    }
    else    if ("expire_notify_time".equals(__fieldName)) {
      this.expire_notify_time = (Long) __fieldVal;
      return true;
    }
    else    if ("freeze".equals(__fieldName)) {
      this.freeze = (String) __fieldVal;
      return true;
    }
    else    if ("disabled".equals(__fieldName)) {
      this.disabled = (String) __fieldVal;
      return true;
    }
    else    if ("disable_time".equals(__fieldName)) {
      this.disable_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("freeze_from".equals(__fieldName)) {
      this.freeze_from = (Integer) __fieldVal;
      return true;
    }
    else    if ("shop_id".equals(__fieldName)) {
      this.shop_id = (Long) __fieldVal;
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
