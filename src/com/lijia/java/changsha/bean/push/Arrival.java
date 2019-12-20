package com.lijia.java.changsha.bean.push;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ceb:CEB507Message")
@XmlType(propOrder={"arrivalVos", "baseTransfer"})
public class Arrival implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -319341757868854885L;
	
	private BaseTransfer baseTransfer;
    private List<ArrivalVo> arrivalVos;
    private String guid;

    @XmlAttribute(name="guid")
    public String getGuid() {
        return this.guid;
    }

    @XmlAttribute(name="xmlns:ceb")
    public String getXmlnsceb() {
        return "http://www.chinaport.gov.cn/ceb";
    }

    @XmlAttribute(name="xmlns:xsi")
    public String getXmlnsxsi() {
        return "http://www.w3.org/2001/XMLSchema-instance";
    }

    @XmlAttribute(name="version")
    public String getVersion() {
        return "1.0";
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @XmlElement(name="ceb:Arrival")
    public List<ArrivalVo> getArrivalVos() {
        return this.arrivalVos;
    }

    public void setArrivalVos(List<ArrivalVo> arrivalVos) {
        this.arrivalVos = arrivalVos;
    }

    @XmlElement(name="ceb:BaseTransfer")
    public BaseTransfer getBaseTransfer() {
        return this.baseTransfer;
    }

    public void setBaseTransfer(BaseTransfer baseTransfer) {
        this.baseTransfer = baseTransfer;
    }

}
