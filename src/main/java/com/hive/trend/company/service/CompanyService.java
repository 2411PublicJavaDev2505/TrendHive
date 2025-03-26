package com.hive.trend.company.service;

import com.hive.trend.company.controller.dto.CompanyLoginRequest;
import com.hive.trend.company.controller.dto.CompanyModifyRequest;
import com.hive.trend.company.controller.dto.CompanyPasswordRequest;
import com.hive.trend.company.domain.CompanyVO;

public interface CompanyService {

	int insertCompany(CompanyVO company);

	CompanyVO selectOneByLogin(CompanyLoginRequest company);
	
	CompanyVO selectOneByCompanyId(String companyId);

	int deleteCompany(String companyId);

	int updateCompany(CompanyVO company);

	CompanyVO selectOneById(String companyId);

	CompanyVO selectOneByEmail(CompanyPasswordRequest company);

}
