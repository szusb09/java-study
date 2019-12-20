package com.lijia.java.changsha.bean.push;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ceb:CEB403Message")
@XmlType(propOrder = { "receipts", "baseTransfer" })
public class Receipts {
    private BaseTransfer baseTransfer;
    private List<ReceiptsHead> Receipts;
    private String guid;

    @XmlAttribute(name = "guid")
    public String getGuid() {
        return this.guid;
    }

    @XmlAttribute(name = "xmlns:ceb")
    public String getXmlnsceb() {
        return "http://www.chinaport.gov.cn/ceb";
    }

    @XmlAttribute(name = "xmlns:xsi")
    public String getXmlnsxsi() {
        return "http://www.w3.org/2001/XMLSchema-instance";
    }

    @XmlAttribute(name = "version")
    public String getVersion() {
        return "1.0";
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @XmlElement(name = "ceb:BaseTransfer")
    public BaseTransfer getBaseTransfer() {
        return baseTransfer;
    }

    public void setBaseTransfer(BaseTransfer baseTransfer) {
        this.baseTransfer = baseTransfer;
    }

    @XmlElement(name = "ceb:Receipts")
    public List<ReceiptsHead> getReceipts() {
        return Receipts;
    }

    public void setReceipts(List<ReceiptsHead> receipts) {
        Receipts = receipts;
    }

}
