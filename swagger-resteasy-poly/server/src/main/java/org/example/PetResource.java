package org.example;

import io.swagger.annotations.Api;
import org.apache.log4j.Logger;
import org.example.model.Cat;
import org.example.model.Dog;
import org.example.model.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.Arrays;
import java.util.List;


@Api(value = "Poly Pets")
@Path("/")
public class PetResource {
    private static Logger logger = Logger.getLogger(PetResource.class);

    @GET
    @Path("/pets")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Pet> getPets(){
        List<Pet> pets = Arrays.asList(
                new Dog().setBreed("Wiener"),
                new Cat().setSleepingHoursPerDay(20)
        );
        logger.info("Returning pets: " + pets);
        return pets;
    }

}
