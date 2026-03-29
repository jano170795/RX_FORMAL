FROM eclipse-temurin:17-jdk-alpine
ARG JAR_FILE=target/roxia_pricer-0.0.1.jar
COPY ${JAR_FILE} app_roxia.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app_roxia.jar"]