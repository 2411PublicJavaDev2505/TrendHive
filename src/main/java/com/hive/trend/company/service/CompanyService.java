package com.hive.trend.company.service;

import com.hive.trend.company.controller.dto.CompanyLoginRequest;
import com.hive.trend.company.domain.CompanyVO;

public interface CompanyService {

	int insertCompany(CompanyVO company);

	CompanyVO selectOneByLogin(CompanyLoginRequest company);

}
