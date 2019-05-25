FROM openjdk:8-jre-alpine
MAINTAINER your_email@gmail.com
ADD target/build-image.jar build-image.jar
ENTRYPOINT ["java","-jar","/build-image.jar"]
CMD ["-jar", "/build-mage.jar"]
VOLUME /tmp
EXPOSE 8085