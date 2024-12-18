FROM openjdk:17-jdk

LABEL authors="VuHSO"

WORKDIR /app

COPY target/department_service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]