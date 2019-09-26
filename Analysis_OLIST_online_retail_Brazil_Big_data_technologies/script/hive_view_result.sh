################# Sqoop #######################################################################
# Title : hive_view_results 
# Description : Scrtipt create Directory on the HDFS and stored the result of Hive view on HDFS
#               Result of hive view has been stored into the HDFS location  
###############################################################################################


hive -e "INSERT OVERWRITE DIRECTORY 
'/user/cloudera/PDA_PROJECT_OLIST/view_result/sta_most_num_of_order_pay' ROW FORMAT DELIMITED FIELDS TERMINATED BY ','STORED AS TEXTFILE select * from olist.view_Brazellian_States_With_Most_number_of_Orders_and_payment";


hive -e "INSERT OVERWRITE DIRECTORY 
'/user/cloudera/PDA_PROJECT_OLIST/view_result/view_avergae_order_value' ROW FORMAT DELIMITED FIELDS TERMINATED BY ','STORED AS TEXTFILE select * from olist.view_avergae_order_value";


hive -e "INSERT OVERWRITE DIRECTORY 
'/user/cloudera/PDA_PROJECT_OLIST/view_result/view_average_order_value_year' ROW FORMAT DELIMITED FIELDS TERMINATED BY ','STORED AS TEXTFILE select * from olist.view_average_order_value_year";



hive -e "INSERT OVERWRITE DIRECTORY
'/user/cloudera/PDA_PROJECT_OLIST/view_result/view_average_order_value_month' ROW FORMAT DELIMITED FIELDS TERMINATED BY ','STORED AS TEXTFILE select * from olist.view_average_order_value_month";

hive -e "INSERT OVERWRITE DIRECTORY 
'/user/cloudera/PDA_PROJECT_OLIST/view_result/view_Busiest_Hrs' ROW FORMAT DELIMITED FIELDS TERMINATED BY ','STORED AS TEXTFILE select * from olist.view_Busiest_Hrs";


hive -e "INSERT OVERWRITE DIRECTORY 
'/user/cloudera/PDA_PROJECT_OLIST/view_result/view_Category_count' ROW FORMAT DELIMITED FIELDS TERMINATED BY ','STORED AS TEXTFILE select * from olist.view_Category_count";
