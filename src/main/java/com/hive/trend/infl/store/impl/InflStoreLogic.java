package com.hive.trend.infl.store.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hive.trend.infl.controller.dto.InflLoginRequest;
import com.hive.trend.infl.controller.dto.InflModifyRequest;
import com.hive.trend.infl.domain.InflVO;
import com.hive.trend.infl.store.InflStore;

@Repository
public class InflStoreLogic implements InflStore{

	@Override
	public int insertInfl(SqlSession session, InflVO infl) {
		int result = session.insert("InflMapper.insertInfl", infl);
		return result;
	}

	@Override
	public InflVO selectOneByLogin(SqlSession session, InflLoginRequest infl) {
		InflVO result = session.selectOne("InflMapper.selectOneByLogin", infl);
		return result;
	}

	@Override
	public int updateInfl(SqlSession session, InflModifyRequest infl) {
		int result = session.update("InflMapper.updateInfl", infl);
		return result;
	}

	@Override
	public int deleteInfl(SqlSession session, String inflId) {
		int result = session.delete("InflMapper.deleteInfl", inflId);
		return result;
	}

	@Override
	public InflVO selectOneById(SqlSession session, String inflId) {
		InflVO result = session.selectOne("InflMapper.selectOneById", inflId);
		return result;
	}

}
