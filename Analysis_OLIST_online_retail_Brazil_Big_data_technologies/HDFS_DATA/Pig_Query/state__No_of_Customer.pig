olist_customer = LOAD 'olist.customer' USING org.apache.hive.hcatalog.pig.HCatLoader();
DUMP olist_customer;
customer_group = GROUP olist_customer BY customer_state;
output_record = FOREACH customer_group GENERATE group,COUNT(olist_customer.customer_id);
DUMP output_record;
store output_record into '/home/cloudera/PDA_PROJECT_OLIST/Pig_output/customer_count_state';
