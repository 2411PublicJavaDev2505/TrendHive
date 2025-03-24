package com.hive.trend.dm.model.service.Impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hive.trend.dm.model.service.DmService;
import com.hive.trend.dm.model.store.DmStore;
import com.hive.trend.dm.model.vo.TrendHive;
@Service
public class DmServiceImpl implements DmService {

	@Autowired
	private DmStore dStore;
	@Autowired
	private SqlSession session;
	
	// list 조회 selectByDm
	@Override
	public List<TrendHive> getDmList(String userId) {
		List<TrendHive> result = dStore.getDmList(session, userId);
		return result;
	}

	// insert
	@Override
	public int insertDm(TrendHive dm) {
		int result = dStore.insertDm(session, dm);
		return result;
	}

	// list 메시지 상세조회 selectOneByDm
	@Override
	public TrendHive getDmDetail(int dmNo) {
		TrendHive result = dStore.getDmDetail(session, dmNo);
		return result;
	}


	@Override
	public int getTotalCount(Map<String, String> paramMap) {
		int totalCount = dStore.getTotalCount(session, paramMap);
		return totalCount;
	}

	@Override
	public List<TrendHive> selectSearchDmList(Map<String, String> paramMap) {
		List<TrendHive> searchList = dStore.selectSearchDmList(session, paramMap);
		return searchList;
	}

	@Override
	public List<TrendHive> selectDmDetail(int dmNo, String sort) {
		List<TrendHive> dmList = dStore.selectDmDetail(session, sort);
		return dmList;
	}


}
