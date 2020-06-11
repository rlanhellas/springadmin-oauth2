## SBA and OAuth2 to protect Login page
This demo shows how to create a login page in SBA (Spring Boot Admin) using OpenID Connect with 
Keycloak as a provider. 

**1. Starting Keycloak**

All you need to start Keycloak is inside `keycloak/docker-compose.yml` file, just type `docker-compose up` and have fun.

**2. Starting SBA**

To start app just change the values in `application.properties` file and access application in http://localhost:8080.

**Important:** This demo don't use the new Spring Security 5 yet, just Spring OAuth2 project. 




Enjoy !!
