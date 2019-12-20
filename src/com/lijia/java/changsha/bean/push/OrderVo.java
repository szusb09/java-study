package com.lijia.java.changsha.bean.push;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ceb:Order")
public class OrderVo implements Serializable {
    private static final long serialVersionUID = -6006371050995380230L;
    private OrderHead orderHead;
    private List<OrderList> orderLists;

    @XmlElement(name = "ceb:OrderHead")
    public OrderHead getOrderHead() {
        return this.orderHead;
    }

    @XmlElement(name = "ceb:OrderList")
    public List<OrderList> getOrderLists() {
        return this.orderLists;
    }

    public void setOrderHead(OrderHead orderHead) {
        this.orderHead = orderHead;
    }

    public void setOrderLists(List<OrderList> orderLists) {
        this.orderLists = orderLists;
    }
}
