package com.hive.trend.notice.controller.dto;

public class NoticeAddRequest {
	private String noticeTitle;
	private String noticeContent;
	private String noticeWriter;
	
	
	
	public NoticeAddRequest(String noticeTitle, String noticeContent, String noticeWriter) {
		super();
		this.noticeTitle = noticeTitle;
		this.noticeContent = noticeContent;
		this.noticeWriter = noticeWriter;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public String getNoticeWriter() {
		return noticeWriter;
	}
	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}
	
	@Override
	public String toString() {
		return "NoticeAddRequest [noticeTitle=" + noticeTitle + ", noticeContent=" + noticeContent + ", noticeWriter="
				+ noticeWriter + "]";
	}
}

	
