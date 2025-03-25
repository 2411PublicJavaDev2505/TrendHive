package com.hive.trend.companyboard.model.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hive.trend.companyboard.controller.dto.CompanyBoardAddRequest;
import com.hive.trend.companyboard.model.vo.CompanyBoardVO;

public interface CompanyBoardStore {

	List<CompanyBoardVO> selectListAll(SqlSession session, int currentPage);

	int getTotalCount(SqlSession session);

	int addCompanyBoard(SqlSession session, CompanyBoardAddRequest companyBoard);

}
