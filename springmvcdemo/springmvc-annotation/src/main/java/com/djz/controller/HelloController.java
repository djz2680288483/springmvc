package com.djz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author djz
 * @date 2020/11/20 -11:15
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/h1")
    public String hello(Model model) {

        model.addAttribute("msg", "SpringMVC hello Test");
        return "hello";
    }
}
