FROM openjdk:18.0.2.1-jdk
WORKDIR /app

COPY ./target/springboot-discorvery-service-0.0.1-SNAPSHOT.jar .

EXPOSE 8671

ENTRYPOINT ["java", "-jar","springboot-discorvery-service-0.0.1-SNAPSHOT.jar"]