package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT_Aug_TestNG.base.BaseClass;

public class PaymentPage extends BaseClass implements Payment {

	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = cardnumber_xpath)
	private WebElement cardnumber;
	
	@FindBy (xpath = expirydate_xpath)
	private WebElement expirydate;

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getExpirydate() {
		return expirydate;
	}
}
