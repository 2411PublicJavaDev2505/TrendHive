package com.hive.trend.dm.model.store;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.hive.trend.dm.model.vo.TrendHive;

public interface DmStore {
	List<TrendHive> getDmList(SqlSession session, String userId);

	int insertDm(SqlSession session, TrendHive dm);

	TrendHive getDmDetail(SqlSession session, int dmNo);

	int getTotalCount(SqlSession session, Map<String, String> paramMap);

	List<TrendHive> selectSearchDmList(SqlSession session, Map<String, String> paramMap);

	List<TrendHive> selectDmDetail(SqlSession session, String sort);
	
}


