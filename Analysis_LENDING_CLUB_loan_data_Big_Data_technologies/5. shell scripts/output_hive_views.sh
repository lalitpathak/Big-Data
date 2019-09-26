hive -e "set hive.cli.print.header=true; select * from Customer.lon_amt" > /home/cloudera/final_output/lon_amt.csv
hive -e "set hive.cli.print.header=true; select * from Customer.annual_inc_by_state" > /home/cloudera/final_output/annual_inc_by_state.csv
hive -e "set hive.cli.print.header=true; select * from Customer.application_type" > /home/cloudera/final_output/application_type.csv
hive -e "set hive.cli.print.header=true; select * from Customer.avg_int_rate" > /home/cloudera/final_output/avg_int_rate.csv
hive -e "set hive.cli.print.header=true; select * from Customer.avg_int_rate_by_state" > /home/cloudera/final_output/avg_int_rate_by_state.csv
hive -e "set hive.cli.print.header=true; select * from Customer.funded_amnt" > /home/cloudera/final_output/funded_amnt.csv
hive -e "set hive.cli.print.header=true; select * from Customer.loan_purpose" > /home/cloudera/final_output/loan_purpose.csv
hive -e "set hive.cli.print.header=true; select * from Customer.monthwise_loan" > /home/cloudera/final_output/monthwise_loan.csv
