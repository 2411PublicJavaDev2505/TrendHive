package com.hive.trend.infl.controller.dto;

public class InflLoginRequest {
	private String inflId;
	private String inflPw;
	
	public InflLoginRequest() {}

	public InflLoginRequest(String inflId, String inflPw) {
		super();
		this.inflId = inflId;
		this.inflPw = inflPw;
	}

	@Override
	public String toString() {
		return "InflLoginRequest [inflId=" + inflId + ", inflPw=" + inflPw + "]";
	}
	
	
}
