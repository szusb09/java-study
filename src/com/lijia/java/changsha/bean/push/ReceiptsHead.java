package com.lijia.java.changsha.bean.push;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ceb:Receipts")
@XmlType(propOrder = { "guid", "appType", "appTime", "appStatus", "orderNo", "payName", "payCode", "charge", "currency",
		"accountingDate", "ebcCode", "ebcName", "note" })

public class ReceiptsHead {

	private String guid;
	private String appType;
	private String appTime;
	private String appStatus;
	private String orderNo;
	private String payName;
	private String payCode;
	private BigDecimal charge;
	private String currency;
	private String accountingDate;
	private String ebcCode;
	private String ebcName;
	private String note;

	@XmlElement(name = "ceb:payCode")
	public String getPayCode() {
		return StringUtil.isEmpty((String) this.payCode);
	}

	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	@XmlElement(name = "ceb:guid")
	public String getGuid() {
		return StringUtil.isEmpty((String) this.guid);
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	@XmlElement(name = "ceb:appType")
	public String getAppType() {
		return StringUtil.isEmpty((String) this.appType);
	}

	public void setAppType(String appType) {
		this.appType = appType;
	}

	@XmlElement(name = "ceb:appTime")
	public String getAppTime() {
		return StringUtil.isEmpty((String) this.appTime);
	}

	public void setAppTime(String appTime) {
		this.appTime = appTime;
	}

	@XmlElement(name = "ceb:appStatus")
	public String getAppStatus() {
		return StringUtil.isEmpty((String) this.appStatus);
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	@XmlElement(name = "ceb:orderNo")
	public String getOrderNo() {
		return StringUtil.isEmpty((String) this.orderNo);
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	@XmlElement(name = "ceb:payName")
	public String getPayName() {
		return StringUtil.isEmpty((String) this.payName);
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	@XmlElement(name = "ceb:charge")
	public BigDecimal getCharge() {
		return StringUtil.isEmpty((BigDecimal) this.charge);
	}

	public void setCharge(BigDecimal charge) {
		this.charge = charge;
	}

	@XmlElement(name = "ceb:currency")
	public String getCurrency() {
		return StringUtil.isEmpty((String) this.currency);
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@XmlElement(name = "ceb:accountingDate")
	public String getAccountingDate() {
		return StringUtil.isEmpty((String) this.accountingDate);
	}

	public void setAccountingDate(String accountingDate) {
		this.accountingDate = accountingDate;
	}

	@XmlElement(name = "ceb:ebcCode")
	public String getEbcCode() {
		return StringUtil.isEmpty((String) this.ebcCode);
	}

	public void setEbcCode(String ebcCode) {
		this.ebcCode = ebcCode;
	}

	@XmlElement(name = "ceb:ebcName")
	public String getEbcName() {
		return StringUtil.isEmpty((String) this.ebcName);
	}

	public void setEbcName(String ebcName) {
		this.ebcName = ebcName;
	}

	@XmlElement(name = "ceb:note")
	public String getNote() {
		return StringUtil.isEmpty((String) this.note);
	}

	public void setNote(String note) {
		this.note = note;
	}

}
