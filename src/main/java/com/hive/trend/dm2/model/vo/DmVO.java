package com.hive.trend.dm2.model.vo;

import java.sql.Date;
import java.sql.Timestamp;

public class DmVO {
	
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
	private Date receiveTime; // 데이터에 추가한지 얼마안됐음. 여기랑 dto response, detail.jsp에 추가함.
	private String deleteDm;
	
	
	public DmVO() {}

	

	public DmVO(int dmNo, Date insertDmdate, Timestamp insertDmtime, String fileName, String fileRename,
			String filePath, String dmContents, String userId, String companyName, String sendId, String receiveId,
			Date sendTime, String dmSubject, Date receiveTime, String deleteDm) {
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
		this.receiveTime = receiveTime;
		this.deleteDm = deleteDm;
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



	public String getCompanyName() {
		return companyName;
	}



	public String getSendId() {
		return sendId;
	}



	public String getReceiveId() {
		return receiveId;
	}



	public Date getSendTime() {
		return sendTime;
	}



	public String getDmSubject() {
		return dmSubject;
	}



	public Date getReceiveTime() {
		return receiveTime;
	}



	public String getDeleteDm() {
		return deleteDm;
	}



	@Override
	public String toString() {
		return "DmVO [dmNo=" + dmNo + ", insertDmdate=" + insertDmdate + ", insertDmtime=" + insertDmtime
				+ ", fileName=" + fileName + ", fileRename=" + fileRename + ", filePath=" + filePath + ", dmContents="
				+ dmContents + ", userId=" + userId + ", companyName=" + companyName + ", sendId=" + sendId
				+ ", receiveId=" + receiveId + ", sendTime=" + sendTime + ", dmSubject=" + dmSubject + ", receiveTime="
				+ receiveTime + ", deleteDm=" + deleteDm + "]";
	}



	

	

}