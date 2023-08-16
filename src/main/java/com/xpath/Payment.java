package com.xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Payment extends Baseclass{
	public Payment()
	{
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//p[text()='Credit/Debit Card']")
private WebElement credit;

@FindBy(xpath="(//input[@class='input-element  '])[1]")
private WebElement cardno;

@FindBy(xpath="//input[@label='Expiry (MM/YY)']")
private WebElement expdate;

@FindBy(xpath="//input[@class='input-element  secure-font']")
private WebElement cvv;

@FindBy(xpath="//button[@class='css-v61n2j e8tshxd0']")
private WebElement pay;

@FindBy(xpath="//button[text()='Secure Card and pay']")
private WebElement creditcard;
public WebElement getCredit() {
	return credit;
}

public WebElement getCardno() {
	return cardno;
}

public WebElement getExpdate() {
	return expdate;
}

public WebElement getCvv() {
	return cvv;
}

public WebElement getPay() {
	return pay;
}

public WebElement getCreditcard() {
	return creditcard;
}
}










	
	
	


	