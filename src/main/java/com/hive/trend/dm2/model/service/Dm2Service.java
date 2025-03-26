package com.hive.trend.dm2.model.service;

import java.util.List;


import com.hive.trend.dm2.model.vo.DmVO;
import com.hive.trend.dm2.model.vo.TrendHive;

public interface Dm2Service {

	void sendDm(String sendId, String receiverId, String dmContents);

	int deleteDmList(int dmNo);

//	DmVO getDMById(int dmNo);

	DmVO selectOneByNo(int dmNo);

	DmVO getDmMessageById(int dmNo);

	List<TrendHive> getDmList(String string, int currentPage);

	int getTotalCount(String string);


//	List<DmVO> getTotalDmList(String userId);
//
//	List<DmVO> getReceivedDmList(String userId);


}
