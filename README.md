# Big-Data-using-Hadoop-Ecosystem

## 1. B2B and B2C analysis for Olist using HBase, MapReduce, MySQL, Pig and Hive

Objective : Implementing and analyzing power of big data technologies in Retail industry to define the business strategies
• Olist is a large department store within the marketplace in Brazil.
• Outline of the project is to provide a report to make business strategies for B2B and B2C model team of Olist
• This project uses big data technologies to identify trend, pattern, and impact of location on sales <br />

*Tools and technology* : <br />
Distributed data processing environment: Hadoop, <br />
Hadoop ecosystem component: HDFS, Yarn, Sqoop, Hadoop MapReduce <br />
Databases: MySQL, HBase, Hive <br />
Programming language: R, Shell Scripting, <br />
Reporting tool : Tableau <br />

### Documents : <br />

Project_report.docx --- Overall project Report including Architecture, Methodlogy and Result <br />  
Olist_Business_model.jpg  -- understanding of Olist business in brazil. <br />
DATA_SCHEMA.png  <br />
SCRIPT_EXECUTION_SEQUENCE1,2.Png -- This includes script exection flow,Functionality of scripts and output of script.<br />  


### CODE :

1. INPUT -- This folder contains B2C and B2B dataset downloaded from kaggel <br /> 
     B2C -- https://kaggle.com/olistbr/brazilian-ecommerce <br />
     B2B -- https://kaggle.com/olistbr/marketing-funnel-olist <br />
2. PROCESSED -- Header and ‘ “ ” ’ removed from the input file and created new files with m_ prefix for loading data into Mysql and “h_” to load data into Hive tables. <br />
3. HDFS_DATA -- Data present in HDFS for processing. <br />  
        MAP_REDUCE_INPUT -- Input to the Jar files created from the eclips. <br />
        MAP_REDUCE_OUTPUT -- Processed output of JAR files <br />
        PROCESSED --  Hive exteranl tables directory  <br />
        Pig_Query -- Pig Analysis scripts directory <br /> 
        Pig_output -- Pig analysis script output directory <br />
        view_result -- Result of the Hive View stored in this directory <br /> 
4. Script -- 1.  Script directory which includes masters script. Master script is combination of <br /> 
             /pre_processing.sh  <br />
             /Mysql.sh    <br />
             /Sqoop.sh   <br />
             /map_reducefilter.sh <br /> 
             /hive_table_creation.sh  <br />
             /hive_view_creation.sh <br />
             /hive_view_result.sh <br />
             /pig.sh <br />
             /hbase_table_cre.sh <br /> 
             /hbase_table_data_load.sh  <br />
  #### *All above scripts auotomate Data manupulation, Data processing, DDL creation, Table creation according to the DDL in MYSQL, hive and hbase database, Creation of Hive views, pig scripts for analysis, and finally loading analyzed data into Hbase tables.* 
  
  5.Tableau : Insights of each usecase. <br />
  

## 2. Analysis_LENDING_CLUB_loan_data_Big_Data_technologies
  
  Objective:

  • Project is to carry out a series of analyses for lending club which is a US peer-to-peer lending company providing the platform for     the investors and borrowers. <br />
  • Analysis has been carried out on the data set which includes complete loan data for all loans issued through the 2007-2015,
    including the current loan status (Current, Late, Fully Paid, etc.) and latest payment information.  <br />
    
   *Tools and technology :* <br />
   Distributed data processing environment: Hadoop MapReduce <br /> 
   Hadoop ecosystem component: HDFS, Hive, Yarn, Sqoop <br />
   Databases: MySQL, HBase <br />
   Programming language: R, Shell Scripting, <br />
   Reporting tool : Tableau <br />
    
## Documents : <br />
Project_Report.pdf -- Overall project Report including Architecture, Methodlogy and Result
Projet flow diagram  <br />

## Code : 
1. Raw Files : Landing club load dataset. <br />
2. Processed Data :Header and ‘ “ ” ’ removed from the input file and created new files with m_ prefix for loading data into Mysql and      “h_” to load data into Hive tables. <br />
3. Java Project and jar file : Includes Java Project and Jar Files. <br /> 
4. shell scripts :  <br />
#### *All above scripts auotomate Data manupulation, Data processing, DDL creation, Table creation according to the  DDL in MYSQL, hive and hbase database, Creation of Hive views, pig scripts for analysis, and finally loading analyzed data into Hbase tables.*
5. Screenshot : Execution Screenshot <br /> 
6. logs  : Log files  <br />
7. Tableau : Tableau : Insights of each usecase. <br />   
