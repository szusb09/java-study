package com.lijia.java.changsha.bean.push;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ceb:Arrival")
public class ArrivalVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1024286923398378137L;
	
	private ArrivalHead arrivalHead;
   
	private List<ArrivalList> arrivalLists;
	
	@XmlElement(name="ceb:ArrivalHead")
    public ArrivalHead getArrivalHead() {
		return arrivalHead;
	}
	
	public void setArrivalHead(ArrivalHead arrivalHead) {
		this.arrivalHead = arrivalHead;
	}
	
	@XmlElement(name="ceb:ArrivalList")
	public List<ArrivalList> getArrivalLists() {
		return arrivalLists;
	}
	
	
	public void setArrivalLists(List<ArrivalList> arrivalLists) {
		this.arrivalLists = arrivalLists;
	}

    
    
}
