FROM open-liberty:22.0.0.13-full-java11-openj9

COPY --chown=1001:0 src/main/liberty/config /config/
COPY --chown=1001:0 target/gke-javaee.war /config/apps

RUN configure.sh