order_item = LOAD 'olist.order_item' USING org.apache.hive.hcatalog.pig.HCatLoader();
describe order_item;
DUMP order_item;
seller_group = GROUP order_item BY seller_id;
output_record = FOREACH seller_group GENERATE group,COUNT(order_item.order_id);
DUMP output_record;
store output_record into '/home/cloudera/PDA_PROJECT_OLIST/Pig_output/Sellers_with_highest_no_of_orders';
