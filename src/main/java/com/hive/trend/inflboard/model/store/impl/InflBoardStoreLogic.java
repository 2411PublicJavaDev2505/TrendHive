package com.hive.trend.inflboard.model.store.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hive.trend.inflboard.model.store.InflBoardStore;
import com.hive.trend.inflboard.model.vo.InflBoardVO;

@Repository
public class InflBoardStoreLogic implements InflBoardStore{

	@Override
	public List<InflBoardVO> selectListAll(SqlSession session, int currentPage) {
		List<InflBoardVO> nList = session.selectList("InflBoardMapper.selectList");
		return nList;
	}

	@Override
	public int getTotalCount(SqlSession session) {
		int totalCount = session.selectOne("InflBoardMapper.getTotalCount");
		return totalCount;
	}


}
