// ORM class for table 'product'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Aug 19 04:11:59 PDT 2019
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
import java.util.HashMap;

public class product extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("UID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        UID = (String)value;
      }
    });
    setters.put("product_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_id = (String)value;
      }
    });
    setters.put("product_category_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_category_name = (String)value;
      }
    });
    setters.put("product_name_lenght", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_name_lenght = (String)value;
      }
    });
    setters.put("product_description_lenght", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_description_lenght = (String)value;
      }
    });
    setters.put("product_photos_qty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_photos_qty = (String)value;
      }
    });
    setters.put("product_weight_g", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_weight_g = (String)value;
      }
    });
    setters.put("product_length_cm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_length_cm = (String)value;
      }
    });
    setters.put("product_height_cm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_height_cm = (String)value;
      }
    });
    setters.put("product_width_cm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_width_cm = (String)value;
      }
    });
  }
  public product() {
    init0();
  }
  private String UID;
  public String get_UID() {
    return UID;
  }
  public void set_UID(String UID) {
    this.UID = UID;
  }
  public product with_UID(String UID) {
    this.UID = UID;
    return this;
  }
  private String product_id;
  public String get_product_id() {
    return product_id;
  }
  public void set_product_id(String product_id) {
    this.product_id = product_id;
  }
  public product with_product_id(String product_id) {
    this.product_id = product_id;
    return this;
  }
  private String product_category_name;
  public String get_product_category_name() {
    return product_category_name;
  }
  public void set_product_category_name(String product_category_name) {
    this.product_category_name = product_category_name;
  }
  public product with_product_category_name(String product_category_name) {
    this.product_category_name = product_category_name;
    return this;
  }
  private String product_name_lenght;
  public String get_product_name_lenght() {
    return product_name_lenght;
  }
  public void set_product_name_lenght(String product_name_lenght) {
    this.product_name_lenght = product_name_lenght;
  }
  public product with_product_name_lenght(String product_name_lenght) {
    this.product_name_lenght = product_name_lenght;
    return this;
  }
  private String product_description_lenght;
  public String get_product_description_lenght() {
    return product_description_lenght;
  }
  public void set_product_description_lenght(String product_description_lenght) {
    this.product_description_lenght = product_description_lenght;
  }
  public product with_product_description_lenght(String product_description_lenght) {
    this.product_description_lenght = product_description_lenght;
    return this;
  }
  private String product_photos_qty;
  public String get_product_photos_qty() {
    return product_photos_qty;
  }
  public void set_product_photos_qty(String product_photos_qty) {
    this.product_photos_qty = product_photos_qty;
  }
  public product with_product_photos_qty(String product_photos_qty) {
    this.product_photos_qty = product_photos_qty;
    return this;
  }
  private String product_weight_g;
  public String get_product_weight_g() {
    return product_weight_g;
  }
  public void set_product_weight_g(String product_weight_g) {
    this.product_weight_g = product_weight_g;
  }
  public product with_product_weight_g(String product_weight_g) {
    this.product_weight_g = product_weight_g;
    return this;
  }
  private String product_length_cm;
  public String get_product_length_cm() {
    return product_length_cm;
  }
  public void set_product_length_cm(String product_length_cm) {
    this.product_length_cm = product_length_cm;
  }
  public product with_product_length_cm(String product_length_cm) {
    this.product_length_cm = product_length_cm;
    return this;
  }
  private String product_height_cm;
  public String get_product_height_cm() {
    return product_height_cm;
  }
  public void set_product_height_cm(String product_height_cm) {
    this.product_height_cm = product_height_cm;
  }
  public product with_product_height_cm(String product_height_cm) {
    this.product_height_cm = product_height_cm;
    return this;
  }
  private String product_width_cm;
  public String get_product_width_cm() {
    return product_width_cm;
  }
  public void set_product_width_cm(String product_width_cm) {
    this.product_width_cm = product_width_cm;
  }
  public product with_product_width_cm(String product_width_cm) {
    this.product_width_cm = product_width_cm;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof product)) {
      return false;
    }
    product that = (product) o;
    boolean equal = true;
    equal = equal && (this.UID == null ? that.UID == null : this.UID.equals(that.UID));
    equal = equal && (this.product_id == null ? that.product_id == null : this.product_id.equals(that.product_id));
    equal = equal && (this.product_category_name == null ? that.product_category_name == null : this.product_category_name.equals(that.product_category_name));
    equal = equal && (this.product_name_lenght == null ? that.product_name_lenght == null : this.product_name_lenght.equals(that.product_name_lenght));
    equal = equal && (this.product_description_lenght == null ? that.product_description_lenght == null : this.product_description_lenght.equals(that.product_description_lenght));
    equal = equal && (this.product_photos_qty == null ? that.product_photos_qty == null : this.product_photos_qty.equals(that.product_photos_qty));
    equal = equal && (this.product_weight_g == null ? that.product_weight_g == null : this.product_weight_g.equals(that.product_weight_g));
    equal = equal && (this.product_length_cm == null ? that.product_length_cm == null : this.product_length_cm.equals(that.product_length_cm));
    equal = equal && (this.product_height_cm == null ? that.product_height_cm == null : this.product_height_cm.equals(that.product_height_cm));
    equal = equal && (this.product_width_cm == null ? that.product_width_cm == null : this.product_width_cm.equals(that.product_width_cm));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof product)) {
      return false;
    }
    product that = (product) o;
    boolean equal = true;
    equal = equal && (this.UID == null ? that.UID == null : this.UID.equals(that.UID));
    equal = equal && (this.product_id == null ? that.product_id == null : this.product_id.equals(that.product_id));
    equal = equal && (this.product_category_name == null ? that.product_category_name == null : this.product_category_name.equals(that.product_category_name));
    equal = equal && (this.product_name_lenght == null ? that.product_name_lenght == null : this.product_name_lenght.equals(that.product_name_lenght));
    equal = equal && (this.product_description_lenght == null ? that.product_description_lenght == null : this.product_description_lenght.equals(that.product_description_lenght));
    equal = equal && (this.product_photos_qty == null ? that.product_photos_qty == null : this.product_photos_qty.equals(that.product_photos_qty));
    equal = equal && (this.product_weight_g == null ? that.product_weight_g == null : this.product_weight_g.equals(that.product_weight_g));
    equal = equal && (this.product_length_cm == null ? that.product_length_cm == null : this.product_length_cm.equals(that.product_length_cm));
    equal = equal && (this.product_height_cm == null ? that.product_height_cm == null : this.product_height_cm.equals(that.product_height_cm));
    equal = equal && (this.product_width_cm == null ? that.product_width_cm == null : this.product_width_cm.equals(that.product_width_cm));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.UID = JdbcWritableBridge.readString(1, __dbResults);
    this.product_id = JdbcWritableBridge.readString(2, __dbResults);
    this.product_category_name = JdbcWritableBridge.readString(3, __dbResults);
    this.product_name_lenght = JdbcWritableBridge.readString(4, __dbResults);
    this.product_description_lenght = JdbcWritableBridge.readString(5, __dbResults);
    this.product_photos_qty = JdbcWritableBridge.readString(6, __dbResults);
    this.product_weight_g = JdbcWritableBridge.readString(7, __dbResults);
    this.product_length_cm = JdbcWritableBridge.readString(8, __dbResults);
    this.product_height_cm = JdbcWritableBridge.readString(9, __dbResults);
    this.product_width_cm = JdbcWritableBridge.readString(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.UID = JdbcWritableBridge.readString(1, __dbResults);
    this.product_id = JdbcWritableBridge.readString(2, __dbResults);
    this.product_category_name = JdbcWritableBridge.readString(3, __dbResults);
    this.product_name_lenght = JdbcWritableBridge.readString(4, __dbResults);
    this.product_description_lenght = JdbcWritableBridge.readString(5, __dbResults);
    this.product_photos_qty = JdbcWritableBridge.readString(6, __dbResults);
    this.product_weight_g = JdbcWritableBridge.readString(7, __dbResults);
    this.product_length_cm = JdbcWritableBridge.readString(8, __dbResults);
    this.product_height_cm = JdbcWritableBridge.readString(9, __dbResults);
    this.product_width_cm = JdbcWritableBridge.readString(10, __dbResults);
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
    JdbcWritableBridge.writeString(UID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_category_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_name_lenght, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_description_lenght, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_photos_qty, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_weight_g, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_length_cm, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_height_cm, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_width_cm, 10 + __off, 12, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(UID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_category_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_name_lenght, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_description_lenght, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_photos_qty, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_weight_g, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_length_cm, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_height_cm, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_width_cm, 10 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.UID = null;
    } else {
    this.UID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_id = null;
    } else {
    this.product_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_category_name = null;
    } else {
    this.product_category_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_name_lenght = null;
    } else {
    this.product_name_lenght = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_description_lenght = null;
    } else {
    this.product_description_lenght = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_photos_qty = null;
    } else {
    this.product_photos_qty = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_weight_g = null;
    } else {
    this.product_weight_g = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_length_cm = null;
    } else {
    this.product_length_cm = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_height_cm = null;
    } else {
    this.product_height_cm = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_width_cm = null;
    } else {
    this.product_width_cm = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.UID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UID);
    }
    if (null == this.product_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_id);
    }
    if (null == this.product_category_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_category_name);
    }
    if (null == this.product_name_lenght) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_name_lenght);
    }
    if (null == this.product_description_lenght) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_description_lenght);
    }
    if (null == this.product_photos_qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_photos_qty);
    }
    if (null == this.product_weight_g) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_weight_g);
    }
    if (null == this.product_length_cm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_length_cm);
    }
    if (null == this.product_height_cm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_height_cm);
    }
    if (null == this.product_width_cm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_width_cm);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.UID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UID);
    }
    if (null == this.product_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_id);
    }
    if (null == this.product_category_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_category_name);
    }
    if (null == this.product_name_lenght) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_name_lenght);
    }
    if (null == this.product_description_lenght) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_description_lenght);
    }
    if (null == this.product_photos_qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_photos_qty);
    }
    if (null == this.product_weight_g) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_weight_g);
    }
    if (null == this.product_length_cm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_length_cm);
    }
    if (null == this.product_height_cm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_height_cm);
    }
    if (null == this.product_width_cm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_width_cm);
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
    __sb.append(FieldFormatter.escapeAndEnclose(UID==null?"null":UID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_id==null?"null":product_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_category_name==null?"null":product_category_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_name_lenght==null?"null":product_name_lenght, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_description_lenght==null?"null":product_description_lenght, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_photos_qty==null?"null":product_photos_qty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_weight_g==null?"null":product_weight_g, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_length_cm==null?"null":product_length_cm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_height_cm==null?"null":product_height_cm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_width_cm==null?"null":product_width_cm, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(UID==null?"null":UID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_id==null?"null":product_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_category_name==null?"null":product_category_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_name_lenght==null?"null":product_name_lenght, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_description_lenght==null?"null":product_description_lenght, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_photos_qty==null?"null":product_photos_qty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_weight_g==null?"null":product_weight_g, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_length_cm==null?"null":product_length_cm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_height_cm==null?"null":product_height_cm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_width_cm==null?"null":product_width_cm, delimiters));
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
    if (__cur_str.equals("null")) { this.UID = null; } else {
      this.UID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_id = null; } else {
      this.product_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_category_name = null; } else {
      this.product_category_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_name_lenght = null; } else {
      this.product_name_lenght = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_description_lenght = null; } else {
      this.product_description_lenght = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_photos_qty = null; } else {
      this.product_photos_qty = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_weight_g = null; } else {
      this.product_weight_g = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_length_cm = null; } else {
      this.product_length_cm = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_height_cm = null; } else {
      this.product_height_cm = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_width_cm = null; } else {
      this.product_width_cm = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.UID = null; } else {
      this.UID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_id = null; } else {
      this.product_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_category_name = null; } else {
      this.product_category_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_name_lenght = null; } else {
      this.product_name_lenght = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_description_lenght = null; } else {
      this.product_description_lenght = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_photos_qty = null; } else {
      this.product_photos_qty = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_weight_g = null; } else {
      this.product_weight_g = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_length_cm = null; } else {
      this.product_length_cm = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_height_cm = null; } else {
      this.product_height_cm = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_width_cm = null; } else {
      this.product_width_cm = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    product o = (product) super.clone();
    return o;
  }

  public void clone0(product o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("UID", this.UID);
    __sqoop$field_map.put("product_id", this.product_id);
    __sqoop$field_map.put("product_category_name", this.product_category_name);
    __sqoop$field_map.put("product_name_lenght", this.product_name_lenght);
    __sqoop$field_map.put("product_description_lenght", this.product_description_lenght);
    __sqoop$field_map.put("product_photos_qty", this.product_photos_qty);
    __sqoop$field_map.put("product_weight_g", this.product_weight_g);
    __sqoop$field_map.put("product_length_cm", this.product_length_cm);
    __sqoop$field_map.put("product_height_cm", this.product_height_cm);
    __sqoop$field_map.put("product_width_cm", this.product_width_cm);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("UID", this.UID);
    __sqoop$field_map.put("product_id", this.product_id);
    __sqoop$field_map.put("product_category_name", this.product_category_name);
    __sqoop$field_map.put("product_name_lenght", this.product_name_lenght);
    __sqoop$field_map.put("product_description_lenght", this.product_description_lenght);
    __sqoop$field_map.put("product_photos_qty", this.product_photos_qty);
    __sqoop$field_map.put("product_weight_g", this.product_weight_g);
    __sqoop$field_map.put("product_length_cm", this.product_length_cm);
    __sqoop$field_map.put("product_height_cm", this.product_height_cm);
    __sqoop$field_map.put("product_width_cm", this.product_width_cm);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
