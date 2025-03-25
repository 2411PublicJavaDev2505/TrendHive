package com.hive.trend.companyboard.model.vo;

import java.util.Date;

public class CompanyBoardVO {
	private int	companyPRNo;
	private String productName;
	private String productPrice;
	private String brandName;
	private String companyUrl;
	private Date insertDate;
	private String companyIntro;
	private String companyPosting;
	private String productInfo;
	private String forCreator;
	private String companyEmail;
	private int	companyPhone;
	private String fileName;
	private String fileRename;
	private String filePath;
	private String companyId;
	
	public int getCompanyPRNo() {
		return companyPRNo;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public String getBrandName() {
		return brandName;
	}

	public String getCompanyUrl() {
		return companyUrl;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public String getCompanyIntro() {
		return companyIntro;
	}

	public String getCompanyPosting() {
		return companyPosting;
	}

	public String getProductInfo() {
		return productInfo;
	}

	public String getForCreator() {
		return forCreator;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public String getFileName() {
		return fileName;
	}

	public int getCompanyPhone() {
		return companyPhone;
	}

	public String getFileRename() {
		return fileRename;
	}

	public String getFilePath() {
		return filePath;
	}

	public String getCompanyId() {
		return companyId;
	}

	@Override
	public String toString() {
		return "CompanyBoardVO [companyPRNo=" + companyPRNo + ", productName=" + productName + ", productPrice="
				+ productPrice + ", brandName=" + brandName + ", companyUrl=" + companyUrl + ", insertDate="
				+ insertDate + ", companyIntro=" + companyIntro + ", companyPosting=" + companyPosting
				+ ", productInfo=" + productInfo + ", forCreator=" + forCreator + ", companyEmail=" + companyEmail
				+ ", fileName=" + fileName + ", companyPhone=" + companyPhone + ", fileRename=" + fileRename
				+ ", filePath=" + filePath + ", companyId=" + companyId + "]";
	}
}