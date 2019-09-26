#-------------------------MySql Script -------------------------------------------------
#            1. create database and table and  into MySQL Database 
#            2. load data into MySQL Table 
#---------------------------------------------------------------------------------------

  SCRIPT_PATH="/home/cloudera/PDA_PROJECT_OLIST/script"
# creating respective tables in MySQL database

echo "------------------------------------------------------------------------------"
echo "creating respective tables in MySQL database"

mysql_user="root"

mysql -h "localhost" -u ${mysql_user} -pcloudera < ${SCRIPT_PATH}/product_category.sql
mysql -h "localhost" -u ${mysql_user} -pcloudera < ${SCRIPT_PATH}/seller.sql
mysql -h "localhost" -u ${mysql_user} -pcloudera < ${SCRIPT_PATH}/product.sql
mysql -h "localhost" -u ${mysql_user} -pcloudera < ${SCRIPT_PATH}/geo_location.sql
mysql -h "localhost" -u ${mysql_user} -pcloudera < ${SCRIPT_PATH}/closed_deals.sql
mysql -h "localhost" -u ${mysql_user} -pcloudera < ${SCRIPT_PATH}/olist_marketing_qualified_leads.sql

echo "Table creation is successful" 

echo "----------------------------------------------------------------------------------------"


echo " loading data into MySQL tables from processed 'm_' files "
 
mysql_database="Olist"
mysql -h "localhost" -u ${mysql_user} -pcloudera ${mysql_database} < ${SCRIPT_PATH}/products_category_data.sql
mysql -h "localhost" -u ${mysql_user} -pcloudera ${mysql_database} < ${SCRIPT_PATH}/seller_data.sql
mysql -h "localhost" -u ${mysql_user} -pcloudera ${mysql_database} < ${SCRIPT_PATH}/products_data.sql
mysql -h "localhost" -u ${mysql_user} -pcloudera ${mysql_database} < ${SCRIPT_PATH}/geo_location_data.sql
mysql -h "localhost" -u ${mysql_user} -pcloudera ${mysql_database} < ${SCRIPT_PATH}/closed_deals_data.sql
mysql -h "localhost" -u ${mysql_user} -pcloudera ${mysql_database} < ${SCRIPT_PATH}/olist_marketing_qualified_leads_data.sql


echo "Data load successful " 

echo "----------------------------------------------------------------------------------------" 

echo "count verification for data load "

echo "count check of  product"
mysql -h "localhost" -u ${mysql_user} -pcloudera ${mysql_database} < ${SCRIPT_PATH}/count_check_product.sql;

echo "count check of  product_category" 
mysql -h "localhost" -u ${mysql_user} -pcloudera ${mysql_database} < ${SCRIPT_PATH}/count_check_products_category.sql;

echo "count of geo_location"

mysql -h "localhost" -u ${mysql_user} -pcloudera ${mysql_database} < ${SCRIPT_PATH}/count_check_geo_location.sql;

echo "count check of  sellers" 
mysql -h "localhost" -u ${mysql_user} -pcloudera ${mysql_database} < ${SCRIPT_PATH}/count_check_sellers.sql;


echo "count check of closed_deals"
mysql -h "localhost" -u ${mysql_user} -pcloudera ${mysql_database} < ${SCRIPT_PATH}/count_check_closed_deals.sql;


echo "count check of marketing_qualified_leads"
mysql -h "localhost" -u ${mysql_user} -pcloudera ${mysql_database} < ${SCRIPT_PATH}/count_check_olist_marketing_qualified_leads.sql;


echo "--------------------------------------------------------------------------------------"
