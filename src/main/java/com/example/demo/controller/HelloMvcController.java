package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloMvcController {
    @RequestMapping("/helloworld")
    public String helll(Model model) throws Exception{
        model.addAttribute("mav","hello test fro model");
        return "hello";
    }
}
