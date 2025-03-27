package com.hive.trend.notice.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hive.trend.notice.controller.dto.NoticeAddRequest;
import com.hive.trend.notice.controller.dto.NoticeModifyRequest;
import com.hive.trend.notice.domain.NoticeVO;
import com.hive.trend.notice.service.NoticeService;
import com.hive.trend.notice.store.NoticeStore;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	private NoticeStore nStore;
	private SqlSession session;
	
	@Autowired
	public NoticeServiceImpl(NoticeStore nStore, SqlSession session) {
		this.nStore = nStore;
		this.session = session;
	}
	
	@Override
	public int updateNotice(NoticeModifyRequest notice) {
		int result = nStore.updateNotice(session, notice);
		return result;
	}

	@Override
	public NoticeVO selectOneByNo(int noticeNo) {
		NoticeVO notice = nStore.selectOneByNo(session, noticeNo);
		return notice;
	}

	@Override
	public int insertNotice(NoticeAddRequest notice) {
		int result = nStore.insertNotice(session, notice);
		return result;
	}

	@Override
	public int getTotalCount() {
		int totalCount = nStore.getTotalCount(session);
		return totalCount;
	}

	@Override
	public List<NoticeVO> selectNoticeList(int currentPage) {
		List<NoticeVO> nList = nStore.selectNoticeList (session, currentPage);
		return nList;
	}

	@Override
	public int deleteNotice(int noticeNo) {
		int result = nStore.deleteNotice(session, noticeNo);
		return result;
	}

	@Override
	public int getTotalCount(Map<String, String> paramMap) {
		int totalCount = nStore.getTotalCount(session, paramMap);
		return totalCount;
	}

	@Override
	public List<NoticeVO> searchListByKeyword(Map<String, String> paramMap, int currentPage) {
		List<NoticeVO> searchList = nStore.searchListByKeyword(session, paramMap, currentPage);
		return searchList;
	}

}
