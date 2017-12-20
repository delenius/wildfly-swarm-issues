# CDI does not work in Arquillian unit tests with default params

To reproduce, run `mvn test`.

I have tried many different variants, like

- `@DefaultDeployment(type = DefaultDeployment.Type.WAR)`
- `@DefaultDeployment(type = DefaultDeployment.Type.JAR)`
- Not using default deployment, and manually building an archive

but these all run into other problems
