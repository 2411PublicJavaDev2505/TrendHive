package com.hive.trend.dm2.model.service.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hive.trend.dm2.model.service.Dm2Service;
import com.hive.trend.dm2.model.store.Dm2Store;
import com.hive.trend.dm2.model.vo.DmVO;
import com.hive.trend.dm2.model.vo.TrendHive;
@Service
public class Dm2ServiceImpl implements Dm2Service{
	@Autowired
	private Dm2Store dStore;
	@Autowired
	private SqlSession session;
	
	@Override
	public List<TrendHive> getDmList(String userId) {
		List<TrendHive> list = dStore.getDmList(session, userId);
		return list;
	}
	@Override
	public void sendDm(String sendId, String receiverId, String dmContents) {
		dStore.sendDm(session, sendId, receiverId, dmContents);
	}
	@Override
	public int deleteDmList(int dmNo) {
		int result = dStore.deleteDmList(session, dmNo);
		return result;
	}
	@Override
	public DmVO selectOneByNo(int dmNo) {
		DmVO dm = dStore.selectOneByNo(session, dmNo);
		return dm;
	}
//	@Override
//	public List<DmVO> getTotalDmList(String userId) {
//		List<DmVO> totalList = dStore.selectTotalDm(session, userId);
//		return totalList;
//	}
//	@Override
//	public List<DmVO> getReceivedDmList(String userId) {
//		List<DmVO> receiveList = dStore.selectReceivedDm(session,userId);
//		return receiveList;
//	}

}
