package com.hive.trend.dm2.model.store.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hive.trend.dm2.model.store.Dm2Store;
import com.hive.trend.dm2.model.vo.DmVO;
import com.hive.trend.dm2.model.vo.TrendHive;

@Repository
public class Dm2StoreLogic implements Dm2Store{

	@Override
	public List<TrendHive> getDmList(SqlSession session, String userId) {
		List<TrendHive> result = session.selectList("Dm2Mapper.getDmList", userId);
		return result;
	}

	@Override
	public void sendDm(SqlSession session, String sendId, String receiverId, String dmContents) {
		String[] obj = {sendId, receiverId, dmContents};
		session.insert("Dm2Mapper.sendDm", obj);
	}

	@Override
	public int deleteDmList(SqlSession session, int dmNo) {
		int result = session.delete("Dm2Mapper.deleteDmList", dmNo);
		return result;
	}

	@Override
	public DmVO selectOneByNo(SqlSession session, int dmNo) {
		DmVO dm = session.selectOne("Dm2Mapper.selectOneByNo", dmNo);
		return dm;
	}

//	@Override
//	public List<DmVO> selectTotalDm(SqlSession session, String userId) {
//		List<DmVO> result = session.selectList("Dm2Mapper.selectList", userId);
//		return result;
//	}
//
//	@Override
//	public List<DmVO> selectReceivedDm(SqlSession session, String userId) {
//		List<DmVO> result = session.selectList("Dm2Mapper.selectList", userId);
//		return result;
//	}

}
