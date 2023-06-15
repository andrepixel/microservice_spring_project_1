FROM openjdk:11-jdk-alpine

LABEL key="1.0.0"

RUN "apk update && apk upgrade -y && mkdir -p /home/microservice/src"

COPY . /home/microservice/src

WORKDIR /home/microservice/src

EXPOSE 8080