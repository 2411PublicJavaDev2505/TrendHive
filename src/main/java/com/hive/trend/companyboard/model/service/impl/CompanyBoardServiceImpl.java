package com.hive.trend.companyboard.model.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hive.trend.companyboard.controller.dto.CompanyBoardAddRequest;
import com.hive.trend.companyboard.controller.dto.CompanyBoardModifyRequest;
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

	@Override
	public int deleteCompanyBoard(int companyPRNo) {
		int result = cpStore.deleteCompanyBoard(session, companyPRNo);
		return result;
	}

	@Override
	public CompanyBoardVO selectOneByNo(int companyPRNo) {
		CompanyBoardVO companyBoard = cpStore.selectOneByNo(session, companyPRNo);
		return companyBoard;
	}

	@Override
	public int updateBoard(CompanyBoardModifyRequest companyBoard) {
		int result = cpStore.updateBoard(session, companyBoard);
		return result;
	}

	@Override
	public int getTotalCount(Map<String, String> paramMap) {
		int totalCount = cpStore.getTotalCount(session, paramMap);
		return totalCount;
	}

	@Override
	public List<CompanyBoardVO> searchListByKeyword(Map<String, String> paramMap, int currentPage) {
		List<CompanyBoardVO> searchList= cpStore.searchListByKeyword(session, paramMap, currentPage);
		return searchList;
	}
	
	

}
