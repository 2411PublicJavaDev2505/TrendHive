package com.hive.trend.dm2.model.service;

import java.util.List;

import com.hive.trend.dm2.model.vo.TrendHive;

public interface Dm2Service {

	List<TrendHive> getTrendHive(String userId);

	void sendDm(String sendId, String receiverId, String dmContents);


}
