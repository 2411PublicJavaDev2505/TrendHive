package com.hive.trend.company.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hive.trend.company.controller.dto.CompanyLoginRequest;
import com.hive.trend.company.domain.CompanyVO;
import com.hive.trend.company.service.CompanyService;
import com.hive.trend.company.store.CompanyStore;

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
		return null;
	}

}
