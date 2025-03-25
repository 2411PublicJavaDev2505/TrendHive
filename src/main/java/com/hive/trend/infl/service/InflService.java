package com.hive.trend.infl.service;

import com.hive.trend.infl.controller.dto.InflLoginRequest;
import com.hive.trend.infl.controller.dto.InflModifyRequest;
import com.hive.trend.infl.domain.InflVO;

public interface InflService {

	int insertInfl(InflVO infl);

	InflVO selectOneByLogin(InflLoginRequest infl);

	InflVO selectOneById(String inflId);

	int updateInfl(InflModifyRequest infl);

	int deleteInfl(String inflId);

}
