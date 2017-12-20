package com.arqcdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 * @author elenius
 */
@ApplicationScoped
public class HelloApp {

    @Inject
    private Foo foo;

    public HelloApp() {}

    public String hello() {
        return "Hello world!";
    }

    public String foo() {
        return foo.foo();
    }

}
