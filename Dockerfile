FROM amazoncorretto:17-alpine-jdk
MAINTAINER adweb7
COPY target/ad-0.0.1-SNAPSHOT.jar ad-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ad-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080