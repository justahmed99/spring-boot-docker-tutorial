FROM openjdk:17-oracle
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/spring-docker-demo-0.0.1-SNAPSHOT.jar /app/example.jar
ENTRYPOINT ["java", "-jar", "/app/example.jar"]