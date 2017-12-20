# Missing Consul service is not handled gracefully

To reproduce, run `mvn package`, then
`java -jar target/consul-missing-0.0.1-swarm.jar`.

