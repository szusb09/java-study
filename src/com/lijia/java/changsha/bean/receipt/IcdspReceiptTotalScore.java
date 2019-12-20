package com.lijia.java.changsha.bean.receipt;

import java.io.Serializable;

/**
 * 清单总分单回执
 */
public class IcdspReceiptTotalScore implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 89882047171867210L;

    private String guid;

    private String agentCode;

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

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
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

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
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
        return "IcdspTotalScoreReceipt [guid=" + guid + ", agentCode=" + agentCode + ", logisticsCode=" + logisticsCode
                + ", copNo=" + copNo + ", preNo=" + preNo + ", billNo=" + billNo + ", msgSeqNo=" + msgSeqNo
                + ", returnStatus=" + returnStatus + ", returnTime=" + returnTime + ", returnInfo=" + returnInfo + "]";
    }

}