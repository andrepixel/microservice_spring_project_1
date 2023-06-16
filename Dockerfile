FROM eclipse-temurin:11-alpine

WORKDIR /opt/app

RUN addgroup --system spring && adduser -S -s /usr/sbin/nologin -G spring spring

ARG JAR_FILE

COPY target/${JAR_FILE} app.jar

RUN chown -R spring:spring .

USER spring

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080