package org.anaguma.controller;

import org.anaguma.domain.User;
import org.anaguma.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@EnableAutoConfiguration
@ComponentScan
public class UserController {

    @Autowired
    UserRepository userRepo;

    @RequestMapping("/user")
    public String show(Model model) {

        Page<User> users = userRepo.findAll(new PageRequest(0, 10));
        model.addAttribute("users", users);
        return "user_show";
    }
}
