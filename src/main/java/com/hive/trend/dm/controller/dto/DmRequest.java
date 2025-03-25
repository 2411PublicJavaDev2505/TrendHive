package com.hive.trend.dm.controller.dto;

import java.sql.Date;

public class DmRequest {
	private String sendId;
	private String receiveId;
	private String dmContents;
	private String fileName;
	private String fileRename;
	private String filePath;
	
	public DmRequest() {}

	public DmRequest(String sendId, String receiveId, String dmContents, String fileName, String fileRename,
			String filePath) {
		super();
		this.sendId = sendId;
		this.receiveId = receiveId;
		this.dmContents = dmContents;
		this.fileName = fileName;
		this.fileRename = fileRename;
		this.filePath = filePath;
	}

	@Override
	public String toString() {
		return "DmRequest [sendId=" + sendId + ", receiveId=" + receiveId + ", dmContents=" + dmContents + ", fileName="
				+ fileName + ", fileRename=" + fileRename + ", filePath=" + filePath + "]";
	}

	
	
}
