package com.to.JerseyProject;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CreditCard {
	
	private String creditCardNo;

	public String getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	
}
