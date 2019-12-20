/*
 * Decompiled with CFR 0.137.
 * 
 * Could not load the following classes:
 *  com.ym.dolphin.util.StringUtil
 */
package com.lijia.java.changsha.bean.push;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ceb:WayBillHead")
@XmlType(propOrder = { "guid", "appType", "appTime", "appStatus", "customsCode", "copNo", "agentCode", "agentName",
        "loctNo", "trafMode", "trafName", "voyageNo", "billNo", "domesticTrafNo", "grossWeight", "logisticsCode",
        "logisticsName", "msgCount", "msgSeqNo", "note" })
public class TotalScoreHead implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 7566394149478745414L;
    private String guid;
    private String appType;
    private String appTime;
    private String appStatus;
    private String customsCode;
    private String copNo;
    private String agentCode;
    private String agentName;
    private String loctNo;
    private String trafMode;
    private String trafName;
    private String voyageNo;
    private String billNo;
    private String domesticTrafNo;
    private BigDecimal grossWeight;
    private String logisticsCode;
    private String logisticsName;
    private Integer msgCount;
    private Integer msgSeqNo;
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

    @XmlElement(name = "ceb:customsCode")
    public String getCustomsCode() {
        return StringUtil.isEmpty((String) this.customsCode);
    }

    @XmlElement(name = "ceb:copNo")
    public String getCopNo() {
        return StringUtil.isEmpty((String) this.copNo);
    }

    @XmlElement(name = "ceb:agentCode")
    public String getAgentCode() {
        return StringUtil.isEmpty((String) this.agentCode);
    }

    @XmlElement(name = "ceb:agentName")
    public String getAgentName() {
        return StringUtil.isEmpty((String) this.agentName);
    }

    @XmlElement(name = "ceb:loctNo")
    public String getLoctNo() {
        return StringUtil.isEmpty((String) this.loctNo);
    }

    @XmlElement(name = "ceb:trafMode")
    public String getTrafMode() {
        return StringUtil.isEmpty((String) this.trafMode);
    }

    @XmlElement(name = "ceb:trafName")
    public String getTrafName() {
        return StringUtil.isEmpty((String) this.trafName);
    }

    @XmlElement(name = "ceb:voyageNo")
    public String getVoyageNo() {
        return StringUtil.isEmpty((String) this.voyageNo);
    }

    @XmlElement(name = "ceb:billNo")
    public String getBillNo() {
        return StringUtil.isEmpty((String) this.billNo);
    }

    @XmlElement(name = "ceb:domesticTrafNo")
    public String getDomesticTrafNo() {
        return StringUtil.isEmpty((String) this.domesticTrafNo);
    }

    @XmlElement(name = "ceb:grossWeight")
    public BigDecimal getGrossWeight() {
        return StringUtil.isEmpty((BigDecimal) this.grossWeight);
    }

    @XmlElement(name = "ceb:logisticsCode")
    public String getLogisticsCode() {
        return StringUtil.isEmpty((String) this.logisticsCode);
    }

    @XmlElement(name = "ceb:logisticsName")
    public String getLogisticsName() {
        return StringUtil.isEmpty((String) this.logisticsName);
    }

    @XmlElement(name = "ceb:msgCount")
    public Integer getMsgCount() {
        return StringUtil.isEmpty((Integer) this.msgCount);
    }

    @XmlElement(name = "ceb:msgSeqNo")
    public Integer getMsgSeqNo() {
        return StringUtil.isEmpty((Integer) this.msgSeqNo);
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

    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    public void setCopNo(String copNo) {
        this.copNo = copNo;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public void setLoctNo(String loctNo) {
        this.loctNo = loctNo;
    }

    public void setTrafMode(String trafMode) {
        this.trafMode = trafMode;
    }

    public void setTrafName(String trafName) {
        this.trafName = trafName;
    }

    public void setVoyageNo(String voyageNo) {
        this.voyageNo = voyageNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public void setDomesticTrafNo(String domesticTrafNo) {
        this.domesticTrafNo = domesticTrafNo;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public void setMsgCount(Integer msgCount) {
        this.msgCount = msgCount;
    }

    public void setMsgSeqNo(Integer msgSeqNo) {
        this.msgSeqNo = msgSeqNo;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
