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

	public String getCompanyName() {
		return companyName;
	}

	public String getCompanyPw() {
		return companyPw;
	}

	public String getCompanyTax() {
		return companyTax;
	}

	public String getCeoName() {
		return ceoName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "CompanyVO [companyId=" + companyId + ", companyName=" + companyName + ", companyPw=" + companyPw
				+ ", companyTax=" + companyTax + ", ceoName=" + ceoName + ", companyAddress=" + companyAddress
				+ ", companyEmail=" + companyEmail + ", companyPhone=" + companyPhone + ", type=" + type + "]";
	}

	
	
}
