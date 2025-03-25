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

import com.hive.trend.company.domain.CompanyVO;
import com.hive.trend.infl.controller.dto.InflLoginRequest;
import com.hive.trend.infl.controller.dto.InflModifyRequest;
import com.hive.trend.infl.domain.InflVO;
import com.hive.trend.infl.service.InflService;

@Controller
@RequestMapping("/infl")
public class InflController {
	@Autowired
	private InflService iService; // 필드 의존성 주입
	
	
	@Autowired
	public InflController(InflService iService) {
		this.iService = iService;
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
	public String inflInsert(@ModelAttribute InflVO infl
			,HttpServletRequest request, HttpServletResponse response) {
		int result = iService.insertInfl(infl);
		if(result > 0) {
			return "redirect:/";
		}else {
			return "common/error";
		}
	}
	// 크리에이터 회원 로그인
	@PostMapping("/login")
	public String inflLogin(@RequestParam("inflId") String inflId
			,@RequestParam("inflPw") String inflPw
			,HttpSession session
			,Model model) {
		try {
			InflLoginRequest infl = new InflLoginRequest(inflId, inflPw);
			InflVO infl1 = iService.selectOneByLogin(infl);
			if(infl1 != null) {
				session.setAttribute("inflId", infl1.getInflId());
				session.setAttribute("inflName", infl1.getInflName());
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
	@GetMapping("/logout")
	public String inflLogout(HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		return "redirect:/";
	}
	//기업 마이페이지
	@GetMapping("/detail")
	public String inflMyPage(HttpSession session, Model model) {
		try {
			String inflId = (String)session.getAttribute("inflId");
			InflVO infl = iService.selectOneById(inflId);
			if(infl != null) {
				model.addAttribute("infl", infl);
				return "company/detail";
			}else {
				model.addAttribute("errorMsg", "존재하지 않는 정보입니다.");
				return "common/error";
			}
		}  catch (Exception e) {
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	// 크리에이터 정보 수정
	@PostMapping("/update")
	public String inflUpdate(@ModelAttribute InflModifyRequest infl,
			Model model) {
		try {
			int result = iService.updateInfl(infl);
			if(result > 0) {
				return "redirect:/infl/detail";
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
		public String inflDelete(HttpSession session, Model model) {
			try {
				String inflId = (String)session.getAttribute("inflId");
				int result = iService.deleteInfl(inflId);
				if(result > 0) {
					return "redirect:/infl/logout";
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
