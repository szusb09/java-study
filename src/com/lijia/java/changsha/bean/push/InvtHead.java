/*
 * Decompiled with CFR 0.137.
 * 
 * Could not load the following classes:
 *  com.ym.dolphin.util.StringUtil
 */
package com.lijia.java.changsha.bean.push;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ceb:InventoryHead")
@XmlType(propOrder={"guid", "appType", "appTime", "appStatus", "customsCode", "ebpCode", "ebpName", "orderNo", "logisticsCode", "logisticsName", "logisticsNo", "copNo", "ieFlag", "portCode", "ieDate", "statisticsFlag", "agentCode", "agentName", "ebcCode", "ebcName", "ownerCode", "ownerName", "iacCode", "iacName", "emsNo", "tradeMode", "trafMode", "trafName", "voyageNo", "billNo", "totalPackageNo", "loctNo", "licenseNo", "country", "POD", "freight", "fCurrency", "fFlag", "insuredFee", "iCurrency", "iFlag", "wrapType", "packNo", "grossWeight", "netWeight", "note"})
public class InvtHead
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String guid;
    private String appType;
    private String appTime;
    private String appStatus;
    private String customsCode;
    private String ebpCode;
    private String ebpName;
    private String orderNo;
    private String logisticsCode;
    private String logisticsName;
    private String logisticsNo;
    private String copNo;
    private String ieFlag;
    private String portCode;
    private String ieDate;
    private String statisticsFlag;
    private String agentCode;
    private String agentName;
    private String ebcCode;
    private String ebcName;
    private String ownerCode;
    private String ownerName;
    private String iacCode;
    private String iacName;
    private String emsNo;
    private String tradeMode;
    private String trafMode;
    private String trafName;
    private String voyageNo;
    private String billNo;
    private String totalPackageNo;
    private String loctNo;
    private String licenseNo;
    private String country;
    private String POD;
    private BigDecimal freight;
    private String fCurrency;
    private String fFlag;
    private BigDecimal insuredFee;
    private String iCurrency;
    private String iFlag;
    private String wrapType;
    private Integer packNo;
    private BigDecimal grossWeight;
    private BigDecimal netWeight;
    private String note;

    @XmlElement(name="ceb:guid")
    public String getGuid() {
        return StringUtil.isEmpty((String)this.guid);
    }

    @XmlElement(name="ceb:appType")
    public String getAppType() {
        return StringUtil.isEmpty((String)this.appType);
    }

    @XmlElement(name="ceb:appTime")
    public String getAppTime() {
        return StringUtil.isEmpty((String)this.appTime);
    }

    @XmlElement(name="ceb:appStatus")
    public String getAppStatus() {
        return StringUtil.isEmpty((String)this.appStatus);
    }

    @XmlElement(name="ceb:customsCode")
    public String getCustomsCode() {
        return StringUtil.isEmpty((String)this.customsCode);
    }

    @XmlElement(name="ceb:ebpCode")
    public String getEbpCode() {
        return StringUtil.isEmpty((String)this.ebpCode);
    }

    @XmlElement(name="ceb:ebpName")
    public String getEbpName() {
        return StringUtil.isEmpty((String)this.ebpName);
    }

    @XmlElement(name="ceb:orderNo")
    public String getOrderNo() {
        return StringUtil.isEmpty((String)this.orderNo);
    }

    @XmlElement(name="ceb:logisticsCode")
    public String getLogisticsCode() {
        return StringUtil.isEmpty((String)this.logisticsCode);
    }

    @XmlElement(name="ceb:logisticsName")
    public String getLogisticsName() {
        return StringUtil.isEmpty((String)this.logisticsName);
    }

    @XmlElement(name="ceb:logisticsNo")
    public String getLogisticsNo() {
        return StringUtil.isEmpty((String)this.logisticsNo);
    }

    @XmlElement(name="ceb:copNo")
    public String getCopNo() {
        return StringUtil.isEmpty((String)this.copNo);
    }

    @XmlElement(name="ceb:ieFlag")
    public String getIeFlag() {
        return StringUtil.isEmpty((String)this.ieFlag);
    }

    @XmlElement(name="ceb:portCode")
    public String getPortCode() {
        return StringUtil.isEmpty((String)this.portCode);
    }

    @XmlElement(name="ceb:ieDate")
    public String getIeDate() {
        return StringUtil.isEmpty((String)this.ieDate);
    }

    @XmlElement(name="ceb:statisticsFlag")
    public String getStatisticsFlag() {
        return StringUtil.isEmpty((String)this.statisticsFlag);
    }

    @XmlElement(name="ceb:agentCode")
    public String getAgentCode() {
        return StringUtil.isEmpty((String)this.agentCode);
    }

    @XmlElement(name="ceb:agentName")
    public String getAgentName() {
        return StringUtil.isEmpty((String)this.agentName);
    }

    @XmlElement(name="ceb:ebcCode")
    public String getEbcCode() {
        return StringUtil.isEmpty((String)this.ebcCode);
    }

    @XmlElement(name="ceb:ebcName")
    public String getEbcName() {
        return StringUtil.isEmpty((String)this.ebcName);
    }

    @XmlElement(name="ceb:ownerCode")
    public String getOwnerCode() {
        return StringUtil.isEmpty((String)this.ownerCode);
    }

    @XmlElement(name="ceb:ownerName")
    public String getOwnerName() {
        return StringUtil.isEmpty((String)this.ownerName);
    }

    @XmlElement(name="ceb:iacCode")
    public String getIacCode() {
        return StringUtil.isEmpty((String)this.iacCode);
    }

    @XmlElement(name="ceb:iacName")
    public String getIacName() {
        return StringUtil.isEmpty((String)this.iacName);
    }

    @XmlElement(name="ceb:emsNo")
    public String getEmsNo() {
        return StringUtil.isEmpty((String)this.emsNo);
    }

    @XmlElement(name="ceb:tradeMode")
    public String getTradeMode() {
        return StringUtil.isEmpty((String)this.tradeMode);
    }

    @XmlElement(name="ceb:trafMode")
    public String getTrafMode() {
        return StringUtil.isEmpty((String)this.trafMode);
    }

    @XmlElement(name="ceb:trafName")
    public String getTrafName() {
        return StringUtil.isEmpty((String)this.trafName);
    }

    @XmlElement(name="ceb:voyageNo")
    public String getVoyageNo() {
        return StringUtil.isEmpty((String)this.voyageNo);
    }

    @XmlElement(name="ceb:billNo")
    public String getBillNo() {
        return StringUtil.isEmpty((String)this.billNo);
    }

    @XmlElement(name="ceb:totalPackageNo")
    public String getTotalPackageNo() {
        return StringUtil.isEmpty((String)this.totalPackageNo);
    }

    @XmlElement(name="ceb:loctNo")
    public String getLoctNo() {
        return StringUtil.isEmpty((String)this.loctNo);
    }

    @XmlElement(name="ceb:licenseNo")
    public String getLicenseNo() {
        return StringUtil.isEmpty((String)this.licenseNo);
    }

    @XmlElement(name="ceb:country")
    public String getCountry() {
        return StringUtil.isEmpty((String)this.country);
    }

    @XmlElement(name="ceb:POD")
    public String getPOD() {
        return StringUtil.isEmpty((String)this.POD);
    }

    @XmlElement(name="ceb:freight")
    public BigDecimal getFreight() {
        return StringUtil.isEmpty((BigDecimal)this.freight);
    }

    @XmlElement(name="ceb:fCurrency")
    public String getfCurrency() {
        return StringUtil.isEmpty((String)this.fCurrency);
    }

    @XmlElement(name="ceb:fFlag")
    public String getfFlag() {
        return StringUtil.isEmpty((String)this.fFlag);
    }

    @XmlElement(name="ceb:insuredFee")
    public BigDecimal getInsuredFee() {
        return StringUtil.isEmpty((BigDecimal)this.insuredFee);
    }

    @XmlElement(name="ceb:iCurrency")
    public String getiCurrency() {
        return StringUtil.isEmpty((String)this.iCurrency);
    }

    @XmlElement(name="ceb:iFlag")
    public String getiFlag() {
        return StringUtil.isEmpty((String)this.iFlag);
    }

    @XmlElement(name="ceb:wrapType")
    public String getWrapType() {
        return StringUtil.isEmpty((String)this.wrapType);
    }

    @XmlElement(name="ceb:packNo")
    public Integer getPackNo() {
        return StringUtil.isEmpty((Integer)this.packNo);
    }

    @XmlElement(name="ceb:grossWeight")
    public BigDecimal getGrossWeight() {
        return StringUtil.isEmpty((BigDecimal)this.grossWeight);
    }

    @XmlElement(name="ceb:netWeight")
    public BigDecimal getNetWeight() {
        return StringUtil.isEmpty((BigDecimal)this.netWeight);
    }

    @XmlElement(name="ceb:note")
    public String getNote() {
        return StringUtil.isEmpty((String)this.note);
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

    public void setEbpCode(String ebpCode) {
        this.ebpCode = ebpCode;
    }

    public void setEbpName(String ebpName) {
        this.ebpName = ebpName;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    public void setCopNo(String copNo) {
        this.copNo = copNo;
    }

    public void setIeFlag(String ieFlag) {
        this.ieFlag = ieFlag;
    }

    public void setPortCode(String portCode) {
        this.portCode = portCode;
    }

    public void setIeDate(String ieDate) {
        this.ieDate = ieDate;
    }

    public void setStatisticsFlag(String statisticsFlag) {
        this.statisticsFlag = statisticsFlag;
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

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setIacCode(String iacCode) {
        this.iacCode = iacCode;
    }

    public void setIacName(String iacName) {
        this.iacName = iacName;
    }

    public void setEmsNo(String emsNo) {
        this.emsNo = emsNo;
    }

    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode;
    }

    public void setTrafMode(String trafMode) {
        this.trafMode = trafMode;
    }

    public void setTrafName(String trafName) {
        this.trafName = trafName;
    }

    public void setVoyageNo(String voyageNo) {
        this.voyageNo = voyageNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public void setTotalPackageNo(String totalPackageNo) {
        this.totalPackageNo = totalPackageNo;
    }

    public void setLoctNo(String loctNo) {
        this.loctNo = loctNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPOD(String POD) {
        this.POD = POD;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public void setfCurrency(String fCurrency) {
        this.fCurrency = fCurrency;
    }

    public void setfFlag(String fFlag) {
        this.fFlag = fFlag;
    }

    public void setInsuredFee(BigDecimal insuredFee) {
        this.insuredFee = insuredFee;
    }

    public void setiCurrency(String iCurrency) {
        this.iCurrency = iCurrency;
    }

    public void setiFlag(String iFlag) {
        this.iFlag = iFlag;
    }

    public void setWrapType(String wrapType) {
        this.wrapType = wrapType;
    }

    public void setPackNo(Integer packNo) {
        this.packNo = packNo;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

