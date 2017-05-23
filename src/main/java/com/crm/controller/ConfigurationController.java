package com.crm.controller;

import com.crm.service.ConfigurationService;

public class ConfigurationController {

	private ConfigurationService configurationService;

	public void setConfigurationService(ConfigurationService configurationService) {
		
		System.out.println("Configuration Service ---" + configurationService.hashCode());
		this.configurationService = configurationService;
	}
	
	
	
	public String getBean(){
		
		System.out.println(configurationService.hashCode());
		return "";
		
	}
	
}
