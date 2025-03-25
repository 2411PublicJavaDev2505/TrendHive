package com.hive.trend.infl.controller.dto;

public class InflModifyRequest {
	private String inflPw;
	private String inflName;
	private String inflNickname;
	private String inflphone;
	private String inflAddress;
	private String inflEmail;
	private String inflPlatform;
	private String inflUrl;
	
	public InflModifyRequest() {}
	
	

	public InflModifyRequest(String inflPw, String inflName, String inflNickname, String inflphone, String inflAddress,
			String inflEmail, String inflPlatform, String inflUrl) {
		super();
		this.inflPw = inflPw;
		this.inflName = inflName;
		this.inflNickname = inflNickname;
		this.inflphone = inflphone;
		this.inflAddress = inflAddress;
		this.inflEmail = inflEmail;
		this.inflPlatform = inflPlatform;
		this.inflUrl = inflUrl;
	}



	public String getInflPw() {
		return inflPw;
	}

	public void setInflPw(String inflPw) {
		this.inflPw = inflPw;
	}

	public String getInflName() {
		return inflName;
	}

	public void setInflName(String inflName) {
		this.inflName = inflName;
	}

	public String getInflNickname() {
		return inflNickname;
	}

	public void setInflNickname(String inflNickname) {
		this.inflNickname = inflNickname;
	}

	public String getInflphone() {
		return inflphone;
	}

	public void setInflphone(String inflphone) {
		this.inflphone = inflphone;
	}

	public String getInflAddress() {
		return inflAddress;
	}

	public void setInflAddress(String inflAddress) {
		this.inflAddress = inflAddress;
	}

	public String getInflEmail() {
		return inflEmail;
	}

	public void setInflEmail(String inflEmail) {
		this.inflEmail = inflEmail;
	}

	public String getInflPlatform() {
		return inflPlatform;
	}

	public void setInflPlatform(String inflPlatform) {
		this.inflPlatform = inflPlatform;
	}

	public String getInflUrl() {
		return inflUrl;
	}

	public void setInflUrl(String inflUrl) {
		this.inflUrl = inflUrl;
	}



	@Override
	public String toString() {
		return "InflModifyRequest [inflPw=" + inflPw + ", inflName=" + inflName + ", inflNickname=" + inflNickname
				+ ", inflphone=" + inflphone + ", inflAddress=" + inflAddress + ", inflEmail=" + inflEmail
				+ ", inflPlatform=" + inflPlatform + ", inflUrl=" + inflUrl + "]";
	}
	
	
}
