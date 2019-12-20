/*
 * Decompiled with CFR 0.137.
 * 
 * Could not load the following classes:
 *  com.ym.dolphin.util.StringUtil
 */
package com.lijia.java.changsha.bean.push;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ceb:DepartureList")
@XmlType(propOrder = { "gnum", "totalPackageNo", "logisticsNo", "note" })
public class LeaveList implements Serializable {
    private static final long serialVersionUID = 318604053103315492L;
    private String gnum;
    private String totalPackageNo;
    private String logisticsNo;
    private String note;

    @XmlElement(name = "ceb:gnum")
    public String getGnum() {
        return StringUtil.isEmpty((String) this.gnum);
    }

    @XmlElement(name = "ceb:totalPackageNo")
    public String getTotalPackageNo() {
        return StringUtil.isEmpty((String) this.totalPackageNo);
    }

    @XmlElement(name = "ceb:logisticsNo")
    public String getLogisticsNo() {
        return StringUtil.isEmpty((String) this.logisticsNo);
    }

    @XmlElement(name = "ceb:note")
    public String getNote() {
        return StringUtil.isEmpty((String) this.note);
    }

    public void setGnum(String gnum) {
        this.gnum = gnum;
    }

    public void setTotalPackageNo(String totalPackageNo) {
        this.totalPackageNo = totalPackageNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
