#                               GROUP 16 - CASA
      
### TEAM MEMBERS:
Pavan Narasimha Krishna Nimmagadda – 11697708

Nithish Kumar Boggula – 11559328

Sai Swathi Paruchuri – 11654469

Fayaz Mohammad – 11717399



## Introduction

CASA is a house and apartment search application designed to simplify the process of finding your dream home. One of the key challenges we addressed in developing CASA was enabling users to search unstructured property data in natural language and receive meaningful search results containing homes that match their preferences.

For example, consider the following unstructured property data:
"This is a beautiful 5 bedroom 4 bathroom house for sale in the city of Carrollton in zip code 75007 with the primary bedroom on the first floor."

Assuming that the property description contains valid and accurate data.The user should be able to search with a search query like this.
I am looking for a 5 bed 4 bath house of sale in Carrollton with master bed on ground floor


CASA's intelligent search system parses and understands such natural language queries, allowing users to search for homes based on specific criteria like the number of bedrooms, bathrooms, location, and features. By leveraging advanced algorithms, CASA delivers accurate and relevant search results, helping users find homes that meet their unique preferences and needs.


## Features

1. **Ability to search:** Users can search for homes based on specific criteria such as number of bedrooms, bathrooms, location, and features. CASA's intelligent search system parses natural language queries to deliver accurate and relevant search results.

2. **Show the homes in Google Maps:** CASA provides an integrated Google Maps feature that displays the location of homes listed in the search results. Users can visualize the geographical distribution of available homes and explore their surroundings directly within the application.

3. **Ease of Access:** Many UI changes are made to the homepage to make it more Intuitive and with subtle animations.

   •	Glowing Search bar indicating the power of the natural language search

   •	Making the search process much simpler and without the need for annoying checkboxes or cluttered UI which needs some familiarity to get started.


## Installation

To install and deploy the project, follow these steps:

1. Clone the repository: `git clone https://github.com/Nithish-kumar-11/Group16-CASA.git`
2. Navigate to the project directory: `cd Group16-CASA`
3. Create the database: `CREATE DATABASE csce5430_db;`
4. Create a user with username and password: `CREATE USER 'local_user'@'localhost' IDENTIFIED BY 'password';`
5. Build the project: `gradle build`
6. Run the project: `gradle run`


## Screenshots


### GitHub Repo

![Feature 1](../Screenshots/Git page.png)


### Project Structure

![Feature 2](../Screenshots/Main_src_java_file.png)

### Project 

![](../Screenshots/1.png)


![](../Screenshots/2.png)


![](../Screenshots/3.png)


![](../Screenshots/4.png)


![](../Screenshots/5.png)


![](../Screenshots/6.png)


### Home Page

![Feature 3](../Screenshots/home%20page.png)

### Search

![Feature 4](../Screenshots/search%20query%20.png)

### Result Page

![Feature 4](../Screenshots/Location_Preview.png)

### Database

You will need this DB created within the mysql schema
CREATE TABLE ⁠ property ⁠ (
⁠ ML_ID ⁠ int DEFAULT NULL,
⁠ Address ⁠ text,
⁠ Subdivision_Name ⁠ text,
⁠ SqFt ⁠ text,
⁠ Beds_Total ⁠ int DEFAULT NULL,
⁠ Bath_Total ⁠ int DEFAULT NULL,
⁠ Current_Price ⁠ text,
⁠ property_description ⁠ text,
⁠ full_address ⁠ text,
⁠ id ⁠ varchar(255) NOT NULL,
⁠ mls_id ⁠ varchar(255) DEFAULT NULL,
⁠ sq_ft ⁠ varchar(255) DEFAULT NULL,
FULLTEXT KEY ⁠ property_description ⁠ (⁠ property_description ⁠)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
DB connnection and configurations are
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/csce5200_db
spring.datasource.username=your user name
spring.datasource.password=your pass

![Screenshot 2024-04-18 232923.png](..%2FScreenshots%2FScreenshot%202024-04-18%20232923.png)
![Screenshot 2024-04-18 232956.png](..%2FScreenshots%2FScreenshot%202024-04-18%20232956.png)
![Screenshot 2024-04-18 233010.png](..%2FScreenshots%2FScreenshot%202024-04-18%20233010.png)

[eclipse-workspace - Eclipse IDE 2024-04-18 23-05-40.mp4](..%2FScreenshots%2Feclipse-workspace%20-%20Eclipse%20IDE%202024-04-18%2023-05-40.mp4)