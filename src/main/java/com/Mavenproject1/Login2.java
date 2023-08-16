package com.Mavenproject1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Login2 extends Baseclass {
public Login2()
{
	PageFactory.initElements(driver,this);
}
	@FindBy(xpath= LoginpageInterface.sign_btn)
	private WebElement sign_btn;
	
	@FindBy(xpath= LoginpageInterface.email_btn)
	private WebElement email_btn;
	
	@FindBy(xpath= LoginpageInterface.mobile_btn)
	private WebElement mobile_btn;
	
	@FindBy(id= LoginpageInterface.sumit_btn)
	private WebElement submit_btn;
	
	@FindBy(xpath= LoginpageInterface.verify_btn)
	private WebElement verify_btn;

	
	public WebElement getSign_btn() {
		return sign_btn;
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
	
	
	
	
	
	