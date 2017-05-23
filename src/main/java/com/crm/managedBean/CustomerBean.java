package com.crm.managedBean;

import java.util.ArrayList;
import java.util.List;

import com.crm.data.Customer;



public class CustomerBean {
	
	private List<Customer> customerlist=new ArrayList();

	public List<Customer> getCustomerlist() {
		return customerlist;
	}

	public void setCustomerlist(List<Customer> customerlist) {
		this.customerlist = customerlist;
	}
	
	
	
}

