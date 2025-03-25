package com.hive.trend.dm2.model.store.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hive.trend.dm2.model.store.Dm2Store;
import com.hive.trend.dm2.model.vo.TrendHive;

@Repository
public class Dm2StoreLogic implements Dm2Store{

	@Override
	public List<TrendHive> getTrendHive(SqlSession session, String userId) {
		List<TrendHive> result = session.selectList("Dm2Mapper.getTrendHive", userId);
		return result;
	}

	@Override
	public void sendDm(SqlSession session, String sendId, String receiverId, String dmContents) {
		String[] obj = {sendId, receiverId, dmContents};
		session.insert("Dm2Mapper.sendDm", obj);
	}

}
