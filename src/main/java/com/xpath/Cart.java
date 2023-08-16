package com.xpath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Cart extends Baseclass{

	public Cart() {
		PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[@class='cart-count']")
private WebElement cartcount_btn;

@FindBy(xpath="(//img[@class='css-g7xef ek8d9s80'])[2]")
private WebElement quantity_btn;

@FindBy(xpath="(//div[@class='css-bfwsku'])[2]")
private WebElement option_btn;

@FindBy(xpath="//span[text()='Proceed']")
private WebElement proceed_btn;

@FindBy(xpath="(//button[text()='Deliver here'])[2]")
private WebElement deliver_btn;

public WebElement getCartcount_btn() {
	return cartcount_btn;
}

public WebElement getQuantity_btn() {
	return quantity_btn;
}

public WebElement getOption_btn() {
	return option_btn;
}

public WebElement getProceed_btn() {
	return proceed_btn;
}

public WebElement getDeliver_btn() {
	return deliver_btn;
}

}






