#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim as build

#Information around who maintains the image
MAINTAINER atishdixit@gmail.com

EXPOSE 8000

# Add the application's jar to the container
COPY target/ecs-demo-0.0.1-SNAPSHOT.jar ecs-app.jar

#execute the application
ENTRYPOINT ["java","-jar","/ecs-app.jar"]