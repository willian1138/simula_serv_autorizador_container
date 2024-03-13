# Use a imagem base do OpenJDK 17
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho
WORKDIR /app

# Copia o arquivo JAR para o diretório de trabalho
COPY target/*.jar app.jar

# Executa o aplicativo Java durante a execução do contêiner
CMD ["java", "-jar", "app.jar"]