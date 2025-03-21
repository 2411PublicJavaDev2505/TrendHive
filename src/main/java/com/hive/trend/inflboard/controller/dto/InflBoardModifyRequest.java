package com.hive.trend.inflboard.controller.dto;

public class InflBoardModifyRequest {
	private int	inflPRNo;
	private String inflConcept;
	private String inflPlatform;
	private String inflUrl;
	private String inflFollower;
	private String inflIntro;
	private String fileName;
	private String fileRename;
	private String filePath;
	private String inflId;
	
	public String getInflId() {
		return inflId;
	}

	public void setInflId(String inflId) {
		this.inflId = inflId;
	}

	public int getInflPRNo() {
		return inflPRNo;
	}

	public String getInflConcept() {
		return inflConcept;
	}

	public String getInflPlatform() {
		return inflPlatform;
	}

	public String getInflUrl() {
		return inflUrl;
	}

	public String getInflFollower() {
		return inflFollower;
	}

	public String getInflIntro() {
		return inflIntro;
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

	public void setInflPRNo(int inflPRNo) {
		this.inflPRNo = inflPRNo;
	}

	public void setInflConcept(String inflConcept) {
		this.inflConcept = inflConcept;
	}

	public void setInflPlatform(String inflPlatform) {
		this.inflPlatform = inflPlatform;
	}

	public void setInflUrl(String inflUrl) {
		this.inflUrl = inflUrl;
	}

	public void setInflFollower(String inflFollower) {
		this.inflFollower = inflFollower;
	}

	public void setInflIntro(String inflIntro) {
		this.inflIntro = inflIntro;
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

	@Override
	public String toString() {
		return "InflBoardModifyRequest [inflPRNo=" + inflPRNo + ", inflConcept=" + inflConcept + ", inflPlatform="
				+ inflPlatform + ", inflUrl=" + inflUrl + ", inflFollower=" + inflFollower + ", inflIntro=" + inflIntro
				+ ", fileName=" + fileName + ", fileRename=" + fileRename + ", filePath=" + filePath + ", inflId="
				+ inflId + "]";
	}

}
