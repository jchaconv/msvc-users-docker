FROM openliberty/open-liberty:22.0.0.8-kernel-slim-java8-openj9-ubi

LABEL \
	org.opencontainers.image.title="msvc-users" \
	org.opencontainers.image.description="Spring boot application running on Open Liberty" \
	org.opencontainers.image.authors="Julio Chacon Vilela"

#COPY --chown=1001:0 ./server.xml /config/
#RUN features.sh
#COPY --chown=1001:0 ./target/msvc-users-0.0.1-SNAPSHOT.jar /config/apps/

COPY --chown=1001:0 src/main/liberty/config/ /config/
COPY --chown=1001:0 target/*.jar /config/apps/

RUN configure.sh

