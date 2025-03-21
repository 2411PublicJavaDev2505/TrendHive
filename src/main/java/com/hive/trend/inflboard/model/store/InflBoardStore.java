package com.hive.trend.inflboard.model.store;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.hive.trend.inflboard.controller.dto.InflBoardModifyRequest;
import com.hive.trend.inflboard.controller.dto.inflBoardAddRequest;
import com.hive.trend.inflboard.model.vo.InflBoardVO;

public interface InflBoardStore {

	List<InflBoardVO> selectListAll(SqlSession session, int currentPage);

	int getTotalCount(SqlSession session);

	List<InflBoardVO> searchListByKeyword(SqlSession session, Map<String, String> paramMap, int currentPage);

	int getTotalCount(SqlSession session, Map<String, String> paramMap);

	int addInflBoard(SqlSession session, inflBoardAddRequest inflBoard);

	InflBoardVO selectOneByNo(SqlSession session, int inflPRNo);

	int deleteInflBoard(SqlSession session, int inflPRNo);

	int updateBoard(SqlSession session, InflBoardModifyRequest inflBoard);


}
