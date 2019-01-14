FROM java:8
# Expose container's path for binding host's path
VOLUME /tmp
ADD employee-service-1.0.0.jar employee-service-app.jar
ENV JAVA_OPTS=""
# Expose container's port for binding host's port
EXPOSE 8011
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=prod" ,"-jar","/employee-service-app.jar"]