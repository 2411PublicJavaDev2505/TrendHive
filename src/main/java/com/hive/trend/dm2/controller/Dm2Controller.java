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

import com.hive.trend.common.FileUtil;
import com.hive.trend.common.PageUtil;
import com.hive.trend.dm2.model.service.Dm2Service;
import com.hive.trend.dm2.model.vo.DmVO;
import com.hive.trend.dm2.model.vo.TrendHive;
import com.hive.trend.inflboard.model.service.InflBoardService;

@Controller
@RequestMapping("/dm")
public class Dm2Controller {

	private Dm2Service dm2Service;
	private FileUtil fileUtil;
	private PageUtil pageUtil;
	
	@Autowired
	public Dm2Controller(Dm2Service dm2Service, FileUtil fileUtil, PageUtil pageUtil) {
		this.dm2Service=dm2Service;
		this.fileUtil=fileUtil;
		this.pageUtil=pageUtil;
	}
	
	
	
	// 받은 메시지 리스트 조회 select
	@GetMapping("/list")
	public String dmList(Model model, HttpSession session) {
//		String userId = (String)session.getAttribute("userId");
		List<TrendHive> dm = dm2Service.getDmList("olauser1");
		model.addAttribute("dmList", dm);
		return "dm2/list";
		
	}
	// 메시지 작성 페이지 이동 
	@GetMapping("/write")
	public String dmWrite() {
		return "dm/write";
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
	
	// 메시지 삭제
	@GetMapping("/delete")
	public String deleteDm(
			@RequestParam("dmNo") int dmNo
			, Model model) {
		try {
			int result = dm2Service.deleteDmList(dmNo);
			return "redirect:/dm/list";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage", e.getMessage());
			return "common/error";
		}
	}
	
	// 메시지 상세페이지 detail
	@GetMapping("/detail")
	public String detailDm(
			@RequestParam("dmNo") int dmNo
			, Model model) {
	try {
		DmVO dm = dm2Service.selectOneByNo(dmNo);
		model.addAttribute("dm2", dm);
		return "inflBoard/detail";
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		model.addAttribute("errorMessage", e.getMessage());
		return "common/error";
	}
}
}

// 답장도 넣고
// 차단도 넣고
// pagenation 넣고 하자고,,.
