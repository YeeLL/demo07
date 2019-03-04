package com.yee.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springMVC")
public class SpringMvcTest {
    private static final String  SUCCESS = "success";

    @RequestMapping("/testSpring")
    public String testSpring(){
        return SUCCESS;
    }
}
