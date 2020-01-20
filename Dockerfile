FROM openjdk:8-jdk-alpine
EXPOSE 8081
WORKDIR /app
COPY target/raabbitmq-receiver-part-0.0.1-SNAPSHOT.jar .
ENTRYPOINT [ "java", "-jar", "raabbitmq-receiver-part-0.0.1-SNAPSHOT.jar" ]
