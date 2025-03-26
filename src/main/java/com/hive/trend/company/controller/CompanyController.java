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
import com.hive.trend.company.controller.dto.CompanyPasswordRequest;
import com.hive.trend.company.domain.CompanyVO;
import com.hive.trend.company.service.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private CompanyService cService; // 필드 의존성 주입
	private FileUtil fileUtil;
	private PageUtil pageUtil;
	
	@Autowired
	public CompanyController(CompanyService cService, FileUtil fileUtil
			, PageUtil pageUtil) {
		this.cService = cService;
		this.fileUtil = fileUtil;
		this.pageUtil = pageUtil;
	}
	// 비밀번호 변경 페이지 이동
	@GetMapping("/password")
	public String companyPasswordForm() {
		return "company/password";
	}
	@PostMapping("/password")
	public String companyPasswordFind(
			@RequestParam("companyId") String companyId
			,@RequestParam("companyEmail") String companyEmail
			, HttpSession session, Model model) {
		try {
			CompanyPasswordRequest company = new CompanyPasswordRequest(companyId, companyEmail);
			CompanyVO company1 = cService.selectOneByEmail(company);
			if(company1 != null) {
				session.setAttribute("companyId", company1.getCompanyId());
				session.setAttribute("companyEmail", company1.getCompanyEmail());
				return "redirect:/";
			}else {
				model.addAttribute("errorMsg", "존재하지 않는 정보입니다.");
				return "common/error";
			}
		} catch (Exception e) {
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
		
	}
	//기업 회원 로그인
//	@PostMapping("/login")
//	public String companyLogin(
//			@RequestParam("companyId") String companyId
//			,@RequestParam("companyPw") String companyPw
//			,HttpSession session
//			,Model model) {
//		try {
//			CompanyLoginRequest company = new CompanyLoginRequest(companyId, companyPw);
//			CompanyVO company1 = cService.selectOneByLogin(company);
//			if(company1 != null) {
//				session.setAttribute("companyId", company1.getCompanyId());
//				session.setAttribute("companyName", company1.getCompanyName());
//				return "redirect:/";
//			}
//			else {
//				model.addAttribute("errorMsg", "존재하지 않는 정보입니다.");
//				return "common/error";
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			model.addAttribute("errorMsg", e.getMessage());
//			return "common/error";
//		}
//	}
	// 로그인 페이지 이동
	@GetMapping("/login")
	public String companyLoginForm() {
		return "company/login";
	}
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
            @RequestParam("companyId") String companyId,
            @RequestParam("companyPw") String companyPw,
            HttpSession session,
            Model model) {
        try {
            // 로그인 요청 객체 생성
            CompanyLoginRequest company = new CompanyLoginRequest(companyId, companyPw);
            
            // 로그인 서비스 호출
            CompanyVO company1 = cService.selectOneByLogin(company);
            
            if (company1 != null) {
                // 로그인 성공 시 세션에 값 저장
                session.setAttribute("loggedIn", true); // 로그인 상태 저장
                session.setAttribute("userName", company1.getCompanyName()); // 사용자 이름 저장
                return "redirect:/"; // 메인 페이지로 리다이렉트
            } else {
                model.addAttribute("errorMsg", "존재하지 않는 정보입니다.");
                return "common/error";
            }
        } catch (Exception e) {
            model.addAttribute("errorMsg", e.getMessage());
            return "common/error";
        }
    }

	@GetMapping("/logout")
	public String companyLogout(HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		return "company/logout";
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
    public String showUpdateForm(HttpSession session, Model model) {
        // 로그인 상태 확인
        if (session.getAttribute("loggedIn") == null || !(boolean) session.getAttribute("loggedIn")) {
            return "redirect:/login"; // 로그인 페이지로 리다이렉트
        }

        // 회원 정보 가져오기
        String companyId = (String) session.getAttribute("companyId");
        CompanyVO company = cService.selectOneById(companyId);
        model.addAttribute("company", company);

        return "company/update";
    }
	//기업정보 수정
//	@PostMapping("/update")
//	public String companyUpdate(@ModelAttribute CompanyModifyRequest company
//			, Model model) {
//		try {
//			int result = cService.updateCompany(company);
//			if(result >0) {
//				return "redirect:/company/update";
//			}else {
//				model.addAttribute("errorMsg", "서비스가 완료되지 않았습니다.");
//				return "common/error";
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			model.addAttribute("errorMsg", e.getMessage());
//			return "common/error";
//		}
//	}
	
	@PostMapping("/update")
    public String updateCompany(@RequestParam("companyId") String companyId,
                                @RequestParam("companyPw") String newPassword,
                                @RequestParam("companyPwCheck") String confirmPassword,
                                CompanyVO company,
                                HttpSession session) {
        // 비밀번호 일치 여부 확인
        if (!newPassword.equals(confirmPassword)) {
            return "redirect:/company/update?error=passwordMismatch"; // 비밀번호 불일치 시 에러 메시지와 함께 리다이렉트
        }

        // 회원 정보 업데이트
        company.setCompanyPw(newPassword); // 비밀번호 업데이트
        cService.updateCompany(company);

        // 세션 업데이트
        session.setAttribute("companyName", company.getCompanyName());

        return "redirect:/my-info"; // 내정보 페이지로 리다이렉트
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
