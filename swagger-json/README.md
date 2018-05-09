# Wildfly Swarm Swagger Issues

Run `mvn package`, then `java -jar target/swagger-json-0.0.1-swarm.jar`.

Go to `http://localhost:8080/swagger.json`.

Observe that the swagger file is not pretty-printed ([THORN-2025](https://issues.jboss.org/browse/THORN-2025)).

Go to `http://localhost:8080/swagger.yaml`.

Observe that there is no yaml file ([THORN-2026](https://issues.jboss.org/browse/THORN-2026)).




