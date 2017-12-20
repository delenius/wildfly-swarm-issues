package com.arqcdi;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.arquillian.DefaultDeployment;
import javax.inject.Inject;


@RunWith(Arquillian.class)
@DefaultDeployment //(type = DefaultDeployment.Type.WAR)
public class HelloResourceTest {

    @Inject
    HelloResource helloResource;

    @Test
    public void testGreeting() {
        System.out.println(helloResource.getGreeting());
    }

    @Test
    public void testFoo() {
        System.out.println(helloResource.getFoo());
    }

}
