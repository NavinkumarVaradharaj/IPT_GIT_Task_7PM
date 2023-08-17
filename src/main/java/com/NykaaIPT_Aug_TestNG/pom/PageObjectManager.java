package com.NykaaIPT_Aug_TestNG.pom;

import com.NykaaIPT_Aug_TestNG.config.ConfigReader;

public class PageObjectManager {
	
	private PageObjectManager() {
		
	}
	
	private LoginPage login_page ;
	
	private PaymentPage payment_page;
	
	private ProductPage product_page;
	
	private CartPage cart_page;
	
	private ConfigReader config_reader;
	
	private static PageObjectManager pom ;

	public LoginPage getLogin_page() {
		if(login_page == null) {
			login_page = new LoginPage();
		}
		return login_page;
	}

	public PaymentPage getPayment_page() {
		if(payment_page == null) {
			payment_page = new PaymentPage();
		}

		return payment_page;
	}

	public ProductPage getProduct_page() {
		if(product_page == null) {
			product_page = new ProductPage();
		}
		return product_page;
	}

	public CartPage getCart_page() {
		if(cart_page == null) {
			cart_page = new CartPage();
		}

		return cart_page;
	}
	

	public ConfigReader getConfig_reader() {
		if(config_reader == null) {
			config_reader = new ConfigReader();
		}
		return config_reader;
	}

	public static PageObjectManager getPom() {
		if(pom == null) {
			pom = new PageObjectManager();
		}

		return pom;
	}
	
	

}
