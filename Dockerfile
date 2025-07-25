# Start from Maven image to build
FROM maven:3.9.6-eclipse-temurin-17 AS builder

# Set working dir and copy the project
WORKDIR /app
COPY . .

# Build the Spring Boot app
RUN mvn clean package -DskipTests

# Now use JDK base image to run only the JAR
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy the built jar
COPY --from=builder /app/target/*.jar app.jar

# Expose the port your app runs on
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]