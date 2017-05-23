package com.crm.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Price implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long no;
	private Product product;
	private BigDecimal purchasePrice;
	private Date startDate;
	private Date endDate;

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


}
