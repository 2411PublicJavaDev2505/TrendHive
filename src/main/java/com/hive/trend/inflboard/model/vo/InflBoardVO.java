package com.hive.trend.inflboard.model.vo;

import java.util.Date;

public class InflBoardVO {
	private int	inflPRNo;
	private String inflConcept;
	private String inflPlatform;
	private String inflUrl;
	private String inflFollower;
	private String inflIntro;
	private Date insertDate;
	private String fileName;
	private String fileRename;
	private String filePath;
	private String inflId;
	private String inflNickname;
	private String inflEmail;
	
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

	public Date getInsertDate() {
		return insertDate;
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

	public String getInflNickname() {
		return inflNickname;
	}

	public String getInflEmail() {
		return inflEmail;
	}

	@Override
	public String toString() {
		return "InflBoardVO [inflPRNo=" + inflPRNo + ", inflConcept=" + inflConcept + ", inflPlatform=" + inflPlatform
				+ ", inflUrl=" + inflUrl + ", inflFollower=" + inflFollower + ", inflIntro=" + inflIntro
				+ ", insertDate=" + insertDate + ", fileName=" + fileName + ", fileRename=" + fileRename + ", filePath="
				+ filePath + ", inflId=" + inflId + ", inflNickname=" + inflNickname + ", inflEmail=" + inflEmail + "]";
	}




	
	

}
