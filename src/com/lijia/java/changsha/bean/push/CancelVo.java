package com.lijia.java.changsha.bean.push;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ceb:InvtCancel")
@XmlType(propOrder = { "guid", "appType", "appTime", "appStatus", "customsCode", "copNo", "invtNo", "reason",
        "agentCode", "agentName", "ebcCode", "ebcName", "note" })
public class CancelVo implements Serializable {
    private static final long serialVersionUID = 244763708406896723L;
    private String guid;
    private String appType;
    private String appTime;
    private String appStatus;
    private String customsCode;
    private String copNo;
    private String invtNo;
    private String reason;
    private String agentCode;
    private String agentName;
    private String ebcCode;
    private String ebcName;
    private String note;

    @XmlElement(name = "ceb:guid")
    public String getGuid() {
        return this.guid;
    }

    @XmlElement(name = "ceb:appType")
    public String getAppType() {
        return this.appType;
    }

    @XmlElement(name = "ceb:appTime")
    public String getAppTime() {
        return this.appTime;
    }

    @XmlElement(name = "ceb:appStatus")
    public String getAppStatus() {
        return this.appStatus;
    }

    @XmlElement(name = "ceb:customsCode")
    public String getCustomsCode() {
        return this.customsCode;
    }

    @XmlElement(name = "ceb:copNo")
    public String getCopNo() {
        return this.copNo;
    }

    @XmlElement(name = "ceb:invtNo")
    public String getInvtNo() {
        return this.invtNo;
    }

    @XmlElement(name = "ceb:reason")
    public String getReason() {
        return this.reason;
    }

    @XmlElement(name = "ceb:agentCode")
    public String getAgentCode() {
        return this.agentCode;
    }

    @XmlElement(name = "ceb:agentName")
    public String getAgentName() {
        return this.agentName;
    }

    @XmlElement(name = "ceb:ebcCode")
    public String getEbcCode() {
        return this.ebcCode;
    }

    @XmlElement(name = "ceb:ebcName")
    public String getEbcName() {
        return this.ebcName;
    }

    @XmlElement(name = "ceb:note")
    public String getNote() {
        return this.note;
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

    public void setInvtNo(String invtNo) {
        this.invtNo = invtNo;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public void setEbcCode(String ebcCode) {
        this.ebcCode = ebcCode;
    }

    public void setEbcName(String ebcName) {
        this.ebcName = ebcName;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
