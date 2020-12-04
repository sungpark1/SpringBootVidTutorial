FROM openjdk:latest

ADD target/SpringBootVidTutorial-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080


# To build
# docker build -t sungprk96/test:1.3 .


# To run
# docker run -t sungprk96/test:1.3


# To push
# docker push -t sungprk96/test:1.3



