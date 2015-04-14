package org.anaguma.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@EnableAutoConfiguration
@ComponentScan
public class UserController {

    @RequestMapping("/user")
    @ResponseBody
    public String show() {
        return "user!";
    }
}
