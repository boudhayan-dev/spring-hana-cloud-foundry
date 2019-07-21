# Spring-Hana-Cloud-Foundry

This is a sample spring boot application that makes use of SAP HANA Service on SAP Cloud Platform (Cloud Foundry).

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


