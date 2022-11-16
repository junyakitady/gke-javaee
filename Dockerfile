#FROM openliberty/open-liberty:full-java8-openj9-ubi
FROM open-liberty:22.0.0.3-full-java11-openj9

COPY --chown=1001:0 src/main/liberty/config /config/
COPY --chown=1001:0 target/gke-javaee.war /config/apps

RUN configure.sh