# ETAPA 1: Compilación
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copiamos solo el pom primero para aprovechar el cache de Docker
COPY pom.xml .
COPY src ./src

# Compilamos
RUN mvn clean package -DskipTests

# ETAPA 2: Ejecución
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copiamos el JAR (asegúrate que el nombre sea el correcto según tu pom.xml)
COPY --from=build /app/target/roxia_pricer-0.0.1.jar app.jar

# Configuración de memoria para Render Free Tier
ENV JAVA_TOOL_OPTIONS="-Xmx300m -Xss512k"

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]