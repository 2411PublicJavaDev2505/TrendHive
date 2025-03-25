package com.hive.trend.footer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TermsController {

    @GetMapping("/terms")
    public String showPage() {
        return "common/terms";
    }
}

