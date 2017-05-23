package com.crm.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.crm.Constant;

public class Sales implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long sNo;
	private Customer customer = new Customer(Constant.DEFAULT_CUST);
	private Date salesDate;
	private Product product = new Product(Constant.DEFAULT_PRODUCT);
	private BigDecimal qTY;
	private BigDecimal unitPrice;
	private float discount;
	private float tax;
	private BigDecimal amount;
	private BigDecimal totalAmount;

	public long getsNo() {
		return sNo;
	}

	public void setsNo(long sNo) {
		this.sNo = sNo;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public BigDecimal getqTY() {
		return qTY;
	}

	public void setqTY(BigDecimal qTY) {
		this.qTY = qTY;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

}
