FROM openjdk:21

ENV SERVICE_NOTIFICATION_EXIT="false"

COPY target/*.jar application.jar

EXPOSE 8085

CMD ["java", "-jar", "application.jar"]



# FROM debian:latest

# EXPOSE 8085 22

# RUN apt upgrade -y && apt update -y

# RUN apt install curl -y

# RUN curl -o jdk-21_linux-x64_bin.deb https://download.oracle.com/java/21/latest/jdk-21_linux-x64_bin.deb

# RUN apt install ./jdk-21_linux-x64_bin.deb -y

# COPY target/*.jar application.jar

# RUN apt-get update && apt-get install -y openssh-server
# RUN mkdir /var/run/sshd
# RUN echo 'root:root123' | chpasswd
# RUN sed -i 's/#PermitRootLogin prohibit-password/PermitRootLogin yes/' /etc/ssh/sshd_config


# RUN touch script.sh
# # -D debug
# #RUN echo "/usr/sbin/sshd -D && java -jar application.jar" > script.sh
# RUN echo "/usr/sbin/sshd && java -jar application.jar" > script.sh

# CMD ["bash", "script.sh"]
