FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/cors-0.0.1-SNAPSHOT.jar corsapp.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /corsapp.jar