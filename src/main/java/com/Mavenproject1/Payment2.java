package com.Mavenproject1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Payment2 extends Baseclass {
	
	public Payment2()
	{
		PageFactory.initElements(driver,this);
	}
		@FindBy(xpath=LoginpageInterface.credit)
		private WebElement credit;
		
		@FindBy(xpath=LoginpageInterface.cardno)
		private WebElement cardno;
		
		@FindBy(xpath=LoginpageInterface.expdate)
		private WebElement expdate;
		
		@FindBy(xpath=LoginpageInterface.cvv)
		private WebElement cvv;
		
		@FindBy(xpath=LoginpageInterface.pay)
		private WebElement pay;
		
		@FindBy(xpath=LoginpageInterface.creditcard)
		private WebElement creditcard;
		
		@FindBy(xpath=LoginpageInterface.PayNow)
		private WebElement paybtn;

		public WebElement getPaybtn() {
			return paybtn;
		}

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
	


