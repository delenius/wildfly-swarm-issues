package com.arqlists;

import javax.enterprise.context.ApplicationScoped;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author elenius
 */
@ApplicationScoped
public class HelloApp {

    public HelloApp() {}

    public List<String> getGreetings() {
        return Arrays.asList("Hello World!", "Buenas Dias!", "Guten Tag!");
    }

}
