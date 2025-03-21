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

import com.hive.trend.common.FileUtil;
import com.hive.trend.common.PageUtil;
import com.hive.trend.company.controller.dto.CompanyLoginRequest;
import com.hive.trend.company.controller.dto.CompanyModifyRequest;
import com.hive.trend.company.domain.CompanyVO;
import com.hive.trend.company.service.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private CompanyService cService; // 필드 의존성 주입
	private FileUtil fileUtil;
	private PageUtil pageUtil;
	// 회원가입 페이지 이동
	@Autowired
	public CompanyController(CompanyService cService, FileUtil fileUtil
			, PageUtil pageUtil) {
		this.cService = cService;
		this.fileUtil = fileUtil;
		this.pageUtil = pageUtil;
	}
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
	@GetMapping("/logout")
	public String companyLogout(HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		return "redirect:/";
	}
	//기업마이페이지
	@GetMapping("/detail")
	public String companyMyPage(HttpSession session, Model model) {
		try {
			String companyId = (String)session.getAttribute("companyId");
			CompanyVO company = cService.selectOneById(companyId);
			if(company != null) {
				model.addAttribute("company", company);
				return "company/detail";
			}else {
				model.addAttribute("errorMsg", "존재하지 않는 정보입니다.");
				return "common/error";
			}
		} catch (Exception e) {
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	//기업정보 수정 페이지 이동
	@GetMapping("/update")
	public String companyUpdateForm(HttpSession session, Model model) {
		try {
			String companyId = (String)session.getAttribute("companyId");
			CompanyVO company = cService.selectOneById(companyId);
			if(company != null) {
				model.addAttribute("company", company);
				return "company/update";
			}else {
				model.addAttribute("errorMsg", "존재하지 않는 정보입니다.");
				return "common/error";
			}
		} catch (Exception e) {
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	//기업정보 수정
	@PostMapping("/update")
	public String companyUpdate(@ModelAttribute CompanyModifyRequest company
			, Model model) {
		try {
			int result = cService.updateCompany(company);
			if(result >0) {
				return "redirect:/company/detail";
			}else {
				model.addAttribute("errorMsg", "서비스가 완료되지 않았습니다.");
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	@GetMapping("/delete")
	public String companyDelete(HttpSession session, Model model) {
		try {
			String companyId = (String)session.getAttribute("companyId");
			int result = cService.deleteCompany(companyId);
			if(result > 0) {
				return "redirect:/company/logout";
			}else {
				model.addAttribute("errorMsg", "서비스가 완료되지 않았습니다.");
				return "common/error";
			}
		} catch (Exception e) {
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	
	
}
