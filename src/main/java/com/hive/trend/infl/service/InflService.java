package com.hive.trend.infl.service;

import com.hive.trend.company.domain.CompanyVO;
import com.hive.trend.infl.controller.dto.InflLoginRequest;
import com.hive.trend.infl.controller.dto.InflModifyRequest;
import com.hive.trend.infl.controller.dto.InflPasswordRequest;
import com.hive.trend.infl.domain.InflVO;

public interface InflService {

	int insertInfl(InflVO infl);

	InflVO selectOneByLogin(InflLoginRequest infl);

	InflVO selectOneByInflId(String inflId);

	int updateInfl(InflVO infl);

	int deleteInfl(String inflId);
	
	InflVO selectOneByInflId1(String inflId);
	
	InflVO selectOneByEmail(InflPasswordRequest company);

	InflVO selectOneById(String inflId);

	int updateInfl(InflModifyRequest infl);

}
