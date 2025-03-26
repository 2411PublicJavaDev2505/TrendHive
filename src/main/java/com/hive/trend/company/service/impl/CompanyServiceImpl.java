package com.hive.trend.company.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hive.trend.company.controller.dto.CompanyLoginRequest;
import com.hive.trend.company.controller.dto.CompanyPasswordRequest;
import com.hive.trend.company.domain.CompanyVO;
import com.hive.trend.company.service.CompanyService;
import com.hive.trend.company.store.CompanyStore;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	private CompanyStore cStore;
	@Autowired
	private SqlSession session;
	
	@Override
	public int insertCompany(CompanyVO company) {
		int result = cStore.insertCompany(session, company);
		return result;
	}

	@Override
	public CompanyVO selectOneByLogin(CompanyLoginRequest company) {
		CompanyVO result = cStore.selectOneByLogin(session, company);
		return result;
	}

	@Override
	public int deleteCompany(String companyId) {
		int result = cStore.deleteCompany(session, companyId);
		return result;
	}

//	@Override
//	public int updateCompany(CompanyModifyRequest company) {
//		int result = cStore.updateCompany(session, company);
//		return result;
//	}

	@Override
	public int updateCompany(CompanyVO company) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public CompanyVO selectOneById(String companyId) {
		CompanyVO result = cStore.selectOneById(session, companyId);
		return result;
	}

	@Override
	public CompanyVO selectOneByEmail(CompanyPasswordRequest company) {
		CompanyVO result = cStore.selectOneByEmail(session, company);
		return result;
	}

	@Override
	public CompanyVO selectOneByCompanyId(String companyId) {
		// TODO Auto-generated method stub
		return null;
	}


}
