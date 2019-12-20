/*
 * Decompiled with CFR 0.137.
 * 
 * Could not load the following classes:
 *  com.ym.dolphin.util.StringUtil
 */
package com.lijia.java.changsha.bean.push;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ceb:Logistics")
@XmlType(propOrder = { "guid", "appType", "appTime", "appStatus", "logisticsCode", "logisticsName", "logisticsNo",
        "freight", "insuredFee", "currency", "grossWeight", "packNo", "goodsInfo", "ebcCode", "ebcName", "ebcTelephone",
        "note" })
public class LogisticsHead {
    private String guid;
    private String appType;
    private String appTime;
    private String appStatus;
    private String logisticsCode;
    private String logisticsName;
    private String logisticsNo;
    private BigDecimal freight;
    private BigDecimal insuredFee;
    private String currency;
    private BigDecimal grossWeight;
    private String packNo;
    private String goodsInfo;
    private String ebcCode;
    private String ebcName;
    private String ebcTelephone;
    private String note;

    @XmlElement(name = "ceb:guid")
    public String getGuid() {
        return StringUtil.isEmpty((String) this.guid);
    }

    @XmlElement(name = "ceb:appType")
    public String getAppType() {
        return StringUtil.isEmpty((String) this.appType);
    }

    @XmlElement(name = "ceb:appTime")
    public String getAppTime() {
        return StringUtil.isEmpty((String) this.appTime);
    }

    @XmlElement(name = "ceb:appStatus")
    public String getAppStatus() {
        return StringUtil.isEmpty((String) this.appStatus);
    }

    @XmlElement(name = "ceb:logisticsCode")
    public String getLogisticsCode() {
        return StringUtil.isEmpty((String) this.logisticsCode);
    }

    @XmlElement(name = "ceb:logisticsName")
    public String getLogisticsName() {
        return StringUtil.isEmpty((String) this.logisticsName);
    }

    @XmlElement(name = "ceb:logisticsNo")
    public String getLogisticsNo() {
        return StringUtil.isEmpty((String) this.logisticsNo);
    }

    @XmlElement(name = "ceb:freight")
    public BigDecimal getFreight() {
        return StringUtil.isEmpty((BigDecimal) this.freight);
    }

    @XmlElement(name = "ceb:insuredFee")
    public BigDecimal getInsuredFee() {
        return StringUtil.isEmpty((BigDecimal) this.insuredFee);
    }

    @XmlElement(name = "ceb:currency")
    public String getCurrency() {
        return StringUtil.isEmpty((String) this.currency);
    }

    @XmlElement(name = "ceb:grossWeight")
    public BigDecimal getGrossWeight() {
        return StringUtil.isEmpty((BigDecimal) this.grossWeight);
    }

    @XmlElement(name = "ceb:packNo")
    public String getPackNo() {
        return StringUtil.isEmpty((String) this.packNo);
    }

    @XmlElement(name = "ceb:goodsInfo")
    public String getGoodsInfo() {
        return StringUtil.isEmpty((String) this.goodsInfo);
    }

    @XmlElement(name = "ceb:ebcCode")
    public String getEbcCode() {
        return StringUtil.isEmpty((String) this.ebcCode);
    }

    @XmlElement(name = "ceb:ebcName")
    public String getEbcName() {
        return StringUtil.isEmpty((String) this.ebcName);
    }

    @XmlElement(name = "ceb:ebcTelephone")
    public String getEbcTelephone() {
        return StringUtil.isEmpty((String) this.ebcTelephone);
    }

    @XmlElement(name = "ceb:note")
    public String getNote() {
        return StringUtil.isEmpty((String) this.note);
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public void setAppTime(String appTime) {
        this.appTime = appTime;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public void setInsuredFee(BigDecimal insuredFee) {
        this.insuredFee = insuredFee;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public void setPackNo(String packNo) {
        this.packNo = packNo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public void setEbcCode(String ebcCode) {
        this.ebcCode = ebcCode;
    }

    public void setEbcName(String ebcName) {
        this.ebcName = ebcName;
    }

    public void setEbcTelephone(String ebcTelephone) {
        this.ebcTelephone = ebcTelephone;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
