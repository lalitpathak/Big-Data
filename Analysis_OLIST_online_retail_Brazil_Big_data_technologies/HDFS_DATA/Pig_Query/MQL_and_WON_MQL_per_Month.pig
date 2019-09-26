olist_marketing_qualified_leads = LOAD 'olist.olist_marketing_qualified_leads' USING org.apache.hive.hcatalog.pig.HCatLoader();
DUMP olist_marketing_qualified_leads;
month_group = GROUP olist_marketing_qualified_leads BY month;
output_record = FOREACH month_group GENERATE group,COUNT(olist_marketing_qualified_leads.mql_id);
DUMP output_record;
store output_record into '/home/cloudera/PDA_PROJECT_OLIST/Pig_output/NO_of_MQL_per_Month';


closed_deals = LOAD 'olist.closed_deals' USING org.apache.hive.hcatalog.pig.HCatLoader();
DUMP closed_deals;
month_group = GROUP closed_deals BY month;
won_output_record = FOREACH month_group GENERATE group,COUNT(closed_deals.mql_id);
DUMP won_output_record;
store won_output_record into '/home/cloudera/PDA_PROJECT_OLIST/Pig_output/NO_of_WON_MQL_per_Month';
