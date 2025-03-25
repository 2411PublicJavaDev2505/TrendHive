package com.hive.trend.infl.store;

import org.apache.ibatis.session.SqlSession;

import com.hive.trend.infl.controller.dto.InflLoginRequest;
import com.hive.trend.infl.controller.dto.InflModifyRequest;
import com.hive.trend.infl.domain.InflVO;

public interface InflStore {

	int insertInfl(SqlSession session, InflVO infl);

	InflVO selectOneByLogin(SqlSession session, InflLoginRequest infl);

	int updateInfl(SqlSession session, InflModifyRequest infl);

	int deleteInfl(SqlSession session, String inflId);

	InflVO selectOneById(SqlSession session, String inflId);

}
