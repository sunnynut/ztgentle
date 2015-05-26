// ORM class for table 'team_hms_package'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jan 08 16:00:14 CST 2015
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

public class team_hms_package extends SqoopRecord  implements DBWritable, Writable {
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
  public team_hms_package with_id(Long id) {
    this.id = id;
    return this;
  }
  private String title;
  public String get_title() {
    return title;
  }
  public void set_title(String title) {
    this.title = title;
  }
  public team_hms_package with_title(String title) {
    this.title = title;
    return this;
  }
  private Integer price;
  public Integer get_price() {
    return price;
  }
  public void set_price(Integer price) {
    this.price = price;
  }
  public team_hms_package with_price(Integer price) {
    this.price = price;
    return this;
  }
  private Integer use_total;
  public Integer get_use_total() {
    return use_total;
  }
  public void set_use_total(Integer use_total) {
    this.use_total = use_total;
  }
  public team_hms_package with_use_total(Integer use_total) {
    this.use_total = use_total;
    return this;
  }
  private Integer now_number;
  public Integer get_now_number() {
    return now_number;
  }
  public void set_now_number(Integer now_number) {
    this.now_number = now_number;
  }
  public team_hms_package with_now_number(Integer now_number) {
    this.now_number = now_number;
    return this;
  }
  private Long team_id;
  public Long get_team_id() {
    return team_id;
  }
  public void set_team_id(Long team_id) {
    this.team_id = team_id;
  }
  public team_hms_package with_team_id(Long team_id) {
    this.team_id = team_id;
    return this;
  }
  private Integer market_price;
  public Integer get_market_price() {
    return market_price;
  }
  public void set_market_price(Integer market_price) {
    this.market_price = market_price;
  }
  public team_hms_package with_market_price(Integer market_price) {
    this.market_price = market_price;
    return this;
  }
  private Integer pre_number;
  public Integer get_pre_number() {
    return pre_number;
  }
  public void set_pre_number(Integer pre_number) {
    this.pre_number = pre_number;
  }
  public team_hms_package with_pre_number(Integer pre_number) {
    this.pre_number = pre_number;
    return this;
  }
  private Float cost_price;
  public Float get_cost_price() {
    return cost_price;
  }
  public void set_cost_price(Float cost_price) {
    this.cost_price = cost_price;
  }
  public team_hms_package with_cost_price(Float cost_price) {
    this.cost_price = cost_price;
    return this;
  }
  private Integer profit;
  public Integer get_profit() {
    return profit;
  }
  public void set_profit(Integer profit) {
    this.profit = profit;
  }
  public team_hms_package with_profit(Integer profit) {
    this.profit = profit;
    return this;
  }
  private Integer max_number;
  public Integer get_max_number() {
    return max_number;
  }
  public void set_max_number(Integer max_number) {
    this.max_number = max_number;
  }
  public team_hms_package with_max_number(Integer max_number) {
    this.max_number = max_number;
    return this;
  }
  private Integer card;
  public Integer get_card() {
    return card;
  }
  public void set_card(Integer card) {
    this.card = card;
  }
  public team_hms_package with_card(Integer card) {
    this.card = card;
    return this;
  }
  private Integer red_envelope;
  public Integer get_red_envelope() {
    return red_envelope;
  }
  public void set_red_envelope(Integer red_envelope) {
    this.red_envelope = red_envelope;
  }
  public team_hms_package with_red_envelope(Integer red_envelope) {
    this.red_envelope = red_envelope;
    return this;
  }
  private java.sql.Timestamp start_date;
  public java.sql.Timestamp get_start_date() {
    return start_date;
  }
  public void set_start_date(java.sql.Timestamp start_date) {
    this.start_date = start_date;
  }
  public team_hms_package with_start_date(java.sql.Timestamp start_date) {
    this.start_date = start_date;
    return this;
  }
  private java.sql.Timestamp end_date;
  public java.sql.Timestamp get_end_date() {
    return end_date;
  }
  public void set_end_date(java.sql.Timestamp end_date) {
    this.end_date = end_date;
  }
  public team_hms_package with_end_date(java.sql.Timestamp end_date) {
    this.end_date = end_date;
    return this;
  }
  private Float extra_price;
  public Float get_extra_price() {
    return extra_price;
  }
  public void set_extra_price(Float extra_price) {
    this.extra_price = extra_price;
  }
  public team_hms_package with_extra_price(Float extra_price) {
    this.extra_price = extra_price;
    return this;
  }
  private Float minus_price;
  public Float get_minus_price() {
    return minus_price;
  }
  public void set_minus_price(Float minus_price) {
    this.minus_price = minus_price;
  }
  public team_hms_package with_minus_price(Float minus_price) {
    this.minus_price = minus_price;
    return this;
  }
  private String use_restrict;
  public String get_use_restrict() {
    return use_restrict;
  }
  public void set_use_restrict(String use_restrict) {
    this.use_restrict = use_restrict;
  }
  public team_hms_package with_use_restrict(String use_restrict) {
    this.use_restrict = use_restrict;
    return this;
  }
  private Integer is_del;
  public Integer get_is_del() {
    return is_del;
  }
  public void set_is_del(Integer is_del) {
    this.is_del = is_del;
  }
  public team_hms_package with_is_del(Integer is_del) {
    this.is_del = is_del;
    return this;
  }
  private java.sql.Timestamp update_time;
  public java.sql.Timestamp get_update_time() {
    return update_time;
  }
  public void set_update_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
  }
  public team_hms_package with_update_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof team_hms_package)) {
      return false;
    }
    team_hms_package that = (team_hms_package) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.price == null ? that.price == null : this.price.equals(that.price));
    equal = equal && (this.use_total == null ? that.use_total == null : this.use_total.equals(that.use_total));
    equal = equal && (this.now_number == null ? that.now_number == null : this.now_number.equals(that.now_number));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.market_price == null ? that.market_price == null : this.market_price.equals(that.market_price));
    equal = equal && (this.pre_number == null ? that.pre_number == null : this.pre_number.equals(that.pre_number));
    equal = equal && (this.cost_price == null ? that.cost_price == null : this.cost_price.equals(that.cost_price));
    equal = equal && (this.profit == null ? that.profit == null : this.profit.equals(that.profit));
    equal = equal && (this.max_number == null ? that.max_number == null : this.max_number.equals(that.max_number));
    equal = equal && (this.card == null ? that.card == null : this.card.equals(that.card));
    equal = equal && (this.red_envelope == null ? that.red_envelope == null : this.red_envelope.equals(that.red_envelope));
    equal = equal && (this.start_date == null ? that.start_date == null : this.start_date.equals(that.start_date));
    equal = equal && (this.end_date == null ? that.end_date == null : this.end_date.equals(that.end_date));
    equal = equal && (this.extra_price == null ? that.extra_price == null : this.extra_price.equals(that.extra_price));
    equal = equal && (this.minus_price == null ? that.minus_price == null : this.minus_price.equals(that.minus_price));
    equal = equal && (this.use_restrict == null ? that.use_restrict == null : this.use_restrict.equals(that.use_restrict));
    equal = equal && (this.is_del == null ? that.is_del == null : this.is_del.equals(that.is_del));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof team_hms_package)) {
      return false;
    }
    team_hms_package that = (team_hms_package) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.price == null ? that.price == null : this.price.equals(that.price));
    equal = equal && (this.use_total == null ? that.use_total == null : this.use_total.equals(that.use_total));
    equal = equal && (this.now_number == null ? that.now_number == null : this.now_number.equals(that.now_number));
    equal = equal && (this.team_id == null ? that.team_id == null : this.team_id.equals(that.team_id));
    equal = equal && (this.market_price == null ? that.market_price == null : this.market_price.equals(that.market_price));
    equal = equal && (this.pre_number == null ? that.pre_number == null : this.pre_number.equals(that.pre_number));
    equal = equal && (this.cost_price == null ? that.cost_price == null : this.cost_price.equals(that.cost_price));
    equal = equal && (this.profit == null ? that.profit == null : this.profit.equals(that.profit));
    equal = equal && (this.max_number == null ? that.max_number == null : this.max_number.equals(that.max_number));
    equal = equal && (this.card == null ? that.card == null : this.card.equals(that.card));
    equal = equal && (this.red_envelope == null ? that.red_envelope == null : this.red_envelope.equals(that.red_envelope));
    equal = equal && (this.start_date == null ? that.start_date == null : this.start_date.equals(that.start_date));
    equal = equal && (this.end_date == null ? that.end_date == null : this.end_date.equals(that.end_date));
    equal = equal && (this.extra_price == null ? that.extra_price == null : this.extra_price.equals(that.extra_price));
    equal = equal && (this.minus_price == null ? that.minus_price == null : this.minus_price.equals(that.minus_price));
    equal = equal && (this.use_restrict == null ? that.use_restrict == null : this.use_restrict.equals(that.use_restrict));
    equal = equal && (this.is_del == null ? that.is_del == null : this.is_del.equals(that.is_del));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.title = JdbcWritableBridge.readString(2, __dbResults);
    this.price = JdbcWritableBridge.readInteger(3, __dbResults);
    this.use_total = JdbcWritableBridge.readInteger(4, __dbResults);
    this.now_number = JdbcWritableBridge.readInteger(5, __dbResults);
    this.team_id = JdbcWritableBridge.readLong(6, __dbResults);
    this.market_price = JdbcWritableBridge.readInteger(7, __dbResults);
    this.pre_number = JdbcWritableBridge.readInteger(8, __dbResults);
    this.cost_price = JdbcWritableBridge.readFloat(9, __dbResults);
    this.profit = JdbcWritableBridge.readInteger(10, __dbResults);
    this.max_number = JdbcWritableBridge.readInteger(11, __dbResults);
    this.card = JdbcWritableBridge.readInteger(12, __dbResults);
    this.red_envelope = JdbcWritableBridge.readInteger(13, __dbResults);
    this.start_date = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.end_date = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.extra_price = JdbcWritableBridge.readFloat(16, __dbResults);
    this.minus_price = JdbcWritableBridge.readFloat(17, __dbResults);
    this.use_restrict = JdbcWritableBridge.readString(18, __dbResults);
    this.is_del = JdbcWritableBridge.readInteger(19, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(20, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.title = JdbcWritableBridge.readString(2, __dbResults);
    this.price = JdbcWritableBridge.readInteger(3, __dbResults);
    this.use_total = JdbcWritableBridge.readInteger(4, __dbResults);
    this.now_number = JdbcWritableBridge.readInteger(5, __dbResults);
    this.team_id = JdbcWritableBridge.readLong(6, __dbResults);
    this.market_price = JdbcWritableBridge.readInteger(7, __dbResults);
    this.pre_number = JdbcWritableBridge.readInteger(8, __dbResults);
    this.cost_price = JdbcWritableBridge.readFloat(9, __dbResults);
    this.profit = JdbcWritableBridge.readInteger(10, __dbResults);
    this.max_number = JdbcWritableBridge.readInteger(11, __dbResults);
    this.card = JdbcWritableBridge.readInteger(12, __dbResults);
    this.red_envelope = JdbcWritableBridge.readInteger(13, __dbResults);
    this.start_date = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.end_date = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.extra_price = JdbcWritableBridge.readFloat(16, __dbResults);
    this.minus_price = JdbcWritableBridge.readFloat(17, __dbResults);
    this.use_restrict = JdbcWritableBridge.readString(18, __dbResults);
    this.is_del = JdbcWritableBridge.readInteger(19, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(20, __dbResults);
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
    JdbcWritableBridge.writeString(title, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(price, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(use_total, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(now_number, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(team_id, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(market_price, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(pre_number, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(cost_price, 9 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(profit, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(max_number, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(card, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(red_envelope, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(start_date, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(end_date, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeFloat(extra_price, 16 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(minus_price, 17 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(use_restrict, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(is_del, 19 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 20 + __off, 93, __dbStmt);
    return 20;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(title, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(price, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(use_total, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(now_number, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(team_id, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(market_price, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(pre_number, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(cost_price, 9 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(profit, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(max_number, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(card, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(red_envelope, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(start_date, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(end_date, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeFloat(extra_price, 16 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(minus_price, 17 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(use_restrict, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(is_del, 19 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 20 + __off, 93, __dbStmt);
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
        this.title = null;
    } else {
    this.title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.price = null;
    } else {
    this.price = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.use_total = null;
    } else {
    this.use_total = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.now_number = null;
    } else {
    this.now_number = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.team_id = null;
    } else {
    this.team_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.market_price = null;
    } else {
    this.market_price = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.pre_number = null;
    } else {
    this.pre_number = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cost_price = null;
    } else {
    this.cost_price = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.profit = null;
    } else {
    this.profit = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.max_number = null;
    } else {
    this.max_number = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.card = null;
    } else {
    this.card = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.red_envelope = null;
    } else {
    this.red_envelope = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.start_date = null;
    } else {
    this.start_date = new Timestamp(__dataIn.readLong());
    this.start_date.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.end_date = null;
    } else {
    this.end_date = new Timestamp(__dataIn.readLong());
    this.end_date.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.extra_price = null;
    } else {
    this.extra_price = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.minus_price = null;
    } else {
    this.minus_price = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.use_restrict = null;
    } else {
    this.use_restrict = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.is_del = null;
    } else {
    this.is_del = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.update_time = null;
    } else {
    this.update_time = new Timestamp(__dataIn.readLong());
    this.update_time.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.price);
    }
    if (null == this.use_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.use_total);
    }
    if (null == this.now_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.now_number);
    }
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.team_id);
    }
    if (null == this.market_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.market_price);
    }
    if (null == this.pre_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.pre_number);
    }
    if (null == this.cost_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.cost_price);
    }
    if (null == this.profit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.profit);
    }
    if (null == this.max_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.max_number);
    }
    if (null == this.card) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.card);
    }
    if (null == this.red_envelope) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.red_envelope);
    }
    if (null == this.start_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_date.getTime());
    __dataOut.writeInt(this.start_date.getNanos());
    }
    if (null == this.end_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.end_date.getTime());
    __dataOut.writeInt(this.end_date.getNanos());
    }
    if (null == this.extra_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.extra_price);
    }
    if (null == this.minus_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.minus_price);
    }
    if (null == this.use_restrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, use_restrict);
    }
    if (null == this.is_del) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_del);
    }
    if (null == this.update_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_time.getTime());
    __dataOut.writeInt(this.update_time.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.price);
    }
    if (null == this.use_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.use_total);
    }
    if (null == this.now_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.now_number);
    }
    if (null == this.team_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.team_id);
    }
    if (null == this.market_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.market_price);
    }
    if (null == this.pre_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.pre_number);
    }
    if (null == this.cost_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.cost_price);
    }
    if (null == this.profit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.profit);
    }
    if (null == this.max_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.max_number);
    }
    if (null == this.card) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.card);
    }
    if (null == this.red_envelope) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.red_envelope);
    }
    if (null == this.start_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_date.getTime());
    __dataOut.writeInt(this.start_date.getNanos());
    }
    if (null == this.end_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.end_date.getTime());
    __dataOut.writeInt(this.end_date.getNanos());
    }
    if (null == this.extra_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.extra_price);
    }
    if (null == this.minus_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.minus_price);
    }
    if (null == this.use_restrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, use_restrict);
    }
    if (null == this.is_del) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_del);
    }
    if (null == this.update_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_time.getTime());
    __dataOut.writeInt(this.update_time.getNanos());
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(title==null?"null":title, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(price==null?"null":"" + price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(use_total==null?"null":"" + use_total, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(now_number==null?"null":"" + now_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(market_price==null?"null":"" + market_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pre_number==null?"null":"" + pre_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cost_price==null?"null":"" + cost_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(profit==null?"null":"" + profit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(max_number==null?"null":"" + max_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(card==null?"null":"" + card, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(red_envelope==null?"null":"" + red_envelope, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_date==null?"null":"" + start_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_date==null?"null":"" + end_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(extra_price==null?"null":"" + extra_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(minus_price==null?"null":"" + minus_price, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(use_restrict==null?"null":use_restrict, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_del==null?"null":"" + is_del, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"null":"" + update_time, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(title==null?"null":title, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(price==null?"null":"" + price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(use_total==null?"null":"" + use_total, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(now_number==null?"null":"" + now_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(team_id==null?"null":"" + team_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(market_price==null?"null":"" + market_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pre_number==null?"null":"" + pre_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cost_price==null?"null":"" + cost_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(profit==null?"null":"" + profit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(max_number==null?"null":"" + max_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(card==null?"null":"" + card, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(red_envelope==null?"null":"" + red_envelope, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_date==null?"null":"" + start_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_date==null?"null":"" + end_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(extra_price==null?"null":"" + extra_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(minus_price==null?"null":"" + minus_price, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(use_restrict==null?"null":use_restrict, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_del==null?"null":"" + is_del, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"null":"" + update_time, delimiters));
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
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.price = null; } else {
      this.price = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.use_total = null; } else {
      this.use_total = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.now_number = null; } else {
      this.now_number = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.market_price = null; } else {
      this.market_price = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pre_number = null; } else {
      this.pre_number = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cost_price = null; } else {
      this.cost_price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.profit = null; } else {
      this.profit = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.max_number = null; } else {
      this.max_number = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.card = null; } else {
      this.card = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.red_envelope = null; } else {
      this.red_envelope = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_date = null; } else {
      this.start_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_date = null; } else {
      this.end_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.extra_price = null; } else {
      this.extra_price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.minus_price = null; } else {
      this.minus_price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.use_restrict = null; } else {
      this.use_restrict = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_del = null; } else {
      this.is_del = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_time = null; } else {
      this.update_time = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.price = null; } else {
      this.price = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.use_total = null; } else {
      this.use_total = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.now_number = null; } else {
      this.now_number = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.team_id = null; } else {
      this.team_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.market_price = null; } else {
      this.market_price = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pre_number = null; } else {
      this.pre_number = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cost_price = null; } else {
      this.cost_price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.profit = null; } else {
      this.profit = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.max_number = null; } else {
      this.max_number = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.card = null; } else {
      this.card = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.red_envelope = null; } else {
      this.red_envelope = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_date = null; } else {
      this.start_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_date = null; } else {
      this.end_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.extra_price = null; } else {
      this.extra_price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.minus_price = null; } else {
      this.minus_price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.use_restrict = null; } else {
      this.use_restrict = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_del = null; } else {
      this.is_del = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_time = null; } else {
      this.update_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    team_hms_package o = (team_hms_package) super.clone();
    o.start_date = (o.start_date != null) ? (java.sql.Timestamp) o.start_date.clone() : null;
    o.end_date = (o.end_date != null) ? (java.sql.Timestamp) o.end_date.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
    return o;
  }

  public void clone0(team_hms_package o) throws CloneNotSupportedException {
    o.start_date = (o.start_date != null) ? (java.sql.Timestamp) o.start_date.clone() : null;
    o.end_date = (o.end_date != null) ? (java.sql.Timestamp) o.end_date.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("price", this.price);
    __sqoop$field_map.put("use_total", this.use_total);
    __sqoop$field_map.put("now_number", this.now_number);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("market_price", this.market_price);
    __sqoop$field_map.put("pre_number", this.pre_number);
    __sqoop$field_map.put("cost_price", this.cost_price);
    __sqoop$field_map.put("profit", this.profit);
    __sqoop$field_map.put("max_number", this.max_number);
    __sqoop$field_map.put("card", this.card);
    __sqoop$field_map.put("red_envelope", this.red_envelope);
    __sqoop$field_map.put("start_date", this.start_date);
    __sqoop$field_map.put("end_date", this.end_date);
    __sqoop$field_map.put("extra_price", this.extra_price);
    __sqoop$field_map.put("minus_price", this.minus_price);
    __sqoop$field_map.put("use_restrict", this.use_restrict);
    __sqoop$field_map.put("is_del", this.is_del);
    __sqoop$field_map.put("update_time", this.update_time);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("price", this.price);
    __sqoop$field_map.put("use_total", this.use_total);
    __sqoop$field_map.put("now_number", this.now_number);
    __sqoop$field_map.put("team_id", this.team_id);
    __sqoop$field_map.put("market_price", this.market_price);
    __sqoop$field_map.put("pre_number", this.pre_number);
    __sqoop$field_map.put("cost_price", this.cost_price);
    __sqoop$field_map.put("profit", this.profit);
    __sqoop$field_map.put("max_number", this.max_number);
    __sqoop$field_map.put("card", this.card);
    __sqoop$field_map.put("red_envelope", this.red_envelope);
    __sqoop$field_map.put("start_date", this.start_date);
    __sqoop$field_map.put("end_date", this.end_date);
    __sqoop$field_map.put("extra_price", this.extra_price);
    __sqoop$field_map.put("minus_price", this.minus_price);
    __sqoop$field_map.put("use_restrict", this.use_restrict);
    __sqoop$field_map.put("is_del", this.is_del);
    __sqoop$field_map.put("update_time", this.update_time);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Long) __fieldVal;
    }
    else    if ("title".equals(__fieldName)) {
      this.title = (String) __fieldVal;
    }
    else    if ("price".equals(__fieldName)) {
      this.price = (Integer) __fieldVal;
    }
    else    if ("use_total".equals(__fieldName)) {
      this.use_total = (Integer) __fieldVal;
    }
    else    if ("now_number".equals(__fieldName)) {
      this.now_number = (Integer) __fieldVal;
    }
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Long) __fieldVal;
    }
    else    if ("market_price".equals(__fieldName)) {
      this.market_price = (Integer) __fieldVal;
    }
    else    if ("pre_number".equals(__fieldName)) {
      this.pre_number = (Integer) __fieldVal;
    }
    else    if ("cost_price".equals(__fieldName)) {
      this.cost_price = (Float) __fieldVal;
    }
    else    if ("profit".equals(__fieldName)) {
      this.profit = (Integer) __fieldVal;
    }
    else    if ("max_number".equals(__fieldName)) {
      this.max_number = (Integer) __fieldVal;
    }
    else    if ("card".equals(__fieldName)) {
      this.card = (Integer) __fieldVal;
    }
    else    if ("red_envelope".equals(__fieldName)) {
      this.red_envelope = (Integer) __fieldVal;
    }
    else    if ("start_date".equals(__fieldName)) {
      this.start_date = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("end_date".equals(__fieldName)) {
      this.end_date = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("extra_price".equals(__fieldName)) {
      this.extra_price = (Float) __fieldVal;
    }
    else    if ("minus_price".equals(__fieldName)) {
      this.minus_price = (Float) __fieldVal;
    }
    else    if ("use_restrict".equals(__fieldName)) {
      this.use_restrict = (String) __fieldVal;
    }
    else    if ("is_del".equals(__fieldName)) {
      this.is_del = (Integer) __fieldVal;
    }
    else    if ("update_time".equals(__fieldName)) {
      this.update_time = (java.sql.Timestamp) __fieldVal;
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
    else    if ("title".equals(__fieldName)) {
      this.title = (String) __fieldVal;
      return true;
    }
    else    if ("price".equals(__fieldName)) {
      this.price = (Integer) __fieldVal;
      return true;
    }
    else    if ("use_total".equals(__fieldName)) {
      this.use_total = (Integer) __fieldVal;
      return true;
    }
    else    if ("now_number".equals(__fieldName)) {
      this.now_number = (Integer) __fieldVal;
      return true;
    }
    else    if ("team_id".equals(__fieldName)) {
      this.team_id = (Long) __fieldVal;
      return true;
    }
    else    if ("market_price".equals(__fieldName)) {
      this.market_price = (Integer) __fieldVal;
      return true;
    }
    else    if ("pre_number".equals(__fieldName)) {
      this.pre_number = (Integer) __fieldVal;
      return true;
    }
    else    if ("cost_price".equals(__fieldName)) {
      this.cost_price = (Float) __fieldVal;
      return true;
    }
    else    if ("profit".equals(__fieldName)) {
      this.profit = (Integer) __fieldVal;
      return true;
    }
    else    if ("max_number".equals(__fieldName)) {
      this.max_number = (Integer) __fieldVal;
      return true;
    }
    else    if ("card".equals(__fieldName)) {
      this.card = (Integer) __fieldVal;
      return true;
    }
    else    if ("red_envelope".equals(__fieldName)) {
      this.red_envelope = (Integer) __fieldVal;
      return true;
    }
    else    if ("start_date".equals(__fieldName)) {
      this.start_date = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("end_date".equals(__fieldName)) {
      this.end_date = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("extra_price".equals(__fieldName)) {
      this.extra_price = (Float) __fieldVal;
      return true;
    }
    else    if ("minus_price".equals(__fieldName)) {
      this.minus_price = (Float) __fieldVal;
      return true;
    }
    else    if ("use_restrict".equals(__fieldName)) {
      this.use_restrict = (String) __fieldVal;
      return true;
    }
    else    if ("is_del".equals(__fieldName)) {
      this.is_del = (Integer) __fieldVal;
      return true;
    }
    else    if ("update_time".equals(__fieldName)) {
      this.update_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
