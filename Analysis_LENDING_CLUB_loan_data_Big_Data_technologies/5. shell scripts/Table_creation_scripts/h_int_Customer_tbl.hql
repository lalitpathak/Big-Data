create Database Customer; 	

use Customer;

CREATE TABLE Customer (Member_ID int,
ZIP_CODE string,
ADRESS_state string,
BIRTH_DATE string,
GENDER string);
LOAD DATA INPATH '/home/cloudera/Source/Customer.csv' INTO table Customer;
