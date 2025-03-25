package com.hive.trend.dm2.controller.dto;

import java.sql.Date;

public class Dm2Request {
	private String sendId;
	private String receiveId;
	private String dmContents;
	private Date sendTime;
	private String fileName;
	private String fileRename;
	private String filePath;
	
	public Dm2Request() {}

	public Dm2Request(String sendId, String receiveId, String dmContents, Date sendTime, String fileName,
			String fileRename, String filePath) {
		super();
		this.sendId = sendId;
		this.receiveId = receiveId;
		this.dmContents = dmContents;
		this.sendTime = sendTime;
		this.fileName = fileName;
		this.fileRename = fileRename;
		this.filePath = filePath;
	}

	@Override
	public String toString() {
		return "Dm2Request [sendId=" + sendId + ", receiveId=" + receiveId + ", dmContents=" + dmContents + ", sendTime="
				+ sendTime + ", fileName=" + fileName + ", fileRename=" + fileRename + ", filePath=" + filePath + "]";
	}



	
	
}
