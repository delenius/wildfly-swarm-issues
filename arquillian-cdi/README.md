# CDI does not work in Arquillian unit tests with default params

To reproduce, run `mvn test`.

The problem occurs because `@DefaultDeployment` does not include
classes in other packages, so injecting `HelloApp` from `HelloResource`
fails.

It does package *sub-packages*, so it works if the `model` package
is moved inside the `rest` package.
