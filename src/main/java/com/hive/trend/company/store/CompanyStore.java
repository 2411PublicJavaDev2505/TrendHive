package com.hive.trend.company.store;

import org.apache.ibatis.session.SqlSession;

import com.hive.trend.company.controller.dto.CompanyLoginRequest;
import com.hive.trend.company.controller.dto.CompanyModifyRequest;
import com.hive.trend.company.controller.dto.CompanyPasswordRequest;
import com.hive.trend.company.domain.CompanyVO;

public interface CompanyStore {

	int insertCompany(SqlSession session, CompanyVO company);

	CompanyVO selectOneByLogin(SqlSession session, CompanyLoginRequest company);

	int updateCompany(SqlSession session, CompanyModifyRequest company);

	CompanyVO selectOneById(SqlSession session, String companyId);

	int deleteCompany(SqlSession session, String companyId);

	CompanyVO selectOneByEmail(SqlSession session, CompanyPasswordRequest company);

}
