# Spring Data Rest:

With using Spring Data Rest we can write code without controllers and services, using only:

public interface EmployeeRepository extends JpaRepository<Employee _<-Our Entity_, Integer> {}

# Most common Spring Boot Actuators:
/actuator/health
/actuator/info
/actuator/beans
/actuator/mappings

Using Spring Security to generate password for access or type in application.properties:

spring.security.user.name = _username_
spring.security.user.password = _password_