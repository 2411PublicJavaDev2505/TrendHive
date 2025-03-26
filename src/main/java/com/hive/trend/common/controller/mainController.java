package com.hive.trend.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping("/infl/password")
    public String showInflPasswordPage() {
        return "infl/password";
    }
    
    @GetMapping("/common/about")
    public String showAboutPage() {
        return "common/about";
    }
    
    @GetMapping("/common/personalInfo")
    public String showPersonalInfoPage() {
        return "common/personalInfo"; // terms.jsp를 렌더링
    }
    
    @GetMapping("/common/terms")
    public String showtermsPage() {
        return "common/terms";
    }
    
}

