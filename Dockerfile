FROM openjdk:8
EXPOSE 8080
ADD target/java-image.jar java-image.jar
ENTRYPOINT ["java","-jar","/java-image.jar"]