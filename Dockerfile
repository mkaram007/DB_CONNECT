FROM registry.access.redhat.com/ubi8/openjdk-17:1.20-2.1727147539
COPY target/*.war /app.war
ENTRYPOINT java -jar /app.war --spring.config.location=file:////workspace/config/application.properties
