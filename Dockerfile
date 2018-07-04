FROM openjdk:8
ADD ./target/techarticle.jar techarticle.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "techarticle.jar" ]
