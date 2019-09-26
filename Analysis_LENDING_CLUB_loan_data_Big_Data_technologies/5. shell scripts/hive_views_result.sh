hive -e "INSERT OVERWRITE DIRECTORY '/home/cloudera/pda_project/View_result/lon_amt' ROW FORMAT DELIMITED FIELDS TERMINATED BY ','STORED AS TEXTFILE select * from customer1.lon_amt";
#hive -e "INSERT OVERWRITE DIRECTORY '/home/cloudera/pda_project/View_result/application_type' ROW FORMAT DELIMITED FIELDS TERMINATED BY ','STORED AS TEXTFILE select * from customer1.application_type ";
hive -e "INSERT OVERWRITE DIRECTORY '/home/cloudera/pda_project/View_result/avg_int_rate' ROW FORMAT DELIMITED FIELDS TERMINATED BY ','STORED AS TEXTFILE select * from customer1.avg_int_rate ";
hive -e "INSERT OVERWRITE DIRECTORY '/home/cloudera/pda_project/View_result/avg_int_rate_by_state' ROW FORMAT DELIMITED FIELDS TERMINATED BY ','STORED AS TEXTFILE select * from customer1.avg_int_rate_by_state";
hive -e "INSERT OVERWRITE DIRECTORY '/home/cloudera/pda_project/View_result/funded_amnt' ROW FORMAT DELIMITED FIELDS TERMINATED BY ','STORED AS TEXTFILE select * from customer1.funded_amnt";
hive -e "INSERT OVERWRITE DIRECTORY '/home/cloudera/pda_project/View_result/loan_purpose' ROW FORMAT DELIMITED FIELDS TERMINATED BY ','STORED AS TEXTFILE select * from customer1.loan_purpose";
hive -e "INSERT OVERWRITE DIRECTORY '/home/cloudera/pda_project/View_result/monthwise_loan' ROW FORMAT DELIMITED FIELDS TERMINATED BY ','STORED AS TEXTFILE select * from customer1.monthwise_loan";
hive -e "INSERT OVERWRITE DIRECTORY '/home/cloudera/pda_project/View_result/annual_inc_by_state' ROW FORMAT DELIMITED FIELDS TERMINATED BY ','STORED AS TEXTFILE select * from customer1.annual_inc_by_state";

