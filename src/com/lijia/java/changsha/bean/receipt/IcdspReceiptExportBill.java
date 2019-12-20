package com.lijia.java.changsha.bean.receipt;

import java.io.Serializable;

/**
 * 出口清单回执实体对象
 * 
 * @author jieyang
 *
 */
public class IcdspReceiptExportBill implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -3895928753020261989L;

    private String guid;
    private String agentCode;
    private String copNo;
    private String preNo;
    private String invtNo;
    private String ebcCode;
    private String ebpCode;
    private String orderNo;
    private String statisticsFlag;
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

    public String getEbcCode() {
        return ebcCode;
    }

    public void setEbcCode(String ebcCode) {
        this.ebcCode = ebcCode;
    }

    public String getEbpCode() {
        return ebpCode;
    }

    public void setEbpCode(String ebpCode) {
        this.ebpCode = ebpCode;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getStatisticsFlag() {
        return statisticsFlag;
    }

    public void setStatisticsFlag(String statisticsFlag) {
        this.statisticsFlag = statisticsFlag;
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
        return "IcdspReceiptExportBill [guid=" + guid + ", agentCode=" + agentCode + ", copNo=" + copNo + ", preNo="
                + preNo + ", invtNo=" + invtNo + ", ebcCode=" + ebcCode + ", ebpCode=" + ebpCode + ", orderNo="
                + orderNo + ", statisticsFlag=" + statisticsFlag + ", returnStatus=" + returnStatus + ", returnTime="
                + returnTime + ", returnInfo=" + returnInfo + "]";
    }
}
