# Amason

To execute this project you need Java 22 and Maven with the latest version. Addittionaly you need MySQL to create the database.

## Running the project

### Configuring the `application.properties` file

The file should to be like this:

```
spring.application.name=amason
server.port=8080
server.servlet.context-path=/api/v1
# database configuration
spring.datasource.url=jdbc:mysql://localhost:{{port_of_mysql_server}}/{{database}}
spring.datasource.username=root
spring.datasource.password={{password}}
```

### Running it from the terminal

Just run `mvn spring-boot:run` to execute the project.
