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

	public String getCompanyId() {
		return inflId;
	}

	public void setCompanyId(String companyId) {
		this.inflId = companyId;
	}

	public String getCompanyEmail() {
		return inflEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.inflEmail = companyEmail;
	}

	@Override
	public String toString() {
		return "CompanyPasswordRequest [inflId=" + inflId + ", inflEmail=" + inflEmail + "]";
	}
}
