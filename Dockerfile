FROM openjdk:8
ADD target/Devops_Calculator-0.0.1-SNAPSHOT.jar Devops_Calculator-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "Devops_Calculator-0.0.1-SNAPSHOT.jar"]