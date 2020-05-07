FROM alpine:3.5
ADD /var/lib/jenkins/workspace/Calculator\ Build/target/Devops_Calculator-0.0.1-SNAPSHOT.jar Devops_Calculator-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "Devops_Calculator-0.0.1-SNAPSHOT.jar"]