package com.lijia.java.changsha.bean.push;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ceb:CEB605Message")
@XmlType(propOrder = { "invtCancel", "baseTransfer" })
public class Cancel implements Serializable {
    private static final long serialVersionUID = 6296016476967109926L;
    private BaseTransfer baseTransfer;
    private List<CancelVo> invtCancel;
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
        return this.baseTransfer;
    }

    public void setBaseTransfer(BaseTransfer baseTransfer) {
        this.baseTransfer = baseTransfer;
    }

    @XmlElement(name = "ceb:InvtCancel")
    public List<CancelVo> getInvtCancel() {
        return this.invtCancel;
    }

    public void setInvtCancel(List<CancelVo> invtCancel) {
        this.invtCancel = invtCancel;
    }
}
