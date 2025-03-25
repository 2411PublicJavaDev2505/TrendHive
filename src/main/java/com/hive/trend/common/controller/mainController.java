package com.hive.trend.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping("/member/password")
    public String showPasswordPage() {
        return "member/password";
    }
    
    @GetMapping("/member/loginC")
    public String showLoginCPage() {
        return "member/loginC";
    }
    
    @GetMapping("/member/loginInfl")
    public String showLoginInflPage() {
        return "member/loginInfl";
    }
    
    
    @GetMapping("/member/signupC")
    public String showSignupCPage() {
        return "member/signupC";
    }
    
    @GetMapping("/member/signupInfl")
    public String showSignupInflPage() {
    	return "member/signupInfl";
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

