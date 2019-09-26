#--------------------------------------------------------------------------------
# Title : Hbase_table_load 
# Description :script is used to load the MapReduce,hive,Pig query result output 
#              stored in the  /home/cloudera/PDA_PROJECT_OLIST in the
#              respective table in the hbase             
#-------------------------------------------------------------------------------------

  
echo "------------------------Loading Data For Table olist_Filter_order_MapR Table------------------"

hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.separator=',' -Dimporttsv.columns='HBASE_ROW_KEY,UID:UID,UID:order_id,UID:customer_id,UID:order_status,UID:order_purchase_timestamp,UID:Month,UID:day,UID:year,UID:order_approved_at,UID:order_delivered_carrier_date,UID:order_delivered_customer_date,UID:order_estimated_delivery_date' olist_Filter_order_MapR /user/cloudera/PDA_PROJECT_OLIST/MAP_REDUCE_OUTPUT/part-r-00000


echo "------------------------loading data for Table olist_Busiest_Hrs -----------------------------"

hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.separator=',' -Dimporttsv.columns='HBASE_ROW_KEY,count_order_id:count_order_id,Hrs:Hrs,year:year'  olist_Busiest_Hrs /user/cloudera/PDA_PROJECT_OLIST/view_result/view_Busiest_Hrs/000000_0



echo "------------------------Loading data for Table olist_Product_Category_sell -------------------"

hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.separator=',' -Dimporttsv.columns='HBASE_ROW_KEY,count_product_id:count_product_id,product_category_name:product_category_name,product_category_name_english:product_category_name_english'  olist_Product_Category_sell /user/cloudera/PDA_PROJECT_OLIST/view_result/view_Category_count/000000_0


echo "------------------------Loading data for Table average_order_value_year ----------------------"

hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.separator=',' -Dimporttsv.columns='HBASE_ROW_KEY,average_payment_value:average_payment_value,Year:Year' olist_average_order_value_year /user/cloudera/PDA_PROJECT_OLIST/view_result/view_average_order_value_year/000000_0


echo "------------------------Loading data for Table average_order_value_Month ----------------------"

hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.separator=',' -Dimporttsv.columns='HBASE_ROW_KEY,average_payment_value:average_payment_value,month:month' olist_average_order_value_year /user/cloudera/PDA_PROJECT_OLIST/view_result/view_average_order_value_month/000000_0



#echo "------------------------Loading data for Table olist_avergae_order_value  ---------------------"
#hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.columns='HBASE_ROW_KEY,average_payment_value:average_payment_value' olist_avergae_order_value /user/cloudera/PDA_PROJECT_OLIST/view_result/view_avergae_order_value/000000_0



echo "------------------------loading data for Table olist_sts_order_payment -----------------------"

hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.separator=',' -Dimporttsv.columns='HBASE_ROW_KEY,count_order_id:count_order_id,count_customer_state:count_customer_state,count_payment_value:count_payment_value' olist_sts_order_payment /user/cloudera/PDA_PROJECT_OLIST/view_result/sta_most_num_of_order_pay/000000_0





*****************  Pig output *************************

 
echo "------------------------loading data for Table olist_seller_state ----------------------------"

hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.separator=' ' -Dimporttsv.columns='HBASE_ROW_KEY,count_olist_seller:count_olist_seller,state:state' olist_seller_state /user/cloudera/PDA_PROJECT_OLIST/Pig_output/sellers_count_state/part-r-00000


echo "------------------------loading data for Table olist_customer_state --------------------------"

hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.separator=' ' -Dimporttsv.columns='HBASE_ROW_KEY,count_olist_customer:count_olist_customer,state:state' olist_customer_state /user/cloudera/PDA_PROJECT_OLIST/Pig_output/customer_count_state/part-r-00000


echo "------------------------loading data for Table olist_sellers ---------------------------------"
hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.columns='HBASE_ROW_KEY,count_of_orders:count_of_orders,sellers:sellers' olist_sellers /user/cloudera/PDA_PROJECT_OLIST/Pig_output/Sellers_with_highest_no_of_orders/part-r-00000


echo "------------------------loading data for Table olist_marketing_qualified_leads ---------------------------------"
hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.columns='HBASE_ROW_KEY,origin:origin,count_mql_id:count_mql_id' olist_marketing_qualified_leads /user/cloudera/PDA_PROJECT_OLIST/Pig_output/NO_of_MQL_origin/part-r-00000


echo "------------------------loading data for Table olist_marketing_qualified_leads_MQL ---------------------------------"
hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.columns='HBASE_ROW_KEY,month:month,count_of_mql_id:count_of_mql_id' olist_marketing_qualified_leads_MQL /user/cloudera/PDA_PROJECT_OLIST/Pig_output/NO_of_MQL_per_Month/part-r-00000


echo "------------------------loading data for Table olist_closed_deals ---------------------------------"
hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.columns='HBASE_ROW_KEY,month:month,count(mql_id):count(mql_id)' olist_closed_deals /user/cloudera/PDA_PROJECT_OLIST/Pig_output/NO_of_WON_MQL_per_Month/part-r-00000



echo "-------------------------------Data Load completed---------------------------------------------"

