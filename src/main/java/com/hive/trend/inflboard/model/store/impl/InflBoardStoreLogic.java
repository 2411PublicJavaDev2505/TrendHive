package com.hive.trend.inflboard.model.store.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hive.trend.inflboard.controller.dto.InflBoardModifyRequest;
import com.hive.trend.inflboard.controller.dto.inflBoardAddRequest;
import com.hive.trend.inflboard.model.store.InflBoardStore;
import com.hive.trend.inflboard.model.vo.InflBoardVO;

@Repository
public class InflBoardStoreLogic implements InflBoardStore{

	@Override
	public List<InflBoardVO> selectListAll(SqlSession session, int currentPage) {
		int limit = 6;//보여지는 글 갯수
		int offset = (currentPage-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		List<InflBoardVO> nList = session.selectList("InflBoardMapper.selectList", null, rowBounds);
		return nList;
	}

	@Override
	public int getTotalCount(SqlSession session) {
		int totalCount = session.selectOne("InflBoardMapper.getTotalCount");
		return totalCount;
	}

	@Override
	public List<InflBoardVO> searchListByKeyword(SqlSession session, Map<String, String> paramMap, int currentPage) {
		int limit = 6;
		int offset = (currentPage-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		List<InflBoardVO> searchList= session.selectList("InflBoardMapper.selectSearchList", paramMap, rowBounds);
		return searchList;
	}

	@Override
	public int getTotalCount(SqlSession session, Map<String, String> paramMap) {
		int totalCount = session.selectOne("InflBoardMapper.getTotalCount", paramMap);
		return totalCount;
	}

	@Override
	public int addInflBoard(SqlSession session, inflBoardAddRequest inflBoard) {
		int result = session.insert("InflBoardMapper.addInflBoard", inflBoard);
		return result;
	}

	@Override
	public InflBoardVO selectOneByNo(SqlSession session, int inflPRNo) {
		InflBoardVO inflBoard = session.selectOne("InflBoardMapper.selectOneByNo", inflPRNo);
		return inflBoard;
	}

	@Override
	public int deleteInflBoard(SqlSession session, int inflPRNo) {
		int result = session.delete("InflBoardMapper.deleteInflBoard", inflPRNo);
		return result;
	}

	@Override
	public int updateBoard(SqlSession session, InflBoardModifyRequest inflBoard) {
		int result = session.update("InflBoardMapper.updateBoard", inflBoard);
		return result;
	}


}
