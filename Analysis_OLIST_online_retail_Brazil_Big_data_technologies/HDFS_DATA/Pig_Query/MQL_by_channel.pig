olist_marketing_qualified_leads = LOAD 'olist.olist_marketing_qualified_leads' USING org.apache.hive.hcatalog.pig.HCatLoader();
DUMP olist_marketing_qualified_leads;
origin_group = GROUP olist_marketing_qualified_leads BY origin;
origin_output_record = FOREACH origin_group GENERATE group,COUNT(olist_marketing_qualified_leads.mql_id);
DUMP origin_output_record;
store origin_output_record into '/home/cloudera/PDA_PROJECT_OLIST/Pig_output/NO_of_MQL_origin';
