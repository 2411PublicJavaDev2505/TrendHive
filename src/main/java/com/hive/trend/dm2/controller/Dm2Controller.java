package com.hive.trend.dm2.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hive.trend.common.FileUtil;
import com.hive.trend.common.PageUtil;
import com.hive.trend.dm2.model.service.Dm2Service;
import com.hive.trend.dm2.model.vo.DmVO;
import com.hive.trend.dm2.model.vo.TrendHive;
import com.hive.trend.inflboard.model.service.InflBoardService;

@Controller
@RequestMapping("/dm2")
public class Dm2Controller {

	private static final String FILE_SAVE_PATH = null;
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
	public String dmList(
			@RequestParam(value="page", defaultValue="1") int currentPage,
			@RequestParam(value = "searchKeyword", required = false) String searchKeyword
			, HttpSession session 
			, Model model) {
//		String userId = (String)session.getAttribute("userId");
		String id = (String)session.getAttribute("companyId");
//		List<TrendHive> dm = dm2Service.getDmList(id);
	try {	
		List<TrendHive> dm = dm2Service.getDmList("olauser1", currentPage);
		int totalCount = dm2Service.getTotalCount("olauser1");
		Map<String, Integer> pageInfo = new PageUtil().generatePageInfo(totalCount, currentPage);

		if(!dm.isEmpty()) {
			model.addAttribute("maxPage", pageInfo.get("maxPage"));
			model.addAttribute("startNavi", pageInfo.get("startNavi"));
			model.addAttribute("endNavi", pageInfo.get("endNavi"));
			model.addAttribute("dmList", dm);
			return "dm2/list";
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
		
		
	// 메시지 작성 페이지 이동 (최초 DM 보내기)
	@GetMapping("/write")
	public String dmWrite() {
		return "dm2/write"; // 최초 DM 보내는 페이지
	}
	
	// 메시지 전송 insert (DM 답장 보내기)
	@PostMapping("/send")
	public String sendDm(@RequestParam("receiveId") String receiveId,
			@RequestParam("dmContents") String dmContents,
			HttpSession session, Model model) {
		String sendId = (String)session.getAttribute("userId");
		try {
			dm2Service.sendDm(sendId, receiveId, dmContents);
			return "redirect:/dm2/list"; 
			
		} catch (Exception e) {
			e.printStackTrace();
            model.addAttribute("errorMessage", "DM 보내기 실패");
            return "common/error";
		}
			
	}
	
	// 메시지 답장 페이지 이동
    @GetMapping("/send")
    public String replyDm(@RequestParam("dmNo") int dmNo, Model model) {
        try {
            DmVO dmMessage = dm2Service.getDmMessageById(dmNo);  // DM 내용 가져오기
            model.addAttribute("dm", dmMessage);
            return "dm2/send";  // 답장 페이지로 이동
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("errorMessage", "답장 조회 실패");
            return "common/error";
        }
    }
	
// // 답장 보내기
//    @PostMapping("/send")
//    public String replyDmSend(@RequestParam("dmNo") int dmNo,
//                               @RequestParam("dmContents") String dmContents,
//                               HttpSession session,
//                               Model model) {
//        String sendId = (String) session.getAttribute("userId");
//        try {
//            DmVO dmMessage = dm2Service.getDmMessageById(dmNo);
//            String receiveId = dmMessage.getSendId();  // 원래 보내는 사람의 ID
//            dm2Service.sendDm(sendId, receivId, dmContents);  // 답장 전송
//            return "redirect:/dm2/list";  // DM 목록 페이지로 리다이렉트
//        } catch (Exception e) {
//            e.printStackTrace();
//            model.addAttribute("errorMessage", "답장 전송 실패");
//            return "common/error";
//        }
//    }

    
	@PostMapping("/dmSend.do")
	public String sendDM(@RequestParam("receiveId") String receiveId, 
			@RequestParam("content") String content,
			@RequestParam(value="file", required = false) MultipartFile file, Model model) {
		
//		// receiveIds가 콤마로 구분된 여러 명의 아이디일 경우, split()을 통해 배열로 나눈다.
//		String[] receivers = receiveIds.split(",");
//		
//		for(String receiver : receivers) {
//			DmMessage dm = new DmMessage();
//			dm.setreceiveId(receiver.trim());
//		}
		
		try {
			String fileName = null;
			// 파일이 존재하면 저장
            if (file != null && !file.isEmpty()) {
                fileName = file.getOriginalFilename();
                File saveFile = new File("/resources/bUploadFiles", fileName);
                file.transferTo(saveFile);
			}
         // 여러 명에게 메시지를 보내기 위한 반복문
            String[] receivers = receiveId.split(",");
            for (String receiver : receivers) {
                receiver = receiver.trim();  // 아이디 앞뒤 공백 제거
                // DM 메시지 전송 서비스 호출
                dm2Service.sendDm(receiver, content, fileName);
            }
			return "redirect:/dmList.do";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage", "파일 오류가 발생했습니다.");
			return "error";
			
		}
	}
	
	// 메시지 삭제
	@GetMapping("/delete")
	public String deleteDm(
			@RequestParam("dmNo") int dmNo
			, Model model) {
			int result = dm2Service.deleteDmList(dmNo);
			return "redirect:/dm2/list";
	}

	
	// 메시지 상세페이지 detail
	@GetMapping("/detail")
	public String detailDm(
			@RequestParam("dmNo") int dmNo
			, Model model) {
		try {
			DmVO dm = dm2Service.selectOneByNo(dmNo);
			model.addAttribute("dm", dm);
			return "dm2/detail";
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			model.addAttribute("errorMessage", e.getMessage());
			return "common/error";
		}
	}
	
	
	//해당메서드 삭제
//	@RequestMapping(value = "/reply", method = RequestMethod.GET)
//	public String reply(@RequestParam(value = "dmNo", required = false, defaultValue = "0") int dmNo, Model model) {
//	    if (dmNo == 0) {
//	        return "redirect:/dmList.do"; // 값이 없으면 목록으로 이동
//	    }
//
//	    DM dm = dm2Service.getDMById(dmNo);
//	    model.addAttribute("dm", dm);
//
//	    return "dm/reply";
//	}
//	//메시지 조회/정렬
//	 @GetMapping("/search")
//	    public String searchDmList(@RequestParam("totalDmSelect") String filter, Model model, HttpSession session) {
//	        String userId = (String) session.getAttribute("userId"); // 로그인한 유저 ID 가져오기
//	        
//	        List<DmVO> dmList;
//	        if ("totalDm".equals(filter)) {
//	            // 전체 DM (보낸DM + 받은DM)
//	            dmList = dm2Service.getTotalDmList(userId);
//	        } else if ("sendDm".equals(filter)) {
//	            // 받은 DM만 조회
//	            dmList = dm2Service.getReceivedDmList(userId);
//	        } else {
//	            dmList = new ArrayList<>(); // 예외 처리
//	        }
//
//	        model.addAttribute("dmList", dmList);
//	        return "views/dm2/list";
//	 }
	
// 차단도 넣고
// 패이지내이션 넣고 하자고,,.
}
