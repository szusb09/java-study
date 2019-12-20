package com.lijia.java.changsha.bean.receipt;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ceb:CEB304Message")
@XmlType(propOrder = { "orderVos", "baseTransfer" })
public class Order implements Serializable {
    private static final long serialVersionUID = -7037228150772853227L;
    private List<IcdspReceiptOrder> orderVos;
    private String guid;

    @XmlAttribute(name = "guid")
    public String getGuid() {
        return this.guid;
    }

    @XmlAttribute(name = "xmlns")
    public String getXmlnsceb() {
        return "http://www.chinaport.gov.cn/ceb";
    }

    @XmlAttribute(name = "version")
    public String getVersion() {
        return "1.0";
    }

    @XmlElement(name = "OrderReturn")
    public List<IcdspReceiptOrder> getOrderVos() {
        return this.orderVos;
    }

    public void setOrderVos(final List<IcdspReceiptOrder> orderVos) {
        this.orderVos = orderVos;
    }

    public void setGuid(final String guid) {
        this.guid = guid;
    }
}
