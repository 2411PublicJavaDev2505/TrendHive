package com.hive.trend.company.domain;

public class CompanyVO {
	private String companyId;
	private String companyName;
	private String companyPw;
	private String companyTax;
	private String ceoName;
	private String companyAddress;
	private String companyEmail;
	private String companyPhone;
	private String type;
	
	public CompanyVO() {}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyPw() {
		return companyPw;
	}

	public void setCompanyPw(String companyPw) {
		this.companyPw = companyPw;
	}

	public String getCompanyTax() {
		return companyTax;
	}

	public void setCompanyTax(String companyTax) {
		this.companyTax = companyTax;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CompanyVO [companyId=" + companyId + ", companyName=" + companyName + ", companyPw=" + companyPw
				+ ", companyTax=" + companyTax + ", ceoName=" + ceoName + ", companyAddress=" + companyAddress
				+ ", companyEmail=" + companyEmail + ", companyPhone=" + companyPhone + ", type=" + type + "]";
	}

	
	
	
	
}
