package com.hive.trend.inflboard.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hive.trend.common.FileUtil;
import com.hive.trend.common.PageUtil;
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

}
