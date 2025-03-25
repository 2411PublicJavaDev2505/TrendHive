package com.hive.trend.dm2.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hive.trend.dm2.model.service.Dm2Service;
import com.hive.trend.dm2.model.vo.TrendHive;

@Controller
@RequestMapping("/dm")
public class Dm2Controller {

	@Autowired
	private Dm2Service dm2Service;
	
	
	// 받은 메시지 리스트 조회 select
	@GetMapping("/list")
	public String dmList(Model model,
		@RequestParam("userId") String userId) {
			List<TrendHive> dm = dm2Service.getTrendHive(userId);
			model.addAttribute("dmList", dm);
			return "dm/dmList";
			
		}
	// 메시지 작성 페이지 이동 
	@GetMapping("/write")
	public String dmWrite() {
		return "dm/dmWrite";
	}
	
	// 메시지 전송 insert
	@PostMapping("/send")
	public String sendDm(@RequestParam("receiverId") String receiverId,
			@RequestParam("dmContents") String dmContents,
			HttpSession session) {
		String sendId = (String)session.getAttribute("userId");
		dm2Service.sendDm(sendId, receiverId, dmContents);
		return "redirect:/message/list?userId=" + sendId; 
			
	}
	
}

// 답장도 넣고
// 차단도 넣고
// pagenation 넣고 하자고,,.
