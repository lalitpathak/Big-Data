// ORM class for table 'geo_location'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Aug 19 04:11:20 PDT 2019
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

public class geo_location extends SqoopRecord  implements DBWritable, Writable {
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
    setters.put("geolocation_zip_code_prefix", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        geolocation_zip_code_prefix = (String)value;
      }
    });
    setters.put("geolocation_lat", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        geolocation_lat = (String)value;
      }
    });
    setters.put("geolocation_lng", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        geolocation_lng = (String)value;
      }
    });
    setters.put("geolocation_city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        geolocation_city = (String)value;
      }
    });
    setters.put("geolocation_state", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        geolocation_state = (String)value;
      }
    });
  }
  public geo_location() {
    init0();
  }
  private String UID;
  public String get_UID() {
    return UID;
  }
  public void set_UID(String UID) {
    this.UID = UID;
  }
  public geo_location with_UID(String UID) {
    this.UID = UID;
    return this;
  }
  private String geolocation_zip_code_prefix;
  public String get_geolocation_zip_code_prefix() {
    return geolocation_zip_code_prefix;
  }
  public void set_geolocation_zip_code_prefix(String geolocation_zip_code_prefix) {
    this.geolocation_zip_code_prefix = geolocation_zip_code_prefix;
  }
  public geo_location with_geolocation_zip_code_prefix(String geolocation_zip_code_prefix) {
    this.geolocation_zip_code_prefix = geolocation_zip_code_prefix;
    return this;
  }
  private String geolocation_lat;
  public String get_geolocation_lat() {
    return geolocation_lat;
  }
  public void set_geolocation_lat(String geolocation_lat) {
    this.geolocation_lat = geolocation_lat;
  }
  public geo_location with_geolocation_lat(String geolocation_lat) {
    this.geolocation_lat = geolocation_lat;
    return this;
  }
  private String geolocation_lng;
  public String get_geolocation_lng() {
    return geolocation_lng;
  }
  public void set_geolocation_lng(String geolocation_lng) {
    this.geolocation_lng = geolocation_lng;
  }
  public geo_location with_geolocation_lng(String geolocation_lng) {
    this.geolocation_lng = geolocation_lng;
    return this;
  }
  private String geolocation_city;
  public String get_geolocation_city() {
    return geolocation_city;
  }
  public void set_geolocation_city(String geolocation_city) {
    this.geolocation_city = geolocation_city;
  }
  public geo_location with_geolocation_city(String geolocation_city) {
    this.geolocation_city = geolocation_city;
    return this;
  }
  private String geolocation_state;
  public String get_geolocation_state() {
    return geolocation_state;
  }
  public void set_geolocation_state(String geolocation_state) {
    this.geolocation_state = geolocation_state;
  }
  public geo_location with_geolocation_state(String geolocation_state) {
    this.geolocation_state = geolocation_state;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof geo_location)) {
      return false;
    }
    geo_location that = (geo_location) o;
    boolean equal = true;
    equal = equal && (this.UID == null ? that.UID == null : this.UID.equals(that.UID));
    equal = equal && (this.geolocation_zip_code_prefix == null ? that.geolocation_zip_code_prefix == null : this.geolocation_zip_code_prefix.equals(that.geolocation_zip_code_prefix));
    equal = equal && (this.geolocation_lat == null ? that.geolocation_lat == null : this.geolocation_lat.equals(that.geolocation_lat));
    equal = equal && (this.geolocation_lng == null ? that.geolocation_lng == null : this.geolocation_lng.equals(that.geolocation_lng));
    equal = equal && (this.geolocation_city == null ? that.geolocation_city == null : this.geolocation_city.equals(that.geolocation_city));
    equal = equal && (this.geolocation_state == null ? that.geolocation_state == null : this.geolocation_state.equals(that.geolocation_state));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof geo_location)) {
      return false;
    }
    geo_location that = (geo_location) o;
    boolean equal = true;
    equal = equal && (this.UID == null ? that.UID == null : this.UID.equals(that.UID));
    equal = equal && (this.geolocation_zip_code_prefix == null ? that.geolocation_zip_code_prefix == null : this.geolocation_zip_code_prefix.equals(that.geolocation_zip_code_prefix));
    equal = equal && (this.geolocation_lat == null ? that.geolocation_lat == null : this.geolocation_lat.equals(that.geolocation_lat));
    equal = equal && (this.geolocation_lng == null ? that.geolocation_lng == null : this.geolocation_lng.equals(that.geolocation_lng));
    equal = equal && (this.geolocation_city == null ? that.geolocation_city == null : this.geolocation_city.equals(that.geolocation_city));
    equal = equal && (this.geolocation_state == null ? that.geolocation_state == null : this.geolocation_state.equals(that.geolocation_state));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.UID = JdbcWritableBridge.readString(1, __dbResults);
    this.geolocation_zip_code_prefix = JdbcWritableBridge.readString(2, __dbResults);
    this.geolocation_lat = JdbcWritableBridge.readString(3, __dbResults);
    this.geolocation_lng = JdbcWritableBridge.readString(4, __dbResults);
    this.geolocation_city = JdbcWritableBridge.readString(5, __dbResults);
    this.geolocation_state = JdbcWritableBridge.readString(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.UID = JdbcWritableBridge.readString(1, __dbResults);
    this.geolocation_zip_code_prefix = JdbcWritableBridge.readString(2, __dbResults);
    this.geolocation_lat = JdbcWritableBridge.readString(3, __dbResults);
    this.geolocation_lng = JdbcWritableBridge.readString(4, __dbResults);
    this.geolocation_city = JdbcWritableBridge.readString(5, __dbResults);
    this.geolocation_state = JdbcWritableBridge.readString(6, __dbResults);
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
    JdbcWritableBridge.writeString(geolocation_zip_code_prefix, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(geolocation_lat, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(geolocation_lng, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(geolocation_city, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(geolocation_state, 6 + __off, 12, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(UID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(geolocation_zip_code_prefix, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(geolocation_lat, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(geolocation_lng, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(geolocation_city, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(geolocation_state, 6 + __off, 12, __dbStmt);
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
        this.geolocation_zip_code_prefix = null;
    } else {
    this.geolocation_zip_code_prefix = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.geolocation_lat = null;
    } else {
    this.geolocation_lat = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.geolocation_lng = null;
    } else {
    this.geolocation_lng = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.geolocation_city = null;
    } else {
    this.geolocation_city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.geolocation_state = null;
    } else {
    this.geolocation_state = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.UID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UID);
    }
    if (null == this.geolocation_zip_code_prefix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_zip_code_prefix);
    }
    if (null == this.geolocation_lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_lat);
    }
    if (null == this.geolocation_lng) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_lng);
    }
    if (null == this.geolocation_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_city);
    }
    if (null == this.geolocation_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_state);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.UID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UID);
    }
    if (null == this.geolocation_zip_code_prefix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_zip_code_prefix);
    }
    if (null == this.geolocation_lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_lat);
    }
    if (null == this.geolocation_lng) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_lng);
    }
    if (null == this.geolocation_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_city);
    }
    if (null == this.geolocation_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_state);
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
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation_zip_code_prefix==null?"null":geolocation_zip_code_prefix, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation_lat==null?"null":geolocation_lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation_lng==null?"null":geolocation_lng, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation_city==null?"null":geolocation_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation_state==null?"null":geolocation_state, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(UID==null?"null":UID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation_zip_code_prefix==null?"null":geolocation_zip_code_prefix, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation_lat==null?"null":geolocation_lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation_lng==null?"null":geolocation_lng, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation_city==null?"null":geolocation_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation_state==null?"null":geolocation_state, delimiters));
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
    if (__cur_str.equals("null")) { this.geolocation_zip_code_prefix = null; } else {
      this.geolocation_zip_code_prefix = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.geolocation_lat = null; } else {
      this.geolocation_lat = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.geolocation_lng = null; } else {
      this.geolocation_lng = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.geolocation_city = null; } else {
      this.geolocation_city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.geolocation_state = null; } else {
      this.geolocation_state = __cur_str;
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
    if (__cur_str.equals("null")) { this.geolocation_zip_code_prefix = null; } else {
      this.geolocation_zip_code_prefix = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.geolocation_lat = null; } else {
      this.geolocation_lat = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.geolocation_lng = null; } else {
      this.geolocation_lng = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.geolocation_city = null; } else {
      this.geolocation_city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.geolocation_state = null; } else {
      this.geolocation_state = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    geo_location o = (geo_location) super.clone();
    return o;
  }

  public void clone0(geo_location o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("UID", this.UID);
    __sqoop$field_map.put("geolocation_zip_code_prefix", this.geolocation_zip_code_prefix);
    __sqoop$field_map.put("geolocation_lat", this.geolocation_lat);
    __sqoop$field_map.put("geolocation_lng", this.geolocation_lng);
    __sqoop$field_map.put("geolocation_city", this.geolocation_city);
    __sqoop$field_map.put("geolocation_state", this.geolocation_state);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("UID", this.UID);
    __sqoop$field_map.put("geolocation_zip_code_prefix", this.geolocation_zip_code_prefix);
    __sqoop$field_map.put("geolocation_lat", this.geolocation_lat);
    __sqoop$field_map.put("geolocation_lng", this.geolocation_lng);
    __sqoop$field_map.put("geolocation_city", this.geolocation_city);
    __sqoop$field_map.put("geolocation_state", this.geolocation_state);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
