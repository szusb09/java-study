/*
 * Decompiled with CFR 0.137.
 * 
 * Could not load the following classes:
 *  com.ym.dolphin.util.StringUtil
 */
package com.lijia.java.changsha.bean.push;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ceb:InventoryList")
@XmlType(propOrder={"gnum", "itemNo", "itemRecordNo", "itemName", "gcode", "gname", "gmodel", "barCode", "country", "currency", "qty", "qty1", "qty2", "unit", "unit1", "unit2", "price", "totalPrice", "note"})
public class InvtList
implements Serializable {
    private static final long serialVersionUID = -3667884999797085497L;
    private String gnum;
    private String itemNo;
    private String itemRecordNo;
    private String itemName;
    private String gcode;
    private String gname;
    private String gmodel;
    private String barCode;
    private String country;
    private String currency;
    private BigDecimal qty;
    private BigDecimal qty1;
    private BigDecimal qty2;
    private String unit;
    private String unit1;
    private String unit2;
    private BigDecimal price;
    private BigDecimal totalPrice;
    private String note;

    @XmlElement(name="ceb:gnum")
    public String getGnum() {
        return StringUtil.isEmpty((String)this.gnum);
    }

    @XmlElement(name="ceb:itemNo")
    public String getItemNo() {
        return StringUtil.isEmpty((String)this.itemNo);
    }

    @XmlElement(name="ceb:itemRecordNo")
    public String getItemRecordNo() {
        return StringUtil.isEmpty((String)this.itemRecordNo);
    }

    @XmlElement(name="ceb:itemName")
    public String getItemName() {
        return StringUtil.isEmpty((String)this.itemName);
    }

    @XmlElement(name="ceb:gcode")
    public String getGcode() {
        return StringUtil.isEmpty((String)this.gcode);
    }

    @XmlElement(name="ceb:gname")
    public String getGname() {
        return StringUtil.isEmpty((String)this.gname);
    }

    @XmlElement(name="ceb:gmodel")
    public String getGmodel() {
        return StringUtil.isEmpty((String)this.gmodel);
    }

    @XmlElement(name="ceb:barCode")
    public String getBarCode() {
        return StringUtil.isEmpty((String)this.barCode);
    }

    @XmlElement(name="ceb:country")
    public String getCountry() {
        return StringUtil.isEmpty((String)this.country);
    }

    @XmlElement(name="ceb:currency")
    public String getCurrency() {
        return StringUtil.isEmpty((String)this.currency);
    }

    @XmlElement(name="ceb:qty")
    public BigDecimal getQty() {
        return StringUtil.isEmpty((BigDecimal)this.qty);
    }

    @XmlElement(name="ceb:qty1")
    public BigDecimal getQty1() {
        return StringUtil.isEmpty((BigDecimal)this.qty1);
    }

    @XmlElement(name="ceb:qty2")
    public BigDecimal getQty2() {
        return StringUtil.isEmpty((BigDecimal)this.qty2);
    }

    @XmlElement(name="ceb:unit")
    public String getUnit() {
        return StringUtil.isEmpty((String)this.unit);
    }

    @XmlElement(name="ceb:unit1")
    public String getUnit1() {
        return StringUtil.isEmpty((String)this.unit1);
    }

    @XmlElement(name="ceb:unit2")
    public String getUnit2() {
        return StringUtil.isEmpty((String)this.unit2);
    }

    @XmlElement(name="ceb:price")
    public BigDecimal getPrice() {
        return StringUtil.isEmpty((BigDecimal)this.price);
    }

    @XmlElement(name="ceb:totalPrice")
    public BigDecimal getTotalPrice() {
        return StringUtil.isEmpty((BigDecimal)this.totalPrice);
    }

    @XmlElement(name="ceb:note")
    public String getNote() {
        return StringUtil.isEmpty((String)this.note);
    }

    public void setGnum(String gnum) {
        this.gnum = gnum;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public void setItemRecordNo(String itemRecordNo) {
        this.itemRecordNo = itemRecordNo;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setGcode(String gcode) {
        this.gcode = gcode;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public void setGmodel(String gmodel) {
        this.gmodel = gmodel;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public void setQty1(BigDecimal qty1) {
        this.qty1 = qty1;
    }

    public void setQty2(BigDecimal qty2) {
        this.qty2 = qty2;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setUnit1(String unit1) {
        this.unit1 = unit1;
    }

    public void setUnit2(String unit2) {
        this.unit2 = unit2;
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

