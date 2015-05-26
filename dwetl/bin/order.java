// ORM class for table 'order'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Nov 17 18:20:24 CST 2014
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

public class order extends SqoopRecord  implements DBWritable, Writable {
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
  public order with_id(Long id) {
    this.id = id;
    return this;
  }
  private String pay_id;
  public String get_pay_id() {
    return pay_id;
  }
  public void set_pay_id(String pay_id) {
    this.pay_id = pay_id;
  }
  public order with_pay_id(String pay_id) {
    this.pay_id = pay_id;
    return this;
  }
  private Long buy_id;
  public Long get_buy_id() {
    return buy_id;
  }
  public void set_buy_id(Long buy_id) {
    this.buy_id = buy_id;
  }
  public order with_buy_id(Long buy_id) {
    this.buy_id = buy_id;
    return this;
  }
  private String service;
  public String get_service() {
    return service;
  }
  public void set_service(String service) {
    this.service = service;
  }
  public order with_service(String service) {
    this.service = service;
    return this;
  }
  private Long user_id;
  public Long get_user_id() {
    return user_id;
  }
  public void set_user_id(Long user_id) {
    this.user_id = user_id;
  }
  public order with_user_id(Long user_id) {
    this.user_id = user_id;
    return this;
  }
  private Long admin_id;
  public Long get_admin_id() {
    return admin_id;
  }
  public void set_admin_id(Long admin_id) {
    this.admin_id = admin_id;
  }
  public order with_admin_id(Long admin_id) {
    this.admin_id = admin_id;
    return this;
  }
  private Long team_id;
  public Long get_team_id() {
    return team_id;
  }
  public void set_team_id(Long team_id) {
    this.team_id = team_id;
  }
  public order with_team_id(Long team_id) {
    this.team_id = team_id;
    return this;
  }
  private Long city_id;
  public Long get_city_id() {
    return city_id;
  }
  public void set_city_id(Long city_id) {
    this.city_id = city_id;
  }
  public order with_city_id(Long city_id) {
    this.city_id = city_id;
    return this;
  }
  private String card_id;
  public String get_card_id() {
    return card_id;
  }
  public void set_card_id(String card_id) {
    this.card_id = card_id;
  }
  public order with_card_id(String card_id) {
    this.card_id = card_id;
    return this;
  }
  private String state;
  public String get_state() {
    return state;
  }
  public void set_state(String state) {
    this.state = state;
  }
  public order with_state(String state) {
    this.state = state;
    return this;
  }
  private Long quantity;
  public Long get_quantity() {
    return quantity;
  }
  public void set_quantity(Long quantity) {
    this.quantity = quantity;
  }
  public order with_quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }
  private String realname;
  public String get_realname() {
    return realname;
  }
  public void set_realname(String realname) {
    this.realname = realname;
  }
  public order with_realname(String realname) {
    this.realname = realname;
    return this;
  }
  private String mobile;
  public String get_mobile() {
    return mobile;
  }
  public void set_mobile(String mobile) {
    this.mobile = mobile;
  }
  public order with_mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }
  private String c_mobile;
  public String get_c_mobile() {
    return c_mobile;
  }
  public void set_c_mobile(String c_mobile) {
    this.c_mobile = c_mobile;
  }
  public order with_c_mobile(String c_mobile) {
    this.c_mobile = c_mobile;
    return this;
  }
  private String zipcode;
  public String get_zipcode() {
    return zipcode;
  }
  public void set_zipcode(String zipcode) {
    this.zipcode = zipcode;
  }
  public order with_zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }
  private String address;
  public String get_address() {
    return address;
  }
  public void set_address(String address) {
    this.address = address;
  }
  public order with_address(String address) {
    this.address = address;
    return this;
  }
  private String express;
  public String get_express() {
    return express;
  }
  public void set_express(String express) {
    this.express = express;
  }
  public order with_express(String express) {
    this.express = express;
    return this;
  }
  private String express_xx;
  public String get_express_xx() {
    return express_xx;
  }
  public void set_express_xx(String express_xx) {
    this.express_xx = express_xx;
  }
  public order with_express_xx(String express_xx) {
    this.express_xx = express_xx;
    return this;
  }
  private Long express_id;
  public Long get_express_id() {
    return express_id;
  }
  public void set_express_id(Long express_id) {
    this.express_id = express_id;
  }
  public order with_express_id(Long express_id) {
    this.express_id = express_id;
    return this;
  }
  private String express_no;
  public String get_express_no() {
    return express_no;
  }
  public void set_express_no(String express_no) {
    this.express_no = express_no;
  }
  public order with_express_no(String express_no) {
    this.express_no = express_no;
    return this;
  }
  private Float price;
  public Float get_price() {
    return price;
  }
  public void set_price(Float price) {
    this.price = price;
  }
  public order with_price(Float price) {
    this.price = price;
    return this;
  }
  private Float money;
  public Float get_money() {
    return money;
  }
  public void set_money(Float money) {
    this.money = money;
  }
  public order with_money(Float money) {
    this.money = money;
    return this;
  }
  private Float origin;
  public Float get_origin() {
    return origin;
  }
  public void set_origin(Float origin) {
    this.origin = origin;
  }
  public order with_origin(Float origin) {
    this.origin = origin;
    return this;
  }
  private Float credit;
  public Float get_credit() {
    return credit;
  }
  public void set_credit(Float credit) {
    this.credit = credit;
  }
  public order with_credit(Float credit) {
    this.credit = credit;
    return this;
  }
  private Float card;
  public Float get_card() {
    return card;
  }
  public void set_card(Float card) {
    this.card = card;
  }
  public order with_card(Float card) {
    this.card = card;
    return this;
  }
  private Float fare;
  public Float get_fare() {
    return fare;
  }
  public void set_fare(Float fare) {
    this.fare = fare;
  }
  public order with_fare(Float fare) {
    this.fare = fare;
    return this;
  }
  private String condbuy;
  public String get_condbuy() {
    return condbuy;
  }
  public void set_condbuy(String condbuy) {
    this.condbuy = condbuy;
  }
  public order with_condbuy(String condbuy) {
    this.condbuy = condbuy;
    return this;
  }
  private String remark;
  public String get_remark() {
    return remark;
  }
  public void set_remark(String remark) {
    this.remark = remark;
  }
  public order with_remark(String remark) {
    this.remark = remark;
    return this;
  }
  private Long create_time;
  public Long get_create_time() {
    return create_time;
  }
  public void set_create_time(Long create_time) {
    this.create_time = create_time;
  }
  public order with_create_time(Long create_time) {
    this.create_time = create_time;
    return this;
  }
  private Long pay_time;
  public Long get_pay_time() {
    return pay_time;
  }
  public void set_pay_time(Long pay_time) {
    this.pay_time = pay_time;
  }
  public order with_pay_time(Long pay_time) {
    this.pay_time = pay_time;
    return this;
  }
  private String comment_content;
  public String get_comment_content() {
    return comment_content;
  }
  public void set_comment_content(String comment_content) {
    this.comment_content = comment_content;
  }
  public order with_comment_content(String comment_content) {
    this.comment_content = comment_content;
    return this;
  }
  private String comment_display;
  public String get_comment_display() {
    return comment_display;
  }
  public void set_comment_display(String comment_display) {
    this.comment_display = comment_display;
  }
  public order with_comment_display(String comment_display) {
    this.comment_display = comment_display;
    return this;
  }
  private String comment_grade;
  public String get_comment_grade() {
    return comment_grade;
  }
  public void set_comment_grade(String comment_grade) {
    this.comment_grade = comment_grade;
  }
  public order with_comment_grade(String comment_grade) {
    this.comment_grade = comment_grade;
    return this;
  }
  private Long comment_time;
  public Long get_comment_time() {
    return comment_time;
  }
  public void set_comment_time(Long comment_time) {
    this.comment_time = comment_time;
  }
  public order with_comment_time(Long comment_time) {
    this.comment_time = comment_time;
    return this;
  }
  private Long partner_id;
  public Long get_partner_id() {
    return partner_id;
  }
  public void set_partner_id(Long partner_id) {
    this.partner_id = partner_id;
  }
  public order with_partner_id(Long partner_id) {
    this.partner_id = partner_id;
    return this;
  }
  private String sms_express;
  public String get_sms_express() {
    return sms_express;
  }
  public void set_sms_express(String sms_express) {
    this.sms_express = sms_express;
  }
  public order with_sms_express(String sms_express) {
    this.sms_express = sms_express;
    return this;
  }
  private Long luky_id;
  public Long get_luky_id() {
    return luky_id;
  }
  public void set_luky_id(Long luky_id) {
    this.luky_id = luky_id;
  }
  public order with_luky_id(Long luky_id) {
    this.luky_id = luky_id;
    return this;
  }
  private String order_type;
  public String get_order_type() {
    return order_type;
  }
  public void set_order_type(String order_type) {
    this.order_type = order_type;
  }
  public order with_order_type(String order_type) {
    this.order_type = order_type;
    return this;
  }
  private Long express_time;
  public Long get_express_time() {
    return express_time;
  }
  public void set_express_time(Long express_time) {
    this.express_time = express_time;
  }
  public order with_express_time(Long express_time) {
    this.express_time = express_time;
    return this;
  }
  private String express_note;
  public String get_express_note() {
    return express_note;
  }
  public void set_express_note(String express_note) {
    this.express_note = express_note;
  }
  public order with_express_note(String express_note) {
    this.express_note = express_note;
    return this;
  }
  private String user_set_state;
  public String get_user_set_state() {
    return user_set_state;
  }
  public void set_user_set_state(String user_set_state) {
    this.user_set_state = user_set_state;
  }
  public order with_user_set_state(String user_set_state) {
    this.user_set_state = user_set_state;
    return this;
  }
  private Float refund_money;
  public Float get_refund_money() {
    return refund_money;
  }
  public void set_refund_money(Float refund_money) {
    this.refund_money = refund_money;
  }
  public order with_refund_money(Float refund_money) {
    this.refund_money = refund_money;
    return this;
  }
  private Integer refund_times;
  public Integer get_refund_times() {
    return refund_times;
  }
  public void set_refund_times(Integer refund_times) {
    this.refund_times = refund_times;
  }
  public order with_refund_times(Integer refund_times) {
    this.refund_times = refund_times;
    return this;
  }
  private Long last_refund_time;
  public Long get_last_refund_time() {
    return last_refund_time;
  }
  public void set_last_refund_time(Long last_refund_time) {
    this.last_refund_time = last_refund_time;
  }
  public order with_last_refund_time(Long last_refund_time) {
    this.last_refund_time = last_refund_time;
    return this;
  }
  private Long refund_quantity;
  public Long get_refund_quantity() {
    return refund_quantity;
  }
  public void set_refund_quantity(Long refund_quantity) {
    this.refund_quantity = refund_quantity;
  }
  public order with_refund_quantity(Long refund_quantity) {
    this.refund_quantity = refund_quantity;
    return this;
  }
  private String flight_tts_state;
  public String get_flight_tts_state() {
    return flight_tts_state;
  }
  public void set_flight_tts_state(String flight_tts_state) {
    this.flight_tts_state = flight_tts_state;
  }
  public order with_flight_tts_state(String flight_tts_state) {
    this.flight_tts_state = flight_tts_state;
    return this;
  }
  private String flight_tts_order_id;
  public String get_flight_tts_order_id() {
    return flight_tts_order_id;
  }
  public void set_flight_tts_order_id(String flight_tts_order_id) {
    this.flight_tts_order_id = flight_tts_order_id;
  }
  public order with_flight_tts_order_id(String flight_tts_order_id) {
    this.flight_tts_order_id = flight_tts_order_id;
    return this;
  }
  private String flight_tts_bookurl;
  public String get_flight_tts_bookurl() {
    return flight_tts_bookurl;
  }
  public void set_flight_tts_bookurl(String flight_tts_bookurl) {
    this.flight_tts_bookurl = flight_tts_bookurl;
  }
  public order with_flight_tts_bookurl(String flight_tts_bookurl) {
    this.flight_tts_bookurl = flight_tts_bookurl;
    return this;
  }
  private String flight_tts_oid;
  public String get_flight_tts_oid() {
    return flight_tts_oid;
  }
  public void set_flight_tts_oid(String flight_tts_oid) {
    this.flight_tts_oid = flight_tts_oid;
  }
  public order with_flight_tts_oid(String flight_tts_oid) {
    this.flight_tts_oid = flight_tts_oid;
    return this;
  }
  private Long red_envelope;
  public Long get_red_envelope() {
    return red_envelope;
  }
  public void set_red_envelope(Long red_envelope) {
    this.red_envelope = red_envelope;
  }
  public order with_red_envelope(Long red_envelope) {
    this.red_envelope = red_envelope;
    return this;
  }
  private Long p_order_id;
  public Long get_p_order_id() {
    return p_order_id;
  }
  public void set_p_order_id(Long p_order_id) {
    this.p_order_id = p_order_id;
  }
  public order with_p_order_id(Long p_order_id) {
    this.p_order_id = p_order_id;
    return this;
  }
  private Integer lock;
  public Integer get_lock() {
    return lock;
  }
  public void set_lock(Integer lock) {
    this.lock = lock;
  }
  public order with_lock(Integer lock) {
    this.lock = lock;
    return this;
  }
  private Long type_id;
  public Long get_type_id() {
    return type_id;
  }
  public void set_type_id(Long type_id) {
    this.type_id = type_id;
  }
  public order with_type_id(Long type_id) {
    this.type_id = type_id;
    return this;
  }
  private String type;
  public String get_type() {
    return type;
  }
  public void set_type(String type) {
    this.type = type;
  }
  public order with_type(String type) {
    this.type = type;
    return this;
  }
  private java.sql.Timestamp express_send_time;
  public java.sql.Timestamp get_express_send_time() {
    return express_send_time;
  }
  public void set_express_send_time(java.sql.Timestamp express_send_time) {
    this.express_send_time = express_send_time;
  }
  public order with_express_send_time(java.sql.Timestamp express_send_time) {
    this.express_send_time = express_send_time;
    return this;
  }
  private String holiday_tts_info;
  public String get_holiday_tts_info() {
    return holiday_tts_info;
  }
  public void set_holiday_tts_info(String holiday_tts_info) {
    this.holiday_tts_info = holiday_tts_info;
  }
  public order with_holiday_tts_info(String holiday_tts_info) {
    this.holiday_tts_info = holiday_tts_info;
    return this;
  }
  private java.sql.Timestamp holiday_tts_play_time;
  public java.sql.Timestamp get_holiday_tts_play_time() {
    return holiday_tts_play_time;
  }
  public void set_holiday_tts_play_time(java.sql.Timestamp holiday_tts_play_time) {
    this.holiday_tts_play_time = holiday_tts_play_time;
  }
  public order with_holiday_tts_play_time(java.sql.Timestamp holiday_tts_play_time) {
    this.holiday_tts_play_time = holiday_tts_play_time;
    return this;
  }
  private Integer order_quick;
  public Integer get_order_quick() {
    return order_quick;
  }
  public void set_order_quick(Integer order_quick) {
    this.order_quick = order_quick;
  }
  public order with_order_quick(Integer order_quick) {
    this.order_quick = order_quick;
    return this;
  }
  private Long cancel_time;
  public Long get_cancel_time() {
    return cancel_time;
  }
  public void set_cancel_time(Long cancel_time) {
    this.cancel_time = cancel_time;
  }
  public order with_cancel_time(Long cancel_time) {
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
  public order with_other_tuan_info(String other_tuan_info) {
    this.other_tuan_info = other_tuan_info;
    return this;
  }
  private Long version;
  public Long get_version() {
    return version;
  }
  public void set_version(Long version) {
    this.version = version;
  }
  public order with_version(Long version) {
    this.version = version;
    return this;
  }
  private String tppcode;
  public String get_tppcode() {
    return tppcode;
  }
  public void set_tppcode(String tppcode) {
    this.tppcode = tppcode;
  }
  public order with_tppcode(String tppcode) {
    this.tppcode = tppcode;
    return this;
  }
  private String trace_url_info;
  public String get_trace_url_info() {
    return trace_url_info;
  }
  public void set_trace_url_info(String trace_url_info) {
    this.trace_url_info = trace_url_info;
  }
  public order with_trace_url_info(String trace_url_info) {
    this.trace_url_info = trace_url_info;
    return this;
  }
  private String reach_shop_time;
  public String get_reach_shop_time() {
    return reach_shop_time;
  }
  public void set_reach_shop_time(String reach_shop_time) {
    this.reach_shop_time = reach_shop_time;
  }
  public order with_reach_shop_time(String reach_shop_time) {
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
  public order with_merchant_code(String merchant_code) {
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
  public order with_other_tuan_state(String other_tuan_state) {
    this.other_tuan_state = other_tuan_state;
    return this;
  }
  private String vid;
  public String get_vid() {
    return vid;
  }
  public void set_vid(String vid) {
    this.vid = vid;
  }
  public order with_vid(String vid) {
    this.vid = vid;
    return this;
  }
  private String pid;
  public String get_pid() {
    return pid;
  }
  public void set_pid(String pid) {
    this.pid = pid;
  }
  public order with_pid(String pid) {
    this.pid = pid;
    return this;
  }
  private String uid;
  public String get_uid() {
    return uid;
  }
  public void set_uid(String uid) {
    this.uid = uid;
  }
  public order with_uid(String uid) {
    this.uid = uid;
    return this;
  }
  private String gid;
  public String get_gid() {
    return gid;
  }
  public void set_gid(String gid) {
    this.gid = gid;
  }
  public order with_gid(String gid) {
    this.gid = gid;
    return this;
  }
  private String cid;
  public String get_cid() {
    return cid;
  }
  public void set_cid(String cid) {
    this.cid = cid;
  }
  public order with_cid(String cid) {
    this.cid = cid;
    return this;
  }
  private String org;
  public String get_org() {
    return org;
  }
  public void set_org(String org) {
    this.org = org;
  }
  public order with_org(String org) {
    this.org = org;
    return this;
  }
  private java.sql.Timestamp order_version;
  public java.sql.Timestamp get_order_version() {
    return order_version;
  }
  public void set_order_version(java.sql.Timestamp order_version) {
    this.order_version = order_version;
  }
  public order with_order_version(java.sql.Timestamp order_version) {
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
  public order with_cost_price(java.math.BigDecimal cost_price) {
    this.cost_price = cost_price;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof order)) {
      return false;
    }
    order that = (order) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.pay_id == null ? that.pay_id == null : this.pay_id.equals(that.pay_id));
    equal = equal && (this.buy_id == null ? that.buy_id == null : this.buy_id.equals(that.buy_id));
    equal = equal && (this.service == null ? that.service == null : this.service.equals(that.service));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.admin_id == null ? that.admin_id == null : this.admin_id.equals(that.admin_id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.city_id == null ? that.city_id == null : this.city_id.equals(that.city_id));
    equal = equal && (this.card_id == null ? that.card_id == null : this.card_id.equals(that.card_id));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.quantity == null ? that.quantity == null : this.quantity.equals(that.quantity));
    equal = equal && (this.realname == null ? that.realname == null : this.realname.equals(that.realname));
    equal = equal && (this.mobile == null ? that.mobile == null : this.mobile.equals(that.mobile));
    equal = equal && (this.c_mobile == null ? that.c_mobile == null : this.c_mobile.equals(that.c_mobile));
    equal = equal && (this.zipcode == null ? that.zipcode == null : this.zipcode.equals(that.zipcode));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.express == null ? that.express == null : this.express.equals(that.express));
    equal = equal && (this.express_xx == null ? that.express_xx == null : this.express_xx.equals(that.express_xx));
    equal = equal && (this.express_id == null ? that.express_id == null : this.express_id.equals(that.express_id));
    equal = equal && (this.express_no == null ? that.express_no == null : this.express_no.equals(that.express_no));
    equal = equal && (this.price == null ? that.price == null : this.price.equals(that.price));
    equal = equal && (this.money == null ? that.money == null : this.money.equals(that.money));
    equal = equal && (this.origin == null ? that.origin == null : this.origin.equals(that.origin));
    equal = equal && (this.credit == null ? that.credit == null : this.credit.equals(that.credit));
    equal = equal && (this.card == null ? that.card == null : this.card.equals(that.card));
    equal = equal && (this.fare == null ? that.fare == null : this.fare.equals(that.fare));
    equal = equal && (this.condbuy == null ? that.condbuy == null : this.condbuy.equals(that.condbuy));
    equal = equal && (this.remark == null ? that.remark == null : this.remark.equals(that.remark));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.pay_time == null ? that.pay_time == null : this.pay_time.equals(that.pay_time));
    equal = equal && (this.comment_content == null ? that.comment_content == null : this.comment_content.equals(that.comment_content));
    equal = equal && (this.comment_display == null ? that.comment_display == null : this.comment_display.equals(that.comment_display));
    equal = equal && (this.comment_grade == null ? that.comment_grade == null : this.comment_grade.equals(that.comment_grade));
    equal = equal && (this.comment_time == null ? that.comment_time == null : this.comment_time.equals(that.comment_time));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.sms_express == null ? that.sms_express == null : this.sms_express.equals(that.sms_express));
    equal = equal && (this.luky_id == null ? that.luky_id == null : this.luky_id.equals(that.luky_id));
    equal = equal && (this.order_type == null ? that.order_type == null : this.order_type.equals(that.order_type));
    equal = equal && (this.express_time == null ? that.express_time == null : this.express_time.equals(that.express_time));
    equal = equal && (this.express_note == null ? that.express_note == null : this.express_note.equals(that.express_note));
    equal = equal && (this.user_set_state == null ? that.user_set_state == null : this.user_set_state.equals(that.user_set_state));
    equal = equal && (this.refund_money == null ? that.refund_money == null : this.refund_money.equals(that.refund_money));
    equal = equal && (this.refund_times == null ? that.refund_times == null : this.refund_times.equals(that.refund_times));
    equal = equal && (this.last_refund_time == null ? that.last_refund_time == null : this.last_refund_time.equals(that.last_refund_time));
    equal = equal && (this.refund_quantity == null ? that.refund_quantity == null : this.refund_quantity.equals(that.refund_quantity));
    equal = equal && (this.flight_tts_state == null ? that.flight_tts_state == null : this.flight_tts_state.equals(that.flight_tts_state));
    equal = equal && (this.flight_tts_order_id == null ? that.flight_tts_order_id == null : this.flight_tts_order_id.equals(that.flight_tts_order_id));
    equal = equal && (this.flight_tts_bookurl == null ? that.flight_tts_bookurl == null : this.flight_tts_bookurl.equals(that.flight_tts_bookurl));
    equal = equal && (this.flight_tts_oid == null ? that.flight_tts_oid == null : this.flight_tts_oid.equals(that.flight_tts_oid));
    equal = equal && (this.red_envelope == null ? that.red_envelope == null : this.red_envelope.equals(that.red_envelope));
    equal = equal && (this.p_order_id == null ? that.p_order_id == null : this.p_order_id.equals(that.p_order_id));
    equal = equal && (this.lock == null ? that.lock == null : this.lock.equals(that.lock));
    equal = equal && (this.type_id == null ? that.type_id == null : this.type_id.equals(that.type_id));
    equal = equal && (this.type == null ? that.type == null : this.type.equals(that.type));
    equal = equal && (this.express_send_time == null ? that.express_send_time == null : this.express_send_time.equals(that.express_send_time));
    equal = equal && (this.holiday_tts_info == null ? that.holiday_tts_info == null : this.holiday_tts_info.equals(that.holiday_tts_info));
    equal = equal && (this.holiday_tts_play_time == null ? that.holiday_tts_play_time == null : this.holiday_tts_play_time.equals(that.holiday_tts_play_time));
    equal = equal && (this.order_quick == null ? that.order_quick == null : this.order_quick.equals(that.order_quick));
    equal = equal && (this.cancel_time == null ? that.cancel_time == null : this.cancel_time.equals(that.cancel_time));
    equal = equal && (this.other_tuan_info == null ? that.other_tuan_info == null : this.other_tuan_info.equals(that.other_tuan_info));
    equal = equal && (this.version == null ? that.version == null : this.version.equals(that.version));
    equal = equal && (this.tppcode == null ? that.tppcode == null : this.tppcode.equals(that.tppcode));
    equal = equal && (this.trace_url_info == null ? that.trace_url_info == null : this.trace_url_info.equals(that.trace_url_info));
    equal = equal && (this.reach_shop_time == null ? that.reach_shop_time == null : this.reach_shop_time.equals(that.reach_shop_time));
    equal = equal && (this.merchant_code == null ? that.merchant_code == null : this.merchant_code.equals(that.merchant_code));
    equal = equal && (this.other_tuan_state == null ? that.other_tuan_state == null : this.other_tuan_state.equals(that.other_tuan_state));
    equal = equal && (this.vid == null ? that.vid == null : this.vid.equals(that.vid));
    equal = equal && (this.pid == null ? that.pid == null : this.pid.equals(that.pid));
    equal = equal && (this.uid == null ? that.uid == null : this.uid.equals(that.uid));
    equal = equal && (this.gid == null ? that.gid == null : this.gid.equals(that.gid));
    equal = equal && (this.cid == null ? that.cid == null : this.cid.equals(that.cid));
    equal = equal && (this.org == null ? that.org == null : this.org.equals(that.org));
    equal = equal && (this.order_version == null ? that.order_version == null : this.order_version.equals(that.order_version));
    equal = equal && (this.cost_price == null ? that.cost_price == null : this.cost_price.equals(that.cost_price));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof order)) {
      return false;
    }
    order that = (order) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.pay_id == null ? that.pay_id == null : this.pay_id.equals(that.pay_id));
    equal = equal && (this.buy_id == null ? that.buy_id == null : this.buy_id.equals(that.buy_id));
    equal = equal && (this.service == null ? that.service == null : this.service.equals(that.service));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.admin_id == null ? that.admin_id == null : this.admin_id.equals(that.admin_id));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.city_id == null ? that.city_id == null : this.city_id.equals(that.city_id));
    equal = equal && (this.card_id == null ? that.card_id == null : this.card_id.equals(that.card_id));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.quantity == null ? that.quantity == null : this.quantity.equals(that.quantity));
    equal = equal && (this.realname == null ? that.realname == null : this.realname.equals(that.realname));
    equal = equal && (this.mobile == null ? that.mobile == null : this.mobile.equals(that.mobile));
    equal = equal && (this.c_mobile == null ? that.c_mobile == null : this.c_mobile.equals(that.c_mobile));
    equal = equal && (this.zipcode == null ? that.zipcode == null : this.zipcode.equals(that.zipcode));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.express == null ? that.express == null : this.express.equals(that.express));
    equal = equal && (this.express_xx == null ? that.express_xx == null : this.express_xx.equals(that.express_xx));
    equal = equal && (this.express_id == null ? that.express_id == null : this.express_id.equals(that.express_id));
    equal = equal && (this.express_no == null ? that.express_no == null : this.express_no.equals(that.express_no));
    equal = equal && (this.price == null ? that.price == null : this.price.equals(that.price));
    equal = equal && (this.money == null ? that.money == null : this.money.equals(that.money));
    equal = equal && (this.origin == null ? that.origin == null : this.origin.equals(that.origin));
    equal = equal && (this.credit == null ? that.credit == null : this.credit.equals(that.credit));
    equal = equal && (this.card == null ? that.card == null : this.card.equals(that.card));
    equal = equal && (this.fare == null ? that.fare == null : this.fare.equals(that.fare));
    equal = equal && (this.condbuy == null ? that.condbuy == null : this.condbuy.equals(that.condbuy));
    equal = equal && (this.remark == null ? that.remark == null : this.remark.equals(that.remark));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.pay_time == null ? that.pay_time == null : this.pay_time.equals(that.pay_time));
    equal = equal && (this.comment_content == null ? that.comment_content == null : this.comment_content.equals(that.comment_content));
    equal = equal && (this.comment_display == null ? that.comment_display == null : this.comment_display.equals(that.comment_display));
    equal = equal && (this.comment_grade == null ? that.comment_grade == null : this.comment_grade.equals(that.comment_grade));
    equal = equal && (this.comment_time == null ? that.comment_time == null : this.comment_time.equals(that.comment_time));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.sms_express == null ? that.sms_express == null : this.sms_express.equals(that.sms_express));
    equal = equal && (this.luky_id == null ? that.luky_id == null : this.luky_id.equals(that.luky_id));
    equal = equal && (this.order_type == null ? that.order_type == null : this.order_type.equals(that.order_type));
    equal = equal && (this.express_time == null ? that.express_time == null : this.express_time.equals(that.express_time));
    equal = equal && (this.express_note == null ? that.express_note == null : this.express_note.equals(that.express_note));
    equal = equal && (this.user_set_state == null ? that.user_set_state == null : this.user_set_state.equals(that.user_set_state));
    equal = equal && (this.refund_money == null ? that.refund_money == null : this.refund_money.equals(that.refund_money));
    equal = equal && (this.refund_times == null ? that.refund_times == null : this.refund_times.equals(that.refund_times));
    equal = equal && (this.last_refund_time == null ? that.last_refund_time == null : this.last_refund_time.equals(that.last_refund_time));
    equal = equal && (this.refund_quantity == null ? that.refund_quantity == null : this.refund_quantity.equals(that.refund_quantity));
    equal = equal && (this.flight_tts_state == null ? that.flight_tts_state == null : this.flight_tts_state.equals(that.flight_tts_state));
    equal = equal && (this.flight_tts_order_id == null ? that.flight_tts_order_id == null : this.flight_tts_order_id.equals(that.flight_tts_order_id));
    equal = equal && (this.flight_tts_bookurl == null ? that.flight_tts_bookurl == null : this.flight_tts_bookurl.equals(that.flight_tts_bookurl));
    equal = equal && (this.flight_tts_oid == null ? that.flight_tts_oid == null : this.flight_tts_oid.equals(that.flight_tts_oid));
    equal = equal && (this.red_envelope == null ? that.red_envelope == null : this.red_envelope.equals(that.red_envelope));
    equal = equal && (this.p_order_id == null ? that.p_order_id == null : this.p_order_id.equals(that.p_order_id));
    equal = equal && (this.lock == null ? that.lock == null : this.lock.equals(that.lock));
    equal = equal && (this.type_id == null ? that.type_id == null : this.type_id.equals(that.type_id));
    equal = equal && (this.type == null ? that.type == null : this.type.equals(that.type));
    equal = equal && (this.express_send_time == null ? that.express_send_time == null : this.express_send_time.equals(that.express_send_time));
    equal = equal && (this.holiday_tts_info == null ? that.holiday_tts_info == null : this.holiday_tts_info.equals(that.holiday_tts_info));
    equal = equal && (this.holiday_tts_play_time == null ? that.holiday_tts_play_time == null : this.holiday_tts_play_time.equals(that.holiday_tts_play_time));
    equal = equal && (this.order_quick == null ? that.order_quick == null : this.order_quick.equals(that.order_quick));
    equal = equal && (this.cancel_time == null ? that.cancel_time == null : this.cancel_time.equals(that.cancel_time));
    equal = equal && (this.other_tuan_info == null ? that.other_tuan_info == null : this.other_tuan_info.equals(that.other_tuan_info));
    equal = equal && (this.version == null ? that.version == null : this.version.equals(that.version));
    equal = equal && (this.tppcode == null ? that.tppcode == null : this.tppcode.equals(that.tppcode));
    equal = equal && (this.trace_url_info == null ? that.trace_url_info == null : this.trace_url_info.equals(that.trace_url_info));
    equal = equal && (this.reach_shop_time == null ? that.reach_shop_time == null : this.reach_shop_time.equals(that.reach_shop_time));
    equal = equal && (this.merchant_code == null ? that.merchant_code == null : this.merchant_code.equals(that.merchant_code));
    equal = equal && (this.other_tuan_state == null ? that.other_tuan_state == null : this.other_tuan_state.equals(that.other_tuan_state));
    equal = equal && (this.vid == null ? that.vid == null : this.vid.equals(that.vid));
    equal = equal && (this.pid == null ? that.pid == null : this.pid.equals(that.pid));
    equal = equal && (this.uid == null ? that.uid == null : this.uid.equals(that.uid));
    equal = equal && (this.gid == null ? that.gid == null : this.gid.equals(that.gid));
    equal = equal && (this.cid == null ? that.cid == null : this.cid.equals(that.cid));
    equal = equal && (this.org == null ? that.org == null : this.org.equals(that.org));
    equal = equal && (this.order_version == null ? that.order_version == null : this.order_version.equals(that.order_version));
    equal = equal && (this.cost_price == null ? that.cost_price == null : this.cost_price.equals(that.cost_price));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.pay_id = JdbcWritableBridge.readString(2, __dbResults);
    this.buy_id = JdbcWritableBridge.readLong(3, __dbResults);
    this.service = JdbcWritableBridge.readString(4, __dbResults);
    this.user_id = JdbcWritableBridge.readLong(5, __dbResults);
    this.admin_id = JdbcWritableBridge.readLong(6, __dbResults);
    this.team_id = JdbcWritableBridge.readLong(7, __dbResults);
    this.city_id = JdbcWritableBridge.readLong(8, __dbResults);
    this.card_id = JdbcWritableBridge.readString(9, __dbResults);
    this.state = JdbcWritableBridge.readString(10, __dbResults);
    this.quantity = JdbcWritableBridge.readLong(11, __dbResults);
    this.realname = JdbcWritableBridge.readString(12, __dbResults);
    this.mobile = JdbcWritableBridge.readString(13, __dbResults);
    this.c_mobile = JdbcWritableBridge.readString(14, __dbResults);
    this.zipcode = JdbcWritableBridge.readString(15, __dbResults);
    this.address = JdbcWritableBridge.readString(16, __dbResults);
    this.express = JdbcWritableBridge.readString(17, __dbResults);
    this.express_xx = JdbcWritableBridge.readString(18, __dbResults);
    this.express_id = JdbcWritableBridge.readLong(19, __dbResults);
    this.express_no = JdbcWritableBridge.readString(20, __dbResults);
    this.price = JdbcWritableBridge.readFloat(21, __dbResults);
    this.money = JdbcWritableBridge.readFloat(22, __dbResults);
    this.origin = JdbcWritableBridge.readFloat(23, __dbResults);
    this.credit = JdbcWritableBridge.readFloat(24, __dbResults);
    this.card = JdbcWritableBridge.readFloat(25, __dbResults);
    this.fare = JdbcWritableBridge.readFloat(26, __dbResults);
    this.condbuy = JdbcWritableBridge.readString(27, __dbResults);
    this.remark = JdbcWritableBridge.readString(28, __dbResults);
    this.create_time = JdbcWritableBridge.readLong(29, __dbResults);
    this.pay_time = JdbcWritableBridge.readLong(30, __dbResults);
    this.comment_content = JdbcWritableBridge.readString(31, __dbResults);
    this.comment_display = JdbcWritableBridge.readString(32, __dbResults);
    this.comment_grade = JdbcWritableBridge.readString(33, __dbResults);
    this.comment_time = JdbcWritableBridge.readLong(34, __dbResults);
    this.partner_id = JdbcWritableBridge.readLong(35, __dbResults);
    this.sms_express = JdbcWritableBridge.readString(36, __dbResults);
    this.luky_id = JdbcWritableBridge.readLong(37, __dbResults);
    this.order_type = JdbcWritableBridge.readString(38, __dbResults);
    this.express_time = JdbcWritableBridge.readLong(39, __dbResults);
    this.express_note = JdbcWritableBridge.readString(40, __dbResults);
    this.user_set_state = JdbcWritableBridge.readString(41, __dbResults);
    this.refund_money = JdbcWritableBridge.readFloat(42, __dbResults);
    this.refund_times = JdbcWritableBridge.readInteger(43, __dbResults);
    this.last_refund_time = JdbcWritableBridge.readLong(44, __dbResults);
    this.refund_quantity = JdbcWritableBridge.readLong(45, __dbResults);
    this.flight_tts_state = JdbcWritableBridge.readString(46, __dbResults);
    this.flight_tts_order_id = JdbcWritableBridge.readString(47, __dbResults);
    this.flight_tts_bookurl = JdbcWritableBridge.readString(48, __dbResults);
    this.flight_tts_oid = JdbcWritableBridge.readString(49, __dbResults);
    this.red_envelope = JdbcWritableBridge.readLong(50, __dbResults);
    this.p_order_id = JdbcWritableBridge.readLong(51, __dbResults);
    this.lock = JdbcWritableBridge.readInteger(52, __dbResults);
    this.type_id = JdbcWritableBridge.readLong(53, __dbResults);
    this.type = JdbcWritableBridge.readString(54, __dbResults);
    this.express_send_time = JdbcWritableBridge.readTimestamp(55, __dbResults);
    this.holiday_tts_info = JdbcWritableBridge.readString(56, __dbResults);
    this.holiday_tts_play_time = JdbcWritableBridge.readTimestamp(57, __dbResults);
    this.order_quick = JdbcWritableBridge.readInteger(58, __dbResults);
    this.cancel_time = JdbcWritableBridge.readLong(59, __dbResults);
    this.other_tuan_info = JdbcWritableBridge.readString(60, __dbResults);
    this.version = JdbcWritableBridge.readLong(61, __dbResults);
    this.tppcode = JdbcWritableBridge.readString(62, __dbResults);
    this.trace_url_info = JdbcWritableBridge.readString(63, __dbResults);
    this.reach_shop_time = JdbcWritableBridge.readString(64, __dbResults);
    this.merchant_code = JdbcWritableBridge.readString(65, __dbResults);
    this.other_tuan_state = JdbcWritableBridge.readString(66, __dbResults);
    this.vid = JdbcWritableBridge.readString(67, __dbResults);
    this.pid = JdbcWritableBridge.readString(68, __dbResults);
    this.uid = JdbcWritableBridge.readString(69, __dbResults);
    this.gid = JdbcWritableBridge.readString(70, __dbResults);
    this.cid = JdbcWritableBridge.readString(71, __dbResults);
    this.org = JdbcWritableBridge.readString(72, __dbResults);
    this.order_version = JdbcWritableBridge.readTimestamp(73, __dbResults);
    this.cost_price = JdbcWritableBridge.readBigDecimal(74, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.pay_id = JdbcWritableBridge.readString(2, __dbResults);
    this.buy_id = JdbcWritableBridge.readLong(3, __dbResults);
    this.service = JdbcWritableBridge.readString(4, __dbResults);
    this.user_id = JdbcWritableBridge.readLong(5, __dbResults);
    this.admin_id = JdbcWritableBridge.readLong(6, __dbResults);
    this.team_id = JdbcWritableBridge.readLong(7, __dbResults);
    this.city_id = JdbcWritableBridge.readLong(8, __dbResults);
    this.card_id = JdbcWritableBridge.readString(9, __dbResults);
    this.state = JdbcWritableBridge.readString(10, __dbResults);
    this.quantity = JdbcWritableBridge.readLong(11, __dbResults);
    this.realname = JdbcWritableBridge.readString(12, __dbResults);
    this.mobile = JdbcWritableBridge.readString(13, __dbResults);
    this.c_mobile = JdbcWritableBridge.readString(14, __dbResults);
    this.zipcode = JdbcWritableBridge.readString(15, __dbResults);
    this.address = JdbcWritableBridge.readString(16, __dbResults);
    this.express = JdbcWritableBridge.readString(17, __dbResults);
    this.express_xx = JdbcWritableBridge.readString(18, __dbResults);
    this.express_id = JdbcWritableBridge.readLong(19, __dbResults);
    this.express_no = JdbcWritableBridge.readString(20, __dbResults);
    this.price = JdbcWritableBridge.readFloat(21, __dbResults);
    this.money = JdbcWritableBridge.readFloat(22, __dbResults);
    this.origin = JdbcWritableBridge.readFloat(23, __dbResults);
    this.credit = JdbcWritableBridge.readFloat(24, __dbResults);
    this.card = JdbcWritableBridge.readFloat(25, __dbResults);
    this.fare = JdbcWritableBridge.readFloat(26, __dbResults);
    this.condbuy = JdbcWritableBridge.readString(27, __dbResults);
    this.remark = JdbcWritableBridge.readString(28, __dbResults);
    this.create_time = JdbcWritableBridge.readLong(29, __dbResults);
    this.pay_time = JdbcWritableBridge.readLong(30, __dbResults);
    this.comment_content = JdbcWritableBridge.readString(31, __dbResults);
    this.comment_display = JdbcWritableBridge.readString(32, __dbResults);
    this.comment_grade = JdbcWritableBridge.readString(33, __dbResults);
    this.comment_time = JdbcWritableBridge.readLong(34, __dbResults);
    this.partner_id = JdbcWritableBridge.readLong(35, __dbResults);
    this.sms_express = JdbcWritableBridge.readString(36, __dbResults);
    this.luky_id = JdbcWritableBridge.readLong(37, __dbResults);
    this.order_type = JdbcWritableBridge.readString(38, __dbResults);
    this.express_time = JdbcWritableBridge.readLong(39, __dbResults);
    this.express_note = JdbcWritableBridge.readString(40, __dbResults);
    this.user_set_state = JdbcWritableBridge.readString(41, __dbResults);
    this.refund_money = JdbcWritableBridge.readFloat(42, __dbResults);
    this.refund_times = JdbcWritableBridge.readInteger(43, __dbResults);
    this.last_refund_time = JdbcWritableBridge.readLong(44, __dbResults);
    this.refund_quantity = JdbcWritableBridge.readLong(45, __dbResults);
    this.flight_tts_state = JdbcWritableBridge.readString(46, __dbResults);
    this.flight_tts_order_id = JdbcWritableBridge.readString(47, __dbResults);
    this.flight_tts_bookurl = JdbcWritableBridge.readString(48, __dbResults);
    this.flight_tts_oid = JdbcWritableBridge.readString(49, __dbResults);
    this.red_envelope = JdbcWritableBridge.readLong(50, __dbResults);
    this.p_order_id = JdbcWritableBridge.readLong(51, __dbResults);
    this.lock = JdbcWritableBridge.readInteger(52, __dbResults);
    this.type_id = JdbcWritableBridge.readLong(53, __dbResults);
    this.type = JdbcWritableBridge.readString(54, __dbResults);
    this.express_send_time = JdbcWritableBridge.readTimestamp(55, __dbResults);
    this.holiday_tts_info = JdbcWritableBridge.readString(56, __dbResults);
    this.holiday_tts_play_time = JdbcWritableBridge.readTimestamp(57, __dbResults);
    this.order_quick = JdbcWritableBridge.readInteger(58, __dbResults);
    this.cancel_time = JdbcWritableBridge.readLong(59, __dbResults);
    this.other_tuan_info = JdbcWritableBridge.readString(60, __dbResults);
    this.version = JdbcWritableBridge.readLong(61, __dbResults);
    this.tppcode = JdbcWritableBridge.readString(62, __dbResults);
    this.trace_url_info = JdbcWritableBridge.readString(63, __dbResults);
    this.reach_shop_time = JdbcWritableBridge.readString(64, __dbResults);
    this.merchant_code = JdbcWritableBridge.readString(65, __dbResults);
    this.other_tuan_state = JdbcWritableBridge.readString(66, __dbResults);
    this.vid = JdbcWritableBridge.readString(67, __dbResults);
    this.pid = JdbcWritableBridge.readString(68, __dbResults);
    this.uid = JdbcWritableBridge.readString(69, __dbResults);
    this.gid = JdbcWritableBridge.readString(70, __dbResults);
    this.cid = JdbcWritableBridge.readString(71, __dbResults);
    this.org = JdbcWritableBridge.readString(72, __dbResults);
    this.order_version = JdbcWritableBridge.readTimestamp(73, __dbResults);
    this.cost_price = JdbcWritableBridge.readBigDecimal(74, __dbResults);
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
    JdbcWritableBridge.writeString(pay_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(buy_id, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(service, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(user_id, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(admin_id, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(team_id, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(city_id, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(card_id, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(quantity, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(realname, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mobile, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(c_mobile, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(zipcode, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(express, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(express_xx, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(express_id, 19 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(express_no, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(price, 21 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(money, 22 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(origin, 23 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(credit, 24 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(card, 25 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(fare, 26 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(condbuy, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(remark, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(create_time, 29 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(pay_time, 30 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(comment_content, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(comment_display, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(comment_grade, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(comment_time, 34 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(partner_id, 35 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(sms_express, 36 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeLong(luky_id, 37 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(order_type, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(express_time, 39 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(express_note, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(user_set_state, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(refund_money, 42 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(refund_times, 43 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(last_refund_time, 44 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(refund_quantity, 45 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(flight_tts_state, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(flight_tts_order_id, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(flight_tts_bookurl, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(flight_tts_oid, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(red_envelope, 50 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(p_order_id, 51 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(lock, 52 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(type_id, 53 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(type, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(express_send_time, 55 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(holiday_tts_info, 56 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeTimestamp(holiday_tts_play_time, 57 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(order_quick, 58 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(cancel_time, 59 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(other_tuan_info, 60 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(version, 61 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(tppcode, 62 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(trace_url_info, 63 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeString(reach_shop_time, 64 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(merchant_code, 65 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(other_tuan_state, 66 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(vid, 67 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pid, 68 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(uid, 69 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(gid, 70 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cid, 71 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(org, 72 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_version, 73 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(cost_price, 74 + __off, 2, __dbStmt);
    return 74;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(pay_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(buy_id, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(service, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(user_id, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(admin_id, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(team_id, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(city_id, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(card_id, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(quantity, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(realname, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mobile, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(c_mobile, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(zipcode, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(express, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(express_xx, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(express_id, 19 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(express_no, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(price, 21 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(money, 22 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(origin, 23 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(credit, 24 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(card, 25 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(fare, 26 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(condbuy, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(remark, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(create_time, 29 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(pay_time, 30 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(comment_content, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(comment_display, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(comment_grade, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(comment_time, 34 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(partner_id, 35 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(sms_express, 36 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeLong(luky_id, 37 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(order_type, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(express_time, 39 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(express_note, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(user_set_state, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(refund_money, 42 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(refund_times, 43 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(last_refund_time, 44 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(refund_quantity, 45 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(flight_tts_state, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(flight_tts_order_id, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(flight_tts_bookurl, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(flight_tts_oid, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(red_envelope, 50 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(p_order_id, 51 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(lock, 52 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(type_id, 53 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(type, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(express_send_time, 55 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(holiday_tts_info, 56 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeTimestamp(holiday_tts_play_time, 57 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(order_quick, 58 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(cancel_time, 59 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(other_tuan_info, 60 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(version, 61 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(tppcode, 62 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(trace_url_info, 63 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeString(reach_shop_time, 64 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(merchant_code, 65 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(other_tuan_state, 66 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(vid, 67 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pid, 68 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(uid, 69 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(gid, 70 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cid, 71 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(org, 72 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_version, 73 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(cost_price, 74 + __off, 2, __dbStmt);
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
        this.pay_id = null;
    } else {
    this.pay_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.buy_id = null;
    } else {
    this.buy_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.service = null;
    } else {
    this.service = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.user_id = null;
    } else {
    this.user_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.admin_id = null;
    } else {
    this.admin_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.team_id = null;
    } else {
    this.team_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.city_id = null;
    } else {
    this.city_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.card_id = null;
    } else {
    this.card_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.state = null;
    } else {
    this.state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.quantity = null;
    } else {
    this.quantity = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.realname = null;
    } else {
    this.realname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.mobile = null;
    } else {
    this.mobile = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.c_mobile = null;
    } else {
    this.c_mobile = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.zipcode = null;
    } else {
    this.zipcode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.address = null;
    } else {
    this.address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.express = null;
    } else {
    this.express = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.express_xx = null;
    } else {
    this.express_xx = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.express_id = null;
    } else {
    this.express_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.express_no = null;
    } else {
    this.express_no = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.price = null;
    } else {
    this.price = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.money = null;
    } else {
    this.money = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.origin = null;
    } else {
    this.origin = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.credit = null;
    } else {
    this.credit = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.card = null;
    } else {
    this.card = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.fare = null;
    } else {
    this.fare = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.condbuy = null;
    } else {
    this.condbuy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.remark = null;
    } else {
    this.remark = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.create_time = null;
    } else {
    this.create_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.pay_time = null;
    } else {
    this.pay_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.comment_content = null;
    } else {
    this.comment_content = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.comment_display = null;
    } else {
    this.comment_display = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.comment_grade = null;
    } else {
    this.comment_grade = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.comment_time = null;
    } else {
    this.comment_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.partner_id = null;
    } else {
    this.partner_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.sms_express = null;
    } else {
    this.sms_express = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.luky_id = null;
    } else {
    this.luky_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.order_type = null;
    } else {
    this.order_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.express_time = null;
    } else {
    this.express_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.express_note = null;
    } else {
    this.express_note = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.user_set_state = null;
    } else {
    this.user_set_state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.refund_money = null;
    } else {
    this.refund_money = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.refund_times = null;
    } else {
    this.refund_times = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.last_refund_time = null;
    } else {
    this.last_refund_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.refund_quantity = null;
    } else {
    this.refund_quantity = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flight_tts_state = null;
    } else {
    this.flight_tts_state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flight_tts_order_id = null;
    } else {
    this.flight_tts_order_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flight_tts_bookurl = null;
    } else {
    this.flight_tts_bookurl = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flight_tts_oid = null;
    } else {
    this.flight_tts_oid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.red_envelope = null;
    } else {
    this.red_envelope = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.p_order_id = null;
    } else {
    this.p_order_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.lock = null;
    } else {
    this.lock = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.type_id = null;
    } else {
    this.type_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.type = null;
    } else {
    this.type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.express_send_time = null;
    } else {
    this.express_send_time = new Timestamp(__dataIn.readLong());
    this.express_send_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.holiday_tts_info = null;
    } else {
    this.holiday_tts_info = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.holiday_tts_play_time = null;
    } else {
    this.holiday_tts_play_time = new Timestamp(__dataIn.readLong());
    this.holiday_tts_play_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.order_quick = null;
    } else {
    this.order_quick = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cancel_time = null;
    } else {
    this.cancel_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.other_tuan_info = null;
    } else {
    this.other_tuan_info = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.version = null;
    } else {
    this.version = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.tppcode = null;
    } else {
    this.tppcode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.trace_url_info = null;
    } else {
    this.trace_url_info = Text.readString(__dataIn);
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
        this.vid = null;
    } else {
    this.vid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pid = null;
    } else {
    this.pid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.uid = null;
    } else {
    this.uid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.gid = null;
    } else {
    this.gid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cid = null;
    } else {
    this.cid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.org = null;
    } else {
    this.org = Text.readString(__dataIn);
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
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.pay_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pay_id);
    }
    if (null == this.buy_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.buy_id);
    }
    if (null == this.service) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, service);
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_id);
    }
    if (null == this.admin_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.admin_id);
    }
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.team_id);
    }
    if (null == this.city_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.city_id);
    }
    if (null == this.card_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, card_id);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.quantity);
    }
    if (null == this.realname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, realname);
    }
    if (null == this.mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mobile);
    }
    if (null == this.c_mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, c_mobile);
    }
    if (null == this.zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zipcode);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.express) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, express);
    }
    if (null == this.express_xx) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, express_xx);
    }
    if (null == this.express_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.express_id);
    }
    if (null == this.express_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, express_no);
    }
    if (null == this.price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.price);
    }
    if (null == this.money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.money);
    }
    if (null == this.origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.origin);
    }
    if (null == this.credit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.credit);
    }
    if (null == this.card) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.card);
    }
    if (null == this.fare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.fare);
    }
    if (null == this.condbuy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, condbuy);
    }
    if (null == this.remark) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, remark);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time);
    }
    if (null == this.pay_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.pay_time);
    }
    if (null == this.comment_content) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, comment_content);
    }
    if (null == this.comment_display) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, comment_display);
    }
    if (null == this.comment_grade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, comment_grade);
    }
    if (null == this.comment_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.comment_time);
    }
    if (null == this.partner_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.partner_id);
    }
    if (null == this.sms_express) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sms_express);
    }
    if (null == this.luky_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.luky_id);
    }
    if (null == this.order_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_type);
    }
    if (null == this.express_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.express_time);
    }
    if (null == this.express_note) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, express_note);
    }
    if (null == this.user_set_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_set_state);
    }
    if (null == this.refund_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.refund_money);
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
    __dataOut.writeLong(this.last_refund_time);
    }
    if (null == this.refund_quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.refund_quantity);
    }
    if (null == this.flight_tts_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flight_tts_state);
    }
    if (null == this.flight_tts_order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flight_tts_order_id);
    }
    if (null == this.flight_tts_bookurl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flight_tts_bookurl);
    }
    if (null == this.flight_tts_oid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flight_tts_oid);
    }
    if (null == this.red_envelope) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.red_envelope);
    }
    if (null == this.p_order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.p_order_id);
    }
    if (null == this.lock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.lock);
    }
    if (null == this.type_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.type_id);
    }
    if (null == this.type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, type);
    }
    if (null == this.express_send_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.express_send_time.getTime());
    __dataOut.writeInt(this.express_send_time.getNanos());
    }
    if (null == this.holiday_tts_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holiday_tts_info);
    }
    if (null == this.holiday_tts_play_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.holiday_tts_play_time.getTime());
    __dataOut.writeInt(this.holiday_tts_play_time.getNanos());
    }
    if (null == this.order_quick) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_quick);
    }
    if (null == this.cancel_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.cancel_time);
    }
    if (null == this.other_tuan_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_tuan_info);
    }
    if (null == this.version) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.version);
    }
    if (null == this.tppcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tppcode);
    }
    if (null == this.trace_url_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, trace_url_info);
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
    if (null == this.vid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, vid);
    }
    if (null == this.pid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pid);
    }
    if (null == this.uid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, uid);
    }
    if (null == this.gid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, gid);
    }
    if (null == this.cid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cid);
    }
    if (null == this.org) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, org);
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
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.pay_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pay_id);
    }
    if (null == this.buy_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.buy_id);
    }
    if (null == this.service) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, service);
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_id);
    }
    if (null == this.admin_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.admin_id);
    }
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.team_id);
    }
    if (null == this.city_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.city_id);
    }
    if (null == this.card_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, card_id);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.quantity);
    }
    if (null == this.realname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, realname);
    }
    if (null == this.mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mobile);
    }
    if (null == this.c_mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, c_mobile);
    }
    if (null == this.zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zipcode);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.express) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, express);
    }
    if (null == this.express_xx) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, express_xx);
    }
    if (null == this.express_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.express_id);
    }
    if (null == this.express_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, express_no);
    }
    if (null == this.price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.price);
    }
    if (null == this.money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.money);
    }
    if (null == this.origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.origin);
    }
    if (null == this.credit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.credit);
    }
    if (null == this.card) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.card);
    }
    if (null == this.fare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.fare);
    }
    if (null == this.condbuy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, condbuy);
    }
    if (null == this.remark) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, remark);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time);
    }
    if (null == this.pay_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.pay_time);
    }
    if (null == this.comment_content) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, comment_content);
    }
    if (null == this.comment_display) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, comment_display);
    }
    if (null == this.comment_grade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, comment_grade);
    }
    if (null == this.comment_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.comment_time);
    }
    if (null == this.partner_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.partner_id);
    }
    if (null == this.sms_express) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sms_express);
    }
    if (null == this.luky_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.luky_id);
    }
    if (null == this.order_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_type);
    }
    if (null == this.express_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.express_time);
    }
    if (null == this.express_note) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, express_note);
    }
    if (null == this.user_set_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_set_state);
    }
    if (null == this.refund_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.refund_money);
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
    __dataOut.writeLong(this.last_refund_time);
    }
    if (null == this.refund_quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.refund_quantity);
    }
    if (null == this.flight_tts_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flight_tts_state);
    }
    if (null == this.flight_tts_order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flight_tts_order_id);
    }
    if (null == this.flight_tts_bookurl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flight_tts_bookurl);
    }
    if (null == this.flight_tts_oid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flight_tts_oid);
    }
    if (null == this.red_envelope) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.red_envelope);
    }
    if (null == this.p_order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.p_order_id);
    }
    if (null == this.lock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.lock);
    }
    if (null == this.type_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.type_id);
    }
    if (null == this.type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, type);
    }
    if (null == this.express_send_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.express_send_time.getTime());
    __dataOut.writeInt(this.express_send_time.getNanos());
    }
    if (null == this.holiday_tts_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holiday_tts_info);
    }
    if (null == this.holiday_tts_play_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.holiday_tts_play_time.getTime());
    __dataOut.writeInt(this.holiday_tts_play_time.getNanos());
    }
    if (null == this.order_quick) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_quick);
    }
    if (null == this.cancel_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.cancel_time);
    }
    if (null == this.other_tuan_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_tuan_info);
    }
    if (null == this.version) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.version);
    }
    if (null == this.tppcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tppcode);
    }
    if (null == this.trace_url_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, trace_url_info);
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
    if (null == this.vid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, vid);
    }
    if (null == this.pid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pid);
    }
    if (null == this.uid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, uid);
    }
    if (null == this.gid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, gid);
    }
    if (null == this.cid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cid);
    }
    if (null == this.org) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, org);
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(pay_id==null?"null":pay_id, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_id==null?"null":"" + buy_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(service==null?"null":service, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(admin_id==null?"null":"" + admin_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_id==null?"null":"" + city_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(card_id==null?"null":card_id, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(state==null?"null":state, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quantity==null?"null":"" + quantity, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(realname==null?"null":realname, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(mobile==null?"null":mobile, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(c_mobile==null?"null":c_mobile, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(zipcode==null?"null":zipcode, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(address==null?"null":address, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(express==null?"null":express, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(express_xx==null?"null":express_xx, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(express_id==null?"null":"" + express_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(express_no==null?"null":express_no, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(price==null?"null":"" + price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(money==null?"null":"" + money, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(origin==null?"null":"" + origin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(credit==null?"null":"" + credit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(card==null?"null":"" + card, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fare==null?"null":"" + fare, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(condbuy==null?"null":condbuy, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(remark==null?"null":remark, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_time==null?"null":"" + pay_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(comment_content==null?"null":comment_content, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(comment_display==null?"null":comment_display, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(comment_grade==null?"null":comment_grade, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(comment_time==null?"null":"" + comment_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(sms_express==null?"null":sms_express, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(luky_id==null?"null":"" + luky_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(order_type==null?"null":order_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(express_time==null?"null":"" + express_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(express_note==null?"null":express_note, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(user_set_state==null?"null":user_set_state, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_money==null?"null":"" + refund_money, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_times==null?"null":"" + refund_times, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_refund_time==null?"null":"" + last_refund_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_quantity==null?"null":"" + refund_quantity, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(flight_tts_state==null?"null":flight_tts_state, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(flight_tts_order_id==null?"null":flight_tts_order_id, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(flight_tts_bookurl==null?"null":flight_tts_bookurl, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(flight_tts_oid==null?"null":flight_tts_oid, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(red_envelope==null?"null":"" + red_envelope, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(p_order_id==null?"null":"" + p_order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lock==null?"null":"" + lock, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(type_id==null?"null":"" + type_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(type==null?"null":type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(express_send_time==null?"null":"" + express_send_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holiday_tts_info==null?"null":holiday_tts_info, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(holiday_tts_play_time==null?"null":"" + holiday_tts_play_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_quick==null?"null":"" + order_quick, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cancel_time==null?"null":"" + cancel_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(other_tuan_info==null?"null":other_tuan_info, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(version==null?"null":"" + version, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tppcode==null?"null":tppcode, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(trace_url_info==null?"null":trace_url_info, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(reach_shop_time==null?"null":reach_shop_time, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(merchant_code==null?"null":merchant_code, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(other_tuan_state==null?"null":other_tuan_state, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(vid==null?"null":vid, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(pid==null?"null":pid, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(uid==null?"null":uid, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(gid==null?"null":gid, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(cid==null?"null":cid, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(org==null?"null":org, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_version==null?"null":"" + order_version, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cost_price==null?"null":cost_price.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(pay_id==null?"null":pay_id, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buy_id==null?"null":"" + buy_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(service==null?"null":service, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(admin_id==null?"null":"" + admin_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_id==null?"null":"" + city_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(card_id==null?"null":card_id, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(state==null?"null":state, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quantity==null?"null":"" + quantity, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(realname==null?"null":realname, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(mobile==null?"null":mobile, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(c_mobile==null?"null":c_mobile, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(zipcode==null?"null":zipcode, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(address==null?"null":address, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(express==null?"null":express, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(express_xx==null?"null":express_xx, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(express_id==null?"null":"" + express_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(express_no==null?"null":express_no, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(price==null?"null":"" + price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(money==null?"null":"" + money, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(origin==null?"null":"" + origin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(credit==null?"null":"" + credit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(card==null?"null":"" + card, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fare==null?"null":"" + fare, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(condbuy==null?"null":condbuy, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(remark==null?"null":remark, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_time==null?"null":"" + pay_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(comment_content==null?"null":comment_content, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(comment_display==null?"null":comment_display, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(comment_grade==null?"null":comment_grade, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(comment_time==null?"null":"" + comment_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(sms_express==null?"null":sms_express, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(luky_id==null?"null":"" + luky_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(order_type==null?"null":order_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(express_time==null?"null":"" + express_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(express_note==null?"null":express_note, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(user_set_state==null?"null":user_set_state, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_money==null?"null":"" + refund_money, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_times==null?"null":"" + refund_times, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_refund_time==null?"null":"" + last_refund_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_quantity==null?"null":"" + refund_quantity, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(flight_tts_state==null?"null":flight_tts_state, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(flight_tts_order_id==null?"null":flight_tts_order_id, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(flight_tts_bookurl==null?"null":flight_tts_bookurl, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(flight_tts_oid==null?"null":flight_tts_oid, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(red_envelope==null?"null":"" + red_envelope, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(p_order_id==null?"null":"" + p_order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lock==null?"null":"" + lock, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(type_id==null?"null":"" + type_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(type==null?"null":type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(express_send_time==null?"null":"" + express_send_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holiday_tts_info==null?"null":holiday_tts_info, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(holiday_tts_play_time==null?"null":"" + holiday_tts_play_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_quick==null?"null":"" + order_quick, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cancel_time==null?"null":"" + cancel_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(other_tuan_info==null?"null":other_tuan_info, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(version==null?"null":"" + version, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tppcode==null?"null":tppcode, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(trace_url_info==null?"null":trace_url_info, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(reach_shop_time==null?"null":reach_shop_time, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(merchant_code==null?"null":merchant_code, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(other_tuan_state==null?"null":other_tuan_state, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(vid==null?"null":vid, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(pid==null?"null":pid, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(uid==null?"null":uid, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(gid==null?"null":gid, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(cid==null?"null":cid, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(org==null?"null":org, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_version==null?"null":"" + order_version, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cost_price==null?"null":cost_price.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.pay_id = null; } else {
      this.pay_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.buy_id = null; } else {
      this.buy_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.service = null; } else {
      this.service = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.admin_id = null; } else {
      this.admin_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.city_id = null; } else {
      this.city_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.card_id = null; } else {
      this.card_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.quantity = null; } else {
      this.quantity = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.realname = null; } else {
      this.realname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.mobile = null; } else {
      this.mobile = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.c_mobile = null; } else {
      this.c_mobile = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.zipcode = null; } else {
      this.zipcode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.express = null; } else {
      this.express = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.express_xx = null; } else {
      this.express_xx = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.express_id = null; } else {
      this.express_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.express_no = null; } else {
      this.express_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.price = null; } else {
      this.price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.money = null; } else {
      this.money = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.origin = null; } else {
      this.origin = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.credit = null; } else {
      this.credit = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.card = null; } else {
      this.card = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fare = null; } else {
      this.fare = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.condbuy = null; } else {
      this.condbuy = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.remark = null; } else {
      this.remark = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pay_time = null; } else {
      this.pay_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.comment_content = null; } else {
      this.comment_content = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.comment_display = null; } else {
      this.comment_display = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.comment_grade = null; } else {
      this.comment_grade = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.comment_time = null; } else {
      this.comment_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.partner_id = null; } else {
      this.partner_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sms_express = null; } else {
      this.sms_express = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.luky_id = null; } else {
      this.luky_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.order_type = null; } else {
      this.order_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.express_time = null; } else {
      this.express_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.express_note = null; } else {
      this.express_note = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.user_set_state = null; } else {
      this.user_set_state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_money = null; } else {
      this.refund_money = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_times = null; } else {
      this.refund_times = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_refund_time = null; } else {
      this.last_refund_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_quantity = null; } else {
      this.refund_quantity = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flight_tts_state = null; } else {
      this.flight_tts_state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flight_tts_order_id = null; } else {
      this.flight_tts_order_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flight_tts_bookurl = null; } else {
      this.flight_tts_bookurl = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flight_tts_oid = null; } else {
      this.flight_tts_oid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.red_envelope = null; } else {
      this.red_envelope = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.p_order_id = null; } else {
      this.p_order_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lock = null; } else {
      this.lock = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.type_id = null; } else {
      this.type_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.type = null; } else {
      this.type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.express_send_time = null; } else {
      this.express_send_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holiday_tts_info = null; } else {
      this.holiday_tts_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.holiday_tts_play_time = null; } else {
      this.holiday_tts_play_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_quick = null; } else {
      this.order_quick = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cancel_time = null; } else {
      this.cancel_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.other_tuan_info = null; } else {
      this.other_tuan_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.version = null; } else {
      this.version = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tppcode = null; } else {
      this.tppcode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.trace_url_info = null; } else {
      this.trace_url_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.reach_shop_time = null; } else {
      this.reach_shop_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.merchant_code = null; } else {
      this.merchant_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.other_tuan_state = null; } else {
      this.other_tuan_state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.vid = null; } else {
      this.vid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.pid = null; } else {
      this.pid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.uid = null; } else {
      this.uid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.gid = null; } else {
      this.gid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cid = null; } else {
      this.cid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.org = null; } else {
      this.org = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_version = null; } else {
      this.order_version = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cost_price = null; } else {
      this.cost_price = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.pay_id = null; } else {
      this.pay_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.buy_id = null; } else {
      this.buy_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.service = null; } else {
      this.service = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.admin_id = null; } else {
      this.admin_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.city_id = null; } else {
      this.city_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.card_id = null; } else {
      this.card_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.quantity = null; } else {
      this.quantity = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.realname = null; } else {
      this.realname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.mobile = null; } else {
      this.mobile = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.c_mobile = null; } else {
      this.c_mobile = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.zipcode = null; } else {
      this.zipcode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.express = null; } else {
      this.express = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.express_xx = null; } else {
      this.express_xx = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.express_id = null; } else {
      this.express_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.express_no = null; } else {
      this.express_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.price = null; } else {
      this.price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.money = null; } else {
      this.money = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.origin = null; } else {
      this.origin = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.credit = null; } else {
      this.credit = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.card = null; } else {
      this.card = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fare = null; } else {
      this.fare = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.condbuy = null; } else {
      this.condbuy = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.remark = null; } else {
      this.remark = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pay_time = null; } else {
      this.pay_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.comment_content = null; } else {
      this.comment_content = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.comment_display = null; } else {
      this.comment_display = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.comment_grade = null; } else {
      this.comment_grade = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.comment_time = null; } else {
      this.comment_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.partner_id = null; } else {
      this.partner_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sms_express = null; } else {
      this.sms_express = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.luky_id = null; } else {
      this.luky_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.order_type = null; } else {
      this.order_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.express_time = null; } else {
      this.express_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.express_note = null; } else {
      this.express_note = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.user_set_state = null; } else {
      this.user_set_state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_money = null; } else {
      this.refund_money = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_times = null; } else {
      this.refund_times = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_refund_time = null; } else {
      this.last_refund_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_quantity = null; } else {
      this.refund_quantity = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flight_tts_state = null; } else {
      this.flight_tts_state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flight_tts_order_id = null; } else {
      this.flight_tts_order_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flight_tts_bookurl = null; } else {
      this.flight_tts_bookurl = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flight_tts_oid = null; } else {
      this.flight_tts_oid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.red_envelope = null; } else {
      this.red_envelope = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.p_order_id = null; } else {
      this.p_order_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lock = null; } else {
      this.lock = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.type_id = null; } else {
      this.type_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.type = null; } else {
      this.type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.express_send_time = null; } else {
      this.express_send_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holiday_tts_info = null; } else {
      this.holiday_tts_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.holiday_tts_play_time = null; } else {
      this.holiday_tts_play_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_quick = null; } else {
      this.order_quick = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cancel_time = null; } else {
      this.cancel_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.other_tuan_info = null; } else {
      this.other_tuan_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.version = null; } else {
      this.version = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tppcode = null; } else {
      this.tppcode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.trace_url_info = null; } else {
      this.trace_url_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.reach_shop_time = null; } else {
      this.reach_shop_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.merchant_code = null; } else {
      this.merchant_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.other_tuan_state = null; } else {
      this.other_tuan_state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.vid = null; } else {
      this.vid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.pid = null; } else {
      this.pid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.uid = null; } else {
      this.uid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.gid = null; } else {
      this.gid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cid = null; } else {
      this.cid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.org = null; } else {
      this.org = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_version = null; } else {
      this.order_version = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cost_price = null; } else {
      this.cost_price = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    order o = (order) super.clone();
    o.express_send_time = (o.express_send_time != null) ? (java.sql.Timestamp) o.express_send_time.clone() : null;
    o.holiday_tts_play_time = (o.holiday_tts_play_time != null) ? (java.sql.Timestamp) o.holiday_tts_play_time.clone() : null;
    o.order_version = (o.order_version != null) ? (java.sql.Timestamp) o.order_version.clone() : null;
    return o;
  }

  public void clone0(order o) throws CloneNotSupportedException {
    o.express_send_time = (o.express_send_time != null) ? (java.sql.Timestamp) o.express_send_time.clone() : null;
    o.holiday_tts_play_time = (o.holiday_tts_play_time != null) ? (java.sql.Timestamp) o.holiday_tts_play_time.clone() : null;
    o.order_version = (o.order_version != null) ? (java.sql.Timestamp) o.order_version.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("pay_id", this.pay_id);
    __sqoop$field_map.put("buy_id", this.buy_id);
    __sqoop$field_map.put("service", this.service);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("admin_id", this.admin_id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("city_id", this.city_id);
    __sqoop$field_map.put("card_id", this.card_id);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("quantity", this.quantity);
    __sqoop$field_map.put("realname", this.realname);
    __sqoop$field_map.put("mobile", this.mobile);
    __sqoop$field_map.put("c_mobile", this.c_mobile);
    __sqoop$field_map.put("zipcode", this.zipcode);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("express", this.express);
    __sqoop$field_map.put("express_xx", this.express_xx);
    __sqoop$field_map.put("express_id", this.express_id);
    __sqoop$field_map.put("express_no", this.express_no);
    __sqoop$field_map.put("price", this.price);
    __sqoop$field_map.put("money", this.money);
    __sqoop$field_map.put("origin", this.origin);
    __sqoop$field_map.put("credit", this.credit);
    __sqoop$field_map.put("card", this.card);
    __sqoop$field_map.put("fare", this.fare);
    __sqoop$field_map.put("condbuy", this.condbuy);
    __sqoop$field_map.put("remark", this.remark);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("pay_time", this.pay_time);
    __sqoop$field_map.put("comment_content", this.comment_content);
    __sqoop$field_map.put("comment_display", this.comment_display);
    __sqoop$field_map.put("comment_grade", this.comment_grade);
    __sqoop$field_map.put("comment_time", this.comment_time);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("sms_express", this.sms_express);
    __sqoop$field_map.put("luky_id", this.luky_id);
    __sqoop$field_map.put("order_type", this.order_type);
    __sqoop$field_map.put("express_time", this.express_time);
    __sqoop$field_map.put("express_note", this.express_note);
    __sqoop$field_map.put("user_set_state", this.user_set_state);
    __sqoop$field_map.put("refund_money", this.refund_money);
    __sqoop$field_map.put("refund_times", this.refund_times);
    __sqoop$field_map.put("last_refund_time", this.last_refund_time);
    __sqoop$field_map.put("refund_quantity", this.refund_quantity);
    __sqoop$field_map.put("flight_tts_state", this.flight_tts_state);
    __sqoop$field_map.put("flight_tts_order_id", this.flight_tts_order_id);
    __sqoop$field_map.put("flight_tts_bookurl", this.flight_tts_bookurl);
    __sqoop$field_map.put("flight_tts_oid", this.flight_tts_oid);
    __sqoop$field_map.put("red_envelope", this.red_envelope);
    __sqoop$field_map.put("p_order_id", this.p_order_id);
    __sqoop$field_map.put("lock", this.lock);
    __sqoop$field_map.put("type_id", this.type_id);
    __sqoop$field_map.put("type", this.type);
    __sqoop$field_map.put("express_send_time", this.express_send_time);
    __sqoop$field_map.put("holiday_tts_info", this.holiday_tts_info);
    __sqoop$field_map.put("holiday_tts_play_time", this.holiday_tts_play_time);
    __sqoop$field_map.put("order_quick", this.order_quick);
    __sqoop$field_map.put("cancel_time", this.cancel_time);
    __sqoop$field_map.put("other_tuan_info", this.other_tuan_info);
    __sqoop$field_map.put("version", this.version);
    __sqoop$field_map.put("tppcode", this.tppcode);
    __sqoop$field_map.put("trace_url_info", this.trace_url_info);
    __sqoop$field_map.put("reach_shop_time", this.reach_shop_time);
    __sqoop$field_map.put("merchant_code", this.merchant_code);
    __sqoop$field_map.put("other_tuan_state", this.other_tuan_state);
    __sqoop$field_map.put("vid", this.vid);
    __sqoop$field_map.put("pid", this.pid);
    __sqoop$field_map.put("uid", this.uid);
    __sqoop$field_map.put("gid", this.gid);
    __sqoop$field_map.put("cid", this.cid);
    __sqoop$field_map.put("org", this.org);
    __sqoop$field_map.put("order_version", this.order_version);
    __sqoop$field_map.put("cost_price", this.cost_price);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("pay_id", this.pay_id);
    __sqoop$field_map.put("buy_id", this.buy_id);
    __sqoop$field_map.put("service", this.service);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("admin_id", this.admin_id);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("city_id", this.city_id);
    __sqoop$field_map.put("card_id", this.card_id);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("quantity", this.quantity);
    __sqoop$field_map.put("realname", this.realname);
    __sqoop$field_map.put("mobile", this.mobile);
    __sqoop$field_map.put("c_mobile", this.c_mobile);
    __sqoop$field_map.put("zipcode", this.zipcode);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("express", this.express);
    __sqoop$field_map.put("express_xx", this.express_xx);
    __sqoop$field_map.put("express_id", this.express_id);
    __sqoop$field_map.put("express_no", this.express_no);
    __sqoop$field_map.put("price", this.price);
    __sqoop$field_map.put("money", this.money);
    __sqoop$field_map.put("origin", this.origin);
    __sqoop$field_map.put("credit", this.credit);
    __sqoop$field_map.put("card", this.card);
    __sqoop$field_map.put("fare", this.fare);
    __sqoop$field_map.put("condbuy", this.condbuy);
    __sqoop$field_map.put("remark", this.remark);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("pay_time", this.pay_time);
    __sqoop$field_map.put("comment_content", this.comment_content);
    __sqoop$field_map.put("comment_display", this.comment_display);
    __sqoop$field_map.put("comment_grade", this.comment_grade);
    __sqoop$field_map.put("comment_time", this.comment_time);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("sms_express", this.sms_express);
    __sqoop$field_map.put("luky_id", this.luky_id);
    __sqoop$field_map.put("order_type", this.order_type);
    __sqoop$field_map.put("express_time", this.express_time);
    __sqoop$field_map.put("express_note", this.express_note);
    __sqoop$field_map.put("user_set_state", this.user_set_state);
    __sqoop$field_map.put("refund_money", this.refund_money);
    __sqoop$field_map.put("refund_times", this.refund_times);
    __sqoop$field_map.put("last_refund_time", this.last_refund_time);
    __sqoop$field_map.put("refund_quantity", this.refund_quantity);
    __sqoop$field_map.put("flight_tts_state", this.flight_tts_state);
    __sqoop$field_map.put("flight_tts_order_id", this.flight_tts_order_id);
    __sqoop$field_map.put("flight_tts_bookurl", this.flight_tts_bookurl);
    __sqoop$field_map.put("flight_tts_oid", this.flight_tts_oid);
    __sqoop$field_map.put("red_envelope", this.red_envelope);
    __sqoop$field_map.put("p_order_id", this.p_order_id);
    __sqoop$field_map.put("lock", this.lock);
    __sqoop$field_map.put("type_id", this.type_id);
    __sqoop$field_map.put("type", this.type);
    __sqoop$field_map.put("express_send_time", this.express_send_time);
    __sqoop$field_map.put("holiday_tts_info", this.holiday_tts_info);
    __sqoop$field_map.put("holiday_tts_play_time", this.holiday_tts_play_time);
    __sqoop$field_map.put("order_quick", this.order_quick);
    __sqoop$field_map.put("cancel_time", this.cancel_time);
    __sqoop$field_map.put("other_tuan_info", this.other_tuan_info);
    __sqoop$field_map.put("version", this.version);
    __sqoop$field_map.put("tppcode", this.tppcode);
    __sqoop$field_map.put("trace_url_info", this.trace_url_info);
    __sqoop$field_map.put("reach_shop_time", this.reach_shop_time);
    __sqoop$field_map.put("merchant_code", this.merchant_code);
    __sqoop$field_map.put("other_tuan_state", this.other_tuan_state);
    __sqoop$field_map.put("vid", this.vid);
    __sqoop$field_map.put("pid", this.pid);
    __sqoop$field_map.put("uid", this.uid);
    __sqoop$field_map.put("gid", this.gid);
    __sqoop$field_map.put("cid", this.cid);
    __sqoop$field_map.put("org", this.org);
    __sqoop$field_map.put("order_version", this.order_version);
    __sqoop$field_map.put("cost_price", this.cost_price);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Long) __fieldVal;
    }
    else    if ("pay_id".equals(__fieldName)) {
      this.pay_id = (String) __fieldVal;
    }
    else    if ("buy_id".equals(__fieldName)) {
      this.buy_id = (Long) __fieldVal;
    }
    else    if ("service".equals(__fieldName)) {
      this.service = (String) __fieldVal;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Long) __fieldVal;
    }
    else    if ("admin_id".equals(__fieldName)) {
      this.admin_id = (Long) __fieldVal;
    }
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Long) __fieldVal;
    }
    else    if ("city_id".equals(__fieldName)) {
      this.city_id = (Long) __fieldVal;
    }
    else    if ("card_id".equals(__fieldName)) {
      this.card_id = (String) __fieldVal;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
    }
    else    if ("quantity".equals(__fieldName)) {
      this.quantity = (Long) __fieldVal;
    }
    else    if ("realname".equals(__fieldName)) {
      this.realname = (String) __fieldVal;
    }
    else    if ("mobile".equals(__fieldName)) {
      this.mobile = (String) __fieldVal;
    }
    else    if ("c_mobile".equals(__fieldName)) {
      this.c_mobile = (String) __fieldVal;
    }
    else    if ("zipcode".equals(__fieldName)) {
      this.zipcode = (String) __fieldVal;
    }
    else    if ("address".equals(__fieldName)) {
      this.address = (String) __fieldVal;
    }
    else    if ("express".equals(__fieldName)) {
      this.express = (String) __fieldVal;
    }
    else    if ("express_xx".equals(__fieldName)) {
      this.express_xx = (String) __fieldVal;
    }
    else    if ("express_id".equals(__fieldName)) {
      this.express_id = (Long) __fieldVal;
    }
    else    if ("express_no".equals(__fieldName)) {
      this.express_no = (String) __fieldVal;
    }
    else    if ("price".equals(__fieldName)) {
      this.price = (Float) __fieldVal;
    }
    else    if ("money".equals(__fieldName)) {
      this.money = (Float) __fieldVal;
    }
    else    if ("origin".equals(__fieldName)) {
      this.origin = (Float) __fieldVal;
    }
    else    if ("credit".equals(__fieldName)) {
      this.credit = (Float) __fieldVal;
    }
    else    if ("card".equals(__fieldName)) {
      this.card = (Float) __fieldVal;
    }
    else    if ("fare".equals(__fieldName)) {
      this.fare = (Float) __fieldVal;
    }
    else    if ("condbuy".equals(__fieldName)) {
      this.condbuy = (String) __fieldVal;
    }
    else    if ("remark".equals(__fieldName)) {
      this.remark = (String) __fieldVal;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (Long) __fieldVal;
    }
    else    if ("pay_time".equals(__fieldName)) {
      this.pay_time = (Long) __fieldVal;
    }
    else    if ("comment_content".equals(__fieldName)) {
      this.comment_content = (String) __fieldVal;
    }
    else    if ("comment_display".equals(__fieldName)) {
      this.comment_display = (String) __fieldVal;
    }
    else    if ("comment_grade".equals(__fieldName)) {
      this.comment_grade = (String) __fieldVal;
    }
    else    if ("comment_time".equals(__fieldName)) {
      this.comment_time = (Long) __fieldVal;
    }
    else    if ("partner_id".equals(__fieldName)) {
      this.partner_id = (Long) __fieldVal;
    }
    else    if ("sms_express".equals(__fieldName)) {
      this.sms_express = (String) __fieldVal;
    }
    else    if ("luky_id".equals(__fieldName)) {
      this.luky_id = (Long) __fieldVal;
    }
    else    if ("order_type".equals(__fieldName)) {
      this.order_type = (String) __fieldVal;
    }
    else    if ("express_time".equals(__fieldName)) {
      this.express_time = (Long) __fieldVal;
    }
    else    if ("express_note".equals(__fieldName)) {
      this.express_note = (String) __fieldVal;
    }
    else    if ("user_set_state".equals(__fieldName)) {
      this.user_set_state = (String) __fieldVal;
    }
    else    if ("refund_money".equals(__fieldName)) {
      this.refund_money = (Float) __fieldVal;
    }
    else    if ("refund_times".equals(__fieldName)) {
      this.refund_times = (Integer) __fieldVal;
    }
    else    if ("last_refund_time".equals(__fieldName)) {
      this.last_refund_time = (Long) __fieldVal;
    }
    else    if ("refund_quantity".equals(__fieldName)) {
      this.refund_quantity = (Long) __fieldVal;
    }
    else    if ("flight_tts_state".equals(__fieldName)) {
      this.flight_tts_state = (String) __fieldVal;
    }
    else    if ("flight_tts_order_id".equals(__fieldName)) {
      this.flight_tts_order_id = (String) __fieldVal;
    }
    else    if ("flight_tts_bookurl".equals(__fieldName)) {
      this.flight_tts_bookurl = (String) __fieldVal;
    }
    else    if ("flight_tts_oid".equals(__fieldName)) {
      this.flight_tts_oid = (String) __fieldVal;
    }
    else    if ("red_envelope".equals(__fieldName)) {
      this.red_envelope = (Long) __fieldVal;
    }
    else    if ("p_order_id".equals(__fieldName)) {
      this.p_order_id = (Long) __fieldVal;
    }
    else    if ("lock".equals(__fieldName)) {
      this.lock = (Integer) __fieldVal;
    }
    else    if ("type_id".equals(__fieldName)) {
      this.type_id = (Long) __fieldVal;
    }
    else    if ("type".equals(__fieldName)) {
      this.type = (String) __fieldVal;
    }
    else    if ("express_send_time".equals(__fieldName)) {
      this.express_send_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("holiday_tts_info".equals(__fieldName)) {
      this.holiday_tts_info = (String) __fieldVal;
    }
    else    if ("holiday_tts_play_time".equals(__fieldName)) {
      this.holiday_tts_play_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("order_quick".equals(__fieldName)) {
      this.order_quick = (Integer) __fieldVal;
    }
    else    if ("cancel_time".equals(__fieldName)) {
      this.cancel_time = (Long) __fieldVal;
    }
    else    if ("other_tuan_info".equals(__fieldName)) {
      this.other_tuan_info = (String) __fieldVal;
    }
    else    if ("version".equals(__fieldName)) {
      this.version = (Long) __fieldVal;
    }
    else    if ("tppcode".equals(__fieldName)) {
      this.tppcode = (String) __fieldVal;
    }
    else    if ("trace_url_info".equals(__fieldName)) {
      this.trace_url_info = (String) __fieldVal;
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
    else    if ("vid".equals(__fieldName)) {
      this.vid = (String) __fieldVal;
    }
    else    if ("pid".equals(__fieldName)) {
      this.pid = (String) __fieldVal;
    }
    else    if ("uid".equals(__fieldName)) {
      this.uid = (String) __fieldVal;
    }
    else    if ("gid".equals(__fieldName)) {
      this.gid = (String) __fieldVal;
    }
    else    if ("cid".equals(__fieldName)) {
      this.cid = (String) __fieldVal;
    }
    else    if ("org".equals(__fieldName)) {
      this.org = (String) __fieldVal;
    }
    else    if ("order_version".equals(__fieldName)) {
      this.order_version = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("cost_price".equals(__fieldName)) {
      this.cost_price = (java.math.BigDecimal) __fieldVal;
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
    else    if ("pay_id".equals(__fieldName)) {
      this.pay_id = (String) __fieldVal;
      return true;
    }
    else    if ("buy_id".equals(__fieldName)) {
      this.buy_id = (Long) __fieldVal;
      return true;
    }
    else    if ("service".equals(__fieldName)) {
      this.service = (String) __fieldVal;
      return true;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Long) __fieldVal;
      return true;
    }
    else    if ("admin_id".equals(__fieldName)) {
      this.admin_id = (Long) __fieldVal;
      return true;
    }
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Long) __fieldVal;
      return true;
    }
    else    if ("city_id".equals(__fieldName)) {
      this.city_id = (Long) __fieldVal;
      return true;
    }
    else    if ("card_id".equals(__fieldName)) {
      this.card_id = (String) __fieldVal;
      return true;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
      return true;
    }
    else    if ("quantity".equals(__fieldName)) {
      this.quantity = (Long) __fieldVal;
      return true;
    }
    else    if ("realname".equals(__fieldName)) {
      this.realname = (String) __fieldVal;
      return true;
    }
    else    if ("mobile".equals(__fieldName)) {
      this.mobile = (String) __fieldVal;
      return true;
    }
    else    if ("c_mobile".equals(__fieldName)) {
      this.c_mobile = (String) __fieldVal;
      return true;
    }
    else    if ("zipcode".equals(__fieldName)) {
      this.zipcode = (String) __fieldVal;
      return true;
    }
    else    if ("address".equals(__fieldName)) {
      this.address = (String) __fieldVal;
      return true;
    }
    else    if ("express".equals(__fieldName)) {
      this.express = (String) __fieldVal;
      return true;
    }
    else    if ("express_xx".equals(__fieldName)) {
      this.express_xx = (String) __fieldVal;
      return true;
    }
    else    if ("express_id".equals(__fieldName)) {
      this.express_id = (Long) __fieldVal;
      return true;
    }
    else    if ("express_no".equals(__fieldName)) {
      this.express_no = (String) __fieldVal;
      return true;
    }
    else    if ("price".equals(__fieldName)) {
      this.price = (Float) __fieldVal;
      return true;
    }
    else    if ("money".equals(__fieldName)) {
      this.money = (Float) __fieldVal;
      return true;
    }
    else    if ("origin".equals(__fieldName)) {
      this.origin = (Float) __fieldVal;
      return true;
    }
    else    if ("credit".equals(__fieldName)) {
      this.credit = (Float) __fieldVal;
      return true;
    }
    else    if ("card".equals(__fieldName)) {
      this.card = (Float) __fieldVal;
      return true;
    }
    else    if ("fare".equals(__fieldName)) {
      this.fare = (Float) __fieldVal;
      return true;
    }
    else    if ("condbuy".equals(__fieldName)) {
      this.condbuy = (String) __fieldVal;
      return true;
    }
    else    if ("remark".equals(__fieldName)) {
      this.remark = (String) __fieldVal;
      return true;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (Long) __fieldVal;
      return true;
    }
    else    if ("pay_time".equals(__fieldName)) {
      this.pay_time = (Long) __fieldVal;
      return true;
    }
    else    if ("comment_content".equals(__fieldName)) {
      this.comment_content = (String) __fieldVal;
      return true;
    }
    else    if ("comment_display".equals(__fieldName)) {
      this.comment_display = (String) __fieldVal;
      return true;
    }
    else    if ("comment_grade".equals(__fieldName)) {
      this.comment_grade = (String) __fieldVal;
      return true;
    }
    else    if ("comment_time".equals(__fieldName)) {
      this.comment_time = (Long) __fieldVal;
      return true;
    }
    else    if ("partner_id".equals(__fieldName)) {
      this.partner_id = (Long) __fieldVal;
      return true;
    }
    else    if ("sms_express".equals(__fieldName)) {
      this.sms_express = (String) __fieldVal;
      return true;
    }
    else    if ("luky_id".equals(__fieldName)) {
      this.luky_id = (Long) __fieldVal;
      return true;
    }
    else    if ("order_type".equals(__fieldName)) {
      this.order_type = (String) __fieldVal;
      return true;
    }
    else    if ("express_time".equals(__fieldName)) {
      this.express_time = (Long) __fieldVal;
      return true;
    }
    else    if ("express_note".equals(__fieldName)) {
      this.express_note = (String) __fieldVal;
      return true;
    }
    else    if ("user_set_state".equals(__fieldName)) {
      this.user_set_state = (String) __fieldVal;
      return true;
    }
    else    if ("refund_money".equals(__fieldName)) {
      this.refund_money = (Float) __fieldVal;
      return true;
    }
    else    if ("refund_times".equals(__fieldName)) {
      this.refund_times = (Integer) __fieldVal;
      return true;
    }
    else    if ("last_refund_time".equals(__fieldName)) {
      this.last_refund_time = (Long) __fieldVal;
      return true;
    }
    else    if ("refund_quantity".equals(__fieldName)) {
      this.refund_quantity = (Long) __fieldVal;
      return true;
    }
    else    if ("flight_tts_state".equals(__fieldName)) {
      this.flight_tts_state = (String) __fieldVal;
      return true;
    }
    else    if ("flight_tts_order_id".equals(__fieldName)) {
      this.flight_tts_order_id = (String) __fieldVal;
      return true;
    }
    else    if ("flight_tts_bookurl".equals(__fieldName)) {
      this.flight_tts_bookurl = (String) __fieldVal;
      return true;
    }
    else    if ("flight_tts_oid".equals(__fieldName)) {
      this.flight_tts_oid = (String) __fieldVal;
      return true;
    }
    else    if ("red_envelope".equals(__fieldName)) {
      this.red_envelope = (Long) __fieldVal;
      return true;
    }
    else    if ("p_order_id".equals(__fieldName)) {
      this.p_order_id = (Long) __fieldVal;
      return true;
    }
    else    if ("lock".equals(__fieldName)) {
      this.lock = (Integer) __fieldVal;
      return true;
    }
    else    if ("type_id".equals(__fieldName)) {
      this.type_id = (Long) __fieldVal;
      return true;
    }
    else    if ("type".equals(__fieldName)) {
      this.type = (String) __fieldVal;
      return true;
    }
    else    if ("express_send_time".equals(__fieldName)) {
      this.express_send_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("holiday_tts_info".equals(__fieldName)) {
      this.holiday_tts_info = (String) __fieldVal;
      return true;
    }
    else    if ("holiday_tts_play_time".equals(__fieldName)) {
      this.holiday_tts_play_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("order_quick".equals(__fieldName)) {
      this.order_quick = (Integer) __fieldVal;
      return true;
    }
    else    if ("cancel_time".equals(__fieldName)) {
      this.cancel_time = (Long) __fieldVal;
      return true;
    }
    else    if ("other_tuan_info".equals(__fieldName)) {
      this.other_tuan_info = (String) __fieldVal;
      return true;
    }
    else    if ("version".equals(__fieldName)) {
      this.version = (Long) __fieldVal;
      return true;
    }
    else    if ("tppcode".equals(__fieldName)) {
      this.tppcode = (String) __fieldVal;
      return true;
    }
    else    if ("trace_url_info".equals(__fieldName)) {
      this.trace_url_info = (String) __fieldVal;
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
    else    if ("vid".equals(__fieldName)) {
      this.vid = (String) __fieldVal;
      return true;
    }
    else    if ("pid".equals(__fieldName)) {
      this.pid = (String) __fieldVal;
      return true;
    }
    else    if ("uid".equals(__fieldName)) {
      this.uid = (String) __fieldVal;
      return true;
    }
    else    if ("gid".equals(__fieldName)) {
      this.gid = (String) __fieldVal;
      return true;
    }
    else    if ("cid".equals(__fieldName)) {
      this.cid = (String) __fieldVal;
      return true;
    }
    else    if ("org".equals(__fieldName)) {
      this.org = (String) __fieldVal;
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
    else {
      return false;    }
  }
}
