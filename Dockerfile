FROM eclipse-temurin:17
WORKDIR /app
COPY target/Pagination-0.0.1-SNAPSHOT.jar /app/Pagination-0.0.1-SNAPSHOT.jar

EXPOSE 8080
ENTRYPOINT java -Xms3072m -Xmx3072m -jar Pagination-0.0.1-SNAPSHOT.jar
