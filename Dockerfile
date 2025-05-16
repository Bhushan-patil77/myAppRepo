FROM openjdk:17
COPY target/myApp.jar /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "myApp.jar" ]