#-------------------------------------------------------------------------------------
# Name : Pre_Processing.sh 
# Discription : This script remove the header and '"' from the two files.  
#               These files then used with Mysql and Mapreduce.
#---------------------------------------------------------------------------------------

# SCRIPT_PATH ='/home/cloudera/Script'

# Preparing files for MySQL database

# using 'sed' to remove '"' and first line
# storing files with 'm_' prefix
echo "------------------------------------------------------------------------------"
echo "preparing files for MySQL database"
sed 's/["]//g' '/home/cloudera/raw_file/Customer.csv' >'/home/cloudera/Source/Customer/m_Customer.csv'
sed -i -n -e '2,$p' '/home/cloudera/Source/Customer/m_Customer.csv'

# preparing files for Mapreduce
# Using 'sed' to remove '"'
# Storing files with 'h_' prefix

echo "------------------------------------------------------------------------------"
echo "preparing files for Hive database"
sed 's/["]//g' '/home/cloudera/raw_file/loandata.csv' > '/home/cloudera/Source/Loan_data/h_loandata.csv'
sed -i -n -e '2,$p' '/home/cloudera/Source/Loan_data/h_loandata.csv'

