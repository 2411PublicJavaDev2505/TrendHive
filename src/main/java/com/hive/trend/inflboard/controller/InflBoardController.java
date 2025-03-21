package com.hive.trend.inflboard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hive.trend.common.FileUtil;
import com.hive.trend.common.PageUtil;
import com.hive.trend.inflboard.controller.dto.InflBoardModifyRequest;
import com.hive.trend.inflboard.controller.dto.inflBoardAddRequest;
import com.hive.trend.inflboard.model.service.InflBoardService;
import com.hive.trend.inflboard.model.vo.InflBoardVO;

@Controller
@RequestMapping("/inflboard")
public class InflBoardController {
	
	private InflBoardService nService;
	private FileUtil fileUtil;
	private PageUtil pageUtil;
	
	@Autowired
	public InflBoardController(InflBoardService nService, PageUtil pageUtil) {
		this.nService=nService;
		this.fileUtil=fileUtil;
		this.pageUtil=pageUtil;
	}

	@GetMapping("/list")
	public String InflPRList(
			@RequestParam(value="page", defaultValue="1") int currentPage
			, Model model) {
		try {
			List<InflBoardVO> nList = nService.selectListAll(currentPage);
			int totalCount = nService.getTotalCount();
			Map<String, Integer> pageInfo = new PageUtil().generatePageInfo(totalCount, currentPage);

			if(!nList.isEmpty()) {
				model.addAttribute("maxPage", pageInfo.get("maxPage"));
				model.addAttribute("startNavi", pageInfo.get("startNavi"));
				model.addAttribute("endNavi", pageInfo.get("endNavi"));
				model.addAttribute("nList", nList);
				return "inflBoard/list";
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
	
	@GetMapping("/search")
	public String BookSearch(
			@RequestParam("searchCondition") String searchCondition
			, @RequestParam("searchKeyword") String searchKeyword
			, @RequestParam(value="currentPage", defaultValue="1") int currentPage
			, Model model) {
		try {
			//(list복붙) +search에 추가되는것 
			Map<String, String> paramMap = new HashMap<String, String>();
			paramMap.put("searchCondition", searchCondition);
			paramMap.put("searchKeyword", searchKeyword);
			
			int totalCount = nService.getTotalCount(paramMap);
			List<InflBoardVO> searchList = nService.searchListByKeyword(paramMap, currentPage); 
			
			Map<String, Integer> pageInfo = pageUtil.generatePageInfo(totalCount, currentPage);
				model.addAttribute("maxPage", pageInfo.get("maxPage"));
				model.addAttribute("startNavi", pageInfo.get("startNavi"));
				model.addAttribute("endNavi", pageInfo.get("endNavi"));
				
				model.addAttribute("searchList", searchList);
				model.addAttribute("searchCondition", searchCondition);
				model.addAttribute("searchKeyword", searchKeyword);
				return "inflBoard/search";
				
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage", e.getMessage());
				return "common/error";
		}
	}

	@GetMapping("/add")
	public String inflBoardAdd(Model model) {
		try {
			return "inflBoard/add";	//리턴은 폴더명!!		
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage", e.getMessage());
			return "common/error";
		}
	}

	@PostMapping("/add")
	public String inflBoardAdd(
			@ModelAttribute inflBoardAddRequest inflBoard
			, HttpSession session
			, Model model) {
		try {
			int result = nService.addInflBoard(inflBoard);
			return "redirect:/inflboard/list";//리다이렉트 url
		} catch (Exception e) {
		e.printStackTrace();
		model.addAttribute("errorMessage", e.getMessage());
		return "common/error";
		}
	}	
	
	@GetMapping("/detail")
	public String BookDetail(
			@RequestParam("inflPRNo") int inflPRNo
			, Model model) {
		try {
			InflBoardVO inflBoard = nService.selectOneByNo(inflPRNo);
			model.addAttribute("inflBoard", inflBoard);
			return "inflBoard/detail";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			model.addAttribute("errorMessage", e.getMessage());
			return "common/error";
		}		
	}

	@GetMapping("/delete")
	public String InflBoardDelete(
			@RequestParam("inflPRNo")int inflPRNo
			, Model model) {
		try {
			int result = nService.deleteInflBoard(inflPRNo);
			
			return "redirect:/inflboard/list";
			
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage", e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("/modify/{inflPRNo}")
	public String showBoardModifyForm(@PathVariable int inflPRNo, Model model) {
		try {
			InflBoardVO inflBoard = nService.selectOneByNo(inflPRNo);
			model.addAttribute("inflBoard", inflBoard);
			return "inflBoard/modify";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	@PostMapping("/modify")
	public String modifyBoard(@ModelAttribute InflBoardModifyRequest inflBoard
			, @RequestParam("reloadFile") MultipartFile reloadFile
			, HttpSession session, Model model) {
		try {
			if(session.getAttribute("inflId") == null) {
				model.addAttribute("errorMsg", "로그인이 필요합니다..!");
				return "common/error";
			}
			String inflId = (String)session.getAttribute("inflId");
			
			if(!inflId.equals(inflBoard.getInflId())){
				model.addAttribute("errorMsg", "자신이 작성한 글만 수정할 수 있습니다.");
				return "common/error";
			}
			if(reloadFile != null && !reloadFile.getOriginalFilename().isBlank()) {
				Map<String, String> fileInfo = fileUtil.saveFile(reloadFile, session, "board");
				inflBoard.setFileName(fileInfo.get("Filename"));
				inflBoard.setFileRename(fileInfo.get("FileRename"));
				inflBoard.setFilePath(fileInfo.get("Filepath"));
			}
		 	int result = nService.updateBoard(inflBoard);	
			return "redirect:/inflboard/detail/"+inflBoard.getInflPRNo();
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error"; 
		}
	}

}
