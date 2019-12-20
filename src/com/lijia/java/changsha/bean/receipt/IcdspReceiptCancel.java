package com.lijia.java.changsha.bean.receipt;

import java.io.Serializable;

/**
 * 撤销单回执实体对象
 * 
 * @author jieyang
 *
 */
public class IcdspReceiptCancel implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 8417067971587170449L;

    private String guid;
    private String agentCode;
    private String copNo;
    private String preNo;
    private String invtNo;
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

    public String getInvtNo() {
        return invtNo;
    }

    public void setInvtNo(String invtNo) {
        this.invtNo = invtNo;
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
        return "IcdspReceiptCancel [guid=" + guid + ", agentCode=" + agentCode + ", copNo=" + copNo + ", preNo=" + preNo
                + ", invtNo=" + invtNo + ", msgSeqNo=" + msgSeqNo + ", returnStatus=" + returnStatus + ", returnTime="
                + returnTime + ", returnInfo=" + returnInfo + "]";
    }
}
