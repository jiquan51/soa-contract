FROM openjdk:8-jdk-alpine
# --spring.profiles.active=test --eureka.instance.ip-address=10.4.95.31
ADD soa-contract-1.0.0-SNAPSHOT.jar /
EXPOSE 7889
CMD ["java", "-jar", "-Xms128m", "-Xmx128m", "soa-contract-1.0.0-SNAPSHOT.jar", "--spring.profiles.active=test", "--eureka.instance.ip-address=10.4.23.166"]