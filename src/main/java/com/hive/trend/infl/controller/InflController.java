package com.hive.trend.infl.controller;

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
import com.hive.trend.company.domain.CompanyVO;
import com.hive.trend.company.service.CompanyService;
import com.hive.trend.infl.controller.dto.InflLoginRequest;
import com.hive.trend.infl.controller.dto.InflModifyRequest;
import com.hive.trend.infl.domain.InflVO;
import com.hive.trend.infl.service.InflService;

@Controller
@RequestMapping("/infl")
public class InflController {
	@Autowired
	private InflService iService; // 필드 의존성 주입
	private FileUtil fileUtil;
	private PageUtil pageUtil;
	
	@Autowired
	public InflController(InflService iService, FileUtil fileUtil
			, PageUtil pageUtil) {
		this.iService = iService;
		this.fileUtil = fileUtil;
		this.pageUtil = pageUtil;
	}
	// 로그인 페이지 이동
	@GetMapping("/login")
	public String inflLoginForm() {
		return "infl/login";
	}
	// 회원가입 페이지 이동
	@GetMapping("/insert")
	public String inflInsertForm() {
		return "infl/insert";
	}
	
	// 회원가입
	@PostMapping("/insert")
	public String inflInsert(
			@ModelAttribute InflVO infl
			,HttpServletRequest request
			, HttpServletResponse response) {
		int result = iService.insertInfl(infl);
		if(result > 0) {
			return "redirect:/";
		}else {
			return "common/error";
		}
	}
	// 크리에이터 회원 로그인
	@PostMapping("/login")
	public String inflLogin(
			@RequestParam("inflId") String inflId,
			@RequestParam("inflPw") String inflPw,
			HttpSession session,
			Model model) {
		try {
			InflLoginRequest infl = new InflLoginRequest(inflId, inflPw);
			InflVO infl1 = iService.selectOneByLogin(infl);
			if(infl1 != null) {
				session.setAttribute("loggedIn", true); // 로그인 상태 저장
				session.setAttribute("inflId", infl1.getInflId());
                session.setAttribute("userName", infl1.getInflName()); // 사용자 이름 저장
                session.setAttribute("userType", "I");
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
	public String inflLogout(HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		return "infl/logout";
	}
	//기업 마이페이지
//	@GetMapping("/detail")
//	public String inflMyPage(HttpSession session, Model model) {
//		try {
//			String inflId = (String)session.getAttribute("inflId");
//			InflVO infl = iService.selectOneById(inflId);
//			if(infl != null) {
//				model.addAttribute("infl", infl);
//				return "company/detail";
//			}else {
//				model.addAttribute("errorMsg", "존재하지 않는 정보입니다.");
//				return "common/error";
//			}
//		}  catch (Exception e) {
//			model.addAttribute("errorMsg", e.getMessage());
//			return "common/error";
//		}
//	}
	// 크리에이터 정보 수정
//	@PostMapping("/update")
//	public String showUpdateForm(HttpSession session, Model model)  {
//        // 로그인 상태 확인
//        if (session.getAttribute("loggedIn") == null || !(boolean) session.getAttribute("loggedIn")) {
//            return "redirect:/login"; // 로그인 페이지로 리다이렉트
//        }
//        
//        String infl(String) session.getAttribute("inflId");
//        InflVO infl = iService.selectOneById(inflId);
//        if(infl != null) {
//        	model.addAttribute("infl", infl);
//        	return "infl/update";
//        } else {
//        	model.addAttribute("errorMsg", "존재하지 않는 정보입니다.");
//			return "common/error";
//		}
//	}
	@GetMapping("/update")
    public String showUpdateForm(HttpSession session, Model model) {
        // 로그인 상태 확인
        if (session.getAttribute("loggedIn") == null || !(boolean) session.getAttribute("loggedIn")) {
            return "redirect:/login"; // 로그인 페이지로 리다이렉트
        }

        // 회원 정보 가져오기
        String inflId = (String) session.getAttribute("inflId");					
        InflVO company = iService.selectOneById(inflId);
        model.addAttribute("infl", inflId);

        return "company/update";
    }
	
	@PostMapping("/update")
    public String updateInfl(
    		@RequestParam("inflId") String inflId,
            @RequestParam("inflPw") String newPassword,
    		@RequestParam("inflPwCheck") String confirmPassword,
    							InflVO infl,
                                HttpSession session) {
        // 비밀번호 일치 여부 확인
        if (!newPassword.equals(confirmPassword)) {
            return "redirect:/infl/update?error=passwordMismatch"; // 비밀번호 불일치 시 에러 메시지와 함께 리다이렉트
        }

        // 회원 정보 업데이트
        infl.setInflPw(newPassword); // 비밀번호 업데이트
        int result = iService.updateInfl(infl);

        if (result > 0) {
        // 세션 업데이트
        session.setAttribute("inflName", infl.getInflName());

        return "redirect:/infl/update-success"; // 내정보 페이지로 리다이렉트
    } else {
    	return "redirect:/infl/update";
    }
}
	
	@GetMapping("/update-success")
    public String showUpdateSuccessPage() {
        return "infl/update-success";
    }
	
	
	@GetMapping("/delete")
	public String inflDelete(HttpSession session, Model model) {
		try {
			String inflId = (String)session.getAttribute("inflId");
//			int result = cService.deleteCompany(companyId);
			return "infl/delete";
//			if(result > 0) {
//			}else {
//				model.addAttribute("errorMsg", "서비스가 완료되지 않았습니다.");
//				return "common/error";
//			}
		} catch (Exception e) {
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	@PostMapping("/delete")
    public String deleteInfl(HttpSession session) {

        String inflId = (String) session.getAttribute("inflId");
        session.invalidate();

        return "redirect:/?logout=true";
    }
}

