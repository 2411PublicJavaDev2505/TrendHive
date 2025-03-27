package com.hive.trend.company.controller.dto;

public class CompanyLoginRequest {
	private String companyId;
	private String companyPw;
	
	public CompanyLoginRequest() {}

	public CompanyLoginRequest(String companyId, String companyPw) {
		super();
		this.companyId = companyId;
		this.companyPw = companyPw;
	}

	
	
	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyPw() {
		return companyPw;
	}

	public void setCompanyPw(String companyPw) {
		this.companyPw = companyPw;
	}

	@Override
	public String toString() {
		return "CompanyLoginRequest [companyId=" + companyId + ", companyPw=" + companyPw + "]";
	}

	

	
	
	
}
