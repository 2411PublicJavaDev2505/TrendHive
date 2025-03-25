package com.hive.trend.companyboard.controller.dto;

import java.util.Date;

public class CompanyBoardAddRequest {

	private String productName;
	private String productPrice;
	private String brandName;
	private String companyUrl;
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
	
	public CompanyBoardAddRequest() {}
	
	public CompanyBoardAddRequest(String productName, String productPrice, String brandName, String companyUrl,
			String companyIntro, String companyPosting, String productInfo, String forCreator, String companyEmail,
			int companyPhone, String fileName, String fileRename, String filePath, String companyId) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.brandName = brandName;
		this.companyUrl = companyUrl;
		this.companyIntro = companyIntro;
		this.companyPosting = companyPosting;
		this.productInfo = productInfo;
		this.forCreator = forCreator;
		this.companyEmail = companyEmail;
		this.companyPhone = companyPhone;
		this.fileName = fileName;
		this.fileRename = fileRename;
		this.filePath = filePath;
		this.companyId = companyId;
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

	public int getCompanyPhone() {
		return companyPhone;
	}

	public String getFileName() {
		return fileName;
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

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}

	public void setCompanyIntro(String companyIntro) {
		this.companyIntro = companyIntro;
	}

	public void setCompanyPosting(String companyPosting) {
		this.companyPosting = companyPosting;
	}

	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}

	public void setForCreator(String forCreator) {
		this.forCreator = forCreator;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public void setCompanyPhone(int companyPhone) {
		this.companyPhone = companyPhone;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileRename(String fileRename) {
		this.fileRename = fileRename;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "CompanyBoardAddRequest [productName=" + productName + ", productPrice=" + productPrice + ", brandName="
				+ brandName + ", companyUrl=" + companyUrl + ", companyIntro=" + companyIntro + ", companyPosting="
				+ companyPosting + ", productInfo=" + productInfo + ", forCreator=" + forCreator + ", companyEmail="
				+ companyEmail + ", companyPhone=" + companyPhone + ", fileName=" + fileName + ", fileRename="
				+ fileRename + ", filePath=" + filePath + ", companyId=" + companyId + "]";
	}

}
