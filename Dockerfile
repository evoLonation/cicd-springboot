FROM eclipse-temurin:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY target/Project-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]