package com.hive.trend.company.store.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hive.trend.company.controller.dto.CompanyLoginRequest;
import com.hive.trend.company.controller.dto.CompanyModifyRequest;
import com.hive.trend.company.domain.CompanyVO;
import com.hive.trend.company.store.CompanyStore;

@Repository
public class CompanyStoreLogic implements CompanyStore{

	@Override
	public int insertCompany(SqlSession session, CompanyVO company) {
		int result = session.insert("CompanyMapper.insertCompany", company);
		return result;
	}

	@Override
	public CompanyVO selectOneByLogin(SqlSession session, CompanyLoginRequest company) {
		CompanyVO result = session.selectOne("CompanyMapper.selectOneByLogin", company);
		return result;
	}

	@Override
	public int updateCompany(SqlSession session, CompanyModifyRequest company) {
		int result = session.update("CompanyMapper.updateCompany", company);
		return result;
	}

	@Override
	public CompanyVO selectOneById(SqlSession session, String companyId) {
		CompanyVO result = session.selectOne("CompanyMapper.selectOneById", companyId);
		return result;
	}

	@Override
	public int deleteCompany(SqlSession session, String companyId) {
		int result = session.delete("CompanyMapper.deleteCompany", companyId);
		return result;
	}

}
