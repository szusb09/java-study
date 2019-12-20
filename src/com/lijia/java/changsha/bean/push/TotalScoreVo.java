/*
 * Decompiled with CFR 0.137.
 */
package com.lijia.java.changsha.bean.push;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ceb:WayBill")
public class TotalScoreVo implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 5835877682300991127L;
    private TotalScoreHead totalScoreHead;
    private List<TotalScoreList> totalScoreLists;

    @XmlElement(name = "ceb:WayBillHead")
    public TotalScoreHead getTotalScoreHead() {
        return this.totalScoreHead;
    }

    @XmlElement(name = "ceb:WayBillList")
    public List<TotalScoreList> getTotalScoreLists() {
        return this.totalScoreLists;
    }

    public void setTotalScoreHead(TotalScoreHead totalScoreHead) {
        this.totalScoreHead = totalScoreHead;
    }

    public void setTotalScoreLists(List<TotalScoreList> totalScoreLists) {
        this.totalScoreLists = totalScoreLists;
    }

}
