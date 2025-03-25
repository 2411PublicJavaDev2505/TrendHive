package com.hive.trend.dm.model.store.Impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hive.trend.dm.model.store.DmStore;
import com.hive.trend.dm.model.vo.TrendHive;

@Repository
public class DmStoreLogic implements DmStore{
	
	// list 조회 selectByDm
	@Override
	public List<TrendHive> getDmList(SqlSession session, String userId){
		List<TrendHive> result = session.selectList("DmMapper.getDmList", userId);
		return result;
	}
	
	// insert
	@Override
	public int insertDm(SqlSession session, TrendHive dm) {
		int result = session.insert("DmMapper.insertDm", dm);
		return result;
	}

	// list 메시지 상세조회 selectOneByDm
	@Override
	public TrendHive getDmDetail(SqlSession session, int dmNo) {
		TrendHive result = session.selectOne("DmMapper.getDmDetail", dmNo);
		return result;
	}

	@Override
	public int getTotalCount(SqlSession session, Map<String, String> paramMap) {
		int totalCount = session.selectOne("DmMapper.getTotalCount", paramMap);
		return totalCount;
	}

	@Override
	public List<TrendHive> selectSearchDmList(SqlSession session, Map<String, String> paramMap) {
		List<TrendHive> searchList = session.selectList("DmMapper.selectSearchDmList", paramMap);
		return null;
	}

	@Override
	public List<TrendHive> selectDmDetail(SqlSession session, String sort) {
		// TODO Auto-generated method stub
		return null;
	}
}
