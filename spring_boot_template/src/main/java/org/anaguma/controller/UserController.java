package org.anaguma.controller;

import javax.validation.Valid;

import org.anaguma.domain.User;
import org.anaguma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
@ComponentScan
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public String show(Model model) {

        Page<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user_show";
    }

    @RequestMapping(value="/user/new", method=RequestMethod.GET)
    public String showNewUserForm(User user) {
        return "user_new";
    }

    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
    public String create(
            @Valid User user,
            BindingResult result) {

        if(result.hasErrors()){
            return "user_new";
        }

        try {
            userService.save(user);
        } catch (Exception e) {
            return "user_new";
        }
        return "redirect:/user";
    }
}
