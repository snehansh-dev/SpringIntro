package com.snehansh.SpringIntro.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @RequestMapping(path = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String welcomeMessage(){
        return "Hello Welcome to Get Request Hot Reload aaa";
    }
}
