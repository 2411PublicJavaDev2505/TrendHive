package com.hive.trend.inflboard.model.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hive.trend.inflboard.controller.dto.InflBoardModifyRequest;
import com.hive.trend.inflboard.controller.dto.inflBoardAddRequest;
import com.hive.trend.inflboard.model.service.InflBoardService;
import com.hive.trend.inflboard.model.store.InflBoardStore;
import com.hive.trend.inflboard.model.vo.InflBoardVO;

@Service
public class InflBoardServiceImpl implements InflBoardService{
	
	@Autowired
	private InflBoardStore ipStore;
	
	@Autowired
	private SqlSession session;

	@Override
	public List<InflBoardVO> selectListAll(int currentPage) {
		List<InflBoardVO> nList = ipStore.selectListAll(session, currentPage);
		return nList;
	}

	@Override
	public int getTotalCount() {
		int totalCount = ipStore.getTotalCount(session);
		return totalCount;
	}

	@Override
	public List<InflBoardVO> searchListByKeyword(Map<String, String> paramMap, int currentPage) {
		List<InflBoardVO> searchList= ipStore.searchListByKeyword(session, paramMap, currentPage);
		return searchList;
	}

	@Override
	public int getTotalCount(Map<String, String> paramMap) {
		int totalCount = ipStore.getTotalCount(session, paramMap);
		return totalCount;
	}

	@Override
	public int addInflBoard(inflBoardAddRequest inflBoard) {
		int result = ipStore.addInflBoard(session, inflBoard);
		return result;
	}

	@Override
	public InflBoardVO selectOneByNo(int inflPRNo) {
		InflBoardVO inflBoard = ipStore.selectOneByNo(session, inflPRNo);
		return inflBoard;
	}

	@Override
	public int deleteInflBoard(int inflPRNo) {
		int result = ipStore.deleteInflBoard(session, inflPRNo);
		return result;
	}

	@Override
	public int updateBoard(InflBoardModifyRequest inflBoard) {
		int result = ipStore.updateBoard(session, inflBoard);
		return result;
	}

}
