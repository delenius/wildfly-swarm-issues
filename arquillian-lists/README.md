# Arquillian cannot deserialize lists

To reproduce, run `mvn test`.

It produces this error:

```
javax.ws.rs.ProcessingException: RESTEASY003145: Unable to find a MessageBodyReader of content-type application/json and type interface java.util.List
```

