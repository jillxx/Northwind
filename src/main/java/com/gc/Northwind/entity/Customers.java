package com.gc.Northwind.entity;

import org.springframework.stereotype.Component;

@Component
public class Customers {
	private String customerID;
	private String companyName;
	private String contactName;
	private String contactTitle;

	public Customers() {

	}
	

	public Customers(String customerID) {
	
		this.customerID = customerID;
	}


	public Customers(String customerID, String companyName, String contactName, String contactTitle) {
		super();
		this.customerID = customerID;
		this.companyName = companyName;
		this.contactName = contactName;
		this.contactTitle = contactTitle;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTitle() {
		return contactTitle;
	}

	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}

	@Override
	public String toString() {
		return "Customers [customerID=" + customerID + ", companyName=" + companyName + ", contactName=" + contactName
				+ ", contactTitle=" + contactTitle + "]";
	}

	


}
