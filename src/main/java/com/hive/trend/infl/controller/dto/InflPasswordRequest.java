package com.hive.trend.infl.controller.dto;

public class InflPasswordRequest {
	private String inflId;
	private String inflEmail;
	
	public InflPasswordRequest() {}
	
	
	
	public InflPasswordRequest(String inflId, String inflEmail) {
		super();
		this.inflId = inflId;
		this.inflEmail = inflEmail;
	}

	public String getinflId() {
		return inflId;
	}

	public void setCompanyId(String inflId) {
		this.inflId = inflId;
	}

	public String getinflEmail() {
		return inflEmail;
	}

	public void setinflEmail(String inflEmail) {
		this.inflEmail = inflEmail;
	}

	@Override
	public String toString() {
		return "CompanyPasswordRequest [inflId=" + inflId + ", inflEmail=" + inflEmail + "]";
	}
	
}
