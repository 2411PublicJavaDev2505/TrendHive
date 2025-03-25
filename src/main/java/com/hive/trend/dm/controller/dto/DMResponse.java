package com.hive.trend.dm.controller.dto;

import java.sql.Date;

public class DMResponse {
	private String fileName;
	private String fileRename;
	private String filePath;
	private String dmContents;
	private String sendId;
	private String receiveId;
	private Date sendTime;
	
	public DMResponse() {}

	public DMResponse(String fileName, String fileRename, String filePath, String dmContents, String sendId,
			String receiveId, Date sendTime) {
		super();
		this.fileName = fileName;
		this.fileRename = fileRename;
		this.filePath = filePath;
		this.dmContents = dmContents;
		this.sendId = sendId;
		this.receiveId = receiveId;
		this.sendTime = sendTime;
	}
	
	
}
