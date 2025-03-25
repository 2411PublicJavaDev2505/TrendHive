package com.hive.trend.companyboard.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hive.trend.common.FileUtil;
import com.hive.trend.common.PageUtil;
import com.hive.trend.companyboard.controller.dto.CompanyBoardAddRequest;
import com.hive.trend.companyboard.model.service.CompanyBoardService;
import com.hive.trend.companyboard.model.vo.CompanyBoardVO;
import com.hive.trend.inflboard.controller.dto.inflBoardAddRequest;

@Controller
@RequestMapping("/companyboard")
public class CompanyBoardController {
	
	private CompanyBoardService cpService;
	private FileUtil fileUtil;
	private PageUtil pageUtil;
	
	public CompanyBoardController(CompanyBoardService cpService, FileUtil fileUtil, PageUtil pageUtil) {
		this.cpService=cpService;
		this.fileUtil=fileUtil;
		this.pageUtil=pageUtil;
	}
	
	@GetMapping("/list")
	public String CompanyPRList(
			@RequestParam(value="page", defaultValue="1") int currentPage
			, Model model) {
		try {
			List<CompanyBoardVO> cpList = cpService.selectListAll(currentPage);
			int totalCount = cpService.getTotalCount();
			Map<String, Integer> pageInfo = new PageUtil().generatePageInfo(totalCount, currentPage);
			
			if(!cpList.isEmpty()) {
				model.addAttribute("maxPage", pageInfo.get("maxPage"));
				model.addAttribute("startNavi", pageInfo.get("startNavi"));
				model.addAttribute("endNavi", pageInfo.get("endNavi"));
				model.addAttribute("cpList", cpList);
				return "companyBoard/list";
				//하나오류2!! ※폴더명이라서 케멀케이스 반영※ vs리다이렉트는 말그래도 url이라 소문자
			}else {
				model.addAttribute("errorMessage", "데이터가 존재하지 않습니다.");
				return "common/error";
			}	
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage", e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("/add")
	public String companyBoardAdd(Model model) {
		try {
			return "companyBoard/add";	//리턴은 폴더명!!		
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage", e.getMessage());
			return "common/error";
		}
	}

	@PostMapping("/add")
	public String companyBoardAdd(
			@ModelAttribute CompanyBoardAddRequest companyBoard
			, @RequestParam("uploadFile") MultipartFile uploadFile
			, HttpSession session, Model model) {
		try {
			if(uploadFile != null && !uploadFile.getOriginalFilename().isBlank()) {
				//비즈니스로직
					Map<String, String> fileInfo = fileUtil.saveFile(uploadFile, session, "companyBoard");
					companyBoard.setFileName(fileInfo.get("cFilename"));//saveFile의 리턴부분
					companyBoard.setFileRename(fileInfo.get("cFileRename"));
					companyBoard.setFilePath(fileInfo.get("cFilepath"));
			}
			int result = cpService.addCompanyBoard(companyBoard);
			return "redirect:/companyboard/list";//리다이렉트 url
		} catch (Exception e) {
		e.printStackTrace();
		model.addAttribute("errorMessage", e.getMessage());
		return "common/error";
		}
	}	

}
