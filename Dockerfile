FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/AakashExp.jar AakashExp.jar
ENTRYPOINT ["java","-jar","aakashexp.jar"]