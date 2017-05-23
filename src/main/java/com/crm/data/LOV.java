package com.crm.data;

import java.io.Serializable;

public class LOV implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long no;
	private String setCode;
	private String itemDesc;

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public String getSetCode() {
		return setCode;
	}

	public void setSetCode(String setCode) {
		this.setCode = setCode;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}


}
