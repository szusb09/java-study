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

@XmlRootElement(name = "ceb:CEB607Message")
@XmlType(propOrder = { "totalScoreVos", "baseTransfer" })
public class TotalScore implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -2624857883689374850L;
    private BaseTransfer baseTransfer;
    private List<TotalScoreVo> totalScoreVos;
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

    @XmlElement(name = "ceb:WayBill")
    public List<TotalScoreVo> getTotalScoreVos() {
        return this.totalScoreVos;
    }

    public void setTotalScoreVos(List<TotalScoreVo> totalScoreVos) {
        this.totalScoreVos = totalScoreVos;
    }

    @XmlElement(name = "ceb:BaseTransfer")
    public BaseTransfer getBaseTransfer() {
        return this.baseTransfer;
    }

    public void setBaseTransfer(BaseTransfer baseTransfer) {
        this.baseTransfer = baseTransfer;
    }
}
