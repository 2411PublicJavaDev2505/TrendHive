package com.hive.trend.notice.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.hive.trend.notice.controller.dto.NoticeAddRequest;
import com.hive.trend.notice.controller.dto.NoticeModifyRequest;
import com.hive.trend.notice.domain.NoticeVO;
import com.hive.trend.notice.service.NoticeService;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	
	private NoticeService nService;
	private FileUtil fileUtil;
	private PageUtil pageUtil;
	
	@Autowired
	public NoticeController(NoticeService nService, FileUtil fileUtil
			, PageUtil pageUtil) {
		this.nService = nService;
		this.fileUtil = fileUtil;
		this.pageUtil = pageUtil;
	}
    
    @GetMapping("/insert")
    public String showNoticeForm() {
    	return "notice/insert";
    }
    
    @PostMapping("/insert")
    public String noticeInsert(@ModelAttribute NoticeAddRequest notice
    		, HttpServletRequest request, HttpServletResponse response
    		, HttpSession session
    		, Model model) {
    	try {
			if(session.getAttribute("companyId") != null) {
				notice.setNoticeWriter((String)session.getAttribute("companyId"));
			}else {
				model.addAttribute("errorMsg", "권한이 불충분합니다.");
				return "common/error";
			}
			int result = nService.insertNotice(notice);
			if(result > 0) {
				return "redirect:/notice/adminNotice";
			}else {
				model.addAttribute("errorMsg", "공지사항 등록에 실패하였습니다.");
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
    }
    
    @GetMapping("/update")
    public String showUpdateForm(@RequestParam("noticeNo") int noticeNo
    		,Model model) {
    	try {
			NoticeVO notice = nService.selectOneByNo(noticeNo);
			model.addAttribute("notice", notice);
			return "notice/update";
		} catch (Exception e) {
			e.printStackTrace();
			return "common/error";
		}
    }
    @PostMapping("/update")
    public String updateNotice(@ModelAttribute NoticeModifyRequest notice
    		, HttpSession session, Model model) {
    	try {
    		if(session.getAttribute("companyId") == null) {
    			model.addAttribute("errorMsg", "로그인이 필요합니다.");
    			return "common/error";
    		}
    		String companyId = (String)session.getAttribute("companyId");
    		System.out.println(companyId);
    		System.out.println(notice.getNoticeWriter());
    		if(!companyId.equals(notice.getNoticeWriter())) {
    			model.addAttribute("errorMsg", "수정 권한이 없습니다.");
    			return "common/error";
    		}
    		int result = nService.updateNotice(notice);
    		return "redirect:/notice/detail?noticeNo="+notice.getNoticeNo();
    		}catch (Exception e) {
    			e.printStackTrace();
    			model.addAttribute("errorMsg", e.getMessage());
    			return "common/error";
			}
    	
    	
    }
    
    @GetMapping("/adminNotice")
	public String showNoticeList(@RequestParam(value="page", defaultValue="1") int currentPage
			, Model model) {
		try {
			List<NoticeVO> nList = nService.selectNoticeList(currentPage);
			int totalCount = nService.getTotalCount();
			Map<String, Integer> pageInfo = pageUtil.generatePageInfo(totalCount, currentPage);
			model.addAttribute("maxPage", pageInfo.get("maxPage"));
			model.addAttribute("startNavi", pageInfo.get("startNavi"));
			model.addAttribute("endNavi", pageInfo.get("endNavi"));
			model.addAttribute("nList", nList);
			return "notice/adminNotice";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "common/error";
		}	
		
	}
    @GetMapping("/detail")
    public String showNoticeDetail(
    		@RequestParam("noticeNo") int noticeNo
    		, Model model) {
    	try {
			NoticeVO notice = nService.selectOneByNo(noticeNo);
			model.addAttribute("notice", notice);
			return "notice/detail";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
    }
    @GetMapping("/delete")
    public String deleteNotice(@RequestParam("noticeNo") int noticeNo
    		, Model model) {
    	try {
			int result = nService.deleteNotice(noticeNo);
			return "redirect:/notice/adminNotice";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
    }
    @GetMapping("/notice/search")
    public String showSearchList(
    		@RequestParam("searchCondition") String searchCondition
    		, @RequestParam("searchKeyword") String searchKeyword
    		, @RequestParam(value="page", defaultValue="1") int currentPage
    		, Model model) {
    	try {
			Map<String, String> paramMap = new HashMap<String, String>();
			paramMap.put("searchCondition", searchCondition);
			paramMap.put("searchKeyword", searchKeyword);
			List<NoticeVO> searchList = nService.searchListByKeyword(paramMap, currentPage);
			int totalCount = nService.getTotalCount(paramMap);
			Map<String, Integer> pageInfo = pageUtil.generatePageInfo(totalCount, currentPage);
			model.addAttribute("maxPage", pageInfo.get("maxPage"));
			model.addAttribute("startNavi", pageInfo.get("startNavi"));
			model.addAttribute("endNavi", pageInfo.get("endNavi"));
			model.addAttribute("searchList", searchList);
			model.addAttribute("searchCondition", searchCondition);
			model.addAttribute("searchKeyword", searchKeyword);
			return "notice/search";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
    }
    
    
}


