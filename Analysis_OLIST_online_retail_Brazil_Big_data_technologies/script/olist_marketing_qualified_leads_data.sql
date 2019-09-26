LOAD DATA INFILE "/home/cloudera/PDA_PROJECT_OLIST/PROCESSED/m_olist_marketing_qualified_leads_dataset.csv" INTO TABLE Olist.olist_marketing_qualified_leads COLUMNS TERMINATED BY ','
OPTIONALLY ENCLOSED BY '"' ESCAPED BY '"' LINES TERMINATED BY '\n' IGNORE 1 LINES;
