package com.arqcdi.rest;

import com.arqcdi.model.HelloApp;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;


@Path("/")
public class HelloResource {

    @Inject
    private HelloApp app;

    @GET
    @Path("/greet")
    @Produces({MediaType.TEXT_PLAIN})
    public String getGreeting(){
        return app.hello();
    }

}
