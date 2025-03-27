package com.hive.trend.company.controller.dto;

public class CompanyModifyRequest {
	private String companyPw;
	private String companyName;
	private String ceoName;
	private String companyEmail;
	private String companyAddress;
	private String companyPhone;
	
	public CompanyModifyRequest() {}

	public CompanyModifyRequest(String companyPw, String companyName, String ceoName, String companyEmail,
			String companyAddress, String companyPhone) {
		super();
		this.companyPw = companyPw;
		this.companyName = companyName;
		this.ceoName = ceoName;
		this.companyEmail = companyEmail;
		this.companyAddress = companyAddress;
		this.companyPhone = companyPhone;
	}

	public String getCompanyPw() {
		return companyPw;
	}

	public void setCompanyPw(String companyPw) {
		this.companyPw = companyPw;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}
}
