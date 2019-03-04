package com.yee.springmvc.controller;

import com.yee.springmvc.bean.UserBean;
import com.yee.springmvc.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

@Controller
@SessionAttributes({"user"})
public class HelloController {

    @Autowired
    private HelloDao helloDao;

    public HelloController() {
        System.out.println("hellocontroller");
        helloDao.printHelloDao();
    }

    @RequestMapping(value = "/testSession")
    public   @ResponseBody UserBean testSessionAttributes(Map<String,Object> userBeanMap){
        UserBean userBean = new UserBean();
        userBean.setUsername("ixin");
        userBean.setEmail("236640000@qq.com");
        userBean.setPassword("123123123123");
        userBeanMap.put("user",userBean);
        return userBean;
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map){
        map.put("names", Arrays.asList("TOME","JERRY","mike"));
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        String viewName = "success";
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("time",new Date());
        return modelAndView;
    }


    @RequestMapping(value = "/hello",method = RequestMethod.POST )
    public String hello(){
        return "success";
    }


    @RequestMapping( value = "/testHeader",params = {"username","age!=10"},headers = {})
    public String test(HttpServletRequest servletRequest){
        return "success";
    }

    @RequestMapping(value = "/test/{id}/{username}")
    public String testUser(@PathVariable(value = "id") Integer id,@PathVariable("username") String username){
        System.out.println(id+"----"+username);
        return "success";
    }

    @RequestMapping(value = "/testRequestParam" ,method = RequestMethod.GET)
    public void testParam(@RequestHeader(value = "Accept-Language" )String ln, @RequestParam("username") String username, @RequestParam(value = "password",required = false) String password) {
        System.out.println(username+"-----"+password+"----"+ln);
    }


    @RequestMapping("/testUser")
    public String testUser(UserBean userBean){
        System.out.println(userBean.toString());
        return "success";
    }

    @RequestMapping("/testServletApi")
    public void testServletApi(Writer out) throws IOException {
        out.write("hello");
    }

}
