package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT_Aug_TestNG.base.BaseClass;

public class LoginPage extends BaseClass implements Login {
	
	public LoginPage(){
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(xpath = signIn_btn_xpath)
	private WebElement signIn_btn;
	
	@FindBy(xpath = sign_with_mobile_xpath)
	private WebElement sign_with_mobile;

	public WebElement getSignIn_btn() {
		return signIn_btn;
	}

	public WebElement getSign_with_mobile() {
		return sign_with_mobile;
	}
	
	

}
