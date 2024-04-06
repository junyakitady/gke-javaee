FROM open-liberty:24.0.0.3-full-java17-openj9

COPY --chown=1001:0 src/main/liberty/config /config/
COPY --chown=1001:0 target/gke-javaee.war /config/apps

RUN configure.sh