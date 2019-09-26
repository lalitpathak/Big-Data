// ORM class for table 'products_category'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jun 27 06:07:24 PDT 2019
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

public class products_category extends SqoopRecord  implements DBWritable, Writable {
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
    setters.put("product_category_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_category_name = (String)value;
      }
    });
    setters.put("product_category_name_english", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_category_name_english = (String)value;
      }
    });
  }
  public products_category() {
    init0();
  }
  private String UID;
  public String get_UID() {
    return UID;
  }
  public void set_UID(String UID) {
    this.UID = UID;
  }
  public products_category with_UID(String UID) {
    this.UID = UID;
    return this;
  }
  private String product_category_name;
  public String get_product_category_name() {
    return product_category_name;
  }
  public void set_product_category_name(String product_category_name) {
    this.product_category_name = product_category_name;
  }
  public products_category with_product_category_name(String product_category_name) {
    this.product_category_name = product_category_name;
    return this;
  }
  private String product_category_name_english;
  public String get_product_category_name_english() {
    return product_category_name_english;
  }
  public void set_product_category_name_english(String product_category_name_english) {
    this.product_category_name_english = product_category_name_english;
  }
  public products_category with_product_category_name_english(String product_category_name_english) {
    this.product_category_name_english = product_category_name_english;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof products_category)) {
      return false;
    }
    products_category that = (products_category) o;
    boolean equal = true;
    equal = equal && (this.UID == null ? that.UID == null : this.UID.equals(that.UID));
    equal = equal && (this.product_category_name == null ? that.product_category_name == null : this.product_category_name.equals(that.product_category_name));
    equal = equal && (this.product_category_name_english == null ? that.product_category_name_english == null : this.product_category_name_english.equals(that.product_category_name_english));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof products_category)) {
      return false;
    }
    products_category that = (products_category) o;
    boolean equal = true;
    equal = equal && (this.UID == null ? that.UID == null : this.UID.equals(that.UID));
    equal = equal && (this.product_category_name == null ? that.product_category_name == null : this.product_category_name.equals(that.product_category_name));
    equal = equal && (this.product_category_name_english == null ? that.product_category_name_english == null : this.product_category_name_english.equals(that.product_category_name_english));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.UID = JdbcWritableBridge.readString(1, __dbResults);
    this.product_category_name = JdbcWritableBridge.readString(2, __dbResults);
    this.product_category_name_english = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.UID = JdbcWritableBridge.readString(1, __dbResults);
    this.product_category_name = JdbcWritableBridge.readString(2, __dbResults);
    this.product_category_name_english = JdbcWritableBridge.readString(3, __dbResults);
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
    JdbcWritableBridge.writeString(product_category_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_category_name_english, 3 + __off, 12, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(UID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_category_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_category_name_english, 3 + __off, 12, __dbStmt);
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
        this.product_category_name = null;
    } else {
    this.product_category_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_category_name_english = null;
    } else {
    this.product_category_name_english = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.UID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UID);
    }
    if (null == this.product_category_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_category_name);
    }
    if (null == this.product_category_name_english) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_category_name_english);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.UID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UID);
    }
    if (null == this.product_category_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_category_name);
    }
    if (null == this.product_category_name_english) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_category_name_english);
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
    __sb.append(FieldFormatter.escapeAndEnclose(product_category_name==null?"null":product_category_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_category_name_english==null?"null":product_category_name_english, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(UID==null?"null":UID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_category_name==null?"null":product_category_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_category_name_english==null?"null":product_category_name_english, delimiters));
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
    if (__cur_str.equals("null")) { this.product_category_name = null; } else {
      this.product_category_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_category_name_english = null; } else {
      this.product_category_name_english = __cur_str;
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
    if (__cur_str.equals("null")) { this.product_category_name = null; } else {
      this.product_category_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_category_name_english = null; } else {
      this.product_category_name_english = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    products_category o = (products_category) super.clone();
    return o;
  }

  public void clone0(products_category o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("UID", this.UID);
    __sqoop$field_map.put("product_category_name", this.product_category_name);
    __sqoop$field_map.put("product_category_name_english", this.product_category_name_english);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("UID", this.UID);
    __sqoop$field_map.put("product_category_name", this.product_category_name);
    __sqoop$field_map.put("product_category_name_english", this.product_category_name_english);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
