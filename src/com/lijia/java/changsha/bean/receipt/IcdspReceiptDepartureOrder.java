package com.lijia.java.changsha.bean.receipt;

import java.io.Serializable;

/**
 * 离境单回执
 */
public class IcdspReceiptDepartureOrder implements Serializable {
    private static final long serialVersionUID = 7636305739003356883L;

    private String guid;

    private String logisticsCode;

    private String copNo;

    private String preNo;

    private String msgSeqNo;

    private String returnStatus;

    private String returnTime;

    private String returnInfo;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public String getCopNo() {
        return copNo;
    }

    public void setCopNo(String copNo) {
        this.copNo = copNo;
    }

    public String getPreNo() {
        return preNo;
    }

    public void setPreNo(String preNo) {
        this.preNo = preNo;
    }

    public String getMsgSeqNo() {
        return msgSeqNo;
    }

    public void setMsgSeqNo(String msgSeqNo) {
        this.msgSeqNo = msgSeqNo;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public String getReturnInfo() {
        return returnInfo;
    }

    public void setReturnInfo(String returnInfo) {
        this.returnInfo = returnInfo;
    }

    @Override
    public String toString() {
        return "IcdspDepartureOrder [guid=" + guid + ", logisticsCode=" + logisticsCode + ", copNo=" + copNo
                + ", preNo=" + preNo + ", msgSeqNo=" + msgSeqNo + ", returnStatus=" + returnStatus + ", returnTime="
                + returnTime + ", returnInfo=" + returnInfo + "]";
    }

}