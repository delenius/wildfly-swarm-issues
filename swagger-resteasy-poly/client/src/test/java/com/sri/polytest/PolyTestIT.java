package com.sri.polytest;

import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.PolyPetsApi;
import org.openapitools.client.model.Cat;
import org.openapitools.client.model.Dog;
import org.openapitools.client.model.Pet;

import java.util.List;

/**
 * Created by martiny on 2/15/18.
 */
public class PolyTestIT {

    private static Logger logger = Logger.getLogger(PolyTestIT.class);
    private static PolyPetsApi server;

    @BeforeClass
    public static void initialize() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8080");
        server = new PolyPetsApi(apiClient);
    }

    @Test
    public void testPolymorphism() throws Exception {
        List<Pet> pets = server.getPets();
        System.out.println("Got some pets: " + pets);
        Assert.assertEquals("We should get two pets",2, pets.size());
        Assert.assertTrue("First pet should be a dog", pets.get(0) instanceof Dog);
        Assert.assertTrue("Second pet should be a cat", pets.get(1) instanceof Cat);
    }

}
