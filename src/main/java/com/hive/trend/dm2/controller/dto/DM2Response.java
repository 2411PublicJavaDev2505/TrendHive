package com.hive.trend.dm2.controller.dto;

import java.sql.Date;

public class DM2Response {
	private String fileName;
	private String fileRename;
	private String filePath;
	private String dmContents;
	private String sendId;
	private String receiveId;
	private Date sendTime;
	private Date receiveTime; //받은날짜 원래 없던건데 데이터에 추가한 후 여기에도 추가함.
	
	public DM2Response() {}

	public DM2Response(String fileName, String fileRename, String filePath, String dmContents, String sendId,
			String receiveId, Date sendTime, Date receiveTime) {
		super();
		this.fileName = fileName;
		this.fileRename = fileRename;
		this.filePath = filePath;
		this.dmContents = dmContents;
		this.sendId = sendId;
		this.receiveId = receiveId;
		this.sendTime = sendTime;
		this.receiveTime = receiveTime;
	}

	
	
	
}

