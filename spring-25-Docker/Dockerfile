# BaseImage / it has to be in any dockerFile
FROM openjdk:17-jdk
# Will get jar file and copy to image
COPY ./target/spring-25-Docker-0.0.1-SNAPSHOT.jar /usr/app/
# to direct any folder
WORKDIR /usr/app
# Will provide exacutable application when container starts the run
RUN ["java","-jar","spring-25-Docker-0.0.1-SNAPSHOT.jar"]