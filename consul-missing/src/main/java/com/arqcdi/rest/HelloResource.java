package com.arqcdi.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.*;


@Path("/")
public class HelloResource {

    @GET
    @Path("/greet")
    @Produces({MediaType.TEXT_PLAIN})
    public String getGreeting(){
        return "Hello World!";
    }

}
