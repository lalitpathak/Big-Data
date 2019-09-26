# Big-Data-using-Hadoop-Ecosystem

## 1. B2B and B2C analysis for Olist using HBase, MapReduce, MySQL, Pig and Hive

Objective : Implementing and analyzing power of big data technologies in Retail industry to define the business strategies
• Olist is a large department store within the marketplace in Brazil.
• Outline of the project is to provide a report to make business strategies for B2B and B2C model team of Olist
• This project uses big data technologies to identify trend, pattern, and impact of location on sales

*Tools and technology* : 
Distributed data processing environment: Hadoop,
Hadoop ecosystem component: HDFS, Yarn, Sqoop, Hadoop MapReduce
Databases: MySQL, HBase, Hive
Programming language: R, Shell Scripting,
Reporting tool : Tableau

### Documents :

Project_report.docx --- Overall project Report including Architecture, Methodlogy and Result  
Olist_Business_model.jpg  -- understanding of Olist business in brazil.
DATA_SCHEMA.png 
SCRIPT_EXECUTION_SEQUENCE1,2.Png -- This includes script exection flow,Functionality of scripts and output of script.  


### CODE :

1. INPUT -- This folder contains B2C and B2B dataset downloaded from kaggel 
     B2C -- https://kaggle.com/olistbr/brazilian-ecommerce
     B2B -- https://kaggle.com/olistbr/marketing-funnel-olist
2. PROCESSED -- Header and ‘ “ ” ’ removed from the input file and created new files with m_ prefix for loading data into Mysql and “h_” to load data into Hive tables.
3. HDFS_DATA -- Data present in HDFS for processing.  
        MAP_REDUCE_INPUT -- Input to the Jar files created from the eclips.
        MAP_REDUCE_OUTPUT -- Processed output of JAR files
        PROCESSED --  Hive exteranl tables directory 
        Pig_Query -- Pig Analysis scripts directory
        Pig_output -- Pig analysis script output directory
        view_result -- Result of the Hive View stored in this directory 
4. Script -- 1.  Script directory which includes masters script. Master script is combination of 
             /pre_processing.sh 
             /Mysql.sh   
             /Sqoop.sh   
             /map_reducefilter.sh 
             /hive_table_creation.sh 
             /hive_view_creation.sh 
             /hive_view_result.sh 
             /pig.sh
             /hbase_table_cre.sh 
             /hbase_table_data_load.sh 
  #### *All above scripts auotomate Data manupulation, Data processing, DDL creation, Table creation according to the DDL in MYSQL, hive and hbase database, Creation of Hive views, pig scripts for analysis, and finally loading analyzed data into Hbase tables.* 
  
  5.Tableau : Insights of each usecase.
  

## 2. Analysis_LENDING_CLUB_loan_data_Big_Data_technologies
  
  Objective:

  • Project is to carry out a series of analyses for lending club which is a US peer-to-peer lending company providing the platform for     the investors and borrowers. <br />
  • Analysis has been carried out on the data set which includes complete loan data for all loans issued through the 2007-2015,
    including the current loan status (Current, Late, Fully Paid, etc.) and latest payment information.  <br />
    
   *Tools and technology :*
   Distributed data processing environment: Hadoop MapReduce
   Hadoop ecosystem component: HDFS, Hive, Yarn, Sqoop
   Databases: MySQL, HBase
   Programming language: R, Shell Scripting,
   Reporting tool : Tableau
    
## Documents :
Project_Report.pdf -- Overall project Report including Architecture, Methodlogy and Result
Projet flow diagram 

## Code : 
1. Raw Files : Landing club load dataset.
2. Processed Data :Header and ‘ “ ” ’ removed from the input file and created new files with m_ prefix for loading data into Mysql and      “h_” to load data into Hive tables.
3. Java Project and jar file : Includes Java Project and Jar Files. 
4. shell scripts : 
#### *All above scripts auotomate Data manupulation, Data processing, DDL creation, Table creation according to the  DDL in MYSQL, hive and hbase database, Creation of Hive views, pig scripts for analysis, and finally loading analyzed data into Hbase tables.*
5. Screenshot : Execution Screenshot 
6. logs  : Log files 
7. Tableau : Tableau : Insights of each usecase.   
