FROM amazoncorretto:17-alpine-jdk
MAINTAINER ad
COPY target/ad-0.0.1-SNAPSHOT.jar ad-app.jar
ENTRYPOINT ["java","-jar","/ad-app.jar"]
EXPOSE 8080