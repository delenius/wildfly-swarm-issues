package org.example;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.Arrays;
import java.util.List;


@Path("/")
public class HelloResource {

    @GET
    @Path("/greetings")
    @Produces({MediaType.APPLICATION_JSON})
    public List<String> getGreetings(){
        return Arrays.asList("Hello World!", "Buenas Dias!", "Guten Tag!");
    }

}
