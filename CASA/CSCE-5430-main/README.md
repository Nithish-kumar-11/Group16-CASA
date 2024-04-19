# csce5430
compile with mvn package
run with java -jar target/csce5200-1.0.jar
You will need this DB created within the mysql schema
CREATE TABLE `property` (
  `ML_ID` int DEFAULT NULL,
  `Address` text,
  `Subdivision_Name` text,
  `SqFt` text,
  `Beds_Total` int DEFAULT NULL,
  `Bath_Total` int DEFAULT NULL,
  `Current_Price` text,
  `property_description` text,
  `full_address` text,
  `id` varchar(255) NOT NULL,
  `mls_id` varchar(255) DEFAULT NULL,
  `sq_ft` varchar(255) DEFAULT NULL,
  FULLTEXT KEY `property_description` (`property_description`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
DB connnection and configurations are
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/csce5200_db
spring.datasource.username=csce5200
spring.datasource.password=csce5200