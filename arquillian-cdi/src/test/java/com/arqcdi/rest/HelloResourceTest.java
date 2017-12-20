package com.arqcdi.rest;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.arquillian.DefaultDeployment;
import javax.inject.Inject;


@RunWith(Arquillian.class)
@DefaultDeployment
public class HelloResourceTest {

    @Inject
    HelloResource helloResource;

    @Test
    public void testGreeting() {
        System.out.println(helloResource.getGreeting());
    }

}
