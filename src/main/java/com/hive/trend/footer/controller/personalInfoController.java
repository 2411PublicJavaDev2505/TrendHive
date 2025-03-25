package com.hive.trend.footer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class personalInfoController {

    @GetMapping("/personalInfo")
    public String showTermsPage() {
        return "common/personalInfo"; // terms.jsp를 렌더링
    }
}

