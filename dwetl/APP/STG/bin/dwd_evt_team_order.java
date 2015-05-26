// ORM class for table 'dwd_evt_team_order'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Dec 30 16:38:18 CST 2014
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

public class dwd_evt_team_order extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer order_id;
  public Integer get_order_id() {
    return order_id;
  }
  public void set_order_id(Integer order_id) {
    this.order_id = order_id;
  }
  public dwd_evt_team_order with_order_id(Integer order_id) {
    this.order_id = order_id;
    return this;
  }
  private String platform_type;
  public String get_platform_type() {
    return platform_type;
  }
  public void set_platform_type(String platform_type) {
    this.platform_type = platform_type;
  }
  public dwd_evt_team_order with_platform_type(String platform_type) {
    this.platform_type = platform_type;
    return this;
  }
  private String pay_seq;
  public String get_pay_seq() {
    return pay_seq;
  }
  public void set_pay_seq(String pay_seq) {
    this.pay_seq = pay_seq;
  }
  public dwd_evt_team_order with_pay_seq(String pay_seq) {
    this.pay_seq = pay_seq;
    return this;
  }
  private Integer buy_seq;
  public Integer get_buy_seq() {
    return buy_seq;
  }
  public void set_buy_seq(Integer buy_seq) {
    this.buy_seq = buy_seq;
  }
  public dwd_evt_team_order with_buy_seq(Integer buy_seq) {
    this.buy_seq = buy_seq;
    return this;
  }
  private String pay_method;
  public String get_pay_method() {
    return pay_method;
  }
  public void set_pay_method(String pay_method) {
    this.pay_method = pay_method;
  }
  public dwd_evt_team_order with_pay_method(String pay_method) {
    this.pay_method = pay_method;
    return this;
  }
  private Integer user_id;
  public Integer get_user_id() {
    return user_id;
  }
  public void set_user_id(Integer user_id) {
    this.user_id = user_id;
  }
  public dwd_evt_team_order with_user_id(Integer user_id) {
    this.user_id = user_id;
    return this;
  }
  private String user_mobile;
  public String get_user_mobile() {
    return user_mobile;
  }
  public void set_user_mobile(String user_mobile) {
    this.user_mobile = user_mobile;
  }
  public dwd_evt_team_order with_user_mobile(String user_mobile) {
    this.user_mobile = user_mobile;
    return this;
  }
  private String user_email;
  public String get_user_email() {
    return user_email;
  }
  public void set_user_email(String user_email) {
    this.user_email = user_email;
  }
  public dwd_evt_team_order with_user_email(String user_email) {
    this.user_email = user_email;
    return this;
  }
  private String user_sex;
  public String get_user_sex() {
    return user_sex;
  }
  public void set_user_sex(String user_sex) {
    this.user_sex = user_sex;
  }
  public dwd_evt_team_order with_user_sex(String user_sex) {
    this.user_sex = user_sex;
    return this;
  }
  private Integer admin_id;
  public Integer get_admin_id() {
    return admin_id;
  }
  public void set_admin_id(Integer admin_id) {
    this.admin_id = admin_id;
  }
  public dwd_evt_team_order with_admin_id(Integer admin_id) {
    this.admin_id = admin_id;
    return this;
  }
  private Integer team_id;
  public Integer get_team_id() {
    return team_id;
  }
  public void set_team_id(Integer team_id) {
    this.team_id = team_id;
  }
  public dwd_evt_team_order with_team_id(Integer team_id) {
    this.team_id = team_id;
    return this;
  }
  private Integer team_group_id;
  public Integer get_team_group_id() {
    return team_group_id;
  }
  public void set_team_group_id(Integer team_group_id) {
    this.team_group_id = team_group_id;
  }
  public dwd_evt_team_order with_team_group_id(Integer team_group_id) {
    this.team_group_id = team_group_id;
    return this;
  }
  private String team_hotel_seq;
  public String get_team_hotel_seq() {
    return team_hotel_seq;
  }
  public void set_team_hotel_seq(String team_hotel_seq) {
    this.team_hotel_seq = team_hotel_seq;
  }
  public dwd_evt_team_order with_team_hotel_seq(String team_hotel_seq) {
    this.team_hotel_seq = team_hotel_seq;
    return this;
  }
  private String team_hotel_name;
  public String get_team_hotel_name() {
    return team_hotel_name;
  }
  public void set_team_hotel_name(String team_hotel_name) {
    this.team_hotel_name = team_hotel_name;
  }
  public dwd_evt_team_order with_team_hotel_name(String team_hotel_name) {
    this.team_hotel_name = team_hotel_name;
    return this;
  }
  private String team_hotel_city;
  public String get_team_hotel_city() {
    return team_hotel_city;
  }
  public void set_team_hotel_city(String team_hotel_city) {
    this.team_hotel_city = team_hotel_city;
  }
  public dwd_evt_team_order with_team_hotel_city(String team_hotel_city) {
    this.team_hotel_city = team_hotel_city;
    return this;
  }
  private String team_hotel_city_name;
  public String get_team_hotel_city_name() {
    return team_hotel_city_name;
  }
  public void set_team_hotel_city_name(String team_hotel_city_name) {
    this.team_hotel_city_name = team_hotel_city_name;
  }
  public dwd_evt_team_order with_team_hotel_city_name(String team_hotel_city_name) {
    this.team_hotel_city_name = team_hotel_city_name;
    return this;
  }
  private String team_dept_code;
  public String get_team_dept_code() {
    return team_dept_code;
  }
  public void set_team_dept_code(String team_dept_code) {
    this.team_dept_code = team_dept_code;
  }
  public dwd_evt_team_order with_team_dept_code(String team_dept_code) {
    this.team_dept_code = team_dept_code;
    return this;
  }
  private String voucher_no;
  public String get_voucher_no() {
    return voucher_no;
  }
  public void set_voucher_no(String voucher_no) {
    this.voucher_no = voucher_no;
  }
  public dwd_evt_team_order with_voucher_no(String voucher_no) {
    this.voucher_no = voucher_no;
    return this;
  }
  private String order_status;
  public String get_order_status() {
    return order_status;
  }
  public void set_order_status(String order_status) {
    this.order_status = order_status;
  }
  public dwd_evt_team_order with_order_status(String order_status) {
    this.order_status = order_status;
    return this;
  }
  private Integer buy_quantity;
  public Integer get_buy_quantity() {
    return buy_quantity;
  }
  public void set_buy_quantity(Integer buy_quantity) {
    this.buy_quantity = buy_quantity;
  }
  public dwd_evt_team_order with_buy_quantity(Integer buy_quantity) {
    this.buy_quantity = buy_quantity;
    return this;
  }
  private String buy_user_mobile;
  public String get_buy_user_mobile() {
    return buy_user_mobile;
  }
  public void set_buy_user_mobile(String buy_user_mobile) {
    this.buy_user_mobile = buy_user_mobile;
  }
  public dwd_evt_team_order with_buy_user_mobile(String buy_user_mobile) {
    this.buy_user_mobile = buy_user_mobile;
    return this;
  }
  private String buy_user_mobile_city;
  public String get_buy_user_mobile_city() {
    return buy_user_mobile_city;
  }
  public void set_buy_user_mobile_city(String buy_user_mobile_city) {
    this.buy_user_mobile_city = buy_user_mobile_city;
  }
  public dwd_evt_team_order with_buy_user_mobile_city(String buy_user_mobile_city) {
    this.buy_user_mobile_city = buy_user_mobile_city;
    return this;
  }
  private String buy_user_mobile_brand;
  public String get_buy_user_mobile_brand() {
    return buy_user_mobile_brand;
  }
  public void set_buy_user_mobile_brand(String buy_user_mobile_brand) {
    this.buy_user_mobile_brand = buy_user_mobile_brand;
  }
  public dwd_evt_team_order with_buy_user_mobile_brand(String buy_user_mobile_brand) {
    this.buy_user_mobile_brand = buy_user_mobile_brand;
    return this;
  }
  private String buy_user_mobile_area;
  public String get_buy_user_mobile_area() {
    return buy_user_mobile_area;
  }
  public void set_buy_user_mobile_area(String buy_user_mobile_area) {
    this.buy_user_mobile_area = buy_user_mobile_area;
  }
  public dwd_evt_team_order with_buy_user_mobile_area(String buy_user_mobile_area) {
    this.buy_user_mobile_area = buy_user_mobile_area;
    return this;
  }
  private java.math.BigDecimal team_price;
  public java.math.BigDecimal get_team_price() {
    return team_price;
  }
  public void set_team_price(java.math.BigDecimal team_price) {
    this.team_price = team_price;
  }
  public dwd_evt_team_order with_team_price(java.math.BigDecimal team_price) {
    this.team_price = team_price;
    return this;
  }
  private java.math.BigDecimal actual_pay_amt;
  public java.math.BigDecimal get_actual_pay_amt() {
    return actual_pay_amt;
  }
  public void set_actual_pay_amt(java.math.BigDecimal actual_pay_amt) {
    this.actual_pay_amt = actual_pay_amt;
  }
  public dwd_evt_team_order with_actual_pay_amt(java.math.BigDecimal actual_pay_amt) {
    this.actual_pay_amt = actual_pay_amt;
    return this;
  }
  private java.math.BigDecimal should_pay_amt;
  public java.math.BigDecimal get_should_pay_amt() {
    return should_pay_amt;
  }
  public void set_should_pay_amt(java.math.BigDecimal should_pay_amt) {
    this.should_pay_amt = should_pay_amt;
  }
  public dwd_evt_team_order with_should_pay_amt(java.math.BigDecimal should_pay_amt) {
    this.should_pay_amt = should_pay_amt;
    return this;
  }
  private java.math.BigDecimal balance_pay_amt;
  public java.math.BigDecimal get_balance_pay_amt() {
    return balance_pay_amt;
  }
  public void set_balance_pay_amt(java.math.BigDecimal balance_pay_amt) {
    this.balance_pay_amt = balance_pay_amt;
  }
  public dwd_evt_team_order with_balance_pay_amt(java.math.BigDecimal balance_pay_amt) {
    this.balance_pay_amt = balance_pay_amt;
    return this;
  }
  private java.math.BigDecimal voucher_pay_amt;
  public java.math.BigDecimal get_voucher_pay_amt() {
    return voucher_pay_amt;
  }
  public void set_voucher_pay_amt(java.math.BigDecimal voucher_pay_amt) {
    this.voucher_pay_amt = voucher_pay_amt;
  }
  public dwd_evt_team_order with_voucher_pay_amt(java.math.BigDecimal voucher_pay_amt) {
    this.voucher_pay_amt = voucher_pay_amt;
    return this;
  }
  private String buy_limit;
  public String get_buy_limit() {
    return buy_limit;
  }
  public void set_buy_limit(String buy_limit) {
    this.buy_limit = buy_limit;
  }
  public dwd_evt_team_order with_buy_limit(String buy_limit) {
    this.buy_limit = buy_limit;
    return this;
  }
  private java.sql.Timestamp order_time;
  public java.sql.Timestamp get_order_time() {
    return order_time;
  }
  public void set_order_time(java.sql.Timestamp order_time) {
    this.order_time = order_time;
  }
  public dwd_evt_team_order with_order_time(java.sql.Timestamp order_time) {
    this.order_time = order_time;
    return this;
  }
  private java.sql.Timestamp pay_time;
  public java.sql.Timestamp get_pay_time() {
    return pay_time;
  }
  public void set_pay_time(java.sql.Timestamp pay_time) {
    this.pay_time = pay_time;
  }
  public dwd_evt_team_order with_pay_time(java.sql.Timestamp pay_time) {
    this.pay_time = pay_time;
    return this;
  }
  private Integer partner_id;
  public Integer get_partner_id() {
    return partner_id;
  }
  public void set_partner_id(Integer partner_id) {
    this.partner_id = partner_id;
  }
  public dwd_evt_team_order with_partner_id(Integer partner_id) {
    this.partner_id = partner_id;
    return this;
  }
  private String order_type;
  public String get_order_type() {
    return order_type;
  }
  public void set_order_type(String order_type) {
    this.order_type = order_type;
  }
  public dwd_evt_team_order with_order_type(String order_type) {
    this.order_type = order_type;
    return this;
  }
  private java.math.BigDecimal refund_amt;
  public java.math.BigDecimal get_refund_amt() {
    return refund_amt;
  }
  public void set_refund_amt(java.math.BigDecimal refund_amt) {
    this.refund_amt = refund_amt;
  }
  public dwd_evt_team_order with_refund_amt(java.math.BigDecimal refund_amt) {
    this.refund_amt = refund_amt;
    return this;
  }
  private Integer refund_times;
  public Integer get_refund_times() {
    return refund_times;
  }
  public void set_refund_times(Integer refund_times) {
    this.refund_times = refund_times;
  }
  public dwd_evt_team_order with_refund_times(Integer refund_times) {
    this.refund_times = refund_times;
    return this;
  }
  private java.sql.Timestamp last_refund_time;
  public java.sql.Timestamp get_last_refund_time() {
    return last_refund_time;
  }
  public void set_last_refund_time(java.sql.Timestamp last_refund_time) {
    this.last_refund_time = last_refund_time;
  }
  public dwd_evt_team_order with_last_refund_time(java.sql.Timestamp last_refund_time) {
    this.last_refund_time = last_refund_time;
    return this;
  }
  private Integer refund_quantity;
  public Integer get_refund_quantity() {
    return refund_quantity;
  }
  public void set_refund_quantity(Integer refund_quantity) {
    this.refund_quantity = refund_quantity;
  }
  public dwd_evt_team_order with_refund_quantity(Integer refund_quantity) {
    this.refund_quantity = refund_quantity;
    return this;
  }
  private Integer red_envelope;
  public Integer get_red_envelope() {
    return red_envelope;
  }
  public void set_red_envelope(Integer red_envelope) {
    this.red_envelope = red_envelope;
  }
  public dwd_evt_team_order with_red_envelope(Integer red_envelope) {
    this.red_envelope = red_envelope;
    return this;
  }
  private Integer parent_order_id;
  public Integer get_parent_order_id() {
    return parent_order_id;
  }
  public void set_parent_order_id(Integer parent_order_id) {
    this.parent_order_id = parent_order_id;
  }
  public dwd_evt_team_order with_parent_order_id(Integer parent_order_id) {
    this.parent_order_id = parent_order_id;
    return this;
  }
  private Integer lock_flag;
  public Integer get_lock_flag() {
    return lock_flag;
  }
  public void set_lock_flag(Integer lock_flag) {
    this.lock_flag = lock_flag;
  }
  public dwd_evt_team_order with_lock_flag(Integer lock_flag) {
    this.lock_flag = lock_flag;
    return this;
  }
  private Integer package_id;
  public Integer get_package_id() {
    return package_id;
  }
  public void set_package_id(Integer package_id) {
    this.package_id = package_id;
  }
  public dwd_evt_team_order with_package_id(Integer package_id) {
    this.package_id = package_id;
    return this;
  }
  private String package_type;
  public String get_package_type() {
    return package_type;
  }
  public void set_package_type(String package_type) {
    this.package_type = package_type;
  }
  public dwd_evt_team_order with_package_type(String package_type) {
    this.package_type = package_type;
    return this;
  }
  private Integer order_quick_flag;
  public Integer get_order_quick_flag() {
    return order_quick_flag;
  }
  public void set_order_quick_flag(Integer order_quick_flag) {
    this.order_quick_flag = order_quick_flag;
  }
  public dwd_evt_team_order with_order_quick_flag(Integer order_quick_flag) {
    this.order_quick_flag = order_quick_flag;
    return this;
  }
  private java.sql.Timestamp cancel_time;
  public java.sql.Timestamp get_cancel_time() {
    return cancel_time;
  }
  public void set_cancel_time(java.sql.Timestamp cancel_time) {
    this.cancel_time = cancel_time;
  }
  public dwd_evt_team_order with_cancel_time(java.sql.Timestamp cancel_time) {
    this.cancel_time = cancel_time;
    return this;
  }
  private String other_tuan_info;
  public String get_other_tuan_info() {
    return other_tuan_info;
  }
  public void set_other_tuan_info(String other_tuan_info) {
    this.other_tuan_info = other_tuan_info;
  }
  public dwd_evt_team_order with_other_tuan_info(String other_tuan_info) {
    this.other_tuan_info = other_tuan_info;
    return this;
  }
  private Integer product_version;
  public Integer get_product_version() {
    return product_version;
  }
  public void set_product_version(Integer product_version) {
    this.product_version = product_version;
  }
  public dwd_evt_team_order with_product_version(Integer product_version) {
    this.product_version = product_version;
    return this;
  }
  private String reach_shop_time;
  public String get_reach_shop_time() {
    return reach_shop_time;
  }
  public void set_reach_shop_time(String reach_shop_time) {
    this.reach_shop_time = reach_shop_time;
  }
  public dwd_evt_team_order with_reach_shop_time(String reach_shop_time) {
    this.reach_shop_time = reach_shop_time;
    return this;
  }
  private String merchant_code;
  public String get_merchant_code() {
    return merchant_code;
  }
  public void set_merchant_code(String merchant_code) {
    this.merchant_code = merchant_code;
  }
  public dwd_evt_team_order with_merchant_code(String merchant_code) {
    this.merchant_code = merchant_code;
    return this;
  }
  private String other_tuan_state;
  public String get_other_tuan_state() {
    return other_tuan_state;
  }
  public void set_other_tuan_state(String other_tuan_state) {
    this.other_tuan_state = other_tuan_state;
  }
  public dwd_evt_team_order with_other_tuan_state(String other_tuan_state) {
    this.other_tuan_state = other_tuan_state;
    return this;
  }
  private String version_no;
  public String get_version_no() {
    return version_no;
  }
  public void set_version_no(String version_no) {
    this.version_no = version_no;
  }
  public dwd_evt_team_order with_version_no(String version_no) {
    this.version_no = version_no;
    return this;
  }
  private String app_product_no;
  public String get_app_product_no() {
    return app_product_no;
  }
  public void set_app_product_no(String app_product_no) {
    this.app_product_no = app_product_no;
  }
  public dwd_evt_team_order with_app_product_no(String app_product_no) {
    this.app_product_no = app_product_no;
    return this;
  }
  private String user_device_no;
  public String get_user_device_no() {
    return user_device_no;
  }
  public void set_user_device_no(String user_device_no) {
    this.user_device_no = user_device_no;
  }
  public dwd_evt_team_order with_user_device_no(String user_device_no) {
    this.user_device_no = user_device_no;
    return this;
  }
  private String gid;
  public String get_gid() {
    return gid;
  }
  public void set_gid(String gid) {
    this.gid = gid;
  }
  public dwd_evt_team_order with_gid(String gid) {
    this.gid = gid;
    return this;
  }
  private String channel_no;
  public String get_channel_no() {
    return channel_no;
  }
  public void set_channel_no(String channel_no) {
    this.channel_no = channel_no;
  }
  public dwd_evt_team_order with_channel_no(String channel_no) {
    this.channel_no = channel_no;
    return this;
  }
  private String source_code;
  public String get_source_code() {
    return source_code;
  }
  public void set_source_code(String source_code) {
    this.source_code = source_code;
  }
  public dwd_evt_team_order with_source_code(String source_code) {
    this.source_code = source_code;
    return this;
  }
  private java.sql.Timestamp order_version;
  public java.sql.Timestamp get_order_version() {
    return order_version;
  }
  public void set_order_version(java.sql.Timestamp order_version) {
    this.order_version = order_version;
  }
  public dwd_evt_team_order with_order_version(java.sql.Timestamp order_version) {
    this.order_version = order_version;
    return this;
  }
  private java.math.BigDecimal cost_price;
  public java.math.BigDecimal get_cost_price() {
    return cost_price;
  }
  public void set_cost_price(java.math.BigDecimal cost_price) {
    this.cost_price = cost_price;
  }
  public dwd_evt_team_order with_cost_price(java.math.BigDecimal cost_price) {
    this.cost_price = cost_price;
    return this;
  }
  private String web_traffic_source_channel;
  public String get_web_traffic_source_channel() {
    return web_traffic_source_channel;
  }
  public void set_web_traffic_source_channel(String web_traffic_source_channel) {
    this.web_traffic_source_channel = web_traffic_source_channel;
  }
  public dwd_evt_team_order with_web_traffic_source_channel(String web_traffic_source_channel) {
    this.web_traffic_source_channel = web_traffic_source_channel;
    return this;
  }
  private Integer baojian_total;
  public Integer get_baojian_total() {
    return baojian_total;
  }
  public void set_baojian_total(Integer baojian_total) {
    this.baojian_total = baojian_total;
  }
  public dwd_evt_team_order with_baojian_total(Integer baojian_total) {
    this.baojian_total = baojian_total;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dwd_evt_team_order)) {
      return false;
    }
    dwd_evt_team_order that = (dwd_evt_team_order) o;
    boolean equal = true;
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.platform_type == null ? that.platform_type == null : this.platform_type.equals(that.platform_type));
    equal = equal && (this.pay_seq == null ? that.pay_seq == null : this.pay_seq.equals(that.pay_seq));
    equal = equal && (this.buy_seq == null ? that.buy_seq == null : this.buy_seq.equals(that.buy_seq));
    equal = equal && (this.pay_method == null ? that.pay_method == null : this.pay_method.equals(that.pay_method));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.user_mobile == null ? that.user_mobile == null : this.user_mobile.equals(that.user_mobile));
    equal = equal && (this.user_email == null ? that.user_email == null : this.user_email.equals(that.user_email));
    equal = equal && (this.user_sex == null ? that.user_sex == null : this.user_sex.equals(that.user_sex));
    equal = equal && (this.admin_id == null ? that.admin_id == null : this.admin_id.equals(that.admin_id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.team_group_id == null ? that.team_group_id == null : this.team_group_id.equals(that.team_group_id));
    equal = equal && (this.team_hotel_seq == null ? that.team_hotel_seq == null : this.team_hotel_seq.equals(that.team_hotel_seq));
    equal = equal && (this.team_hotel_name == null ? that.team_hotel_name == null : this.team_hotel_name.equals(that.team_hotel_name));
    equal = equal && (this.team_hotel_city == null ? that.team_hotel_city == null : this.team_hotel_city.equals(that.team_hotel_city));
    equal = equal && (this.team_hotel_city_name == null ? that.team_hotel_city_name == null : this.team_hotel_city_name.equals(that.team_hotel_city_name));
    equal = equal && (this.team_dept_code == null ? that.team_dept_code == null : this.team_dept_code.equals(that.team_dept_code));
    equal = equal && (this.voucher_no == null ? that.voucher_no == null : this.voucher_no.equals(that.voucher_no));
    equal = equal && (this.order_status == null ? that.order_status == null : this.order_status.equals(that.order_status));
    equal = equal && (this.buy_quantity == null ? that.buy_quantity == null : this.buy_quantity.equals(that.buy_quantity));
    equal = equal && (this.buy_user_mobile == null ? that.buy_user_mobile == null : this.buy_user_mobile.equals(that.buy_user_mobile));
    equal = equal && (this.buy_user_mobile_city == null ? that.buy_user_mobile_city == null : this.buy_user_mobile_city.equals(that.buy_user_mobile_city));
    equal = equal && (this.buy_user_mobile_brand == null ? that.buy_user_mobile_brand == null : this.buy_user_mobile_brand.equals(that.buy_user_mobile_brand));
    equal = equal && (this.buy_user_mobile_area == null ? that.buy_user_mobile_area == null : this.buy_user_mobile_area.equals(that.buy_user_mobile_area));
    equal = equal && (this.team_price == null ? that.team_price == null : this.team_price.equals(that.team_price));
    equal = equal && (this.actual_pay_amt == null ? that.actual_pay_amt == null : this.actual_pay_amt.equals(that.actual_pay_amt));
    equal = equal && (this.should_pay_amt == null ? that.should_pay_amt == null : this.should_pay_amt.equals(that.should_pay_amt));
    equal = equal && (this.balance_pay_amt == null ? that.balance_pay_amt == null : this.balance_pay_amt.equals(that.balance_pay_amt));
    equal = equal && (this.voucher_pay_amt == null ? that.voucher_pay_amt == null : this.voucher_pay_amt.equals(that.voucher_pay_amt));
    equal = equal && (this.buy_limit == null ? that.buy_limit == null : this.buy_limit.equals(that.buy_limit));
    equal = equal && (this.order_time == null ? that.order_time == null : this.order_time.equals(that.order_time));
    equal = equal && (this.pay_time == null ? that.pay_time == null : this.pay_time.equals(that.pay_time));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.order_type == null ? that.order_type == null : this.order_type.equals(that.order_type));
    equal = equal && (this.refund_amt == null ? that.refund_amt == null : this.refund_amt.equals(that.refund_amt));
    equal = equal && (this.refund_times == null ? that.refund_times == null : this.refund_times.equals(that.refund_times));
    equal = equal && (this.last_refund_time == null ? that.last_refund_time == null : this.last_refund_time.equals(that.last_refund_time));
    equal = equal && (this.refund_quantity == null ? that.refund_quantity == null : this.refund_quantity.equals(that.refund_quantity));
    equal = equal && (this.red_envelope == null ? that.red_envelope == null : this.red_envelope.equals(that.red_envelope));
    equal = equal && (this.parent_order_id == null ? that.parent_order_id == null : this.parent_order_id.equals(that.parent_order_id));
    equal = equal && (this.lock_flag == null ? that.lock_flag == null : this.lock_flag.equals(that.lock_flag));
    equal = equal && (this.package_id == null ? that.package_id == null : this.package_id.equals(that.package_id));
    equal = equal && (this.package_type == null ? that.package_type == null : this.package_type.equals(that.package_type));
    equal = equal && (this.order_quick_flag == null ? that.order_quick_flag == null : this.order_quick_flag.equals(that.order_quick_flag));
    equal = equal && (this.cancel_time == null ? that.cancel_time == null : this.cancel_time.equals(that.cancel_time));
    equal = equal && (this.other_tuan_info == null ? that.other_tuan_info == null : this.other_tuan_info.equals(that.other_tuan_info));
    equal = equal && (this.product_version == null ? that.product_version == null : this.product_version.equals(that.product_version));
    equal = equal && (this.reach_shop_time == null ? that.reach_shop_time == null : this.reach_shop_time.equals(that.reach_shop_time));
    equal = equal && (this.merchant_code == null ? that.merchant_code == null : this.merchant_code.equals(that.merchant_code));
    equal = equal && (this.other_tuan_state == null ? that.other_tuan_state == null : this.other_tuan_state.equals(that.other_tuan_state));
    equal = equal && (this.version_no == null ? that.version_no == null : this.version_no.equals(that.version_no));
    equal = equal && (this.app_product_no == null ? that.app_product_no == null : this.app_product_no.equals(that.app_product_no));
    equal = equal && (this.user_device_no == null ? that.user_device_no == null : this.user_device_no.equals(that.user_device_no));
    equal = equal && (this.gid == null ? that.gid == null : this.gid.equals(that.gid));
    equal = equal && (this.channel_no == null ? that.channel_no == null : this.channel_no.equals(that.channel_no));
    equal = equal && (this.source_code == null ? that.source_code == null : this.source_code.equals(that.source_code));
    equal = equal && (this.order_version == null ? that.order_version == null : this.order_version.equals(that.order_version));
    equal = equal && (this.cost_price == null ? that.cost_price == null : this.cost_price.equals(that.cost_price));
    equal = equal && (this.web_traffic_source_channel == null ? that.web_traffic_source_channel == null : this.web_traffic_source_channel.equals(that.web_traffic_source_channel));
    equal = equal && (this.baojian_total == null ? that.baojian_total == null : this.baojian_total.equals(that.baojian_total));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dwd_evt_team_order)) {
      return false;
    }
    dwd_evt_team_order that = (dwd_evt_team_order) o;
    boolean equal = true;
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.platform_type == null ? that.platform_type == null : this.platform_type.equals(that.platform_type));
    equal = equal && (this.pay_seq == null ? that.pay_seq == null : this.pay_seq.equals(that.pay_seq));
    equal = equal && (this.buy_seq == null ? that.buy_seq == null : this.buy_seq.equals(that.buy_seq));
    equal = equal && (this.pay_method == null ? that.pay_method == null : this.pay_method.equals(that.pay_method));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.user_mobile == null ? that.user_mobile == null : this.user_mobile.equals(that.user_mobile));
    equal = equal && (this.user_email == null ? that.user_email == null : this.user_email.equals(that.user_email));
    equal = equal && (this.user_sex == null ? that.user_sex == null : this.user_sex.equals(that.user_sex));
    equal = equal && (this.admin_id == null ? that.admin_id == null : this.admin_id.equals(that.admin_id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.team_group_id == null ? that.team_group_id == null : this.team_group_id.equals(that.team_group_id));
    equal = equal && (this.team_hotel_seq == null ? that.team_hotel_seq == null : this.team_hotel_seq.equals(that.team_hotel_seq));
    equal = equal && (this.team_hotel_name == null ? that.team_hotel_name == null : this.team_hotel_name.equals(that.team_hotel_name));
    equal = equal && (this.team_hotel_city == null ? that.team_hotel_city == null : this.team_hotel_city.equals(that.team_hotel_city));
    equal = equal && (this.team_hotel_city_name == null ? that.team_hotel_city_name == null : this.team_hotel_city_name.equals(that.team_hotel_city_name));
    equal = equal && (this.team_dept_code == null ? that.team_dept_code == null : this.team_dept_code.equals(that.team_dept_code));
    equal = equal && (this.voucher_no == null ? that.voucher_no == null : this.voucher_no.equals(that.voucher_no));
    equal = equal && (this.order_status == null ? that.order_status == null : this.order_status.equals(that.order_status));
    equal = equal && (this.buy_quantity == null ? that.buy_quantity == null : this.buy_quantity.equals(that.buy_quantity));
    equal = equal && (this.buy_user_mobile == null ? that.buy_user_mobile == null : this.buy_user_mobile.equals(that.buy_user_mobile));
    equal = equal && (this.buy_user_mobile_city == null ? that.buy_user_mobile_city == null : this.buy_user_mobile_city.equals(that.buy_user_mobile_city));
    equal = equal && (this.buy_user_mobile_brand == null ? that.buy_user_mobile_brand == null : this.buy_user_mobile_brand.equals(that.buy_user_mobile_brand));
    equal = equal && (this.buy_user_mobile_area == null ? that.buy_user_mobile_area == null : this.buy_user_mobile_area.equals(that.buy_user_mobile_area));
    equal = equal && (this.team_price == null ? that.team_price == null : this.team_price.equals(that.team_price));
    equal = equal && (this.actual_pay_amt == null ? that.actual_pay_amt == null : this.actual_pay_amt.equals(that.actual_pay_amt));
    equal = equal && (this.should_pay_amt == null ? that.should_pay_amt == null : this.should_pay_amt.equals(that.should_pay_amt));
    equal = equal && (this.balance_pay_amt == null ? that.balance_pay_amt == null : this.balance_pay_amt.equals(that.balance_pay_amt));
    equal = equal && (this.voucher_pay_amt == null ? that.voucher_pay_amt == null : this.voucher_pay_amt.equals(that.voucher_pay_amt));
    equal = equal && (this.buy_limit == null ? that.buy_limit == null : this.buy_limit.equals(that.buy_limit));
    equal = equal && (this.order_time == null ? that.order_time == null : this.order_time.equals(that.order_time));
    equal = equal && (this.pay_time == null ? that.pay_time == null : this.pay_time.equals(that.pay_time));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.order_type == null ? that.order_type == null : this.order_type.equals(that.order_type));
    equal = equal && (this.refund_amt == null ? that.refund_amt == null : this.refund_amt.equals(that.refund_amt));
    equal = equal && (this.refund_times == null ? that.refund_times == null : this.refund_times.equals(that.refund_times));
    equal = equal && (this.last_refund_time == null ? that.last_refund_time == null : this.last_refund_time.equals(that.last_refund_time));
    equal = equal && (this.refund_quantity == null ? that.refund_quantity == null : this.refund_quantity.equals(that.refund_quantity));
    equal = equal && (this.red_envelope == null ? that.red_envelope == null : this.red_envelope.equals(that.red_envelope));
    equal = equal && (this.parent_order_id == null ? that.parent_order_id == null : this.parent_order_id.equals(that.parent_order_id));
    equal = equal && (this.lock_flag == null ? that.lock_flag == null : this.lock_flag.equals(that.lock_flag));
    equal = equal && (this.package_id == null ? that.package_id == null : this.package_id.equals(that.package_id));
    equal = equal && (this.package_type == null ? that.package_type == null : this.package_type.equals(that.package_type));
    equal = equal && (this.order_quick_flag == null ? that.order_quick_flag == null : this.order_quick_flag.equals(that.order_quick_flag));
    equal = equal && (this.cancel_time == null ? that.cancel_time == null : this.cancel_time.equals(that.cancel_time));
    equal = equal && (this.other_tuan_info == null ? that.other_tuan_info == null : this.other_tuan_info.equals(that.other_tuan_info));
    equal = equal && (this.product_version == null ? that.product_version == null : this.product_version.equals(that.product_version));
    equal = equal && (this.reach_shop_time == null ? that.reach_shop_time == null : this.reach_shop_time.equals(that.reach_shop_time));
    equal = equal && (this.merchant_code == null ? that.merchant_code == null : this.merchant_code.equals(that.merchant_code));
    equal = equal && (this.other_tuan_state == null ? that.other_tuan_state == null : this.other_tuan_state.equals(that.other_tuan_state));
    equal = equal && (this.version_no == null ? that.version_no == null : this.version_no.equals(that.version_no));
    equal = equal && (this.app_product_no == null ? that.app_product_no == null : this.app_product_no.equals(that.app_product_no));
    equal = equal && (this.user_device_no == null ? that.user_device_no == null : this.user_device_no.equals(that.user_device_no));
    equal = equal && (this.gid == null ? that.gid == null : this.gid.equals(that.gid));
    equal = equal && (this.channel_no == null ? that.channel_no == null : this.channel_no.equals(that.channel_no));
    equal = equal && (this.source_code == null ? that.source_code == null : this.source_code.equals(that.source_code));
    equal = equal && (this.order_version == null ? that.order_version == null : this.order_version.equals(that.order_version));
    equal = equal && (this.cost_price == null ? that.cost_price == null : this.cost_price.equals(that.cost_price));
    equal = equal && (this.web_traffic_source_channel == null ? that.web_traffic_source_channel == null : this.web_traffic_source_channel.equals(that.web_traffic_source_channel));
    equal = equal && (this.baojian_total == null ? that.baojian_total == null : this.baojian_total.equals(that.baojian_total));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.order_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.platform_type = JdbcWritableBridge.readString(2, __dbResults);
    this.pay_seq = JdbcWritableBridge.readString(3, __dbResults);
    this.buy_seq = JdbcWritableBridge.readInteger(4, __dbResults);
    this.pay_method = JdbcWritableBridge.readString(5, __dbResults);
    this.user_id = JdbcWritableBridge.readInteger(6, __dbResults);
    this.user_mobile = JdbcWritableBridge.readString(7, __dbResults);
    this.user_email = JdbcWritableBridge.readString(8, __dbResults);
    this.user_sex = JdbcWritableBridge.readString(9, __dbResults);
    this.admin_id = JdbcWritableBridge.readInteger(10, __dbResults);
    this.team_id = JdbcWritableBridge.readInteger(11, __dbResults);
    this.team_group_id = JdbcWritableBridge.readInteger(12, __dbResults);
    this.team_hotel_seq = JdbcWritableBridge.readString(13, __dbResults);
    this.team_hotel_name = JdbcWritableBridge.readString(14, __dbResults);
    this.team_hotel_city = JdbcWritableBridge.readString(15, __dbResults);
    this.team_hotel_city_name = JdbcWritableBridge.readString(16, __dbResults);
    this.team_dept_code = JdbcWritableBridge.readString(17, __dbResults);
    this.voucher_no = JdbcWritableBridge.readString(18, __dbResults);
    this.order_status = JdbcWritableBridge.readString(19, __dbResults);
    this.buy_quantity = JdbcWritableBridge.readInteger(20, __dbResults);
    this.buy_user_mobile = JdbcWritableBridge.readString(21, __dbResults);
    this.buy_user_mobile_city = JdbcWritableBridge.readString(22, __dbResults);
    this.buy_user_mobile_brand = JdbcWritableBridge.readString(23, __dbResults);
    this.buy_user_mobile_area = JdbcWritableBridge.readString(24, __dbResults);
    this.team_price = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.actual_pay_amt = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.should_pay_amt = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.balance_pay_amt = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.voucher_pay_amt = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.buy_limit = JdbcWritableBridge.readString(30, __dbResults);
    this.order_time = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.pay_time = JdbcWritableBridge.readTimestamp(32, __dbResults);
    this.partner_id = JdbcWritableBridge.readInteger(33, __dbResults);
    this.order_type = JdbcWritableBridge.readString(34, __dbResults);
    this.refund_amt = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.refund_times = JdbcWritableBridge.readInteger(36, __dbResults);
    this.last_refund_time = JdbcWritableBridge.readTimestamp(37, __dbResults);
    this.refund_quantity = JdbcWritableBridge.readInteger(38, __dbResults);
    this.red_envelope = JdbcWritableBridge.readInteger(39, __dbResults);
    this.parent_order_id = JdbcWritableBridge.readInteger(40, __dbResults);
    this.lock_flag = JdbcWritableBridge.readInteger(41, __dbResults);
    this.package_id = JdbcWritableBridge.readInteger(42, __dbResults);
    this.package_type = JdbcWritableBridge.readString(43, __dbResults);
    this.order_quick_flag = JdbcWritableBridge.readInteger(44, __dbResults);
    this.cancel_time = JdbcWritableBridge.readTimestamp(45, __dbResults);
    this.other_tuan_info = JdbcWritableBridge.readString(46, __dbResults);
    this.product_version = JdbcWritableBridge.readInteger(47, __dbResults);
    this.reach_shop_time = JdbcWritableBridge.readString(48, __dbResults);
    this.merchant_code = JdbcWritableBridge.readString(49, __dbResults);
    this.other_tuan_state = JdbcWritableBridge.readString(50, __dbResults);
    this.version_no = JdbcWritableBridge.readString(51, __dbResults);
    this.app_product_no = JdbcWritableBridge.readString(52, __dbResults);
    this.user_device_no = JdbcWritableBridge.readString(53, __dbResults);
    this.gid = JdbcWritableBridge.readString(54, __dbResults);
    this.channel_no = JdbcWritableBridge.readString(55, __dbResults);
    this.source_code = JdbcWritableBridge.readString(56, __dbResults);
    this.order_version = JdbcWritableBridge.readTimestamp(57, __dbResults);
    this.cost_price = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.web_traffic_source_channel = JdbcWritableBridge.readString(59, __dbResults);
    this.baojian_total = JdbcWritableBridge.readInteger(60, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.order_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.platform_type = JdbcWritableBridge.readString(2, __dbResults);
    this.pay_seq = JdbcWritableBridge.readString(3, __dbResults);
    this.buy_seq = JdbcWritableBridge.readInteger(4, __dbResults);
    this.pay_method = JdbcWritableBridge.readString(5, __dbResults);
    this.user_id = JdbcWritableBridge.readInteger(6, __dbResults);
    this.user_mobile = JdbcWritableBridge.readString(7, __dbResults);
    this.user_email = JdbcWritableBridge.readString(8, __dbResults);
    this.user_sex = JdbcWritableBridge.readString(9, __dbResults);
    this.admin_id = JdbcWritableBridge.readInteger(10, __dbResults);
    this.team_id = JdbcWritableBridge.readInteger(11, __dbResults);
    this.team_group_id = JdbcWritableBridge.readInteger(12, __dbResults);
    this.team_hotel_seq = JdbcWritableBridge.readString(13, __dbResults);
    this.team_hotel_name = JdbcWritableBridge.readString(14, __dbResults);
    this.team_hotel_city = JdbcWritableBridge.readString(15, __dbResults);
    this.team_hotel_city_name = JdbcWritableBridge.readString(16, __dbResults);
    this.team_dept_code = JdbcWritableBridge.readString(17, __dbResults);
    this.voucher_no = JdbcWritableBridge.readString(18, __dbResults);
    this.order_status = JdbcWritableBridge.readString(19, __dbResults);
    this.buy_quantity = JdbcWritableBridge.readInteger(20, __dbResults);
    this.buy_user_mobile = JdbcWritableBridge.readString(21, __dbResults);
    this.buy_user_mobile_city = JdbcWritableBridge.readString(22, __dbResults);
    this.buy_user_mobile_brand = JdbcWritableBridge.readString(23, __dbResults);
    this.buy_user_mobile_area = JdbcWritableBridge.readString(24, __dbResults);
    this.team_price = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.actual_pay_amt = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.should_pay_amt = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.balance_pay_amt = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.voucher_pay_amt = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.buy_limit = JdbcWritableBridge.readString(30, __dbResults);
    this.order_time = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.pay_time = JdbcWritableBridge.readTimestamp(32, __dbResults);
    this.partner_id = JdbcWritableBridge.readInteger(33, __dbResults);
    this.order_type = JdbcWritableBridge.readString(34, __dbResults);
    this.refund_amt = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.refund_times = JdbcWritableBridge.readInteger(36, __dbResults);
    this.last_refund_time = JdbcWritableBridge.readTimestamp(37, __dbResults);
    this.refund_quantity = JdbcWritableBridge.readInteger(38, __dbResults);
    this.red_envelope = JdbcWritableBridge.readInteger(39, __dbResults);
    this.parent_order_id = JdbcWritableBridge.readInteger(40, __dbResults);
    this.lock_flag = JdbcWritableBridge.readInteger(41, __dbResults);
    this.package_id = JdbcWritableBridge.readInteger(42, __dbResults);
    this.package_type = JdbcWritableBridge.readString(43, __dbResults);
    this.order_quick_flag = JdbcWritableBridge.readInteger(44, __dbResults);
    this.cancel_time = JdbcWritableBridge.readTimestamp(45, __dbResults);
    this.other_tuan_info = JdbcWritableBridge.readString(46, __dbResults);
    this.product_version = JdbcWritableBridge.readInteger(47, __dbResults);
    this.reach_shop_time = JdbcWritableBridge.readString(48, __dbResults);
    this.merchant_code = JdbcWritableBridge.readString(49, __dbResults);
    this.other_tuan_state = JdbcWritableBridge.readString(50, __dbResults);
    this.version_no = JdbcWritableBridge.readString(51, __dbResults);
    this.app_product_no = JdbcWritableBridge.readString(52, __dbResults);
    this.user_device_no = JdbcWritableBridge.readString(53, __dbResults);
    this.gid = JdbcWritableBridge.readString(54, __dbResults);
    this.channel_no = JdbcWritableBridge.readString(55, __dbResults);
    this.source_code = JdbcWritableBridge.readString(56, __dbResults);
    this.order_version = JdbcWritableBridge.readTimestamp(57, __dbResults);
    this.cost_price = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.web_traffic_source_channel = JdbcWritableBridge.readString(59, __dbResults);
    this.baojian_total = JdbcWritableBridge.readInteger(60, __dbResults);
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
    JdbcWritableBridge.writeInteger(order_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(platform_type, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pay_seq, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(buy_seq, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(pay_method, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(user_id, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(user_mobile, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(user_email, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(user_sex, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(admin_id, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(team_id, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(team_group_id, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(team_hotel_seq, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(team_hotel_name, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(team_hotel_city, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(team_hotel_city_name, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(team_dept_code, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(voucher_no, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(order_status, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(buy_quantity, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(buy_user_mobile, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buy_user_mobile_city, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buy_user_mobile_brand, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buy_user_mobile_area, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(team_price, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(actual_pay_amt, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(should_pay_amt, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(balance_pay_amt, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(voucher_pay_amt, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(buy_limit, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_time, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(pay_time, 32 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(partner_id, 33 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(order_type, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(refund_amt, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(refund_times, 36 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(last_refund_time, 37 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(refund_quantity, 38 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(red_envelope, 39 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(parent_order_id, 40 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(lock_flag, 41 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(package_id, 42 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(package_type, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(order_quick_flag, 44 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(cancel_time, 45 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(other_tuan_info, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(product_version, 47 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(reach_shop_time, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(merchant_code, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(other_tuan_state, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(version_no, 51 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(app_product_no, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(user_device_no, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(gid, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(channel_no, 55 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(source_code, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_version, 57 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(cost_price, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(web_traffic_source_channel, 59 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(baojian_total, 60 + __off, 4, __dbStmt);
    return 60;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(order_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(platform_type, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pay_seq, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(buy_seq, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(pay_method, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(user_id, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(user_mobile, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(user_email, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(user_sex, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(admin_id, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(team_id, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(team_group_id, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(team_hotel_seq, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(team_hotel_name, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(team_hotel_city, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(team_hotel_city_name, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(team_dept_code, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(voucher_no, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(order_status, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(buy_quantity, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(buy_user_mobile, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buy_user_mobile_city, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buy_user_mobile_brand, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buy_user_mobile_area, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(team_price, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(actual_pay_amt, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(should_pay_amt, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(balance_pay_amt, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(voucher_pay_amt, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(buy_limit, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_time, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(pay_time, 32 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(partner_id, 33 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(order_type, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(refund_amt, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(refund_times, 36 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(last_refund_time, 37 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(refund_quantity, 38 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(red_envelope, 39 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(parent_order_id, 40 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(lock_flag, 41 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(package_id, 42 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(package_type, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(order_quick_flag, 44 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(cancel_time, 45 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(other_tuan_info, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(product_version, 47 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(reach_shop_time, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(merchant_code, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(other_tuan_state, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(version_no, 51 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(app_product_no, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(user_device_no, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(gid, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(channel_no, 55 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(source_code, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_version, 57 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(cost_price, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(web_traffic_source_channel, 59 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(baojian_total, 60 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.order_id = null;
    } else {
    this.order_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.platform_type = null;
    } else {
    this.platform_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pay_seq = null;
    } else {
    this.pay_seq = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.buy_seq = null;
    } else {
    this.buy_seq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.pay_method = null;
    } else {
    this.pay_method = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.user_id = null;
    } else {
    this.user_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_mobile = null;
    } else {
    this.user_mobile = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.user_email = null;
    } else {
    this.user_email = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.user_sex = null;
    } else {
    this.user_sex = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.admin_id = null;
    } else {
    this.admin_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.team_id = null;
    } else {
    this.team_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.team_group_id = null;
    } else {
    this.team_group_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.team_hotel_seq = null;
    } else {
    this.team_hotel_seq = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.team_hotel_name = null;
    } else {
    this.team_hotel_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.team_hotel_city = null;
    } else {
    this.team_hotel_city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.team_hotel_city_name = null;
    } else {
    this.team_hotel_city_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.team_dept_code = null;
    } else {
    this.team_dept_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.voucher_no = null;
    } else {
    this.voucher_no = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_status = null;
    } else {
    this.order_status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.buy_quantity = null;
    } else {
    this.buy_quantity = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.buy_user_mobile = null;
    } else {
    this.buy_user_mobile = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.buy_user_mobile_city = null;
    } else {
    this.buy_user_mobile_city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.buy_user_mobile_brand = null;
    } else {
    this.buy_user_mobile_brand = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.buy_user_mobile_area = null;
    } else {
    this.buy_user_mobile_area = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.team_price = null;
    } else {
    this.team_price = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.actual_pay_amt = null;
    } else {
    this.actual_pay_amt = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.should_pay_amt = null;
    } else {
    this.should_pay_amt = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.balance_pay_amt = null;
    } else {
    this.balance_pay_amt = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.voucher_pay_amt = null;
    } else {
    this.voucher_pay_amt = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.buy_limit = null;
    } else {
    this.buy_limit = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_time = null;
    } else {
    this.order_time = new Timestamp(__dataIn.readLong());
    this.order_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.pay_time = null;
    } else {
    this.pay_time = new Timestamp(__dataIn.readLong());
    this.pay_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.partner_id = null;
    } else {
    this.partner_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.order_type = null;
    } else {
    this.order_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.refund_amt = null;
    } else {
    this.refund_amt = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.refund_times = null;
    } else {
    this.refund_times = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.last_refund_time = null;
    } else {
    this.last_refund_time = new Timestamp(__dataIn.readLong());
    this.last_refund_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.refund_quantity = null;
    } else {
    this.refund_quantity = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.red_envelope = null;
    } else {
    this.red_envelope = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.parent_order_id = null;
    } else {
    this.parent_order_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.lock_flag = null;
    } else {
    this.lock_flag = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.package_id = null;
    } else {
    this.package_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.package_type = null;
    } else {
    this.package_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_quick_flag = null;
    } else {
    this.order_quick_flag = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cancel_time = null;
    } else {
    this.cancel_time = new Timestamp(__dataIn.readLong());
    this.cancel_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.other_tuan_info = null;
    } else {
    this.other_tuan_info = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_version = null;
    } else {
    this.product_version = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.reach_shop_time = null;
    } else {
    this.reach_shop_time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.merchant_code = null;
    } else {
    this.merchant_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.other_tuan_state = null;
    } else {
    this.other_tuan_state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.version_no = null;
    } else {
    this.version_no = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.app_product_no = null;
    } else {
    this.app_product_no = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.user_device_no = null;
    } else {
    this.user_device_no = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.gid = null;
    } else {
    this.gid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.channel_no = null;
    } else {
    this.channel_no = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.source_code = null;
    } else {
    this.source_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_version = null;
    } else {
    this.order_version = new Timestamp(__dataIn.readLong());
    this.order_version.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cost_price = null;
    } else {
    this.cost_price = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.web_traffic_source_channel = null;
    } else {
    this.web_traffic_source_channel = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.baojian_total = null;
    } else {
    this.baojian_total = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_id);
    }
    if (null == this.platform_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platform_type);
    }
    if (null == this.pay_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pay_seq);
    }
    if (null == this.buy_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.buy_seq);
    }
    if (null == this.pay_method) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pay_method);
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_id);
    }
    if (null == this.user_mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_mobile);
    }
    if (null == this.user_email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_email);
    }
    if (null == this.user_sex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_sex);
    }
    if (null == this.admin_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.admin_id);
    }
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.team_id);
    }
    if (null == this.team_group_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.team_group_id);
    }
    if (null == this.team_hotel_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_hotel_seq);
    }
    if (null == this.team_hotel_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_hotel_name);
    }
    if (null == this.team_hotel_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_hotel_city);
    }
    if (null == this.team_hotel_city_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_hotel_city_name);
    }
    if (null == this.team_dept_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_dept_code);
    }
    if (null == this.voucher_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, voucher_no);
    }
    if (null == this.order_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_status);
    }
    if (null == this.buy_quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.buy_quantity);
    }
    if (null == this.buy_user_mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_user_mobile);
    }
    if (null == this.buy_user_mobile_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_user_mobile_city);
    }
    if (null == this.buy_user_mobile_brand) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_user_mobile_brand);
    }
    if (null == this.buy_user_mobile_area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_user_mobile_area);
    }
    if (null == this.team_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.team_price, __dataOut);
    }
    if (null == this.actual_pay_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.actual_pay_amt, __dataOut);
    }
    if (null == this.should_pay_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.should_pay_amt, __dataOut);
    }
    if (null == this.balance_pay_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.balance_pay_amt, __dataOut);
    }
    if (null == this.voucher_pay_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.voucher_pay_amt, __dataOut);
    }
    if (null == this.buy_limit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_limit);
    }
    if (null == this.order_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_time.getTime());
    __dataOut.writeInt(this.order_time.getNanos());
    }
    if (null == this.pay_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.pay_time.getTime());
    __dataOut.writeInt(this.pay_time.getNanos());
    }
    if (null == this.partner_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.partner_id);
    }
    if (null == this.order_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_type);
    }
    if (null == this.refund_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.refund_amt, __dataOut);
    }
    if (null == this.refund_times) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.refund_times);
    }
    if (null == this.last_refund_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_refund_time.getTime());
    __dataOut.writeInt(this.last_refund_time.getNanos());
    }
    if (null == this.refund_quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.refund_quantity);
    }
    if (null == this.red_envelope) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.red_envelope);
    }
    if (null == this.parent_order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.parent_order_id);
    }
    if (null == this.lock_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.lock_flag);
    }
    if (null == this.package_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.package_id);
    }
    if (null == this.package_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, package_type);
    }
    if (null == this.order_quick_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_quick_flag);
    }
    if (null == this.cancel_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.cancel_time.getTime());
    __dataOut.writeInt(this.cancel_time.getNanos());
    }
    if (null == this.other_tuan_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_tuan_info);
    }
    if (null == this.product_version) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_version);
    }
    if (null == this.reach_shop_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reach_shop_time);
    }
    if (null == this.merchant_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, merchant_code);
    }
    if (null == this.other_tuan_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_tuan_state);
    }
    if (null == this.version_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, version_no);
    }
    if (null == this.app_product_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, app_product_no);
    }
    if (null == this.user_device_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_device_no);
    }
    if (null == this.gid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, gid);
    }
    if (null == this.channel_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, channel_no);
    }
    if (null == this.source_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, source_code);
    }
    if (null == this.order_version) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_version.getTime());
    __dataOut.writeInt(this.order_version.getNanos());
    }
    if (null == this.cost_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.cost_price, __dataOut);
    }
    if (null == this.web_traffic_source_channel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, web_traffic_source_channel);
    }
    if (null == this.baojian_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.baojian_total);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_id);
    }
    if (null == this.platform_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platform_type);
    }
    if (null == this.pay_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pay_seq);
    }
    if (null == this.buy_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.buy_seq);
    }
    if (null == this.pay_method) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pay_method);
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_id);
    }
    if (null == this.user_mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_mobile);
    }
    if (null == this.user_email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_email);
    }
    if (null == this.user_sex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_sex);
    }
    if (null == this.admin_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.admin_id);
    }
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.team_id);
    }
    if (null == this.team_group_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.team_group_id);
    }
    if (null == this.team_hotel_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_hotel_seq);
    }
    if (null == this.team_hotel_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_hotel_name);
    }
    if (null == this.team_hotel_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_hotel_city);
    }
    if (null == this.team_hotel_city_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_hotel_city_name);
    }
    if (null == this.team_dept_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_dept_code);
    }
    if (null == this.voucher_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, voucher_no);
    }
    if (null == this.order_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_status);
    }
    if (null == this.buy_quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.buy_quantity);
    }
    if (null == this.buy_user_mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_user_mobile);
    }
    if (null == this.buy_user_mobile_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_user_mobile_city);
    }
    if (null == this.buy_user_mobile_brand) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_user_mobile_brand);
    }
    if (null == this.buy_user_mobile_area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_user_mobile_area);
    }
    if (null == this.team_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.team_price, __dataOut);
    }
    if (null == this.actual_pay_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.actual_pay_amt, __dataOut);
    }
    if (null == this.should_pay_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.should_pay_amt, __dataOut);
    }
    if (null == this.balance_pay_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.balance_pay_amt, __dataOut);
    }
    if (null == this.voucher_pay_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.voucher_pay_amt, __dataOut);
    }
    if (null == this.buy_limit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_limit);
    }
    if (null == this.order_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_time.getTime());
    __dataOut.writeInt(this.order_time.getNanos());
    }
    if (null == this.pay_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.pay_time.getTime());
    __dataOut.writeInt(this.pay_time.getNanos());
    }
    if (null == this.partner_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.partner_id);
    }
    if (null == this.order_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_type);
    }
    if (null == this.refund_amt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.refund_amt, __dataOut);
    }
    if (null == this.refund_times) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.refund_times);
    }
    if (null == this.last_refund_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_refund_time.getTime());
    __dataOut.writeInt(this.last_refund_time.getNanos());
    }
    if (null == this.refund_quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.refund_quantity);
    }
    if (null == this.red_envelope) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.red_envelope);
    }
    if (null == this.parent_order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.parent_order_id);
    }
    if (null == this.lock_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.lock_flag);
    }
    if (null == this.package_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.package_id);
    }
    if (null == this.package_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, package_type);
    }
    if (null == this.order_quick_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_quick_flag);
    }
    if (null == this.cancel_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.cancel_time.getTime());
    __dataOut.writeInt(this.cancel_time.getNanos());
    }
    if (null == this.other_tuan_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_tuan_info);
    }
    if (null == this.product_version) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_version);
    }
    if (null == this.reach_shop_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reach_shop_time);
    }
    if (null == this.merchant_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, merchant_code);
    }
    if (null == this.other_tuan_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_tuan_state);
    }
    if (null == this.version_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, version_no);
    }
    if (null == this.app_product_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, app_product_no);
    }
    if (null == this.user_device_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_device_no);
    }
    if (null == this.gid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, gid);
    }
    if (null == this.channel_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, channel_no);
    }
    if (null == this.source_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, source_code);
    }
    if (null == this.order_version) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_version.getTime());
    __dataOut.writeInt(this.order_version.getNanos());
    }
    if (null == this.cost_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.cost_price, __dataOut);
    }
    if (null == this.web_traffic_source_channel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, web_traffic_source_channel);
    }
    if (null == this.baojian_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.baojian_total);
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
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":"" + order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(platform_type==null?"null":platform_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_seq==null?"null":pay_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_seq==null?"null":"" + buy_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_method==null?"null":pay_method, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_mobile==null?"null":user_mobile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_email==null?"null":user_email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_sex==null?"null":user_sex, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(admin_id==null?"null":"" + admin_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_group_id==null?"null":"" + team_group_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_hotel_seq==null?"null":team_hotel_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_hotel_name==null?"null":team_hotel_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_hotel_city==null?"null":team_hotel_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_hotel_city_name==null?"null":team_hotel_city_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_dept_code==null?"null":team_dept_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(voucher_no==null?"null":voucher_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_status==null?"null":order_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_quantity==null?"null":"" + buy_quantity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_user_mobile==null?"null":buy_user_mobile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_user_mobile_city==null?"null":buy_user_mobile_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_user_mobile_brand==null?"null":buy_user_mobile_brand, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_user_mobile_area==null?"null":buy_user_mobile_area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_price==null?"null":team_price.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(actual_pay_amt==null?"null":actual_pay_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(should_pay_amt==null?"null":should_pay_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(balance_pay_amt==null?"null":balance_pay_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(voucher_pay_amt==null?"null":voucher_pay_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_limit==null?"null":buy_limit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_time==null?"null":"" + order_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_time==null?"null":"" + pay_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_type==null?"null":order_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_amt==null?"null":refund_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_times==null?"null":"" + refund_times, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_refund_time==null?"null":"" + last_refund_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_quantity==null?"null":"" + refund_quantity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(red_envelope==null?"null":"" + red_envelope, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(parent_order_id==null?"null":"" + parent_order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lock_flag==null?"null":"" + lock_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(package_id==null?"null":"" + package_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(package_type==null?"null":package_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_quick_flag==null?"null":"" + order_quick_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cancel_time==null?"null":"" + cancel_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other_tuan_info==null?"null":other_tuan_info, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_version==null?"null":"" + product_version, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reach_shop_time==null?"null":reach_shop_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(merchant_code==null?"null":merchant_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other_tuan_state==null?"null":other_tuan_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(version_no==null?"null":version_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(app_product_no==null?"null":app_product_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_device_no==null?"null":user_device_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gid==null?"null":gid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(channel_no==null?"null":channel_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(source_code==null?"null":source_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_version==null?"null":"" + order_version, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cost_price==null?"null":cost_price.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(web_traffic_source_channel==null?"null":web_traffic_source_channel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(baojian_total==null?"null":"" + baojian_total, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":"" + order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(platform_type==null?"null":platform_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_seq==null?"null":pay_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_seq==null?"null":"" + buy_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_method==null?"null":pay_method, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_mobile==null?"null":user_mobile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_email==null?"null":user_email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_sex==null?"null":user_sex, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(admin_id==null?"null":"" + admin_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_group_id==null?"null":"" + team_group_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_hotel_seq==null?"null":team_hotel_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_hotel_name==null?"null":team_hotel_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_hotel_city==null?"null":team_hotel_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_hotel_city_name==null?"null":team_hotel_city_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_dept_code==null?"null":team_dept_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(voucher_no==null?"null":voucher_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_status==null?"null":order_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_quantity==null?"null":"" + buy_quantity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_user_mobile==null?"null":buy_user_mobile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_user_mobile_city==null?"null":buy_user_mobile_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_user_mobile_brand==null?"null":buy_user_mobile_brand, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_user_mobile_area==null?"null":buy_user_mobile_area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_price==null?"null":team_price.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(actual_pay_amt==null?"null":actual_pay_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(should_pay_amt==null?"null":should_pay_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(balance_pay_amt==null?"null":balance_pay_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(voucher_pay_amt==null?"null":voucher_pay_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_limit==null?"null":buy_limit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_time==null?"null":"" + order_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_time==null?"null":"" + pay_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_type==null?"null":order_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_amt==null?"null":refund_amt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_times==null?"null":"" + refund_times, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_refund_time==null?"null":"" + last_refund_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_quantity==null?"null":"" + refund_quantity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(red_envelope==null?"null":"" + red_envelope, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(parent_order_id==null?"null":"" + parent_order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lock_flag==null?"null":"" + lock_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(package_id==null?"null":"" + package_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(package_type==null?"null":package_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_quick_flag==null?"null":"" + order_quick_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cancel_time==null?"null":"" + cancel_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other_tuan_info==null?"null":other_tuan_info, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_version==null?"null":"" + product_version, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reach_shop_time==null?"null":reach_shop_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(merchant_code==null?"null":merchant_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other_tuan_state==null?"null":other_tuan_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(version_no==null?"null":version_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(app_product_no==null?"null":app_product_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_device_no==null?"null":user_device_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gid==null?"null":gid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(channel_no==null?"null":channel_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(source_code==null?"null":source_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_version==null?"null":"" + order_version, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cost_price==null?"null":cost_price.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(web_traffic_source_channel==null?"null":web_traffic_source_channel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(baojian_total==null?"null":"" + baojian_total, delimiters));
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
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_id = null; } else {
      this.order_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.platform_type = null; } else {
      this.platform_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pay_seq = null; } else {
      this.pay_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.buy_seq = null; } else {
      this.buy_seq = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pay_method = null; } else {
      this.pay_method = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.user_mobile = null; } else {
      this.user_mobile = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.user_email = null; } else {
      this.user_email = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.user_sex = null; } else {
      this.user_sex = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.admin_id = null; } else {
      this.admin_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.team_group_id = null; } else {
      this.team_group_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.team_hotel_seq = null; } else {
      this.team_hotel_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.team_hotel_name = null; } else {
      this.team_hotel_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.team_hotel_city = null; } else {
      this.team_hotel_city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.team_hotel_city_name = null; } else {
      this.team_hotel_city_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.team_dept_code = null; } else {
      this.team_dept_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.voucher_no = null; } else {
      this.voucher_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.order_status = null; } else {
      this.order_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.buy_quantity = null; } else {
      this.buy_quantity = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_user_mobile = null; } else {
      this.buy_user_mobile = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_user_mobile_city = null; } else {
      this.buy_user_mobile_city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_user_mobile_brand = null; } else {
      this.buy_user_mobile_brand = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_user_mobile_area = null; } else {
      this.buy_user_mobile_area = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.team_price = null; } else {
      this.team_price = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.actual_pay_amt = null; } else {
      this.actual_pay_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.should_pay_amt = null; } else {
      this.should_pay_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.balance_pay_amt = null; } else {
      this.balance_pay_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.voucher_pay_amt = null; } else {
      this.voucher_pay_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_limit = null; } else {
      this.buy_limit = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_time = null; } else {
      this.order_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.pay_time = null; } else {
      this.pay_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.partner_id = null; } else {
      this.partner_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.order_type = null; } else {
      this.order_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.refund_amt = null; } else {
      this.refund_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.refund_times = null; } else {
      this.refund_times = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.last_refund_time = null; } else {
      this.last_refund_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.refund_quantity = null; } else {
      this.refund_quantity = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.red_envelope = null; } else {
      this.red_envelope = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.parent_order_id = null; } else {
      this.parent_order_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.lock_flag = null; } else {
      this.lock_flag = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.package_id = null; } else {
      this.package_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.package_type = null; } else {
      this.package_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_quick_flag = null; } else {
      this.order_quick_flag = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.cancel_time = null; } else {
      this.cancel_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.other_tuan_info = null; } else {
      this.other_tuan_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.product_version = null; } else {
      this.product_version = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.reach_shop_time = null; } else {
      this.reach_shop_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.merchant_code = null; } else {
      this.merchant_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.other_tuan_state = null; } else {
      this.other_tuan_state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.version_no = null; } else {
      this.version_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.app_product_no = null; } else {
      this.app_product_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.user_device_no = null; } else {
      this.user_device_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.gid = null; } else {
      this.gid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.channel_no = null; } else {
      this.channel_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.source_code = null; } else {
      this.source_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_version = null; } else {
      this.order_version = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.cost_price = null; } else {
      this.cost_price = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.web_traffic_source_channel = null; } else {
      this.web_traffic_source_channel = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.baojian_total = null; } else {
      this.baojian_total = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_id = null; } else {
      this.order_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.platform_type = null; } else {
      this.platform_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pay_seq = null; } else {
      this.pay_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.buy_seq = null; } else {
      this.buy_seq = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.pay_method = null; } else {
      this.pay_method = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.user_mobile = null; } else {
      this.user_mobile = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.user_email = null; } else {
      this.user_email = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.user_sex = null; } else {
      this.user_sex = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.admin_id = null; } else {
      this.admin_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.team_group_id = null; } else {
      this.team_group_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.team_hotel_seq = null; } else {
      this.team_hotel_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.team_hotel_name = null; } else {
      this.team_hotel_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.team_hotel_city = null; } else {
      this.team_hotel_city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.team_hotel_city_name = null; } else {
      this.team_hotel_city_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.team_dept_code = null; } else {
      this.team_dept_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.voucher_no = null; } else {
      this.voucher_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.order_status = null; } else {
      this.order_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.buy_quantity = null; } else {
      this.buy_quantity = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_user_mobile = null; } else {
      this.buy_user_mobile = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_user_mobile_city = null; } else {
      this.buy_user_mobile_city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_user_mobile_brand = null; } else {
      this.buy_user_mobile_brand = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_user_mobile_area = null; } else {
      this.buy_user_mobile_area = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.team_price = null; } else {
      this.team_price = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.actual_pay_amt = null; } else {
      this.actual_pay_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.should_pay_amt = null; } else {
      this.should_pay_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.balance_pay_amt = null; } else {
      this.balance_pay_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.voucher_pay_amt = null; } else {
      this.voucher_pay_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.buy_limit = null; } else {
      this.buy_limit = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_time = null; } else {
      this.order_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.pay_time = null; } else {
      this.pay_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.partner_id = null; } else {
      this.partner_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.order_type = null; } else {
      this.order_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.refund_amt = null; } else {
      this.refund_amt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.refund_times = null; } else {
      this.refund_times = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.last_refund_time = null; } else {
      this.last_refund_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.refund_quantity = null; } else {
      this.refund_quantity = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.red_envelope = null; } else {
      this.red_envelope = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.parent_order_id = null; } else {
      this.parent_order_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.lock_flag = null; } else {
      this.lock_flag = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.package_id = null; } else {
      this.package_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.package_type = null; } else {
      this.package_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_quick_flag = null; } else {
      this.order_quick_flag = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.cancel_time = null; } else {
      this.cancel_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.other_tuan_info = null; } else {
      this.other_tuan_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.product_version = null; } else {
      this.product_version = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.reach_shop_time = null; } else {
      this.reach_shop_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.merchant_code = null; } else {
      this.merchant_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.other_tuan_state = null; } else {
      this.other_tuan_state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.version_no = null; } else {
      this.version_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.app_product_no = null; } else {
      this.app_product_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.user_device_no = null; } else {
      this.user_device_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.gid = null; } else {
      this.gid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.channel_no = null; } else {
      this.channel_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.source_code = null; } else {
      this.source_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_version = null; } else {
      this.order_version = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.cost_price = null; } else {
      this.cost_price = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.web_traffic_source_channel = null; } else {
      this.web_traffic_source_channel = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.baojian_total = null; } else {
      this.baojian_total = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    dwd_evt_team_order o = (dwd_evt_team_order) super.clone();
    o.order_time = (o.order_time != null) ? (java.sql.Timestamp) o.order_time.clone() : null;
    o.pay_time = (o.pay_time != null) ? (java.sql.Timestamp) o.pay_time.clone() : null;
    o.last_refund_time = (o.last_refund_time != null) ? (java.sql.Timestamp) o.last_refund_time.clone() : null;
    o.cancel_time = (o.cancel_time != null) ? (java.sql.Timestamp) o.cancel_time.clone() : null;
    o.order_version = (o.order_version != null) ? (java.sql.Timestamp) o.order_version.clone() : null;
    return o;
  }

  public void clone0(dwd_evt_team_order o) throws CloneNotSupportedException {
    o.order_time = (o.order_time != null) ? (java.sql.Timestamp) o.order_time.clone() : null;
    o.pay_time = (o.pay_time != null) ? (java.sql.Timestamp) o.pay_time.clone() : null;
    o.last_refund_time = (o.last_refund_time != null) ? (java.sql.Timestamp) o.last_refund_time.clone() : null;
    o.cancel_time = (o.cancel_time != null) ? (java.sql.Timestamp) o.cancel_time.clone() : null;
    o.order_version = (o.order_version != null) ? (java.sql.Timestamp) o.order_version.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("platform_type", this.platform_type);
    __sqoop$field_map.put("pay_seq", this.pay_seq);
    __sqoop$field_map.put("buy_seq", this.buy_seq);
    __sqoop$field_map.put("pay_method", this.pay_method);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("user_mobile", this.user_mobile);
    __sqoop$field_map.put("user_email", this.user_email);
    __sqoop$field_map.put("user_sex", this.user_sex);
    __sqoop$field_map.put("admin_id", this.admin_id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("team_group_id", this.team_group_id);
    __sqoop$field_map.put("team_hotel_seq", this.team_hotel_seq);
    __sqoop$field_map.put("team_hotel_name", this.team_hotel_name);
    __sqoop$field_map.put("team_hotel_city", this.team_hotel_city);
    __sqoop$field_map.put("team_hotel_city_name", this.team_hotel_city_name);
    __sqoop$field_map.put("team_dept_code", this.team_dept_code);
    __sqoop$field_map.put("voucher_no", this.voucher_no);
    __sqoop$field_map.put("order_status", this.order_status);
    __sqoop$field_map.put("buy_quantity", this.buy_quantity);
    __sqoop$field_map.put("buy_user_mobile", this.buy_user_mobile);
    __sqoop$field_map.put("buy_user_mobile_city", this.buy_user_mobile_city);
    __sqoop$field_map.put("buy_user_mobile_brand", this.buy_user_mobile_brand);
    __sqoop$field_map.put("buy_user_mobile_area", this.buy_user_mobile_area);
    __sqoop$field_map.put("team_price", this.team_price);
    __sqoop$field_map.put("actual_pay_amt", this.actual_pay_amt);
    __sqoop$field_map.put("should_pay_amt", this.should_pay_amt);
    __sqoop$field_map.put("balance_pay_amt", this.balance_pay_amt);
    __sqoop$field_map.put("voucher_pay_amt", this.voucher_pay_amt);
    __sqoop$field_map.put("buy_limit", this.buy_limit);
    __sqoop$field_map.put("order_time", this.order_time);
    __sqoop$field_map.put("pay_time", this.pay_time);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("order_type", this.order_type);
    __sqoop$field_map.put("refund_amt", this.refund_amt);
    __sqoop$field_map.put("refund_times", this.refund_times);
    __sqoop$field_map.put("last_refund_time", this.last_refund_time);
    __sqoop$field_map.put("refund_quantity", this.refund_quantity);
    __sqoop$field_map.put("red_envelope", this.red_envelope);
    __sqoop$field_map.put("parent_order_id", this.parent_order_id);
    __sqoop$field_map.put("lock_flag", this.lock_flag);
    __sqoop$field_map.put("package_id", this.package_id);
    __sqoop$field_map.put("package_type", this.package_type);
    __sqoop$field_map.put("order_quick_flag", this.order_quick_flag);
    __sqoop$field_map.put("cancel_time", this.cancel_time);
    __sqoop$field_map.put("other_tuan_info", this.other_tuan_info);
    __sqoop$field_map.put("product_version", this.product_version);
    __sqoop$field_map.put("reach_shop_time", this.reach_shop_time);
    __sqoop$field_map.put("merchant_code", this.merchant_code);
    __sqoop$field_map.put("other_tuan_state", this.other_tuan_state);
    __sqoop$field_map.put("version_no", this.version_no);
    __sqoop$field_map.put("app_product_no", this.app_product_no);
    __sqoop$field_map.put("user_device_no", this.user_device_no);
    __sqoop$field_map.put("gid", this.gid);
    __sqoop$field_map.put("channel_no", this.channel_no);
    __sqoop$field_map.put("source_code", this.source_code);
    __sqoop$field_map.put("order_version", this.order_version);
    __sqoop$field_map.put("cost_price", this.cost_price);
    __sqoop$field_map.put("web_traffic_source_channel", this.web_traffic_source_channel);
    __sqoop$field_map.put("baojian_total", this.baojian_total);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("platform_type", this.platform_type);
    __sqoop$field_map.put("pay_seq", this.pay_seq);
    __sqoop$field_map.put("buy_seq", this.buy_seq);
    __sqoop$field_map.put("pay_method", this.pay_method);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("user_mobile", this.user_mobile);
    __sqoop$field_map.put("user_email", this.user_email);
    __sqoop$field_map.put("user_sex", this.user_sex);
    __sqoop$field_map.put("admin_id", this.admin_id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("team_group_id", this.team_group_id);
    __sqoop$field_map.put("team_hotel_seq", this.team_hotel_seq);
    __sqoop$field_map.put("team_hotel_name", this.team_hotel_name);
    __sqoop$field_map.put("team_hotel_city", this.team_hotel_city);
    __sqoop$field_map.put("team_hotel_city_name", this.team_hotel_city_name);
    __sqoop$field_map.put("team_dept_code", this.team_dept_code);
    __sqoop$field_map.put("voucher_no", this.voucher_no);
    __sqoop$field_map.put("order_status", this.order_status);
    __sqoop$field_map.put("buy_quantity", this.buy_quantity);
    __sqoop$field_map.put("buy_user_mobile", this.buy_user_mobile);
    __sqoop$field_map.put("buy_user_mobile_city", this.buy_user_mobile_city);
    __sqoop$field_map.put("buy_user_mobile_brand", this.buy_user_mobile_brand);
    __sqoop$field_map.put("buy_user_mobile_area", this.buy_user_mobile_area);
    __sqoop$field_map.put("team_price", this.team_price);
    __sqoop$field_map.put("actual_pay_amt", this.actual_pay_amt);
    __sqoop$field_map.put("should_pay_amt", this.should_pay_amt);
    __sqoop$field_map.put("balance_pay_amt", this.balance_pay_amt);
    __sqoop$field_map.put("voucher_pay_amt", this.voucher_pay_amt);
    __sqoop$field_map.put("buy_limit", this.buy_limit);
    __sqoop$field_map.put("order_time", this.order_time);
    __sqoop$field_map.put("pay_time", this.pay_time);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("order_type", this.order_type);
    __sqoop$field_map.put("refund_amt", this.refund_amt);
    __sqoop$field_map.put("refund_times", this.refund_times);
    __sqoop$field_map.put("last_refund_time", this.last_refund_time);
    __sqoop$field_map.put("refund_quantity", this.refund_quantity);
    __sqoop$field_map.put("red_envelope", this.red_envelope);
    __sqoop$field_map.put("parent_order_id", this.parent_order_id);
    __sqoop$field_map.put("lock_flag", this.lock_flag);
    __sqoop$field_map.put("package_id", this.package_id);
    __sqoop$field_map.put("package_type", this.package_type);
    __sqoop$field_map.put("order_quick_flag", this.order_quick_flag);
    __sqoop$field_map.put("cancel_time", this.cancel_time);
    __sqoop$field_map.put("other_tuan_info", this.other_tuan_info);
    __sqoop$field_map.put("product_version", this.product_version);
    __sqoop$field_map.put("reach_shop_time", this.reach_shop_time);
    __sqoop$field_map.put("merchant_code", this.merchant_code);
    __sqoop$field_map.put("other_tuan_state", this.other_tuan_state);
    __sqoop$field_map.put("version_no", this.version_no);
    __sqoop$field_map.put("app_product_no", this.app_product_no);
    __sqoop$field_map.put("user_device_no", this.user_device_no);
    __sqoop$field_map.put("gid", this.gid);
    __sqoop$field_map.put("channel_no", this.channel_no);
    __sqoop$field_map.put("source_code", this.source_code);
    __sqoop$field_map.put("order_version", this.order_version);
    __sqoop$field_map.put("cost_price", this.cost_price);
    __sqoop$field_map.put("web_traffic_source_channel", this.web_traffic_source_channel);
    __sqoop$field_map.put("baojian_total", this.baojian_total);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("order_id".equals(__fieldName)) {
      this.order_id = (Integer) __fieldVal;
    }
    else    if ("platform_type".equals(__fieldName)) {
      this.platform_type = (String) __fieldVal;
    }
    else    if ("pay_seq".equals(__fieldName)) {
      this.pay_seq = (String) __fieldVal;
    }
    else    if ("buy_seq".equals(__fieldName)) {
      this.buy_seq = (Integer) __fieldVal;
    }
    else    if ("pay_method".equals(__fieldName)) {
      this.pay_method = (String) __fieldVal;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Integer) __fieldVal;
    }
    else    if ("user_mobile".equals(__fieldName)) {
      this.user_mobile = (String) __fieldVal;
    }
    else    if ("user_email".equals(__fieldName)) {
      this.user_email = (String) __fieldVal;
    }
    else    if ("user_sex".equals(__fieldName)) {
      this.user_sex = (String) __fieldVal;
    }
    else    if ("admin_id".equals(__fieldName)) {
      this.admin_id = (Integer) __fieldVal;
    }
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Integer) __fieldVal;
    }
    else    if ("team_group_id".equals(__fieldName)) {
      this.team_group_id = (Integer) __fieldVal;
    }
    else    if ("team_hotel_seq".equals(__fieldName)) {
      this.team_hotel_seq = (String) __fieldVal;
    }
    else    if ("team_hotel_name".equals(__fieldName)) {
      this.team_hotel_name = (String) __fieldVal;
    }
    else    if ("team_hotel_city".equals(__fieldName)) {
      this.team_hotel_city = (String) __fieldVal;
    }
    else    if ("team_hotel_city_name".equals(__fieldName)) {
      this.team_hotel_city_name = (String) __fieldVal;
    }
    else    if ("team_dept_code".equals(__fieldName)) {
      this.team_dept_code = (String) __fieldVal;
    }
    else    if ("voucher_no".equals(__fieldName)) {
      this.voucher_no = (String) __fieldVal;
    }
    else    if ("order_status".equals(__fieldName)) {
      this.order_status = (String) __fieldVal;
    }
    else    if ("buy_quantity".equals(__fieldName)) {
      this.buy_quantity = (Integer) __fieldVal;
    }
    else    if ("buy_user_mobile".equals(__fieldName)) {
      this.buy_user_mobile = (String) __fieldVal;
    }
    else    if ("buy_user_mobile_city".equals(__fieldName)) {
      this.buy_user_mobile_city = (String) __fieldVal;
    }
    else    if ("buy_user_mobile_brand".equals(__fieldName)) {
      this.buy_user_mobile_brand = (String) __fieldVal;
    }
    else    if ("buy_user_mobile_area".equals(__fieldName)) {
      this.buy_user_mobile_area = (String) __fieldVal;
    }
    else    if ("team_price".equals(__fieldName)) {
      this.team_price = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("actual_pay_amt".equals(__fieldName)) {
      this.actual_pay_amt = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("should_pay_amt".equals(__fieldName)) {
      this.should_pay_amt = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("balance_pay_amt".equals(__fieldName)) {
      this.balance_pay_amt = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("voucher_pay_amt".equals(__fieldName)) {
      this.voucher_pay_amt = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("buy_limit".equals(__fieldName)) {
      this.buy_limit = (String) __fieldVal;
    }
    else    if ("order_time".equals(__fieldName)) {
      this.order_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("pay_time".equals(__fieldName)) {
      this.pay_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("partner_id".equals(__fieldName)) {
      this.partner_id = (Integer) __fieldVal;
    }
    else    if ("order_type".equals(__fieldName)) {
      this.order_type = (String) __fieldVal;
    }
    else    if ("refund_amt".equals(__fieldName)) {
      this.refund_amt = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("refund_times".equals(__fieldName)) {
      this.refund_times = (Integer) __fieldVal;
    }
    else    if ("last_refund_time".equals(__fieldName)) {
      this.last_refund_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("refund_quantity".equals(__fieldName)) {
      this.refund_quantity = (Integer) __fieldVal;
    }
    else    if ("red_envelope".equals(__fieldName)) {
      this.red_envelope = (Integer) __fieldVal;
    }
    else    if ("parent_order_id".equals(__fieldName)) {
      this.parent_order_id = (Integer) __fieldVal;
    }
    else    if ("lock_flag".equals(__fieldName)) {
      this.lock_flag = (Integer) __fieldVal;
    }
    else    if ("package_id".equals(__fieldName)) {
      this.package_id = (Integer) __fieldVal;
    }
    else    if ("package_type".equals(__fieldName)) {
      this.package_type = (String) __fieldVal;
    }
    else    if ("order_quick_flag".equals(__fieldName)) {
      this.order_quick_flag = (Integer) __fieldVal;
    }
    else    if ("cancel_time".equals(__fieldName)) {
      this.cancel_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("other_tuan_info".equals(__fieldName)) {
      this.other_tuan_info = (String) __fieldVal;
    }
    else    if ("product_version".equals(__fieldName)) {
      this.product_version = (Integer) __fieldVal;
    }
    else    if ("reach_shop_time".equals(__fieldName)) {
      this.reach_shop_time = (String) __fieldVal;
    }
    else    if ("merchant_code".equals(__fieldName)) {
      this.merchant_code = (String) __fieldVal;
    }
    else    if ("other_tuan_state".equals(__fieldName)) {
      this.other_tuan_state = (String) __fieldVal;
    }
    else    if ("version_no".equals(__fieldName)) {
      this.version_no = (String) __fieldVal;
    }
    else    if ("app_product_no".equals(__fieldName)) {
      this.app_product_no = (String) __fieldVal;
    }
    else    if ("user_device_no".equals(__fieldName)) {
      this.user_device_no = (String) __fieldVal;
    }
    else    if ("gid".equals(__fieldName)) {
      this.gid = (String) __fieldVal;
    }
    else    if ("channel_no".equals(__fieldName)) {
      this.channel_no = (String) __fieldVal;
    }
    else    if ("source_code".equals(__fieldName)) {
      this.source_code = (String) __fieldVal;
    }
    else    if ("order_version".equals(__fieldName)) {
      this.order_version = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("cost_price".equals(__fieldName)) {
      this.cost_price = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("web_traffic_source_channel".equals(__fieldName)) {
      this.web_traffic_source_channel = (String) __fieldVal;
    }
    else    if ("baojian_total".equals(__fieldName)) {
      this.baojian_total = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("order_id".equals(__fieldName)) {
      this.order_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("platform_type".equals(__fieldName)) {
      this.platform_type = (String) __fieldVal;
      return true;
    }
    else    if ("pay_seq".equals(__fieldName)) {
      this.pay_seq = (String) __fieldVal;
      return true;
    }
    else    if ("buy_seq".equals(__fieldName)) {
      this.buy_seq = (Integer) __fieldVal;
      return true;
    }
    else    if ("pay_method".equals(__fieldName)) {
      this.pay_method = (String) __fieldVal;
      return true;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("user_mobile".equals(__fieldName)) {
      this.user_mobile = (String) __fieldVal;
      return true;
    }
    else    if ("user_email".equals(__fieldName)) {
      this.user_email = (String) __fieldVal;
      return true;
    }
    else    if ("user_sex".equals(__fieldName)) {
      this.user_sex = (String) __fieldVal;
      return true;
    }
    else    if ("admin_id".equals(__fieldName)) {
      this.admin_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("team_group_id".equals(__fieldName)) {
      this.team_group_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("team_hotel_seq".equals(__fieldName)) {
      this.team_hotel_seq = (String) __fieldVal;
      return true;
    }
    else    if ("team_hotel_name".equals(__fieldName)) {
      this.team_hotel_name = (String) __fieldVal;
      return true;
    }
    else    if ("team_hotel_city".equals(__fieldName)) {
      this.team_hotel_city = (String) __fieldVal;
      return true;
    }
    else    if ("team_hotel_city_name".equals(__fieldName)) {
      this.team_hotel_city_name = (String) __fieldVal;
      return true;
    }
    else    if ("team_dept_code".equals(__fieldName)) {
      this.team_dept_code = (String) __fieldVal;
      return true;
    }
    else    if ("voucher_no".equals(__fieldName)) {
      this.voucher_no = (String) __fieldVal;
      return true;
    }
    else    if ("order_status".equals(__fieldName)) {
      this.order_status = (String) __fieldVal;
      return true;
    }
    else    if ("buy_quantity".equals(__fieldName)) {
      this.buy_quantity = (Integer) __fieldVal;
      return true;
    }
    else    if ("buy_user_mobile".equals(__fieldName)) {
      this.buy_user_mobile = (String) __fieldVal;
      return true;
    }
    else    if ("buy_user_mobile_city".equals(__fieldName)) {
      this.buy_user_mobile_city = (String) __fieldVal;
      return true;
    }
    else    if ("buy_user_mobile_brand".equals(__fieldName)) {
      this.buy_user_mobile_brand = (String) __fieldVal;
      return true;
    }
    else    if ("buy_user_mobile_area".equals(__fieldName)) {
      this.buy_user_mobile_area = (String) __fieldVal;
      return true;
    }
    else    if ("team_price".equals(__fieldName)) {
      this.team_price = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("actual_pay_amt".equals(__fieldName)) {
      this.actual_pay_amt = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("should_pay_amt".equals(__fieldName)) {
      this.should_pay_amt = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("balance_pay_amt".equals(__fieldName)) {
      this.balance_pay_amt = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("voucher_pay_amt".equals(__fieldName)) {
      this.voucher_pay_amt = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("buy_limit".equals(__fieldName)) {
      this.buy_limit = (String) __fieldVal;
      return true;
    }
    else    if ("order_time".equals(__fieldName)) {
      this.order_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("pay_time".equals(__fieldName)) {
      this.pay_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("partner_id".equals(__fieldName)) {
      this.partner_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("order_type".equals(__fieldName)) {
      this.order_type = (String) __fieldVal;
      return true;
    }
    else    if ("refund_amt".equals(__fieldName)) {
      this.refund_amt = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("refund_times".equals(__fieldName)) {
      this.refund_times = (Integer) __fieldVal;
      return true;
    }
    else    if ("last_refund_time".equals(__fieldName)) {
      this.last_refund_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("refund_quantity".equals(__fieldName)) {
      this.refund_quantity = (Integer) __fieldVal;
      return true;
    }
    else    if ("red_envelope".equals(__fieldName)) {
      this.red_envelope = (Integer) __fieldVal;
      return true;
    }
    else    if ("parent_order_id".equals(__fieldName)) {
      this.parent_order_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("lock_flag".equals(__fieldName)) {
      this.lock_flag = (Integer) __fieldVal;
      return true;
    }
    else    if ("package_id".equals(__fieldName)) {
      this.package_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("package_type".equals(__fieldName)) {
      this.package_type = (String) __fieldVal;
      return true;
    }
    else    if ("order_quick_flag".equals(__fieldName)) {
      this.order_quick_flag = (Integer) __fieldVal;
      return true;
    }
    else    if ("cancel_time".equals(__fieldName)) {
      this.cancel_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("other_tuan_info".equals(__fieldName)) {
      this.other_tuan_info = (String) __fieldVal;
      return true;
    }
    else    if ("product_version".equals(__fieldName)) {
      this.product_version = (Integer) __fieldVal;
      return true;
    }
    else    if ("reach_shop_time".equals(__fieldName)) {
      this.reach_shop_time = (String) __fieldVal;
      return true;
    }
    else    if ("merchant_code".equals(__fieldName)) {
      this.merchant_code = (String) __fieldVal;
      return true;
    }
    else    if ("other_tuan_state".equals(__fieldName)) {
      this.other_tuan_state = (String) __fieldVal;
      return true;
    }
    else    if ("version_no".equals(__fieldName)) {
      this.version_no = (String) __fieldVal;
      return true;
    }
    else    if ("app_product_no".equals(__fieldName)) {
      this.app_product_no = (String) __fieldVal;
      return true;
    }
    else    if ("user_device_no".equals(__fieldName)) {
      this.user_device_no = (String) __fieldVal;
      return true;
    }
    else    if ("gid".equals(__fieldName)) {
      this.gid = (String) __fieldVal;
      return true;
    }
    else    if ("channel_no".equals(__fieldName)) {
      this.channel_no = (String) __fieldVal;
      return true;
    }
    else    if ("source_code".equals(__fieldName)) {
      this.source_code = (String) __fieldVal;
      return true;
    }
    else    if ("order_version".equals(__fieldName)) {
      this.order_version = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("cost_price".equals(__fieldName)) {
      this.cost_price = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("web_traffic_source_channel".equals(__fieldName)) {
      this.web_traffic_source_channel = (String) __fieldVal;
      return true;
    }
    else    if ("baojian_total".equals(__fieldName)) {
      this.baojian_total = (Integer) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
