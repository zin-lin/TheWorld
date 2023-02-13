FROM openjdk:latest
COPY ./target/TheWorld-0.1.0.4-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar" ,"TheWorld-0.1.0.4-jar-with-dependencies.jar"]