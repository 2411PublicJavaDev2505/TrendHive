package com.hive.trend.inflboard.model.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
