package com.hive.trend.dm.model.service;

import java.util.List;
import java.util.Map;

import com.hive.trend.dm.model.vo.TrendHive;

public interface DmService {

	List<TrendHive> getDmList(String userId);

	int insertDm(TrendHive dm);

	TrendHive getDmDetail(int dmNo);

	int getTotalCount(Map<String, String> paramMap);

	List<TrendHive> selectSearchDmList(Map<String, String> paramMap);

	List<TrendHive> selectDmDetail(int dmNo, String sort);


}
