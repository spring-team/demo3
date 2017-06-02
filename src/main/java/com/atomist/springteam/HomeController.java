package com.atomist.springteam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path = "/")
    public String home() {
        return "Hello REST Microservice World";
    }
    
    @RequestMapping(path = "/hello")
    public String hello() {
        return "Hello REST Microservice World";
    }
    
    @RequestMapping(path = "/hello1")
    public String hello1() {
        return "Hello REST Microservice World";
    }
    
    @RequestMapping(path = "/hello2")
    public String hello2() {
        return "Hello REST Microservice World";
    }
    @RequestMapping(path = "/hello3")
    public String hello3() {
        return "Hello REST Microservice World";
    }

}
