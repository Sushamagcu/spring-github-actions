FROM openjdk:8
EXPOSE 8080
ADD target/spring-github-actions-image.jar spring-github-actions-image.jar
ENTRYPOINT ["java","-jar","/spring-github-actions-image.jar"]