FROM openjdk:21

COPY target/*.jar application.jar

EXPOSE 8085

CMD ["java", "-jar", "application.jar"]

# FROM ubuntu

# RUN apt upgrade -y && apt update -y

# RUN apt install curl -y

# RUN curl -o jdk-21_linux-x64_bin.deb https://download.oracle.com/java/21/latest/jdk-21_linux-x64_bin.deb

# RUN apt install ./jdk-21_linux-x64_bin.deb -y

# COPY target/*.jar application.jar

# EXPOSE 8085

# CMD ["java", "-jar", "application.jar"]
