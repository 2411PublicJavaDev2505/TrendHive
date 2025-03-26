package com.hive.trend.companyboard.model.store;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.hive.trend.companyboard.controller.dto.CompanyBoardAddRequest;
import com.hive.trend.companyboard.controller.dto.CompanyBoardModifyRequest;
import com.hive.trend.companyboard.model.vo.CompanyBoardVO;

public interface CompanyBoardStore {

	List<CompanyBoardVO> selectListAll(SqlSession session, int currentPage);

	int getTotalCount(SqlSession session);

	int addCompanyBoard(SqlSession session, CompanyBoardAddRequest companyBoard);

	int deleteCompanyBoard(SqlSession session, int companyPRNo);

	CompanyBoardVO selectOneByNo(SqlSession session, int companyPRNo);

	int updateBoard(SqlSession session, CompanyBoardModifyRequest companyBoard);

	int getTotalCount(SqlSession session, Map<String, String> paramMap);

	List<CompanyBoardVO> searchListByKeyword(SqlSession session, Map<String, String> paramMap, int currentPage);

}
