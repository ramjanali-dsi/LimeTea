package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by User on 11/23/2016.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(value = "/",  method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("name", "Potato");
        return "index";
    }
}
