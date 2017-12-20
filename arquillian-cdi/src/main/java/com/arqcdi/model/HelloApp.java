package com.arqcdi.model;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 * @author elenius
 */
@ApplicationScoped
public class HelloApp {

    public HelloApp() {}

    public String hello() {
        return "Hello world!";
    }

}
