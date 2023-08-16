package com.xpath;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Baseclass;

public class Product extends Baseclass{
	public Product()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[text()='mom & baby']")
private WebElement mombaby;

@FindBy(xpath="//a[text()='Baby Powder'])")
private WebElement powder;

@FindBy(xpath="//div[text()='Himalaya Baby Powder']")
private WebElement himalaya;

@FindBy(xpath="//select[@class='css-2t5nwu']")
private WebElement selectop;

@FindBy(xpath="//button[@class=' css-13zjqg6'][1]")
private WebElement addtobag;

public WebElement getMombaby() {
	return mombaby;
}

public WebElement getPowder() {
	return powder;
}

public WebElement getHimalaya() {
	return himalaya;
}

public WebElement getSelectop() {
	return selectop;
}

public WebElement getAddtobag() {
	return addtobag;
}



}




	
	
	
	
	
	
	
	
