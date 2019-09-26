################## Sqoop ########################################################

# Title : Sqoop 
# Description : Load the data from Mysql into HDFS and create the Hive table 

#################################################################################

#!/bin/bash

# Log Location on Server.
LOG_LOCATION=/home/cloudera/PDA_PROJECT/logs
exec > >(tee -i $LOG_LOCATION/Sqoop.log)
exec 2>&1

echo "Log Location should be: [ $LOG_LOCATION ]"

echo "------------------------------------------------------------------------------"
echo "creating database olist in hive " 

hive -e "create database olist";

echo "creating the table under the database olist and load the data from Mysql table." 

echo "-------------------------------------------------------------------------------"

echo  "Create tables uder database olist and load data from mysql"   


sqoop import --connect jdbc:mysql://quickstart.cloudera:3306/Olist --username root --password cloudera --table geo_location  --split-by UID --target-dir /user/cloudera/PDA_PROJECT_OLIST/PROCESSED/geo_locataion -m 1 --hive-import --hive-table olist.geo_location;
sqoop import --connect jdbc:mysql://quickstart.cloudera:3306/Olist --username root --password cloudera --table product  --split-by UID --target-dir /user/cloudera/PDA_PROJECT_OLIST/PROCESSED/product -m 1 --hive-import --hive-table olist.product;
sqoop import --connect jdbc:mysql://quickstart.cloudera:3306/Olist --username root --password cloudera --table products_category  --split-by UID --target-dir /user/cloudera/PDA_PROJECT_OLIST/PROCESSED/products_category -m 1 --hive-import --hive-table olist.products_category;
sqoop import --connect jdbc:mysql://quickstart.cloudera:3306/Olist --username root --password cloudera --table sellers  --split-by UID --target-dir /user/cloudera/PDA_PROJECT_OLIST/PROCESSED/sellers -m 1 --hive-import --hive-table olist.sellers;
sqoop import --connect jdbc:mysql://quickstart.cloudera:3306/Olist --username root --password cloudera --table closed_deals  --split-by mql_id  --target-dir /user/oudera/PDA_PROJECT_OLIST/PROCESSED/closed_deals -m 1 --hive-import --hive-table olist.closed_deals;
sqoop import --connect jdbc:mysql://quickstart.cloudera:3306/Olist --username root --password cloudera --table olist_marketing_qualified_leads  --split-by mql_id --target-dir /user/cloudera/PDA_PROJECT_OLIST/PROCESSED/olist_marketing_qualified_leads -m 1 --hive-import --hive-table olist.olist_marketing_qualified_leads;


 

echo "Tables created Succesfully" 

echo "--------------------------------------------------------------------" 
echo "--------------------------------------------------------------------" 


echo "--------------------------Hive Table count check--------------------"


echo "--------------------------count of geo_location---------------------" 

hive -e "select count(*) from olist.geo_location;"

echo "--------------------------count of product--------------------------" 

hive -e "select count(*) from olist.product;"


echo "---------------------------count of products_category----------------"

hive -e "select count(*) from olist.products_category;"

echo "----------------------------count of sellers-------------------------"

hive -e "select count(*) from olist.sellers;"
 
echo "------------------------------------------------------------------------"


echo "--------------------------count of closed deals -------------------------"

hive -e "select count(*) from olist.closed_deals";


echo "-------------------------------------------------------------------------" 

echo "---------------count of olist_marketing_qualified_lead-------------------"


hive -e "select count(*) from olist.olist_marketing_qualified_leads" ;

echo "-------------------------------------------------------------------------" 
