package com.lijia.java.changsha.bean.receipt;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * 订单回执实体对象
 * 
 * @author jieyang
 *
 */
public class IcdspReceiptOrder implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -2647723172493930878L;

    private String guid;
    private String ebpCode;
    private String ebcCode;
    private String orderNo;
    private String returnStatus;
    private String returnTime;
    private String returnInfo;

    @XmlAttribute(name = "guid")
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @XmlAttribute(name = "ebpCode")
    public String getEbpCode() {
        return ebpCode;
    }

    public void setEbpCode(String ebpCode) {
        this.ebpCode = ebpCode;
    }

    @XmlAttribute(name = "ebcCode")
    public String getEbcCode() {
        return ebcCode;
    }

    public void setEbcCode(String ebcCode) {
        this.ebcCode = ebcCode;
    }

    @XmlAttribute(name = "orderNo")
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @XmlAttribute(name = "returnStatus")
    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    @XmlAttribute(name = "returnTime")
    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    @XmlAttribute(name = "returnInfo")
    public String getReturnInfo() {
        return returnInfo;
    }

    public void setReturnInfo(String returnInfo) {
        this.returnInfo = returnInfo;
    }

    @Override
    public String toString() {
        return "IcdspReceiptOrder [guid=" + guid + ", ebpCode=" + ebpCode + ", ebcCode=" + ebcCode + ", orderNo="
                + orderNo + ", returnStatus=" + returnStatus + ", returnTime=" + returnTime + ", returnInfo="
                + returnInfo + "]";
    }
}
