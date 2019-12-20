package com.lijia.java.changsha.bean.receipt;

import java.io.Serializable;

/**
 * 运抵单回执
 */
public class IcdspReceiptArrivalOrder implements Serializable {

    private static final long serialVersionUID = -7740051977084971558L;

    private String guid;

    private String operatorCode;

    private String logisticsCode;

    private String copNo;

    private String preNo;

    private String billNo;

    private String msgSeqNo;

    private String returnStatus;

    private String returnTime;

    private String returnInfo;

    public String getGuid() {
        return guid;
    }

    public void setGuid(final String guid) {
        this.guid = guid;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(final String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(final String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public String getCopNo() {
        return copNo;
    }

    public void setCopNo(final String copNo) {
        this.copNo = copNo;
    }

    public String getPreNo() {
        return preNo;
    }

    public void setPreNo(final String preNo) {
        this.preNo = preNo;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(final String billNo) {
        this.billNo = billNo;
    }

    public String getMsgSeqNo() {
        return msgSeqNo;
    }

    public void setMsgSeqNo(final String msgSeqNo) {
        this.msgSeqNo = msgSeqNo;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(final String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(final String returnTime) {
        this.returnTime = returnTime;
    }

    public String getReturnInfo() {
        return returnInfo;
    }

    public void setReturnInfo(final String returnInfo) {
        this.returnInfo = returnInfo;
    }

    @Override
    public String toString() {
        return "IcdspArrivalOrder [guid=" + guid + ", operatorCode=" + operatorCode + ", logisticsCode=" + logisticsCode
                + ", copNo=" + copNo + ", preNo=" + preNo + ", billNo=" + billNo + ", msgSeqNo=" + msgSeqNo
                + ", returnStatus=" + returnStatus + ", returnTime=" + returnTime + ", returnInfo=" + returnInfo + "]";
    }

}