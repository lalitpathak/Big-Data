
#---------------------------------------------------------------------------------
# Title : map_reducefilter.sh
# Description:Exesting file contain data from 2016-2018 and this mapreduce jar file
#             select the data for year 2018 and remove all other data               
#---------------------------------------------------------------------------------

#Create folder structure on HDFS and copyinput files from local file system

echo "-----------Creating folder structure on HDFS----------------"
HDFS_SOURCE_PATH=/user/cloudera/PDA_PROJECT_OLIST/MAP_REDUCE_INPUT
HDFS_TARGET_PATH=/user/cloudera/PDA_PROJECT_OLIST/MAP_REDUCE_OUTPUT
LOCAL_SOURCE_PATH='/home/cloudera/PDA_PROJECT_OLIST/PROCESSED'
HADDOP_PATH='/usr/lib/hadoop'

JAR=/home/cloudera/PDA_PROJECT_OLIST/Filter.jar
CLASS=FilteringDriver

#Create folder structure on HDFS and copyinput files from local file system
hdfs dfs -mkdir -p ${HDFS_SOURCE_PATH}

echo "-----------Folders created On HDFS -------------------------"

echo "------Copying local file to HDFS directory------------------"
hdfs dfs -put ${LOCAL_SOURCE_PATH}/h_orders_data.csv ${HDFS_SOURCE_PATH}

echo "-----Giving read and write permissions to copied file-------"
hdfs dfs -chmod -R 777 ${HDFS_SOURCE_PATH}/*

echo "-----Delete output if exist----------------------------------"
#NOTE: If the output folder exists Hadoop stops with error
hdfs dfs -rm -r ${HDFS_TARGET_PATH}


echo "------ Executing MapReduce Jar------------------------------"
hadoop jar ${JAR} ${CLASS} ${HDFS_SOURCE_PATH} ${HDFS_TARGET_PATH}


