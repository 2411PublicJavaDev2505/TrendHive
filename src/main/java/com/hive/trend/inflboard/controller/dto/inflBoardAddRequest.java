package com.hive.trend.inflboard.controller.dto;

public class inflBoardAddRequest {
	private String inflConcept;
	private String inflPlatform;
	private String inflUrl;
	private String inflFollower;
	private String inflIntro;
	private String fileName;
	private String fileRename;//파일이름 중복방지
	private String filePath;
	private String inflId;//불러오는애도 함께?
	
	public inflBoardAddRequest() {}
	
	public inflBoardAddRequest(String inflConcept, String inflPlatform, String inflUrl, String inflFollower,
			String inflIntro, String fileName, String fileRename, String filePath, String inflId) {
		super();
		this.inflConcept = inflConcept;
		this.inflPlatform = inflPlatform;
		this.inflUrl = inflUrl;
		this.inflFollower = inflFollower;
		this.inflIntro = inflIntro;
		this.fileName = fileName;
		this.fileRename = fileRename;
		this.filePath = filePath;
		this.inflId = inflId;
	}
//Model Attribute쓰려면 dto에 setter있어야 함

	public String getInflConcept() {
		return inflConcept;
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

	public void setInflId(String inflId) {
		this.inflId = inflId;
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

	public String getInflId() {
		return inflId;
	}

	@Override
	public String toString() {
		return "inflBoardAddRequest [inflConcept=" + inflConcept + ", inflPlatform=" + inflPlatform + ", inflUrl="
				+ inflUrl + ", inflFollower=" + inflFollower + ", inflIntro=" + inflIntro + ", fileName=" + fileName
				+ ", fileRename=" + fileRename + ", filePath=" + filePath + ", inflId=" + inflId + "]";
	}
	
	
}
