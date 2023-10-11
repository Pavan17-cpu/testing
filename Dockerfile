FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/JFSD_LAB-0.0.1-SNAPSHOT.jar JFSD_LAB.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","JFSD_LAB.jar"]