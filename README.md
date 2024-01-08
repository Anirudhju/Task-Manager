# Task-Manager
This is a simple Spring Boot application that provides CRUD operations for managing tasks. The application uses MySQL as its relational database.

Open the project in your IDE.

Create a database in MySQL and access it using MySQL Workbench.

Configure the database connection in src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/my_tasks
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

Replace your_db_username, and your_db_password with your MySQL database details.

Run the Spring Boot application.

Open Postman.

Use the following URLs for testing:

GET All Tasks: http://localhost:8080/mytasks (GET)
GET Task by ID: http://localhost:8080/mytasks/{id} (GET)
Create Task: http://localhost:8080/mytasks (POST)
Update Task: http://localhost:8080/mytasks/{id} (PUT)
Delete Task: http://localhost:8080/mytasks/{id} (DELETE)
Replace {id} with the actual task ID.

Send requests and observe the responses.

Database Access

Use MySQL Workbench or any MySQL client to access the database. The database details can be found in the application.properties file.
