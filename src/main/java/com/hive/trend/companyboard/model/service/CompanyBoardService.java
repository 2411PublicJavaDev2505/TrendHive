package com.hive.trend.companyboard.model.service;

import java.util.List;
import java.util.Map;

import com.hive.trend.companyboard.controller.dto.CompanyBoardAddRequest;
import com.hive.trend.companyboard.controller.dto.CompanyBoardModifyRequest;
import com.hive.trend.companyboard.model.vo.CompanyBoardVO;

public interface CompanyBoardService {

	List<CompanyBoardVO> selectListAll(int currentPage);

	int getTotalCount();

	int addCompanyBoard(CompanyBoardAddRequest companyBoard);

	int deleteCompanyBoard(int companyPRNo);

	CompanyBoardVO selectOneByNo(int companyPRNo);

	int updateBoard(CompanyBoardModifyRequest companyBoard);

	int getTotalCount(Map<String, String> paramMap);

	List<CompanyBoardVO> searchListByKeyword(Map<String, String> paramMap, int currentPage);

}
