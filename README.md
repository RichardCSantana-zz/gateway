#Gateway

##Introduction

   A sample of spring zuul-gateway ready to run standalone or at a Docker environment.
   Depends on a configserver and eureka.

##Running 

###Using spring-boot maven plugin:

* On Windows:

```
mvnw.cmd spring-boot:run -Dspring.cloud.config.uri=<config_repo>
```

* On Linux/MacOS:

```
./mvnw spring-boot:run -Dspring.cloud.config.uri=<config_repo>
```

###Using compiled version:

####Compile:
  * On Windows:

```
mvnw.cmd clean package
```

  * On Linux/MacOS:

```
./mvnw clean package
```

####Run:

```
java -jar target/configserver-0.0.1-SNAPSHOT.jar --spring.cloud.config.uri=<config_repo>
```

###Build on Docker:

####Compile:
  * On Windows:

```
mvnw.cmd clean package docker:build
```

  * On Linux/MacOS:

```
./mvnw clean package docker:build
```