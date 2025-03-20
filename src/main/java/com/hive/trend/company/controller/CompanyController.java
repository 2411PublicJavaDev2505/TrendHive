package com.hive.trend.company.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hive.trend.company.controller.dto.CompanyLoginRequest;
import com.hive.trend.company.domain.CompanyVO;
import com.hive.trend.company.service.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private CompanyService cService; // 필드 의존성 주입
	// 회원가입 페이지 이동
	@GetMapping("/insert")
	public String companyInsertForm() {
		return "company/insert";
	}
	// 회원가입
	@PostMapping("/insert")
	public String companyInsert(
			@ModelAttribute CompanyVO company
			,HttpServletRequest request, HttpServletResponse response) {
		int result = cService.insertCompany(company);
		if(result > 0) {
			return "redirect:/";
		}else {
			return "common/error";
		}
	}
	//기업 회원 로그인
	@PostMapping("/login")
	public String companyLogin(
			@RequestParam("companyId") String companyId
			,@RequestParam("companyPw") String companyPw
			,HttpSession session
			,Model model) {
		try {
			CompanyLoginRequest company = new CompanyLoginRequest(companyId, companyPw);
			CompanyVO company1 = cService.selectOneByLogin(company);
			if(company1 != null) {
				session.setAttribute("companyId", company1.getCompanyId());
				session.setAttribute("companyName", company1.getCompanyName());
				return "redirect:/";
			}
			else {
				model.addAttribute("errorMsg", "존재하지 않는 정보입니다.");
				return "common/error";
			}
		} catch (Exception e) {
			// TODO: handle exception
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	
}
