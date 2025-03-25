package com.hive.trend.infl.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hive.trend.infl.controller.dto.InflLoginRequest;
import com.hive.trend.infl.controller.dto.InflModifyRequest;
import com.hive.trend.infl.domain.InflVO;
import com.hive.trend.infl.service.InflService;
import com.hive.trend.infl.store.InflStore;

@Service
public class InflServiceImpl implements InflService{
	
	@Autowired
	private InflStore iStore;
	@Autowired
	private SqlSession session;
	@Override
	public int insertInfl(InflVO infl) {
		int result = iStore.insertInfl(session, infl);
		return result;
	}

	@Override
	public InflVO selectOneByLogin(InflLoginRequest infl) {
		InflVO result = iStore.selectOneByLogin(session, infl);
		return result;
	}

	@Override
	public int updateInfl(InflModifyRequest infl) {
		int result = iStore.updateInfl(session, infl);
		return result;
	}

	@Override
	public int deleteInfl(String inflId) {
		int result = iStore.deleteInfl(session, inflId);
		return result;
	}

	@Override
	public InflVO selectOneById(String inflId) {
		InflVO result = iStore.selectOneById(session, inflId);
		return result;
	}
}
