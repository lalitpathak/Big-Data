olist_sellers = LOAD 'olist.sellers' USING org.apache.hive.hcatalog.pig.HCatLoader();
DUMP olist_sellers;
sellers_group = GROUP olist_sellers BY seller_state;
output_record = FOREACH sellers_group GENERATE group,COUNT(olist_sellers.seller_id);
DUMP output_record;
store output_record into '/home/cloudera/PDA_PROJECT_OLIST/Pig_output/sellers_count_state';
