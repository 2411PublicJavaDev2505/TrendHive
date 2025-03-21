package com.hive.trend.dm2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hive.trend.dm.model.service.DmService;
import com.hive.trend.dm.model.vo.TrendHive;

@Controller
@RequestMapping("/dm2")
public class Dm2Controller {

	@GetMapping("/list")
	public String showList() {
		return "dm/list";
	}

}
