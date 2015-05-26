// ORM class for table 'team'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Nov 17 14:10:33 CST 2014
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

public class team extends SqoopRecord  implements DBWritable, Writable {
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
  public team with_id(Long id) {
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
  public team with_user_id(Long user_id) {
    this.user_id = user_id;
    return this;
  }
  private String title;
  public String get_title() {
    return title;
  }
  public void set_title(String title) {
    this.title = title;
  }
  public team with_title(String title) {
    this.title = title;
    return this;
  }
  private String summary;
  public String get_summary() {
    return summary;
  }
  public void set_summary(String summary) {
    this.summary = summary;
  }
  public team with_summary(String summary) {
    this.summary = summary;
    return this;
  }
  private Long city_id;
  public Long get_city_id() {
    return city_id;
  }
  public void set_city_id(Long city_id) {
    this.city_id = city_id;
  }
  public team with_city_id(Long city_id) {
    this.city_id = city_id;
    return this;
  }
  private Long group_id;
  public Long get_group_id() {
    return group_id;
  }
  public void set_group_id(Long group_id) {
    this.group_id = group_id;
  }
  public team with_group_id(Long group_id) {
    this.group_id = group_id;
    return this;
  }
  private Long partner_id;
  public Long get_partner_id() {
    return partner_id;
  }
  public void set_partner_id(Long partner_id) {
    this.partner_id = partner_id;
  }
  public team with_partner_id(Long partner_id) {
    this.partner_id = partner_id;
    return this;
  }
  private String system;
  public String get_system() {
    return system;
  }
  public void set_system(String system) {
    this.system = system;
  }
  public team with_system(String system) {
    this.system = system;
    return this;
  }
  private Float team_price;
  public Float get_team_price() {
    return team_price;
  }
  public void set_team_price(Float team_price) {
    this.team_price = team_price;
  }
  public team with_team_price(Float team_price) {
    this.team_price = team_price;
    return this;
  }
  private Float market_price;
  public Float get_market_price() {
    return market_price;
  }
  public void set_market_price(Float market_price) {
    this.market_price = market_price;
  }
  public team with_market_price(Float market_price) {
    this.market_price = market_price;
    return this;
  }
  private String product;
  public String get_product() {
    return product;
  }
  public void set_product(String product) {
    this.product = product;
  }
  public team with_product(String product) {
    this.product = product;
    return this;
  }
  private String condbuy;
  public String get_condbuy() {
    return condbuy;
  }
  public void set_condbuy(String condbuy) {
    this.condbuy = condbuy;
  }
  public team with_condbuy(String condbuy) {
    this.condbuy = condbuy;
    return this;
  }
  private Long per_number;
  public Long get_per_number() {
    return per_number;
  }
  public void set_per_number(Long per_number) {
    this.per_number = per_number;
  }
  public team with_per_number(Long per_number) {
    this.per_number = per_number;
    return this;
  }
  private Long min_number;
  public Long get_min_number() {
    return min_number;
  }
  public void set_min_number(Long min_number) {
    this.min_number = min_number;
  }
  public team with_min_number(Long min_number) {
    this.min_number = min_number;
    return this;
  }
  private Long max_number;
  public Long get_max_number() {
    return max_number;
  }
  public void set_max_number(Long max_number) {
    this.max_number = max_number;
  }
  public team with_max_number(Long max_number) {
    this.max_number = max_number;
    return this;
  }
  private Long now_number;
  public Long get_now_number() {
    return now_number;
  }
  public void set_now_number(Long now_number) {
    this.now_number = now_number;
  }
  public team with_now_number(Long now_number) {
    this.now_number = now_number;
    return this;
  }
  private Long pre_number;
  public Long get_pre_number() {
    return pre_number;
  }
  public void set_pre_number(Long pre_number) {
    this.pre_number = pre_number;
  }
  public team with_pre_number(Long pre_number) {
    this.pre_number = pre_number;
    return this;
  }
  private String image;
  public String get_image() {
    return image;
  }
  public void set_image(String image) {
    this.image = image;
  }
  public team with_image(String image) {
    this.image = image;
    return this;
  }
  private String image1;
  public String get_image1() {
    return image1;
  }
  public void set_image1(String image1) {
    this.image1 = image1;
  }
  public team with_image1(String image1) {
    this.image1 = image1;
    return this;
  }
  private String image2;
  public String get_image2() {
    return image2;
  }
  public void set_image2(String image2) {
    this.image2 = image2;
  }
  public team with_image2(String image2) {
    this.image2 = image2;
    return this;
  }
  private String flv;
  public String get_flv() {
    return flv;
  }
  public void set_flv(String flv) {
    this.flv = flv;
  }
  public team with_flv(String flv) {
    this.flv = flv;
    return this;
  }
  private String mobile;
  public String get_mobile() {
    return mobile;
  }
  public void set_mobile(String mobile) {
    this.mobile = mobile;
  }
  public team with_mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }
  private Long credit;
  public Long get_credit() {
    return credit;
  }
  public void set_credit(Long credit) {
    this.credit = credit;
  }
  public team with_credit(Long credit) {
    this.credit = credit;
    return this;
  }
  private Long card;
  public Long get_card() {
    return card;
  }
  public void set_card(Long card) {
    this.card = card;
  }
  public team with_card(Long card) {
    this.card = card;
    return this;
  }
  private Long fare;
  public Long get_fare() {
    return fare;
  }
  public void set_fare(Long fare) {
    this.fare = fare;
  }
  public team with_fare(Long fare) {
    this.fare = fare;
    return this;
  }
  private Long farefree;
  public Long get_farefree() {
    return farefree;
  }
  public void set_farefree(Long farefree) {
    this.farefree = farefree;
  }
  public team with_farefree(Long farefree) {
    this.farefree = farefree;
    return this;
  }
  private Long bonus;
  public Long get_bonus() {
    return bonus;
  }
  public void set_bonus(Long bonus) {
    this.bonus = bonus;
  }
  public team with_bonus(Long bonus) {
    this.bonus = bonus;
    return this;
  }
  private String address;
  public String get_address() {
    return address;
  }
  public void set_address(String address) {
    this.address = address;
  }
  public team with_address(String address) {
    this.address = address;
    return this;
  }
  private String detail;
  public String get_detail() {
    return detail;
  }
  public void set_detail(String detail) {
    this.detail = detail;
  }
  public team with_detail(String detail) {
    this.detail = detail;
    return this;
  }
  private String systemreview;
  public String get_systemreview() {
    return systemreview;
  }
  public void set_systemreview(String systemreview) {
    this.systemreview = systemreview;
  }
  public team with_systemreview(String systemreview) {
    this.systemreview = systemreview;
    return this;
  }
  private String userreview;
  public String get_userreview() {
    return userreview;
  }
  public void set_userreview(String userreview) {
    this.userreview = userreview;
  }
  public team with_userreview(String userreview) {
    this.userreview = userreview;
    return this;
  }
  private String notice;
  public String get_notice() {
    return notice;
  }
  public void set_notice(String notice) {
    this.notice = notice;
  }
  public team with_notice(String notice) {
    this.notice = notice;
    return this;
  }
  private String express;
  public String get_express() {
    return express;
  }
  public void set_express(String express) {
    this.express = express;
  }
  public team with_express(String express) {
    this.express = express;
    return this;
  }
  private String delivery;
  public String get_delivery() {
    return delivery;
  }
  public void set_delivery(String delivery) {
    this.delivery = delivery;
  }
  public team with_delivery(String delivery) {
    this.delivery = delivery;
    return this;
  }
  private String state;
  public String get_state() {
    return state;
  }
  public void set_state(String state) {
    this.state = state;
  }
  public team with_state(String state) {
    this.state = state;
    return this;
  }
  private String conduser;
  public String get_conduser() {
    return conduser;
  }
  public void set_conduser(String conduser) {
    this.conduser = conduser;
  }
  public team with_conduser(String conduser) {
    this.conduser = conduser;
    return this;
  }
  private String buyonce;
  public String get_buyonce() {
    return buyonce;
  }
  public void set_buyonce(String buyonce) {
    this.buyonce = buyonce;
  }
  public team with_buyonce(String buyonce) {
    this.buyonce = buyonce;
    return this;
  }
  private String team_type;
  public String get_team_type() {
    return team_type;
  }
  public void set_team_type(String team_type) {
    this.team_type = team_type;
  }
  public team with_team_type(String team_type) {
    this.team_type = team_type;
    return this;
  }
  private Long sort_order;
  public Long get_sort_order() {
    return sort_order;
  }
  public void set_sort_order(Long sort_order) {
    this.sort_order = sort_order;
  }
  public team with_sort_order(Long sort_order) {
    this.sort_order = sort_order;
    return this;
  }
  private Long expire_time;
  public Long get_expire_time() {
    return expire_time;
  }
  public void set_expire_time(Long expire_time) {
    this.expire_time = expire_time;
  }
  public team with_expire_time(Long expire_time) {
    this.expire_time = expire_time;
    return this;
  }
  private Long begin_time;
  public Long get_begin_time() {
    return begin_time;
  }
  public void set_begin_time(Long begin_time) {
    this.begin_time = begin_time;
  }
  public team with_begin_time(Long begin_time) {
    this.begin_time = begin_time;
    return this;
  }
  private Long end_time;
  public Long get_end_time() {
    return end_time;
  }
  public void set_end_time(Long end_time) {
    this.end_time = end_time;
  }
  public team with_end_time(Long end_time) {
    this.end_time = end_time;
    return this;
  }
  private Long reach_time;
  public Long get_reach_time() {
    return reach_time;
  }
  public void set_reach_time(Long reach_time) {
    this.reach_time = reach_time;
  }
  public team with_reach_time(Long reach_time) {
    this.reach_time = reach_time;
    return this;
  }
  private Long close_time;
  public Long get_close_time() {
    return close_time;
  }
  public void set_close_time(Long close_time) {
    this.close_time = close_time;
  }
  public team with_close_time(Long close_time) {
    this.close_time = close_time;
    return this;
  }
  private String seo_title;
  public String get_seo_title() {
    return seo_title;
  }
  public void set_seo_title(String seo_title) {
    this.seo_title = seo_title;
  }
  public team with_seo_title(String seo_title) {
    this.seo_title = seo_title;
    return this;
  }
  private String seo_keyword;
  public String get_seo_keyword() {
    return seo_keyword;
  }
  public void set_seo_keyword(String seo_keyword) {
    this.seo_keyword = seo_keyword;
  }
  public team with_seo_keyword(String seo_keyword) {
    this.seo_keyword = seo_keyword;
    return this;
  }
  private String seo_description;
  public String get_seo_description() {
    return seo_description;
  }
  public void set_seo_description(String seo_description) {
    this.seo_description = seo_description;
  }
  public team with_seo_description(String seo_description) {
    this.seo_description = seo_description;
    return this;
  }
  private String stitle;
  public String get_stitle() {
    return stitle;
  }
  public void set_stitle(String stitle) {
    this.stitle = stitle;
  }
  public team with_stitle(String stitle) {
    this.stitle = stitle;
    return this;
  }
  private String sales;
  public String get_sales() {
    return sales;
  }
  public void set_sales(String sales) {
    this.sales = sales;
  }
  public team with_sales(String sales) {
    this.sales = sales;
    return this;
  }
  private String publish;
  public String get_publish() {
    return publish;
  }
  public void set_publish(String publish) {
    this.publish = publish;
  }
  public team with_publish(String publish) {
    this.publish = publish;
    return this;
  }
  private Long profit;
  public Long get_profit() {
    return profit;
  }
  public void set_profit(Long profit) {
    this.profit = profit;
  }
  public team with_profit(Long profit) {
    this.profit = profit;
    return this;
  }
  private String hotel_seq;
  public String get_hotel_seq() {
    return hotel_seq;
  }
  public void set_hotel_seq(String hotel_seq) {
    this.hotel_seq = hotel_seq;
  }
  public team with_hotel_seq(String hotel_seq) {
    this.hotel_seq = hotel_seq;
    return this;
  }
  private String order_type;
  public String get_order_type() {
    return order_type;
  }
  public void set_order_type(String order_type) {
    this.order_type = order_type;
  }
  public team with_order_type(String order_type) {
    this.order_type = order_type;
    return this;
  }
  private String hide_partner;
  public String get_hide_partner() {
    return hide_partner;
  }
  public void set_hide_partner(String hide_partner) {
    this.hide_partner = hide_partner;
  }
  public team with_hide_partner(String hide_partner) {
    this.hide_partner = hide_partner;
    return this;
  }
  private String departure;
  public String get_departure() {
    return departure;
  }
  public void set_departure(String departure) {
    this.departure = departure;
  }
  public team with_departure(String departure) {
    this.departure = departure;
    return this;
  }
  private String arrive;
  public String get_arrive() {
    return arrive;
  }
  public void set_arrive(String arrive) {
    this.arrive = arrive;
  }
  public team with_arrive(String arrive) {
    this.arrive = arrive;
    return this;
  }
  private String extra_sms;
  public String get_extra_sms() {
    return extra_sms;
  }
  public void set_extra_sms(String extra_sms) {
    this.extra_sms = extra_sms;
  }
  public team with_extra_sms(String extra_sms) {
    this.extra_sms = extra_sms;
    return this;
  }
  private String room_type;
  public String get_room_type() {
    return room_type;
  }
  public void set_room_type(String room_type) {
    this.room_type = room_type;
  }
  public team with_room_type(String room_type) {
    this.room_type = room_type;
    return this;
  }
  private String sort_tag;
  public String get_sort_tag() {
    return sort_tag;
  }
  public void set_sort_tag(String sort_tag) {
    this.sort_tag = sort_tag;
  }
  public team with_sort_tag(String sort_tag) {
    this.sort_tag = sort_tag;
    return this;
  }
  private Long check_in_time;
  public Long get_check_in_time() {
    return check_in_time;
  }
  public void set_check_in_time(Long check_in_time) {
    this.check_in_time = check_in_time;
  }
  public team with_check_in_time(Long check_in_time) {
    this.check_in_time = check_in_time;
    return this;
  }
  private String wireless_team_desc;
  public String get_wireless_team_desc() {
    return wireless_team_desc;
  }
  public void set_wireless_team_desc(String wireless_team_desc) {
    this.wireless_team_desc = wireless_team_desc;
  }
  public team with_wireless_team_desc(String wireless_team_desc) {
    this.wireless_team_desc = wireless_team_desc;
    return this;
  }
  private String wireless_special_notes;
  public String get_wireless_special_notes() {
    return wireless_special_notes;
  }
  public void set_wireless_special_notes(String wireless_special_notes) {
    this.wireless_special_notes = wireless_special_notes;
  }
  public team with_wireless_special_notes(String wireless_special_notes) {
    this.wireless_special_notes = wireless_special_notes;
    return this;
  }
  private String wireless_long_lat;
  public String get_wireless_long_lat() {
    return wireless_long_lat;
  }
  public void set_wireless_long_lat(String wireless_long_lat) {
    this.wireless_long_lat = wireless_long_lat;
  }
  public team with_wireless_long_lat(String wireless_long_lat) {
    this.wireless_long_lat = wireless_long_lat;
    return this;
  }
  private Float express_fee;
  public Float get_express_fee() {
    return express_fee;
  }
  public void set_express_fee(Float express_fee) {
    this.express_fee = express_fee;
  }
  public team with_express_fee(Float express_fee) {
    this.express_fee = express_fee;
    return this;
  }
  private String travel_days;
  public String get_travel_days() {
    return travel_days;
  }
  public void set_travel_days(String travel_days) {
    this.travel_days = travel_days;
  }
  public team with_travel_days(String travel_days) {
    this.travel_days = travel_days;
    return this;
  }
  private String travel_status;
  public String get_travel_status() {
    return travel_status;
  }
  public void set_travel_status(String travel_status) {
    this.travel_status = travel_status;
  }
  public team with_travel_status(String travel_status) {
    this.travel_status = travel_status;
    return this;
  }
  private Integer popularize;
  public Integer get_popularize() {
    return popularize;
  }
  public void set_popularize(Integer popularize) {
    this.popularize = popularize;
  }
  public team with_popularize(Integer popularize) {
    this.popularize = popularize;
    return this;
  }
  private Integer major_popularize;
  public Integer get_major_popularize() {
    return major_popularize;
  }
  public void set_major_popularize(Integer major_popularize) {
    this.major_popularize = major_popularize;
  }
  public team with_major_popularize(Integer major_popularize) {
    this.major_popularize = major_popularize;
    return this;
  }
  private Long have_popularize;
  public Long get_have_popularize() {
    return have_popularize;
  }
  public void set_have_popularize(Long have_popularize) {
    this.have_popularize = have_popularize;
  }
  public team with_have_popularize(Long have_popularize) {
    this.have_popularize = have_popularize;
    return this;
  }
  private String bannerimage;
  public String get_bannerimage() {
    return bannerimage;
  }
  public void set_bannerimage(String bannerimage) {
    this.bannerimage = bannerimage;
  }
  public team with_bannerimage(String bannerimage) {
    this.bannerimage = bannerimage;
    return this;
  }
  private Long earliest_start;
  public Long get_earliest_start() {
    return earliest_start;
  }
  public void set_earliest_start(Long earliest_start) {
    this.earliest_start = earliest_start;
  }
  public team with_earliest_start(Long earliest_start) {
    this.earliest_start = earliest_start;
    return this;
  }
  private String room_desc;
  public String get_room_desc() {
    return room_desc;
  }
  public void set_room_desc(String room_desc) {
    this.room_desc = room_desc;
  }
  public team with_room_desc(String room_desc) {
    this.room_desc = room_desc;
    return this;
  }
  private Float cost_price;
  public Float get_cost_price() {
    return cost_price;
  }
  public void set_cost_price(Float cost_price) {
    this.cost_price = cost_price;
  }
  public team with_cost_price(Float cost_price) {
    this.cost_price = cost_price;
    return this;
  }
  private Long red_envelope;
  public Long get_red_envelope() {
    return red_envelope;
  }
  public void set_red_envelope(Long red_envelope) {
    this.red_envelope = red_envelope;
  }
  public team with_red_envelope(Long red_envelope) {
    this.red_envelope = red_envelope;
    return this;
  }
  private Float team_price_high;
  public Float get_team_price_high() {
    return team_price_high;
  }
  public void set_team_price_high(Float team_price_high) {
    this.team_price_high = team_price_high;
  }
  public team with_team_price_high(Float team_price_high) {
    this.team_price_high = team_price_high;
    return this;
  }
  private Float market_price_high;
  public Float get_market_price_high() {
    return market_price_high;
  }
  public void set_market_price_high(Float market_price_high) {
    this.market_price_high = market_price_high;
  }
  public team with_market_price_high(Float market_price_high) {
    this.market_price_high = market_price_high;
    return this;
  }
  private String flight_max_discount;
  public String get_flight_max_discount() {
    return flight_max_discount;
  }
  public void set_flight_max_discount(String flight_max_discount) {
    this.flight_max_discount = flight_max_discount;
  }
  public team with_flight_max_discount(String flight_max_discount) {
    this.flight_max_discount = flight_max_discount;
    return this;
  }
  private String flight_max_save;
  public String get_flight_max_save() {
    return flight_max_save;
  }
  public void set_flight_max_save(String flight_max_save) {
    this.flight_max_save = flight_max_save;
  }
  public team with_flight_max_save(String flight_max_save) {
    this.flight_max_save = flight_max_save;
    return this;
  }
  private String hotel_type;
  public String get_hotel_type() {
    return hotel_type;
  }
  public void set_hotel_type(String hotel_type) {
    this.hotel_type = hotel_type;
  }
  public team with_hotel_type(String hotel_type) {
    this.hotel_type = hotel_type;
    return this;
  }
  private Integer voucher_val;
  public Integer get_voucher_val() {
    return voucher_val;
  }
  public void set_voucher_val(Integer voucher_val) {
    this.voucher_val = voucher_val;
  }
  public team with_voucher_val(Integer voucher_val) {
    this.voucher_val = voucher_val;
    return this;
  }
  private Integer travel_long;
  public Integer get_travel_long() {
    return travel_long;
  }
  public void set_travel_long(Integer travel_long) {
    this.travel_long = travel_long;
  }
  public team with_travel_long(Integer travel_long) {
    this.travel_long = travel_long;
    return this;
  }
  private Long p_team_id;
  public Long get_p_team_id() {
    return p_team_id;
  }
  public void set_p_team_id(Long p_team_id) {
    this.p_team_id = p_team_id;
  }
  public team with_p_team_id(Long p_team_id) {
    this.p_team_id = p_team_id;
    return this;
  }
  private String tuan_room_type;
  public String get_tuan_room_type() {
    return tuan_room_type;
  }
  public void set_tuan_room_type(String tuan_room_type) {
    this.tuan_room_type = tuan_room_type;
  }
  public team with_tuan_room_type(String tuan_room_type) {
    this.tuan_room_type = tuan_room_type;
    return this;
  }
  private String tuan_project_name;
  public String get_tuan_project_name() {
    return tuan_project_name;
  }
  public void set_tuan_project_name(String tuan_project_name) {
    this.tuan_project_name = tuan_project_name;
  }
  public team with_tuan_project_name(String tuan_project_name) {
    this.tuan_project_name = tuan_project_name;
    return this;
  }
  private String tuan_project_des;
  public String get_tuan_project_des() {
    return tuan_project_des;
  }
  public void set_tuan_project_des(String tuan_project_des) {
    this.tuan_project_des = tuan_project_des;
  }
  public team with_tuan_project_des(String tuan_project_des) {
    this.tuan_project_des = tuan_project_des;
    return this;
  }
  private String son_hotel_names;
  public String get_son_hotel_names() {
    return son_hotel_names;
  }
  public void set_son_hotel_names(String son_hotel_names) {
    this.son_hotel_names = son_hotel_names;
  }
  public team with_son_hotel_names(String son_hotel_names) {
    this.son_hotel_names = son_hotel_names;
    return this;
  }
  private String son_hotel_address;
  public String get_son_hotel_address() {
    return son_hotel_address;
  }
  public void set_son_hotel_address(String son_hotel_address) {
    this.son_hotel_address = son_hotel_address;
  }
  public team with_son_hotel_address(String son_hotel_address) {
    this.son_hotel_address = son_hotel_address;
    return this;
  }
  private Integer baojian_total;
  public Integer get_baojian_total() {
    return baojian_total;
  }
  public void set_baojian_total(Integer baojian_total) {
    this.baojian_total = baojian_total;
  }
  public team with_baojian_total(Integer baojian_total) {
    this.baojian_total = baojian_total;
    return this;
  }
  private String tips;
  public String get_tips() {
    return tips;
  }
  public void set_tips(String tips) {
    this.tips = tips;
  }
  public team with_tips(String tips) {
    this.tips = tips;
    return this;
  }
  private Long qqgid;
  public Long get_qqgid() {
    return qqgid;
  }
  public void set_qqgid(Long qqgid) {
    this.qqgid = qqgid;
  }
  public team with_qqgid(Long qqgid) {
    this.qqgid = qqgid;
    return this;
  }
  private String payment_method;
  public String get_payment_method() {
    return payment_method;
  }
  public void set_payment_method(String payment_method) {
    this.payment_method = payment_method;
  }
  public team with_payment_method(String payment_method) {
    this.payment_method = payment_method;
    return this;
  }
  private String payment_condition;
  public String get_payment_condition() {
    return payment_condition;
  }
  public void set_payment_condition(String payment_condition) {
    this.payment_condition = payment_condition;
  }
  public team with_payment_condition(String payment_condition) {
    this.payment_condition = payment_condition;
    return this;
  }
  private Integer through_coupon_total;
  public Integer get_through_coupon_total() {
    return through_coupon_total;
  }
  public void set_through_coupon_total(Integer through_coupon_total) {
    this.through_coupon_total = through_coupon_total;
  }
  public team with_through_coupon_total(Integer through_coupon_total) {
    this.through_coupon_total = through_coupon_total;
    return this;
  }
  private String subtitle;
  public String get_subtitle() {
    return subtitle;
  }
  public void set_subtitle(String subtitle) {
    this.subtitle = subtitle;
  }
  public team with_subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  private String leave_time;
  public String get_leave_time() {
    return leave_time;
  }
  public void set_leave_time(String leave_time) {
    this.leave_time = leave_time;
  }
  public team with_leave_time(String leave_time) {
    this.leave_time = leave_time;
    return this;
  }
  private Integer refund_support;
  public Integer get_refund_support() {
    return refund_support;
  }
  public void set_refund_support(Integer refund_support) {
    this.refund_support = refund_support;
  }
  public team with_refund_support(Integer refund_support) {
    this.refund_support = refund_support;
    return this;
  }
  private String traffic_desc;
  public String get_traffic_desc() {
    return traffic_desc;
  }
  public void set_traffic_desc(String traffic_desc) {
    this.traffic_desc = traffic_desc;
  }
  public team with_traffic_desc(String traffic_desc) {
    this.traffic_desc = traffic_desc;
    return this;
  }
  private String scenic_desc;
  public String get_scenic_desc() {
    return scenic_desc;
  }
  public void set_scenic_desc(String scenic_desc) {
    this.scenic_desc = scenic_desc;
  }
  public team with_scenic_desc(String scenic_desc) {
    this.scenic_desc = scenic_desc;
    return this;
  }
  private String money_use_detail;
  public String get_money_use_detail() {
    return money_use_detail;
  }
  public void set_money_use_detail(String money_use_detail) {
    this.money_use_detail = money_use_detail;
  }
  public team with_money_use_detail(String money_use_detail) {
    this.money_use_detail = money_use_detail;
    return this;
  }
  private String good_food;
  public String get_good_food() {
    return good_food;
  }
  public void set_good_food(String good_food) {
    this.good_food = good_food;
  }
  public team with_good_food(String good_food) {
    this.good_food = good_food;
    return this;
  }
  private String hotel_desc;
  public String get_hotel_desc() {
    return hotel_desc;
  }
  public void set_hotel_desc(String hotel_desc) {
    this.hotel_desc = hotel_desc;
  }
  public team with_hotel_desc(String hotel_desc) {
    this.hotel_desc = hotel_desc;
    return this;
  }
  private String hide_room_type;
  public String get_hide_room_type() {
    return hide_room_type;
  }
  public void set_hide_room_type(String hide_room_type) {
    this.hide_room_type = hide_room_type;
  }
  public team with_hide_room_type(String hide_room_type) {
    this.hide_room_type = hide_room_type;
    return this;
  }
  private String modeldisplay;
  public String get_modeldisplay() {
    return modeldisplay;
  }
  public void set_modeldisplay(String modeldisplay) {
    this.modeldisplay = modeldisplay;
  }
  public team with_modeldisplay(String modeldisplay) {
    this.modeldisplay = modeldisplay;
    return this;
  }
  private Boolean if_need_visa;
  public Boolean get_if_need_visa() {
    return if_need_visa;
  }
  public void set_if_need_visa(Boolean if_need_visa) {
    this.if_need_visa = if_need_visa;
  }
  public team with_if_need_visa(Boolean if_need_visa) {
    this.if_need_visa = if_need_visa;
    return this;
  }
  private String buy_tips;
  public String get_buy_tips() {
    return buy_tips;
  }
  public void set_buy_tips(String buy_tips) {
    this.buy_tips = buy_tips;
  }
  public team with_buy_tips(String buy_tips) {
    this.buy_tips = buy_tips;
    return this;
  }
  private Integer is_new_team;
  public Integer get_is_new_team() {
    return is_new_team;
  }
  public void set_is_new_team(Integer is_new_team) {
    this.is_new_team = is_new_team;
  }
  public team with_is_new_team(Integer is_new_team) {
    this.is_new_team = is_new_team;
    return this;
  }
  private String related_sight;
  public String get_related_sight() {
    return related_sight;
  }
  public void set_related_sight(String related_sight) {
    this.related_sight = related_sight;
  }
  public team with_related_sight(String related_sight) {
    this.related_sight = related_sight;
    return this;
  }
  private String publish_2dcode;
  public String get_publish_2dcode() {
    return publish_2dcode;
  }
  public void set_publish_2dcode(String publish_2dcode) {
    this.publish_2dcode = publish_2dcode;
  }
  public team with_publish_2dcode(String publish_2dcode) {
    this.publish_2dcode = publish_2dcode;
    return this;
  }
  private Long settlement_id;
  public Long get_settlement_id() {
    return settlement_id;
  }
  public void set_settlement_id(Long settlement_id) {
    this.settlement_id = settlement_id;
  }
  public team with_settlement_id(Long settlement_id) {
    this.settlement_id = settlement_id;
    return this;
  }
  private Long settlement_days;
  public Long get_settlement_days() {
    return settlement_days;
  }
  public void set_settlement_days(Long settlement_days) {
    this.settlement_days = settlement_days;
  }
  public team with_settlement_days(Long settlement_days) {
    this.settlement_days = settlement_days;
    return this;
  }
  private java.sql.Timestamp ticket_input_time;
  public java.sql.Timestamp get_ticket_input_time() {
    return ticket_input_time;
  }
  public void set_ticket_input_time(java.sql.Timestamp ticket_input_time) {
    this.ticket_input_time = ticket_input_time;
  }
  public team with_ticket_input_time(java.sql.Timestamp ticket_input_time) {
    this.ticket_input_time = ticket_input_time;
    return this;
  }
  private java.sql.Timestamp expressno_input_time;
  public java.sql.Timestamp get_expressno_input_time() {
    return expressno_input_time;
  }
  public void set_expressno_input_time(java.sql.Timestamp expressno_input_time) {
    this.expressno_input_time = expressno_input_time;
  }
  public team with_expressno_input_time(java.sql.Timestamp expressno_input_time) {
    this.expressno_input_time = expressno_input_time;
    return this;
  }
  private java.sql.Timestamp last_back_time;
  public java.sql.Timestamp get_last_back_time() {
    return last_back_time;
  }
  public void set_last_back_time(java.sql.Timestamp last_back_time) {
    this.last_back_time = last_back_time;
  }
  public team with_last_back_time(java.sql.Timestamp last_back_time) {
    this.last_back_time = last_back_time;
    return this;
  }
  private String pre_sale;
  public String get_pre_sale() {
    return pre_sale;
  }
  public void set_pre_sale(String pre_sale) {
    this.pre_sale = pre_sale;
  }
  public team with_pre_sale(String pre_sale) {
    this.pre_sale = pre_sale;
    return this;
  }
  private String use_time_limit;
  public String get_use_time_limit() {
    return use_time_limit;
  }
  public void set_use_time_limit(String use_time_limit) {
    this.use_time_limit = use_time_limit;
  }
  public team with_use_time_limit(String use_time_limit) {
    this.use_time_limit = use_time_limit;
    return this;
  }
  private String travel_nights;
  public String get_travel_nights() {
    return travel_nights;
  }
  public void set_travel_nights(String travel_nights) {
    this.travel_nights = travel_nights;
  }
  public team with_travel_nights(String travel_nights) {
    this.travel_nights = travel_nights;
    return this;
  }
  private String topic_label;
  public String get_topic_label() {
    return topic_label;
  }
  public void set_topic_label(String topic_label) {
    this.topic_label = topic_label;
  }
  public team with_topic_label(String topic_label) {
    this.topic_label = topic_label;
    return this;
  }
  private String purchase_option;
  public String get_purchase_option() {
    return purchase_option;
  }
  public void set_purchase_option(String purchase_option) {
    this.purchase_option = purchase_option;
  }
  public team with_purchase_option(String purchase_option) {
    this.purchase_option = purchase_option;
    return this;
  }
  private String price_type;
  public String get_price_type() {
    return price_type;
  }
  public void set_price_type(String price_type) {
    this.price_type = price_type;
  }
  public team with_price_type(String price_type) {
    this.price_type = price_type;
    return this;
  }
  private String hide_room_status;
  public String get_hide_room_status() {
    return hide_room_status;
  }
  public void set_hide_room_status(String hide_room_status) {
    this.hide_room_status = hide_room_status;
  }
  public team with_hide_room_status(String hide_room_status) {
    this.hide_room_status = hide_room_status;
    return this;
  }
  private String suggest_reason;
  public String get_suggest_reason() {
    return suggest_reason;
  }
  public void set_suggest_reason(String suggest_reason) {
    this.suggest_reason = suggest_reason;
  }
  public team with_suggest_reason(String suggest_reason) {
    this.suggest_reason = suggest_reason;
    return this;
  }
  private Integer holiday_tts;
  public Integer get_holiday_tts() {
    return holiday_tts;
  }
  public void set_holiday_tts(Integer holiday_tts) {
    this.holiday_tts = holiday_tts;
  }
  public team with_holiday_tts(Integer holiday_tts) {
    this.holiday_tts = holiday_tts;
    return this;
  }
  private Integer tts_mul_price;
  public Integer get_tts_mul_price() {
    return tts_mul_price;
  }
  public void set_tts_mul_price(Integer tts_mul_price) {
    this.tts_mul_price = tts_mul_price;
  }
  public team with_tts_mul_price(Integer tts_mul_price) {
    this.tts_mul_price = tts_mul_price;
    return this;
  }
  private String tts_id;
  public String get_tts_id() {
    return tts_id;
  }
  public void set_tts_id(String tts_id) {
    this.tts_id = tts_id;
  }
  public team with_tts_id(String tts_id) {
    this.tts_id = tts_id;
    return this;
  }
  private Integer hms_can_book;
  public Integer get_hms_can_book() {
    return hms_can_book;
  }
  public void set_hms_can_book(Integer hms_can_book) {
    this.hms_can_book = hms_can_book;
  }
  public team with_hms_can_book(Integer hms_can_book) {
    this.hms_can_book = hms_can_book;
    return this;
  }
  private Integer hms_unlock;
  public Integer get_hms_unlock() {
    return hms_unlock;
  }
  public void set_hms_unlock(Integer hms_unlock) {
    this.hms_unlock = hms_unlock;
  }
  public team with_hms_unlock(Integer hms_unlock) {
    this.hms_unlock = hms_unlock;
    return this;
  }
  private Integer detail_table;
  public Integer get_detail_table() {
    return detail_table;
  }
  public void set_detail_table(Integer detail_table) {
    this.detail_table = detail_table;
  }
  public team with_detail_table(Integer detail_table) {
    this.detail_table = detail_table;
    return this;
  }
  private Integer holidaytts_publish_request;
  public Integer get_holidaytts_publish_request() {
    return holidaytts_publish_request;
  }
  public void set_holidaytts_publish_request(Integer holidaytts_publish_request) {
    this.holidaytts_publish_request = holidaytts_publish_request;
  }
  public team with_holidaytts_publish_request(Integer holidaytts_publish_request) {
    this.holidaytts_publish_request = holidaytts_publish_request;
    return this;
  }
  private java.sql.Timestamp downline_time;
  public java.sql.Timestamp get_downline_time() {
    return downline_time;
  }
  public void set_downline_time(java.sql.Timestamp downline_time) {
    this.downline_time = downline_time;
  }
  public team with_downline_time(java.sql.Timestamp downline_time) {
    this.downline_time = downline_time;
    return this;
  }
  private java.sql.Timestamp express_expire_time;
  public java.sql.Timestamp get_express_expire_time() {
    return express_expire_time;
  }
  public void set_express_expire_time(java.sql.Timestamp express_expire_time) {
    this.express_expire_time = express_expire_time;
  }
  public team with_express_expire_time(java.sql.Timestamp express_expire_time) {
    this.express_expire_time = express_expire_time;
    return this;
  }
  private Integer holidaytts_free_package;
  public Integer get_holidaytts_free_package() {
    return holidaytts_free_package;
  }
  public void set_holidaytts_free_package(Integer holidaytts_free_package) {
    this.holidaytts_free_package = holidaytts_free_package;
  }
  public team with_holidaytts_free_package(Integer holidaytts_free_package) {
    this.holidaytts_free_package = holidaytts_free_package;
    return this;
  }
  private String new_type;
  public String get_new_type() {
    return new_type;
  }
  public void set_new_type(String new_type) {
    this.new_type = new_type;
  }
  public team with_new_type(String new_type) {
    this.new_type = new_type;
    return this;
  }
  private String holidaytts_distribution_way;
  public String get_holidaytts_distribution_way() {
    return holidaytts_distribution_way;
  }
  public void set_holidaytts_distribution_way(String holidaytts_distribution_way) {
    this.holidaytts_distribution_way = holidaytts_distribution_way;
  }
  public team with_holidaytts_distribution_way(String holidaytts_distribution_way) {
    this.holidaytts_distribution_way = holidaytts_distribution_way;
    return this;
  }
  private String holidaytts_pay_way;
  public String get_holidaytts_pay_way() {
    return holidaytts_pay_way;
  }
  public void set_holidaytts_pay_way(String holidaytts_pay_way) {
    this.holidaytts_pay_way = holidaytts_pay_way;
  }
  public team with_holidaytts_pay_way(String holidaytts_pay_way) {
    this.holidaytts_pay_way = holidaytts_pay_way;
    return this;
  }
  private String holiday_tts_ticket_type;
  public String get_holiday_tts_ticket_type() {
    return holiday_tts_ticket_type;
  }
  public void set_holiday_tts_ticket_type(String holiday_tts_ticket_type) {
    this.holiday_tts_ticket_type = holiday_tts_ticket_type;
  }
  public team with_holiday_tts_ticket_type(String holiday_tts_ticket_type) {
    this.holiday_tts_ticket_type = holiday_tts_ticket_type;
    return this;
  }
  private Integer tuanhide;
  public Integer get_tuanhide() {
    return tuanhide;
  }
  public void set_tuanhide(Integer tuanhide) {
    this.tuanhide = tuanhide;
  }
  public team with_tuanhide(Integer tuanhide) {
    this.tuanhide = tuanhide;
    return this;
  }
  private String holidaytts_ticket_id;
  public String get_holidaytts_ticket_id() {
    return holidaytts_ticket_id;
  }
  public void set_holidaytts_ticket_id(String holidaytts_ticket_id) {
    this.holidaytts_ticket_id = holidaytts_ticket_id;
  }
  public team with_holidaytts_ticket_id(String holidaytts_ticket_id) {
    this.holidaytts_ticket_id = holidaytts_ticket_id;
    return this;
  }
  private Integer is_active_hoteldesc;
  public Integer get_is_active_hoteldesc() {
    return is_active_hoteldesc;
  }
  public void set_is_active_hoteldesc(Integer is_active_hoteldesc) {
    this.is_active_hoteldesc = is_active_hoteldesc;
  }
  public team with_is_active_hoteldesc(Integer is_active_hoteldesc) {
    this.is_active_hoteldesc = is_active_hoteldesc;
    return this;
  }
  private String team_display_type;
  public String get_team_display_type() {
    return team_display_type;
  }
  public void set_team_display_type(String team_display_type) {
    this.team_display_type = team_display_type;
  }
  public team with_team_display_type(String team_display_type) {
    this.team_display_type = team_display_type;
    return this;
  }
  private String holiday_tts_taocan;
  public String get_holiday_tts_taocan() {
    return holiday_tts_taocan;
  }
  public void set_holiday_tts_taocan(String holiday_tts_taocan) {
    this.holiday_tts_taocan = holiday_tts_taocan;
  }
  public team with_holiday_tts_taocan(String holiday_tts_taocan) {
    this.holiday_tts_taocan = holiday_tts_taocan;
    return this;
  }
  private String holidaytts_scheduler;
  public String get_holidaytts_scheduler() {
    return holidaytts_scheduler;
  }
  public void set_holidaytts_scheduler(String holidaytts_scheduler) {
    this.holidaytts_scheduler = holidaytts_scheduler;
  }
  public team with_holidaytts_scheduler(String holidaytts_scheduler) {
    this.holidaytts_scheduler = holidaytts_scheduler;
    return this;
  }
  private String sight_info;
  public String get_sight_info() {
    return sight_info;
  }
  public void set_sight_info(String sight_info) {
    this.sight_info = sight_info;
  }
  public team with_sight_info(String sight_info) {
    this.sight_info = sight_info;
    return this;
  }
  private Integer holidaytts_id;
  public Integer get_holidaytts_id() {
    return holidaytts_id;
  }
  public void set_holidaytts_id(Integer holidaytts_id) {
    this.holidaytts_id = holidaytts_id;
  }
  public team with_holidaytts_id(Integer holidaytts_id) {
    this.holidaytts_id = holidaytts_id;
    return this;
  }
  private String holidaytts_ext_info;
  public String get_holidaytts_ext_info() {
    return holidaytts_ext_info;
  }
  public void set_holidaytts_ext_info(String holidaytts_ext_info) {
    this.holidaytts_ext_info = holidaytts_ext_info;
  }
  public team with_holidaytts_ext_info(String holidaytts_ext_info) {
    this.holidaytts_ext_info = holidaytts_ext_info;
    return this;
  }
  private String new_attr;
  public String get_new_attr() {
    return new_attr;
  }
  public void set_new_attr(String new_attr) {
    this.new_attr = new_attr;
  }
  public team with_new_attr(String new_attr) {
    this.new_attr = new_attr;
    return this;
  }
  private Integer partner_source;
  public Integer get_partner_source() {
    return partner_source;
  }
  public void set_partner_source(Integer partner_source) {
    this.partner_source = partner_source;
  }
  public team with_partner_source(Integer partner_source) {
    this.partner_source = partner_source;
    return this;
  }
  private String other_tuan_type;
  public String get_other_tuan_type() {
    return other_tuan_type;
  }
  public void set_other_tuan_type(String other_tuan_type) {
    this.other_tuan_type = other_tuan_type;
  }
  public team with_other_tuan_type(String other_tuan_type) {
    this.other_tuan_type = other_tuan_type;
    return this;
  }
  private Long other_tuan_id;
  public Long get_other_tuan_id() {
    return other_tuan_id;
  }
  public void set_other_tuan_id(Long other_tuan_id) {
    this.other_tuan_id = other_tuan_id;
  }
  public team with_other_tuan_id(Long other_tuan_id) {
    this.other_tuan_id = other_tuan_id;
    return this;
  }
  private String other_tuan_detail;
  public String get_other_tuan_detail() {
    return other_tuan_detail;
  }
  public void set_other_tuan_detail(String other_tuan_detail) {
    this.other_tuan_detail = other_tuan_detail;
  }
  public team with_other_tuan_detail(String other_tuan_detail) {
    this.other_tuan_detail = other_tuan_detail;
    return this;
  }
  private String tags;
  public String get_tags() {
    return tags;
  }
  public void set_tags(String tags) {
    this.tags = tags;
  }
  public team with_tags(String tags) {
    this.tags = tags;
    return this;
  }
  private String refund_condition;
  public String get_refund_condition() {
    return refund_condition;
  }
  public void set_refund_condition(String refund_condition) {
    this.refund_condition = refund_condition;
  }
  public team with_refund_condition(String refund_condition) {
    this.refund_condition = refund_condition;
    return this;
  }
  private String other_tuan_data;
  public String get_other_tuan_data() {
    return other_tuan_data;
  }
  public void set_other_tuan_data(String other_tuan_data) {
    this.other_tuan_data = other_tuan_data;
  }
  public team with_other_tuan_data(String other_tuan_data) {
    this.other_tuan_data = other_tuan_data;
    return this;
  }
  private Integer sign_company;
  public Integer get_sign_company() {
    return sign_company;
  }
  public void set_sign_company(Integer sign_company) {
    this.sign_company = sign_company;
  }
  public team with_sign_company(Integer sign_company) {
    this.sign_company = sign_company;
    return this;
  }
  private String settlement_type;
  public String get_settlement_type() {
    return settlement_type;
  }
  public void set_settlement_type(String settlement_type) {
    this.settlement_type = settlement_type;
  }
  public team with_settlement_type(String settlement_type) {
    this.settlement_type = settlement_type;
    return this;
  }
  private Integer is_union_product;
  public Integer get_is_union_product() {
    return is_union_product;
  }
  public void set_is_union_product(Integer is_union_product) {
    this.is_union_product = is_union_product;
  }
  public team with_is_union_product(Integer is_union_product) {
    this.is_union_product = is_union_product;
    return this;
  }
  private String tuan_product_type;
  public String get_tuan_product_type() {
    return tuan_product_type;
  }
  public void set_tuan_product_type(String tuan_product_type) {
    this.tuan_product_type = tuan_product_type;
  }
  public team with_tuan_product_type(String tuan_product_type) {
    this.tuan_product_type = tuan_product_type;
    return this;
  }
  private Integer pre_date;
  public Integer get_pre_date() {
    return pre_date;
  }
  public void set_pre_date(Integer pre_date) {
    this.pre_date = pre_date;
  }
  public team with_pre_date(Integer pre_date) {
    this.pre_date = pre_date;
    return this;
  }
  private Integer tel_book;
  public Integer get_tel_book() {
    return tel_book;
  }
  public void set_tel_book(Integer tel_book) {
    this.tel_book = tel_book;
  }
  public team with_tel_book(Integer tel_book) {
    this.tel_book = tel_book;
    return this;
  }
  private Long version;
  public Long get_version() {
    return version;
  }
  public void set_version(Long version) {
    this.version = version;
  }
  public team with_version(Long version) {
    this.version = version;
    return this;
  }
  private String url_short;
  public String get_url_short() {
    return url_short;
  }
  public void set_url_short(String url_short) {
    this.url_short = url_short;
  }
  public team with_url_short(String url_short) {
    this.url_short = url_short;
    return this;
  }
  private String other_notice;
  public String get_other_notice() {
    return other_notice;
  }
  public void set_other_notice(String other_notice) {
    this.other_notice = other_notice;
  }
  public team with_other_notice(String other_notice) {
    this.other_notice = other_notice;
    return this;
  }
  private java.sql.Timestamp create_time;
  public java.sql.Timestamp get_create_time() {
    return create_time;
  }
  public void set_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
  }
  public team with_create_time(java.sql.Timestamp create_time) {
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
  public team with_update_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
    return this;
  }
  private Integer source_type;
  public Integer get_source_type() {
    return source_type;
  }
  public void set_source_type(Integer source_type) {
    this.source_type = source_type;
  }
  public team with_source_type(Integer source_type) {
    this.source_type = source_type;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof team)) {
      return false;
    }
    team that = (team) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.summary == null ? that.summary == null : this.summary.equals(that.summary));
    equal = equal && (this.city_id == null ? that.city_id == null : this.city_id.equals(that.city_id));
    equal = equal && (this.group_id == null ? that.group_id == null : this.group_id.equals(that.group_id));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.system == null ? that.system == null : this.system.equals(that.system));
    equal = equal && (this.team_price == null ? that.team_price == null : this.team_price.equals(that.team_price));
    equal = equal && (this.market_price == null ? that.market_price == null : this.market_price.equals(that.market_price));
    equal = equal && (this.product == null ? that.product == null : this.product.equals(that.product));
    equal = equal && (this.condbuy == null ? that.condbuy == null : this.condbuy.equals(that.condbuy));
    equal = equal && (this.per_number == null ? that.per_number == null : this.per_number.equals(that.per_number));
    equal = equal && (this.min_number == null ? that.min_number == null : this.min_number.equals(that.min_number));
    equal = equal && (this.max_number == null ? that.max_number == null : this.max_number.equals(that.max_number));
    equal = equal && (this.now_number == null ? that.now_number == null : this.now_number.equals(that.now_number));
    equal = equal && (this.pre_number == null ? that.pre_number == null : this.pre_number.equals(that.pre_number));
    equal = equal && (this.image == null ? that.image == null : this.image.equals(that.image));
    equal = equal && (this.image1 == null ? that.image1 == null : this.image1.equals(that.image1));
    equal = equal && (this.image2 == null ? that.image2 == null : this.image2.equals(that.image2));
    equal = equal && (this.flv == null ? that.flv == null : this.flv.equals(that.flv));
    equal = equal && (this.mobile == null ? that.mobile == null : this.mobile.equals(that.mobile));
    equal = equal && (this.credit == null ? that.credit == null : this.credit.equals(that.credit));
    equal = equal && (this.card == null ? that.card == null : this.card.equals(that.card));
    equal = equal && (this.fare == null ? that.fare == null : this.fare.equals(that.fare));
    equal = equal && (this.farefree == null ? that.farefree == null : this.farefree.equals(that.farefree));
    equal = equal && (this.bonus == null ? that.bonus == null : this.bonus.equals(that.bonus));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.detail == null ? that.detail == null : this.detail.equals(that.detail));
    equal = equal && (this.systemreview == null ? that.systemreview == null : this.systemreview.equals(that.systemreview));
    equal = equal && (this.userreview == null ? that.userreview == null : this.userreview.equals(that.userreview));
    equal = equal && (this.notice == null ? that.notice == null : this.notice.equals(that.notice));
    equal = equal && (this.express == null ? that.express == null : this.express.equals(that.express));
    equal = equal && (this.delivery == null ? that.delivery == null : this.delivery.equals(that.delivery));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.conduser == null ? that.conduser == null : this.conduser.equals(that.conduser));
    equal = equal && (this.buyonce == null ? that.buyonce == null : this.buyonce.equals(that.buyonce));
    equal = equal && (this.team_type == null ? that.team_type == null : this.team_type.equals(that.team_type));
    equal = equal && (this.sort_order == null ? that.sort_order == null : this.sort_order.equals(that.sort_order));
    equal = equal && (this.expire_time == null ? that.expire_time == null : this.expire_time.equals(that.expire_time));
    equal = equal && (this.begin_time == null ? that.begin_time == null : this.begin_time.equals(that.begin_time));
    equal = equal && (this.end_time == null ? that.end_time == null : this.end_time.equals(that.end_time));
    equal = equal && (this.reach_time == null ? that.reach_time == null : this.reach_time.equals(that.reach_time));
    equal = equal && (this.close_time == null ? that.close_time == null : this.close_time.equals(that.close_time));
    equal = equal && (this.seo_title == null ? that.seo_title == null : this.seo_title.equals(that.seo_title));
    equal = equal && (this.seo_keyword == null ? that.seo_keyword == null : this.seo_keyword.equals(that.seo_keyword));
    equal = equal && (this.seo_description == null ? that.seo_description == null : this.seo_description.equals(that.seo_description));
    equal = equal && (this.stitle == null ? that.stitle == null : this.stitle.equals(that.stitle));
    equal = equal && (this.sales == null ? that.sales == null : this.sales.equals(that.sales));
    equal = equal && (this.publish == null ? that.publish == null : this.publish.equals(that.publish));
    equal = equal && (this.profit == null ? that.profit == null : this.profit.equals(that.profit));
    equal = equal && (this.hotel_seq == null ? that.hotel_seq == null : this.hotel_seq.equals(that.hotel_seq));
    equal = equal && (this.order_type == null ? that.order_type == null : this.order_type.equals(that.order_type));
    equal = equal && (this.hide_partner == null ? that.hide_partner == null : this.hide_partner.equals(that.hide_partner));
    equal = equal && (this.departure == null ? that.departure == null : this.departure.equals(that.departure));
    equal = equal && (this.arrive == null ? that.arrive == null : this.arrive.equals(that.arrive));
    equal = equal && (this.extra_sms == null ? that.extra_sms == null : this.extra_sms.equals(that.extra_sms));
    equal = equal && (this.room_type == null ? that.room_type == null : this.room_type.equals(that.room_type));
    equal = equal && (this.sort_tag == null ? that.sort_tag == null : this.sort_tag.equals(that.sort_tag));
    equal = equal && (this.check_in_time == null ? that.check_in_time == null : this.check_in_time.equals(that.check_in_time));
    equal = equal && (this.wireless_team_desc == null ? that.wireless_team_desc == null : this.wireless_team_desc.equals(that.wireless_team_desc));
    equal = equal && (this.wireless_special_notes == null ? that.wireless_special_notes == null : this.wireless_special_notes.equals(that.wireless_special_notes));
    equal = equal && (this.wireless_long_lat == null ? that.wireless_long_lat == null : this.wireless_long_lat.equals(that.wireless_long_lat));
    equal = equal && (this.express_fee == null ? that.express_fee == null : this.express_fee.equals(that.express_fee));
    equal = equal && (this.travel_days == null ? that.travel_days == null : this.travel_days.equals(that.travel_days));
    equal = equal && (this.travel_status == null ? that.travel_status == null : this.travel_status.equals(that.travel_status));
    equal = equal && (this.popularize == null ? that.popularize == null : this.popularize.equals(that.popularize));
    equal = equal && (this.major_popularize == null ? that.major_popularize == null : this.major_popularize.equals(that.major_popularize));
    equal = equal && (this.have_popularize == null ? that.have_popularize == null : this.have_popularize.equals(that.have_popularize));
    equal = equal && (this.bannerimage == null ? that.bannerimage == null : this.bannerimage.equals(that.bannerimage));
    equal = equal && (this.earliest_start == null ? that.earliest_start == null : this.earliest_start.equals(that.earliest_start));
    equal = equal && (this.room_desc == null ? that.room_desc == null : this.room_desc.equals(that.room_desc));
    equal = equal && (this.cost_price == null ? that.cost_price == null : this.cost_price.equals(that.cost_price));
    equal = equal && (this.red_envelope == null ? that.red_envelope == null : this.red_envelope.equals(that.red_envelope));
    equal = equal && (this.team_price_high == null ? that.team_price_high == null : this.team_price_high.equals(that.team_price_high));
    equal = equal && (this.market_price_high == null ? that.market_price_high == null : this.market_price_high.equals(that.market_price_high));
    equal = equal && (this.flight_max_discount == null ? that.flight_max_discount == null : this.flight_max_discount.equals(that.flight_max_discount));
    equal = equal && (this.flight_max_save == null ? that.flight_max_save == null : this.flight_max_save.equals(that.flight_max_save));
    equal = equal && (this.hotel_type == null ? that.hotel_type == null : this.hotel_type.equals(that.hotel_type));
    equal = equal && (this.voucher_val == null ? that.voucher_val == null : this.voucher_val.equals(that.voucher_val));
    equal = equal && (this.travel_long == null ? that.travel_long == null : this.travel_long.equals(that.travel_long));
    equal = equal && (this.p_team_id == null ? that.p_team_id == null : this.p_team_id.equals(that.p_team_id));
    equal = equal && (this.tuan_room_type == null ? that.tuan_room_type == null : this.tuan_room_type.equals(that.tuan_room_type));
    equal = equal && (this.tuan_project_name == null ? that.tuan_project_name == null : this.tuan_project_name.equals(that.tuan_project_name));
    equal = equal && (this.tuan_project_des == null ? that.tuan_project_des == null : this.tuan_project_des.equals(that.tuan_project_des));
    equal = equal && (this.son_hotel_names == null ? that.son_hotel_names == null : this.son_hotel_names.equals(that.son_hotel_names));
    equal = equal && (this.son_hotel_address == null ? that.son_hotel_address == null : this.son_hotel_address.equals(that.son_hotel_address));
    equal = equal && (this.baojian_total == null ? that.baojian_total == null : this.baojian_total.equals(that.baojian_total));
    equal = equal && (this.tips == null ? that.tips == null : this.tips.equals(that.tips));
    equal = equal && (this.qqgid == null ? that.qqgid == null : this.qqgid.equals(that.qqgid));
    equal = equal && (this.payment_method == null ? that.payment_method == null : this.payment_method.equals(that.payment_method));
    equal = equal && (this.payment_condition == null ? that.payment_condition == null : this.payment_condition.equals(that.payment_condition));
    equal = equal && (this.through_coupon_total == null ? that.through_coupon_total == null : this.through_coupon_total.equals(that.through_coupon_total));
    equal = equal && (this.subtitle == null ? that.subtitle == null : this.subtitle.equals(that.subtitle));
    equal = equal && (this.leave_time == null ? that.leave_time == null : this.leave_time.equals(that.leave_time));
    equal = equal && (this.refund_support == null ? that.refund_support == null : this.refund_support.equals(that.refund_support));
    equal = equal && (this.traffic_desc == null ? that.traffic_desc == null : this.traffic_desc.equals(that.traffic_desc));
    equal = equal && (this.scenic_desc == null ? that.scenic_desc == null : this.scenic_desc.equals(that.scenic_desc));
    equal = equal && (this.money_use_detail == null ? that.money_use_detail == null : this.money_use_detail.equals(that.money_use_detail));
    equal = equal && (this.good_food == null ? that.good_food == null : this.good_food.equals(that.good_food));
    equal = equal && (this.hotel_desc == null ? that.hotel_desc == null : this.hotel_desc.equals(that.hotel_desc));
    equal = equal && (this.hide_room_type == null ? that.hide_room_type == null : this.hide_room_type.equals(that.hide_room_type));
    equal = equal && (this.modeldisplay == null ? that.modeldisplay == null : this.modeldisplay.equals(that.modeldisplay));
    equal = equal && (this.if_need_visa == null ? that.if_need_visa == null : this.if_need_visa.equals(that.if_need_visa));
    equal = equal && (this.buy_tips == null ? that.buy_tips == null : this.buy_tips.equals(that.buy_tips));
    equal = equal && (this.is_new_team == null ? that.is_new_team == null : this.is_new_team.equals(that.is_new_team));
    equal = equal && (this.related_sight == null ? that.related_sight == null : this.related_sight.equals(that.related_sight));
    equal = equal && (this.publish_2dcode == null ? that.publish_2dcode == null : this.publish_2dcode.equals(that.publish_2dcode));
    equal = equal && (this.settlement_id == null ? that.settlement_id == null : this.settlement_id.equals(that.settlement_id));
    equal = equal && (this.settlement_days == null ? that.settlement_days == null : this.settlement_days.equals(that.settlement_days));
    equal = equal && (this.ticket_input_time == null ? that.ticket_input_time == null : this.ticket_input_time.equals(that.ticket_input_time));
    equal = equal && (this.expressno_input_time == null ? that.expressno_input_time == null : this.expressno_input_time.equals(that.expressno_input_time));
    equal = equal && (this.last_back_time == null ? that.last_back_time == null : this.last_back_time.equals(that.last_back_time));
    equal = equal && (this.pre_sale == null ? that.pre_sale == null : this.pre_sale.equals(that.pre_sale));
    equal = equal && (this.use_time_limit == null ? that.use_time_limit == null : this.use_time_limit.equals(that.use_time_limit));
    equal = equal && (this.travel_nights == null ? that.travel_nights == null : this.travel_nights.equals(that.travel_nights));
    equal = equal && (this.topic_label == null ? that.topic_label == null : this.topic_label.equals(that.topic_label));
    equal = equal && (this.purchase_option == null ? that.purchase_option == null : this.purchase_option.equals(that.purchase_option));
    equal = equal && (this.price_type == null ? that.price_type == null : this.price_type.equals(that.price_type));
    equal = equal && (this.hide_room_status == null ? that.hide_room_status == null : this.hide_room_status.equals(that.hide_room_status));
    equal = equal && (this.suggest_reason == null ? that.suggest_reason == null : this.suggest_reason.equals(that.suggest_reason));
    equal = equal && (this.holiday_tts == null ? that.holiday_tts == null : this.holiday_tts.equals(that.holiday_tts));
    equal = equal && (this.tts_mul_price == null ? that.tts_mul_price == null : this.tts_mul_price.equals(that.tts_mul_price));
    equal = equal && (this.tts_id == null ? that.tts_id == null : this.tts_id.equals(that.tts_id));
    equal = equal && (this.hms_can_book == null ? that.hms_can_book == null : this.hms_can_book.equals(that.hms_can_book));
    equal = equal && (this.hms_unlock == null ? that.hms_unlock == null : this.hms_unlock.equals(that.hms_unlock));
    equal = equal && (this.detail_table == null ? that.detail_table == null : this.detail_table.equals(that.detail_table));
    equal = equal && (this.holidaytts_publish_request == null ? that.holidaytts_publish_request == null : this.holidaytts_publish_request.equals(that.holidaytts_publish_request));
    equal = equal && (this.downline_time == null ? that.downline_time == null : this.downline_time.equals(that.downline_time));
    equal = equal && (this.express_expire_time == null ? that.express_expire_time == null : this.express_expire_time.equals(that.express_expire_time));
    equal = equal && (this.holidaytts_free_package == null ? that.holidaytts_free_package == null : this.holidaytts_free_package.equals(that.holidaytts_free_package));
    equal = equal && (this.new_type == null ? that.new_type == null : this.new_type.equals(that.new_type));
    equal = equal && (this.holidaytts_distribution_way == null ? that.holidaytts_distribution_way == null : this.holidaytts_distribution_way.equals(that.holidaytts_distribution_way));
    equal = equal && (this.holidaytts_pay_way == null ? that.holidaytts_pay_way == null : this.holidaytts_pay_way.equals(that.holidaytts_pay_way));
    equal = equal && (this.holiday_tts_ticket_type == null ? that.holiday_tts_ticket_type == null : this.holiday_tts_ticket_type.equals(that.holiday_tts_ticket_type));
    equal = equal && (this.tuanhide == null ? that.tuanhide == null : this.tuanhide.equals(that.tuanhide));
    equal = equal && (this.holidaytts_ticket_id == null ? that.holidaytts_ticket_id == null : this.holidaytts_ticket_id.equals(that.holidaytts_ticket_id));
    equal = equal && (this.is_active_hoteldesc == null ? that.is_active_hoteldesc == null : this.is_active_hoteldesc.equals(that.is_active_hoteldesc));
    equal = equal && (this.team_display_type == null ? that.team_display_type == null : this.team_display_type.equals(that.team_display_type));
    equal = equal && (this.holiday_tts_taocan == null ? that.holiday_tts_taocan == null : this.holiday_tts_taocan.equals(that.holiday_tts_taocan));
    equal = equal && (this.holidaytts_scheduler == null ? that.holidaytts_scheduler == null : this.holidaytts_scheduler.equals(that.holidaytts_scheduler));
    equal = equal && (this.sight_info == null ? that.sight_info == null : this.sight_info.equals(that.sight_info));
    equal = equal && (this.holidaytts_id == null ? that.holidaytts_id == null : this.holidaytts_id.equals(that.holidaytts_id));
    equal = equal && (this.holidaytts_ext_info == null ? that.holidaytts_ext_info == null : this.holidaytts_ext_info.equals(that.holidaytts_ext_info));
    equal = equal && (this.new_attr == null ? that.new_attr == null : this.new_attr.equals(that.new_attr));
    equal = equal && (this.partner_source == null ? that.partner_source == null : this.partner_source.equals(that.partner_source));
    equal = equal && (this.other_tuan_type == null ? that.other_tuan_type == null : this.other_tuan_type.equals(that.other_tuan_type));
    equal = equal && (this.other_tuan_id == null ? that.other_tuan_id == null : this.other_tuan_id.equals(that.other_tuan_id));
    equal = equal && (this.other_tuan_detail == null ? that.other_tuan_detail == null : this.other_tuan_detail.equals(that.other_tuan_detail));
    equal = equal && (this.tags == null ? that.tags == null : this.tags.equals(that.tags));
    equal = equal && (this.refund_condition == null ? that.refund_condition == null : this.refund_condition.equals(that.refund_condition));
    equal = equal && (this.other_tuan_data == null ? that.other_tuan_data == null : this.other_tuan_data.equals(that.other_tuan_data));
    equal = equal && (this.sign_company == null ? that.sign_company == null : this.sign_company.equals(that.sign_company));
    equal = equal && (this.settlement_type == null ? that.settlement_type == null : this.settlement_type.equals(that.settlement_type));
    equal = equal && (this.is_union_product == null ? that.is_union_product == null : this.is_union_product.equals(that.is_union_product));
    equal = equal && (this.tuan_product_type == null ? that.tuan_product_type == null : this.tuan_product_type.equals(that.tuan_product_type));
    equal = equal && (this.pre_date == null ? that.pre_date == null : this.pre_date.equals(that.pre_date));
    equal = equal && (this.tel_book == null ? that.tel_book == null : this.tel_book.equals(that.tel_book));
    equal = equal && (this.version == null ? that.version == null : this.version.equals(that.version));
    equal = equal && (this.url_short == null ? that.url_short == null : this.url_short.equals(that.url_short));
    equal = equal && (this.other_notice == null ? that.other_notice == null : this.other_notice.equals(that.other_notice));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.source_type == null ? that.source_type == null : this.source_type.equals(that.source_type));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof team)) {
      return false;
    }
    team that = (team) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.summary == null ? that.summary == null : this.summary.equals(that.summary));
    equal = equal && (this.city_id == null ? that.city_id == null : this.city_id.equals(that.city_id));
    equal = equal && (this.group_id == null ? that.group_id == null : this.group_id.equals(that.group_id));
    equal = equal && (this.partner_id == null ? that.partner_id == null : this.partner_id.equals(that.partner_id));
    equal = equal && (this.system == null ? that.system == null : this.system.equals(that.system));
    equal = equal && (this.team_price == null ? that.team_price == null : this.team_price.equals(that.team_price));
    equal = equal && (this.market_price == null ? that.market_price == null : this.market_price.equals(that.market_price));
    equal = equal && (this.product == null ? that.product == null : this.product.equals(that.product));
    equal = equal && (this.condbuy == null ? that.condbuy == null : this.condbuy.equals(that.condbuy));
    equal = equal && (this.per_number == null ? that.per_number == null : this.per_number.equals(that.per_number));
    equal = equal && (this.min_number == null ? that.min_number == null : this.min_number.equals(that.min_number));
    equal = equal && (this.max_number == null ? that.max_number == null : this.max_number.equals(that.max_number));
    equal = equal && (this.now_number == null ? that.now_number == null : this.now_number.equals(that.now_number));
    equal = equal && (this.pre_number == null ? that.pre_number == null : this.pre_number.equals(that.pre_number));
    equal = equal && (this.image == null ? that.image == null : this.image.equals(that.image));
    equal = equal && (this.image1 == null ? that.image1 == null : this.image1.equals(that.image1));
    equal = equal && (this.image2 == null ? that.image2 == null : this.image2.equals(that.image2));
    equal = equal && (this.flv == null ? that.flv == null : this.flv.equals(that.flv));
    equal = equal && (this.mobile == null ? that.mobile == null : this.mobile.equals(that.mobile));
    equal = equal && (this.credit == null ? that.credit == null : this.credit.equals(that.credit));
    equal = equal && (this.card == null ? that.card == null : this.card.equals(that.card));
    equal = equal && (this.fare == null ? that.fare == null : this.fare.equals(that.fare));
    equal = equal && (this.farefree == null ? that.farefree == null : this.farefree.equals(that.farefree));
    equal = equal && (this.bonus == null ? that.bonus == null : this.bonus.equals(that.bonus));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.detail == null ? that.detail == null : this.detail.equals(that.detail));
    equal = equal && (this.systemreview == null ? that.systemreview == null : this.systemreview.equals(that.systemreview));
    equal = equal && (this.userreview == null ? that.userreview == null : this.userreview.equals(that.userreview));
    equal = equal && (this.notice == null ? that.notice == null : this.notice.equals(that.notice));
    equal = equal && (this.express == null ? that.express == null : this.express.equals(that.express));
    equal = equal && (this.delivery == null ? that.delivery == null : this.delivery.equals(that.delivery));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.conduser == null ? that.conduser == null : this.conduser.equals(that.conduser));
    equal = equal && (this.buyonce == null ? that.buyonce == null : this.buyonce.equals(that.buyonce));
    equal = equal && (this.team_type == null ? that.team_type == null : this.team_type.equals(that.team_type));
    equal = equal && (this.sort_order == null ? that.sort_order == null : this.sort_order.equals(that.sort_order));
    equal = equal && (this.expire_time == null ? that.expire_time == null : this.expire_time.equals(that.expire_time));
    equal = equal && (this.begin_time == null ? that.begin_time == null : this.begin_time.equals(that.begin_time));
    equal = equal && (this.end_time == null ? that.end_time == null : this.end_time.equals(that.end_time));
    equal = equal && (this.reach_time == null ? that.reach_time == null : this.reach_time.equals(that.reach_time));
    equal = equal && (this.close_time == null ? that.close_time == null : this.close_time.equals(that.close_time));
    equal = equal && (this.seo_title == null ? that.seo_title == null : this.seo_title.equals(that.seo_title));
    equal = equal && (this.seo_keyword == null ? that.seo_keyword == null : this.seo_keyword.equals(that.seo_keyword));
    equal = equal && (this.seo_description == null ? that.seo_description == null : this.seo_description.equals(that.seo_description));
    equal = equal && (this.stitle == null ? that.stitle == null : this.stitle.equals(that.stitle));
    equal = equal && (this.sales == null ? that.sales == null : this.sales.equals(that.sales));
    equal = equal && (this.publish == null ? that.publish == null : this.publish.equals(that.publish));
    equal = equal && (this.profit == null ? that.profit == null : this.profit.equals(that.profit));
    equal = equal && (this.hotel_seq == null ? that.hotel_seq == null : this.hotel_seq.equals(that.hotel_seq));
    equal = equal && (this.order_type == null ? that.order_type == null : this.order_type.equals(that.order_type));
    equal = equal && (this.hide_partner == null ? that.hide_partner == null : this.hide_partner.equals(that.hide_partner));
    equal = equal && (this.departure == null ? that.departure == null : this.departure.equals(that.departure));
    equal = equal && (this.arrive == null ? that.arrive == null : this.arrive.equals(that.arrive));
    equal = equal && (this.extra_sms == null ? that.extra_sms == null : this.extra_sms.equals(that.extra_sms));
    equal = equal && (this.room_type == null ? that.room_type == null : this.room_type.equals(that.room_type));
    equal = equal && (this.sort_tag == null ? that.sort_tag == null : this.sort_tag.equals(that.sort_tag));
    equal = equal && (this.check_in_time == null ? that.check_in_time == null : this.check_in_time.equals(that.check_in_time));
    equal = equal && (this.wireless_team_desc == null ? that.wireless_team_desc == null : this.wireless_team_desc.equals(that.wireless_team_desc));
    equal = equal && (this.wireless_special_notes == null ? that.wireless_special_notes == null : this.wireless_special_notes.equals(that.wireless_special_notes));
    equal = equal && (this.wireless_long_lat == null ? that.wireless_long_lat == null : this.wireless_long_lat.equals(that.wireless_long_lat));
    equal = equal && (this.express_fee == null ? that.express_fee == null : this.express_fee.equals(that.express_fee));
    equal = equal && (this.travel_days == null ? that.travel_days == null : this.travel_days.equals(that.travel_days));
    equal = equal && (this.travel_status == null ? that.travel_status == null : this.travel_status.equals(that.travel_status));
    equal = equal && (this.popularize == null ? that.popularize == null : this.popularize.equals(that.popularize));
    equal = equal && (this.major_popularize == null ? that.major_popularize == null : this.major_popularize.equals(that.major_popularize));
    equal = equal && (this.have_popularize == null ? that.have_popularize == null : this.have_popularize.equals(that.have_popularize));
    equal = equal && (this.bannerimage == null ? that.bannerimage == null : this.bannerimage.equals(that.bannerimage));
    equal = equal && (this.earliest_start == null ? that.earliest_start == null : this.earliest_start.equals(that.earliest_start));
    equal = equal && (this.room_desc == null ? that.room_desc == null : this.room_desc.equals(that.room_desc));
    equal = equal && (this.cost_price == null ? that.cost_price == null : this.cost_price.equals(that.cost_price));
    equal = equal && (this.red_envelope == null ? that.red_envelope == null : this.red_envelope.equals(that.red_envelope));
    equal = equal && (this.team_price_high == null ? that.team_price_high == null : this.team_price_high.equals(that.team_price_high));
    equal = equal && (this.market_price_high == null ? that.market_price_high == null : this.market_price_high.equals(that.market_price_high));
    equal = equal && (this.flight_max_discount == null ? that.flight_max_discount == null : this.flight_max_discount.equals(that.flight_max_discount));
    equal = equal && (this.flight_max_save == null ? that.flight_max_save == null : this.flight_max_save.equals(that.flight_max_save));
    equal = equal && (this.hotel_type == null ? that.hotel_type == null : this.hotel_type.equals(that.hotel_type));
    equal = equal && (this.voucher_val == null ? that.voucher_val == null : this.voucher_val.equals(that.voucher_val));
    equal = equal && (this.travel_long == null ? that.travel_long == null : this.travel_long.equals(that.travel_long));
    equal = equal && (this.p_team_id == null ? that.p_team_id == null : this.p_team_id.equals(that.p_team_id));
    equal = equal && (this.tuan_room_type == null ? that.tuan_room_type == null : this.tuan_room_type.equals(that.tuan_room_type));
    equal = equal && (this.tuan_project_name == null ? that.tuan_project_name == null : this.tuan_project_name.equals(that.tuan_project_name));
    equal = equal && (this.tuan_project_des == null ? that.tuan_project_des == null : this.tuan_project_des.equals(that.tuan_project_des));
    equal = equal && (this.son_hotel_names == null ? that.son_hotel_names == null : this.son_hotel_names.equals(that.son_hotel_names));
    equal = equal && (this.son_hotel_address == null ? that.son_hotel_address == null : this.son_hotel_address.equals(that.son_hotel_address));
    equal = equal && (this.baojian_total == null ? that.baojian_total == null : this.baojian_total.equals(that.baojian_total));
    equal = equal && (this.tips == null ? that.tips == null : this.tips.equals(that.tips));
    equal = equal && (this.qqgid == null ? that.qqgid == null : this.qqgid.equals(that.qqgid));
    equal = equal && (this.payment_method == null ? that.payment_method == null : this.payment_method.equals(that.payment_method));
    equal = equal && (this.payment_condition == null ? that.payment_condition == null : this.payment_condition.equals(that.payment_condition));
    equal = equal && (this.through_coupon_total == null ? that.through_coupon_total == null : this.through_coupon_total.equals(that.through_coupon_total));
    equal = equal && (this.subtitle == null ? that.subtitle == null : this.subtitle.equals(that.subtitle));
    equal = equal && (this.leave_time == null ? that.leave_time == null : this.leave_time.equals(that.leave_time));
    equal = equal && (this.refund_support == null ? that.refund_support == null : this.refund_support.equals(that.refund_support));
    equal = equal && (this.traffic_desc == null ? that.traffic_desc == null : this.traffic_desc.equals(that.traffic_desc));
    equal = equal && (this.scenic_desc == null ? that.scenic_desc == null : this.scenic_desc.equals(that.scenic_desc));
    equal = equal && (this.money_use_detail == null ? that.money_use_detail == null : this.money_use_detail.equals(that.money_use_detail));
    equal = equal && (this.good_food == null ? that.good_food == null : this.good_food.equals(that.good_food));
    equal = equal && (this.hotel_desc == null ? that.hotel_desc == null : this.hotel_desc.equals(that.hotel_desc));
    equal = equal && (this.hide_room_type == null ? that.hide_room_type == null : this.hide_room_type.equals(that.hide_room_type));
    equal = equal && (this.modeldisplay == null ? that.modeldisplay == null : this.modeldisplay.equals(that.modeldisplay));
    equal = equal && (this.if_need_visa == null ? that.if_need_visa == null : this.if_need_visa.equals(that.if_need_visa));
    equal = equal && (this.buy_tips == null ? that.buy_tips == null : this.buy_tips.equals(that.buy_tips));
    equal = equal && (this.is_new_team == null ? that.is_new_team == null : this.is_new_team.equals(that.is_new_team));
    equal = equal && (this.related_sight == null ? that.related_sight == null : this.related_sight.equals(that.related_sight));
    equal = equal && (this.publish_2dcode == null ? that.publish_2dcode == null : this.publish_2dcode.equals(that.publish_2dcode));
    equal = equal && (this.settlement_id == null ? that.settlement_id == null : this.settlement_id.equals(that.settlement_id));
    equal = equal && (this.settlement_days == null ? that.settlement_days == null : this.settlement_days.equals(that.settlement_days));
    equal = equal && (this.ticket_input_time == null ? that.ticket_input_time == null : this.ticket_input_time.equals(that.ticket_input_time));
    equal = equal && (this.expressno_input_time == null ? that.expressno_input_time == null : this.expressno_input_time.equals(that.expressno_input_time));
    equal = equal && (this.last_back_time == null ? that.last_back_time == null : this.last_back_time.equals(that.last_back_time));
    equal = equal && (this.pre_sale == null ? that.pre_sale == null : this.pre_sale.equals(that.pre_sale));
    equal = equal && (this.use_time_limit == null ? that.use_time_limit == null : this.use_time_limit.equals(that.use_time_limit));
    equal = equal && (this.travel_nights == null ? that.travel_nights == null : this.travel_nights.equals(that.travel_nights));
    equal = equal && (this.topic_label == null ? that.topic_label == null : this.topic_label.equals(that.topic_label));
    equal = equal && (this.purchase_option == null ? that.purchase_option == null : this.purchase_option.equals(that.purchase_option));
    equal = equal && (this.price_type == null ? that.price_type == null : this.price_type.equals(that.price_type));
    equal = equal && (this.hide_room_status == null ? that.hide_room_status == null : this.hide_room_status.equals(that.hide_room_status));
    equal = equal && (this.suggest_reason == null ? that.suggest_reason == null : this.suggest_reason.equals(that.suggest_reason));
    equal = equal && (this.holiday_tts == null ? that.holiday_tts == null : this.holiday_tts.equals(that.holiday_tts));
    equal = equal && (this.tts_mul_price == null ? that.tts_mul_price == null : this.tts_mul_price.equals(that.tts_mul_price));
    equal = equal && (this.tts_id == null ? that.tts_id == null : this.tts_id.equals(that.tts_id));
    equal = equal && (this.hms_can_book == null ? that.hms_can_book == null : this.hms_can_book.equals(that.hms_can_book));
    equal = equal && (this.hms_unlock == null ? that.hms_unlock == null : this.hms_unlock.equals(that.hms_unlock));
    equal = equal && (this.detail_table == null ? that.detail_table == null : this.detail_table.equals(that.detail_table));
    equal = equal && (this.holidaytts_publish_request == null ? that.holidaytts_publish_request == null : this.holidaytts_publish_request.equals(that.holidaytts_publish_request));
    equal = equal && (this.downline_time == null ? that.downline_time == null : this.downline_time.equals(that.downline_time));
    equal = equal && (this.express_expire_time == null ? that.express_expire_time == null : this.express_expire_time.equals(that.express_expire_time));
    equal = equal && (this.holidaytts_free_package == null ? that.holidaytts_free_package == null : this.holidaytts_free_package.equals(that.holidaytts_free_package));
    equal = equal && (this.new_type == null ? that.new_type == null : this.new_type.equals(that.new_type));
    equal = equal && (this.holidaytts_distribution_way == null ? that.holidaytts_distribution_way == null : this.holidaytts_distribution_way.equals(that.holidaytts_distribution_way));
    equal = equal && (this.holidaytts_pay_way == null ? that.holidaytts_pay_way == null : this.holidaytts_pay_way.equals(that.holidaytts_pay_way));
    equal = equal && (this.holiday_tts_ticket_type == null ? that.holiday_tts_ticket_type == null : this.holiday_tts_ticket_type.equals(that.holiday_tts_ticket_type));
    equal = equal && (this.tuanhide == null ? that.tuanhide == null : this.tuanhide.equals(that.tuanhide));
    equal = equal && (this.holidaytts_ticket_id == null ? that.holidaytts_ticket_id == null : this.holidaytts_ticket_id.equals(that.holidaytts_ticket_id));
    equal = equal && (this.is_active_hoteldesc == null ? that.is_active_hoteldesc == null : this.is_active_hoteldesc.equals(that.is_active_hoteldesc));
    equal = equal && (this.team_display_type == null ? that.team_display_type == null : this.team_display_type.equals(that.team_display_type));
    equal = equal && (this.holiday_tts_taocan == null ? that.holiday_tts_taocan == null : this.holiday_tts_taocan.equals(that.holiday_tts_taocan));
    equal = equal && (this.holidaytts_scheduler == null ? that.holidaytts_scheduler == null : this.holidaytts_scheduler.equals(that.holidaytts_scheduler));
    equal = equal && (this.sight_info == null ? that.sight_info == null : this.sight_info.equals(that.sight_info));
    equal = equal && (this.holidaytts_id == null ? that.holidaytts_id == null : this.holidaytts_id.equals(that.holidaytts_id));
    equal = equal && (this.holidaytts_ext_info == null ? that.holidaytts_ext_info == null : this.holidaytts_ext_info.equals(that.holidaytts_ext_info));
    equal = equal && (this.new_attr == null ? that.new_attr == null : this.new_attr.equals(that.new_attr));
    equal = equal && (this.partner_source == null ? that.partner_source == null : this.partner_source.equals(that.partner_source));
    equal = equal && (this.other_tuan_type == null ? that.other_tuan_type == null : this.other_tuan_type.equals(that.other_tuan_type));
    equal = equal && (this.other_tuan_id == null ? that.other_tuan_id == null : this.other_tuan_id.equals(that.other_tuan_id));
    equal = equal && (this.other_tuan_detail == null ? that.other_tuan_detail == null : this.other_tuan_detail.equals(that.other_tuan_detail));
    equal = equal && (this.tags == null ? that.tags == null : this.tags.equals(that.tags));
    equal = equal && (this.refund_condition == null ? that.refund_condition == null : this.refund_condition.equals(that.refund_condition));
    equal = equal && (this.other_tuan_data == null ? that.other_tuan_data == null : this.other_tuan_data.equals(that.other_tuan_data));
    equal = equal && (this.sign_company == null ? that.sign_company == null : this.sign_company.equals(that.sign_company));
    equal = equal && (this.settlement_type == null ? that.settlement_type == null : this.settlement_type.equals(that.settlement_type));
    equal = equal && (this.is_union_product == null ? that.is_union_product == null : this.is_union_product.equals(that.is_union_product));
    equal = equal && (this.tuan_product_type == null ? that.tuan_product_type == null : this.tuan_product_type.equals(that.tuan_product_type));
    equal = equal && (this.pre_date == null ? that.pre_date == null : this.pre_date.equals(that.pre_date));
    equal = equal && (this.tel_book == null ? that.tel_book == null : this.tel_book.equals(that.tel_book));
    equal = equal && (this.version == null ? that.version == null : this.version.equals(that.version));
    equal = equal && (this.url_short == null ? that.url_short == null : this.url_short.equals(that.url_short));
    equal = equal && (this.other_notice == null ? that.other_notice == null : this.other_notice.equals(that.other_notice));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.source_type == null ? that.source_type == null : this.source_type.equals(that.source_type));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.user_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.title = JdbcWritableBridge.readString(3, __dbResults);
    this.summary = JdbcWritableBridge.readString(4, __dbResults);
    this.city_id = JdbcWritableBridge.readLong(5, __dbResults);
    this.group_id = JdbcWritableBridge.readLong(6, __dbResults);
    this.partner_id = JdbcWritableBridge.readLong(7, __dbResults);
    this.system = JdbcWritableBridge.readString(8, __dbResults);
    this.team_price = JdbcWritableBridge.readFloat(9, __dbResults);
    this.market_price = JdbcWritableBridge.readFloat(10, __dbResults);
    this.product = JdbcWritableBridge.readString(11, __dbResults);
    this.condbuy = JdbcWritableBridge.readString(12, __dbResults);
    this.per_number = JdbcWritableBridge.readLong(13, __dbResults);
    this.min_number = JdbcWritableBridge.readLong(14, __dbResults);
    this.max_number = JdbcWritableBridge.readLong(15, __dbResults);
    this.now_number = JdbcWritableBridge.readLong(16, __dbResults);
    this.pre_number = JdbcWritableBridge.readLong(17, __dbResults);
    this.image = JdbcWritableBridge.readString(18, __dbResults);
    this.image1 = JdbcWritableBridge.readString(19, __dbResults);
    this.image2 = JdbcWritableBridge.readString(20, __dbResults);
    this.flv = JdbcWritableBridge.readString(21, __dbResults);
    this.mobile = JdbcWritableBridge.readString(22, __dbResults);
    this.credit = JdbcWritableBridge.readLong(23, __dbResults);
    this.card = JdbcWritableBridge.readLong(24, __dbResults);
    this.fare = JdbcWritableBridge.readLong(25, __dbResults);
    this.farefree = JdbcWritableBridge.readLong(26, __dbResults);
    this.bonus = JdbcWritableBridge.readLong(27, __dbResults);
    this.address = JdbcWritableBridge.readString(28, __dbResults);
    this.detail = JdbcWritableBridge.readString(29, __dbResults);
    this.systemreview = JdbcWritableBridge.readString(30, __dbResults);
    this.userreview = JdbcWritableBridge.readString(31, __dbResults);
    this.notice = JdbcWritableBridge.readString(32, __dbResults);
    this.express = JdbcWritableBridge.readString(33, __dbResults);
    this.delivery = JdbcWritableBridge.readString(34, __dbResults);
    this.state = JdbcWritableBridge.readString(35, __dbResults);
    this.conduser = JdbcWritableBridge.readString(36, __dbResults);
    this.buyonce = JdbcWritableBridge.readString(37, __dbResults);
    this.team_type = JdbcWritableBridge.readString(38, __dbResults);
    this.sort_order = JdbcWritableBridge.readLong(39, __dbResults);
    this.expire_time = JdbcWritableBridge.readLong(40, __dbResults);
    this.begin_time = JdbcWritableBridge.readLong(41, __dbResults);
    this.end_time = JdbcWritableBridge.readLong(42, __dbResults);
    this.reach_time = JdbcWritableBridge.readLong(43, __dbResults);
    this.close_time = JdbcWritableBridge.readLong(44, __dbResults);
    this.seo_title = JdbcWritableBridge.readString(45, __dbResults);
    this.seo_keyword = JdbcWritableBridge.readString(46, __dbResults);
    this.seo_description = JdbcWritableBridge.readString(47, __dbResults);
    this.stitle = JdbcWritableBridge.readString(48, __dbResults);
    this.sales = JdbcWritableBridge.readString(49, __dbResults);
    this.publish = JdbcWritableBridge.readString(50, __dbResults);
    this.profit = JdbcWritableBridge.readLong(51, __dbResults);
    this.hotel_seq = JdbcWritableBridge.readString(52, __dbResults);
    this.order_type = JdbcWritableBridge.readString(53, __dbResults);
    this.hide_partner = JdbcWritableBridge.readString(54, __dbResults);
    this.departure = JdbcWritableBridge.readString(55, __dbResults);
    this.arrive = JdbcWritableBridge.readString(56, __dbResults);
    this.extra_sms = JdbcWritableBridge.readString(57, __dbResults);
    this.room_type = JdbcWritableBridge.readString(58, __dbResults);
    this.sort_tag = JdbcWritableBridge.readString(59, __dbResults);
    this.check_in_time = JdbcWritableBridge.readLong(60, __dbResults);
    this.wireless_team_desc = JdbcWritableBridge.readString(61, __dbResults);
    this.wireless_special_notes = JdbcWritableBridge.readString(62, __dbResults);
    this.wireless_long_lat = JdbcWritableBridge.readString(63, __dbResults);
    this.express_fee = JdbcWritableBridge.readFloat(64, __dbResults);
    this.travel_days = JdbcWritableBridge.readString(65, __dbResults);
    this.travel_status = JdbcWritableBridge.readString(66, __dbResults);
    this.popularize = JdbcWritableBridge.readInteger(67, __dbResults);
    this.major_popularize = JdbcWritableBridge.readInteger(68, __dbResults);
    this.have_popularize = JdbcWritableBridge.readLong(69, __dbResults);
    this.bannerimage = JdbcWritableBridge.readString(70, __dbResults);
    this.earliest_start = JdbcWritableBridge.readLong(71, __dbResults);
    this.room_desc = JdbcWritableBridge.readString(72, __dbResults);
    this.cost_price = JdbcWritableBridge.readFloat(73, __dbResults);
    this.red_envelope = JdbcWritableBridge.readLong(74, __dbResults);
    this.team_price_high = JdbcWritableBridge.readFloat(75, __dbResults);
    this.market_price_high = JdbcWritableBridge.readFloat(76, __dbResults);
    this.flight_max_discount = JdbcWritableBridge.readString(77, __dbResults);
    this.flight_max_save = JdbcWritableBridge.readString(78, __dbResults);
    this.hotel_type = JdbcWritableBridge.readString(79, __dbResults);
    this.voucher_val = JdbcWritableBridge.readInteger(80, __dbResults);
    this.travel_long = JdbcWritableBridge.readInteger(81, __dbResults);
    this.p_team_id = JdbcWritableBridge.readLong(82, __dbResults);
    this.tuan_room_type = JdbcWritableBridge.readString(83, __dbResults);
    this.tuan_project_name = JdbcWritableBridge.readString(84, __dbResults);
    this.tuan_project_des = JdbcWritableBridge.readString(85, __dbResults);
    this.son_hotel_names = JdbcWritableBridge.readString(86, __dbResults);
    this.son_hotel_address = JdbcWritableBridge.readString(87, __dbResults);
    this.baojian_total = JdbcWritableBridge.readInteger(88, __dbResults);
    this.tips = JdbcWritableBridge.readString(89, __dbResults);
    this.qqgid = JdbcWritableBridge.readLong(90, __dbResults);
    this.payment_method = JdbcWritableBridge.readString(91, __dbResults);
    this.payment_condition = JdbcWritableBridge.readString(92, __dbResults);
    this.through_coupon_total = JdbcWritableBridge.readInteger(93, __dbResults);
    this.subtitle = JdbcWritableBridge.readString(94, __dbResults);
    this.leave_time = JdbcWritableBridge.readString(95, __dbResults);
    this.refund_support = JdbcWritableBridge.readInteger(96, __dbResults);
    this.traffic_desc = JdbcWritableBridge.readString(97, __dbResults);
    this.scenic_desc = JdbcWritableBridge.readString(98, __dbResults);
    this.money_use_detail = JdbcWritableBridge.readString(99, __dbResults);
    this.good_food = JdbcWritableBridge.readString(100, __dbResults);
    this.hotel_desc = JdbcWritableBridge.readString(101, __dbResults);
    this.hide_room_type = JdbcWritableBridge.readString(102, __dbResults);
    this.modeldisplay = JdbcWritableBridge.readString(103, __dbResults);
    this.if_need_visa = JdbcWritableBridge.readBoolean(104, __dbResults);
    this.buy_tips = JdbcWritableBridge.readString(105, __dbResults);
    this.is_new_team = JdbcWritableBridge.readInteger(106, __dbResults);
    this.related_sight = JdbcWritableBridge.readString(107, __dbResults);
    this.publish_2dcode = JdbcWritableBridge.readString(108, __dbResults);
    this.settlement_id = JdbcWritableBridge.readLong(109, __dbResults);
    this.settlement_days = JdbcWritableBridge.readLong(110, __dbResults);
    this.ticket_input_time = JdbcWritableBridge.readTimestamp(111, __dbResults);
    this.expressno_input_time = JdbcWritableBridge.readTimestamp(112, __dbResults);
    this.last_back_time = JdbcWritableBridge.readTimestamp(113, __dbResults);
    this.pre_sale = JdbcWritableBridge.readString(114, __dbResults);
    this.use_time_limit = JdbcWritableBridge.readString(115, __dbResults);
    this.travel_nights = JdbcWritableBridge.readString(116, __dbResults);
    this.topic_label = JdbcWritableBridge.readString(117, __dbResults);
    this.purchase_option = JdbcWritableBridge.readString(118, __dbResults);
    this.price_type = JdbcWritableBridge.readString(119, __dbResults);
    this.hide_room_status = JdbcWritableBridge.readString(120, __dbResults);
    this.suggest_reason = JdbcWritableBridge.readString(121, __dbResults);
    this.holiday_tts = JdbcWritableBridge.readInteger(122, __dbResults);
    this.tts_mul_price = JdbcWritableBridge.readInteger(123, __dbResults);
    this.tts_id = JdbcWritableBridge.readString(124, __dbResults);
    this.hms_can_book = JdbcWritableBridge.readInteger(125, __dbResults);
    this.hms_unlock = JdbcWritableBridge.readInteger(126, __dbResults);
    this.detail_table = JdbcWritableBridge.readInteger(127, __dbResults);
    this.holidaytts_publish_request = JdbcWritableBridge.readInteger(128, __dbResults);
    this.downline_time = JdbcWritableBridge.readTimestamp(129, __dbResults);
    this.express_expire_time = JdbcWritableBridge.readTimestamp(130, __dbResults);
    this.holidaytts_free_package = JdbcWritableBridge.readInteger(131, __dbResults);
    this.new_type = JdbcWritableBridge.readString(132, __dbResults);
    this.holidaytts_distribution_way = JdbcWritableBridge.readString(133, __dbResults);
    this.holidaytts_pay_way = JdbcWritableBridge.readString(134, __dbResults);
    this.holiday_tts_ticket_type = JdbcWritableBridge.readString(135, __dbResults);
    this.tuanhide = JdbcWritableBridge.readInteger(136, __dbResults);
    this.holidaytts_ticket_id = JdbcWritableBridge.readString(137, __dbResults);
    this.is_active_hoteldesc = JdbcWritableBridge.readInteger(138, __dbResults);
    this.team_display_type = JdbcWritableBridge.readString(139, __dbResults);
    this.holiday_tts_taocan = JdbcWritableBridge.readString(140, __dbResults);
    this.holidaytts_scheduler = JdbcWritableBridge.readString(141, __dbResults);
    this.sight_info = JdbcWritableBridge.readString(142, __dbResults);
    this.holidaytts_id = JdbcWritableBridge.readInteger(143, __dbResults);
    this.holidaytts_ext_info = JdbcWritableBridge.readString(144, __dbResults);
    this.new_attr = JdbcWritableBridge.readString(145, __dbResults);
    this.partner_source = JdbcWritableBridge.readInteger(146, __dbResults);
    this.other_tuan_type = JdbcWritableBridge.readString(147, __dbResults);
    this.other_tuan_id = JdbcWritableBridge.readLong(148, __dbResults);
    this.other_tuan_detail = JdbcWritableBridge.readString(149, __dbResults);
    this.tags = JdbcWritableBridge.readString(150, __dbResults);
    this.refund_condition = JdbcWritableBridge.readString(151, __dbResults);
    this.other_tuan_data = JdbcWritableBridge.readString(152, __dbResults);
    this.sign_company = JdbcWritableBridge.readInteger(153, __dbResults);
    this.settlement_type = JdbcWritableBridge.readString(154, __dbResults);
    this.is_union_product = JdbcWritableBridge.readInteger(155, __dbResults);
    this.tuan_product_type = JdbcWritableBridge.readString(156, __dbResults);
    this.pre_date = JdbcWritableBridge.readInteger(157, __dbResults);
    this.tel_book = JdbcWritableBridge.readInteger(158, __dbResults);
    this.version = JdbcWritableBridge.readLong(159, __dbResults);
    this.url_short = JdbcWritableBridge.readString(160, __dbResults);
    this.other_notice = JdbcWritableBridge.readString(161, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(162, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(163, __dbResults);
    this.source_type = JdbcWritableBridge.readInteger(164, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.user_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.title = JdbcWritableBridge.readString(3, __dbResults);
    this.summary = JdbcWritableBridge.readString(4, __dbResults);
    this.city_id = JdbcWritableBridge.readLong(5, __dbResults);
    this.group_id = JdbcWritableBridge.readLong(6, __dbResults);
    this.partner_id = JdbcWritableBridge.readLong(7, __dbResults);
    this.system = JdbcWritableBridge.readString(8, __dbResults);
    this.team_price = JdbcWritableBridge.readFloat(9, __dbResults);
    this.market_price = JdbcWritableBridge.readFloat(10, __dbResults);
    this.product = JdbcWritableBridge.readString(11, __dbResults);
    this.condbuy = JdbcWritableBridge.readString(12, __dbResults);
    this.per_number = JdbcWritableBridge.readLong(13, __dbResults);
    this.min_number = JdbcWritableBridge.readLong(14, __dbResults);
    this.max_number = JdbcWritableBridge.readLong(15, __dbResults);
    this.now_number = JdbcWritableBridge.readLong(16, __dbResults);
    this.pre_number = JdbcWritableBridge.readLong(17, __dbResults);
    this.image = JdbcWritableBridge.readString(18, __dbResults);
    this.image1 = JdbcWritableBridge.readString(19, __dbResults);
    this.image2 = JdbcWritableBridge.readString(20, __dbResults);
    this.flv = JdbcWritableBridge.readString(21, __dbResults);
    this.mobile = JdbcWritableBridge.readString(22, __dbResults);
    this.credit = JdbcWritableBridge.readLong(23, __dbResults);
    this.card = JdbcWritableBridge.readLong(24, __dbResults);
    this.fare = JdbcWritableBridge.readLong(25, __dbResults);
    this.farefree = JdbcWritableBridge.readLong(26, __dbResults);
    this.bonus = JdbcWritableBridge.readLong(27, __dbResults);
    this.address = JdbcWritableBridge.readString(28, __dbResults);
    this.detail = JdbcWritableBridge.readString(29, __dbResults);
    this.systemreview = JdbcWritableBridge.readString(30, __dbResults);
    this.userreview = JdbcWritableBridge.readString(31, __dbResults);
    this.notice = JdbcWritableBridge.readString(32, __dbResults);
    this.express = JdbcWritableBridge.readString(33, __dbResults);
    this.delivery = JdbcWritableBridge.readString(34, __dbResults);
    this.state = JdbcWritableBridge.readString(35, __dbResults);
    this.conduser = JdbcWritableBridge.readString(36, __dbResults);
    this.buyonce = JdbcWritableBridge.readString(37, __dbResults);
    this.team_type = JdbcWritableBridge.readString(38, __dbResults);
    this.sort_order = JdbcWritableBridge.readLong(39, __dbResults);
    this.expire_time = JdbcWritableBridge.readLong(40, __dbResults);
    this.begin_time = JdbcWritableBridge.readLong(41, __dbResults);
    this.end_time = JdbcWritableBridge.readLong(42, __dbResults);
    this.reach_time = JdbcWritableBridge.readLong(43, __dbResults);
    this.close_time = JdbcWritableBridge.readLong(44, __dbResults);
    this.seo_title = JdbcWritableBridge.readString(45, __dbResults);
    this.seo_keyword = JdbcWritableBridge.readString(46, __dbResults);
    this.seo_description = JdbcWritableBridge.readString(47, __dbResults);
    this.stitle = JdbcWritableBridge.readString(48, __dbResults);
    this.sales = JdbcWritableBridge.readString(49, __dbResults);
    this.publish = JdbcWritableBridge.readString(50, __dbResults);
    this.profit = JdbcWritableBridge.readLong(51, __dbResults);
    this.hotel_seq = JdbcWritableBridge.readString(52, __dbResults);
    this.order_type = JdbcWritableBridge.readString(53, __dbResults);
    this.hide_partner = JdbcWritableBridge.readString(54, __dbResults);
    this.departure = JdbcWritableBridge.readString(55, __dbResults);
    this.arrive = JdbcWritableBridge.readString(56, __dbResults);
    this.extra_sms = JdbcWritableBridge.readString(57, __dbResults);
    this.room_type = JdbcWritableBridge.readString(58, __dbResults);
    this.sort_tag = JdbcWritableBridge.readString(59, __dbResults);
    this.check_in_time = JdbcWritableBridge.readLong(60, __dbResults);
    this.wireless_team_desc = JdbcWritableBridge.readString(61, __dbResults);
    this.wireless_special_notes = JdbcWritableBridge.readString(62, __dbResults);
    this.wireless_long_lat = JdbcWritableBridge.readString(63, __dbResults);
    this.express_fee = JdbcWritableBridge.readFloat(64, __dbResults);
    this.travel_days = JdbcWritableBridge.readString(65, __dbResults);
    this.travel_status = JdbcWritableBridge.readString(66, __dbResults);
    this.popularize = JdbcWritableBridge.readInteger(67, __dbResults);
    this.major_popularize = JdbcWritableBridge.readInteger(68, __dbResults);
    this.have_popularize = JdbcWritableBridge.readLong(69, __dbResults);
    this.bannerimage = JdbcWritableBridge.readString(70, __dbResults);
    this.earliest_start = JdbcWritableBridge.readLong(71, __dbResults);
    this.room_desc = JdbcWritableBridge.readString(72, __dbResults);
    this.cost_price = JdbcWritableBridge.readFloat(73, __dbResults);
    this.red_envelope = JdbcWritableBridge.readLong(74, __dbResults);
    this.team_price_high = JdbcWritableBridge.readFloat(75, __dbResults);
    this.market_price_high = JdbcWritableBridge.readFloat(76, __dbResults);
    this.flight_max_discount = JdbcWritableBridge.readString(77, __dbResults);
    this.flight_max_save = JdbcWritableBridge.readString(78, __dbResults);
    this.hotel_type = JdbcWritableBridge.readString(79, __dbResults);
    this.voucher_val = JdbcWritableBridge.readInteger(80, __dbResults);
    this.travel_long = JdbcWritableBridge.readInteger(81, __dbResults);
    this.p_team_id = JdbcWritableBridge.readLong(82, __dbResults);
    this.tuan_room_type = JdbcWritableBridge.readString(83, __dbResults);
    this.tuan_project_name = JdbcWritableBridge.readString(84, __dbResults);
    this.tuan_project_des = JdbcWritableBridge.readString(85, __dbResults);
    this.son_hotel_names = JdbcWritableBridge.readString(86, __dbResults);
    this.son_hotel_address = JdbcWritableBridge.readString(87, __dbResults);
    this.baojian_total = JdbcWritableBridge.readInteger(88, __dbResults);
    this.tips = JdbcWritableBridge.readString(89, __dbResults);
    this.qqgid = JdbcWritableBridge.readLong(90, __dbResults);
    this.payment_method = JdbcWritableBridge.readString(91, __dbResults);
    this.payment_condition = JdbcWritableBridge.readString(92, __dbResults);
    this.through_coupon_total = JdbcWritableBridge.readInteger(93, __dbResults);
    this.subtitle = JdbcWritableBridge.readString(94, __dbResults);
    this.leave_time = JdbcWritableBridge.readString(95, __dbResults);
    this.refund_support = JdbcWritableBridge.readInteger(96, __dbResults);
    this.traffic_desc = JdbcWritableBridge.readString(97, __dbResults);
    this.scenic_desc = JdbcWritableBridge.readString(98, __dbResults);
    this.money_use_detail = JdbcWritableBridge.readString(99, __dbResults);
    this.good_food = JdbcWritableBridge.readString(100, __dbResults);
    this.hotel_desc = JdbcWritableBridge.readString(101, __dbResults);
    this.hide_room_type = JdbcWritableBridge.readString(102, __dbResults);
    this.modeldisplay = JdbcWritableBridge.readString(103, __dbResults);
    this.if_need_visa = JdbcWritableBridge.readBoolean(104, __dbResults);
    this.buy_tips = JdbcWritableBridge.readString(105, __dbResults);
    this.is_new_team = JdbcWritableBridge.readInteger(106, __dbResults);
    this.related_sight = JdbcWritableBridge.readString(107, __dbResults);
    this.publish_2dcode = JdbcWritableBridge.readString(108, __dbResults);
    this.settlement_id = JdbcWritableBridge.readLong(109, __dbResults);
    this.settlement_days = JdbcWritableBridge.readLong(110, __dbResults);
    this.ticket_input_time = JdbcWritableBridge.readTimestamp(111, __dbResults);
    this.expressno_input_time = JdbcWritableBridge.readTimestamp(112, __dbResults);
    this.last_back_time = JdbcWritableBridge.readTimestamp(113, __dbResults);
    this.pre_sale = JdbcWritableBridge.readString(114, __dbResults);
    this.use_time_limit = JdbcWritableBridge.readString(115, __dbResults);
    this.travel_nights = JdbcWritableBridge.readString(116, __dbResults);
    this.topic_label = JdbcWritableBridge.readString(117, __dbResults);
    this.purchase_option = JdbcWritableBridge.readString(118, __dbResults);
    this.price_type = JdbcWritableBridge.readString(119, __dbResults);
    this.hide_room_status = JdbcWritableBridge.readString(120, __dbResults);
    this.suggest_reason = JdbcWritableBridge.readString(121, __dbResults);
    this.holiday_tts = JdbcWritableBridge.readInteger(122, __dbResults);
    this.tts_mul_price = JdbcWritableBridge.readInteger(123, __dbResults);
    this.tts_id = JdbcWritableBridge.readString(124, __dbResults);
    this.hms_can_book = JdbcWritableBridge.readInteger(125, __dbResults);
    this.hms_unlock = JdbcWritableBridge.readInteger(126, __dbResults);
    this.detail_table = JdbcWritableBridge.readInteger(127, __dbResults);
    this.holidaytts_publish_request = JdbcWritableBridge.readInteger(128, __dbResults);
    this.downline_time = JdbcWritableBridge.readTimestamp(129, __dbResults);
    this.express_expire_time = JdbcWritableBridge.readTimestamp(130, __dbResults);
    this.holidaytts_free_package = JdbcWritableBridge.readInteger(131, __dbResults);
    this.new_type = JdbcWritableBridge.readString(132, __dbResults);
    this.holidaytts_distribution_way = JdbcWritableBridge.readString(133, __dbResults);
    this.holidaytts_pay_way = JdbcWritableBridge.readString(134, __dbResults);
    this.holiday_tts_ticket_type = JdbcWritableBridge.readString(135, __dbResults);
    this.tuanhide = JdbcWritableBridge.readInteger(136, __dbResults);
    this.holidaytts_ticket_id = JdbcWritableBridge.readString(137, __dbResults);
    this.is_active_hoteldesc = JdbcWritableBridge.readInteger(138, __dbResults);
    this.team_display_type = JdbcWritableBridge.readString(139, __dbResults);
    this.holiday_tts_taocan = JdbcWritableBridge.readString(140, __dbResults);
    this.holidaytts_scheduler = JdbcWritableBridge.readString(141, __dbResults);
    this.sight_info = JdbcWritableBridge.readString(142, __dbResults);
    this.holidaytts_id = JdbcWritableBridge.readInteger(143, __dbResults);
    this.holidaytts_ext_info = JdbcWritableBridge.readString(144, __dbResults);
    this.new_attr = JdbcWritableBridge.readString(145, __dbResults);
    this.partner_source = JdbcWritableBridge.readInteger(146, __dbResults);
    this.other_tuan_type = JdbcWritableBridge.readString(147, __dbResults);
    this.other_tuan_id = JdbcWritableBridge.readLong(148, __dbResults);
    this.other_tuan_detail = JdbcWritableBridge.readString(149, __dbResults);
    this.tags = JdbcWritableBridge.readString(150, __dbResults);
    this.refund_condition = JdbcWritableBridge.readString(151, __dbResults);
    this.other_tuan_data = JdbcWritableBridge.readString(152, __dbResults);
    this.sign_company = JdbcWritableBridge.readInteger(153, __dbResults);
    this.settlement_type = JdbcWritableBridge.readString(154, __dbResults);
    this.is_union_product = JdbcWritableBridge.readInteger(155, __dbResults);
    this.tuan_product_type = JdbcWritableBridge.readString(156, __dbResults);
    this.pre_date = JdbcWritableBridge.readInteger(157, __dbResults);
    this.tel_book = JdbcWritableBridge.readInteger(158, __dbResults);
    this.version = JdbcWritableBridge.readLong(159, __dbResults);
    this.url_short = JdbcWritableBridge.readString(160, __dbResults);
    this.other_notice = JdbcWritableBridge.readString(161, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(162, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(163, __dbResults);
    this.source_type = JdbcWritableBridge.readInteger(164, __dbResults);
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
    JdbcWritableBridge.writeLong(user_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(title, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(summary, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(city_id, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(group_id, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(partner_id, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(system, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(team_price, 9 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(market_price, 10 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(product, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(condbuy, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(per_number, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(min_number, 14 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(max_number, 15 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(now_number, 16 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(pre_number, 17 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(image, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(image1, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(image2, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(flv, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mobile, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(credit, 23 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(card, 24 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fare, 25 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(farefree, 26 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(bonus, 27 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(address, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(detail, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(systemreview, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(userreview, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(notice, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(express, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(delivery, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(conduser, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buyonce, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(team_type, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(sort_order, 39 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(expire_time, 40 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(begin_time, 41 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(end_time, 42 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(reach_time, 43 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(close_time, 44 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(seo_title, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(seo_keyword, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(seo_description, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stitle, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sales, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(publish, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(profit, 51 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(hotel_seq, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(order_type, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hide_partner, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(departure, 55 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(arrive, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(extra_sms, 57 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(room_type, 58 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sort_tag, 59 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(check_in_time, 60 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(wireless_team_desc, 61 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(wireless_special_notes, 62 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(wireless_long_lat, 63 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(express_fee, 64 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(travel_days, 65 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(travel_status, 66 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(popularize, 67 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(major_popularize, 68 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(have_popularize, 69 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(bannerimage, 70 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(earliest_start, 71 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(room_desc, 72 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(cost_price, 73 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeLong(red_envelope, 74 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeFloat(team_price_high, 75 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(market_price_high, 76 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(flight_max_discount, 77 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(flight_max_save, 78 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_type, 79 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(voucher_val, 80 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(travel_long, 81 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(p_team_id, 82 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(tuan_room_type, 83 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tuan_project_name, 84 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tuan_project_des, 85 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(son_hotel_names, 86 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(son_hotel_address, 87 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(baojian_total, 88 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(tips, 89 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(qqgid, 90 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(payment_method, 91 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(payment_condition, 92 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(through_coupon_total, 93 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(subtitle, 94 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(leave_time, 95 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(refund_support, 96 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(traffic_desc, 97 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(scenic_desc, 98 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(money_use_detail, 99 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(good_food, 100 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_desc, 101 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hide_room_type, 102 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(modeldisplay, 103 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(if_need_visa, 104 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(buy_tips, 105 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(is_new_team, 106 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(related_sight, 107 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(publish_2dcode, 108 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeLong(settlement_id, 109 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(settlement_days, 110 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ticket_input_time, 111 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(expressno_input_time, 112 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(last_back_time, 113 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(pre_sale, 114 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(use_time_limit, 115 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(travel_nights, 116 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(topic_label, 117 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(purchase_option, 118 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeString(price_type, 119 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hide_room_status, 120 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(suggest_reason, 121 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(holiday_tts, 122 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(tts_mul_price, 123 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(tts_id, 124 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(hms_can_book, 125 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(hms_unlock, 126 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(detail_table, 127 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(holidaytts_publish_request, 128 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(downline_time, 129 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(express_expire_time, 130 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(holidaytts_free_package, 131 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(new_type, 132 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(holidaytts_distribution_way, 133 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(holidaytts_pay_way, 134 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(holiday_tts_ticket_type, 135 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(tuanhide, 136 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(holidaytts_ticket_id, 137 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(is_active_hoteldesc, 138 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(team_display_type, 139 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(holiday_tts_taocan, 140 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeString(holidaytts_scheduler, 141 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sight_info, 142 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeInteger(holidaytts_id, 143 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(holidaytts_ext_info, 144 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeString(new_attr, 145 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(partner_source, 146 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(other_tuan_type, 147 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(other_tuan_id, 148 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(other_tuan_detail, 149 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tags, 150 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeString(refund_condition, 151 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(other_tuan_data, 152 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(sign_company, 153 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(settlement_type, 154 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(is_union_product, 155 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(tuan_product_type, 156 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(pre_date, 157 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(tel_book, 158 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(version, 159 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(url_short, 160 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(other_notice, 161 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 162 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 163 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(source_type, 164 + __off, 4, __dbStmt);
    return 164;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(user_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(title, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(summary, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(city_id, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(group_id, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(partner_id, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(system, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(team_price, 9 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(market_price, 10 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(product, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(condbuy, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(per_number, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(min_number, 14 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(max_number, 15 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(now_number, 16 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(pre_number, 17 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(image, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(image1, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(image2, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(flv, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mobile, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(credit, 23 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(card, 24 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fare, 25 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(farefree, 26 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(bonus, 27 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(address, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(detail, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(systemreview, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(userreview, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(notice, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(express, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(delivery, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(conduser, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(buyonce, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(team_type, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(sort_order, 39 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(expire_time, 40 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(begin_time, 41 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(end_time, 42 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(reach_time, 43 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(close_time, 44 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(seo_title, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(seo_keyword, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(seo_description, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stitle, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sales, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(publish, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(profit, 51 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(hotel_seq, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(order_type, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hide_partner, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(departure, 55 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(arrive, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(extra_sms, 57 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(room_type, 58 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sort_tag, 59 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(check_in_time, 60 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(wireless_team_desc, 61 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(wireless_special_notes, 62 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(wireless_long_lat, 63 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(express_fee, 64 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(travel_days, 65 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(travel_status, 66 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(popularize, 67 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(major_popularize, 68 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(have_popularize, 69 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(bannerimage, 70 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(earliest_start, 71 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(room_desc, 72 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(cost_price, 73 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeLong(red_envelope, 74 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeFloat(team_price_high, 75 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(market_price_high, 76 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(flight_max_discount, 77 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(flight_max_save, 78 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_type, 79 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(voucher_val, 80 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(travel_long, 81 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(p_team_id, 82 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(tuan_room_type, 83 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tuan_project_name, 84 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tuan_project_des, 85 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(son_hotel_names, 86 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(son_hotel_address, 87 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(baojian_total, 88 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(tips, 89 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(qqgid, 90 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(payment_method, 91 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(payment_condition, 92 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(through_coupon_total, 93 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(subtitle, 94 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(leave_time, 95 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(refund_support, 96 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(traffic_desc, 97 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(scenic_desc, 98 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(money_use_detail, 99 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(good_food, 100 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hotel_desc, 101 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hide_room_type, 102 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(modeldisplay, 103 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(if_need_visa, 104 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(buy_tips, 105 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(is_new_team, 106 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(related_sight, 107 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(publish_2dcode, 108 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeLong(settlement_id, 109 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(settlement_days, 110 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ticket_input_time, 111 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(expressno_input_time, 112 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(last_back_time, 113 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(pre_sale, 114 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(use_time_limit, 115 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(travel_nights, 116 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(topic_label, 117 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(purchase_option, 118 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeString(price_type, 119 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hide_room_status, 120 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(suggest_reason, 121 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(holiday_tts, 122 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(tts_mul_price, 123 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(tts_id, 124 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(hms_can_book, 125 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(hms_unlock, 126 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(detail_table, 127 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(holidaytts_publish_request, 128 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(downline_time, 129 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(express_expire_time, 130 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(holidaytts_free_package, 131 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(new_type, 132 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(holidaytts_distribution_way, 133 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(holidaytts_pay_way, 134 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(holiday_tts_ticket_type, 135 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(tuanhide, 136 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(holidaytts_ticket_id, 137 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(is_active_hoteldesc, 138 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(team_display_type, 139 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(holiday_tts_taocan, 140 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeString(holidaytts_scheduler, 141 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sight_info, 142 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeInteger(holidaytts_id, 143 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(holidaytts_ext_info, 144 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeString(new_attr, 145 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(partner_source, 146 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(other_tuan_type, 147 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(other_tuan_id, 148 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(other_tuan_detail, 149 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tags, 150 + __off, 1111, __dbStmt);
    JdbcWritableBridge.writeString(refund_condition, 151 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(other_tuan_data, 152 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(sign_company, 153 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(settlement_type, 154 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(is_union_product, 155 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(tuan_product_type, 156 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(pre_date, 157 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(tel_book, 158 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(version, 159 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(url_short, 160 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(other_notice, 161 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 162 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 163 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(source_type, 164 + __off, 4, __dbStmt);
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
        this.user_id = null;
    } else {
    this.user_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.title = null;
    } else {
    this.title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.summary = null;
    } else {
    this.summary = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city_id = null;
    } else {
    this.city_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.group_id = null;
    } else {
    this.group_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.partner_id = null;
    } else {
    this.partner_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.system = null;
    } else {
    this.system = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.team_price = null;
    } else {
    this.team_price = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.market_price = null;
    } else {
    this.market_price = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.product = null;
    } else {
    this.product = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.condbuy = null;
    } else {
    this.condbuy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.per_number = null;
    } else {
    this.per_number = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.min_number = null;
    } else {
    this.min_number = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.max_number = null;
    } else {
    this.max_number = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.now_number = null;
    } else {
    this.now_number = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.pre_number = null;
    } else {
    this.pre_number = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.image = null;
    } else {
    this.image = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.image1 = null;
    } else {
    this.image1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.image2 = null;
    } else {
    this.image2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flv = null;
    } else {
    this.flv = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.mobile = null;
    } else {
    this.mobile = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.credit = null;
    } else {
    this.credit = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.card = null;
    } else {
    this.card = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fare = null;
    } else {
    this.fare = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.farefree = null;
    } else {
    this.farefree = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.bonus = null;
    } else {
    this.bonus = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.address = null;
    } else {
    this.address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.detail = null;
    } else {
    this.detail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.systemreview = null;
    } else {
    this.systemreview = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.userreview = null;
    } else {
    this.userreview = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.notice = null;
    } else {
    this.notice = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.express = null;
    } else {
    this.express = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.delivery = null;
    } else {
    this.delivery = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.state = null;
    } else {
    this.state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.conduser = null;
    } else {
    this.conduser = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.buyonce = null;
    } else {
    this.buyonce = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.team_type = null;
    } else {
    this.team_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sort_order = null;
    } else {
    this.sort_order = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.expire_time = null;
    } else {
    this.expire_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.begin_time = null;
    } else {
    this.begin_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.end_time = null;
    } else {
    this.end_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.reach_time = null;
    } else {
    this.reach_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.close_time = null;
    } else {
    this.close_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.seo_title = null;
    } else {
    this.seo_title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.seo_keyword = null;
    } else {
    this.seo_keyword = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.seo_description = null;
    } else {
    this.seo_description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.stitle = null;
    } else {
    this.stitle = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sales = null;
    } else {
    this.sales = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.publish = null;
    } else {
    this.publish = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.profit = null;
    } else {
    this.profit = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_seq = null;
    } else {
    this.hotel_seq = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_type = null;
    } else {
    this.order_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hide_partner = null;
    } else {
    this.hide_partner = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.departure = null;
    } else {
    this.departure = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.arrive = null;
    } else {
    this.arrive = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.extra_sms = null;
    } else {
    this.extra_sms = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.room_type = null;
    } else {
    this.room_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sort_tag = null;
    } else {
    this.sort_tag = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.check_in_time = null;
    } else {
    this.check_in_time = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.wireless_team_desc = null;
    } else {
    this.wireless_team_desc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.wireless_special_notes = null;
    } else {
    this.wireless_special_notes = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.wireless_long_lat = null;
    } else {
    this.wireless_long_lat = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.express_fee = null;
    } else {
    this.express_fee = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.travel_days = null;
    } else {
    this.travel_days = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.travel_status = null;
    } else {
    this.travel_status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.popularize = null;
    } else {
    this.popularize = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.major_popularize = null;
    } else {
    this.major_popularize = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.have_popularize = null;
    } else {
    this.have_popularize = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.bannerimage = null;
    } else {
    this.bannerimage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.earliest_start = null;
    } else {
    this.earliest_start = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.room_desc = null;
    } else {
    this.room_desc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cost_price = null;
    } else {
    this.cost_price = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.red_envelope = null;
    } else {
    this.red_envelope = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.team_price_high = null;
    } else {
    this.team_price_high = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.market_price_high = null;
    } else {
    this.market_price_high = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.flight_max_discount = null;
    } else {
    this.flight_max_discount = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flight_max_save = null;
    } else {
    this.flight_max_save = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_type = null;
    } else {
    this.hotel_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.voucher_val = null;
    } else {
    this.voucher_val = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.travel_long = null;
    } else {
    this.travel_long = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.p_team_id = null;
    } else {
    this.p_team_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.tuan_room_type = null;
    } else {
    this.tuan_room_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tuan_project_name = null;
    } else {
    this.tuan_project_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tuan_project_des = null;
    } else {
    this.tuan_project_des = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.son_hotel_names = null;
    } else {
    this.son_hotel_names = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.son_hotel_address = null;
    } else {
    this.son_hotel_address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.baojian_total = null;
    } else {
    this.baojian_total = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tips = null;
    } else {
    this.tips = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.qqgid = null;
    } else {
    this.qqgid = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.payment_method = null;
    } else {
    this.payment_method = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.payment_condition = null;
    } else {
    this.payment_condition = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.through_coupon_total = null;
    } else {
    this.through_coupon_total = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.subtitle = null;
    } else {
    this.subtitle = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.leave_time = null;
    } else {
    this.leave_time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.refund_support = null;
    } else {
    this.refund_support = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.traffic_desc = null;
    } else {
    this.traffic_desc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.scenic_desc = null;
    } else {
    this.scenic_desc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.money_use_detail = null;
    } else {
    this.money_use_detail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.good_food = null;
    } else {
    this.good_food = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hotel_desc = null;
    } else {
    this.hotel_desc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hide_room_type = null;
    } else {
    this.hide_room_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.modeldisplay = null;
    } else {
    this.modeldisplay = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.if_need_visa = null;
    } else {
    this.if_need_visa = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.buy_tips = null;
    } else {
    this.buy_tips = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.is_new_team = null;
    } else {
    this.is_new_team = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.related_sight = null;
    } else {
    this.related_sight = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.publish_2dcode = null;
    } else {
    this.publish_2dcode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.settlement_id = null;
    } else {
    this.settlement_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.settlement_days = null;
    } else {
    this.settlement_days = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.ticket_input_time = null;
    } else {
    this.ticket_input_time = new Timestamp(__dataIn.readLong());
    this.ticket_input_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.expressno_input_time = null;
    } else {
    this.expressno_input_time = new Timestamp(__dataIn.readLong());
    this.expressno_input_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.last_back_time = null;
    } else {
    this.last_back_time = new Timestamp(__dataIn.readLong());
    this.last_back_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.pre_sale = null;
    } else {
    this.pre_sale = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.use_time_limit = null;
    } else {
    this.use_time_limit = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.travel_nights = null;
    } else {
    this.travel_nights = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.topic_label = null;
    } else {
    this.topic_label = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.purchase_option = null;
    } else {
    this.purchase_option = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.price_type = null;
    } else {
    this.price_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hide_room_status = null;
    } else {
    this.hide_room_status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.suggest_reason = null;
    } else {
    this.suggest_reason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.holiday_tts = null;
    } else {
    this.holiday_tts = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tts_mul_price = null;
    } else {
    this.tts_mul_price = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tts_id = null;
    } else {
    this.tts_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hms_can_book = null;
    } else {
    this.hms_can_book = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.hms_unlock = null;
    } else {
    this.hms_unlock = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.detail_table = null;
    } else {
    this.detail_table = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.holidaytts_publish_request = null;
    } else {
    this.holidaytts_publish_request = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.downline_time = null;
    } else {
    this.downline_time = new Timestamp(__dataIn.readLong());
    this.downline_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.express_expire_time = null;
    } else {
    this.express_expire_time = new Timestamp(__dataIn.readLong());
    this.express_expire_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.holidaytts_free_package = null;
    } else {
    this.holidaytts_free_package = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.new_type = null;
    } else {
    this.new_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.holidaytts_distribution_way = null;
    } else {
    this.holidaytts_distribution_way = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.holidaytts_pay_way = null;
    } else {
    this.holidaytts_pay_way = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.holiday_tts_ticket_type = null;
    } else {
    this.holiday_tts_ticket_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tuanhide = null;
    } else {
    this.tuanhide = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.holidaytts_ticket_id = null;
    } else {
    this.holidaytts_ticket_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.is_active_hoteldesc = null;
    } else {
    this.is_active_hoteldesc = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.team_display_type = null;
    } else {
    this.team_display_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.holiday_tts_taocan = null;
    } else {
    this.holiday_tts_taocan = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.holidaytts_scheduler = null;
    } else {
    this.holidaytts_scheduler = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sight_info = null;
    } else {
    this.sight_info = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.holidaytts_id = null;
    } else {
    this.holidaytts_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.holidaytts_ext_info = null;
    } else {
    this.holidaytts_ext_info = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.new_attr = null;
    } else {
    this.new_attr = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.partner_source = null;
    } else {
    this.partner_source = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.other_tuan_type = null;
    } else {
    this.other_tuan_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.other_tuan_id = null;
    } else {
    this.other_tuan_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.other_tuan_detail = null;
    } else {
    this.other_tuan_detail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tags = null;
    } else {
    this.tags = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.refund_condition = null;
    } else {
    this.refund_condition = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.other_tuan_data = null;
    } else {
    this.other_tuan_data = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sign_company = null;
    } else {
    this.sign_company = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.settlement_type = null;
    } else {
    this.settlement_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.is_union_product = null;
    } else {
    this.is_union_product = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tuan_product_type = null;
    } else {
    this.tuan_product_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pre_date = null;
    } else {
    this.pre_date = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tel_book = null;
    } else {
    this.tel_book = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.version = null;
    } else {
    this.version = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.url_short = null;
    } else {
    this.url_short = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.other_notice = null;
    } else {
    this.other_notice = Text.readString(__dataIn);
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
        this.source_type = null;
    } else {
    this.source_type = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_id);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.summary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, summary);
    }
    if (null == this.city_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.city_id);
    }
    if (null == this.group_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.group_id);
    }
    if (null == this.partner_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.partner_id);
    }
    if (null == this.system) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, system);
    }
    if (null == this.team_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.team_price);
    }
    if (null == this.market_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.market_price);
    }
    if (null == this.product) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product);
    }
    if (null == this.condbuy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, condbuy);
    }
    if (null == this.per_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.per_number);
    }
    if (null == this.min_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.min_number);
    }
    if (null == this.max_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.max_number);
    }
    if (null == this.now_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.now_number);
    }
    if (null == this.pre_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.pre_number);
    }
    if (null == this.image) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, image);
    }
    if (null == this.image1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, image1);
    }
    if (null == this.image2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, image2);
    }
    if (null == this.flv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flv);
    }
    if (null == this.mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mobile);
    }
    if (null == this.credit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.credit);
    }
    if (null == this.card) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.card);
    }
    if (null == this.fare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fare);
    }
    if (null == this.farefree) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.farefree);
    }
    if (null == this.bonus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.bonus);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.detail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, detail);
    }
    if (null == this.systemreview) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, systemreview);
    }
    if (null == this.userreview) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, userreview);
    }
    if (null == this.notice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, notice);
    }
    if (null == this.express) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, express);
    }
    if (null == this.delivery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, delivery);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.conduser) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, conduser);
    }
    if (null == this.buyonce) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buyonce);
    }
    if (null == this.team_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_type);
    }
    if (null == this.sort_order) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sort_order);
    }
    if (null == this.expire_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expire_time);
    }
    if (null == this.begin_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.begin_time);
    }
    if (null == this.end_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.end_time);
    }
    if (null == this.reach_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.reach_time);
    }
    if (null == this.close_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.close_time);
    }
    if (null == this.seo_title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seo_title);
    }
    if (null == this.seo_keyword) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seo_keyword);
    }
    if (null == this.seo_description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seo_description);
    }
    if (null == this.stitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stitle);
    }
    if (null == this.sales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sales);
    }
    if (null == this.publish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, publish);
    }
    if (null == this.profit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.profit);
    }
    if (null == this.hotel_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_seq);
    }
    if (null == this.order_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_type);
    }
    if (null == this.hide_partner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hide_partner);
    }
    if (null == this.departure) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, departure);
    }
    if (null == this.arrive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, arrive);
    }
    if (null == this.extra_sms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, extra_sms);
    }
    if (null == this.room_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, room_type);
    }
    if (null == this.sort_tag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sort_tag);
    }
    if (null == this.check_in_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.check_in_time);
    }
    if (null == this.wireless_team_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, wireless_team_desc);
    }
    if (null == this.wireless_special_notes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, wireless_special_notes);
    }
    if (null == this.wireless_long_lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, wireless_long_lat);
    }
    if (null == this.express_fee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.express_fee);
    }
    if (null == this.travel_days) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, travel_days);
    }
    if (null == this.travel_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, travel_status);
    }
    if (null == this.popularize) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.popularize);
    }
    if (null == this.major_popularize) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.major_popularize);
    }
    if (null == this.have_popularize) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.have_popularize);
    }
    if (null == this.bannerimage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bannerimage);
    }
    if (null == this.earliest_start) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.earliest_start);
    }
    if (null == this.room_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, room_desc);
    }
    if (null == this.cost_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.cost_price);
    }
    if (null == this.red_envelope) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.red_envelope);
    }
    if (null == this.team_price_high) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.team_price_high);
    }
    if (null == this.market_price_high) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.market_price_high);
    }
    if (null == this.flight_max_discount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flight_max_discount);
    }
    if (null == this.flight_max_save) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flight_max_save);
    }
    if (null == this.hotel_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_type);
    }
    if (null == this.voucher_val) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.voucher_val);
    }
    if (null == this.travel_long) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.travel_long);
    }
    if (null == this.p_team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.p_team_id);
    }
    if (null == this.tuan_room_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tuan_room_type);
    }
    if (null == this.tuan_project_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tuan_project_name);
    }
    if (null == this.tuan_project_des) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tuan_project_des);
    }
    if (null == this.son_hotel_names) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, son_hotel_names);
    }
    if (null == this.son_hotel_address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, son_hotel_address);
    }
    if (null == this.baojian_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.baojian_total);
    }
    if (null == this.tips) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tips);
    }
    if (null == this.qqgid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.qqgid);
    }
    if (null == this.payment_method) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, payment_method);
    }
    if (null == this.payment_condition) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, payment_condition);
    }
    if (null == this.through_coupon_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.through_coupon_total);
    }
    if (null == this.subtitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, subtitle);
    }
    if (null == this.leave_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, leave_time);
    }
    if (null == this.refund_support) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.refund_support);
    }
    if (null == this.traffic_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, traffic_desc);
    }
    if (null == this.scenic_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, scenic_desc);
    }
    if (null == this.money_use_detail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, money_use_detail);
    }
    if (null == this.good_food) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, good_food);
    }
    if (null == this.hotel_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_desc);
    }
    if (null == this.hide_room_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hide_room_type);
    }
    if (null == this.modeldisplay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, modeldisplay);
    }
    if (null == this.if_need_visa) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.if_need_visa);
    }
    if (null == this.buy_tips) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_tips);
    }
    if (null == this.is_new_team) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_new_team);
    }
    if (null == this.related_sight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, related_sight);
    }
    if (null == this.publish_2dcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, publish_2dcode);
    }
    if (null == this.settlement_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.settlement_id);
    }
    if (null == this.settlement_days) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.settlement_days);
    }
    if (null == this.ticket_input_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ticket_input_time.getTime());
    __dataOut.writeInt(this.ticket_input_time.getNanos());
    }
    if (null == this.expressno_input_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expressno_input_time.getTime());
    __dataOut.writeInt(this.expressno_input_time.getNanos());
    }
    if (null == this.last_back_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_back_time.getTime());
    __dataOut.writeInt(this.last_back_time.getNanos());
    }
    if (null == this.pre_sale) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pre_sale);
    }
    if (null == this.use_time_limit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, use_time_limit);
    }
    if (null == this.travel_nights) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, travel_nights);
    }
    if (null == this.topic_label) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, topic_label);
    }
    if (null == this.purchase_option) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, purchase_option);
    }
    if (null == this.price_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, price_type);
    }
    if (null == this.hide_room_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hide_room_status);
    }
    if (null == this.suggest_reason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, suggest_reason);
    }
    if (null == this.holiday_tts) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.holiday_tts);
    }
    if (null == this.tts_mul_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tts_mul_price);
    }
    if (null == this.tts_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tts_id);
    }
    if (null == this.hms_can_book) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hms_can_book);
    }
    if (null == this.hms_unlock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hms_unlock);
    }
    if (null == this.detail_table) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.detail_table);
    }
    if (null == this.holidaytts_publish_request) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.holidaytts_publish_request);
    }
    if (null == this.downline_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.downline_time.getTime());
    __dataOut.writeInt(this.downline_time.getNanos());
    }
    if (null == this.express_expire_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.express_expire_time.getTime());
    __dataOut.writeInt(this.express_expire_time.getNanos());
    }
    if (null == this.holidaytts_free_package) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.holidaytts_free_package);
    }
    if (null == this.new_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, new_type);
    }
    if (null == this.holidaytts_distribution_way) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holidaytts_distribution_way);
    }
    if (null == this.holidaytts_pay_way) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holidaytts_pay_way);
    }
    if (null == this.holiday_tts_ticket_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holiday_tts_ticket_type);
    }
    if (null == this.tuanhide) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tuanhide);
    }
    if (null == this.holidaytts_ticket_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holidaytts_ticket_id);
    }
    if (null == this.is_active_hoteldesc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_active_hoteldesc);
    }
    if (null == this.team_display_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_display_type);
    }
    if (null == this.holiday_tts_taocan) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holiday_tts_taocan);
    }
    if (null == this.holidaytts_scheduler) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holidaytts_scheduler);
    }
    if (null == this.sight_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sight_info);
    }
    if (null == this.holidaytts_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.holidaytts_id);
    }
    if (null == this.holidaytts_ext_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holidaytts_ext_info);
    }
    if (null == this.new_attr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, new_attr);
    }
    if (null == this.partner_source) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.partner_source);
    }
    if (null == this.other_tuan_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_tuan_type);
    }
    if (null == this.other_tuan_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.other_tuan_id);
    }
    if (null == this.other_tuan_detail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_tuan_detail);
    }
    if (null == this.tags) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tags);
    }
    if (null == this.refund_condition) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, refund_condition);
    }
    if (null == this.other_tuan_data) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_tuan_data);
    }
    if (null == this.sign_company) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sign_company);
    }
    if (null == this.settlement_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, settlement_type);
    }
    if (null == this.is_union_product) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_union_product);
    }
    if (null == this.tuan_product_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tuan_product_type);
    }
    if (null == this.pre_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.pre_date);
    }
    if (null == this.tel_book) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tel_book);
    }
    if (null == this.version) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.version);
    }
    if (null == this.url_short) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, url_short);
    }
    if (null == this.other_notice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_notice);
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
    if (null == this.source_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.source_type);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_id);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.summary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, summary);
    }
    if (null == this.city_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.city_id);
    }
    if (null == this.group_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.group_id);
    }
    if (null == this.partner_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.partner_id);
    }
    if (null == this.system) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, system);
    }
    if (null == this.team_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.team_price);
    }
    if (null == this.market_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.market_price);
    }
    if (null == this.product) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product);
    }
    if (null == this.condbuy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, condbuy);
    }
    if (null == this.per_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.per_number);
    }
    if (null == this.min_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.min_number);
    }
    if (null == this.max_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.max_number);
    }
    if (null == this.now_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.now_number);
    }
    if (null == this.pre_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.pre_number);
    }
    if (null == this.image) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, image);
    }
    if (null == this.image1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, image1);
    }
    if (null == this.image2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, image2);
    }
    if (null == this.flv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flv);
    }
    if (null == this.mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mobile);
    }
    if (null == this.credit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.credit);
    }
    if (null == this.card) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.card);
    }
    if (null == this.fare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fare);
    }
    if (null == this.farefree) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.farefree);
    }
    if (null == this.bonus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.bonus);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.detail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, detail);
    }
    if (null == this.systemreview) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, systemreview);
    }
    if (null == this.userreview) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, userreview);
    }
    if (null == this.notice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, notice);
    }
    if (null == this.express) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, express);
    }
    if (null == this.delivery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, delivery);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.conduser) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, conduser);
    }
    if (null == this.buyonce) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buyonce);
    }
    if (null == this.team_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_type);
    }
    if (null == this.sort_order) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sort_order);
    }
    if (null == this.expire_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expire_time);
    }
    if (null == this.begin_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.begin_time);
    }
    if (null == this.end_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.end_time);
    }
    if (null == this.reach_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.reach_time);
    }
    if (null == this.close_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.close_time);
    }
    if (null == this.seo_title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seo_title);
    }
    if (null == this.seo_keyword) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seo_keyword);
    }
    if (null == this.seo_description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seo_description);
    }
    if (null == this.stitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stitle);
    }
    if (null == this.sales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sales);
    }
    if (null == this.publish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, publish);
    }
    if (null == this.profit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.profit);
    }
    if (null == this.hotel_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_seq);
    }
    if (null == this.order_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_type);
    }
    if (null == this.hide_partner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hide_partner);
    }
    if (null == this.departure) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, departure);
    }
    if (null == this.arrive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, arrive);
    }
    if (null == this.extra_sms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, extra_sms);
    }
    if (null == this.room_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, room_type);
    }
    if (null == this.sort_tag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sort_tag);
    }
    if (null == this.check_in_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.check_in_time);
    }
    if (null == this.wireless_team_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, wireless_team_desc);
    }
    if (null == this.wireless_special_notes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, wireless_special_notes);
    }
    if (null == this.wireless_long_lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, wireless_long_lat);
    }
    if (null == this.express_fee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.express_fee);
    }
    if (null == this.travel_days) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, travel_days);
    }
    if (null == this.travel_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, travel_status);
    }
    if (null == this.popularize) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.popularize);
    }
    if (null == this.major_popularize) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.major_popularize);
    }
    if (null == this.have_popularize) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.have_popularize);
    }
    if (null == this.bannerimage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bannerimage);
    }
    if (null == this.earliest_start) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.earliest_start);
    }
    if (null == this.room_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, room_desc);
    }
    if (null == this.cost_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.cost_price);
    }
    if (null == this.red_envelope) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.red_envelope);
    }
    if (null == this.team_price_high) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.team_price_high);
    }
    if (null == this.market_price_high) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.market_price_high);
    }
    if (null == this.flight_max_discount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flight_max_discount);
    }
    if (null == this.flight_max_save) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flight_max_save);
    }
    if (null == this.hotel_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_type);
    }
    if (null == this.voucher_val) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.voucher_val);
    }
    if (null == this.travel_long) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.travel_long);
    }
    if (null == this.p_team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.p_team_id);
    }
    if (null == this.tuan_room_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tuan_room_type);
    }
    if (null == this.tuan_project_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tuan_project_name);
    }
    if (null == this.tuan_project_des) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tuan_project_des);
    }
    if (null == this.son_hotel_names) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, son_hotel_names);
    }
    if (null == this.son_hotel_address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, son_hotel_address);
    }
    if (null == this.baojian_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.baojian_total);
    }
    if (null == this.tips) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tips);
    }
    if (null == this.qqgid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.qqgid);
    }
    if (null == this.payment_method) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, payment_method);
    }
    if (null == this.payment_condition) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, payment_condition);
    }
    if (null == this.through_coupon_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.through_coupon_total);
    }
    if (null == this.subtitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, subtitle);
    }
    if (null == this.leave_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, leave_time);
    }
    if (null == this.refund_support) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.refund_support);
    }
    if (null == this.traffic_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, traffic_desc);
    }
    if (null == this.scenic_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, scenic_desc);
    }
    if (null == this.money_use_detail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, money_use_detail);
    }
    if (null == this.good_food) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, good_food);
    }
    if (null == this.hotel_desc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hotel_desc);
    }
    if (null == this.hide_room_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hide_room_type);
    }
    if (null == this.modeldisplay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, modeldisplay);
    }
    if (null == this.if_need_visa) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.if_need_visa);
    }
    if (null == this.buy_tips) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buy_tips);
    }
    if (null == this.is_new_team) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_new_team);
    }
    if (null == this.related_sight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, related_sight);
    }
    if (null == this.publish_2dcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, publish_2dcode);
    }
    if (null == this.settlement_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.settlement_id);
    }
    if (null == this.settlement_days) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.settlement_days);
    }
    if (null == this.ticket_input_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ticket_input_time.getTime());
    __dataOut.writeInt(this.ticket_input_time.getNanos());
    }
    if (null == this.expressno_input_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.expressno_input_time.getTime());
    __dataOut.writeInt(this.expressno_input_time.getNanos());
    }
    if (null == this.last_back_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_back_time.getTime());
    __dataOut.writeInt(this.last_back_time.getNanos());
    }
    if (null == this.pre_sale) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pre_sale);
    }
    if (null == this.use_time_limit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, use_time_limit);
    }
    if (null == this.travel_nights) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, travel_nights);
    }
    if (null == this.topic_label) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, topic_label);
    }
    if (null == this.purchase_option) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, purchase_option);
    }
    if (null == this.price_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, price_type);
    }
    if (null == this.hide_room_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hide_room_status);
    }
    if (null == this.suggest_reason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, suggest_reason);
    }
    if (null == this.holiday_tts) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.holiday_tts);
    }
    if (null == this.tts_mul_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tts_mul_price);
    }
    if (null == this.tts_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tts_id);
    }
    if (null == this.hms_can_book) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hms_can_book);
    }
    if (null == this.hms_unlock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hms_unlock);
    }
    if (null == this.detail_table) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.detail_table);
    }
    if (null == this.holidaytts_publish_request) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.holidaytts_publish_request);
    }
    if (null == this.downline_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.downline_time.getTime());
    __dataOut.writeInt(this.downline_time.getNanos());
    }
    if (null == this.express_expire_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.express_expire_time.getTime());
    __dataOut.writeInt(this.express_expire_time.getNanos());
    }
    if (null == this.holidaytts_free_package) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.holidaytts_free_package);
    }
    if (null == this.new_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, new_type);
    }
    if (null == this.holidaytts_distribution_way) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holidaytts_distribution_way);
    }
    if (null == this.holidaytts_pay_way) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holidaytts_pay_way);
    }
    if (null == this.holiday_tts_ticket_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holiday_tts_ticket_type);
    }
    if (null == this.tuanhide) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tuanhide);
    }
    if (null == this.holidaytts_ticket_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holidaytts_ticket_id);
    }
    if (null == this.is_active_hoteldesc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_active_hoteldesc);
    }
    if (null == this.team_display_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, team_display_type);
    }
    if (null == this.holiday_tts_taocan) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holiday_tts_taocan);
    }
    if (null == this.holidaytts_scheduler) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holidaytts_scheduler);
    }
    if (null == this.sight_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sight_info);
    }
    if (null == this.holidaytts_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.holidaytts_id);
    }
    if (null == this.holidaytts_ext_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, holidaytts_ext_info);
    }
    if (null == this.new_attr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, new_attr);
    }
    if (null == this.partner_source) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.partner_source);
    }
    if (null == this.other_tuan_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_tuan_type);
    }
    if (null == this.other_tuan_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.other_tuan_id);
    }
    if (null == this.other_tuan_detail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_tuan_detail);
    }
    if (null == this.tags) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tags);
    }
    if (null == this.refund_condition) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, refund_condition);
    }
    if (null == this.other_tuan_data) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_tuan_data);
    }
    if (null == this.sign_company) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sign_company);
    }
    if (null == this.settlement_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, settlement_type);
    }
    if (null == this.is_union_product) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_union_product);
    }
    if (null == this.tuan_product_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tuan_product_type);
    }
    if (null == this.pre_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.pre_date);
    }
    if (null == this.tel_book) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tel_book);
    }
    if (null == this.version) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.version);
    }
    if (null == this.url_short) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, url_short);
    }
    if (null == this.other_notice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_notice);
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
    if (null == this.source_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.source_type);
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
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(title==null?"null":title, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(summary==null?"null":summary, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_id==null?"null":"" + city_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(group_id==null?"null":"" + group_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(system==null?"null":system, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_price==null?"null":"" + team_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(market_price==null?"null":"" + market_price, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(product==null?"null":product, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(condbuy==null?"null":condbuy, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(per_number==null?"null":"" + per_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(min_number==null?"null":"" + min_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(max_number==null?"null":"" + max_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(now_number==null?"null":"" + now_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pre_number==null?"null":"" + pre_number, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(image==null?"null":image, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(image1==null?"null":image1, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(image2==null?"null":image2, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(flv==null?"null":flv, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(mobile==null?"null":mobile, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(credit==null?"null":"" + credit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(card==null?"null":"" + card, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fare==null?"null":"" + fare, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(farefree==null?"null":"" + farefree, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bonus==null?"null":"" + bonus, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(address==null?"null":address, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(detail==null?"null":detail, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(systemreview==null?"null":systemreview, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(userreview==null?"null":userreview, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(notice==null?"null":notice, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(express==null?"null":express, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(delivery==null?"null":delivery, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(state==null?"null":state, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(conduser==null?"null":conduser, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(buyonce==null?"null":buyonce, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(team_type==null?"null":team_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sort_order==null?"null":"" + sort_order, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expire_time==null?"null":"" + expire_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(begin_time==null?"null":"" + begin_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_time==null?"null":"" + end_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reach_time==null?"null":"" + reach_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(close_time==null?"null":"" + close_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(seo_title==null?"null":seo_title, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(seo_keyword==null?"null":seo_keyword, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(seo_description==null?"null":seo_description, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(stitle==null?"null":stitle, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(sales==null?"null":sales, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(publish==null?"null":publish, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(profit==null?"null":"" + profit, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hotel_seq==null?"null":hotel_seq, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(order_type==null?"null":order_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hide_partner==null?"null":hide_partner, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(departure==null?"null":departure, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(arrive==null?"null":arrive, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(extra_sms==null?"null":extra_sms, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(room_type==null?"null":room_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(sort_tag==null?"null":sort_tag, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(check_in_time==null?"null":"" + check_in_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(wireless_team_desc==null?"null":wireless_team_desc, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(wireless_special_notes==null?"null":wireless_special_notes, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(wireless_long_lat==null?"null":wireless_long_lat, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(express_fee==null?"null":"" + express_fee, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(travel_days==null?"null":travel_days, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(travel_status==null?"null":travel_status, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(popularize==null?"null":"" + popularize, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(major_popularize==null?"null":"" + major_popularize, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(have_popularize==null?"null":"" + have_popularize, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(bannerimage==null?"null":bannerimage, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(earliest_start==null?"null":"" + earliest_start, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(room_desc==null?"null":room_desc, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cost_price==null?"null":"" + cost_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(red_envelope==null?"null":"" + red_envelope, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_price_high==null?"null":"" + team_price_high, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(market_price_high==null?"null":"" + market_price_high, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(flight_max_discount==null?"null":flight_max_discount, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(flight_max_save==null?"null":flight_max_save, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hotel_type==null?"null":hotel_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(voucher_val==null?"null":"" + voucher_val, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(travel_long==null?"null":"" + travel_long, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(p_team_id==null?"null":"" + p_team_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tuan_room_type==null?"null":tuan_room_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tuan_project_name==null?"null":tuan_project_name, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tuan_project_des==null?"null":tuan_project_des, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(son_hotel_names==null?"null":son_hotel_names, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(son_hotel_address==null?"null":son_hotel_address, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(baojian_total==null?"null":"" + baojian_total, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tips==null?"null":tips, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(qqgid==null?"null":"" + qqgid, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(payment_method==null?"null":payment_method, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(payment_condition==null?"null":payment_condition, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(through_coupon_total==null?"null":"" + through_coupon_total, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(subtitle==null?"null":subtitle, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(leave_time==null?"null":leave_time, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_support==null?"null":"" + refund_support, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(traffic_desc==null?"null":traffic_desc, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(scenic_desc==null?"null":scenic_desc, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(money_use_detail==null?"null":money_use_detail, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(good_food==null?"null":good_food, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hotel_desc==null?"null":hotel_desc, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hide_room_type==null?"null":hide_room_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(modeldisplay==null?"null":modeldisplay, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(if_need_visa==null?"null":"" + if_need_visa, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(buy_tips==null?"null":buy_tips, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_new_team==null?"null":"" + is_new_team, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(related_sight==null?"null":related_sight, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(publish_2dcode==null?"null":publish_2dcode, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(settlement_id==null?"null":"" + settlement_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(settlement_days==null?"null":"" + settlement_days, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ticket_input_time==null?"null":"" + ticket_input_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expressno_input_time==null?"null":"" + expressno_input_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_back_time==null?"null":"" + last_back_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(pre_sale==null?"null":pre_sale, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(use_time_limit==null?"null":use_time_limit, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(travel_nights==null?"null":travel_nights, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(topic_label==null?"null":topic_label, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(purchase_option==null?"null":purchase_option, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(price_type==null?"null":price_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hide_room_status==null?"null":hide_room_status, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(suggest_reason==null?"null":suggest_reason, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(holiday_tts==null?"null":"" + holiday_tts, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tts_mul_price==null?"null":"" + tts_mul_price, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tts_id==null?"null":tts_id, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hms_can_book==null?"null":"" + hms_can_book, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hms_unlock==null?"null":"" + hms_unlock, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(detail_table==null?"null":"" + detail_table, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(holidaytts_publish_request==null?"null":"" + holidaytts_publish_request, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(downline_time==null?"null":"" + downline_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(express_expire_time==null?"null":"" + express_expire_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(holidaytts_free_package==null?"null":"" + holidaytts_free_package, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(new_type==null?"null":new_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holidaytts_distribution_way==null?"null":holidaytts_distribution_way, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holidaytts_pay_way==null?"null":holidaytts_pay_way, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holiday_tts_ticket_type==null?"null":holiday_tts_ticket_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tuanhide==null?"null":"" + tuanhide, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holidaytts_ticket_id==null?"null":holidaytts_ticket_id, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_active_hoteldesc==null?"null":"" + is_active_hoteldesc, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(team_display_type==null?"null":team_display_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holiday_tts_taocan==null?"null":holiday_tts_taocan, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holidaytts_scheduler==null?"null":holidaytts_scheduler, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(sight_info==null?"null":sight_info, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(holidaytts_id==null?"null":"" + holidaytts_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holidaytts_ext_info==null?"null":holidaytts_ext_info, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(new_attr==null?"null":new_attr, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_source==null?"null":"" + partner_source, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(other_tuan_type==null?"null":other_tuan_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other_tuan_id==null?"null":"" + other_tuan_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(other_tuan_detail==null?"null":other_tuan_detail, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tags==null?"null":tags, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(refund_condition==null?"null":refund_condition, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(other_tuan_data==null?"null":other_tuan_data, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sign_company==null?"null":"" + sign_company, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(settlement_type==null?"null":settlement_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_union_product==null?"null":"" + is_union_product, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tuan_product_type==null?"null":tuan_product_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pre_date==null?"null":"" + pre_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tel_book==null?"null":"" + tel_book, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(version==null?"null":"" + version, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(url_short==null?"null":url_short, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(other_notice==null?"null":other_notice, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"null":"" + update_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(source_type==null?"null":"" + source_type, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(title==null?"null":title, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(summary==null?"null":summary, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_id==null?"null":"" + city_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(group_id==null?"null":"" + group_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_id==null?"null":"" + partner_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(system==null?"null":system, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_price==null?"null":"" + team_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(market_price==null?"null":"" + market_price, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(product==null?"null":product, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(condbuy==null?"null":condbuy, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(per_number==null?"null":"" + per_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(min_number==null?"null":"" + min_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(max_number==null?"null":"" + max_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(now_number==null?"null":"" + now_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pre_number==null?"null":"" + pre_number, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(image==null?"null":image, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(image1==null?"null":image1, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(image2==null?"null":image2, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(flv==null?"null":flv, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(mobile==null?"null":mobile, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(credit==null?"null":"" + credit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(card==null?"null":"" + card, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fare==null?"null":"" + fare, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(farefree==null?"null":"" + farefree, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bonus==null?"null":"" + bonus, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(address==null?"null":address, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(detail==null?"null":detail, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(systemreview==null?"null":systemreview, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(userreview==null?"null":userreview, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(notice==null?"null":notice, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(express==null?"null":express, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(delivery==null?"null":delivery, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(state==null?"null":state, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(conduser==null?"null":conduser, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(buyonce==null?"null":buyonce, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(team_type==null?"null":team_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sort_order==null?"null":"" + sort_order, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expire_time==null?"null":"" + expire_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(begin_time==null?"null":"" + begin_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_time==null?"null":"" + end_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reach_time==null?"null":"" + reach_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(close_time==null?"null":"" + close_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(seo_title==null?"null":seo_title, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(seo_keyword==null?"null":seo_keyword, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(seo_description==null?"null":seo_description, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(stitle==null?"null":stitle, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(sales==null?"null":sales, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(publish==null?"null":publish, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(profit==null?"null":"" + profit, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hotel_seq==null?"null":hotel_seq, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(order_type==null?"null":order_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hide_partner==null?"null":hide_partner, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(departure==null?"null":departure, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(arrive==null?"null":arrive, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(extra_sms==null?"null":extra_sms, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(room_type==null?"null":room_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(sort_tag==null?"null":sort_tag, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(check_in_time==null?"null":"" + check_in_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(wireless_team_desc==null?"null":wireless_team_desc, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(wireless_special_notes==null?"null":wireless_special_notes, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(wireless_long_lat==null?"null":wireless_long_lat, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(express_fee==null?"null":"" + express_fee, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(travel_days==null?"null":travel_days, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(travel_status==null?"null":travel_status, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(popularize==null?"null":"" + popularize, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(major_popularize==null?"null":"" + major_popularize, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(have_popularize==null?"null":"" + have_popularize, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(bannerimage==null?"null":bannerimage, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(earliest_start==null?"null":"" + earliest_start, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(room_desc==null?"null":room_desc, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cost_price==null?"null":"" + cost_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(red_envelope==null?"null":"" + red_envelope, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_price_high==null?"null":"" + team_price_high, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(market_price_high==null?"null":"" + market_price_high, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(flight_max_discount==null?"null":flight_max_discount, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(flight_max_save==null?"null":flight_max_save, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hotel_type==null?"null":hotel_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(voucher_val==null?"null":"" + voucher_val, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(travel_long==null?"null":"" + travel_long, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(p_team_id==null?"null":"" + p_team_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tuan_room_type==null?"null":tuan_room_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tuan_project_name==null?"null":tuan_project_name, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tuan_project_des==null?"null":tuan_project_des, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(son_hotel_names==null?"null":son_hotel_names, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(son_hotel_address==null?"null":son_hotel_address, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(baojian_total==null?"null":"" + baojian_total, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tips==null?"null":tips, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(qqgid==null?"null":"" + qqgid, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(payment_method==null?"null":payment_method, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(payment_condition==null?"null":payment_condition, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(through_coupon_total==null?"null":"" + through_coupon_total, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(subtitle==null?"null":subtitle, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(leave_time==null?"null":leave_time, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_support==null?"null":"" + refund_support, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(traffic_desc==null?"null":traffic_desc, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(scenic_desc==null?"null":scenic_desc, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(money_use_detail==null?"null":money_use_detail, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(good_food==null?"null":good_food, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hotel_desc==null?"null":hotel_desc, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hide_room_type==null?"null":hide_room_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(modeldisplay==null?"null":modeldisplay, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(if_need_visa==null?"null":"" + if_need_visa, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(buy_tips==null?"null":buy_tips, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_new_team==null?"null":"" + is_new_team, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(related_sight==null?"null":related_sight, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(publish_2dcode==null?"null":publish_2dcode, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(settlement_id==null?"null":"" + settlement_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(settlement_days==null?"null":"" + settlement_days, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ticket_input_time==null?"null":"" + ticket_input_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(expressno_input_time==null?"null":"" + expressno_input_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_back_time==null?"null":"" + last_back_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(pre_sale==null?"null":pre_sale, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(use_time_limit==null?"null":use_time_limit, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(travel_nights==null?"null":travel_nights, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(topic_label==null?"null":topic_label, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(purchase_option==null?"null":purchase_option, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(price_type==null?"null":price_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(hide_room_status==null?"null":hide_room_status, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(suggest_reason==null?"null":suggest_reason, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(holiday_tts==null?"null":"" + holiday_tts, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tts_mul_price==null?"null":"" + tts_mul_price, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tts_id==null?"null":tts_id, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hms_can_book==null?"null":"" + hms_can_book, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hms_unlock==null?"null":"" + hms_unlock, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(detail_table==null?"null":"" + detail_table, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(holidaytts_publish_request==null?"null":"" + holidaytts_publish_request, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(downline_time==null?"null":"" + downline_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(express_expire_time==null?"null":"" + express_expire_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(holidaytts_free_package==null?"null":"" + holidaytts_free_package, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(new_type==null?"null":new_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holidaytts_distribution_way==null?"null":holidaytts_distribution_way, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holidaytts_pay_way==null?"null":holidaytts_pay_way, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holiday_tts_ticket_type==null?"null":holiday_tts_ticket_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tuanhide==null?"null":"" + tuanhide, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holidaytts_ticket_id==null?"null":holidaytts_ticket_id, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_active_hoteldesc==null?"null":"" + is_active_hoteldesc, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(team_display_type==null?"null":team_display_type, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holiday_tts_taocan==null?"null":holiday_tts_taocan, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holidaytts_scheduler==null?"null":holidaytts_scheduler, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(sight_info==null?"null":sight_info, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(holidaytts_id==null?"null":"" + holidaytts_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(holidaytts_ext_info==null?"null":holidaytts_ext_info, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(new_attr==null?"null":new_attr, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partner_source==null?"null":"" + partner_source, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(other_tuan_type==null?"null":other_tuan_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other_tuan_id==null?"null":"" + other_tuan_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(other_tuan_detail==null?"null":other_tuan_detail, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tags==null?"null":tags, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(refund_condition==null?"null":refund_condition, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(other_tuan_data==null?"null":other_tuan_data, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sign_company==null?"null":"" + sign_company, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(settlement_type==null?"null":settlement_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_union_product==null?"null":"" + is_union_product, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(tuan_product_type==null?"null":tuan_product_type, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pre_date==null?"null":"" + pre_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tel_book==null?"null":"" + tel_book, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(version==null?"null":"" + version, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(url_short==null?"null":url_short, "\005", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(other_notice==null?"null":other_notice, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"null":"" + update_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(source_type==null?"null":"" + source_type, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.summary = null; } else {
      this.summary = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.city_id = null; } else {
      this.city_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.group_id = null; } else {
      this.group_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.partner_id = null; } else {
      this.partner_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.system = null; } else {
      this.system = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_price = null; } else {
      this.team_price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.market_price = null; } else {
      this.market_price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product = null; } else {
      this.product = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.condbuy = null; } else {
      this.condbuy = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.per_number = null; } else {
      this.per_number = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.min_number = null; } else {
      this.min_number = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.max_number = null; } else {
      this.max_number = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.now_number = null; } else {
      this.now_number = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pre_number = null; } else {
      this.pre_number = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.image = null; } else {
      this.image = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.image1 = null; } else {
      this.image1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.image2 = null; } else {
      this.image2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flv = null; } else {
      this.flv = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.mobile = null; } else {
      this.mobile = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.credit = null; } else {
      this.credit = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.card = null; } else {
      this.card = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fare = null; } else {
      this.fare = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.farefree = null; } else {
      this.farefree = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bonus = null; } else {
      this.bonus = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.detail = null; } else {
      this.detail = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.systemreview = null; } else {
      this.systemreview = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.userreview = null; } else {
      this.userreview = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.notice = null; } else {
      this.notice = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.express = null; } else {
      this.express = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.delivery = null; } else {
      this.delivery = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.conduser = null; } else {
      this.conduser = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.buyonce = null; } else {
      this.buyonce = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.team_type = null; } else {
      this.team_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sort_order = null; } else {
      this.sort_order = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.expire_time = null; } else {
      this.expire_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.begin_time = null; } else {
      this.begin_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_time = null; } else {
      this.end_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reach_time = null; } else {
      this.reach_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.close_time = null; } else {
      this.close_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.seo_title = null; } else {
      this.seo_title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.seo_keyword = null; } else {
      this.seo_keyword = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.seo_description = null; } else {
      this.seo_description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stitle = null; } else {
      this.stitle = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sales = null; } else {
      this.sales = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.publish = null; } else {
      this.publish = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.profit = null; } else {
      this.profit = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hotel_seq = null; } else {
      this.hotel_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.order_type = null; } else {
      this.order_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hide_partner = null; } else {
      this.hide_partner = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.departure = null; } else {
      this.departure = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.arrive = null; } else {
      this.arrive = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.extra_sms = null; } else {
      this.extra_sms = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.room_type = null; } else {
      this.room_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sort_tag = null; } else {
      this.sort_tag = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.check_in_time = null; } else {
      this.check_in_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.wireless_team_desc = null; } else {
      this.wireless_team_desc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.wireless_special_notes = null; } else {
      this.wireless_special_notes = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.wireless_long_lat = null; } else {
      this.wireless_long_lat = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.express_fee = null; } else {
      this.express_fee = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.travel_days = null; } else {
      this.travel_days = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.travel_status = null; } else {
      this.travel_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.popularize = null; } else {
      this.popularize = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.major_popularize = null; } else {
      this.major_popularize = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.have_popularize = null; } else {
      this.have_popularize = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bannerimage = null; } else {
      this.bannerimage = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.earliest_start = null; } else {
      this.earliest_start = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.room_desc = null; } else {
      this.room_desc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cost_price = null; } else {
      this.cost_price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.red_envelope = null; } else {
      this.red_envelope = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_price_high = null; } else {
      this.team_price_high = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.market_price_high = null; } else {
      this.market_price_high = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flight_max_discount = null; } else {
      this.flight_max_discount = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flight_max_save = null; } else {
      this.flight_max_save = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hotel_type = null; } else {
      this.hotel_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.voucher_val = null; } else {
      this.voucher_val = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.travel_long = null; } else {
      this.travel_long = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.p_team_id = null; } else {
      this.p_team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tuan_room_type = null; } else {
      this.tuan_room_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tuan_project_name = null; } else {
      this.tuan_project_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tuan_project_des = null; } else {
      this.tuan_project_des = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.son_hotel_names = null; } else {
      this.son_hotel_names = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.son_hotel_address = null; } else {
      this.son_hotel_address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.baojian_total = null; } else {
      this.baojian_total = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tips = null; } else {
      this.tips = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.qqgid = null; } else {
      this.qqgid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.payment_method = null; } else {
      this.payment_method = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.payment_condition = null; } else {
      this.payment_condition = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.through_coupon_total = null; } else {
      this.through_coupon_total = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.subtitle = null; } else {
      this.subtitle = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.leave_time = null; } else {
      this.leave_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_support = null; } else {
      this.refund_support = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.traffic_desc = null; } else {
      this.traffic_desc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.scenic_desc = null; } else {
      this.scenic_desc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.money_use_detail = null; } else {
      this.money_use_detail = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.good_food = null; } else {
      this.good_food = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hotel_desc = null; } else {
      this.hotel_desc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hide_room_type = null; } else {
      this.hide_room_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.modeldisplay = null; } else {
      this.modeldisplay = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.if_need_visa = null; } else {
      this.if_need_visa = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.buy_tips = null; } else {
      this.buy_tips = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_new_team = null; } else {
      this.is_new_team = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.related_sight = null; } else {
      this.related_sight = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.publish_2dcode = null; } else {
      this.publish_2dcode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.settlement_id = null; } else {
      this.settlement_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.settlement_days = null; } else {
      this.settlement_days = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ticket_input_time = null; } else {
      this.ticket_input_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.expressno_input_time = null; } else {
      this.expressno_input_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_back_time = null; } else {
      this.last_back_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.pre_sale = null; } else {
      this.pre_sale = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.use_time_limit = null; } else {
      this.use_time_limit = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.travel_nights = null; } else {
      this.travel_nights = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.topic_label = null; } else {
      this.topic_label = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.purchase_option = null; } else {
      this.purchase_option = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.price_type = null; } else {
      this.price_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hide_room_status = null; } else {
      this.hide_room_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.suggest_reason = null; } else {
      this.suggest_reason = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.holiday_tts = null; } else {
      this.holiday_tts = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tts_mul_price = null; } else {
      this.tts_mul_price = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tts_id = null; } else {
      this.tts_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hms_can_book = null; } else {
      this.hms_can_book = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hms_unlock = null; } else {
      this.hms_unlock = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.detail_table = null; } else {
      this.detail_table = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.holidaytts_publish_request = null; } else {
      this.holidaytts_publish_request = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.downline_time = null; } else {
      this.downline_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.express_expire_time = null; } else {
      this.express_expire_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.holidaytts_free_package = null; } else {
      this.holidaytts_free_package = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.new_type = null; } else {
      this.new_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holidaytts_distribution_way = null; } else {
      this.holidaytts_distribution_way = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holidaytts_pay_way = null; } else {
      this.holidaytts_pay_way = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holiday_tts_ticket_type = null; } else {
      this.holiday_tts_ticket_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tuanhide = null; } else {
      this.tuanhide = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holidaytts_ticket_id = null; } else {
      this.holidaytts_ticket_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_active_hoteldesc = null; } else {
      this.is_active_hoteldesc = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.team_display_type = null; } else {
      this.team_display_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holiday_tts_taocan = null; } else {
      this.holiday_tts_taocan = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holidaytts_scheduler = null; } else {
      this.holidaytts_scheduler = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sight_info = null; } else {
      this.sight_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.holidaytts_id = null; } else {
      this.holidaytts_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holidaytts_ext_info = null; } else {
      this.holidaytts_ext_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.new_attr = null; } else {
      this.new_attr = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.partner_source = null; } else {
      this.partner_source = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.other_tuan_type = null; } else {
      this.other_tuan_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.other_tuan_id = null; } else {
      this.other_tuan_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.other_tuan_detail = null; } else {
      this.other_tuan_detail = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tags = null; } else {
      this.tags = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.refund_condition = null; } else {
      this.refund_condition = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.other_tuan_data = null; } else {
      this.other_tuan_data = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sign_company = null; } else {
      this.sign_company = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.settlement_type = null; } else {
      this.settlement_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_union_product = null; } else {
      this.is_union_product = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tuan_product_type = null; } else {
      this.tuan_product_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pre_date = null; } else {
      this.pre_date = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tel_book = null; } else {
      this.tel_book = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.version = null; } else {
      this.version = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.url_short = null; } else {
      this.url_short = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.other_notice = null; } else {
      this.other_notice = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.source_type = null; } else {
      this.source_type = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.summary = null; } else {
      this.summary = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.city_id = null; } else {
      this.city_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.group_id = null; } else {
      this.group_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.partner_id = null; } else {
      this.partner_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.system = null; } else {
      this.system = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_price = null; } else {
      this.team_price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.market_price = null; } else {
      this.market_price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product = null; } else {
      this.product = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.condbuy = null; } else {
      this.condbuy = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.per_number = null; } else {
      this.per_number = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.min_number = null; } else {
      this.min_number = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.max_number = null; } else {
      this.max_number = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.now_number = null; } else {
      this.now_number = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pre_number = null; } else {
      this.pre_number = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.image = null; } else {
      this.image = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.image1 = null; } else {
      this.image1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.image2 = null; } else {
      this.image2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flv = null; } else {
      this.flv = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.mobile = null; } else {
      this.mobile = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.credit = null; } else {
      this.credit = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.card = null; } else {
      this.card = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fare = null; } else {
      this.fare = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.farefree = null; } else {
      this.farefree = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bonus = null; } else {
      this.bonus = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.detail = null; } else {
      this.detail = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.systemreview = null; } else {
      this.systemreview = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.userreview = null; } else {
      this.userreview = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.notice = null; } else {
      this.notice = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.express = null; } else {
      this.express = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.delivery = null; } else {
      this.delivery = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.conduser = null; } else {
      this.conduser = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.buyonce = null; } else {
      this.buyonce = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.team_type = null; } else {
      this.team_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sort_order = null; } else {
      this.sort_order = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.expire_time = null; } else {
      this.expire_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.begin_time = null; } else {
      this.begin_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_time = null; } else {
      this.end_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reach_time = null; } else {
      this.reach_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.close_time = null; } else {
      this.close_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.seo_title = null; } else {
      this.seo_title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.seo_keyword = null; } else {
      this.seo_keyword = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.seo_description = null; } else {
      this.seo_description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stitle = null; } else {
      this.stitle = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sales = null; } else {
      this.sales = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.publish = null; } else {
      this.publish = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.profit = null; } else {
      this.profit = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hotel_seq = null; } else {
      this.hotel_seq = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.order_type = null; } else {
      this.order_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hide_partner = null; } else {
      this.hide_partner = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.departure = null; } else {
      this.departure = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.arrive = null; } else {
      this.arrive = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.extra_sms = null; } else {
      this.extra_sms = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.room_type = null; } else {
      this.room_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sort_tag = null; } else {
      this.sort_tag = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.check_in_time = null; } else {
      this.check_in_time = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.wireless_team_desc = null; } else {
      this.wireless_team_desc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.wireless_special_notes = null; } else {
      this.wireless_special_notes = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.wireless_long_lat = null; } else {
      this.wireless_long_lat = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.express_fee = null; } else {
      this.express_fee = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.travel_days = null; } else {
      this.travel_days = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.travel_status = null; } else {
      this.travel_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.popularize = null; } else {
      this.popularize = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.major_popularize = null; } else {
      this.major_popularize = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.have_popularize = null; } else {
      this.have_popularize = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bannerimage = null; } else {
      this.bannerimage = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.earliest_start = null; } else {
      this.earliest_start = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.room_desc = null; } else {
      this.room_desc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cost_price = null; } else {
      this.cost_price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.red_envelope = null; } else {
      this.red_envelope = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_price_high = null; } else {
      this.team_price_high = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.market_price_high = null; } else {
      this.market_price_high = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flight_max_discount = null; } else {
      this.flight_max_discount = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flight_max_save = null; } else {
      this.flight_max_save = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hotel_type = null; } else {
      this.hotel_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.voucher_val = null; } else {
      this.voucher_val = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.travel_long = null; } else {
      this.travel_long = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.p_team_id = null; } else {
      this.p_team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tuan_room_type = null; } else {
      this.tuan_room_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tuan_project_name = null; } else {
      this.tuan_project_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tuan_project_des = null; } else {
      this.tuan_project_des = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.son_hotel_names = null; } else {
      this.son_hotel_names = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.son_hotel_address = null; } else {
      this.son_hotel_address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.baojian_total = null; } else {
      this.baojian_total = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tips = null; } else {
      this.tips = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.qqgid = null; } else {
      this.qqgid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.payment_method = null; } else {
      this.payment_method = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.payment_condition = null; } else {
      this.payment_condition = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.through_coupon_total = null; } else {
      this.through_coupon_total = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.subtitle = null; } else {
      this.subtitle = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.leave_time = null; } else {
      this.leave_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_support = null; } else {
      this.refund_support = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.traffic_desc = null; } else {
      this.traffic_desc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.scenic_desc = null; } else {
      this.scenic_desc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.money_use_detail = null; } else {
      this.money_use_detail = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.good_food = null; } else {
      this.good_food = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hotel_desc = null; } else {
      this.hotel_desc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hide_room_type = null; } else {
      this.hide_room_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.modeldisplay = null; } else {
      this.modeldisplay = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.if_need_visa = null; } else {
      this.if_need_visa = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.buy_tips = null; } else {
      this.buy_tips = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_new_team = null; } else {
      this.is_new_team = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.related_sight = null; } else {
      this.related_sight = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.publish_2dcode = null; } else {
      this.publish_2dcode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.settlement_id = null; } else {
      this.settlement_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.settlement_days = null; } else {
      this.settlement_days = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ticket_input_time = null; } else {
      this.ticket_input_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.expressno_input_time = null; } else {
      this.expressno_input_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_back_time = null; } else {
      this.last_back_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.pre_sale = null; } else {
      this.pre_sale = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.use_time_limit = null; } else {
      this.use_time_limit = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.travel_nights = null; } else {
      this.travel_nights = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.topic_label = null; } else {
      this.topic_label = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.purchase_option = null; } else {
      this.purchase_option = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.price_type = null; } else {
      this.price_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hide_room_status = null; } else {
      this.hide_room_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.suggest_reason = null; } else {
      this.suggest_reason = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.holiday_tts = null; } else {
      this.holiday_tts = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tts_mul_price = null; } else {
      this.tts_mul_price = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tts_id = null; } else {
      this.tts_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hms_can_book = null; } else {
      this.hms_can_book = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hms_unlock = null; } else {
      this.hms_unlock = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.detail_table = null; } else {
      this.detail_table = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.holidaytts_publish_request = null; } else {
      this.holidaytts_publish_request = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.downline_time = null; } else {
      this.downline_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.express_expire_time = null; } else {
      this.express_expire_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.holidaytts_free_package = null; } else {
      this.holidaytts_free_package = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.new_type = null; } else {
      this.new_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holidaytts_distribution_way = null; } else {
      this.holidaytts_distribution_way = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holidaytts_pay_way = null; } else {
      this.holidaytts_pay_way = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holiday_tts_ticket_type = null; } else {
      this.holiday_tts_ticket_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tuanhide = null; } else {
      this.tuanhide = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holidaytts_ticket_id = null; } else {
      this.holidaytts_ticket_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_active_hoteldesc = null; } else {
      this.is_active_hoteldesc = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.team_display_type = null; } else {
      this.team_display_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holiday_tts_taocan = null; } else {
      this.holiday_tts_taocan = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holidaytts_scheduler = null; } else {
      this.holidaytts_scheduler = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sight_info = null; } else {
      this.sight_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.holidaytts_id = null; } else {
      this.holidaytts_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.holidaytts_ext_info = null; } else {
      this.holidaytts_ext_info = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.new_attr = null; } else {
      this.new_attr = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.partner_source = null; } else {
      this.partner_source = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.other_tuan_type = null; } else {
      this.other_tuan_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.other_tuan_id = null; } else {
      this.other_tuan_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.other_tuan_detail = null; } else {
      this.other_tuan_detail = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tags = null; } else {
      this.tags = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.refund_condition = null; } else {
      this.refund_condition = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.other_tuan_data = null; } else {
      this.other_tuan_data = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sign_company = null; } else {
      this.sign_company = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.settlement_type = null; } else {
      this.settlement_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_union_product = null; } else {
      this.is_union_product = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tuan_product_type = null; } else {
      this.tuan_product_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pre_date = null; } else {
      this.pre_date = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tel_book = null; } else {
      this.tel_book = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.version = null; } else {
      this.version = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.url_short = null; } else {
      this.url_short = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.other_notice = null; } else {
      this.other_notice = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.source_type = null; } else {
      this.source_type = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    team o = (team) super.clone();
    o.ticket_input_time = (o.ticket_input_time != null) ? (java.sql.Timestamp) o.ticket_input_time.clone() : null;
    o.expressno_input_time = (o.expressno_input_time != null) ? (java.sql.Timestamp) o.expressno_input_time.clone() : null;
    o.last_back_time = (o.last_back_time != null) ? (java.sql.Timestamp) o.last_back_time.clone() : null;
    o.downline_time = (o.downline_time != null) ? (java.sql.Timestamp) o.downline_time.clone() : null;
    o.express_expire_time = (o.express_expire_time != null) ? (java.sql.Timestamp) o.express_expire_time.clone() : null;
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
    return o;
  }

  public void clone0(team o) throws CloneNotSupportedException {
    o.ticket_input_time = (o.ticket_input_time != null) ? (java.sql.Timestamp) o.ticket_input_time.clone() : null;
    o.expressno_input_time = (o.expressno_input_time != null) ? (java.sql.Timestamp) o.expressno_input_time.clone() : null;
    o.last_back_time = (o.last_back_time != null) ? (java.sql.Timestamp) o.last_back_time.clone() : null;
    o.downline_time = (o.downline_time != null) ? (java.sql.Timestamp) o.downline_time.clone() : null;
    o.express_expire_time = (o.express_expire_time != null) ? (java.sql.Timestamp) o.express_expire_time.clone() : null;
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("summary", this.summary);
    __sqoop$field_map.put("city_id", this.city_id);
    __sqoop$field_map.put("group_id", this.group_id);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("system", this.system);
    __sqoop$field_map.put("team_price", this.team_price);
    __sqoop$field_map.put("market_price", this.market_price);
    __sqoop$field_map.put("product", this.product);
    __sqoop$field_map.put("condbuy", this.condbuy);
    __sqoop$field_map.put("per_number", this.per_number);
    __sqoop$field_map.put("min_number", this.min_number);
    __sqoop$field_map.put("max_number", this.max_number);
    __sqoop$field_map.put("now_number", this.now_number);
    __sqoop$field_map.put("pre_number", this.pre_number);
    __sqoop$field_map.put("image", this.image);
    __sqoop$field_map.put("image1", this.image1);
    __sqoop$field_map.put("image2", this.image2);
    __sqoop$field_map.put("flv", this.flv);
    __sqoop$field_map.put("mobile", this.mobile);
    __sqoop$field_map.put("credit", this.credit);
    __sqoop$field_map.put("card", this.card);
    __sqoop$field_map.put("fare", this.fare);
    __sqoop$field_map.put("farefree", this.farefree);
    __sqoop$field_map.put("bonus", this.bonus);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("detail", this.detail);
    __sqoop$field_map.put("systemreview", this.systemreview);
    __sqoop$field_map.put("userreview", this.userreview);
    __sqoop$field_map.put("notice", this.notice);
    __sqoop$field_map.put("express", this.express);
    __sqoop$field_map.put("delivery", this.delivery);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("conduser", this.conduser);
    __sqoop$field_map.put("buyonce", this.buyonce);
    __sqoop$field_map.put("team_type", this.team_type);
    __sqoop$field_map.put("sort_order", this.sort_order);
    __sqoop$field_map.put("expire_time", this.expire_time);
    __sqoop$field_map.put("begin_time", this.begin_time);
    __sqoop$field_map.put("end_time", this.end_time);
    __sqoop$field_map.put("reach_time", this.reach_time);
    __sqoop$field_map.put("close_time", this.close_time);
    __sqoop$field_map.put("seo_title", this.seo_title);
    __sqoop$field_map.put("seo_keyword", this.seo_keyword);
    __sqoop$field_map.put("seo_description", this.seo_description);
    __sqoop$field_map.put("stitle", this.stitle);
    __sqoop$field_map.put("sales", this.sales);
    __sqoop$field_map.put("publish", this.publish);
    __sqoop$field_map.put("profit", this.profit);
    __sqoop$field_map.put("hotel_seq", this.hotel_seq);
    __sqoop$field_map.put("order_type", this.order_type);
    __sqoop$field_map.put("hide_partner", this.hide_partner);
    __sqoop$field_map.put("departure", this.departure);
    __sqoop$field_map.put("arrive", this.arrive);
    __sqoop$field_map.put("extra_sms", this.extra_sms);
    __sqoop$field_map.put("room_type", this.room_type);
    __sqoop$field_map.put("sort_tag", this.sort_tag);
    __sqoop$field_map.put("check_in_time", this.check_in_time);
    __sqoop$field_map.put("wireless_team_desc", this.wireless_team_desc);
    __sqoop$field_map.put("wireless_special_notes", this.wireless_special_notes);
    __sqoop$field_map.put("wireless_long_lat", this.wireless_long_lat);
    __sqoop$field_map.put("express_fee", this.express_fee);
    __sqoop$field_map.put("travel_days", this.travel_days);
    __sqoop$field_map.put("travel_status", this.travel_status);
    __sqoop$field_map.put("popularize", this.popularize);
    __sqoop$field_map.put("major_popularize", this.major_popularize);
    __sqoop$field_map.put("have_popularize", this.have_popularize);
    __sqoop$field_map.put("bannerimage", this.bannerimage);
    __sqoop$field_map.put("earliest_start", this.earliest_start);
    __sqoop$field_map.put("room_desc", this.room_desc);
    __sqoop$field_map.put("cost_price", this.cost_price);
    __sqoop$field_map.put("red_envelope", this.red_envelope);
    __sqoop$field_map.put("team_price_high", this.team_price_high);
    __sqoop$field_map.put("market_price_high", this.market_price_high);
    __sqoop$field_map.put("flight_max_discount", this.flight_max_discount);
    __sqoop$field_map.put("flight_max_save", this.flight_max_save);
    __sqoop$field_map.put("hotel_type", this.hotel_type);
    __sqoop$field_map.put("voucher_val", this.voucher_val);
    __sqoop$field_map.put("travel_long", this.travel_long);
    __sqoop$field_map.put("p_team_id", this.p_team_id);
    __sqoop$field_map.put("tuan_room_type", this.tuan_room_type);
    __sqoop$field_map.put("tuan_project_name", this.tuan_project_name);
    __sqoop$field_map.put("tuan_project_des", this.tuan_project_des);
    __sqoop$field_map.put("son_hotel_names", this.son_hotel_names);
    __sqoop$field_map.put("son_hotel_address", this.son_hotel_address);
    __sqoop$field_map.put("baojian_total", this.baojian_total);
    __sqoop$field_map.put("tips", this.tips);
    __sqoop$field_map.put("qqgid", this.qqgid);
    __sqoop$field_map.put("payment_method", this.payment_method);
    __sqoop$field_map.put("payment_condition", this.payment_condition);
    __sqoop$field_map.put("through_coupon_total", this.through_coupon_total);
    __sqoop$field_map.put("subtitle", this.subtitle);
    __sqoop$field_map.put("leave_time", this.leave_time);
    __sqoop$field_map.put("refund_support", this.refund_support);
    __sqoop$field_map.put("traffic_desc", this.traffic_desc);
    __sqoop$field_map.put("scenic_desc", this.scenic_desc);
    __sqoop$field_map.put("money_use_detail", this.money_use_detail);
    __sqoop$field_map.put("good_food", this.good_food);
    __sqoop$field_map.put("hotel_desc", this.hotel_desc);
    __sqoop$field_map.put("hide_room_type", this.hide_room_type);
    __sqoop$field_map.put("modeldisplay", this.modeldisplay);
    __sqoop$field_map.put("if_need_visa", this.if_need_visa);
    __sqoop$field_map.put("buy_tips", this.buy_tips);
    __sqoop$field_map.put("is_new_team", this.is_new_team);
    __sqoop$field_map.put("related_sight", this.related_sight);
    __sqoop$field_map.put("publish_2dcode", this.publish_2dcode);
    __sqoop$field_map.put("settlement_id", this.settlement_id);
    __sqoop$field_map.put("settlement_days", this.settlement_days);
    __sqoop$field_map.put("ticket_input_time", this.ticket_input_time);
    __sqoop$field_map.put("expressno_input_time", this.expressno_input_time);
    __sqoop$field_map.put("last_back_time", this.last_back_time);
    __sqoop$field_map.put("pre_sale", this.pre_sale);
    __sqoop$field_map.put("use_time_limit", this.use_time_limit);
    __sqoop$field_map.put("travel_nights", this.travel_nights);
    __sqoop$field_map.put("topic_label", this.topic_label);
    __sqoop$field_map.put("purchase_option", this.purchase_option);
    __sqoop$field_map.put("price_type", this.price_type);
    __sqoop$field_map.put("hide_room_status", this.hide_room_status);
    __sqoop$field_map.put("suggest_reason", this.suggest_reason);
    __sqoop$field_map.put("holiday_tts", this.holiday_tts);
    __sqoop$field_map.put("tts_mul_price", this.tts_mul_price);
    __sqoop$field_map.put("tts_id", this.tts_id);
    __sqoop$field_map.put("hms_can_book", this.hms_can_book);
    __sqoop$field_map.put("hms_unlock", this.hms_unlock);
    __sqoop$field_map.put("detail_table", this.detail_table);
    __sqoop$field_map.put("holidaytts_publish_request", this.holidaytts_publish_request);
    __sqoop$field_map.put("downline_time", this.downline_time);
    __sqoop$field_map.put("express_expire_time", this.express_expire_time);
    __sqoop$field_map.put("holidaytts_free_package", this.holidaytts_free_package);
    __sqoop$field_map.put("new_type", this.new_type);
    __sqoop$field_map.put("holidaytts_distribution_way", this.holidaytts_distribution_way);
    __sqoop$field_map.put("holidaytts_pay_way", this.holidaytts_pay_way);
    __sqoop$field_map.put("holiday_tts_ticket_type", this.holiday_tts_ticket_type);
    __sqoop$field_map.put("tuanhide", this.tuanhide);
    __sqoop$field_map.put("holidaytts_ticket_id", this.holidaytts_ticket_id);
    __sqoop$field_map.put("is_active_hoteldesc", this.is_active_hoteldesc);
    __sqoop$field_map.put("team_display_type", this.team_display_type);
    __sqoop$field_map.put("holiday_tts_taocan", this.holiday_tts_taocan);
    __sqoop$field_map.put("holidaytts_scheduler", this.holidaytts_scheduler);
    __sqoop$field_map.put("sight_info", this.sight_info);
    __sqoop$field_map.put("holidaytts_id", this.holidaytts_id);
    __sqoop$field_map.put("holidaytts_ext_info", this.holidaytts_ext_info);
    __sqoop$field_map.put("new_attr", this.new_attr);
    __sqoop$field_map.put("partner_source", this.partner_source);
    __sqoop$field_map.put("other_tuan_type", this.other_tuan_type);
    __sqoop$field_map.put("other_tuan_id", this.other_tuan_id);
    __sqoop$field_map.put("other_tuan_detail", this.other_tuan_detail);
    __sqoop$field_map.put("tags", this.tags);
    __sqoop$field_map.put("refund_condition", this.refund_condition);
    __sqoop$field_map.put("other_tuan_data", this.other_tuan_data);
    __sqoop$field_map.put("sign_company", this.sign_company);
    __sqoop$field_map.put("settlement_type", this.settlement_type);
    __sqoop$field_map.put("is_union_product", this.is_union_product);
    __sqoop$field_map.put("tuan_product_type", this.tuan_product_type);
    __sqoop$field_map.put("pre_date", this.pre_date);
    __sqoop$field_map.put("tel_book", this.tel_book);
    __sqoop$field_map.put("version", this.version);
    __sqoop$field_map.put("url_short", this.url_short);
    __sqoop$field_map.put("other_notice", this.other_notice);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("update_time", this.update_time);
    __sqoop$field_map.put("source_type", this.source_type);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("summary", this.summary);
    __sqoop$field_map.put("city_id", this.city_id);
    __sqoop$field_map.put("group_id", this.group_id);
    __sqoop$field_map.put("partner_id", this.partner_id);
    __sqoop$field_map.put("system", this.system);
    __sqoop$field_map.put("team_price", this.team_price);
    __sqoop$field_map.put("market_price", this.market_price);
    __sqoop$field_map.put("product", this.product);
    __sqoop$field_map.put("condbuy", this.condbuy);
    __sqoop$field_map.put("per_number", this.per_number);
    __sqoop$field_map.put("min_number", this.min_number);
    __sqoop$field_map.put("max_number", this.max_number);
    __sqoop$field_map.put("now_number", this.now_number);
    __sqoop$field_map.put("pre_number", this.pre_number);
    __sqoop$field_map.put("image", this.image);
    __sqoop$field_map.put("image1", this.image1);
    __sqoop$field_map.put("image2", this.image2);
    __sqoop$field_map.put("flv", this.flv);
    __sqoop$field_map.put("mobile", this.mobile);
    __sqoop$field_map.put("credit", this.credit);
    __sqoop$field_map.put("card", this.card);
    __sqoop$field_map.put("fare", this.fare);
    __sqoop$field_map.put("farefree", this.farefree);
    __sqoop$field_map.put("bonus", this.bonus);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("detail", this.detail);
    __sqoop$field_map.put("systemreview", this.systemreview);
    __sqoop$field_map.put("userreview", this.userreview);
    __sqoop$field_map.put("notice", this.notice);
    __sqoop$field_map.put("express", this.express);
    __sqoop$field_map.put("delivery", this.delivery);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("conduser", this.conduser);
    __sqoop$field_map.put("buyonce", this.buyonce);
    __sqoop$field_map.put("team_type", this.team_type);
    __sqoop$field_map.put("sort_order", this.sort_order);
    __sqoop$field_map.put("expire_time", this.expire_time);
    __sqoop$field_map.put("begin_time", this.begin_time);
    __sqoop$field_map.put("end_time", this.end_time);
    __sqoop$field_map.put("reach_time", this.reach_time);
    __sqoop$field_map.put("close_time", this.close_time);
    __sqoop$field_map.put("seo_title", this.seo_title);
    __sqoop$field_map.put("seo_keyword", this.seo_keyword);
    __sqoop$field_map.put("seo_description", this.seo_description);
    __sqoop$field_map.put("stitle", this.stitle);
    __sqoop$field_map.put("sales", this.sales);
    __sqoop$field_map.put("publish", this.publish);
    __sqoop$field_map.put("profit", this.profit);
    __sqoop$field_map.put("hotel_seq", this.hotel_seq);
    __sqoop$field_map.put("order_type", this.order_type);
    __sqoop$field_map.put("hide_partner", this.hide_partner);
    __sqoop$field_map.put("departure", this.departure);
    __sqoop$field_map.put("arrive", this.arrive);
    __sqoop$field_map.put("extra_sms", this.extra_sms);
    __sqoop$field_map.put("room_type", this.room_type);
    __sqoop$field_map.put("sort_tag", this.sort_tag);
    __sqoop$field_map.put("check_in_time", this.check_in_time);
    __sqoop$field_map.put("wireless_team_desc", this.wireless_team_desc);
    __sqoop$field_map.put("wireless_special_notes", this.wireless_special_notes);
    __sqoop$field_map.put("wireless_long_lat", this.wireless_long_lat);
    __sqoop$field_map.put("express_fee", this.express_fee);
    __sqoop$field_map.put("travel_days", this.travel_days);
    __sqoop$field_map.put("travel_status", this.travel_status);
    __sqoop$field_map.put("popularize", this.popularize);
    __sqoop$field_map.put("major_popularize", this.major_popularize);
    __sqoop$field_map.put("have_popularize", this.have_popularize);
    __sqoop$field_map.put("bannerimage", this.bannerimage);
    __sqoop$field_map.put("earliest_start", this.earliest_start);
    __sqoop$field_map.put("room_desc", this.room_desc);
    __sqoop$field_map.put("cost_price", this.cost_price);
    __sqoop$field_map.put("red_envelope", this.red_envelope);
    __sqoop$field_map.put("team_price_high", this.team_price_high);
    __sqoop$field_map.put("market_price_high", this.market_price_high);
    __sqoop$field_map.put("flight_max_discount", this.flight_max_discount);
    __sqoop$field_map.put("flight_max_save", this.flight_max_save);
    __sqoop$field_map.put("hotel_type", this.hotel_type);
    __sqoop$field_map.put("voucher_val", this.voucher_val);
    __sqoop$field_map.put("travel_long", this.travel_long);
    __sqoop$field_map.put("p_team_id", this.p_team_id);
    __sqoop$field_map.put("tuan_room_type", this.tuan_room_type);
    __sqoop$field_map.put("tuan_project_name", this.tuan_project_name);
    __sqoop$field_map.put("tuan_project_des", this.tuan_project_des);
    __sqoop$field_map.put("son_hotel_names", this.son_hotel_names);
    __sqoop$field_map.put("son_hotel_address", this.son_hotel_address);
    __sqoop$field_map.put("baojian_total", this.baojian_total);
    __sqoop$field_map.put("tips", this.tips);
    __sqoop$field_map.put("qqgid", this.qqgid);
    __sqoop$field_map.put("payment_method", this.payment_method);
    __sqoop$field_map.put("payment_condition", this.payment_condition);
    __sqoop$field_map.put("through_coupon_total", this.through_coupon_total);
    __sqoop$field_map.put("subtitle", this.subtitle);
    __sqoop$field_map.put("leave_time", this.leave_time);
    __sqoop$field_map.put("refund_support", this.refund_support);
    __sqoop$field_map.put("traffic_desc", this.traffic_desc);
    __sqoop$field_map.put("scenic_desc", this.scenic_desc);
    __sqoop$field_map.put("money_use_detail", this.money_use_detail);
    __sqoop$field_map.put("good_food", this.good_food);
    __sqoop$field_map.put("hotel_desc", this.hotel_desc);
    __sqoop$field_map.put("hide_room_type", this.hide_room_type);
    __sqoop$field_map.put("modeldisplay", this.modeldisplay);
    __sqoop$field_map.put("if_need_visa", this.if_need_visa);
    __sqoop$field_map.put("buy_tips", this.buy_tips);
    __sqoop$field_map.put("is_new_team", this.is_new_team);
    __sqoop$field_map.put("related_sight", this.related_sight);
    __sqoop$field_map.put("publish_2dcode", this.publish_2dcode);
    __sqoop$field_map.put("settlement_id", this.settlement_id);
    __sqoop$field_map.put("settlement_days", this.settlement_days);
    __sqoop$field_map.put("ticket_input_time", this.ticket_input_time);
    __sqoop$field_map.put("expressno_input_time", this.expressno_input_time);
    __sqoop$field_map.put("last_back_time", this.last_back_time);
    __sqoop$field_map.put("pre_sale", this.pre_sale);
    __sqoop$field_map.put("use_time_limit", this.use_time_limit);
    __sqoop$field_map.put("travel_nights", this.travel_nights);
    __sqoop$field_map.put("topic_label", this.topic_label);
    __sqoop$field_map.put("purchase_option", this.purchase_option);
    __sqoop$field_map.put("price_type", this.price_type);
    __sqoop$field_map.put("hide_room_status", this.hide_room_status);
    __sqoop$field_map.put("suggest_reason", this.suggest_reason);
    __sqoop$field_map.put("holiday_tts", this.holiday_tts);
    __sqoop$field_map.put("tts_mul_price", this.tts_mul_price);
    __sqoop$field_map.put("tts_id", this.tts_id);
    __sqoop$field_map.put("hms_can_book", this.hms_can_book);
    __sqoop$field_map.put("hms_unlock", this.hms_unlock);
    __sqoop$field_map.put("detail_table", this.detail_table);
    __sqoop$field_map.put("holidaytts_publish_request", this.holidaytts_publish_request);
    __sqoop$field_map.put("downline_time", this.downline_time);
    __sqoop$field_map.put("express_expire_time", this.express_expire_time);
    __sqoop$field_map.put("holidaytts_free_package", this.holidaytts_free_package);
    __sqoop$field_map.put("new_type", this.new_type);
    __sqoop$field_map.put("holidaytts_distribution_way", this.holidaytts_distribution_way);
    __sqoop$field_map.put("holidaytts_pay_way", this.holidaytts_pay_way);
    __sqoop$field_map.put("holiday_tts_ticket_type", this.holiday_tts_ticket_type);
    __sqoop$field_map.put("tuanhide", this.tuanhide);
    __sqoop$field_map.put("holidaytts_ticket_id", this.holidaytts_ticket_id);
    __sqoop$field_map.put("is_active_hoteldesc", this.is_active_hoteldesc);
    __sqoop$field_map.put("team_display_type", this.team_display_type);
    __sqoop$field_map.put("holiday_tts_taocan", this.holiday_tts_taocan);
    __sqoop$field_map.put("holidaytts_scheduler", this.holidaytts_scheduler);
    __sqoop$field_map.put("sight_info", this.sight_info);
    __sqoop$field_map.put("holidaytts_id", this.holidaytts_id);
    __sqoop$field_map.put("holidaytts_ext_info", this.holidaytts_ext_info);
    __sqoop$field_map.put("new_attr", this.new_attr);
    __sqoop$field_map.put("partner_source", this.partner_source);
    __sqoop$field_map.put("other_tuan_type", this.other_tuan_type);
    __sqoop$field_map.put("other_tuan_id", this.other_tuan_id);
    __sqoop$field_map.put("other_tuan_detail", this.other_tuan_detail);
    __sqoop$field_map.put("tags", this.tags);
    __sqoop$field_map.put("refund_condition", this.refund_condition);
    __sqoop$field_map.put("other_tuan_data", this.other_tuan_data);
    __sqoop$field_map.put("sign_company", this.sign_company);
    __sqoop$field_map.put("settlement_type", this.settlement_type);
    __sqoop$field_map.put("is_union_product", this.is_union_product);
    __sqoop$field_map.put("tuan_product_type", this.tuan_product_type);
    __sqoop$field_map.put("pre_date", this.pre_date);
    __sqoop$field_map.put("tel_book", this.tel_book);
    __sqoop$field_map.put("version", this.version);
    __sqoop$field_map.put("url_short", this.url_short);
    __sqoop$field_map.put("other_notice", this.other_notice);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("update_time", this.update_time);
    __sqoop$field_map.put("source_type", this.source_type);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Long) __fieldVal;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Long) __fieldVal;
    }
    else    if ("title".equals(__fieldName)) {
      this.title = (String) __fieldVal;
    }
    else    if ("summary".equals(__fieldName)) {
      this.summary = (String) __fieldVal;
    }
    else    if ("city_id".equals(__fieldName)) {
      this.city_id = (Long) __fieldVal;
    }
    else    if ("group_id".equals(__fieldName)) {
      this.group_id = (Long) __fieldVal;
    }
    else    if ("partner_id".equals(__fieldName)) {
      this.partner_id = (Long) __fieldVal;
    }
    else    if ("system".equals(__fieldName)) {
      this.system = (String) __fieldVal;
    }
    else    if ("team_price".equals(__fieldName)) {
      this.team_price = (Float) __fieldVal;
    }
    else    if ("market_price".equals(__fieldName)) {
      this.market_price = (Float) __fieldVal;
    }
    else    if ("product".equals(__fieldName)) {
      this.product = (String) __fieldVal;
    }
    else    if ("condbuy".equals(__fieldName)) {
      this.condbuy = (String) __fieldVal;
    }
    else    if ("per_number".equals(__fieldName)) {
      this.per_number = (Long) __fieldVal;
    }
    else    if ("min_number".equals(__fieldName)) {
      this.min_number = (Long) __fieldVal;
    }
    else    if ("max_number".equals(__fieldName)) {
      this.max_number = (Long) __fieldVal;
    }
    else    if ("now_number".equals(__fieldName)) {
      this.now_number = (Long) __fieldVal;
    }
    else    if ("pre_number".equals(__fieldName)) {
      this.pre_number = (Long) __fieldVal;
    }
    else    if ("image".equals(__fieldName)) {
      this.image = (String) __fieldVal;
    }
    else    if ("image1".equals(__fieldName)) {
      this.image1 = (String) __fieldVal;
    }
    else    if ("image2".equals(__fieldName)) {
      this.image2 = (String) __fieldVal;
    }
    else    if ("flv".equals(__fieldName)) {
      this.flv = (String) __fieldVal;
    }
    else    if ("mobile".equals(__fieldName)) {
      this.mobile = (String) __fieldVal;
    }
    else    if ("credit".equals(__fieldName)) {
      this.credit = (Long) __fieldVal;
    }
    else    if ("card".equals(__fieldName)) {
      this.card = (Long) __fieldVal;
    }
    else    if ("fare".equals(__fieldName)) {
      this.fare = (Long) __fieldVal;
    }
    else    if ("farefree".equals(__fieldName)) {
      this.farefree = (Long) __fieldVal;
    }
    else    if ("bonus".equals(__fieldName)) {
      this.bonus = (Long) __fieldVal;
    }
    else    if ("address".equals(__fieldName)) {
      this.address = (String) __fieldVal;
    }
    else    if ("detail".equals(__fieldName)) {
      this.detail = (String) __fieldVal;
    }
    else    if ("systemreview".equals(__fieldName)) {
      this.systemreview = (String) __fieldVal;
    }
    else    if ("userreview".equals(__fieldName)) {
      this.userreview = (String) __fieldVal;
    }
    else    if ("notice".equals(__fieldName)) {
      this.notice = (String) __fieldVal;
    }
    else    if ("express".equals(__fieldName)) {
      this.express = (String) __fieldVal;
    }
    else    if ("delivery".equals(__fieldName)) {
      this.delivery = (String) __fieldVal;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
    }
    else    if ("conduser".equals(__fieldName)) {
      this.conduser = (String) __fieldVal;
    }
    else    if ("buyonce".equals(__fieldName)) {
      this.buyonce = (String) __fieldVal;
    }
    else    if ("team_type".equals(__fieldName)) {
      this.team_type = (String) __fieldVal;
    }
    else    if ("sort_order".equals(__fieldName)) {
      this.sort_order = (Long) __fieldVal;
    }
    else    if ("expire_time".equals(__fieldName)) {
      this.expire_time = (Long) __fieldVal;
    }
    else    if ("begin_time".equals(__fieldName)) {
      this.begin_time = (Long) __fieldVal;
    }
    else    if ("end_time".equals(__fieldName)) {
      this.end_time = (Long) __fieldVal;
    }
    else    if ("reach_time".equals(__fieldName)) {
      this.reach_time = (Long) __fieldVal;
    }
    else    if ("close_time".equals(__fieldName)) {
      this.close_time = (Long) __fieldVal;
    }
    else    if ("seo_title".equals(__fieldName)) {
      this.seo_title = (String) __fieldVal;
    }
    else    if ("seo_keyword".equals(__fieldName)) {
      this.seo_keyword = (String) __fieldVal;
    }
    else    if ("seo_description".equals(__fieldName)) {
      this.seo_description = (String) __fieldVal;
    }
    else    if ("stitle".equals(__fieldName)) {
      this.stitle = (String) __fieldVal;
    }
    else    if ("sales".equals(__fieldName)) {
      this.sales = (String) __fieldVal;
    }
    else    if ("publish".equals(__fieldName)) {
      this.publish = (String) __fieldVal;
    }
    else    if ("profit".equals(__fieldName)) {
      this.profit = (Long) __fieldVal;
    }
    else    if ("hotel_seq".equals(__fieldName)) {
      this.hotel_seq = (String) __fieldVal;
    }
    else    if ("order_type".equals(__fieldName)) {
      this.order_type = (String) __fieldVal;
    }
    else    if ("hide_partner".equals(__fieldName)) {
      this.hide_partner = (String) __fieldVal;
    }
    else    if ("departure".equals(__fieldName)) {
      this.departure = (String) __fieldVal;
    }
    else    if ("arrive".equals(__fieldName)) {
      this.arrive = (String) __fieldVal;
    }
    else    if ("extra_sms".equals(__fieldName)) {
      this.extra_sms = (String) __fieldVal;
    }
    else    if ("room_type".equals(__fieldName)) {
      this.room_type = (String) __fieldVal;
    }
    else    if ("sort_tag".equals(__fieldName)) {
      this.sort_tag = (String) __fieldVal;
    }
    else    if ("check_in_time".equals(__fieldName)) {
      this.check_in_time = (Long) __fieldVal;
    }
    else    if ("wireless_team_desc".equals(__fieldName)) {
      this.wireless_team_desc = (String) __fieldVal;
    }
    else    if ("wireless_special_notes".equals(__fieldName)) {
      this.wireless_special_notes = (String) __fieldVal;
    }
    else    if ("wireless_long_lat".equals(__fieldName)) {
      this.wireless_long_lat = (String) __fieldVal;
    }
    else    if ("express_fee".equals(__fieldName)) {
      this.express_fee = (Float) __fieldVal;
    }
    else    if ("travel_days".equals(__fieldName)) {
      this.travel_days = (String) __fieldVal;
    }
    else    if ("travel_status".equals(__fieldName)) {
      this.travel_status = (String) __fieldVal;
    }
    else    if ("popularize".equals(__fieldName)) {
      this.popularize = (Integer) __fieldVal;
    }
    else    if ("major_popularize".equals(__fieldName)) {
      this.major_popularize = (Integer) __fieldVal;
    }
    else    if ("have_popularize".equals(__fieldName)) {
      this.have_popularize = (Long) __fieldVal;
    }
    else    if ("bannerimage".equals(__fieldName)) {
      this.bannerimage = (String) __fieldVal;
    }
    else    if ("earliest_start".equals(__fieldName)) {
      this.earliest_start = (Long) __fieldVal;
    }
    else    if ("room_desc".equals(__fieldName)) {
      this.room_desc = (String) __fieldVal;
    }
    else    if ("cost_price".equals(__fieldName)) {
      this.cost_price = (Float) __fieldVal;
    }
    else    if ("red_envelope".equals(__fieldName)) {
      this.red_envelope = (Long) __fieldVal;
    }
    else    if ("team_price_high".equals(__fieldName)) {
      this.team_price_high = (Float) __fieldVal;
    }
    else    if ("market_price_high".equals(__fieldName)) {
      this.market_price_high = (Float) __fieldVal;
    }
    else    if ("flight_max_discount".equals(__fieldName)) {
      this.flight_max_discount = (String) __fieldVal;
    }
    else    if ("flight_max_save".equals(__fieldName)) {
      this.flight_max_save = (String) __fieldVal;
    }
    else    if ("hotel_type".equals(__fieldName)) {
      this.hotel_type = (String) __fieldVal;
    }
    else    if ("voucher_val".equals(__fieldName)) {
      this.voucher_val = (Integer) __fieldVal;
    }
    else    if ("travel_long".equals(__fieldName)) {
      this.travel_long = (Integer) __fieldVal;
    }
    else    if ("p_team_id".equals(__fieldName)) {
      this.p_team_id = (Long) __fieldVal;
    }
    else    if ("tuan_room_type".equals(__fieldName)) {
      this.tuan_room_type = (String) __fieldVal;
    }
    else    if ("tuan_project_name".equals(__fieldName)) {
      this.tuan_project_name = (String) __fieldVal;
    }
    else    if ("tuan_project_des".equals(__fieldName)) {
      this.tuan_project_des = (String) __fieldVal;
    }
    else    if ("son_hotel_names".equals(__fieldName)) {
      this.son_hotel_names = (String) __fieldVal;
    }
    else    if ("son_hotel_address".equals(__fieldName)) {
      this.son_hotel_address = (String) __fieldVal;
    }
    else    if ("baojian_total".equals(__fieldName)) {
      this.baojian_total = (Integer) __fieldVal;
    }
    else    if ("tips".equals(__fieldName)) {
      this.tips = (String) __fieldVal;
    }
    else    if ("qqgid".equals(__fieldName)) {
      this.qqgid = (Long) __fieldVal;
    }
    else    if ("payment_method".equals(__fieldName)) {
      this.payment_method = (String) __fieldVal;
    }
    else    if ("payment_condition".equals(__fieldName)) {
      this.payment_condition = (String) __fieldVal;
    }
    else    if ("through_coupon_total".equals(__fieldName)) {
      this.through_coupon_total = (Integer) __fieldVal;
    }
    else    if ("subtitle".equals(__fieldName)) {
      this.subtitle = (String) __fieldVal;
    }
    else    if ("leave_time".equals(__fieldName)) {
      this.leave_time = (String) __fieldVal;
    }
    else    if ("refund_support".equals(__fieldName)) {
      this.refund_support = (Integer) __fieldVal;
    }
    else    if ("traffic_desc".equals(__fieldName)) {
      this.traffic_desc = (String) __fieldVal;
    }
    else    if ("scenic_desc".equals(__fieldName)) {
      this.scenic_desc = (String) __fieldVal;
    }
    else    if ("money_use_detail".equals(__fieldName)) {
      this.money_use_detail = (String) __fieldVal;
    }
    else    if ("good_food".equals(__fieldName)) {
      this.good_food = (String) __fieldVal;
    }
    else    if ("hotel_desc".equals(__fieldName)) {
      this.hotel_desc = (String) __fieldVal;
    }
    else    if ("hide_room_type".equals(__fieldName)) {
      this.hide_room_type = (String) __fieldVal;
    }
    else    if ("modeldisplay".equals(__fieldName)) {
      this.modeldisplay = (String) __fieldVal;
    }
    else    if ("if_need_visa".equals(__fieldName)) {
      this.if_need_visa = (Boolean) __fieldVal;
    }
    else    if ("buy_tips".equals(__fieldName)) {
      this.buy_tips = (String) __fieldVal;
    }
    else    if ("is_new_team".equals(__fieldName)) {
      this.is_new_team = (Integer) __fieldVal;
    }
    else    if ("related_sight".equals(__fieldName)) {
      this.related_sight = (String) __fieldVal;
    }
    else    if ("publish_2dcode".equals(__fieldName)) {
      this.publish_2dcode = (String) __fieldVal;
    }
    else    if ("settlement_id".equals(__fieldName)) {
      this.settlement_id = (Long) __fieldVal;
    }
    else    if ("settlement_days".equals(__fieldName)) {
      this.settlement_days = (Long) __fieldVal;
    }
    else    if ("ticket_input_time".equals(__fieldName)) {
      this.ticket_input_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("expressno_input_time".equals(__fieldName)) {
      this.expressno_input_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("last_back_time".equals(__fieldName)) {
      this.last_back_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("pre_sale".equals(__fieldName)) {
      this.pre_sale = (String) __fieldVal;
    }
    else    if ("use_time_limit".equals(__fieldName)) {
      this.use_time_limit = (String) __fieldVal;
    }
    else    if ("travel_nights".equals(__fieldName)) {
      this.travel_nights = (String) __fieldVal;
    }
    else    if ("topic_label".equals(__fieldName)) {
      this.topic_label = (String) __fieldVal;
    }
    else    if ("purchase_option".equals(__fieldName)) {
      this.purchase_option = (String) __fieldVal;
    }
    else    if ("price_type".equals(__fieldName)) {
      this.price_type = (String) __fieldVal;
    }
    else    if ("hide_room_status".equals(__fieldName)) {
      this.hide_room_status = (String) __fieldVal;
    }
    else    if ("suggest_reason".equals(__fieldName)) {
      this.suggest_reason = (String) __fieldVal;
    }
    else    if ("holiday_tts".equals(__fieldName)) {
      this.holiday_tts = (Integer) __fieldVal;
    }
    else    if ("tts_mul_price".equals(__fieldName)) {
      this.tts_mul_price = (Integer) __fieldVal;
    }
    else    if ("tts_id".equals(__fieldName)) {
      this.tts_id = (String) __fieldVal;
    }
    else    if ("hms_can_book".equals(__fieldName)) {
      this.hms_can_book = (Integer) __fieldVal;
    }
    else    if ("hms_unlock".equals(__fieldName)) {
      this.hms_unlock = (Integer) __fieldVal;
    }
    else    if ("detail_table".equals(__fieldName)) {
      this.detail_table = (Integer) __fieldVal;
    }
    else    if ("holidaytts_publish_request".equals(__fieldName)) {
      this.holidaytts_publish_request = (Integer) __fieldVal;
    }
    else    if ("downline_time".equals(__fieldName)) {
      this.downline_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("express_expire_time".equals(__fieldName)) {
      this.express_expire_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("holidaytts_free_package".equals(__fieldName)) {
      this.holidaytts_free_package = (Integer) __fieldVal;
    }
    else    if ("new_type".equals(__fieldName)) {
      this.new_type = (String) __fieldVal;
    }
    else    if ("holidaytts_distribution_way".equals(__fieldName)) {
      this.holidaytts_distribution_way = (String) __fieldVal;
    }
    else    if ("holidaytts_pay_way".equals(__fieldName)) {
      this.holidaytts_pay_way = (String) __fieldVal;
    }
    else    if ("holiday_tts_ticket_type".equals(__fieldName)) {
      this.holiday_tts_ticket_type = (String) __fieldVal;
    }
    else    if ("tuanhide".equals(__fieldName)) {
      this.tuanhide = (Integer) __fieldVal;
    }
    else    if ("holidaytts_ticket_id".equals(__fieldName)) {
      this.holidaytts_ticket_id = (String) __fieldVal;
    }
    else    if ("is_active_hoteldesc".equals(__fieldName)) {
      this.is_active_hoteldesc = (Integer) __fieldVal;
    }
    else    if ("team_display_type".equals(__fieldName)) {
      this.team_display_type = (String) __fieldVal;
    }
    else    if ("holiday_tts_taocan".equals(__fieldName)) {
      this.holiday_tts_taocan = (String) __fieldVal;
    }
    else    if ("holidaytts_scheduler".equals(__fieldName)) {
      this.holidaytts_scheduler = (String) __fieldVal;
    }
    else    if ("sight_info".equals(__fieldName)) {
      this.sight_info = (String) __fieldVal;
    }
    else    if ("holidaytts_id".equals(__fieldName)) {
      this.holidaytts_id = (Integer) __fieldVal;
    }
    else    if ("holidaytts_ext_info".equals(__fieldName)) {
      this.holidaytts_ext_info = (String) __fieldVal;
    }
    else    if ("new_attr".equals(__fieldName)) {
      this.new_attr = (String) __fieldVal;
    }
    else    if ("partner_source".equals(__fieldName)) {
      this.partner_source = (Integer) __fieldVal;
    }
    else    if ("other_tuan_type".equals(__fieldName)) {
      this.other_tuan_type = (String) __fieldVal;
    }
    else    if ("other_tuan_id".equals(__fieldName)) {
      this.other_tuan_id = (Long) __fieldVal;
    }
    else    if ("other_tuan_detail".equals(__fieldName)) {
      this.other_tuan_detail = (String) __fieldVal;
    }
    else    if ("tags".equals(__fieldName)) {
      this.tags = (String) __fieldVal;
    }
    else    if ("refund_condition".equals(__fieldName)) {
      this.refund_condition = (String) __fieldVal;
    }
    else    if ("other_tuan_data".equals(__fieldName)) {
      this.other_tuan_data = (String) __fieldVal;
    }
    else    if ("sign_company".equals(__fieldName)) {
      this.sign_company = (Integer) __fieldVal;
    }
    else    if ("settlement_type".equals(__fieldName)) {
      this.settlement_type = (String) __fieldVal;
    }
    else    if ("is_union_product".equals(__fieldName)) {
      this.is_union_product = (Integer) __fieldVal;
    }
    else    if ("tuan_product_type".equals(__fieldName)) {
      this.tuan_product_type = (String) __fieldVal;
    }
    else    if ("pre_date".equals(__fieldName)) {
      this.pre_date = (Integer) __fieldVal;
    }
    else    if ("tel_book".equals(__fieldName)) {
      this.tel_book = (Integer) __fieldVal;
    }
    else    if ("version".equals(__fieldName)) {
      this.version = (Long) __fieldVal;
    }
    else    if ("url_short".equals(__fieldName)) {
      this.url_short = (String) __fieldVal;
    }
    else    if ("other_notice".equals(__fieldName)) {
      this.other_notice = (String) __fieldVal;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("update_time".equals(__fieldName)) {
      this.update_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("source_type".equals(__fieldName)) {
      this.source_type = (Integer) __fieldVal;
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
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Long) __fieldVal;
      return true;
    }
    else    if ("title".equals(__fieldName)) {
      this.title = (String) __fieldVal;
      return true;
    }
    else    if ("summary".equals(__fieldName)) {
      this.summary = (String) __fieldVal;
      return true;
    }
    else    if ("city_id".equals(__fieldName)) {
      this.city_id = (Long) __fieldVal;
      return true;
    }
    else    if ("group_id".equals(__fieldName)) {
      this.group_id = (Long) __fieldVal;
      return true;
    }
    else    if ("partner_id".equals(__fieldName)) {
      this.partner_id = (Long) __fieldVal;
      return true;
    }
    else    if ("system".equals(__fieldName)) {
      this.system = (String) __fieldVal;
      return true;
    }
    else    if ("team_price".equals(__fieldName)) {
      this.team_price = (Float) __fieldVal;
      return true;
    }
    else    if ("market_price".equals(__fieldName)) {
      this.market_price = (Float) __fieldVal;
      return true;
    }
    else    if ("product".equals(__fieldName)) {
      this.product = (String) __fieldVal;
      return true;
    }
    else    if ("condbuy".equals(__fieldName)) {
      this.condbuy = (String) __fieldVal;
      return true;
    }
    else    if ("per_number".equals(__fieldName)) {
      this.per_number = (Long) __fieldVal;
      return true;
    }
    else    if ("min_number".equals(__fieldName)) {
      this.min_number = (Long) __fieldVal;
      return true;
    }
    else    if ("max_number".equals(__fieldName)) {
      this.max_number = (Long) __fieldVal;
      return true;
    }
    else    if ("now_number".equals(__fieldName)) {
      this.now_number = (Long) __fieldVal;
      return true;
    }
    else    if ("pre_number".equals(__fieldName)) {
      this.pre_number = (Long) __fieldVal;
      return true;
    }
    else    if ("image".equals(__fieldName)) {
      this.image = (String) __fieldVal;
      return true;
    }
    else    if ("image1".equals(__fieldName)) {
      this.image1 = (String) __fieldVal;
      return true;
    }
    else    if ("image2".equals(__fieldName)) {
      this.image2 = (String) __fieldVal;
      return true;
    }
    else    if ("flv".equals(__fieldName)) {
      this.flv = (String) __fieldVal;
      return true;
    }
    else    if ("mobile".equals(__fieldName)) {
      this.mobile = (String) __fieldVal;
      return true;
    }
    else    if ("credit".equals(__fieldName)) {
      this.credit = (Long) __fieldVal;
      return true;
    }
    else    if ("card".equals(__fieldName)) {
      this.card = (Long) __fieldVal;
      return true;
    }
    else    if ("fare".equals(__fieldName)) {
      this.fare = (Long) __fieldVal;
      return true;
    }
    else    if ("farefree".equals(__fieldName)) {
      this.farefree = (Long) __fieldVal;
      return true;
    }
    else    if ("bonus".equals(__fieldName)) {
      this.bonus = (Long) __fieldVal;
      return true;
    }
    else    if ("address".equals(__fieldName)) {
      this.address = (String) __fieldVal;
      return true;
    }
    else    if ("detail".equals(__fieldName)) {
      this.detail = (String) __fieldVal;
      return true;
    }
    else    if ("systemreview".equals(__fieldName)) {
      this.systemreview = (String) __fieldVal;
      return true;
    }
    else    if ("userreview".equals(__fieldName)) {
      this.userreview = (String) __fieldVal;
      return true;
    }
    else    if ("notice".equals(__fieldName)) {
      this.notice = (String) __fieldVal;
      return true;
    }
    else    if ("express".equals(__fieldName)) {
      this.express = (String) __fieldVal;
      return true;
    }
    else    if ("delivery".equals(__fieldName)) {
      this.delivery = (String) __fieldVal;
      return true;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
      return true;
    }
    else    if ("conduser".equals(__fieldName)) {
      this.conduser = (String) __fieldVal;
      return true;
    }
    else    if ("buyonce".equals(__fieldName)) {
      this.buyonce = (String) __fieldVal;
      return true;
    }
    else    if ("team_type".equals(__fieldName)) {
      this.team_type = (String) __fieldVal;
      return true;
    }
    else    if ("sort_order".equals(__fieldName)) {
      this.sort_order = (Long) __fieldVal;
      return true;
    }
    else    if ("expire_time".equals(__fieldName)) {
      this.expire_time = (Long) __fieldVal;
      return true;
    }
    else    if ("begin_time".equals(__fieldName)) {
      this.begin_time = (Long) __fieldVal;
      return true;
    }
    else    if ("end_time".equals(__fieldName)) {
      this.end_time = (Long) __fieldVal;
      return true;
    }
    else    if ("reach_time".equals(__fieldName)) {
      this.reach_time = (Long) __fieldVal;
      return true;
    }
    else    if ("close_time".equals(__fieldName)) {
      this.close_time = (Long) __fieldVal;
      return true;
    }
    else    if ("seo_title".equals(__fieldName)) {
      this.seo_title = (String) __fieldVal;
      return true;
    }
    else    if ("seo_keyword".equals(__fieldName)) {
      this.seo_keyword = (String) __fieldVal;
      return true;
    }
    else    if ("seo_description".equals(__fieldName)) {
      this.seo_description = (String) __fieldVal;
      return true;
    }
    else    if ("stitle".equals(__fieldName)) {
      this.stitle = (String) __fieldVal;
      return true;
    }
    else    if ("sales".equals(__fieldName)) {
      this.sales = (String) __fieldVal;
      return true;
    }
    else    if ("publish".equals(__fieldName)) {
      this.publish = (String) __fieldVal;
      return true;
    }
    else    if ("profit".equals(__fieldName)) {
      this.profit = (Long) __fieldVal;
      return true;
    }
    else    if ("hotel_seq".equals(__fieldName)) {
      this.hotel_seq = (String) __fieldVal;
      return true;
    }
    else    if ("order_type".equals(__fieldName)) {
      this.order_type = (String) __fieldVal;
      return true;
    }
    else    if ("hide_partner".equals(__fieldName)) {
      this.hide_partner = (String) __fieldVal;
      return true;
    }
    else    if ("departure".equals(__fieldName)) {
      this.departure = (String) __fieldVal;
      return true;
    }
    else    if ("arrive".equals(__fieldName)) {
      this.arrive = (String) __fieldVal;
      return true;
    }
    else    if ("extra_sms".equals(__fieldName)) {
      this.extra_sms = (String) __fieldVal;
      return true;
    }
    else    if ("room_type".equals(__fieldName)) {
      this.room_type = (String) __fieldVal;
      return true;
    }
    else    if ("sort_tag".equals(__fieldName)) {
      this.sort_tag = (String) __fieldVal;
      return true;
    }
    else    if ("check_in_time".equals(__fieldName)) {
      this.check_in_time = (Long) __fieldVal;
      return true;
    }
    else    if ("wireless_team_desc".equals(__fieldName)) {
      this.wireless_team_desc = (String) __fieldVal;
      return true;
    }
    else    if ("wireless_special_notes".equals(__fieldName)) {
      this.wireless_special_notes = (String) __fieldVal;
      return true;
    }
    else    if ("wireless_long_lat".equals(__fieldName)) {
      this.wireless_long_lat = (String) __fieldVal;
      return true;
    }
    else    if ("express_fee".equals(__fieldName)) {
      this.express_fee = (Float) __fieldVal;
      return true;
    }
    else    if ("travel_days".equals(__fieldName)) {
      this.travel_days = (String) __fieldVal;
      return true;
    }
    else    if ("travel_status".equals(__fieldName)) {
      this.travel_status = (String) __fieldVal;
      return true;
    }
    else    if ("popularize".equals(__fieldName)) {
      this.popularize = (Integer) __fieldVal;
      return true;
    }
    else    if ("major_popularize".equals(__fieldName)) {
      this.major_popularize = (Integer) __fieldVal;
      return true;
    }
    else    if ("have_popularize".equals(__fieldName)) {
      this.have_popularize = (Long) __fieldVal;
      return true;
    }
    else    if ("bannerimage".equals(__fieldName)) {
      this.bannerimage = (String) __fieldVal;
      return true;
    }
    else    if ("earliest_start".equals(__fieldName)) {
      this.earliest_start = (Long) __fieldVal;
      return true;
    }
    else    if ("room_desc".equals(__fieldName)) {
      this.room_desc = (String) __fieldVal;
      return true;
    }
    else    if ("cost_price".equals(__fieldName)) {
      this.cost_price = (Float) __fieldVal;
      return true;
    }
    else    if ("red_envelope".equals(__fieldName)) {
      this.red_envelope = (Long) __fieldVal;
      return true;
    }
    else    if ("team_price_high".equals(__fieldName)) {
      this.team_price_high = (Float) __fieldVal;
      return true;
    }
    else    if ("market_price_high".equals(__fieldName)) {
      this.market_price_high = (Float) __fieldVal;
      return true;
    }
    else    if ("flight_max_discount".equals(__fieldName)) {
      this.flight_max_discount = (String) __fieldVal;
      return true;
    }
    else    if ("flight_max_save".equals(__fieldName)) {
      this.flight_max_save = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_type".equals(__fieldName)) {
      this.hotel_type = (String) __fieldVal;
      return true;
    }
    else    if ("voucher_val".equals(__fieldName)) {
      this.voucher_val = (Integer) __fieldVal;
      return true;
    }
    else    if ("travel_long".equals(__fieldName)) {
      this.travel_long = (Integer) __fieldVal;
      return true;
    }
    else    if ("p_team_id".equals(__fieldName)) {
      this.p_team_id = (Long) __fieldVal;
      return true;
    }
    else    if ("tuan_room_type".equals(__fieldName)) {
      this.tuan_room_type = (String) __fieldVal;
      return true;
    }
    else    if ("tuan_project_name".equals(__fieldName)) {
      this.tuan_project_name = (String) __fieldVal;
      return true;
    }
    else    if ("tuan_project_des".equals(__fieldName)) {
      this.tuan_project_des = (String) __fieldVal;
      return true;
    }
    else    if ("son_hotel_names".equals(__fieldName)) {
      this.son_hotel_names = (String) __fieldVal;
      return true;
    }
    else    if ("son_hotel_address".equals(__fieldName)) {
      this.son_hotel_address = (String) __fieldVal;
      return true;
    }
    else    if ("baojian_total".equals(__fieldName)) {
      this.baojian_total = (Integer) __fieldVal;
      return true;
    }
    else    if ("tips".equals(__fieldName)) {
      this.tips = (String) __fieldVal;
      return true;
    }
    else    if ("qqgid".equals(__fieldName)) {
      this.qqgid = (Long) __fieldVal;
      return true;
    }
    else    if ("payment_method".equals(__fieldName)) {
      this.payment_method = (String) __fieldVal;
      return true;
    }
    else    if ("payment_condition".equals(__fieldName)) {
      this.payment_condition = (String) __fieldVal;
      return true;
    }
    else    if ("through_coupon_total".equals(__fieldName)) {
      this.through_coupon_total = (Integer) __fieldVal;
      return true;
    }
    else    if ("subtitle".equals(__fieldName)) {
      this.subtitle = (String) __fieldVal;
      return true;
    }
    else    if ("leave_time".equals(__fieldName)) {
      this.leave_time = (String) __fieldVal;
      return true;
    }
    else    if ("refund_support".equals(__fieldName)) {
      this.refund_support = (Integer) __fieldVal;
      return true;
    }
    else    if ("traffic_desc".equals(__fieldName)) {
      this.traffic_desc = (String) __fieldVal;
      return true;
    }
    else    if ("scenic_desc".equals(__fieldName)) {
      this.scenic_desc = (String) __fieldVal;
      return true;
    }
    else    if ("money_use_detail".equals(__fieldName)) {
      this.money_use_detail = (String) __fieldVal;
      return true;
    }
    else    if ("good_food".equals(__fieldName)) {
      this.good_food = (String) __fieldVal;
      return true;
    }
    else    if ("hotel_desc".equals(__fieldName)) {
      this.hotel_desc = (String) __fieldVal;
      return true;
    }
    else    if ("hide_room_type".equals(__fieldName)) {
      this.hide_room_type = (String) __fieldVal;
      return true;
    }
    else    if ("modeldisplay".equals(__fieldName)) {
      this.modeldisplay = (String) __fieldVal;
      return true;
    }
    else    if ("if_need_visa".equals(__fieldName)) {
      this.if_need_visa = (Boolean) __fieldVal;
      return true;
    }
    else    if ("buy_tips".equals(__fieldName)) {
      this.buy_tips = (String) __fieldVal;
      return true;
    }
    else    if ("is_new_team".equals(__fieldName)) {
      this.is_new_team = (Integer) __fieldVal;
      return true;
    }
    else    if ("related_sight".equals(__fieldName)) {
      this.related_sight = (String) __fieldVal;
      return true;
    }
    else    if ("publish_2dcode".equals(__fieldName)) {
      this.publish_2dcode = (String) __fieldVal;
      return true;
    }
    else    if ("settlement_id".equals(__fieldName)) {
      this.settlement_id = (Long) __fieldVal;
      return true;
    }
    else    if ("settlement_days".equals(__fieldName)) {
      this.settlement_days = (Long) __fieldVal;
      return true;
    }
    else    if ("ticket_input_time".equals(__fieldName)) {
      this.ticket_input_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("expressno_input_time".equals(__fieldName)) {
      this.expressno_input_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("last_back_time".equals(__fieldName)) {
      this.last_back_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("pre_sale".equals(__fieldName)) {
      this.pre_sale = (String) __fieldVal;
      return true;
    }
    else    if ("use_time_limit".equals(__fieldName)) {
      this.use_time_limit = (String) __fieldVal;
      return true;
    }
    else    if ("travel_nights".equals(__fieldName)) {
      this.travel_nights = (String) __fieldVal;
      return true;
    }
    else    if ("topic_label".equals(__fieldName)) {
      this.topic_label = (String) __fieldVal;
      return true;
    }
    else    if ("purchase_option".equals(__fieldName)) {
      this.purchase_option = (String) __fieldVal;
      return true;
    }
    else    if ("price_type".equals(__fieldName)) {
      this.price_type = (String) __fieldVal;
      return true;
    }
    else    if ("hide_room_status".equals(__fieldName)) {
      this.hide_room_status = (String) __fieldVal;
      return true;
    }
    else    if ("suggest_reason".equals(__fieldName)) {
      this.suggest_reason = (String) __fieldVal;
      return true;
    }
    else    if ("holiday_tts".equals(__fieldName)) {
      this.holiday_tts = (Integer) __fieldVal;
      return true;
    }
    else    if ("tts_mul_price".equals(__fieldName)) {
      this.tts_mul_price = (Integer) __fieldVal;
      return true;
    }
    else    if ("tts_id".equals(__fieldName)) {
      this.tts_id = (String) __fieldVal;
      return true;
    }
    else    if ("hms_can_book".equals(__fieldName)) {
      this.hms_can_book = (Integer) __fieldVal;
      return true;
    }
    else    if ("hms_unlock".equals(__fieldName)) {
      this.hms_unlock = (Integer) __fieldVal;
      return true;
    }
    else    if ("detail_table".equals(__fieldName)) {
      this.detail_table = (Integer) __fieldVal;
      return true;
    }
    else    if ("holidaytts_publish_request".equals(__fieldName)) {
      this.holidaytts_publish_request = (Integer) __fieldVal;
      return true;
    }
    else    if ("downline_time".equals(__fieldName)) {
      this.downline_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("express_expire_time".equals(__fieldName)) {
      this.express_expire_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("holidaytts_free_package".equals(__fieldName)) {
      this.holidaytts_free_package = (Integer) __fieldVal;
      return true;
    }
    else    if ("new_type".equals(__fieldName)) {
      this.new_type = (String) __fieldVal;
      return true;
    }
    else    if ("holidaytts_distribution_way".equals(__fieldName)) {
      this.holidaytts_distribution_way = (String) __fieldVal;
      return true;
    }
    else    if ("holidaytts_pay_way".equals(__fieldName)) {
      this.holidaytts_pay_way = (String) __fieldVal;
      return true;
    }
    else    if ("holiday_tts_ticket_type".equals(__fieldName)) {
      this.holiday_tts_ticket_type = (String) __fieldVal;
      return true;
    }
    else    if ("tuanhide".equals(__fieldName)) {
      this.tuanhide = (Integer) __fieldVal;
      return true;
    }
    else    if ("holidaytts_ticket_id".equals(__fieldName)) {
      this.holidaytts_ticket_id = (String) __fieldVal;
      return true;
    }
    else    if ("is_active_hoteldesc".equals(__fieldName)) {
      this.is_active_hoteldesc = (Integer) __fieldVal;
      return true;
    }
    else    if ("team_display_type".equals(__fieldName)) {
      this.team_display_type = (String) __fieldVal;
      return true;
    }
    else    if ("holiday_tts_taocan".equals(__fieldName)) {
      this.holiday_tts_taocan = (String) __fieldVal;
      return true;
    }
    else    if ("holidaytts_scheduler".equals(__fieldName)) {
      this.holidaytts_scheduler = (String) __fieldVal;
      return true;
    }
    else    if ("sight_info".equals(__fieldName)) {
      this.sight_info = (String) __fieldVal;
      return true;
    }
    else    if ("holidaytts_id".equals(__fieldName)) {
      this.holidaytts_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("holidaytts_ext_info".equals(__fieldName)) {
      this.holidaytts_ext_info = (String) __fieldVal;
      return true;
    }
    else    if ("new_attr".equals(__fieldName)) {
      this.new_attr = (String) __fieldVal;
      return true;
    }
    else    if ("partner_source".equals(__fieldName)) {
      this.partner_source = (Integer) __fieldVal;
      return true;
    }
    else    if ("other_tuan_type".equals(__fieldName)) {
      this.other_tuan_type = (String) __fieldVal;
      return true;
    }
    else    if ("other_tuan_id".equals(__fieldName)) {
      this.other_tuan_id = (Long) __fieldVal;
      return true;
    }
    else    if ("other_tuan_detail".equals(__fieldName)) {
      this.other_tuan_detail = (String) __fieldVal;
      return true;
    }
    else    if ("tags".equals(__fieldName)) {
      this.tags = (String) __fieldVal;
      return true;
    }
    else    if ("refund_condition".equals(__fieldName)) {
      this.refund_condition = (String) __fieldVal;
      return true;
    }
    else    if ("other_tuan_data".equals(__fieldName)) {
      this.other_tuan_data = (String) __fieldVal;
      return true;
    }
    else    if ("sign_company".equals(__fieldName)) {
      this.sign_company = (Integer) __fieldVal;
      return true;
    }
    else    if ("settlement_type".equals(__fieldName)) {
      this.settlement_type = (String) __fieldVal;
      return true;
    }
    else    if ("is_union_product".equals(__fieldName)) {
      this.is_union_product = (Integer) __fieldVal;
      return true;
    }
    else    if ("tuan_product_type".equals(__fieldName)) {
      this.tuan_product_type = (String) __fieldVal;
      return true;
    }
    else    if ("pre_date".equals(__fieldName)) {
      this.pre_date = (Integer) __fieldVal;
      return true;
    }
    else    if ("tel_book".equals(__fieldName)) {
      this.tel_book = (Integer) __fieldVal;
      return true;
    }
    else    if ("version".equals(__fieldName)) {
      this.version = (Long) __fieldVal;
      return true;
    }
    else    if ("url_short".equals(__fieldName)) {
      this.url_short = (String) __fieldVal;
      return true;
    }
    else    if ("other_notice".equals(__fieldName)) {
      this.other_notice = (String) __fieldVal;
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
    else    if ("source_type".equals(__fieldName)) {
      this.source_type = (Integer) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
