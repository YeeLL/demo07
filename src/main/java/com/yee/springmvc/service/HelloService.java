package com.yee.springmvc.service;

import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloService {

    public void printService(){
        System.out.println("helloService");
    }
}
