#-------------------------MySql Script ------------------------------------------------
#            1. create table into MySQL Database 
#            2. load data into MySQL Table 
#---------------------------------------------------------------------------------------

SCRIPT_PATH="/home/cloudera/Script/Table_creation_scripts"
# creating respective tables in MySQL database

echo "------------------------------------------------------------------------------"
echo "creating respective tables in MySQL database"

mysql_user="root"

mysql -h "localhost" -u ${mysql_user} -pcloudera < ${SCRIPT_PATH}/customer.sql


# loading data into MySQL tables from processed 'm_' files
 
#Table_Creation 
  mysql -h "localhost" -u ${mysql_user} -pcloudera ${mysql_database} < ${SCRIPT_PATH}/customer_data.sql
