# tenant
Tenant challenge - springboot + springcloud

# Pre requisites

  - Java JDK17
  - Maven
  - Docker
  - Postman

# Modules in folder

This project contains these components according with Springcloud reference architecture

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

About POM, consider best example in Movies microservice. It considers
1. Springboot starter data jpa
2. Springboot starter web
3. Flyway
4. Mapstruct
5. Eureka discovery client

About POM in Springcloud components, it considers
1. Springcloud parent version
2. Gateway dependency
3. Eureka discovery server

# Instructions

1. each component require build using maven. Follow this instruction and run into the root for each module

```bash
maven clean install
```

after this, /target folder for each module is going to contain *.jar file generated for each component (including springcloud ones, not only microservices)

# Database creation
Please, create database using service database in docker-compose. This is going to enable database based on Postgresql

1. Connect to image console using terminal or IDE
2. Execute commands

To connect with postgres user
```bash
su - postgres
```
To start psql
```bash
psql
```
To verify database is not created
```bash
\l
```
Result is going to look similar to this. No tenant_test created
postgres  | postgres | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           |
template0 | postgres | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           | =c/postgres          +
|          |          |                 |            |            |            |           | postgres=CTc/postgres
template1 | postgres | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           | =c/postgres          +
|          |          |                 |            |            |            |           | postgres=CTc/postgres

To create database use this command
```bash
CREATE DATABASE tenant_test;
```

If you repeat previous step, you are going to see tenant_test in the list of databases created.

# Run environment completly
1. Execute docker-compose.yml file that is allocated in tenant folder root.

```bash
docker compose up
```
# Postman collection

A postman collection is available in root folder

