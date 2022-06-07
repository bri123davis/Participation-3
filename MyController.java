package com.example.springdc23.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/aboutus")
    public String openAboutUs(){
        return "aboutus";
    }
    @GetMapping("/index")
    public String openHome(){
        return "index";
    }
    @GetMapping("/news")
    public String openNews(){
        return "news";
    }
@GetMapping("/explore")
    public String openExplore(){
        return "explore";
}
}
