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
	
	public TrendHive() {}

	public TrendHive(int dmNo, Date insertDmdate, Timestamp insertDmtime, String fileName, String fileRename,
			String filePath, String dmContents, String userId) {
		super();
		this.dmNo = dmNo;
		this.insertDmdate = insertDmdate;
		this.insertDmtime = insertDmtime;
		this.fileName = fileName;
		this.fileRename = fileRename;
		this.filePath = filePath;
		this.dmContents = dmContents;
		this.userId = userId;
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

	@Override
	public String toString() {
		return "TrendHive [dmNo=" + dmNo + ", insertDmdate=" + insertDmdate + ", insertDmtime=" + insertDmtime
				+ ", fileName=" + fileName + ", fileRename=" + fileRename + ", filePath=" + filePath + ", dmContents="
				+ dmContents + ", userId=" + userId + "]";
	}
	
	
}
