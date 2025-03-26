package com.hive.trend.companyboard.model.store.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hive.trend.companyboard.controller.dto.CompanyBoardAddRequest;
import com.hive.trend.companyboard.controller.dto.CompanyBoardModifyRequest;
import com.hive.trend.companyboard.model.store.CompanyBoardStore;
import com.hive.trend.companyboard.model.vo.CompanyBoardVO;
import com.hive.trend.inflboard.model.vo.InflBoardVO;

@Repository
public class CompanyBoardStoreLogic implements CompanyBoardStore{

	@Override
	public List<CompanyBoardVO> selectListAll(SqlSession session, int currentPage) {
		int limit = 6;//보여지는 글 갯수
		int offset = (currentPage-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		List<CompanyBoardVO> cpList = session.selectList("CompanyBoardMapper.selectList", null, rowBounds);
		return cpList;
	}

	@Override
	public int getTotalCount(SqlSession session) {
		int totalCount = session.selectOne("CompanyBoardMapper.getTotalCount");
		return totalCount;
	}

	@Override
	public int addCompanyBoard(SqlSession session, CompanyBoardAddRequest companyBoard) {
		int result = session.insert("CompanyBoardMapper.addCompanyBoard", companyBoard);
		return result;
	}

	@Override
	public int deleteCompanyBoard(SqlSession session, int companyPRNo) {
		int result = session.delete("CompanyBoardMapper.deleteCompanyBoard", companyPRNo);
		return result;
	}

	@Override
	public CompanyBoardVO selectOneByNo(SqlSession session, int companyPRNo) {
		CompanyBoardVO companyBoard = session.selectOne("CompanyBoardMapper.selectOneByNo", companyPRNo);
		return companyBoard;
	}

	@Override
	public int updateBoard(SqlSession session, CompanyBoardModifyRequest companyBoard) {
		int result = session.update("CompanyBoardMapper.updateBoard", companyBoard);
		return result;
	}

	@Override
	public int getTotalCount(SqlSession session, Map<String, String> paramMap) {
		int totalCount = session.selectOne("CompanyBoardMapper.getTotalCount", paramMap);
		return totalCount;
	}

	@Override
	public List<CompanyBoardVO> searchListByKeyword(SqlSession session, Map<String, String> paramMap, int currentPage) {
		int limit = 6;
		int offset = (currentPage-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		List<CompanyBoardVO> searchList= session.selectList("CompanyBoardMapper.selectSearchList", paramMap, rowBounds);
		return searchList;
	}
	

}
