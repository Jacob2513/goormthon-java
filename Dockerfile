FROM openjdk:17
COPY HelloWorldApplication.java .
RUN javac HelloWorldApplication.java
EXPOSE 8080
CMD ["java", "HelloWorldApplication"]

