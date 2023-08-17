package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.NykaaIPT_Aug_TestNG.base.BaseClass;

public class ProductPage extends BaseClass implements Product {
	
	@FindBy(xpath = size_dropdown_xpath)
	private WebElement size_dropdown;
	
	@FindBy(xpath = addToBag_btn_xpath)
	private WebElement addToBag_btn;

	public WebElement getSize_dropdown() {
		return size_dropdown;
	}

	public WebElement getAddToBag_btn() {
		return addToBag_btn;
	}
	
	

}
