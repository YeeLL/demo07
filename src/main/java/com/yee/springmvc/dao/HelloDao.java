package com.yee.springmvc.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository(value = "helloDao")
public class HelloDao {

    public HelloDao() {
        System.out.println("HelloDao");
    }

    public void printHelloDao(){
        System.out.println("helloDao");
    }
}
