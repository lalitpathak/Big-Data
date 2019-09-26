#-------------------------------------------------------------------------------------
# Name : Pre_Processing.sh 
# Discription : This script remove the header and '"' from the files.  
#               These files then used as input file for the Mysql and MapReduce .
#---------------------------------------------------------------------------------------

# SCRIPT_PATH ='/home/cloudera/PDA_PROJECT_OLIST/SCRIPT
# Preparing files for MySQL database
# using 'sed' to remove '"' and first line
# storing files with 'm_' prefix


#---------------------------------------------------------------------------------------
# preparing files for MySQL database
# using 'sed' to remove '"' and first line
# storing files with 'm_' prefix

echo "------------------------------------------------------------------------------"
echo "preparing files for MySQL database."

sed 's/["]//g' '/home/cloudera/PDA_PROJECT_OLIST/INPUT/olist_geolocation_dataset.csv' > '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/m_geo_location.csv'
sed -i -n -e '2,$p' '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/m_geo_location.csv'
sed 's/["]//g' '/home/cloudera/PDA_PROJECT_OLIST/INPUT/olist_sellers_dataset.csv' > '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/m_sellers_data.csv'
sed -i -n -e '2,$p' '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/m_sellers_data.csv'
sed 's/["]//g' '/home/cloudera/PDA_PROJECT_OLIST/INPUT/olist_products_dataset.csv'> '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/m_products_data.csv'
sed -i -n -e '2,$p' '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/m_products_data.csv'
sed 's/["]//g' '/home/cloudera/PDA_PROJECT_OLIST/INPUT/product_category_name_translation.csv' > '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/m_products_category_data.csv'
sed -i -n -e '2,$p' '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/m_products_category_data.csv'
sed 's/["]//g' '/home/cloudera/PDA_PROJECT_OLIST/INPUT/olist_closed_deals_dataset.csv' > '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/m_olist_closed_deals_dataset.csv'
sed -i -n -e '2,$p' '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/m_olist_closed_deals_dataset.csv'
sed 's/["]//g' '/home/cloudera/PDA_PROJECT_OLIST/INPUT/olist_marketing_qualified_leads_dataset.csv' > '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/m_olist_marketing_qualified_leads_dataset.csv'
sed -i -n -e '2,$p' '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/m_olist_marketing_qualified_leads_dataset.csv'

echo "Files prepared for MYSQL database."

#---------------------------------------------------------------------------------------

#---------------------------------------------------------------------------------------
# preparing files for Hive database
# using 'sed' to remove '"' column row and and first line
# storing files with 'h_' prefix

echo "------------------------------------------------------------------------------"
echo "preparing files for Hive database."

sed 's/["]//g' '/home/cloudera/PDA_PROJECT_OLIST/INPUT/olist_customers_dataset.csv'> '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/h_customer_data.csv'
sed -i -n -e '2,$p' '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/h_customer_data.csv'
sed 's/["]//g' '/home/cloudera/PDA_PROJECT_OLIST/INPUT/olist_order_items_dataset.csv' > '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/h_order_items_data.csv'
sed -i -n -e '2,$p' '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/h_order_items_data.csv'
sed 's/["]//g' '/home/cloudera/PDA_PROJECT_OLIST/INPUT/olist_order_payments_dataset.csv' > '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/h_order_payments_data.csv'
sed -i -n -e '2,$p' '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/h_order_payments_data.csv'
sed 's/["]//g' '/home/cloudera/PDA_PROJECT_OLIST/INPUT/olist_order_reviews_dataset.csv' > '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/h_order_reviews_data.csv'
sed -i -n -e '2,$p' '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/h_order_reviews_data.csv'
sed 's/["]//g' '/home/cloudera/PDA_PROJECT_OLIST/INPUT/olist_orders_dataset.csv' > '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/h_orders_data.csv'
sed -i -n -e '2,$p' '/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/h_orders_data.csv'

echo "Files prepared for Hive database and Mapreduce."

#---------------------------------------------------------------------------------------

