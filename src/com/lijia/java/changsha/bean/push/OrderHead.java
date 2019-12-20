package com.lijia.java.changsha.bean.push;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ceb:OrderHead")
@XmlType(propOrder = { "guid", "appType", "appTime", "appStatus", "orderType", "orderNo", "ebpCode", "ebpName",
        "ebcCode", "ebcName", "goodsValue", "freight", "currency", "note" })
public class OrderHead implements Serializable {
    private static final long serialVersionUID = 1L;
    private String guid;
    private String appType;
    private String appTime;
    private String appStatus;
    private String orderType;
    private String orderNo;
    private String ebpCode;
    private String ebpName;
    private String ebcCode;
    private String ebcName;
    private BigDecimal goodsValue;
    private BigDecimal freight;
    private String currency;
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

    @XmlElement(name = "ceb:orderType")
    public String getOrderType() {
        return StringUtil.isEmpty((String) this.orderType);
    }

    @XmlElement(name = "ceb:orderNo")
    public String getOrderNo() {
        return StringUtil.isEmpty((String) this.orderNo);
    }

    @XmlElement(name = "ceb:ebpCode")
    public String getEbpCode() {
        return StringUtil.isEmpty((String) this.ebpCode);
    }

    @XmlElement(name = "ceb:ebpName")
    public String getEbpName() {
        return StringUtil.isEmpty((String) this.ebpName);
    }

    @XmlElement(name = "ceb:ebcCode")
    public String getEbcCode() {
        return StringUtil.isEmpty((String) this.ebcCode);
    }

    @XmlElement(name = "ceb:ebcName")
    public String getEbcName() {
        return StringUtil.isEmpty((String) this.ebcName);
    }

    @XmlElement(name = "ceb:goodsValue")
    public BigDecimal getGoodsValue() {
        return StringUtil.isEmpty((BigDecimal) this.goodsValue);
    }

    @XmlElement(name = "ceb:freight")
    public BigDecimal getFreight() {
        return StringUtil.isEmpty((BigDecimal) this.freight);
    }

    @XmlElement(name = "ceb:currency")
    public String getCurrency() {
        return StringUtil.isEmpty((String) this.currency);
    }

    @XmlElement(name = "ceb:note")
    public String getNote() {
        return StringUtil.isEmpty((String) this.note);
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

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setEbpCode(String ebpCode) {
        this.ebpCode = ebpCode;
    }

    public void setEbpName(String ebpName) {
        this.ebpName = ebpName;
    }

    public void setEbcCode(String ebcCode) {
        this.ebcCode = ebcCode;
    }

    public void setEbcName(String ebcName) {
        this.ebcName = ebcName;
    }

    public void setGoodsValue(BigDecimal goodsValue) {
        this.goodsValue = goodsValue;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
