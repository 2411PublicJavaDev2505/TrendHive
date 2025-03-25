package com.hive.trend.infl.domain;

public class InflVO {
	private String inflId;
	private String inflPw;
	private String inflName;
	private String inflNickname;
	private int inflAge;
	private String inflGender;
	private String inflPhone;
	private String inflAddress;
	private String inflEmail;
	private String inflPlatform;
	private String inflUrl;
	private String type;
	
	public InflVO() {}

	public String getInflId() {
		return inflId;
	}

	public String getInflPw() {
		return inflPw;
	}

	public String getInflName() {
		return inflName;
	}

	public String getInflNickname() {
		return inflNickname;
	}

	public int getInflAge() {
		return inflAge;
	}

	public String getInflGender() {
		return inflGender;
	}

	public String getGender() {
		return inflGender;
	}

	public String getInflPhone() {
		return inflPhone;
	}

	public String getInflAddress() {
		return inflAddress;
	}

	public String getInflEmail() {
		return inflEmail;
	}

	public String getInflPlatform() {
		return inflPlatform;
	}

	public String getInflUrl() {
		return inflUrl;
	}

	public String getType() {
		return type;
	}

	public void setInflId(String inflId) {
		this.inflId = inflId;
	}

	public void setInflPw(String inflPw) {
		this.inflPw = inflPw;
	}

	public void setInflName(String inflName) {
		this.inflName = inflName;
	}

	public void setInflNickname(String inflNickname) {
		this.inflNickname = inflNickname;
	}

	public void setInflAge(int inflAge) {
		this.inflAge = inflAge;
	}

	public void setInflGender(String inflGender) {
		this.inflGender = inflGender;
	}

	public void setInflPhone(String inflPhone) {
		this.inflPhone = inflPhone;
	}

	public void setInflAddress(String inflAddress) {
		this.inflAddress = inflAddress;
	}

	public void setInflEmail(String inflEmail) {
		this.inflEmail = inflEmail;
	}

	public void setInflPlatform(String inflPlatform) {
		this.inflPlatform = inflPlatform;
	}

	public void setInflUrl(String inflUrl) {
		this.inflUrl = inflUrl;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "InflVO [inflId=" + inflId + ", inflPw=" + inflPw + ", inflName=" + inflName + ", inflNickname="
				+ inflNickname + ", inflAge=" + inflAge + ", inflGender=" + inflGender + ", inflPhone=" + inflPhone
				+ ", inflAddress=" + inflAddress + ", inflEmail=" + inflEmail + ", inflPlatform=" + inflPlatform
				+ ", inflUrl=" + inflUrl + ", type=" + type + "]";
	}

	
}
