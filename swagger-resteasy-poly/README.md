# Problem with deserializing polymorphic classes using openapi-generator client

Steps to reproduce.

1. Go to the `sever` dir. Run `mvn package; ./run.sh`.
2. Go to the `client-gen` dir. Run `mvn install`.
3. Go to the `client` dir. Run `mvn verify`.

You will see a `UnrecognizedPropertyException`.
