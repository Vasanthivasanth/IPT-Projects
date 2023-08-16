package com.Mavenproject1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Cart2 extends Baseclass {

	public  Cart2()
	{
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = LoginpageInterface.cartcount)
	private WebElement cartcount_btn;
	
	@FindBy(xpath = LoginpageInterface.quantity)
	private WebElement quntity_btn;
	
	@FindBy(xpath = LoginpageInterface.option)
	private WebElement option_btn;
	
	@FindBy(xpath = LoginpageInterface.proceed)
	private WebElement proceed;
	
	@FindBy(xpath = LoginpageInterface.deliver)
	private WebElement deliver;

	public WebElement getCartcount_btn() {
		return cartcount_btn;
	}

	public WebElement getQuntity_btn() {
		return quntity_btn;
	}

	public WebElement getOption_btn() {
		return option_btn;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getDeliver() {
		return deliver;
	}
}
