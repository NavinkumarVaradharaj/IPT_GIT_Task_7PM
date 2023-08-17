package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT_Aug_TestNG.base.BaseClass;

public class CartPage extends BaseClass implements Cart {

	public CartPage () {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath=bag_icon_xpath)
	private WebElement bag_icon;
	
	@FindBy(xpath=bag_frame_xpath)
	private WebElement bag_frame;

	public WebElement getBag_icon() {
		return bag_icon;
	}

	public WebElement getBag_frame() {
		return bag_frame;
	}
	
	
}
