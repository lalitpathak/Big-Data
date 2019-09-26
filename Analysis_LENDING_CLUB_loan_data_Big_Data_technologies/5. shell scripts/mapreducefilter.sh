#---------------------------------------------------------------------------------
# Title : map_reducefilter.sh
# Description:Exesting file contain data from 2007-2018 and this mapreduce jar file
#             select the data for year 2018 and remove all other data               
#---------------------------------------------------------------------------------

#Create folder structure on HDFS and copyinput files from local file system

HDFS_SOURCE_PATH=/user/cloudera/pda_project/source
HDFS_TARGET_PATH=/user/cloudera/pda_project/Processed/
LOCAL_SOURCE_PATH='/home/cloudera/Source/Loan_data'
HADDOP_PATH='/usr/lib/hadoop'

JAR=/home/cloudera/jar/Final_PDA.jar
CLASS=Driver1

#Create folder structure on HDFS and copyinput files from local file system
hdfs dfs -mkdir -p ${HDFS_SOURCE_PATH}

# Copying local file to HDFS directory
hdfs dfs -put ${LOCAL_SOURCE_PATH}/h_loandata.csv ${HDFS_SOURCE_PATH}

# giving read and write permissions to copied file
hdfs dfs -chmod -R 777 ${HDFS_SOURCE_PATH}/*

#Delete output if exist
#NOTE: If the output folder exists Hadoop stops with error
hdfs dfs -rm -r ${HDFS_TARGET_PATH}

# Executing MapReduce Jar
hadoop jar ${JAR} ${CLASS} ${HDFS_SOURCE_PATH} ${HDFS_TARGET_PATH}



