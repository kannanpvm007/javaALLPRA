package com.kgisl.webapp2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SpringDemo
 */
@Controller
@RequestMapping("/")
public class SpringDemo {

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("message", "Spring MVC XML Config Example");
        return "index";
    } 
}