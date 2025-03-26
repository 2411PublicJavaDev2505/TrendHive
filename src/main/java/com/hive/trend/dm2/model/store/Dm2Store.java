package com.hive.trend.dm2.model.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hive.trend.dm2.model.vo.DmVO;
import com.hive.trend.dm2.model.vo.TrendHive;

public interface Dm2Store {

	List<TrendHive> getDmList(SqlSession session, String userId);

	void sendDm(SqlSession session, String sendId, String receiverId, String dmContents);

	int deleteDmList(SqlSession session, int dmNo);

	DmVO selectOneByNo(SqlSession session, int dmNo);

//	List<DmVO> selectTotalDm(SqlSession session, String userId);
//
//	List<DmVO> selectReceivedDm(SqlSession session, String userId);


	
}
