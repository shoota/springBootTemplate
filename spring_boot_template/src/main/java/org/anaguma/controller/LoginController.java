package org.anaguma.controller;

import org.anaguma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
@ComponentScan
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method=RequestMethod.GET)
    public String login() {
        return "login";
    }

}
