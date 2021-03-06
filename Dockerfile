
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD target/rms-documentation-service-1.0-SNAPSHOT.jar rms-documentation-service.jar
EXPOSE 9093
# ENTRYPOINT exec java $JAVA_OPTS -jar rms-documentation-service.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar rms-documentation-service.jar
