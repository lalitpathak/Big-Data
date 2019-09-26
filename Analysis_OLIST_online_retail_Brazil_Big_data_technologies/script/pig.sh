#---------------------------------------------------------------------------------
# Title : pig.sh
# Description: This script will run 1)Sellers_with_Highest_Number_of_Orders.pig'
#                                   2)state__No_of_Customer.pig
#                                   3)state__No_of_sellers.pig
#                                   4)No_of won_mql and mql 
#              Validation of the pig script output. 
#              Storing pig script result from local to HDFS.       
#                            
#---------------------------------------------------------------------------------

echo "-----------------Executing Pig script --------------------------------------"
pig -x local '/home/cloudera/PDA_PROJECT_OLIST/Pig_Query/Sellers_with_Highest_Number_of_Orders.pig'
pig -x local '/home/cloudera/PDA_PROJECT_OLIST/Pig_Query/state__No_of_Customer.pig'
pig -x local '/home/cloudera/PDA_PROJECT_OLIST/Pig_Query/state__No_of_sellers.pig'
pig -x local '/home/cloudera/PDA_PROJECT_OLIST/Pig_Query/MQL_and_WON_MQL_per_Month.pig' 
pig -x local '/home/cloudera/PDA_PROJECT_OLIST/Pig_Query/MQL_by_channel.pig'


echo "-----------------Pig script Executed Succesfully-----------------------------"


echo " ----------------Validation of pig Output-------------------------------------"

head -10 /home/cloudera/PDA_PROJECT_OLIST/Pig_output/count_customer_state/part-r-00000
head -10 /home/cloudera/PDA_PROJECT_OLIST/Pig_output/sellers_count_state/part-r-00000
head -10 /home/cloudera/PDA_PROJECT_OLIST/Pig_output/customer_count_state/part-r-00000
head /home/cloudera/PDA_PROJECT_OLIST/Pig_output/NO_of_MQL_per_Month/part-r-00000
head /home/cloudera/PDA_PROJECT_OLIST/Pig_output/NO_of_WON_MQL_per_Month/part-r-00000
head /home/cloudera/PDA_PROJECT_OLIST/Pig_output/NO_of_MQL_origin/part-r-00000
echo " ----------------Copying_files_from_local_to_hdfs -------------------------------------"

hadoop fs -copyFromLocal /home/cloudera/PDA_PROJECT_OLIST/Pig_output /user/cloudera/PDA_PROJECT_OLIST/
