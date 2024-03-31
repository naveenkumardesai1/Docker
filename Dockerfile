FROM openjdk:17
WORKDIR /app
COPY target/demo-1.0.0.jar /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo-1.0.0.jar"]
