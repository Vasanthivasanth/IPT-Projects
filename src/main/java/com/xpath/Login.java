package com.xpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Login extends Baseclass{
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signIn_btn;
	
	@FindBy(xpath="//button[text()='Sign in with Mobile / Email']")
	private WebElement email_btn;
	
	@FindBy(xpath="//input[@name='emailMobile']")
	private WebElement mobile_btn;
	
	@FindBy(id="submitVerification")
private	WebElement submit_btn;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement verify_btn;
	
	
	public WebElement getSignIn_btn() {
		return signIn_btn;
	}
	public WebElement getEmail_btn() {
		return email_btn;
	}
	public WebElement getMobile_btn() {
		return mobile_btn;
	}
	public WebElement getSubmit_btn() {
		return submit_btn;
	}
	public WebElement getVerify_btn() {
		return verify_btn;
	}
	
}

	