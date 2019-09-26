-- Create table Geo_location
use Olist;
CREATE TABLE Olist.geo_location 
(
UID varchar(50) COLLATE utf8_unicode_ci,geolocation_zip_code_prefix varchar(50) COLLATE utf8_unicode_ci, geolocation_lat varchar(50) COLLATE utf8_unicode_ci, 
geolocation_lng varchar(50) COLLATE utf8_unicode_ci, geolocation_city varchar(50) COLLATE utf8_unicode_ci, 
geolocation_state varchar(50) COLLATE utf8_unicode_ci);
