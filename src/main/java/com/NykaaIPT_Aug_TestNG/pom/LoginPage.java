package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT_Aug_TestNG.base.BaseClass;

public class LoginPage extends BaseClass implements Login{
	public LoginPage() {
		PageFactory.initElements(driver, this );
		}
	@FindBy(xpath = otp_verify_btn_xpath)
	private WebElement otp_verify_btn;
	public WebElement getOtp_verify_btn() {
		return otp_verify_btn;
	}
	public void setOtp_verify_btn(WebElement otp_verify_btn) {
		this.otp_verify_btn = otp_verify_btn;
	}
	public WebElement getUser_btn() {
		return user_btn;
	}
	public void setUser_btn(WebElement user_btn) {
		this.user_btn = user_btn;
	}
	@FindBy(xpath = user_btn_xpath )
	private WebElement user_btn;
	
	
}
