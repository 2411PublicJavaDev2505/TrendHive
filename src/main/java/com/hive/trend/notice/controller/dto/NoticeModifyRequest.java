package com.hive.trend.notice.controller.dto;

public class NoticeModifyRequest {
	private int noticeNo;
	private String noticeTitle;
	private String noticeContent;
	private String noticeWriter;
	public int getNoticeNo() {
		return noticeNo;
	}
	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
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
		return "NoticeModifyRequest [noticeNo=" + noticeNo + ", noticeTitle=" + noticeTitle + ", noticeContent="
				+ noticeContent + ", noticeWriter=" + noticeWriter + "]";
	}
	
	
}
