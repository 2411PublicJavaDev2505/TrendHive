package com.hive.trend.notice.store.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hive.trend.notice.controller.dto.NoticeAddRequest;
import com.hive.trend.notice.controller.dto.NoticeModifyRequest;
import com.hive.trend.notice.domain.NoticeVO;
import com.hive.trend.notice.store.NoticeStore;

@Repository
public class NoticeStoreLogic implements NoticeStore{

	@Override
	public int updateNotice(SqlSession session, NoticeModifyRequest notice) {
		int result = session.update("NoticeMapper.updateNotice", notice);
		return result;
	}

	@Override
	public NoticeVO selectOneByNo(SqlSession session, int noticeNo) {
		NoticeVO notice = session.selectOne("NoticeMapper.selectOneByNo", noticeNo);
		return notice;
	}

	@Override
	public int insertNotice(SqlSession session, NoticeAddRequest notice) {
		int result = session.insert("NoticeMapper.insertNotice", notice);
		return result;
	}

	@Override
	public List<NoticeVO> selectNoticeList(SqlSession session, int currentPage) {
		int limit = 10;
		int offset = (currentPage-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		List<NoticeVO> nList = session.selectList("NoticeMapper.selectNoticeList", null, rowBounds);
		return nList;
	}

	@Override
	public int getTotalCount(SqlSession session) {
		int totalCount = session.selectOne("NoticeMapper.getTotalCount", session);
		return totalCount;
	}

	@Override
	public int deleteNotice(SqlSession session, int noticeNo) {
		int result = session.update("NoticeMapper.deleteNotice", noticeNo);
		return result;
	}

	@Override
	public List<NoticeVO> searchListByKeyword(SqlSession session, Map<String, String> paramMap, int currentPage) {
		int limit = 10;
		int offset = (currentPage-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		List<NoticeVO> searchList = session.selectList("NoticeMapper.searchListByKeyword", paramMap, rowBounds);
		return searchList;
	}

	@Override
	public int getTotalCount(SqlSession session, Map<String, String> paramMap) {
		int totalCount = session.selectOne("NoticeMapper.getTotalCountBySearch", paramMap);
		return totalCount;
	}
}
