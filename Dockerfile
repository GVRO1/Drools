FROM java:8
RUN mkdir app
ADD /target/demo-0.0.1-SNAPSHOT.jar /app/drools.jar
WORKDIR /app
CMD java -jar drools.jar