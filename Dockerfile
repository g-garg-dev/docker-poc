FROM openjdk:18-jdk
VOLUME /tmp
ADD gaurav-poc/target/gaurav-poc-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar","/apdop.jar"]
