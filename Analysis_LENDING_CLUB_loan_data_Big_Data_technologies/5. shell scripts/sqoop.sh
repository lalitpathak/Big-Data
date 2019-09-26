
################## Sqoop ########################################################
# Title : Sqoop 
# Description : Load the data from Mysql into HDFS and create the Hive table 
#################################################################################

# creating respective tables in MySQL database
echo "------------------------------------------------------------------------------"
echo "creating respective database in hive database"

#############

hive -e "create database customer1";


# creating the table under the database	and load the data from Mysql table to table 
echo "-------------------------------------------------------------"
echo  "Create table customer uder database customer1 and load data from mysql"   
sqoop import --connect jdbc:mysql://quickstart.cloudera:3306/Customer --username root --password cloudera --split-by Member_id --columns Member_ID,ZIP_CODE,ADRESS_state,BIRTH_DATE,GENDER  --table Customer  --target-dir /user/cloudera/pda_project/Processed_Mysql_data --fields-terminated-by "," --hive-import --create-hive-table --hive-table customer1.customer

