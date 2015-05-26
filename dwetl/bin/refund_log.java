// ORM class for table 'refund_log'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Nov 17 18:22:25 CST 2014
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

public class refund_log extends SqoopRecord  implements DBWritable, Writable {
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
  public refund_log with_id(Long id) {
    this.id = id;
    return this;
  }
  private Long order_id;
  public Long get_order_id() {
    return order_id;
  }
  public void set_order_id(Long order_id) {
    this.order_id = order_id;
  }
  public refund_log with_order_id(Long order_id) {
    this.order_id = order_id;
    return this;
  }
  private Integer operator_id;
  public Integer get_operator_id() {
    return operator_id;
  }
  public void set_operator_id(Integer operator_id) {
    this.operator_id = operator_id;
  }
  public refund_log with_operator_id(Integer operator_id) {
    this.operator_id = operator_id;
    return this;
  }
  private Integer refund_quantity;
  public Integer get_refund_quantity() {
    return refund_quantity;
  }
  public void set_refund_quantity(Integer refund_quantity) {
    this.refund_quantity = refund_quantity;
  }
  public refund_log with_refund_quantity(Integer refund_quantity) {
    this.refund_quantity = refund_quantity;
    return this;
  }
  private String refund_method;
  public String get_refund_method() {
    return refund_method;
  }
  public void set_refund_method(String refund_method) {
    this.refund_method = refund_method;
  }
  public refund_log with_refund_method(String refund_method) {
    this.refund_method = refund_method;
    return this;
  }
  private Integer company_fee;
  public Integer get_company_fee() {
    return company_fee;
  }
  public void set_company_fee(Integer company_fee) {
    this.company_fee = company_fee;
  }
  public refund_log with_company_fee(Integer company_fee) {
    this.company_fee = company_fee;
    return this;
  }
  private Integer vendor_fee;
  public Integer get_vendor_fee() {
    return vendor_fee;
  }
  public void set_vendor_fee(Integer vendor_fee) {
    this.vendor_fee = vendor_fee;
  }
  public refund_log with_vendor_fee(Integer vendor_fee) {
    this.vendor_fee = vendor_fee;
    return this;
  }
  private java.sql.Timestamp create_time;
  public java.sql.Timestamp get_create_time() {
    return create_time;
  }
  public void set_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
  }
  public refund_log with_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
    return this;
  }
  private Integer customer_fee;
  public Integer get_customer_fee() {
    return customer_fee;
  }
  public void set_customer_fee(Integer customer_fee) {
    this.customer_fee = customer_fee;
  }
  public refund_log with_customer_fee(Integer customer_fee) {
    this.customer_fee = customer_fee;
    return this;
  }
  private String refund_way;
  public String get_refund_way() {
    return refund_way;
  }
  public void set_refund_way(String refund_way) {
    this.refund_way = refund_way;
  }
  public refund_log with_refund_way(String refund_way) {
    this.refund_way = refund_way;
    return this;
  }
  private Float refund_money;
  public Float get_refund_money() {
    return refund_money;
  }
  public void set_refund_money(Float refund_money) {
    this.refund_money = refund_money;
  }
  public refund_log with_refund_money(Float refund_money) {
    this.refund_money = refund_money;
    return this;
  }
  private Float current_money;
  public Float get_current_money() {
    return current_money;
  }
  public void set_current_money(Float current_money) {
    this.current_money = current_money;
  }
  public refund_log with_current_money(Float current_money) {
    this.current_money = current_money;
    return this;
  }
  private Long p_order_id;
  public Long get_p_order_id() {
    return p_order_id;
  }
  public void set_p_order_id(Long p_order_id) {
    this.p_order_id = p_order_id;
  }
  public refund_log with_p_order_id(Long p_order_id) {
    this.p_order_id = p_order_id;
    return this;
  }
  private String refund_uniq_id;
  public String get_refund_uniq_id() {
    return refund_uniq_id;
  }
  public void set_refund_uniq_id(String refund_uniq_id) {
    this.refund_uniq_id = refund_uniq_id;
  }
  public refund_log with_refund_uniq_id(String refund_uniq_id) {
    this.refund_uniq_id = refund_uniq_id;
    return this;
  }
  private java.math.BigDecimal lost_card;
  public java.math.BigDecimal get_lost_card() {
    return lost_card;
  }
  public void set_lost_card(java.math.BigDecimal lost_card) {
    this.lost_card = lost_card;
  }
  public refund_log with_lost_card(java.math.BigDecimal lost_card) {
    this.lost_card = lost_card;
    return this;
  }
  private java.math.BigDecimal lost_red_envelope;
  public java.math.BigDecimal get_lost_red_envelope() {
    return lost_red_envelope;
  }
  public void set_lost_red_envelope(java.math.BigDecimal lost_red_envelope) {
    this.lost_red_envelope = lost_red_envelope;
  }
  public refund_log with_lost_red_envelope(java.math.BigDecimal lost_red_envelope) {
    this.lost_red_envelope = lost_red_envelope;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof refund_log)) {
      return false;
    }
    refund_log that = (refund_log) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.operator_id == null ? that.operator_id == null : this.operator_id.equals(that.operator_id));
    equal = equal && (this.refund_quantity == null ? that.refund_quantity == null : this.refund_quantity.equals(that.refund_quantity));
    equal = equal && (this.refund_method == null ? that.refund_method == null : this.refund_method.equals(that.refund_method));
    equal = equal && (this.company_fee == null ? that.company_fee == null : this.company_fee.equals(that.company_fee));
    equal = equal && (this.vendor_fee == null ? that.vendor_fee == null : this.vendor_fee.equals(that.vendor_fee));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.customer_fee == null ? that.customer_fee == null : this.customer_fee.equals(that.customer_fee));
    equal = equal && (this.refund_way == null ? that.refund_way == null : this.refund_way.equals(that.refund_way));
    equal = equal && (this.refund_money == null ? that.refund_money == null : this.refund_money.equals(that.refund_money));
    equal = equal && (this.current_money == null ? that.current_money == null : this.current_money.equals(that.current_money));
    equal = equal && (this.p_order_id == null ? that.p_order_id == null : this.p_order_id.equals(that.p_order_id));
    equal = equal && (this.refund_uniq_id == null ? that.refund_uniq_id == null : this.refund_uniq_id.equals(that.refund_uniq_id));
    equal = equal && (this.lost_card == null ? that.lost_card == null : this.lost_card.equals(that.lost_card));
    equal = equal && (this.lost_red_envelope == null ? that.lost_red_envelope == null : this.lost_red_envelope.equals(that.lost_red_envelope));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof refund_log)) {
      return false;
    }
    refund_log that = (refund_log) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.operator_id == null ? that.operator_id == null : this.operator_id.equals(that.operator_id));
    equal = equal && (this.refund_quantity == null ? that.refund_quantity == null : this.refund_quantity.equals(that.refund_quantity));
    equal = equal && (this.refund_method == null ? that.refund_method == null : this.refund_method.equals(that.refund_method));
    equal = equal && (this.company_fee == null ? that.company_fee == null : this.company_fee.equals(that.company_fee));
    equal = equal && (this.vendor_fee == null ? that.vendor_fee == null : this.vendor_fee.equals(that.vendor_fee));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.customer_fee == null ? that.customer_fee == null : this.customer_fee.equals(that.customer_fee));
    equal = equal && (this.refund_way == null ? that.refund_way == null : this.refund_way.equals(that.refund_way));
    equal = equal && (this.refund_money == null ? that.refund_money == null : this.refund_money.equals(that.refund_money));
    equal = equal && (this.current_money == null ? that.current_money == null : this.current_money.equals(that.current_money));
    equal = equal && (this.p_order_id == null ? that.p_order_id == null : this.p_order_id.equals(that.p_order_id));
    equal = equal && (this.refund_uniq_id == null ? that.refund_uniq_id == null : this.refund_uniq_id.equals(that.refund_uniq_id));
    equal = equal && (this.lost_card == null ? that.lost_card == null : this.lost_card.equals(that.lost_card));
    equal = equal && (this.lost_red_envelope == null ? that.lost_red_envelope == null : this.lost_red_envelope.equals(that.lost_red_envelope));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.order_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.operator_id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.refund_quantity = JdbcWritableBridge.readInteger(4, __dbResults);
    this.refund_method = JdbcWritableBridge.readString(5, __dbResults);
    this.company_fee = JdbcWritableBridge.readInteger(6, __dbResults);
    this.vendor_fee = JdbcWritableBridge.readInteger(7, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.customer_fee = JdbcWritableBridge.readInteger(9, __dbResults);
    this.refund_way = JdbcWritableBridge.readString(10, __dbResults);
    this.refund_money = JdbcWritableBridge.readFloat(11, __dbResults);
    this.current_money = JdbcWritableBridge.readFloat(12, __dbResults);
    this.p_order_id = JdbcWritableBridge.readLong(13, __dbResults);
    this.refund_uniq_id = JdbcWritableBridge.readString(14, __dbResults);
    this.lost_card = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.lost_red_envelope = JdbcWritableBridge.readBigDecimal(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.order_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.operator_id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.refund_quantity = JdbcWritableBridge.readInteger(4, __dbResults);
    this.refund_method = JdbcWritableBridge.readString(5, __dbResults);
    this.company_fee = JdbcWritableBridge.readInteger(6, __dbResults);
    this.vendor_fee = JdbcWritableBridge.readInteger(7, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.customer_fee = JdbcWritableBridge.readInteger(9, __dbResults);
    this.refund_way = JdbcWritableBridge.readString(10, __dbResults);
    this.refund_money = JdbcWritableBridge.readFloat(11, __dbResults);
    this.current_money = JdbcWritableBridge.readFloat(12, __dbResults);
    this.p_order_id = JdbcWritableBridge.readLong(13, __dbResults);
    this.refund_uniq_id = JdbcWritableBridge.readString(14, __dbResults);
    this.lost_card = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.lost_red_envelope = JdbcWritableBridge.readBigDecimal(16, __dbResults);
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
    JdbcWritableBridge.writeLong(order_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(operator_id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(refund_quantity, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(refund_method, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(company_fee, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(vendor_fee, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(customer_fee, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(refund_way, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(refund_money, 11 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(current_money, 12 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeLong(p_order_id, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(refund_uniq_id, 14 + __off, 2003, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(lost_card, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(lost_red_envelope, 16 + __off, 2, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(order_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(operator_id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(refund_quantity, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(refund_method, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(company_fee, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(vendor_fee, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(customer_fee, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(refund_way, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(refund_money, 11 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(current_money, 12 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeLong(p_order_id, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(refund_uniq_id, 14 + __off, 2003, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(lost_card, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(lost_red_envelope, 16 + __off, 2, __dbStmt);
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
        this.order_id = null;
    } else {
    this.order_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.operator_id = null;
    } else {
    this.operator_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.refund_quantity = null;
    } else {
    this.refund_quantity = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.refund_method = null;
    } else {
    this.refund_method = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.company_fee = null;
    } else {
    this.company_fee = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.vendor_fee = null;
    } else {
    this.vendor_fee = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.create_time = null;
    } else {
    this.create_time = new Timestamp(__dataIn.readLong());
    this.create_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.customer_fee = null;
    } else {
    this.customer_fee = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.refund_way = null;
    } else {
    this.refund_way = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.refund_money = null;
    } else {
    this.refund_money = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.current_money = null;
    } else {
    this.current_money = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.p_order_id = null;
    } else {
    this.p_order_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.refund_uniq_id = null;
    } else {
    this.refund_uniq_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lost_card = null;
    } else {
    this.lost_card = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lost_red_envelope = null;
    } else {
    this.lost_red_envelope = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_id);
    }
    if (null == this.operator_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.operator_id);
    }
    if (null == this.refund_quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.refund_quantity);
    }
    if (null == this.refund_method) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, refund_method);
    }
    if (null == this.company_fee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.company_fee);
    }
    if (null == this.vendor_fee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.vendor_fee);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time.getTime());
    __dataOut.writeInt(this.create_time.getNanos());
    }
    if (null == this.customer_fee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.customer_fee);
    }
    if (null == this.refund_way) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, refund_way);
    }
    if (null == this.refund_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.refund_money);
    }
    if (null == this.current_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.current_money);
    }
    if (null == this.p_order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.p_order_id);
    }
    if (null == this.refund_uniq_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, refund_uniq_id);
    }
    if (null == this.lost_card) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.lost_card, __dataOut);
    }
    if (null == this.lost_red_envelope) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.lost_red_envelope, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_id);
    }
    if (null == this.operator_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.operator_id);
    }
    if (null == this.refund_quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.refund_quantity);
    }
    if (null == this.refund_method) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, refund_method);
    }
    if (null == this.company_fee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.company_fee);
    }
    if (null == this.vendor_fee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.vendor_fee);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time.getTime());
    __dataOut.writeInt(this.create_time.getNanos());
    }
    if (null == this.customer_fee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.customer_fee);
    }
    if (null == this.refund_way) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, refund_way);
    }
    if (null == this.refund_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.refund_money);
    }
    if (null == this.current_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.current_money);
    }
    if (null == this.p_order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.p_order_id);
    }
    if (null == this.refund_uniq_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, refund_uniq_id);
    }
    if (null == this.lost_card) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.lost_card, __dataOut);
    }
    if (null == this.lost_red_envelope) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.lost_red_envelope, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":"" + order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(operator_id==null?"null":"" + operator_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_quantity==null?"null":"" + refund_quantity, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(refund_method==null?"null":refund_method, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(company_fee==null?"null":"" + company_fee, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vendor_fee==null?"null":"" + vendor_fee, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_fee==null?"null":"" + customer_fee, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(refund_way==null?"null":refund_way, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_money==null?"null":"" + refund_money, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(current_money==null?"null":"" + current_money, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(p_order_id==null?"null":"" + p_order_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(refund_uniq_id==null?"null":refund_uniq_id, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lost_card==null?"null":lost_card.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lost_red_envelope==null?"null":lost_red_envelope.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":"" + order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(operator_id==null?"null":"" + operator_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_quantity==null?"null":"" + refund_quantity, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(refund_method==null?"null":refund_method, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(company_fee==null?"null":"" + company_fee, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vendor_fee==null?"null":"" + vendor_fee, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_fee==null?"null":"" + customer_fee, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(refund_way==null?"null":refund_way, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refund_money==null?"null":"" + refund_money, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(current_money==null?"null":"" + current_money, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(p_order_id==null?"null":"" + p_order_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with '\005' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(refund_uniq_id==null?"null":refund_uniq_id, "\005", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lost_card==null?"null":lost_card.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lost_red_envelope==null?"null":lost_red_envelope.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_id = null; } else {
      this.order_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.operator_id = null; } else {
      this.operator_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_quantity = null; } else {
      this.refund_quantity = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.refund_method = null; } else {
      this.refund_method = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.company_fee = null; } else {
      this.company_fee = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.vendor_fee = null; } else {
      this.vendor_fee = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customer_fee = null; } else {
      this.customer_fee = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.refund_way = null; } else {
      this.refund_way = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_money = null; } else {
      this.refund_money = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.current_money = null; } else {
      this.current_money = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.p_order_id = null; } else {
      this.p_order_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.refund_uniq_id = null; } else {
      this.refund_uniq_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lost_card = null; } else {
      this.lost_card = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lost_red_envelope = null; } else {
      this.lost_red_envelope = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_id = null; } else {
      this.order_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.operator_id = null; } else {
      this.operator_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_quantity = null; } else {
      this.refund_quantity = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.refund_method = null; } else {
      this.refund_method = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.company_fee = null; } else {
      this.company_fee = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.vendor_fee = null; } else {
      this.vendor_fee = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customer_fee = null; } else {
      this.customer_fee = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.refund_way = null; } else {
      this.refund_way = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refund_money = null; } else {
      this.refund_money = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.current_money = null; } else {
      this.current_money = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.p_order_id = null; } else {
      this.p_order_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.refund_uniq_id = null; } else {
      this.refund_uniq_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lost_card = null; } else {
      this.lost_card = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lost_red_envelope = null; } else {
      this.lost_red_envelope = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    refund_log o = (refund_log) super.clone();
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    return o;
  }

  public void clone0(refund_log o) throws CloneNotSupportedException {
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("operator_id", this.operator_id);
    __sqoop$field_map.put("refund_quantity", this.refund_quantity);
    __sqoop$field_map.put("refund_method", this.refund_method);
    __sqoop$field_map.put("company_fee", this.company_fee);
    __sqoop$field_map.put("vendor_fee", this.vendor_fee);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("customer_fee", this.customer_fee);
    __sqoop$field_map.put("refund_way", this.refund_way);
    __sqoop$field_map.put("refund_money", this.refund_money);
    __sqoop$field_map.put("current_money", this.current_money);
    __sqoop$field_map.put("p_order_id", this.p_order_id);
    __sqoop$field_map.put("refund_uniq_id", this.refund_uniq_id);
    __sqoop$field_map.put("lost_card", this.lost_card);
    __sqoop$field_map.put("lost_red_envelope", this.lost_red_envelope);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("operator_id", this.operator_id);
    __sqoop$field_map.put("refund_quantity", this.refund_quantity);
    __sqoop$field_map.put("refund_method", this.refund_method);
    __sqoop$field_map.put("company_fee", this.company_fee);
    __sqoop$field_map.put("vendor_fee", this.vendor_fee);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("customer_fee", this.customer_fee);
    __sqoop$field_map.put("refund_way", this.refund_way);
    __sqoop$field_map.put("refund_money", this.refund_money);
    __sqoop$field_map.put("current_money", this.current_money);
    __sqoop$field_map.put("p_order_id", this.p_order_id);
    __sqoop$field_map.put("refund_uniq_id", this.refund_uniq_id);
    __sqoop$field_map.put("lost_card", this.lost_card);
    __sqoop$field_map.put("lost_red_envelope", this.lost_red_envelope);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Long) __fieldVal;
    }
    else    if ("order_id".equals(__fieldName)) {
      this.order_id = (Long) __fieldVal;
    }
    else    if ("operator_id".equals(__fieldName)) {
      this.operator_id = (Integer) __fieldVal;
    }
    else    if ("refund_quantity".equals(__fieldName)) {
      this.refund_quantity = (Integer) __fieldVal;
    }
    else    if ("refund_method".equals(__fieldName)) {
      this.refund_method = (String) __fieldVal;
    }
    else    if ("company_fee".equals(__fieldName)) {
      this.company_fee = (Integer) __fieldVal;
    }
    else    if ("vendor_fee".equals(__fieldName)) {
      this.vendor_fee = (Integer) __fieldVal;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("customer_fee".equals(__fieldName)) {
      this.customer_fee = (Integer) __fieldVal;
    }
    else    if ("refund_way".equals(__fieldName)) {
      this.refund_way = (String) __fieldVal;
    }
    else    if ("refund_money".equals(__fieldName)) {
      this.refund_money = (Float) __fieldVal;
    }
    else    if ("current_money".equals(__fieldName)) {
      this.current_money = (Float) __fieldVal;
    }
    else    if ("p_order_id".equals(__fieldName)) {
      this.p_order_id = (Long) __fieldVal;
    }
    else    if ("refund_uniq_id".equals(__fieldName)) {
      this.refund_uniq_id = (String) __fieldVal;
    }
    else    if ("lost_card".equals(__fieldName)) {
      this.lost_card = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("lost_red_envelope".equals(__fieldName)) {
      this.lost_red_envelope = (java.math.BigDecimal) __fieldVal;
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
    else    if ("order_id".equals(__fieldName)) {
      this.order_id = (Long) __fieldVal;
      return true;
    }
    else    if ("operator_id".equals(__fieldName)) {
      this.operator_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("refund_quantity".equals(__fieldName)) {
      this.refund_quantity = (Integer) __fieldVal;
      return true;
    }
    else    if ("refund_method".equals(__fieldName)) {
      this.refund_method = (String) __fieldVal;
      return true;
    }
    else    if ("company_fee".equals(__fieldName)) {
      this.company_fee = (Integer) __fieldVal;
      return true;
    }
    else    if ("vendor_fee".equals(__fieldName)) {
      this.vendor_fee = (Integer) __fieldVal;
      return true;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("customer_fee".equals(__fieldName)) {
      this.customer_fee = (Integer) __fieldVal;
      return true;
    }
    else    if ("refund_way".equals(__fieldName)) {
      this.refund_way = (String) __fieldVal;
      return true;
    }
    else    if ("refund_money".equals(__fieldName)) {
      this.refund_money = (Float) __fieldVal;
      return true;
    }
    else    if ("current_money".equals(__fieldName)) {
      this.current_money = (Float) __fieldVal;
      return true;
    }
    else    if ("p_order_id".equals(__fieldName)) {
      this.p_order_id = (Long) __fieldVal;
      return true;
    }
    else    if ("refund_uniq_id".equals(__fieldName)) {
      this.refund_uniq_id = (String) __fieldVal;
      return true;
    }
    else    if ("lost_card".equals(__fieldName)) {
      this.lost_card = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("lost_red_envelope".equals(__fieldName)) {
      this.lost_red_envelope = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
