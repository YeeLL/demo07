package com.yee.springmvc.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value = "helloDao")
public class HelloDao {

    public HelloDao() {
        System.out.println("HelloDao");

    }

    public void printHelloDao(){
        System.out.println("helloDao");
    }
}
