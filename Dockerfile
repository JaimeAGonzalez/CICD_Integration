FROM openjdk:17-alpine
EXPOSE 8081
ADD target/calcutorUnitTesting-1.0-SNAPSHOT.jar calcutorUnitTesting-1.0-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/calcutorUnitTesting-1.0-SNAPSHOT.jar"]
