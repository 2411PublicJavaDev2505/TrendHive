package com.hive.trend.inflboard.model.service;

import java.util.List;
import java.util.Map;

import com.hive.trend.inflboard.controller.dto.InflBoardModifyRequest;
import com.hive.trend.inflboard.controller.dto.inflBoardAddRequest;
import com.hive.trend.inflboard.model.vo.InflBoardVO;

public interface InflBoardService {

	List<InflBoardVO> selectListAll(int currentPage);

	int getTotalCount();

	List<InflBoardVO> searchListByKeyword(Map<String, String> paramMap, int currentPage);

	int getTotalCount(Map<String, String> paramMap);

	int addInflBoard(inflBoardAddRequest inflBoard);

	InflBoardVO selectOneByNo(int inflPRNo);

	int deleteInflBoard(int inflPRNo);

	int updateBoard(InflBoardModifyRequest inflBoard);

}
