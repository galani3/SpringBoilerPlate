# Spring Boiler Plate Code
###### Boiler plate code to setup Spring with mySQL database 
1) Create database locally or somewhere else
2) Hookup database inside properties file
    ```ruby
    spring.jpa.hibernate.ddl-auto=update
    spring.datasource.url=jdbc:mysql://localhost:3306/database_name?useSSL=false
    spring.datasource.username=user
    spring.datasource.password=password
    ```
3) Check if spring is able to create a table and pull data
4) Done!
:
