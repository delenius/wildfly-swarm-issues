package com.arqlists;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.arquillian.DefaultDeployment;

import javax.inject.Inject;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URL;
import java.util.List;

@RunWith(Arquillian.class)
@DefaultDeployment
public class HelloTest {

    @Inject
    HelloResource helloResource;

    @Test
    public void testGreeting() {
        System.out.println(helloResource.getGreetings());
    }

    @ArquillianResource
    URL serverUrl;

    @Test
    @RunAsClient
    public void testGetDocuments_client() throws Exception {
        URI targetUri = URI.create(serverUrl.toExternalForm());
        WebTarget target = ClientBuilder.newClient().target(targetUri);
        Response response = null;
        try {
            response = target.path("/greetings").
                    request(MediaType.APPLICATION_JSON).get(Response.class);
            Assert.assertEquals(response.getStatus(), Response.Status.OK.getStatusCode());
            List docs = response.readEntity(List.class);
            Assert.assertNotNull(docs);
            Assert.assertTrue(docs.size() > 0);
        } finally {
            if (response != null) response.close();
        }
    }

}
