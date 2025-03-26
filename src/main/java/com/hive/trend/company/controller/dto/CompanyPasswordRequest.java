package com.hive.trend.company.controller.dto;

public class CompanyPasswordRequest {
	private String companyId;
	private String companyEmail;
	
	public CompanyPasswordRequest() {}
	
	
	
	public CompanyPasswordRequest(String companyId, String companyEmail) {
		super();
		this.companyId = companyId;
		this.companyEmail = companyEmail;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	@Override
	public String toString() {
		return "CompanyPasswordRequest [companyId=" + companyId + ", companyEmail=" + companyEmail + "]";
	}
	
}
