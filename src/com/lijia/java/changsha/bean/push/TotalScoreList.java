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

@XmlRootElement(name = "ceb:WayBillList")
@XmlType(propOrder = { "gnum", "totalPackageNo", "logisticsNo", "invtNo", "note" })
public class TotalScoreList implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -2284927679299054242L;
    private String gnum;
    private String totalPackageNo;
    private String logisticsNo;
    private String invtNo;
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

    @XmlElement(name = "ceb:invtNo")
    public String getInvtNo() {
        return StringUtil.isEmpty((String) this.invtNo);
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

    public void setInvtNo(String invtNo) {
        this.invtNo = invtNo;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
