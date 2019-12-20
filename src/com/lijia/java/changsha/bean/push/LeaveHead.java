/*
 * Decompiled with CFR 0.137.
 * 
 * Could not load the following classes:
 *  com.ym.dolphin.util.StringUtil
 */
package com.lijia.java.changsha.bean.push;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ceb:DepartureHead")
@XmlType(propOrder = { "guid", "appType", "appTime", "appStatus", "customsCode", "copNo", "preNo", "logisticsCode",
        "logisticsName", "trafMode", "trafName", "voyageNo", "billNo", "leaveTime", "msgCount", "msgSeqNo", "note" })
public class LeaveHead implements Serializable {
    private static final long serialVersionUID = -9166123034296927767L;
    private String guid;
    private String appType;
    private String appTime;
    private String appStatus;
    private String customsCode;
    private String copNo;
    private String preNo;
    private String logisticsCode;
    private String logisticsName;
    private String trafMode;
    private String trafName;
    private String voyageNo;
    private String billNo;
    private String leaveTime;
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

    @XmlElement(name = "ceb:preNo")
    public String getPreNo() {
        return StringUtil.isEmpty((String) this.preNo);
    }

    @XmlElement(name = "ceb:logisticsCode")
    public String getLogisticsCode() {
        return StringUtil.isEmpty((String) this.logisticsCode);
    }

    @XmlElement(name = "ceb:logisticsName")
    public String getLogisticsName() {
        return StringUtil.isEmpty((String) this.logisticsName);
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

    @XmlElement(name = "ceb:leaveTime")
    public String getLeaveTime() {
        return StringUtil.isEmpty((String) this.leaveTime);
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

    public void setGuid(final String guid) {
        this.guid = guid;
    }

    public void setAppType(final String appType) {
        this.appType = appType;
    }

    public void setAppTime(final String appTime) {
        this.appTime = appTime;
    }

    public void setAppStatus(final String appStatus) {
        this.appStatus = appStatus;
    }

    public void setCustomsCode(final String customsCode) {
        this.customsCode = customsCode;
    }

    public void setCopNo(final String copNo) {
        this.copNo = copNo;
    }

    public void setPreNo(final String preNo) {
        this.preNo = preNo;
    }

    public void setLogisticsCode(final String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public void setLogisticsName(final String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public void setTrafMode(final String trafMode) {
        this.trafMode = trafMode;
    }

    public void setTrafName(final String trafName) {
        this.trafName = trafName;
    }

    public void setVoyageNo(final String voyageNo) {
        this.voyageNo = voyageNo;
    }

    public void setBillNo(final String billNo) {
        this.billNo = billNo;
    }

    public void setLeaveTime(final String leaveTime) {
        this.leaveTime = leaveTime;
    }

    public void setMsgCount(final Integer msgCount) {
        this.msgCount = msgCount;
    }

    public void setMsgSeqNo(final Integer msgSeqNo) {
        this.msgSeqNo = msgSeqNo;
    }

    public void setNote(final String note) {
        this.note = note;
    }
}
