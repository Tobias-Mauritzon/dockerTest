FROM openjdk:16-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-test.jar
ENTRYPOINT ["java","-jar","/spring-test.jar"]
