################## Sqoop ########################################################
# Title : hive_view_Creation
# Description : Hql is used to create Hive views
#               To reduce the complexity and to aviod creation of table for each query
#               hive view is created.     
#################################################################################

echo "------------------------------------------------------------------------------"

echo "-------- Brazellian_States_With_Most_number_of_Orders_and_payment.sh-----------"

hive -e "Create view if not exists olist.view_Brazellian_States_With_Most_number_of_Orders_and_payment as
select count(order_id),customer_state,sum(payment_value) from
(
select a.order_id, b.customer_state, c.payment_value from olist.Orders a
inner join olist.customer b
on a.customer_id = b.customer_id
inner join olist.payment c
on a.order_id = c.order_id
)d
group by d.customer_state;"

echo "---------avergae_order_value.sh----------------------------------------------"

hive -e "Create view if not exists olist.view_avergae_order_value as
select avg(payment_value) from olist.payment;"



echo "-------------average_order_value_month.sh-------------------------------------"

hive -e "Create view if not exists olist.view_average_order_value_month as
select avg(a.payment_value),b.Month from olist.payment a
inner join olist.orders b on a.order_id = b.order_id where b.year='2017' group by b.Month"



echo "-------------average_order_value_year.sh-------------------------------------"

hive -e "Create view if not exists olist.view_average_order_value_year as
select avg(a.payment_value),b.year from olist.payment a
inner join olist.orders b on a.order_id = b.order_id group by b.year" 

echo "--------------Busiest_Hrs.sh-------------------------------------------------"

hive -e "Create view if not exists olist.view_Busiest_Hrs as
select count(order_id),Hrs,year from  olist.orders group by Hrs,year;"


echo "----------------Category_count.sh--------------------------------------------"

hive -e "Create view if not exists olist.view_Category_count as
select count(a.product_id), b.product_category_name,c.product_category_name_english from olist.order_item a
inner join (select distinct product_id,product_category_name from olist.product) b
on a.product_id = b.product_id
inner join olist.products_category c
on  b.product_category_name = c.product_category_name group by b.product_category_name,c.product_category_name_english ;"

echo "-------------------views created--------------------------------------------" 
