package com.lijia.java.changsha.bean.push;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ceb:OrderList")
@XmlType(propOrder = { "gnum", "itemNo", "itemName", "itemDescribe", "barCode", "unit", "currency", "qty", "price",
        "totalPrice", "note" })
public class OrderList implements Serializable {
    private static final long serialVersionUID = -1577898396402998118L;
    private String gnum;
    private String itemNo;
    private String itemName;
    private String itemDescribe;
    private String barCode;
    private String unit;
    private String currency;
    private BigDecimal qty;
    private BigDecimal price;
    private BigDecimal totalPrice;
    private String note;

    @XmlElement(name = "ceb:gnum")
    public String getGnum() {
        return StringUtil.isEmpty((String) this.gnum);
    }

    @XmlElement(name = "ceb:itemNo")
    public String getItemNo() {
        return StringUtil.isEmpty((String) this.itemNo);
    }

    @XmlElement(name = "ceb:itemName")
    public String getItemName() {
        return StringUtil.isEmpty((String) this.itemName);
    }

    @XmlElement(name = "ceb:itemDescribe")
    public String getItemDescribe() {
        return StringUtil.isEmpty((String) this.itemDescribe);
    }

    @XmlElement(name = "ceb:barCode")
    public String getBarCode() {
        return StringUtil.isEmpty((String) this.barCode);
    }

    @XmlElement(name = "ceb:unit")
    public String getUnit() {
        return StringUtil.isEmpty((String) this.unit);
    }

    @XmlElement(name = "ceb:currency")
    public String getCurrency() {
        return StringUtil.isEmpty((String) this.currency);
    }

    @XmlElement(name = "ceb:qty")
    public BigDecimal getQty() {
        return StringUtil.isEmpty((BigDecimal) this.qty);
    }

    @XmlElement(name = "ceb:price")
    public BigDecimal getPrice() {
        return StringUtil.isEmpty((BigDecimal) this.price);
    }

    @XmlElement(name = "ceb:totalPrice")
    public BigDecimal getTotalPrice() {
        return StringUtil.isEmpty((BigDecimal) this.totalPrice);
    }

    @XmlElement(name = "ceb:note")
    public String getNote() {
        return StringUtil.isEmpty((String) this.note);
    }

    public void setGnum(String gnum) {
        this.gnum = gnum;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemDescribe(String itemDescribe) {
        this.itemDescribe = itemDescribe;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setNote(String note) {
        this.note = note;
    }
}