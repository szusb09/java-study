/*
 * Decompiled with CFR 0.137.
 */
package com.lijia.java.changsha.bean.push;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ceb:CEB603Message")
@XmlType(propOrder = { "invtList", "baseTransfer" })
public class Invt implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -4325779139454368500L;
    private BaseTransfer baseTransfer;
    private List<InvtVo> invtList;
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

    @XmlElement(name = "ceb:Inventory")
    public List<InvtVo> getInvtList() {
        return this.invtList;
    }

    public void setInvtList(List<InvtVo> invtList) {
        this.invtList = invtList;
    }

    @XmlElement(name = "ceb:BaseTransfer")
    public BaseTransfer getBaseTransfer() {
        return this.baseTransfer;
    }

    public void setBaseTransfer(BaseTransfer baseTransfer) {
        this.baseTransfer = baseTransfer;
    }
}
