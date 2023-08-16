package com.Mavenproject1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Product2 extends Baseclass {
	public Product2()
	{
	PageFactory.initElements(driver, this);
	
	}
		@FindBy(xpath= LoginpageInterface.mombaby)
		private WebElement mombaby;
		
		
		@FindBy(xpath = LoginpageInterface.powder)
		private WebElement powder;
		
		@FindBy(xpath = LoginpageInterface.himalaya)
		private WebElement himalaya;
		
		@FindBy(xpath = LoginpageInterface.selectop)
		private WebElement selectop;
		
		@FindBy(xpath = LoginpageInterface.addtobag)
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
	
	
	


