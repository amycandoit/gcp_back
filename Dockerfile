FROM openjdk:17
#프로젝트를 복사해서
#RUN ["mkdir", "project"]
#COPY . ./project
#도커파일 안에서 빌드를 치고
#RUN ["chmod", "744", "./project/gradlew"]
#RUN ["./project/gradlew", "clean", "build", "--no-debug"]

COPY build/libs/*T.jar app.jar
#그 후에 jar파일을 실행한다
ENTRYPOINT ["java", "-jar","-Dspring.profiles.active=prod","app.jar"]