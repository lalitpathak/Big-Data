###############hive_external_table_creation.sh ####################
# Title : Create external hive table 
#  Description :This script is used to load the data from local to Hdfs
             and creating the external table in hive database olist 
             on top of HDFS files 
#####################################################################  

echo '---------------------------------------------------------------'

echo '----------------Creation of directory on HDFS -----------------'

hdfs dfs -mkdir /user/cloudera/PDA_PROJECT_OLIST/PROCESSED/customer_data 
hdfs dfs -mkdir /user/cloudera/PDA_PROJECT_OLIST/PROCESSED/order_items
hdfs dfs -mkdir /user/cloudera/PDA_PROJECT_OLIST/PROCESSED/order_payments
hdfs dfs -mkdir /user/cloudera/PDA_PROJECT_OLIST/PROCESSED/order_reviews
hdfs dfs -mkdir /user/cloudera/PDA_PROJECT_OLIST/PROCESSED/orders

echo '----------------HDFS Directory Created -------------------------'


HDFS_SOURCE_PATH='/user/cloudera/PDA_PROJECT_OLIST/PROCESSED'
LOCAL_SOURCE_PATH='/home/cloudera/PDA_PROJECT_OLIST/PROCESSED'

echo '----------------Loading Data On HDFS ----------------------------' 

hdfs dfs -put  $LOCAL_SOURCE_PATH/h_customer_data.csv $HDFS_SOURCE_PATH/customer_data
hdfs dfs -put  $LOCAL_SOURCE_PATH/h_order_items_data.csv $HDFS_SOURCE_PATH/order_items
hdfs dfs -put  $LOCAL_SOURCE_PATH/h_order_payments_data.csv $HDFS_SOURCE_PATH/order_payments
hdfs dfs -put  $LOCAL_SOURCE_PATH/h_order_reviews_data.csv  $HDFS_SOURCE_PATH/order_reviews
hdfs dfs -put  $LOCAL_SOURCE_PATH/h_orders_data.csv $HDFS_SOURCE_PATH/orders 

echo '-------------------Data Load Successful-----------------------------'


echo '-------------------Exernal Hive table creation ---------------------'

hive -e "CREATE EXTERNAL TABLE olist.customer (UID   varchar(50),customer_id   varchar(50),customer_unique_id   varchar(50),customer_zip_code_prefix   varchar(50),customer_city   varchar(50),customer_state   varchar(50)) Row format delimited Fields terminated by ',' LOCATION '/user/cloudera/PDA_PROJECT_OLIST/PROCESSED/customer_data';"
hive -e "CREATE EXTERNAL TABLE olist.order_item (UID varchar(50), order_id   varchar(50), order_item_id   varchar(50), product_id   varchar(50), seller_id   varchar(50), shipping_limit_date   varchar(50), price   varchar(50), freight_value   varchar(50)) Row format delimited Fields terminated by ',' LOCATION '/user/cloudera/PDA_PROJECT_OLIST/PROCESSED/order_items';"
hive -e "CREATE EXTERNAL TABLE olist.Review  (UID    varchar(50),review_id   varchar(50),order_id    varchar(50),review_score    varchar(50),review_comment_title    varchar(50),review_comment_message    varchar(50),review_creation_date    varchar(50), review_answer_timestamp   varchar(50)) Row format delimited Fields terminated by ',' LOCATION '/user/cloudera/PDA_PROJECT_OLIST/PROCESSED/order_reviews';"
hive -e "CREATE EXTERNAL TABLE olist.payment (UID    varchar(50),order_id    varchar(50),payment_sequential    varchar(50),payment_type    varchar(50),payment_installments    varchar(50), payment_value   varchar(50)) Row format delimited Fields terminated by ',' LOCATION '/user/cloudera/PDA_PROJECT_OLIST/PROCESSED/order_payments';"
hive -e "CREATE EXTERNAL TABLE olist.orders  (UID    varchar(50),order_id    varchar(50),customer_id    varchar(50),order_status    varchar(50),order_purchase_timestamp    varchar(50),Month   varchar(50),Date   varchar(50),Year   varchar(50),Hrs varchar(50),order_approved_at    varchar(50),order_delivered_carrier_date    varchar(50),order_delivered_customer_date   varchar(50), order_estimated_delivery_date   varchar(50)) Row format delimited Fields terminated by ',' LOCATION '/user/cloudera/PDA_PROJECT_OLIST/PROCESSED/orders';"

echo '-------------------Hive tables sucessfully created in Olist database------------------------------'


echo '--------------------------------------------------------------------------------------------------'

echo '-------------------Count Validation---------------------------------------------------------------'

echo '--------count of table customer-----------------------'

hive -e "select count(*) from olist.customer;"

echo '--------count of table order_item---------------------'

hive -e "select count(*) from olist.order_item;"

echo '--------count of table orders-------------------------'

hive -e "select count(*) from olist.orders;"

echo '--------count of table payment -----------------------'
hive -e "select count(*) from olist.payment;"

echo '--------count of table review-------------------------' 

hive -e "select count(*) from olist.review;"

echo '-------------------------------------------------------------------------------------------------'

