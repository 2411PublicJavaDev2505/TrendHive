package com.hive.trend.footer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class aboutController {

    @GetMapping("/about")
    public String showTermsPage() {
        return "common/about"; // terms.jsp를 렌더링
    }
}

