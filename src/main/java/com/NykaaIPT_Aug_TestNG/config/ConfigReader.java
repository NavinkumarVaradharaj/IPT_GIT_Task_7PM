package com.NykaaIPT_Aug_TestNG.config;

import java.util.Properties;

public class ConfigReader {
	
	Properties p = PropertyReader.propReader();
	private String browser = p.getProperty("browser");
	private String url = p.getProperty("url");
	
	public String getBrowser() {
		return browser;
	}
	
	public String getUrl() {
		return url;
	}
	
	

}
