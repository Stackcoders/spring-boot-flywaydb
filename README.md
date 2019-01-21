### Prerequisites

- Java 8
- Maven 3.X.X
- Mysql 5.X.X


### Steps to Clone the project
1. Clone the application

git clone https://github.com/Stackcoders/spring-boot-flywaydb.git

### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.

### Flyway 

 1. The following format should be used while naming :  V{Version_number}__{script_name}.sql.
 2. Sql file should kept under src\main\resources\db\migration\primary directory,must use a higher version than the current version
 
 
### MySql Database

1.	Create Mysql database(flywaydemo)
2.  Change mysql username and password as per your DB configuration

Change the DB Url, port , username and password accordingly in application.yml file.

### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run
	
### Build & Run the app using maven

cd spring-boot-flywaydb

mvn clean

mvn install

java -jar target/flyway-db-management-1.0.jar

	
   
