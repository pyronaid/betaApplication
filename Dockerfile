#
#   BuildStage
#
FROM  maven:3.8.6-openjdk-18 AS build
COPY src /home/app/src
COPY pom.xml /home/app/pom.xml
RUN mvn -f /home/app/pom.xml clean package

#
#   PackageStage
#
FROM openjdk:15.0.2
COPY --from=build /home/app/target/betaApplication-0.0.1-SNAPSHOT.jar /urs/local/lib/betaApplication-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/urs/local/lib/betaApplication-0.0.1-SNAPSHOT.jar"]
