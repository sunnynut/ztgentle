// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Jan 28 18:16:26 CST 2015
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

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String account_month;
  public String get_account_month() {
    return account_month;
  }
  public void set_account_month(String account_month) {
    this.account_month = account_month;
  }
  public QueryResult with_account_month(String account_month) {
    this.account_month = account_month;
    return this;
  }
  private String account_date;
  public String get_account_date() {
    return account_date;
  }
  public void set_account_date(String account_date) {
    this.account_date = account_date;
  }
  public QueryResult with_account_date(String account_date) {
    this.account_date = account_date;
    return this;
  }
  private Long team_id;
  public Long get_team_id() {
    return team_id;
  }
  public void set_team_id(Long team_id) {
    this.team_id = team_id;
  }
  public QueryResult with_team_id(Long team_id) {
    this.team_id = team_id;
    return this;
  }
  private String team_name;
  public String get_team_name() {
    return team_name;
  }
  public void set_team_name(String team_name) {
    this.team_name = team_name;
  }
  public QueryResult with_team_name(String team_name) {
    this.team_name = team_name;
    return this;
  }
  private java.math.BigDecimal team_price;
  public java.math.BigDecimal get_team_price() {
    return team_price;
  }
  public void set_team_price(java.math.BigDecimal team_price) {
    this.team_price = team_price;
  }
  public QueryResult with_team_price(java.math.BigDecimal team_price) {
    this.team_price = team_price;
    return this;
  }
  private java.math.BigDecimal team_cost_price;
  public java.math.BigDecimal get_team_cost_price() {
    return team_cost_price;
  }
  public void set_team_cost_price(java.math.BigDecimal team_cost_price) {
    this.team_cost_price = team_cost_price;
  }
  public QueryResult with_team_cost_price(java.math.BigDecimal team_cost_price) {
    this.team_cost_price = team_cost_price;
    return this;
  }
  private String sale_channel;
  public String get_sale_channel() {
    return sale_channel;
  }
  public void set_sale_channel(String sale_channel) {
    this.sale_channel = sale_channel;
  }
  public QueryResult with_sale_channel(String sale_channel) {
    this.sale_channel = sale_channel;
    return this;
  }
  private String team_dispatching_type;
  public String get_team_dispatching_type() {
    return team_dispatching_type;
  }
  public void set_team_dispatching_type(String team_dispatching_type) {
    this.team_dispatching_type = team_dispatching_type;
  }
  public QueryResult with_team_dispatching_type(String team_dispatching_type) {
    this.team_dispatching_type = team_dispatching_type;
    return this;
  }
  private String is_other_tuan_flag;
  public String get_is_other_tuan_flag() {
    return is_other_tuan_flag;
  }
  public void set_is_other_tuan_flag(String is_other_tuan_flag) {
    this.is_other_tuan_flag = is_other_tuan_flag;
  }
  public QueryResult with_is_other_tuan_flag(String is_other_tuan_flag) {
    this.is_other_tuan_flag = is_other_tuan_flag;
    return this;
  }
  private String order_source;
  public String get_order_source() {
    return order_source;
  }
  public void set_order_source(String order_source) {
    this.order_source = order_source;
  }
  public QueryResult with_order_source(String order_source) {
    this.order_source = order_source;
    return this;
  }
  private String order_type;
  public String get_order_type() {
    return order_type;
  }
  public void set_order_type(String order_type) {
    this.order_type = order_type;
  }
  public QueryResult with_order_type(String order_type) {
    this.order_type = order_type;
    return this;
  }
  private String hotel_seq;
  public String get_hotel_seq() {
    return hotel_seq;
  }
  public void set_hotel_seq(String hotel_seq) {
    this.hotel_seq = hotel_seq;
  }
  public QueryResult with_hotel_seq(String hotel_seq) {
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
  public QueryResult with_hotel_name(String hotel_name) {
    this.hotel_name = hotel_name;
    return this;
  }
  private String sign_company;
  public String get_sign_company() {
    return sign_company;
  }
  public void set_sign_company(String sign_company) {
    this.sign_company = sign_company;
  }
  public QueryResult with_sign_company(String sign_company) {
    this.sign_company = sign_company;
    return this;
  }
  private String belong_dept_code;
  public String get_belong_dept_code() {
    return belong_dept_code;
  }
  public void set_belong_dept_code(String belong_dept_code) {
    this.belong_dept_code = belong_dept_code;
  }
  public QueryResult with_belong_dept_code(String belong_dept_code) {
    this.belong_dept_code = belong_dept_code;
    return this;
  }
  private String coupon_no;
  public String get_coupon_no() {
    return coupon_no;
  }
  public void set_coupon_no(String coupon_no) {
    this.coupon_no = coupon_no;
  }
  public QueryResult with_coupon_no(String coupon_no) {
    this.coupon_no = coupon_no;
    return this;
  }
  private Long buy_qty;
  public Long get_buy_qty() {
    return buy_qty;
  }
  public void set_buy_qty(Long buy_qty) {
    this.buy_qty = buy_qty;
  }
  public QueryResult with_buy_qty(Long buy_qty) {
    this.buy_qty = buy_qty;
    return this;
  }
  private Long refund_qty;
  public Long get_refund_qty() {
    return refund_qty;
  }
  public void set_refund_qty(Long refund_qty) {
    this.refund_qty = refund_qty;
  }
  public QueryResult with_refund_qty(Long refund_qty) {
    this.refund_qty = refund_qty;
    return this;
  }
  private Long consume_qty;
  public Long get_consume_qty() {
    return consume_qty;
  }
  public void set_consume_qty(Long consume_qty) {
    this.consume_qty = consume_qty;
  }
  public QueryResult with_consume_qty(Long consume_qty) {
    this.consume_qty = consume_qty;
    return this;
  }
  private Long restore_qty;
  public Long get_restore_qty() {
    return restore_qty;
  }
  public void set_restore_qty(Long restore_qty) {
    this.restore_qty = restore_qty;
  }
  public QueryResult with_restore_qty(Long restore_qty) {
    this.restore_qty = restore_qty;
    return this;
  }
  private java.math.BigDecimal red_envelope_amt;
  public java.math.BigDecimal get_red_envelope_amt() {
    return red_envelope_amt;
  }
  public void set_red_envelope_amt(java.math.BigDecimal red_envelope_amt) {
    this.red_envelope_amt = red_envelope_amt;
  }
  public QueryResult with_red_envelope_amt(java.math.BigDecimal red_envelope_amt) {
    this.red_envelope_amt = red_envelope_amt;
    return this;
  }
  private java.math.BigDecimal card_amt;
  public java.math.BigDecimal get_card_amt() {
    return card_amt;
  }
  public void set_card_amt(java.math.BigDecimal card_amt) {
    this.card_amt = card_amt;
  }
  public QueryResult with_card_amt(java.math.BigDecimal card_amt) {
    this.card_amt = card_amt;
    return this;
  }
  private java.math.BigDecimal discount_amt;
  public java.math.BigDecimal get_discount_amt() {
    return discount_amt;
  }
  public void set_discount_amt(java.math.BigDecimal discount_amt) {
    this.discount_amt = discount_amt;
  }
  public QueryResult with_discount_amt(java.math.BigDecimal discount_amt) {
    this.discount_amt = discount_amt;
    return this;
  }
  private java.math.BigDecimal pay_amt;
  public java.math.BigDecimal get_pay_amt() {
    return pay_amt;
  }
  public void set_pay_amt(java.math.BigDecimal pay_amt) {
    this.pay_amt = pay_amt;
  }
  public QueryResult with_pay_amt(java.math.BigDecimal pay_amt) {
    this.pay_amt = pay_amt;
    return this;
  }
  private java.math.BigDecimal refund_amt;
  public java.math.BigDecimal get_refund_amt() {
    return refund_amt;
  }
  public void set_refund_amt(java.math.BigDecimal refund_amt) {
    this.refund_amt = refund_amt;
  }
  public QueryResult with_refund_amt(java.math.BigDecimal refund_amt) {
    this.refund_amt = refund_amt;
    return this;
  }
  private java.math.BigDecimal profit;
  public java.math.BigDecimal get_profit() {
    return profit;
  }
  public void set_profit(java.math.BigDecimal profit) {
    this.profit = profit;
  }
  public QueryResult with_profit(java.math.BigDecimal profit) {
    this.profit = profit;
    return this;
  }
  private java.math.BigDecimal revenue;
  public java.math.BigDecimal get_revenue() {
    return revenue;
  }
  public void set_revenue(java.math.BigDecimal revenue) {
    this.revenue = revenue;
  }
  public QueryResult with_revenue(java.math.BigDecimal revenue) {
    this.revenue = revenue;
    return this;
  }
  private java.math.BigDecimal channel_service_charge;
  public java.math.BigDecimal get_channel_service_charge() {
    return channel_service_charge;
  }
  public void set_channel_service_charge(java.math.BigDecimal channel_service_charge) {
    this.channel_service_charge = channel_service_charge;
  }
  public QueryResult with_channel_service_charge(java.math.BigDecimal channel_service_charge) {
    this.channel_service_charge = channel_service_charge;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.account_month == null ? that.account_month == null : this.account_month.equals(that.account_month));
    equal = equal && (this.account_date == null ? that.account_date == null : this.account_date.equals(that.account_date));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.team_name == null ? that.team_name == null : this.team_name.equals(that.team_name));
    equal = equal && (this.team_price == null ? that.team_price == null : this.team_price.equals(that.team_price));
    equal = equal && (this.team_cost_price == null ? that.team_cost_price == null : this.team_cost_price.equals(that.team_cost_price));
    equal = equal && (this.sale_channel == null ? that.sale_channel == null : this.sale_channel.equals(that.sale_channel));
    equal = equal && (this.team_dispatching_type == null ? that.team_dispatching_type == null : this.team_dispatching_type.equals(that.team_dispatching_type));
    equal = equal && (this.is_other_tuan_flag == null ? that.is_other_tuan_flag == null : this.is_other_tuan_flag.equals(that.is_other_tuan_flag));
    equal = equal && (this.order_source == null ? that.order_source == null : this.order_source.equals(that.order_source));
    equal = equal && (this.order_type == null ? that.order_type == null : this.order_type.equals(that.order_type));
    equal = equal && (this.hotel_seq == null ? that.hotel_seq == null : this.hotel_seq.equals(that.hotel_seq));
    equal = equal && (this.hotel_name == null ? that.hotel_name == null : this.hotel_name.equals(that.hotel_name));
    equal = equal && (this.sign_company == null ? that.sign_company == null : this.sign_company.equals(that.sign_company));
    equal = equal && (this.belong_dept_code == null ? that.belong_dept_code == null : this.belong_dept_code.equals(that.belong_dept_code));
    equal = equal && (this.coupon_no == null ? that.coupon_no == null : this.coupon_no.equals(that.coupon_no));
    equal = equal && (this.buy_qty == null ? that.buy_qty == null : this.buy_qty.equals(that.buy_qty));
    equal = equal && (this.refund_qty == null ? that.refund_qty == null : this.refund_qty.equals(that.refund_qty));
    equal = equal && (this.consume_qty == null ? that.consume_qty == null : this.consume_qty.equals(that.consume_qty));
    equal = equal && (this.restore_qty == null ? that.restore_qty == null : this.restore_qty.equals(that.restore_qty));
    equal = equal && (this.red_envelope_amt == null ? that.red_envelope_amt == null : this.red_envelope_amt.equals(that.red_envelope_amt));
    equal = equal && (this.card_amt == null ? that.card_amt == null : this.card_amt.equals(that.card_amt));
    equal = equal && (this.discount_amt == null ? that.discount_amt == null : this.discount_amt.equals(that.discount_amt));
    equal = equal && (this.pay_amt == null ? that.pay_amt == null : this.pay_amt.equals(that.pay_amt));
    equal = equal && (this.refund_amt == null ? that.refund_amt == null : this.refund_amt.equals(that.refund_amt));
    equal = equal && (this.profit == null ? that.profit == null : this.profit.equals(that.profit));
    equal = equal && (this.revenue == null ? that.revenue == null : this.revenue.equals(that.revenue));
    equal = equal && (this.channel_service_charge == null ? that.channel_service_charge == null : this.channel_service_charge.equals(that.channel_service_charge));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.account_month == null ? that.account_month == null : this.account_month.equals(that.account_month));
    equal = equal && (this.account_date == null ? that.account_date == null : this.account_date.equals(that.account_date));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.team_name == null ? that.team_name == null : this.team_name.equals(that.team_name));
    equal = equal && (this.team_price == null ? that.team_price == null : this.team_price.equals(that.team_price));
    equal = equal && (this.team_cost_price == null ? that.team_cost_price == null : this.team_cost_price.equals(that.team_cost_price));
    equal = equal && (this.sale_channel == null ? that.sale_channel == null : this.sale_channel.equals(that.sale_channel));
    equal = equal && (this.team_dispatching_type == null ? that.team_dispatching_type == null : this.team_dispatching_type.equals(that.team_dispatching_type));
    equal = equal && (this.is_other_tuan_flag == null ? that.is_other_tuan_flag == null : this.is_other_tuan_flag.equals(that.is_other_tuan_flag));
    equal = equal && (this.order_source == null ? that.order_source == null : this.order_source.equals(that.order_source));
    equal = equal && (this.order_type == null ? that.order_type == null : this.order_type.equals(that.order_type));
    equal = equal && (this.hotel_seq == null ? that.hotel_seq == null : this.hotel_seq.equals(that.hotel_seq));
    equal = equal && (this.hotel_name == null ? that.hotel_name == null : this.hotel_name.equals(that.hotel_name));
    equal = equal && (this.sign_company == null ? that.sign_company == null : this.sign_company.equals(that.sign_company));
    equal = equal && (this.belong_dept_code == null ? that.belong_dept_code == null : this.belong_dept_code.equals(that.belong_dept_code));
    equal = equal && (this.coupon_no == null ? that.coupon_no == null : this.coupon_no.equals(that.coupon_no));
    equal = equal && (this.buy_qty == null ? that.buy_qty == null : this.buy_qty.equals(that.buy_qty));
    equal = equal && (this.refund_qty == null ? that.refund_qty == null : this.refund_qty.equals(that.refund_qty));
    equal = equal && (this.consume_qty == null ? that.consume_qty == null : this.consume_qty.equals(that.consume_qty));
    equal = equal && (this.restore_qty == null ? that.restore_qty == null : this.restore_qty.equals(that.restore_qty));
    equal = equal && (this.red_envelope_amt == null ? that.red_envelope_amt == null : this.red_envelope_amt.equals(that.red_envelope_amt));
    equal = equal && (this.card_amt == null ? that.card_amt == null : this.card_amt.equals(that.card_amt));
    equal = equal && (this.discount_amt == null ? that.discount_amt == null : this.discount_amt.equals(that.discount_amt));
    equal = equal && (this.pay_amt == null ? that.pay_amt == null : this.pay_amt.equals(that.pay_amt));
    equal = equal && (this.refund_amt == null ? that.refund_amt == null : this.refund_amt.equals(that.refund_amt));
    equal = equal && (this.profit == null ? that.profit == null : this.profit.equals(that.profit));
    equal = equal && (this.revenue == null ? that.revenue == null : this.revenue.equals(that.revenue));
    equal = equal && (this.channel_service_charge == null ? that.channel_service_charge == null : this.channel_service_charge.equals(that.channel_service_charge));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.account_month = JdbcWritableBridge.readString(1, __dbResults);
    this.account_date = JdbcWritableBridge.readString(2, __dbResults);
    this.team_id = JdbcWritableBridge.readLong(3, __dbResults);
    this.team_name = JdbcWritableBridge.readString(4, __dbResults);
    this.team_price = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.team_cost_price = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.sale_channel = JdbcWritableBridge.readString(7, __dbResults);
    this.team_dispatching_type = JdbcWritableBridge.readString(8, __dbResults);
    this.is_other_tuan_flag = JdbcWritableBridge.readString(9, __dbResults);
    this.order_source = JdbcWritableBridge.readString(10, __dbResults);
    this.order_type = JdbcWritableBridge.readString(11, __dbResults);
    this.hotel_seq = JdbcWritableBridge.readString(12, __dbResults);
    this.hotel_name = JdbcWritableBridge.readString(13, __dbResults);
    this.sign_company = JdbcWritableBridge.readString(14, __dbResults);
    this.belong_dept_code = JdbcWritableBridge.readString(15, __dbResults);
    this.coupon_no = JdbcWritableBridge.readString(16, __dbResults);
    this.buy_qty = JdbcWritableBridge.readLong(17, __dbResults);
    this.refund_qty = JdbcWritableBridge.readLong(18, __dbResults);
    this.consume_qty = JdbcWritableBridge.readLong(19, __dbResults);
    this.restore_qty = JdbcWritableBridge.readLong(20, __dbResults);
    this.red_envelope_amt = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.card_amt = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.discount_amt = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.pay_amt = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.refund_amt = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.profit = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.revenue = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.channel_service_charge = JdbcWritableBridge.readBigDecimal(28, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.account_month = JdbcWritableBridge.readString(1, __dbResults);
    this.account_date = JdbcWritableBridge.readString(2, __dbResults);
    this.team_id = JdbcWritableBridge.readLong(3, __dbResults);
    this.team_name = JdbcWritableBridge.readString(4, __dbResults);
    this.team_price = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.team_cost_price = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.sale_channel = JdbcWritableBridge.readString(7, __dbResults);
    this.team_dispatching_type = JdbcWritableBridge.readString(8, __dbResults);
    this.is_other_tuan_flag = JdbcWritableBridge.readString(9, __dbResults);
    this.order_source = JdbcWritableBridge.readString(10, __dbResults);
    this.order_type = JdbcWritableBridge.readString(11, __dbResults);
    this.hotel_seq = JdbcWritableBridge.readString(12, __dbResults);
    this.hotel_name = JdbcWritableBridge.readString(13, __dbResults);
    this.sign_company = JdbcWritableBridge.readString(14, __dbResults);
    this.belong_dept_code = JdbcWritableBridge.readString(15, __dbResults);
    this.coupon_no = JdbcWritableBridge.readString(16, __dbResults);
    this.buy_qty = JdbcWritableBridge.readLong(17, __dbResults);
    this.refund_qty = JdbcWritableBridge.readLong(18, __dbResults);
    this.consume_qty = JdbcWritableBridge.readLong(19, __dbResults);
    this.restore_qty = JdbcWritableBridge.readLong(20, __dbResults);
    this.red_envelope_amt = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.card_amt = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.discount_amt = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.pay_amt = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.refund_amt = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.profit = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.revenue = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.channel_service_charge = JdbcWritableBridge.readBigDecimal(28, __dbResults);
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
    JdbcWritableBridge.writeString(account_month, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(account_date, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(team_id, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(team_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(team_price, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(team_cost_price, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(sale_channel, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(team_dispatching_type, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(is_other_tuan_flag, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(order_source, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(order_type, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_seq, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_name, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sign_company, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(belong_dept_code, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(coupon_no, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(buy_qty, 17 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(refund_qty, 18 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(consume_qty, 19 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(restore_qty, 20 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(red_envelope_amt, 21 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(card_amt, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(discount_amt, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pay_amt, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(refund_amt, 25 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(profit, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(revenue, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(channel_service_charge, 28 + __off, 2, __dbStmt);
    return 28;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(account_month, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(account_date, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(team_id, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(team_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(team_price, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(team_cost_price, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(sale_channel, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(team_dispatching_type, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(is_other_tuan_flag, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(order_source, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(order_type, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_seq, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_name, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sign_company, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(belong_dept_code, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(coupon_no, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(buy_qty, 17 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(refund_qty, 18 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(consume_qty, 19 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(restore_qty, 20 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(red_envelope_amt, 21 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(card_amt, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(discount_amt, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pay_amt, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(refund_amt, 25 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(profit, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(revenue, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(channel_service_charge, 28 + __off, 2, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.account_month = null;
    } else {
    this.account_month = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.account_date = null;
    } else {
    this.account_date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.team_id = null;
    } else {
    this.team_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.team_name = null;
    } else {
    this.team_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.team_price = null;
    } else {
    this.team_price = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.team_cost_price = null;
    } else {
    this.team_cost_price = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sale_channel = null;
    } else {
    this.sale_channel = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.team_dispatching_type = null;
    } else {
    this.team_dispatching_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.is_other_tuan_flag = null;
    } else {
    this.is_other_tuan_flag = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_source = null;
    } else {
    this.order_source = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_type = null;
    } else {
    this.order_type = Text.readString(__dataIn);
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
        this.sign_company = null;
    } else {
    this.sign_company = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.belong_dept_code = null;
    } else {
    this.belong_dept_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.coupon_no = null;
    } else {
    this.coupon_no = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.buy_qty = null;
    } else {
    this.buy_qty = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.refund_qty = null;
    } else {
    this.refund_qty = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.consume_qty = null;
    } else {
    this.consume_qty = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.restore_qty = null;
    } else {
    this.restore_qty = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.red_envelope_amt = null;
    } else {
    this.red_envelope_amt = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.card_amt = null;
    } else {
    this.card_amt = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.discount_amt = null;
    } else {
    this.discount_amt = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pay_amt = null;
    } else {
    this.pay_amt = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.refund_amt = null;
    } else {
    this.refund_amt = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.profit = null;
    } else {
    this.profit = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.revenue = null;
    } else {
    this.revenue = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.channel_service_charge = null;
    } else {
    this.channel_service_charge = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.account_month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, account_month);
    }
    if (null == this.account_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, account_date);
    }
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.team_id);
    }
    if (null == this.team_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_name);
    }
    if (null == this.team_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.team_price, __dataOut);
    }
    if (null == this.team_cost_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.team_cost_price, __dataOut);
    }
    if (null == this.sale_channel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sale_channel);
    }
    if (null == this.team_dispatching_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_dispatching_type);
    }
    if (null == this.is_other_tuan_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, is_other_tuan_flag);
    }
    if (null == this.order_source) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_source);
    }
    if (null == this.order_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_type);
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
    if (null == this.sign_company) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sign_company);
    }
    if (null == this.belong_dept_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, belong_dept_code);
    }
    if (null == this.coupon_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, coupon_no);
    }
    if (null == this.buy_qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.buy_qty);
    }
    if (null == this.refund_qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.refund_qty);
    }
    if (null == this.consume_qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.consume_qty);
    }
    if (null == this.restore_qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.restore_qty);
    }
    if (null == this.red_envelope_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.red_envelope_amt, __dataOut);
    }
    if (null == this.card_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.card_amt, __dataOut);
    }
    if (null == this.discount_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.discount_amt, __dataOut);
    }
    if (null == this.pay_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.pay_amt, __dataOut);
    }
    if (null == this.refund_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.refund_amt, __dataOut);
    }
    if (null == this.profit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.profit, __dataOut);
    }
    if (null == this.revenue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.revenue, __dataOut);
    }
    if (null == this.channel_service_charge) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.channel_service_charge, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.account_month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, account_month);
    }
    if (null == this.account_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, account_date);
    }
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.team_id);
    }
    if (null == this.team_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_name);
    }
    if (null == this.team_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.team_price, __dataOut);
    }
    if (null == this.team_cost_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.team_cost_price, __dataOut);
    }
    if (null == this.sale_channel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sale_channel);
    }
    if (null == this.team_dispatching_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_dispatching_type);
    }
    if (null == this.is_other_tuan_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, is_other_tuan_flag);
    }
    if (null == this.order_source) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_source);
    }
    if (null == this.order_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_type);
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
    if (null == this.sign_company) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sign_company);
    }
    if (null == this.belong_dept_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, belong_dept_code);
    }
    if (null == this.coupon_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, coupon_no);
    }
    if (null == this.buy_qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.buy_qty);
    }
    if (null == this.refund_qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.refund_qty);
    }
    if (null == this.consume_qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.consume_qty);
    }
    if (null == this.restore_qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.restore_qty);
    }
    if (null == this.red_envelope_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.red_envelope_amt, __dataOut);
    }
    if (null == this.card_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.card_amt, __dataOut);
    }
    if (null == this.discount_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.discount_amt, __dataOut);
    }
    if (null == this.pay_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.pay_amt, __dataOut);
    }
    if (null == this.refund_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.refund_amt, __dataOut);
    }
    if (null == this.profit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.profit, __dataOut);
    }
    if (null == this.revenue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.revenue, __dataOut);
    }
    if (null == this.channel_service_charge) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.channel_service_charge, __dataOut);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(account_month==null?"\\N":account_month, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(account_date==null?"\\N":account_date, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(team_name==null?"\\N":team_name, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_price==null?"null":team_price.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_cost_price==null?"null":team_cost_price.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(sale_channel==null?"\\N":sale_channel, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(team_dispatching_type==null?"\\N":team_dispatching_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(is_other_tuan_flag==null?"\\N":is_other_tuan_flag, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(order_source==null?"\\N":order_source, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(order_type==null?"\\N":order_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hotel_seq==null?"\\N":hotel_seq, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hotel_name==null?"\\N":hotel_name, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(sign_company==null?"\\N":sign_company, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(belong_dept_code==null?"\\N":belong_dept_code, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(coupon_no==null?"\\N":coupon_no, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_qty==null?"null":"" + buy_qty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_qty==null?"null":"" + refund_qty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consume_qty==null?"null":"" + consume_qty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(restore_qty==null?"null":"" + restore_qty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(red_envelope_amt==null?"null":red_envelope_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(card_amt==null?"null":card_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(discount_amt==null?"null":discount_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_amt==null?"null":pay_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_amt==null?"null":refund_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(profit==null?"null":profit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(revenue==null?"null":revenue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(channel_service_charge==null?"null":channel_service_charge.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(account_month==null?"\\N":account_month, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(account_date==null?"\\N":account_date, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(team_name==null?"\\N":team_name, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_price==null?"null":team_price.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_cost_price==null?"null":team_cost_price.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(sale_channel==null?"\\N":sale_channel, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(team_dispatching_type==null?"\\N":team_dispatching_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(is_other_tuan_flag==null?"\\N":is_other_tuan_flag, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(order_source==null?"\\N":order_source, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(order_type==null?"\\N":order_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hotel_seq==null?"\\N":hotel_seq, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hotel_name==null?"\\N":hotel_name, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(sign_company==null?"\\N":sign_company, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(belong_dept_code==null?"\\N":belong_dept_code, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(coupon_no==null?"\\N":coupon_no, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_qty==null?"null":"" + buy_qty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_qty==null?"null":"" + refund_qty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(consume_qty==null?"null":"" + consume_qty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(restore_qty==null?"null":"" + restore_qty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(red_envelope_amt==null?"null":red_envelope_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(card_amt==null?"null":card_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(discount_amt==null?"null":discount_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_amt==null?"null":pay_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_amt==null?"null":refund_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(profit==null?"null":profit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(revenue==null?"null":revenue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(channel_service_charge==null?"null":channel_service_charge.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.account_month = null; } else {
      this.account_month = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.account_date = null; } else {
      this.account_date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.team_name = null; } else {
      this.team_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_price = null; } else {
      this.team_price = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_cost_price = null; } else {
      this.team_cost_price = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sale_channel = null; } else {
      this.sale_channel = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.team_dispatching_type = null; } else {
      this.team_dispatching_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.is_other_tuan_flag = null; } else {
      this.is_other_tuan_flag = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.order_source = null; } else {
      this.order_source = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.order_type = null; } else {
      this.order_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hotel_seq = null; } else {
      this.hotel_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hotel_name = null; } else {
      this.hotel_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sign_company = null; } else {
      this.sign_company = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.belong_dept_code = null; } else {
      this.belong_dept_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.coupon_no = null; } else {
      this.coupon_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.buy_qty = null; } else {
      this.buy_qty = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_qty = null; } else {
      this.refund_qty = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.consume_qty = null; } else {
      this.consume_qty = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.restore_qty = null; } else {
      this.restore_qty = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.red_envelope_amt = null; } else {
      this.red_envelope_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.card_amt = null; } else {
      this.card_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.discount_amt = null; } else {
      this.discount_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pay_amt = null; } else {
      this.pay_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_amt = null; } else {
      this.refund_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.profit = null; } else {
      this.profit = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.revenue = null; } else {
      this.revenue = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.channel_service_charge = null; } else {
      this.channel_service_charge = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.account_month = null; } else {
      this.account_month = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.account_date = null; } else {
      this.account_date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.team_name = null; } else {
      this.team_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_price = null; } else {
      this.team_price = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_cost_price = null; } else {
      this.team_cost_price = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sale_channel = null; } else {
      this.sale_channel = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.team_dispatching_type = null; } else {
      this.team_dispatching_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.is_other_tuan_flag = null; } else {
      this.is_other_tuan_flag = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.order_source = null; } else {
      this.order_source = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.order_type = null; } else {
      this.order_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hotel_seq = null; } else {
      this.hotel_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hotel_name = null; } else {
      this.hotel_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sign_company = null; } else {
      this.sign_company = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.belong_dept_code = null; } else {
      this.belong_dept_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.coupon_no = null; } else {
      this.coupon_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.buy_qty = null; } else {
      this.buy_qty = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_qty = null; } else {
      this.refund_qty = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.consume_qty = null; } else {
      this.consume_qty = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.restore_qty = null; } else {
      this.restore_qty = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.red_envelope_amt = null; } else {
      this.red_envelope_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.card_amt = null; } else {
      this.card_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.discount_amt = null; } else {
      this.discount_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pay_amt = null; } else {
      this.pay_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_amt = null; } else {
      this.refund_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.profit = null; } else {
      this.profit = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.revenue = null; } else {
      this.revenue = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.channel_service_charge = null; } else {
      this.channel_service_charge = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("account_month", this.account_month);
    __sqoop$field_map.put("account_date", this.account_date);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("team_name", this.team_name);
    __sqoop$field_map.put("team_price", this.team_price);
    __sqoop$field_map.put("team_cost_price", this.team_cost_price);
    __sqoop$field_map.put("sale_channel", this.sale_channel);
    __sqoop$field_map.put("team_dispatching_type", this.team_dispatching_type);
    __sqoop$field_map.put("is_other_tuan_flag", this.is_other_tuan_flag);
    __sqoop$field_map.put("order_source", this.order_source);
    __sqoop$field_map.put("order_type", this.order_type);
    __sqoop$field_map.put("hotel_seq", this.hotel_seq);
    __sqoop$field_map.put("hotel_name", this.hotel_name);
    __sqoop$field_map.put("sign_company", this.sign_company);
    __sqoop$field_map.put("belong_dept_code", this.belong_dept_code);
    __sqoop$field_map.put("coupon_no", this.coupon_no);
    __sqoop$field_map.put("buy_qty", this.buy_qty);
    __sqoop$field_map.put("refund_qty", this.refund_qty);
    __sqoop$field_map.put("consume_qty", this.consume_qty);
    __sqoop$field_map.put("restore_qty", this.restore_qty);
    __sqoop$field_map.put("red_envelope_amt", this.red_envelope_amt);
    __sqoop$field_map.put("card_amt", this.card_amt);
    __sqoop$field_map.put("discount_amt", this.discount_amt);
    __sqoop$field_map.put("pay_amt", this.pay_amt);
    __sqoop$field_map.put("refund_amt", this.refund_amt);
    __sqoop$field_map.put("profit", this.profit);
    __sqoop$field_map.put("revenue", this.revenue);
    __sqoop$field_map.put("channel_service_charge", this.channel_service_charge);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("account_month", this.account_month);
    __sqoop$field_map.put("account_date", this.account_date);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("team_name", this.team_name);
    __sqoop$field_map.put("team_price", this.team_price);
    __sqoop$field_map.put("team_cost_price", this.team_cost_price);
    __sqoop$field_map.put("sale_channel", this.sale_channel);
    __sqoop$field_map.put("team_dispatching_type", this.team_dispatching_type);
    __sqoop$field_map.put("is_other_tuan_flag", this.is_other_tuan_flag);
    __sqoop$field_map.put("order_source", this.order_source);
    __sqoop$field_map.put("order_type", this.order_type);
    __sqoop$field_map.put("hotel_seq", this.hotel_seq);
    __sqoop$field_map.put("hotel_name", this.hotel_name);
    __sqoop$field_map.put("sign_company", this.sign_company);
    __sqoop$field_map.put("belong_dept_code", this.belong_dept_code);
    __sqoop$field_map.put("coupon_no", this.coupon_no);
    __sqoop$field_map.put("buy_qty", this.buy_qty);
    __sqoop$field_map.put("refund_qty", this.refund_qty);
    __sqoop$field_map.put("consume_qty", this.consume_qty);
    __sqoop$field_map.put("restore_qty", this.restore_qty);
    __sqoop$field_map.put("red_envelope_amt", this.red_envelope_amt);
    __sqoop$field_map.put("card_amt", this.card_amt);
    __sqoop$field_map.put("discount_amt", this.discount_amt);
    __sqoop$field_map.put("pay_amt", this.pay_amt);
    __sqoop$field_map.put("refund_amt", this.refund_amt);
    __sqoop$field_map.put("profit", this.profit);
    __sqoop$field_map.put("revenue", this.revenue);
    __sqoop$field_map.put("channel_service_charge", this.channel_service_charge);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("account_month".equals(__fieldName)) {
      this.account_month = (String) __fieldVal;
    }
    else    if ("account_date".equals(__fieldName)) {
      this.account_date = (String) __fieldVal;
    }
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Long) __fieldVal;
    }
    else    if ("team_name".equals(__fieldName)) {
      this.team_name = (String) __fieldVal;
    }
    else    if ("team_price".equals(__fieldName)) {
      this.team_price = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("team_cost_price".equals(__fieldName)) {
      this.team_cost_price = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("sale_channel".equals(__fieldName)) {
      this.sale_channel = (String) __fieldVal;
    }
    else    if ("team_dispatching_type".equals(__fieldName)) {
      this.team_dispatching_type = (String) __fieldVal;
    }
    else    if ("is_other_tuan_flag".equals(__fieldName)) {
      this.is_other_tuan_flag = (String) __fieldVal;
    }
    else    if ("order_source".equals(__fieldName)) {
      this.order_source = (String) __fieldVal;
    }
    else    if ("order_type".equals(__fieldName)) {
      this.order_type = (String) __fieldVal;
    }
    else    if ("hotel_seq".equals(__fieldName)) {
      this.hotel_seq = (String) __fieldVal;
    }
    else    if ("hotel_name".equals(__fieldName)) {
      this.hotel_name = (String) __fieldVal;
    }
    else    if ("sign_company".equals(__fieldName)) {
      this.sign_company = (String) __fieldVal;
    }
    else    if ("belong_dept_code".equals(__fieldName)) {
      this.belong_dept_code = (String) __fieldVal;
    }
    else    if ("coupon_no".equals(__fieldName)) {
      this.coupon_no = (String) __fieldVal;
    }
    else    if ("buy_qty".equals(__fieldName)) {
      this.buy_qty = (Long) __fieldVal;
    }
    else    if ("refund_qty".equals(__fieldName)) {
      this.refund_qty = (Long) __fieldVal;
    }
    else    if ("consume_qty".equals(__fieldName)) {
      this.consume_qty = (Long) __fieldVal;
    }
    else    if ("restore_qty".equals(__fieldName)) {
      this.restore_qty = (Long) __fieldVal;
    }
    else    if ("red_envelope_amt".equals(__fieldName)) {
      this.red_envelope_amt = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("card_amt".equals(__fieldName)) {
      this.card_amt = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("discount_amt".equals(__fieldName)) {
      this.discount_amt = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("pay_amt".equals(__fieldName)) {
      this.pay_amt = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("refund_amt".equals(__fieldName)) {
      this.refund_amt = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("profit".equals(__fieldName)) {
      this.profit = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("revenue".equals(__fieldName)) {
      this.revenue = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("channel_service_charge".equals(__fieldName)) {
      this.channel_service_charge = (java.math.BigDecimal) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("account_month".equals(__fieldName)) {
      this.account_month = (String) __fieldVal;
      return true;
    }
    else    if ("account_date".equals(__fieldName)) {
      this.account_date = (String) __fieldVal;
      return true;
    }
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Long) __fieldVal;
      return true;
    }
    else    if ("team_name".equals(__fieldName)) {
      this.team_name = (String) __fieldVal;
      return true;
    }
    else    if ("team_price".equals(__fieldName)) {
      this.team_price = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("team_cost_price".equals(__fieldName)) {
      this.team_cost_price = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("sale_channel".equals(__fieldName)) {
      this.sale_channel = (String) __fieldVal;
      return true;
    }
    else    if ("team_dispatching_type".equals(__fieldName)) {
      this.team_dispatching_type = (String) __fieldVal;
      return true;
    }
    else    if ("is_other_tuan_flag".equals(__fieldName)) {
      this.is_other_tuan_flag = (String) __fieldVal;
      return true;
    }
    else    if ("order_source".equals(__fieldName)) {
      this.order_source = (String) __fieldVal;
      return true;
    }
    else    if ("order_type".equals(__fieldName)) {
      this.order_type = (String) __fieldVal;
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
    else    if ("sign_company".equals(__fieldName)) {
      this.sign_company = (String) __fieldVal;
      return true;
    }
    else    if ("belong_dept_code".equals(__fieldName)) {
      this.belong_dept_code = (String) __fieldVal;
      return true;
    }
    else    if ("coupon_no".equals(__fieldName)) {
      this.coupon_no = (String) __fieldVal;
      return true;
    }
    else    if ("buy_qty".equals(__fieldName)) {
      this.buy_qty = (Long) __fieldVal;
      return true;
    }
    else    if ("refund_qty".equals(__fieldName)) {
      this.refund_qty = (Long) __fieldVal;
      return true;
    }
    else    if ("consume_qty".equals(__fieldName)) {
      this.consume_qty = (Long) __fieldVal;
      return true;
    }
    else    if ("restore_qty".equals(__fieldName)) {
      this.restore_qty = (Long) __fieldVal;
      return true;
    }
    else    if ("red_envelope_amt".equals(__fieldName)) {
      this.red_envelope_amt = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("card_amt".equals(__fieldName)) {
      this.card_amt = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("discount_amt".equals(__fieldName)) {
      this.discount_amt = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("pay_amt".equals(__fieldName)) {
      this.pay_amt = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("refund_amt".equals(__fieldName)) {
      this.refund_amt = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("profit".equals(__fieldName)) {
      this.profit = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("revenue".equals(__fieldName)) {
      this.revenue = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("channel_service_charge".equals(__fieldName)) {
      this.channel_service_charge = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
