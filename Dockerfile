FROM azul/zulu-openjdk:17.0.7
WORKDIR /docker/springboot3-startup
COPY /build/libs/springboot3-startup-1.0-SNAPSHOT.jar /docker/springboot3-startup/
COPY start.sh /docker/springboot3-startup/
EXPOSE 8080
ENTRYPOINT bash start.sh