package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage implements Cart {
	
	

	@FindBy(xpath = "delete_icon_xpath")
	private WebElement delete_icon;
	
	public WebElement getDelete_icon() {
		return delete_icon;
	}

	
	@FindBy(xpath = "remove_btn_xpath")
	private WebElement remove_btn;
	
	public WebElement getRemove_btn() {
		return remove_btn;
	}

}
