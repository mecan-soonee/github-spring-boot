FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8080
ADD target/github-spring-boot.jar github-spring-boot.jar
ENTRYPOINT [ "java", "-jar", "/github-spring-boot.jar" ]