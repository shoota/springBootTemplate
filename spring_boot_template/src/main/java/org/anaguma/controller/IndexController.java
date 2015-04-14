package org.anaguma.controller;

import org.anaguma.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
@ComponentScan
public class IndexController {

    @Autowired
    HelloService helloservice;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("message",helloservice.getHelloMessage());
        return "index";
    }
}