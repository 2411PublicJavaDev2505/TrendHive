package com.hive.trend.dm2.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hive.trend.dm.model.service.DmService;
import com.hive.trend.dm.model.vo.TrendHive;

@Controller
@RequestMapping("/dm")
public class Dm2Controller {

	private final DmService dmService;
	
	@Autowired
	public Dm2Controller(DmService dmService) {
		this.dmService = dmService;
	}
	
	
	// DM 리스트 페이지로 이동
	@GetMapping("/list")
	public String showDmList(HttpSession session, Model model) {
		String userId = (String) session.getAttribute("userId");
		if(userId == null) {
			model.addAttribute("errorMsg", "로그인이 필요합니다.");
			return "common/error";
		}
		
		List<TrendHive> dmList = dmService.getDmList(userId); 
		model.addAttribute("dmList", dmList);
		return "dm/list";
	}
	
	// DM 작성 페이지로 이동
	@PostMapping("/form")
	public String writeDmForm() {
		return "dm/form";
	}
	
	// DM 작성 및 전송 (여기가 메시지 입력 창)
	@PostMapping("/insert")
	public String sendDm(@ModelAttribute TrendHive dm, HttpSession session, Model model) {
		String userId = (String) session.getAttribute("userId"); 
		if(userId == null) {
			model.addAttribute("errorMsg", "로그인이 필요합니다.");
			return "common/error";
		}
		
		int result = dmService.insertDm(dm);
		if (result > 0) {
			return "redirect:/dm/list";
			
		} else {
			model.addAttribute("errorMsg", "DM 전송에 실패했습니다.");
			return "common/error";
		}
	}
	
	// DM 상세 조회 (여기가 메시지 검색/조회)
	@GetMapping("/detail")
	public String showDmDetail(@RequestParam("dmNo") int dmNo, Model model) {
		TrendHive dm = dmService.getDmDetail(dmNo);
		if(dm == null) {
			model.addAttribute("errorMsg", "해당 메시지를 찾을 수 없습니다.");
			return "common/error";
		}
		model.addAttribute("dm", dm);
		return "dm/detail";
	}

	
	// DM 대화내용, 작성자 등 전체검색 select  추가
	@RequestMapping(value="/dm/search", method=RequestMethod.GET)
	public String selectSearchDmList(
			@RequestParam("ItemSearch") String ItemSearch
			, @RequestParam("searchCondition") String searchCondition
			, @RequestParam("searchKeyword") String searchKeyword
			, Model model) {
//		TrendHive dm = dmService.selectSearchDmList(ItemSearch);
		try {
			Map<String, String> paramMap = new HashMap<String, String>();
			paramMap.put("searchCondition", searchCondition);
			paramMap.put("searchKeyword", searchKeyword);
			List<TrendHive> searchList = dmService.selectSearchDmList(paramMap);
//			int totalCount = dmService.getTotalCount(paramMap);
			model.addAttribute("searchCondition", searchCondition);
			model.addAttribute("searchKeyword", searchKeyword);
			return "dm/search";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
		}
		return searchKeyword;
	}
	
	
	// 최신대화순, 오래된대화순 정렬 select 추가
	@GetMapping("/Interval")
	public String alignDmInterval(@RequestParam("dmNo") int dmNo,
	@RequestParam(value="sort", defaultValue="desc") 
	String sort, Model model) {
	List<TrendHive> dmList = dmService.selectDmDetail(dmNo, sort);
	model.addAttribute("dmList", dmList);
		return "list";
	}
	
	
	// 보낸메시지, 받은메시지 정렬 select 추가
	
	
	
	// dm창 특정메시지 클릭 전 초기 화면 
	
	// 컨트롤러에 적고, 대화내용 불러와야하는 @getMapping
	// dm창 날짜, 시간 기록 
	
	// dm창 메시지 주고받기 
}
