package com.hive.trend.modal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class modalController {

    @GetMapping("/signupC")
    public String showPage() {
        return "/member/signupC";
    }
}

