package com.hive.trend.notice.service;

import java.util.List;
import java.util.Map;

import com.hive.trend.notice.controller.dto.NoticeAddRequest;
import com.hive.trend.notice.controller.dto.NoticeModifyRequest;
import com.hive.trend.notice.domain.NoticeVO;

public interface NoticeService {

	int updateNotice(NoticeModifyRequest notice);

	NoticeVO selectOneByNo(int noticeNo);

	int insertNotice(NoticeAddRequest notice);

	int getTotalCount();

	List<NoticeVO> selectNoticeList(int currentPage);

	int deleteNotice(int noticeNo);

	int getTotalCount(Map<String, String> paramMap);

	List<NoticeVO> searchListByKeyword(Map<String, String> paramMap, int currentPage);

}
