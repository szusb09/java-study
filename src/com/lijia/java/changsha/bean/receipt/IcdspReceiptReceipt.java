package com.lijia.java.changsha.bean.receipt;

import java.io.Serializable;

/*
 * 收款单回执
 */
public class IcdspReceiptReceipt implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3716974249025530555L;

    private String guid;
    private String ebcCode;
    private String orderNo;
    private String payNo;
    private String returnStatus;
    private String returnTime;
    private String returnInfo;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getEbcCode() {
        return ebcCode;
    }

    public void setEbcCode(String ebcCode) {
        this.ebcCode = ebcCode;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
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
        return "IcdspReceiptReceipt [guid=" + guid + ", ebcCode=" + ebcCode + ", orderNo=" + orderNo + ", payNo="
                + payNo + ", returnStatus=" + returnStatus + ", returnTime=" + returnTime + ", returnInfo=" + returnInfo
                + "]";
    }
}
