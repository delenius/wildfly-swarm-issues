# Test dependencies pull in other dependencies into WAR file

Run `mvn package`

Run `jar -tf target/resteasy-scope.war | grep resteasy`

Comment out the two resteasy test dependencies in `pom.xml`, and
run `mvn clean; mvn package`.

Once again, run `jar -tf target/resteasy-scope.war | grep resteasy`

In one case, the war file contains resteasy-jaxrs-3.0.19.Final.jar,
in the other case not.

Running the version with the resteasy jar file in it,

  `java -jar target/resteasy-scope-0.0.1-swarm.jar `

produces errors. The version without the resteasy jar file does not
produce errors.

This is relevant because these dependencies are needed to fix
SWARM-1750.
