import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.PolyPetsApi;
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
    }

}
