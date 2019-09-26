// ORM class for table 'olist_marketing_qualified_leads'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jul 04 06:58:57 PDT 2019
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

public class olist_marketing_qualified_leads extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("mql_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        mql_id = (String)value;
      }
    });
    setters.put("first_contact_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        first_contact_date = (String)value;
      }
    });
    setters.put("landing_page_id_origin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        landing_page_id_origin = (String)value;
      }
    });
  }
  public olist_marketing_qualified_leads() {
    init0();
  }
  private String mql_id;
  public String get_mql_id() {
    return mql_id;
  }
  public void set_mql_id(String mql_id) {
    this.mql_id = mql_id;
  }
  public olist_marketing_qualified_leads with_mql_id(String mql_id) {
    this.mql_id = mql_id;
    return this;
  }
  private String first_contact_date;
  public String get_first_contact_date() {
    return first_contact_date;
  }
  public void set_first_contact_date(String first_contact_date) {
    this.first_contact_date = first_contact_date;
  }
  public olist_marketing_qualified_leads with_first_contact_date(String first_contact_date) {
    this.first_contact_date = first_contact_date;
    return this;
  }
  private String landing_page_id_origin;
  public String get_landing_page_id_origin() {
    return landing_page_id_origin;
  }
  public void set_landing_page_id_origin(String landing_page_id_origin) {
    this.landing_page_id_origin = landing_page_id_origin;
  }
  public olist_marketing_qualified_leads with_landing_page_id_origin(String landing_page_id_origin) {
    this.landing_page_id_origin = landing_page_id_origin;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof olist_marketing_qualified_leads)) {
      return false;
    }
    olist_marketing_qualified_leads that = (olist_marketing_qualified_leads) o;
    boolean equal = true;
    equal = equal && (this.mql_id == null ? that.mql_id == null : this.mql_id.equals(that.mql_id));
    equal = equal && (this.first_contact_date == null ? that.first_contact_date == null : this.first_contact_date.equals(that.first_contact_date));
    equal = equal && (this.landing_page_id_origin == null ? that.landing_page_id_origin == null : this.landing_page_id_origin.equals(that.landing_page_id_origin));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof olist_marketing_qualified_leads)) {
      return false;
    }
    olist_marketing_qualified_leads that = (olist_marketing_qualified_leads) o;
    boolean equal = true;
    equal = equal && (this.mql_id == null ? that.mql_id == null : this.mql_id.equals(that.mql_id));
    equal = equal && (this.first_contact_date == null ? that.first_contact_date == null : this.first_contact_date.equals(that.first_contact_date));
    equal = equal && (this.landing_page_id_origin == null ? that.landing_page_id_origin == null : this.landing_page_id_origin.equals(that.landing_page_id_origin));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.mql_id = JdbcWritableBridge.readString(1, __dbResults);
    this.first_contact_date = JdbcWritableBridge.readString(2, __dbResults);
    this.landing_page_id_origin = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.mql_id = JdbcWritableBridge.readString(1, __dbResults);
    this.first_contact_date = JdbcWritableBridge.readString(2, __dbResults);
    this.landing_page_id_origin = JdbcWritableBridge.readString(3, __dbResults);
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
    JdbcWritableBridge.writeString(mql_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(first_contact_date, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(landing_page_id_origin, 3 + __off, 12, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(mql_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(first_contact_date, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(landing_page_id_origin, 3 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.mql_id = null;
    } else {
    this.mql_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.first_contact_date = null;
    } else {
    this.first_contact_date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.landing_page_id_origin = null;
    } else {
    this.landing_page_id_origin = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.mql_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mql_id);
    }
    if (null == this.first_contact_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, first_contact_date);
    }
    if (null == this.landing_page_id_origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, landing_page_id_origin);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.mql_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mql_id);
    }
    if (null == this.first_contact_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, first_contact_date);
    }
    if (null == this.landing_page_id_origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, landing_page_id_origin);
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
    __sb.append(FieldFormatter.escapeAndEnclose(mql_id==null?"null":mql_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_contact_date==null?"null":first_contact_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(landing_page_id_origin==null?"null":landing_page_id_origin, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(mql_id==null?"null":mql_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_contact_date==null?"null":first_contact_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(landing_page_id_origin==null?"null":landing_page_id_origin, delimiters));
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
    if (__cur_str.equals("null")) { this.mql_id = null; } else {
      this.mql_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.first_contact_date = null; } else {
      this.first_contact_date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.landing_page_id_origin = null; } else {
      this.landing_page_id_origin = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.mql_id = null; } else {
      this.mql_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.first_contact_date = null; } else {
      this.first_contact_date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.landing_page_id_origin = null; } else {
      this.landing_page_id_origin = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    olist_marketing_qualified_leads o = (olist_marketing_qualified_leads) super.clone();
    return o;
  }

  public void clone0(olist_marketing_qualified_leads o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("mql_id", this.mql_id);
    __sqoop$field_map.put("first_contact_date", this.first_contact_date);
    __sqoop$field_map.put("landing_page_id_origin", this.landing_page_id_origin);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("mql_id", this.mql_id);
    __sqoop$field_map.put("first_contact_date", this.first_contact_date);
    __sqoop$field_map.put("landing_page_id_origin", this.landing_page_id_origin);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
