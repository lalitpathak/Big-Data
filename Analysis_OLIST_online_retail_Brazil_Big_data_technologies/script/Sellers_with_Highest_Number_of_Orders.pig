order_item = LOAD 'olist.order_item' USING org.apache.hive.hcatalog.pig.HCatLoader();
describe order_item;
seller_group = GROUP order_item BY seller_id;
output_record = FOREACH seller_group GENERATE group,COUNT(order_item.order_id);
store output_record into '/user/cloudera/PDA_PROJECT_OLIST/pig_output';
