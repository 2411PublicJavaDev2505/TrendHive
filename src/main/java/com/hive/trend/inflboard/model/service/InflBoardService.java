package com.hive.trend.inflboard.model.service;

import java.util.List;

import com.hive.trend.inflboard.model.vo.InflBoardVO;

public interface InflBoardService {

	List<InflBoardVO> selectListAll(int currentPage);

	int getTotalCount();

}
