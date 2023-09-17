# ビルドステージ
FROM maven:3.8.5-openjdk-17-slim AS build
WORKDIR /workspace
COPY pom.xml .
COPY src src
RUN mvn clean package

# 実行ステージ
FROM openjdk:17-alpine
EXPOSE 8080
COPY --from=build /workspace/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]