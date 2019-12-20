package com.lijia.java.changsha.bean.receipt;

import java.io.Serializable;

/**
 * 运单回执实体对象
 * 
 * @author jieyang
 *
 */
public class IcdspReceiptWaybill implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 9088592189593015595L;

    private String guid;
    private String logisticsCode;
    private String logisticsNo;
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

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
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
        return "IcdspReceiptWaybill [guid=" + guid + ", logisticsCode=" + logisticsCode + ", logisticsNo=" + logisticsNo
                + ", returnStatus=" + returnStatus + ", returnTime=" + returnTime + ", returnInfo=" + returnInfo + "]";
    }
}
