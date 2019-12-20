package com.lijia.java.changsha.bean.push;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ceb:CEB303Message")
@XmlType(propOrder = { "orderVos", "baseTransfer" })
public class Order implements Serializable {
    private static final long serialVersionUID = -7037228150772853227L;
    private BaseTransfer baseTransfer;
    private List<OrderVo> orderVos;
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

    @XmlElement(name = "ceb:Order")
    public List<OrderVo> getOrderVos() {
        return this.orderVos;
    }

    public void setOrderVos(List<OrderVo> orderVos) {
        this.orderVos = orderVos;
    }

    @XmlElement(name = "ceb:BaseTransfer")
    public BaseTransfer getBaseTransfer() {
        return this.baseTransfer;
    }

    public void setBaseTransfer(BaseTransfer baseTransfer) {
        this.baseTransfer = baseTransfer;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }
}
