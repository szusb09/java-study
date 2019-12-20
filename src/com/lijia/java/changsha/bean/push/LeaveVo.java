/*
 * Decompiled with CFR 0.137.
 */
package com.lijia.java.changsha.bean.push;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ceb:Departure")
public class LeaveVo implements Serializable {
    private static final long serialVersionUID = -7949050629026694934L;
    private LeaveHead leaveHead;
    private List<LeaveList> leaveLists;

    @XmlElement(name = "ceb:DepartureHead")
    public LeaveHead getLeaveHead() {
        return this.leaveHead;
    }

    public void setLeaveHead(LeaveHead leaveHead) {
        this.leaveHead = leaveHead;
    }

    @XmlElement(name = "ceb:DepartureList")
    public List<LeaveList> getLeaveLists() {
        return this.leaveLists;
    }

    public void setLeaveLists(List<LeaveList> leaveLists) {
        this.leaveLists = leaveLists;
    }
}
