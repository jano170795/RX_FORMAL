# ETAPA 1: Compilación (Build)
# Usamos una imagen de Maven para compilar el código fuente
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app

# Copiamos el archivo de configuración y el código fuente de tu carpeta /roxia
COPY pom.xml .
COPY src ./src

# Ejecutamos la compilación dentro de Render
RUN mvn clean package -DskipTests

# ETAPA 2: Ejecución (Runtime)
# Usamos una imagen ligera de Java para correr la app
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copiamos el JAR generado en la etapa anterior (Etapa Build)
# El nombre debe coincidir con el de tu error: roxia_pricer-0.0.1.jar
COPY --from=build /app/target/roxia_pricer-0.0.1.jar app.jar

# Configuración de memoria para el plan gratuito de Render (512MB)
ENV JAVA_TOOL_OPTIONS="-Xmx300m -Xss512k"

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]	