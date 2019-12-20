/*
 * Decompiled with CFR 0.137.
 */
package com.lijia.java.changsha.bean.push;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ceb:Inventory")
public class InvtVo implements Serializable {
    private static final long serialVersionUID = 7155735575825971474L;
    private InvtHead invtHead;
    private List<InvtList> invtLists;

    @XmlElement(name = "ceb:InventoryHead")
    public InvtHead getInvtHead() {
        return this.invtHead;
    }

    @XmlElement(name = "ceb:InventoryList")
    public List<InvtList> getInvtLists() {
        return this.invtLists;
    }

    public void setInvtHead(InvtHead invtHead) {
        this.invtHead = invtHead;
    }

    public void setInvtLists(List<InvtList> invtLists) {
        this.invtLists = invtLists;
    }
}
