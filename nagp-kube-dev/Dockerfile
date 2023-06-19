FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 9090
ADD target/nagp-kube-dev-0.0.1-SNAPSHOT.jar nagp-kube-dev-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "sh", "-c", "java -jar /nagp-kube-dev-0.0.1-SNAPSHOT.jar" ]