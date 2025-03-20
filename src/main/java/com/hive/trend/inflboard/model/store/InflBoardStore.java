package com.hive.trend.inflboard.model.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hive.trend.inflboard.model.vo.InflBoardVO;

public interface InflBoardStore {

	List<InflBoardVO> selectListAll(SqlSession session, int currentPage);

	int getTotalCount(SqlSession session);


}
