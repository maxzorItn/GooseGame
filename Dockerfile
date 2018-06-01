FROM openjdk:8-jre-alpine

#se la directory non c'è la crea e si sposta all'interno altrimenti si spota solo all'interno
WORKDIR app

COPY target/goosegame-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar

CMD ["java", "-jar", "app.jar"]