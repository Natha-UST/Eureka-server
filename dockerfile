FROM openjdk:17-oracle
COPY ./target/RegistryInfo-0.0.1-SNAPSHOT.jar RegistryInfo.jar
CMD ["java","-jar","RegistryInfo.jar"]