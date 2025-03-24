package com.hive.trend.header.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class logoController {

    @GetMapping("/index")
    public String showPage() {
        return "webapp/index";
    }
}

