# Build stage
FROM maven:3.9.8-eclipse-temurin-21 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# Run stage
FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY --from=build /app/target/studenthub-1.0.0.jar app.jar

EXPOSE 8000

ENTRYPOINT ["java","-jar","app.jar"]
