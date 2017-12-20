package com.arqcdi;

import org.apache.commons.io.FileUtils;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Foo {

    public Foo(){}

    public String foo(){
        return FileUtils.byteCountToDisplaySize(10);
        //return "foo";
    }


}
