package com.lijia.java.changsha.bean.push;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ceb:BaseTransfer")
@XmlType(propOrder={"copCode", "copName", "dxpMode", "dxpId"})
public class BaseTransfer implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6452200251308312253L;
	private String copCode;
    private String copName;
    private String dxpMode;
    private String dxpId;

    @XmlElement(name="ceb:copCode")
    public String getCopCode() {
        return this.copCode;
    }

    public void setCopCode(String copCode) {
        this.copCode = copCode;
    }

    @XmlElement(name="ceb:copName")
    public String getCopName() {
        return this.copName;
    }

    public void setCopName(String copName) {
        this.copName = copName;
    }

    @XmlElement(name="ceb:dxpMode")
    public String getDxpMode() {
        return this.dxpMode;
    }

    public void setDxpMode(String dxpMode) {
        this.dxpMode = dxpMode;
    }

    @XmlElement(name="ceb:dxpId")
    public String getDxpId() {
        return this.dxpId;
    }

    public void setDxpId(String dxpId) {
        this.dxpId = dxpId;
    }
}
