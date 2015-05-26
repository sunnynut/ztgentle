// ORM class for table 'dwd_evt_coupon'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Dec 29 15:11:54 CST 2014
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

public class dwd_evt_coupon extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String coupon_no;
  public String get_coupon_no() {
    return coupon_no;
  }
  public void set_coupon_no(String coupon_no) {
    this.coupon_no = coupon_no;
  }
  public dwd_evt_coupon with_coupon_no(String coupon_no) {
    this.coupon_no = coupon_no;
    return this;
  }
  private Integer user_id;
  public Integer get_user_id() {
    return user_id;
  }
  public void set_user_id(Integer user_id) {
    this.user_id = user_id;
  }
  public dwd_evt_coupon with_user_id(Integer user_id) {
    this.user_id = user_id;
    return this;
  }
  private Integer partner_id;
  public Integer get_partner_id() {
    return partner_id;
  }
  public void set_partner_id(Integer partner_id) {
    this.partner_id = partner_id;
  }
  public dwd_evt_coupon with_partner_id(Integer partner_id) {
    this.partner_id = partner_id;
    return this;
  }
  private Integer team_id;
  public Integer get_team_id() {
    return team_id;
  }
  public void set_team_id(Integer team_id) {
    this.team_id = team_id;
  }
  public dwd_evt_coupon with_team_id(Integer team_id) {
    this.team_id = team_id;
    return this;
  }
  private String order_id;
  public String get_order_id() {
    return order_id;
  }
  public void set_order_id(String order_id) {
    this.order_id = order_id;
  }
  public dwd_evt_coupon with_order_id(String order_id) {
    this.order_id = order_id;
    return this;
  }
  private Integer balance_pay_amt;
  public Integer get_balance_pay_amt() {
    return balance_pay_amt;
  }
  public void set_balance_pay_amt(Integer balance_pay_amt) {
    this.balance_pay_amt = balance_pay_amt;
  }
  public dwd_evt_coupon with_balance_pay_amt(Integer balance_pay_amt) {
    this.balance_pay_amt = balance_pay_amt;
    return this;
  }
  private String coupon_secret;
  public String get_coupon_secret() {
    return coupon_secret;
  }
  public void set_coupon_secret(String coupon_secret) {
    this.coupon_secret = coupon_secret;
  }
  public dwd_evt_coupon with_coupon_secret(String coupon_secret) {
    this.coupon_secret = coupon_secret;
    return this;
  }
  private String consume_flag;
  public String get_consume_flag() {
    return consume_flag;
  }
  public void set_consume_flag(String consume_flag) {
    this.consume_flag = consume_flag;
  }
  public dwd_evt_coupon with_consume_flag(String consume_flag) {
    this.consume_flag = consume_flag;
    return this;
  }
  private String user_ip;
  public String get_user_ip() {
    return user_ip;
  }
  public void set_user_ip(String user_ip) {
    this.user_ip = user_ip;
  }
  public dwd_evt_coupon with_user_ip(String user_ip) {
    this.user_ip = user_ip;
    return this;
  }
  private Integer sms_times;
  public Integer get_sms_times() {
    return sms_times;
  }
  public void set_sms_times(Integer sms_times) {
    this.sms_times = sms_times;
  }
  public dwd_evt_coupon with_sms_times(Integer sms_times) {
    this.sms_times = sms_times;
    return this;
  }
  private java.sql.Timestamp expire_time;
  public java.sql.Timestamp get_expire_time() {
    return expire_time;
  }
  public void set_expire_time(java.sql.Timestamp expire_time) {
    this.expire_time = expire_time;
  }
  public dwd_evt_coupon with_expire_time(java.sql.Timestamp expire_time) {
    this.expire_time = expire_time;
    return this;
  }
  private java.sql.Timestamp consume_time;
  public java.sql.Timestamp get_consume_time() {
    return consume_time;
  }
  public void set_consume_time(java.sql.Timestamp consume_time) {
    this.consume_time = consume_time;
  }
  public dwd_evt_coupon with_consume_time(java.sql.Timestamp consume_time) {
    this.consume_time = consume_time;
    return this;
  }
  private java.sql.Timestamp create_time;
  public java.sql.Timestamp get_create_time() {
    return create_time;
  }
  public void set_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
  }
  public dwd_evt_coupon with_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
    return this;
  }
  private java.sql.Timestamp sms_time;
  public java.sql.Timestamp get_sms_time() {
    return sms_time;
  }
  public void set_sms_time(java.sql.Timestamp sms_time) {
    this.sms_time = sms_time;
  }
  public dwd_evt_coupon with_sms_time(java.sql.Timestamp sms_time) {
    this.sms_time = sms_time;
    return this;
  }
  private Integer buy_seq;
  public Integer get_buy_seq() {
    return buy_seq;
  }
  public void set_buy_seq(Integer buy_seq) {
    this.buy_seq = buy_seq;
  }
  public dwd_evt_coupon with_buy_seq(Integer buy_seq) {
    this.buy_seq = buy_seq;
    return this;
  }
  private java.sql.Timestamp expire_notify_time;
  public java.sql.Timestamp get_expire_notify_time() {
    return expire_notify_time;
  }
  public void set_expire_notify_time(java.sql.Timestamp expire_notify_time) {
    this.expire_notify_time = expire_notify_time;
  }
  public dwd_evt_coupon with_expire_notify_time(java.sql.Timestamp expire_notify_time) {
    this.expire_notify_time = expire_notify_time;
    return this;
  }
  private String freeze_flag;
  public String get_freeze_flag() {
    return freeze_flag;
  }
  public void set_freeze_flag(String freeze_flag) {
    this.freeze_flag = freeze_flag;
  }
  public dwd_evt_coupon with_freeze_flag(String freeze_flag) {
    this.freeze_flag = freeze_flag;
    return this;
  }
  private String disable_flag;
  public String get_disable_flag() {
    return disable_flag;
  }
  public void set_disable_flag(String disable_flag) {
    this.disable_flag = disable_flag;
  }
  public dwd_evt_coupon with_disable_flag(String disable_flag) {
    this.disable_flag = disable_flag;
    return this;
  }
  private java.sql.Timestamp disable_time;
  public java.sql.Timestamp get_disable_time() {
    return disable_time;
  }
  public void set_disable_time(java.sql.Timestamp disable_time) {
    this.disable_time = disable_time;
  }
  public dwd_evt_coupon with_disable_time(java.sql.Timestamp disable_time) {
    this.disable_time = disable_time;
    return this;
  }
  private Integer partner_shop_id;
  public Integer get_partner_shop_id() {
    return partner_shop_id;
  }
  public void set_partner_shop_id(Integer partner_shop_id) {
    this.partner_shop_id = partner_shop_id;
  }
  public dwd_evt_coupon with_partner_shop_id(Integer partner_shop_id) {
    this.partner_shop_id = partner_shop_id;
    return this;
  }
  private Integer freeze_from;
  public Integer get_freeze_from() {
    return freeze_from;
  }
  public void set_freeze_from(Integer freeze_from) {
    this.freeze_from = freeze_from;
  }
  public dwd_evt_coupon with_freeze_from(Integer freeze_from) {
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
  public dwd_evt_coupon with_from_type(String from_type) {
    this.from_type = from_type;
    return this;
  }
  private Integer team_use_total;
  public Integer get_team_use_total() {
    return team_use_total;
  }
  public void set_team_use_total(Integer team_use_total) {
    this.team_use_total = team_use_total;
  }
  public dwd_evt_coupon with_team_use_total(Integer team_use_total) {
    this.team_use_total = team_use_total;
    return this;
  }
  private Integer pay_state;
  public Integer get_pay_state() {
    return pay_state;
  }
  public void set_pay_state(Integer pay_state) {
    this.pay_state = pay_state;
  }
  public dwd_evt_coupon with_pay_state(Integer pay_state) {
    this.pay_state = pay_state;
    return this;
  }
  private String coupon_type;
  public String get_coupon_type() {
    return coupon_type;
  }
  public void set_coupon_type(String coupon_type) {
    this.coupon_type = coupon_type;
  }
  public dwd_evt_coupon with_coupon_type(String coupon_type) {
    this.coupon_type = coupon_type;
    return this;
  }
  private String coupon_status;
  public String get_coupon_status() {
    return coupon_status;
  }
  public void set_coupon_status(String coupon_status) {
    this.coupon_status = coupon_status;
  }
  public dwd_evt_coupon with_coupon_status(String coupon_status) {
    this.coupon_status = coupon_status;
    return this;
  }
  private String refund_result;
  public String get_refund_result() {
    return refund_result;
  }
  public void set_refund_result(String refund_result) {
    this.refund_result = refund_result;
  }
  public dwd_evt_coupon with_refund_result(String refund_result) {
    this.refund_result = refund_result;
    return this;
  }
  private String consume_source;
  public String get_consume_source() {
    return consume_source;
  }
  public void set_consume_source(String consume_source) {
    this.consume_source = consume_source;
  }
  public dwd_evt_coupon with_consume_source(String consume_source) {
    this.consume_source = consume_source;
    return this;
  }
  private String half_price_flag;
  public String get_half_price_flag() {
    return half_price_flag;
  }
  public void set_half_price_flag(String half_price_flag) {
    this.half_price_flag = half_price_flag;
  }
  public dwd_evt_coupon with_half_price_flag(String half_price_flag) {
    this.half_price_flag = half_price_flag;
    return this;
  }
  private java.math.BigDecimal team_price;
  public java.math.BigDecimal get_team_price() {
    return team_price;
  }
  public void set_team_price(java.math.BigDecimal team_price) {
    this.team_price = team_price;
  }
  public dwd_evt_coupon with_team_price(java.math.BigDecimal team_price) {
    this.team_price = team_price;
    return this;
  }
  private String team_version;
  public String get_team_version() {
    return team_version;
  }
  public void set_team_version(String team_version) {
    this.team_version = team_version;
  }
  public dwd_evt_coupon with_team_version(String team_version) {
    this.team_version = team_version;
    return this;
  }
  private String room_time_key;
  public String get_room_time_key() {
    return room_time_key;
  }
  public void set_room_time_key(String room_time_key) {
    this.room_time_key = room_time_key;
  }
  public dwd_evt_coupon with_room_time_key(String room_time_key) {
    this.room_time_key = room_time_key;
    return this;
  }
  private String checkin_date;
  public String get_checkin_date() {
    return checkin_date;
  }
  public void set_checkin_date(String checkin_date) {
    this.checkin_date = checkin_date;
  }
  public dwd_evt_coupon with_checkin_date(String checkin_date) {
    this.checkin_date = checkin_date;
    return this;
  }
  private Integer activity_type;
  public Integer get_activity_type() {
    return activity_type;
  }
  public void set_activity_type(Integer activity_type) {
    this.activity_type = activity_type;
  }
  public dwd_evt_coupon with_activity_type(Integer activity_type) {
    this.activity_type = activity_type;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dwd_evt_coupon)) {
      return false;
    }
    dwd_evt_coupon that = (dwd_evt_coupon) o;
    boolean equal = true;
    equal = equal && (this.coupon_no == null ? that.coupon_no == null : this.coupon_no.equals(that.coupon_no));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.balance_pay_amt == null ? that.balance_pay_amt == null : this.balance_pay_amt.equals(that.balance_pay_amt));
    equal = equal && (this.coupon_secret == null ? that.coupon_secret == null : this.coupon_secret.equals(that.coupon_secret));
    equal = equal && (this.consume_flag == null ? that.consume_flag == null : this.consume_flag.equals(that.consume_flag));
    equal = equal && (this.user_ip == null ? that.user_ip == null : this.user_ip.equals(that.user_ip));
    equal = equal && (this.sms_times == null ? that.sms_times == null : this.sms_times.equals(that.sms_times));
    equal = equal && (this.expire_time == null ? that.expire_time == null : this.expire_time.equals(that.expire_time));
    equal = equal && (this.consume_time == null ? that.consume_time == null : this.consume_time.equals(that.consume_time));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.sms_time == null ? that.sms_time == null : this.sms_time.equals(that.sms_time));
    equal = equal && (this.buy_seq == null ? that.buy_seq == null : this.buy_seq.equals(that.buy_seq));
    equal = equal && (this.expire_notify_time == null ? that.expire_notify_time == null : this.expire_notify_time.equals(that.expire_notify_time));
    equal = equal && (this.freeze_flag == null ? that.freeze_flag == null : this.freeze_flag.equals(that.freeze_flag));
    equal = equal && (this.disable_flag == null ? that.disable_flag == null : this.disable_flag.equals(that.disable_flag));
    equal = equal && (this.disable_time == null ? that.disable_time == null : this.disable_time.equals(that.disable_time));
    equal = equal && (this.partner_shop_id == null ? that.partner_shop_id == null : this.partner_shop_id.equals(that.partner_shop_id));
    equal = equal && (this.freeze_from == null ? that.freeze_from == null : this.freeze_from.equals(that.freeze_from));
    equal = equal && (this.from_type == null ? that.from_type == null : this.from_type.equals(that.from_type));
    equal = equal && (this.team_use_total == null ? that.team_use_total == null : this.team_use_total.equals(that.team_use_total));
    equal = equal && (this.pay_state == null ? that.pay_state == null : this.pay_state.equals(that.pay_state));
    equal = equal && (this.coupon_type == null ? that.coupon_type == null : this.coupon_type.equals(that.coupon_type));
    equal = equal && (this.coupon_status == null ? that.coupon_status == null : this.coupon_status.equals(that.coupon_status));
    equal = equal && (this.refund_result == null ? that.refund_result == null : this.refund_result.equals(that.refund_result));
    equal = equal && (this.consume_source == null ? that.consume_source == null : this.consume_source.equals(that.consume_source));
    equal = equal && (this.half_price_flag == null ? that.half_price_flag == null : this.half_price_flag.equals(that.half_price_flag));
    equal = equal && (this.team_price == null ? that.team_price == null : this.team_price.equals(that.team_price));
    equal = equal && (this.team_version == null ? that.team_version == null : this.team_version.equals(that.team_version));
    equal = equal && (this.room_time_key == null ? that.room_time_key == null : this.room_time_key.equals(that.room_time_key));
    equal = equal && (this.checkin_date == null ? that.checkin_date == null : this.checkin_date.equals(that.checkin_date));
    equal = equal && (this.activity_type == null ? that.activity_type == null : this.activity_type.equals(that.activity_type));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dwd_evt_coupon)) {
      return false;
    }
    dwd_evt_coupon that = (dwd_evt_coupon) o;
    boolean equal = true;
    equal = equal && (this.coupon_no == null ? that.coupon_no == null : this.coupon_no.equals(that.coupon_no));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.balance_pay_amt == null ? that.balance_pay_amt == null : this.balance_pay_amt.equals(that.balance_pay_amt));
    equal = equal && (this.coupon_secret == null ? that.coupon_secret == null : this.coupon_secret.equals(that.coupon_secret));
    equal = equal && (this.consume_flag == null ? that.consume_flag == null : this.consume_flag.equals(that.consume_flag));
    equal = equal && (this.user_ip == null ? that.user_ip == null : this.user_ip.equals(that.user_ip));
    equal = equal && (this.sms_times == null ? that.sms_times == null : this.sms_times.equals(that.sms_times));
    equal = equal && (this.expire_time == null ? that.expire_time == null : this.expire_time.equals(that.expire_time));
    equal = equal && (this.consume_time == null ? that.consume_time == null : this.consume_time.equals(that.consume_time));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.sms_time == null ? that.sms_time == null : this.sms_time.equals(that.sms_time));
    equal = equal && (this.buy_seq == null ? that.buy_seq == null : this.buy_seq.equals(that.buy_seq));
    equal = equal && (this.expire_notify_time == null ? that.expire_notify_time == null : this.expire_notify_time.equals(that.expire_notify_time));
    equal = equal && (this.freeze_flag == null ? that.freeze_flag == null : this.freeze_flag.equals(that.freeze_flag));
    equal = equal && (this.disable_flag == null ? that.disable_flag == null : this.disable_flag.equals(that.disable_flag));
    equal = equal && (this.disable_time == null ? that.disable_time == null : this.disable_time.equals(that.disable_time));
    equal = equal && (this.partner_shop_id == null ? that.partner_shop_id == null : this.partner_shop_id.equals(that.partner_shop_id));
    equal = equal && (this.freeze_from == null ? that.freeze_from == null : this.freeze_from.equals(that.freeze_from));
    equal = equal && (this.from_type == null ? that.from_type == null : this.from_type.equals(that.from_type));
    equal = equal && (this.team_use_total == null ? that.team_use_total == null : this.team_use_total.equals(that.team_use_total));
    equal = equal && (this.pay_state == null ? that.pay_state == null : this.pay_state.equals(that.pay_state));
    equal = equal && (this.coupon_type == null ? that.coupon_type == null : this.coupon_type.equals(that.coupon_type));
    equal = equal && (this.coupon_status == null ? that.coupon_status == null : this.coupon_status.equals(that.coupon_status));
    equal = equal && (this.refund_result == null ? that.refund_result == null : this.refund_result.equals(that.refund_result));
    equal = equal && (this.consume_source == null ? that.consume_source == null : this.consume_source.equals(that.consume_source));
    equal = equal && (this.half_price_flag == null ? that.half_price_flag == null : this.half_price_flag.equals(that.half_price_flag));
    equal = equal && (this.team_price == null ? that.team_price == null : this.team_price.equals(that.team_price));
    equal = equal && (this.team_version == null ? that.team_version == null : this.team_version.equals(that.team_version));
    equal = equal && (this.room_time_key == null ? that.room_time_key == null : this.room_time_key.equals(that.room_time_key));
    equal = equal && (this.checkin_date == null ? that.checkin_date == null : this.checkin_date.equals(that.checkin_date));
    equal = equal && (this.activity_type == null ? that.activity_type == null : this.activity_type.equals(that.activity_type));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.coupon_no = JdbcWritableBridge.readString(1, __dbResults);
    this.user_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.partner_id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.team_id = JdbcWritableBridge.readInteger(4, __dbResults);
    this.order_id = JdbcWritableBridge.readString(5, __dbResults);
    this.balance_pay_amt = JdbcWritableBridge.readInteger(6, __dbResults);
    this.coupon_secret = JdbcWritableBridge.readString(7, __dbResults);
    this.consume_flag = JdbcWritableBridge.readString(8, __dbResults);
    this.user_ip = JdbcWritableBridge.readString(9, __dbResults);
    this.sms_times = JdbcWritableBridge.readInteger(10, __dbResults);
    this.expire_time = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.consume_time = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.sms_time = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.buy_seq = JdbcWritableBridge.readInteger(15, __dbResults);
    this.expire_notify_time = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.freeze_flag = JdbcWritableBridge.readString(17, __dbResults);
    this.disable_flag = JdbcWritableBridge.readString(18, __dbResults);
    this.disable_time = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.partner_shop_id = JdbcWritableBridge.readInteger(20, __dbResults);
    this.freeze_from = JdbcWritableBridge.readInteger(21, __dbResults);
    this.from_type = JdbcWritableBridge.readString(22, __dbResults);
    this.team_use_total = JdbcWritableBridge.readInteger(23, __dbResults);
    this.pay_state = JdbcWritableBridge.readInteger(24, __dbResults);
    this.coupon_type = JdbcWritableBridge.readString(25, __dbResults);
    this.coupon_status = JdbcWritableBridge.readString(26, __dbResults);
    this.refund_result = JdbcWritableBridge.readString(27, __dbResults);
    this.consume_source = JdbcWritableBridge.readString(28, __dbResults);
    this.half_price_flag = JdbcWritableBridge.readString(29, __dbResults);
    this.team_price = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.team_version = JdbcWritableBridge.readString(31, __dbResults);
    this.room_time_key = JdbcWritableBridge.readString(32, __dbResults);
    this.checkin_date = JdbcWritableBridge.readString(33, __dbResults);
    this.activity_type = JdbcWritableBridge.readInteger(34, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.coupon_no = JdbcWritableBridge.readString(1, __dbResults);
    this.user_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.partner_id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.team_id = JdbcWritableBridge.readInteger(4, __dbResults);
    this.order_id = JdbcWritableBridge.readString(5, __dbResults);
    this.balance_pay_amt = JdbcWritableBridge.readInteger(6, __dbResults);
    this.coupon_secret = JdbcWritableBridge.readString(7, __dbResults);
    this.consume_flag = JdbcWritableBridge.readString(8, __dbResults);
    this.user_ip = JdbcWritableBridge.readString(9, __dbResults);
    this.sms_times = JdbcWritableBridge.readInteger(10, __dbResults);
    this.expire_time = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.consume_time = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.sms_time = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.buy_seq = JdbcWritableBridge.readInteger(15, __dbResults);
    this.expire_notify_time = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.freeze_flag = JdbcWritableBridge.readString(17, __dbResults);
    this.disable_flag = JdbcWritableBridge.readString(18, __dbResults);
    this.disable_time = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.partner_shop_id = JdbcWritableBridge.readInteger(20, __dbResults);
    this.freeze_from = JdbcWritableBridge.readInteger(21, __dbResults);
    this.from_type = JdbcWritableBridge.readString(22, __dbResults);
    this.team_use_total = JdbcWritableBridge.readInteger(23, __dbResults);
    this.pay_state = JdbcWritableBridge.readInteger(24, __dbResults);
    this.coupon_type = JdbcWritableBridge.readString(25, __dbResults);
    this.coupon_status = JdbcWritableBridge.readString(26, __dbResults);
    this.refund_result = JdbcWritableBridge.readString(27, __dbResults);
    this.consume_source = JdbcWritableBridge.readString(28, __dbResults);
    this.half_price_flag = JdbcWritableBridge.readString(29, __dbResults);
    this.team_price = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.team_version = JdbcWritableBridge.readString(31, __dbResults);
    this.room_time_key = JdbcWritableBridge.readString(32, __dbResults);
    this.checkin_date = JdbcWritableBridge.readString(33, __dbResults);
    this.activity_type = JdbcWritableBridge.readInteger(34, __dbResults);
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
    JdbcWritableBridge.writeString(coupon_no, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(user_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(partner_id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(team_id, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(order_id, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(balance_pay_amt, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(coupon_secret, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consume_flag, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(user_ip, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(sms_times, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(expire_time, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(consume_time, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(sms_time, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(buy_seq, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(expire_notify_time, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(freeze_flag, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(disable_flag, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(disable_time, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(partner_shop_id, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(freeze_from, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(from_type, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(team_use_total, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(pay_state, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(coupon_type, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(coupon_status, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(refund_result, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consume_source, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(half_price_flag, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(team_price, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(team_version, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(room_time_key, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(checkin_date, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(activity_type, 34 + __off, 4, __dbStmt);
    return 34;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(coupon_no, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(user_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(partner_id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(team_id, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(order_id, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(balance_pay_amt, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(coupon_secret, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consume_flag, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(user_ip, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(sms_times, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(expire_time, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(consume_time, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(sms_time, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(buy_seq, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(expire_notify_time, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(freeze_flag, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(disable_flag, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(disable_time, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(partner_shop_id, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(freeze_from, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(from_type, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(team_use_total, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(pay_state, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(coupon_type, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(coupon_status, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(refund_result, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(consume_source, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(half_price_flag, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(team_price, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(team_version, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(room_time_key, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(checkin_date, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(activity_type, 34 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.coupon_no = null;
    } else {
    this.coupon_no = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.user_id = null;
    } else {
    this.user_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.partner_id = null;
    } else {
    this.partner_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.team_id = null;
    } else {
    this.team_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.order_id = null;
    } else {
    this.order_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.balance_pay_amt = null;
    } else {
    this.balance_pay_amt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.coupon_secret = null;
    } else {
    this.coupon_secret = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.consume_flag = null;
    } else {
    this.consume_flag = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.user_ip = null;
    } else {
    this.user_ip = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sms_times = null;
    } else {
    this.sms_times = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.expire_time = null;
    } else {
    this.expire_time = new Timestamp(__dataIn.readLong());
    this.expire_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.consume_time = null;
    } else {
    this.consume_time = new Timestamp(__dataIn.readLong());
    this.consume_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.create_time = null;
    } else {
    this.create_time = new Timestamp(__dataIn.readLong());
    this.create_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.sms_time = null;
    } else {
    this.sms_time = new Timestamp(__dataIn.readLong());
    this.sms_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.buy_seq = null;
    } else {
    this.buy_seq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.expire_notify_time = null;
    } else {
    this.expire_notify_time = new Timestamp(__dataIn.readLong());
    this.expire_notify_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.freeze_flag = null;
    } else {
    this.freeze_flag = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.disable_flag = null;
    } else {
    this.disable_flag = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.disable_time = null;
    } else {
    this.disable_time = new Timestamp(__dataIn.readLong());
    this.disable_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.partner_shop_id = null;
    } else {
    this.partner_shop_id = Integer.valueOf(__dataIn.readInt());
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
    if (__dataIn.readBoolean()) { 
        this.team_use_total = null;
    } else {
    this.team_use_total = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.pay_state = null;
    } else {
    this.pay_state = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.coupon_type = null;
    } else {
    this.coupon_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.coupon_status = null;
    } else {
    this.coupon_status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.refund_result = null;
    } else {
    this.refund_result = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.consume_source = null;
    } else {
    this.consume_source = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.half_price_flag = null;
    } else {
    this.half_price_flag = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.team_price = null;
    } else {
    this.team_price = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.team_version = null;
    } else {
    this.team_version = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.room_time_key = null;
    } else {
    this.room_time_key = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.checkin_date = null;
    } else {
    this.checkin_date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.activity_type = null;
    } else {
    this.activity_type = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.coupon_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, coupon_no);
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_id);
    }
    if (null == this.partner_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.partner_id);
    }
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.team_id);
    }
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_id);
    }
    if (null == this.balance_pay_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.balance_pay_amt);
    }
    if (null == this.coupon_secret) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, coupon_secret);
    }
    if (null == this.consume_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consume_flag);
    }
    if (null == this.user_ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_ip);
    }
    if (null == this.sms_times) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sms_times);
    }
    if (null == this.expire_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expire_time.getTime());
    __dataOut.writeInt(this.expire_time.getNanos());
    }
    if (null == this.consume_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.consume_time.getTime());
    __dataOut.writeInt(this.consume_time.getNanos());
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time.getTime());
    __dataOut.writeInt(this.create_time.getNanos());
    }
    if (null == this.sms_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sms_time.getTime());
    __dataOut.writeInt(this.sms_time.getNanos());
    }
    if (null == this.buy_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.buy_seq);
    }
    if (null == this.expire_notify_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expire_notify_time.getTime());
    __dataOut.writeInt(this.expire_notify_time.getNanos());
    }
    if (null == this.freeze_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, freeze_flag);
    }
    if (null == this.disable_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, disable_flag);
    }
    if (null == this.disable_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.disable_time.getTime());
    __dataOut.writeInt(this.disable_time.getNanos());
    }
    if (null == this.partner_shop_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.partner_shop_id);
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
    if (null == this.team_use_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.team_use_total);
    }
    if (null == this.pay_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.pay_state);
    }
    if (null == this.coupon_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, coupon_type);
    }
    if (null == this.coupon_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, coupon_status);
    }
    if (null == this.refund_result) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, refund_result);
    }
    if (null == this.consume_source) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consume_source);
    }
    if (null == this.half_price_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, half_price_flag);
    }
    if (null == this.team_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.team_price, __dataOut);
    }
    if (null == this.team_version) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_version);
    }
    if (null == this.room_time_key) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, room_time_key);
    }
    if (null == this.checkin_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, checkin_date);
    }
    if (null == this.activity_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.activity_type);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.coupon_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, coupon_no);
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_id);
    }
    if (null == this.partner_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.partner_id);
    }
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.team_id);
    }
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_id);
    }
    if (null == this.balance_pay_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.balance_pay_amt);
    }
    if (null == this.coupon_secret) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, coupon_secret);
    }
    if (null == this.consume_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consume_flag);
    }
    if (null == this.user_ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_ip);
    }
    if (null == this.sms_times) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sms_times);
    }
    if (null == this.expire_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expire_time.getTime());
    __dataOut.writeInt(this.expire_time.getNanos());
    }
    if (null == this.consume_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.consume_time.getTime());
    __dataOut.writeInt(this.consume_time.getNanos());
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time.getTime());
    __dataOut.writeInt(this.create_time.getNanos());
    }
    if (null == this.sms_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sms_time.getTime());
    __dataOut.writeInt(this.sms_time.getNanos());
    }
    if (null == this.buy_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.buy_seq);
    }
    if (null == this.expire_notify_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expire_notify_time.getTime());
    __dataOut.writeInt(this.expire_notify_time.getNanos());
    }
    if (null == this.freeze_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, freeze_flag);
    }
    if (null == this.disable_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, disable_flag);
    }
    if (null == this.disable_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.disable_time.getTime());
    __dataOut.writeInt(this.disable_time.getNanos());
    }
    if (null == this.partner_shop_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.partner_shop_id);
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
    if (null == this.team_use_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.team_use_total);
    }
    if (null == this.pay_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.pay_state);
    }
    if (null == this.coupon_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, coupon_type);
    }
    if (null == this.coupon_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, coupon_status);
    }
    if (null == this.refund_result) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, refund_result);
    }
    if (null == this.consume_source) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, consume_source);
    }
    if (null == this.half_price_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, half_price_flag);
    }
    if (null == this.team_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.team_price, __dataOut);
    }
    if (null == this.team_version) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_version);
    }
    if (null == this.room_time_key) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, room_time_key);
    }
    if (null == this.checkin_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, checkin_date);
    }
    if (null == this.activity_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.activity_type);
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
    __sb.append(FieldFormatter.escapeAndEnclose(coupon_no==null?"null":coupon_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(balance_pay_amt==null?"null":"" + balance_pay_amt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(coupon_secret==null?"null":coupon_secret, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consume_flag==null?"null":consume_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_ip==null?"null":user_ip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sms_times==null?"null":"" + sms_times, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expire_time==null?"null":"" + expire_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consume_time==null?"null":"" + consume_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sms_time==null?"null":"" + sms_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_seq==null?"null":"" + buy_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expire_notify_time==null?"null":"" + expire_notify_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(freeze_flag==null?"null":freeze_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(disable_flag==null?"null":disable_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(disable_time==null?"null":"" + disable_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_shop_id==null?"null":"" + partner_shop_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(freeze_from==null?"null":"" + freeze_from, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(from_type==null?"null":from_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_use_total==null?"null":"" + team_use_total, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_state==null?"null":"" + pay_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(coupon_type==null?"null":coupon_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(coupon_status==null?"null":coupon_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_result==null?"null":refund_result, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consume_source==null?"null":consume_source, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(half_price_flag==null?"null":half_price_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_price==null?"null":team_price.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_version==null?"null":team_version, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(room_time_key==null?"null":room_time_key, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(checkin_date==null?"null":checkin_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(activity_type==null?"null":"" + activity_type, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(coupon_no==null?"null":coupon_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(balance_pay_amt==null?"null":"" + balance_pay_amt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(coupon_secret==null?"null":coupon_secret, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consume_flag==null?"null":consume_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_ip==null?"null":user_ip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sms_times==null?"null":"" + sms_times, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expire_time==null?"null":"" + expire_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consume_time==null?"null":"" + consume_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sms_time==null?"null":"" + sms_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_seq==null?"null":"" + buy_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expire_notify_time==null?"null":"" + expire_notify_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(freeze_flag==null?"null":freeze_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(disable_flag==null?"null":disable_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(disable_time==null?"null":"" + disable_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_shop_id==null?"null":"" + partner_shop_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(freeze_from==null?"null":"" + freeze_from, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(from_type==null?"null":from_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_use_total==null?"null":"" + team_use_total, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_state==null?"null":"" + pay_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(coupon_type==null?"null":coupon_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(coupon_status==null?"null":coupon_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_result==null?"null":refund_result, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consume_source==null?"null":consume_source, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(half_price_flag==null?"null":half_price_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_price==null?"null":team_price.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_version==null?"null":team_version, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(room_time_key==null?"null":room_time_key, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(checkin_date==null?"null":checkin_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(activity_type==null?"null":"" + activity_type, delimiters));
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
    if (__cur_str.equals("\\N")) { this.coupon_no = null; } else {
      this.coupon_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.partner_id = null; } else {
      this.partner_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.order_id = null; } else {
      this.order_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.balance_pay_amt = null; } else {
      this.balance_pay_amt = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.coupon_secret = null; } else {
      this.coupon_secret = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.consume_flag = null; } else {
      this.consume_flag = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.user_ip = null; } else {
      this.user_ip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.sms_times = null; } else {
      this.sms_times = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.expire_time = null; } else {
      this.expire_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.consume_time = null; } else {
      this.consume_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.sms_time = null; } else {
      this.sms_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.buy_seq = null; } else {
      this.buy_seq = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.expire_notify_time = null; } else {
      this.expire_notify_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.freeze_flag = null; } else {
      this.freeze_flag = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.disable_flag = null; } else {
      this.disable_flag = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.disable_time = null; } else {
      this.disable_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.partner_shop_id = null; } else {
      this.partner_shop_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.freeze_from = null; } else {
      this.freeze_from = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.from_type = null; } else {
      this.from_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.team_use_total = null; } else {
      this.team_use_total = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.pay_state = null; } else {
      this.pay_state = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.coupon_type = null; } else {
      this.coupon_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.coupon_status = null; } else {
      this.coupon_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.refund_result = null; } else {
      this.refund_result = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.consume_source = null; } else {
      this.consume_source = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.half_price_flag = null; } else {
      this.half_price_flag = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.team_price = null; } else {
      this.team_price = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.team_version = null; } else {
      this.team_version = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.room_time_key = null; } else {
      this.room_time_key = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.checkin_date = null; } else {
      this.checkin_date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.activity_type = null; } else {
      this.activity_type = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.coupon_no = null; } else {
      this.coupon_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.partner_id = null; } else {
      this.partner_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.order_id = null; } else {
      this.order_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.balance_pay_amt = null; } else {
      this.balance_pay_amt = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.coupon_secret = null; } else {
      this.coupon_secret = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.consume_flag = null; } else {
      this.consume_flag = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.user_ip = null; } else {
      this.user_ip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.sms_times = null; } else {
      this.sms_times = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.expire_time = null; } else {
      this.expire_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.consume_time = null; } else {
      this.consume_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.sms_time = null; } else {
      this.sms_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.buy_seq = null; } else {
      this.buy_seq = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.expire_notify_time = null; } else {
      this.expire_notify_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.freeze_flag = null; } else {
      this.freeze_flag = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.disable_flag = null; } else {
      this.disable_flag = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.disable_time = null; } else {
      this.disable_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.partner_shop_id = null; } else {
      this.partner_shop_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.freeze_from = null; } else {
      this.freeze_from = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.from_type = null; } else {
      this.from_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.team_use_total = null; } else {
      this.team_use_total = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.pay_state = null; } else {
      this.pay_state = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.coupon_type = null; } else {
      this.coupon_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.coupon_status = null; } else {
      this.coupon_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.refund_result = null; } else {
      this.refund_result = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.consume_source = null; } else {
      this.consume_source = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.half_price_flag = null; } else {
      this.half_price_flag = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.team_price = null; } else {
      this.team_price = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.team_version = null; } else {
      this.team_version = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.room_time_key = null; } else {
      this.room_time_key = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.checkin_date = null; } else {
      this.checkin_date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.activity_type = null; } else {
      this.activity_type = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    dwd_evt_coupon o = (dwd_evt_coupon) super.clone();
    o.expire_time = (o.expire_time != null) ? (java.sql.Timestamp) o.expire_time.clone() : null;
    o.consume_time = (o.consume_time != null) ? (java.sql.Timestamp) o.consume_time.clone() : null;
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.sms_time = (o.sms_time != null) ? (java.sql.Timestamp) o.sms_time.clone() : null;
    o.expire_notify_time = (o.expire_notify_time != null) ? (java.sql.Timestamp) o.expire_notify_time.clone() : null;
    o.disable_time = (o.disable_time != null) ? (java.sql.Timestamp) o.disable_time.clone() : null;
    return o;
  }

  public void clone0(dwd_evt_coupon o) throws CloneNotSupportedException {
    o.expire_time = (o.expire_time != null) ? (java.sql.Timestamp) o.expire_time.clone() : null;
    o.consume_time = (o.consume_time != null) ? (java.sql.Timestamp) o.consume_time.clone() : null;
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.sms_time = (o.sms_time != null) ? (java.sql.Timestamp) o.sms_time.clone() : null;
    o.expire_notify_time = (o.expire_notify_time != null) ? (java.sql.Timestamp) o.expire_notify_time.clone() : null;
    o.disable_time = (o.disable_time != null) ? (java.sql.Timestamp) o.disable_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("coupon_no", this.coupon_no);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("balance_pay_amt", this.balance_pay_amt);
    __sqoop$field_map.put("coupon_secret", this.coupon_secret);
    __sqoop$field_map.put("consume_flag", this.consume_flag);
    __sqoop$field_map.put("user_ip", this.user_ip);
    __sqoop$field_map.put("sms_times", this.sms_times);
    __sqoop$field_map.put("expire_time", this.expire_time);
    __sqoop$field_map.put("consume_time", this.consume_time);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("sms_time", this.sms_time);
    __sqoop$field_map.put("buy_seq", this.buy_seq);
    __sqoop$field_map.put("expire_notify_time", this.expire_notify_time);
    __sqoop$field_map.put("freeze_flag", this.freeze_flag);
    __sqoop$field_map.put("disable_flag", this.disable_flag);
    __sqoop$field_map.put("disable_time", this.disable_time);
    __sqoop$field_map.put("partner_shop_id", this.partner_shop_id);
    __sqoop$field_map.put("freeze_from", this.freeze_from);
    __sqoop$field_map.put("from_type", this.from_type);
    __sqoop$field_map.put("team_use_total", this.team_use_total);
    __sqoop$field_map.put("pay_state", this.pay_state);
    __sqoop$field_map.put("coupon_type", this.coupon_type);
    __sqoop$field_map.put("coupon_status", this.coupon_status);
    __sqoop$field_map.put("refund_result", this.refund_result);
    __sqoop$field_map.put("consume_source", this.consume_source);
    __sqoop$field_map.put("half_price_flag", this.half_price_flag);
    __sqoop$field_map.put("team_price", this.team_price);
    __sqoop$field_map.put("team_version", this.team_version);
    __sqoop$field_map.put("room_time_key", this.room_time_key);
    __sqoop$field_map.put("checkin_date", this.checkin_date);
    __sqoop$field_map.put("activity_type", this.activity_type);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("coupon_no", this.coupon_no);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("balance_pay_amt", this.balance_pay_amt);
    __sqoop$field_map.put("coupon_secret", this.coupon_secret);
    __sqoop$field_map.put("consume_flag", this.consume_flag);
    __sqoop$field_map.put("user_ip", this.user_ip);
    __sqoop$field_map.put("sms_times", this.sms_times);
    __sqoop$field_map.put("expire_time", this.expire_time);
    __sqoop$field_map.put("consume_time", this.consume_time);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("sms_time", this.sms_time);
    __sqoop$field_map.put("buy_seq", this.buy_seq);
    __sqoop$field_map.put("expire_notify_time", this.expire_notify_time);
    __sqoop$field_map.put("freeze_flag", this.freeze_flag);
    __sqoop$field_map.put("disable_flag", this.disable_flag);
    __sqoop$field_map.put("disable_time", this.disable_time);
    __sqoop$field_map.put("partner_shop_id", this.partner_shop_id);
    __sqoop$field_map.put("freeze_from", this.freeze_from);
    __sqoop$field_map.put("from_type", this.from_type);
    __sqoop$field_map.put("team_use_total", this.team_use_total);
    __sqoop$field_map.put("pay_state", this.pay_state);
    __sqoop$field_map.put("coupon_type", this.coupon_type);
    __sqoop$field_map.put("coupon_status", this.coupon_status);
    __sqoop$field_map.put("refund_result", this.refund_result);
    __sqoop$field_map.put("consume_source", this.consume_source);
    __sqoop$field_map.put("half_price_flag", this.half_price_flag);
    __sqoop$field_map.put("team_price", this.team_price);
    __sqoop$field_map.put("team_version", this.team_version);
    __sqoop$field_map.put("room_time_key", this.room_time_key);
    __sqoop$field_map.put("checkin_date", this.checkin_date);
    __sqoop$field_map.put("activity_type", this.activity_type);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("coupon_no".equals(__fieldName)) {
      this.coupon_no = (String) __fieldVal;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Integer) __fieldVal;
    }
    else    if ("partner_id".equals(__fieldName)) {
      this.partner_id = (Integer) __fieldVal;
    }
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Integer) __fieldVal;
    }
    else    if ("order_id".equals(__fieldName)) {
      this.order_id = (String) __fieldVal;
    }
    else    if ("balance_pay_amt".equals(__fieldName)) {
      this.balance_pay_amt = (Integer) __fieldVal;
    }
    else    if ("coupon_secret".equals(__fieldName)) {
      this.coupon_secret = (String) __fieldVal;
    }
    else    if ("consume_flag".equals(__fieldName)) {
      this.consume_flag = (String) __fieldVal;
    }
    else    if ("user_ip".equals(__fieldName)) {
      this.user_ip = (String) __fieldVal;
    }
    else    if ("sms_times".equals(__fieldName)) {
      this.sms_times = (Integer) __fieldVal;
    }
    else    if ("expire_time".equals(__fieldName)) {
      this.expire_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("consume_time".equals(__fieldName)) {
      this.consume_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("sms_time".equals(__fieldName)) {
      this.sms_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("buy_seq".equals(__fieldName)) {
      this.buy_seq = (Integer) __fieldVal;
    }
    else    if ("expire_notify_time".equals(__fieldName)) {
      this.expire_notify_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("freeze_flag".equals(__fieldName)) {
      this.freeze_flag = (String) __fieldVal;
    }
    else    if ("disable_flag".equals(__fieldName)) {
      this.disable_flag = (String) __fieldVal;
    }
    else    if ("disable_time".equals(__fieldName)) {
      this.disable_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("partner_shop_id".equals(__fieldName)) {
      this.partner_shop_id = (Integer) __fieldVal;
    }
    else    if ("freeze_from".equals(__fieldName)) {
      this.freeze_from = (Integer) __fieldVal;
    }
    else    if ("from_type".equals(__fieldName)) {
      this.from_type = (String) __fieldVal;
    }
    else    if ("team_use_total".equals(__fieldName)) {
      this.team_use_total = (Integer) __fieldVal;
    }
    else    if ("pay_state".equals(__fieldName)) {
      this.pay_state = (Integer) __fieldVal;
    }
    else    if ("coupon_type".equals(__fieldName)) {
      this.coupon_type = (String) __fieldVal;
    }
    else    if ("coupon_status".equals(__fieldName)) {
      this.coupon_status = (String) __fieldVal;
    }
    else    if ("refund_result".equals(__fieldName)) {
      this.refund_result = (String) __fieldVal;
    }
    else    if ("consume_source".equals(__fieldName)) {
      this.consume_source = (String) __fieldVal;
    }
    else    if ("half_price_flag".equals(__fieldName)) {
      this.half_price_flag = (String) __fieldVal;
    }
    else    if ("team_price".equals(__fieldName)) {
      this.team_price = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("team_version".equals(__fieldName)) {
      this.team_version = (String) __fieldVal;
    }
    else    if ("room_time_key".equals(__fieldName)) {
      this.room_time_key = (String) __fieldVal;
    }
    else    if ("checkin_date".equals(__fieldName)) {
      this.checkin_date = (String) __fieldVal;
    }
    else    if ("activity_type".equals(__fieldName)) {
      this.activity_type = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("coupon_no".equals(__fieldName)) {
      this.coupon_no = (String) __fieldVal;
      return true;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("partner_id".equals(__fieldName)) {
      this.partner_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("order_id".equals(__fieldName)) {
      this.order_id = (String) __fieldVal;
      return true;
    }
    else    if ("balance_pay_amt".equals(__fieldName)) {
      this.balance_pay_amt = (Integer) __fieldVal;
      return true;
    }
    else    if ("coupon_secret".equals(__fieldName)) {
      this.coupon_secret = (String) __fieldVal;
      return true;
    }
    else    if ("consume_flag".equals(__fieldName)) {
      this.consume_flag = (String) __fieldVal;
      return true;
    }
    else    if ("user_ip".equals(__fieldName)) {
      this.user_ip = (String) __fieldVal;
      return true;
    }
    else    if ("sms_times".equals(__fieldName)) {
      this.sms_times = (Integer) __fieldVal;
      return true;
    }
    else    if ("expire_time".equals(__fieldName)) {
      this.expire_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("consume_time".equals(__fieldName)) {
      this.consume_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("sms_time".equals(__fieldName)) {
      this.sms_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("buy_seq".equals(__fieldName)) {
      this.buy_seq = (Integer) __fieldVal;
      return true;
    }
    else    if ("expire_notify_time".equals(__fieldName)) {
      this.expire_notify_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("freeze_flag".equals(__fieldName)) {
      this.freeze_flag = (String) __fieldVal;
      return true;
    }
    else    if ("disable_flag".equals(__fieldName)) {
      this.disable_flag = (String) __fieldVal;
      return true;
    }
    else    if ("disable_time".equals(__fieldName)) {
      this.disable_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("partner_shop_id".equals(__fieldName)) {
      this.partner_shop_id = (Integer) __fieldVal;
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
    else    if ("team_use_total".equals(__fieldName)) {
      this.team_use_total = (Integer) __fieldVal;
      return true;
    }
    else    if ("pay_state".equals(__fieldName)) {
      this.pay_state = (Integer) __fieldVal;
      return true;
    }
    else    if ("coupon_type".equals(__fieldName)) {
      this.coupon_type = (String) __fieldVal;
      return true;
    }
    else    if ("coupon_status".equals(__fieldName)) {
      this.coupon_status = (String) __fieldVal;
      return true;
    }
    else    if ("refund_result".equals(__fieldName)) {
      this.refund_result = (String) __fieldVal;
      return true;
    }
    else    if ("consume_source".equals(__fieldName)) {
      this.consume_source = (String) __fieldVal;
      return true;
    }
    else    if ("half_price_flag".equals(__fieldName)) {
      this.half_price_flag = (String) __fieldVal;
      return true;
    }
    else    if ("team_price".equals(__fieldName)) {
      this.team_price = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("team_version".equals(__fieldName)) {
      this.team_version = (String) __fieldVal;
      return true;
    }
    else    if ("room_time_key".equals(__fieldName)) {
      this.room_time_key = (String) __fieldVal;
      return true;
    }
    else    if ("checkin_date".equals(__fieldName)) {
      this.checkin_date = (String) __fieldVal;
      return true;
    }
    else    if ("activity_type".equals(__fieldName)) {
      this.activity_type = (Integer) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
