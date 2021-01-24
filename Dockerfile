FROM openjdk:9-jdk-alpine
VOLUME /tmp
ADD target/springboot-backend-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
