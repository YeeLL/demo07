package com.yee.springmvc.dao;

import org.springframework.stereotype.Component;

@Component("helloDao")
public class HelloDao {

    public HelloDao() {
        System.out.println("HelloDao");

    }

    public void printHelloDao(){
        System.out.println("helloDao");
    }
}
