package com.hive.trend.companyboard.model.store.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hive.trend.companyboard.controller.dto.CompanyBoardAddRequest;
import com.hive.trend.companyboard.model.store.CompanyBoardStore;
import com.hive.trend.companyboard.model.vo.CompanyBoardVO;

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
	

}
