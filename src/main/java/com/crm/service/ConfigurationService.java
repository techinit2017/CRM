package com.crm.service;

import com.crm.dao.LOVDao;
import com.crm.dao.PricingDao;
import com.crm.dao.ProductDao;
import com.crm.dao.PurchaseDao;

/**
 * Service class will consist of DAO injection for
 * Product/Pricing/Configuration/LOV
 * 
 * @author harsmahe
 *
 */
public class ConfigurationService {

	private PricingDao pricingDao;
	private ProductDao productDao;
	private PurchaseDao purchaseDao;
	private LOVDao lovDao;

	public void setPricingDao(PricingDao pricingDao) {
		this.pricingDao = pricingDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void setPurchaseDao(PurchaseDao purchaseDao) {
		this.purchaseDao = purchaseDao;
	}

	public void setLovDao(LOVDao lovDao) {
		this.lovDao = lovDao;
	}

}
