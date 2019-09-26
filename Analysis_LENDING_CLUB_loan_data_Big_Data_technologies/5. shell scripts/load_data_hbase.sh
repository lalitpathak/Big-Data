#--------------------------------------------------------------------------------
# Title : Hbase_table_load 
# Description :script is used to load the hive query result output 
#              Stored in the  /home/cloudera/pda_project/View_result in the
#              respective table in the hbase             
#-------------------------------------------------------------------------------------



# avg_int_Rate
hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.separator=',' -Dimporttsv.columns='HBASE_ROW_KEY,avg_int_rate:int_Rate,avg_int_rate:Period' avg_int_rate /home/cloudera/pda_project/View_result/avg_int_rate/000000_0

# loan_amnt
hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.separator=',' -Dimporttsv.columns='HBASE_ROW_KEY,lon_amt:count,lon_amt:loan_amnt' lon_amt /home/cloudera/pda_project/View_result/lon_amt/000000_0

# annual_anul_inc_by_state
hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.separator=',' -Dimporttsv.columns='HBASE_ROW_KEY,annual_inc_by_state:annual_inc,annual_inc_by_state:adress_state' annual_inc_by_state /home/cloudera/pda_project/View_result/annual_inc_by_state/000000_0

# avg_int_rate_by_state
hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.separator=',' -Dimporttsv.columns='HBASE_ROW_KEY,avg_int_rate_by_state:int_rate,avg_int_rate_by_state:adress_state' avg_int_rate_by_state /home/cloudera/pda_project/View_result/avg_int_rate_by_state/000000_0

# funded_amnt
hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.separator=',' -Dimporttsv.columns='HBASE_ROW_KEY,funded_amnt:count,funded_amnt:funded_amnt' funded_amnt /home/cloudera/pda_project/View_result/funded_amnt/000000_0

#loan_purpose
hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.separator=',' -Dimporttsv.columns='HBASE_ROW_KEY,loan_purpose:loan_amnt,loan_purpose:purpose' loan_purpose /home/cloudera/pda_project/View_result/loan_purpose/000000_0

