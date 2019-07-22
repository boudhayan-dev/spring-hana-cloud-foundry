# Spring-Hana-Cloud-Foundry

This is a sample spring boot application that makes use of SAP HANA Service on SAP Cloud Platform (Cloud Foundry).
The accompanying blog series talks about the configuration needed on the SCP side.

* PART 1 - [Developing the application](https://blogs.sap.com/2019/07/22/develop-a-spring-boot-java-application-with-hana-database-on-sap-cloud-platform-cloud-foundry-part-1/)
    
* PART 2 - [Creating HANA instance and configuration](https://blogs.sap.com/2019/07/22/develop-a-spring-boot-java-application-with-hana-database-on-sap-cloud-platform-cloud-foundry-part-2/)
    
* PART 3 - [Deployment and Test](https://blogs.sap.com/2019/07/22/develop-a-spring-boot-java-application-with-hana-database-on-sap-cloud-platform-cloud-foundry-part-3/)


### Requirements 
* [spring-cloud-cloudfoundry-hana-service-connector](https://github.com/SAP/spring-cloud-sap) - Used for making the connection with HANA db on cloud.
* [ngdbc](https://mvnrepository.com/artifact/com.sap.cloud.db.jdbc/ngdbc) - SAP HANA JDBC driver.

### Installation
* Clone repo -

    ```
    git clone https://github.com/boudhayan-dev/spring-hana-cloud-foundry
    ```
* For local -

    ```
    mvn clean install -P local
    ```
    * Run the app -
    ```
    java -jar target/spring-hana-cloud-foundry-0.0.1-SNAPSHOT.war
    ```
* For Cloud Foundry -

    ```
    mvn clean install -P cf
    ```
    * Deploy the app -
    ```
    cf push
    ```

### Test
To test the application, use the following routes -


| METHOD        | ROUTE                 | DESCRIPTION               |
|:--------------|:----------------------|:--------------------------|
| **`GET`**     |`/employee/count`      | Count of total employees  |
| **`GET`**     |`/employee/all`        | Returns all employees     |
| **`GET`**     |`/employee/id/{id}`    | Returns employee with id  |
| **`POST`**    |`/employee/add`        | Add new employee          |
| **`DELETE`**  |`/employee/delete/{id}`| Delete employee with id   |


