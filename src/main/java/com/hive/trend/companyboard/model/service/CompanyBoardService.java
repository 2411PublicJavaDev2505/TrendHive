package com.hive.trend.companyboard.model.service;

import java.util.List;

import com.hive.trend.companyboard.controller.dto.CompanyBoardAddRequest;
import com.hive.trend.companyboard.model.vo.CompanyBoardVO;

public interface CompanyBoardService {

	List<CompanyBoardVO> selectListAll(int currentPage);

	int getTotalCount();

	int addCompanyBoard(CompanyBoardAddRequest companyBoard);

}
