# Use an official Maven image as a parent image
FROM maven:latest

# Set metadata information
LABEL authors="peeturasanen"

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml file to the container
COPY pom.xml /app/

# Copy the entire project to the container
COPY . /app/

# Package your application
RUN mvn package

# Run the main class with command-line arguments for distance and speed
CMD ["java", "-jar", "target/TimeCalculator.jar", "100", "50"]