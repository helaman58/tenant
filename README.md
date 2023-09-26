# tenant
Tenant challenge - springboot + springcloud

# Pre requisites
-Java JDK17
-Maven
-Docker

# Modules in folder
This project contains these components
-Eureka. Used as a component for service descovery
-Gateway. API gateway using Gateway - Springcloud using Eureka reoutes. Is not going to contain manually routes, instead is automatic
-Movies. Microservice created using Springboot integrated against database to retrieve movies and its relationships according with business rules
-Autors. Microservice created using Springboot
-Users. Microservice created using Springboot

# Microservices scaffolding

Each microservice follows this structure
src/main/java
  -controller - HTTP Architecture exposed to support HTTP Methods and REST APIs handler for each one
  -service - Layer oriented to contain business logic.
  -repository - Layer oriented to exchange information with third parties and data components/repositories like databases 
src/main/resources
  -application.yml - config file with url to connect with Eureka, databases and other resources

# Instructions
1. each component require build using maven. Follow this instruction and run into the root for each module

maven clean install

after this, /target folder for each module is going to contain *.jar file generated for each component (including springcloud ones, not only microservices)

3. Execute docker-compose.yml file that is allocated in tenant folder root.

docker compose up

