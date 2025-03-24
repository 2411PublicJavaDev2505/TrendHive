package com.hive.trend.dm.model.vo;

import java.sql.Date;
import java.sql.Timestamp;

public class TrendHive {
	
	private int dmNo;
	private Date insertDmdate;
	private Timestamp insertDmtime;
	private String fileName;
	private String fileRename;
	private String filePath;
	private String dmContents;
	private String userId;
	private String companyName;
	private String sendId;
	private String receiveId;
	private Date sendTime;
	private String dmSubject;
	
	public TrendHive() {}

	public TrendHive(int dmNo, Date insertDmdate, Timestamp insertDmtime, String fileName, String fileRename,
			String filePath, String dmContents, String userId, String companyName, String sendId, String receiveId, Date sendTime, String dmSubject) {
		super();
		this.dmNo = dmNo;
		this.insertDmdate = insertDmdate;
		this.insertDmtime = insertDmtime;
		this.fileName = fileName;
		this.fileRename = fileRename;
		this.filePath = filePath;
		this.dmContents = dmContents;
		this.userId = userId;
		this.companyName = companyName;
		this.sendId = sendId;
		this.receiveId = receiveId;
		this.sendTime = sendTime;
		this.dmSubject = dmSubject;
	}

	public int getDmNo() {
		return dmNo;
	}

	public Date getInsertDmdate() {
		return insertDmdate;
	}

	public Timestamp getInsertDmtime() {
		return insertDmtime;
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

	public String getDmContents() {
		return dmContents;
	}

	public String getUserId() {
		return userId;
	}
	
	public String companyName() {
		return companyName;
	}
	
	public String sendId() {
		return sendId;
	}
	
	public String receiveId() {
		return receiveId;
	}
	
	public Date sendTime() {
		return sendTime;
	}
	
	public String dmSubject() {
		return dmSubject;
	}

	@Override
	public String toString() {
		return "TrendHive [dmNo=" + dmNo + ", insertDmdate=" + insertDmdate + ", insertDmtime=" + insertDmtime
				+ ", fileName=" + fileName + ", fileRename=" + fileRename + ", filePath=" + filePath + ", dmContents="
				+ dmContents + ", userId=" + userId + companyName + sendId + receiveId + sendTime + dmSubject + "]";
	}


	
}
