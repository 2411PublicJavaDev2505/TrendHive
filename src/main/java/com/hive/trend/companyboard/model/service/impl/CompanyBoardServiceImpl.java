package com.hive.trend.companyboard.model.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hive.trend.companyboard.controller.dto.CompanyBoardAddRequest;
import com.hive.trend.companyboard.model.service.CompanyBoardService;
import com.hive.trend.companyboard.model.store.CompanyBoardStore;
import com.hive.trend.companyboard.model.vo.CompanyBoardVO;
import com.hive.trend.inflboard.model.vo.InflBoardVO;

@Service
public class CompanyBoardServiceImpl implements CompanyBoardService{
	
	@Autowired
	private CompanyBoardStore cpStore;
	
	@Autowired
	private SqlSession session;

	@Override
	public List<CompanyBoardVO> selectListAll(int currentPage) {
		List<CompanyBoardVO> cpList = cpStore.selectListAll(session, currentPage);
		return cpList;
	}

	@Override
	public int getTotalCount() {
		int totalCount = cpStore.getTotalCount(session);
		return totalCount;
	}

	@Override
	public int addCompanyBoard(CompanyBoardAddRequest companyBoard) {
		int result = cpStore.addCompanyBoard(session, companyBoard);
		return result;
	}
	
	

}
