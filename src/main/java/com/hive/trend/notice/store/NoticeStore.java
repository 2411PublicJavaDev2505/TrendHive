package com.hive.trend.notice.store;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.hive.trend.notice.controller.dto.NoticeAddRequest;
import com.hive.trend.notice.controller.dto.NoticeModifyRequest;
import com.hive.trend.notice.domain.NoticeVO;

public interface NoticeStore {

	int updateNotice(SqlSession session, NoticeModifyRequest notice);

	NoticeVO selectOneByNo(SqlSession session, int noticeNo);

	int insertNotice(SqlSession session, NoticeAddRequest notice);

	List<NoticeVO> selectNoticeList(SqlSession session, int currentPage);

	int getTotalCount(SqlSession session);

	int deleteNotice(SqlSession session, int noticeNo);

	List<NoticeVO> searchListByKeyword(SqlSession session, Map<String, String> paramMap, int currentPage);

	int getTotalCount(SqlSession session, Map<String, String> paramMap);

}
