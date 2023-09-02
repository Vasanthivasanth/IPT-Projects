package com.Mavenproject1;

public interface LoginpageInterface {
	
	//Login class
	String sign_btn="//button[text()='Sign in']";
	String email_btn="//button[text()='Sign in with Mobile / Email']";
	String mobile_btn="//input[@name='emailMobile']";
	String sumit_btn="submitVerification";
	String verify_btn="//button[@type='submit']";

	//Product interface
	String  mombaby="//a[text()='mom & baby']";
	String powder="//a[text()='Baby Powder']";
	String himalaya="//div[text()='Himalaya Baby Powder']";
	String selectop="//select[@class='css-2t5nwu']";
	String addtobag="//button[@class=' css-13zjqg6'][1]";

	//Add to cart
	
	String cartcount ="//span[@class='cart-count']";
	String quantity="(//img[@class='css-g7xef ek8d9s80'])[2]";
	String option="(//div[@class='css-bfwsku'])[2]";
	String proceed="//span[text()='Proceed']";
	String deliver="(//button[text()='Deliver here'])[2]";
	
	//payment
	
	String credit="//p[text()='Credit/Debit Card']";
	String cardno="//input[@placeholder='Card Number']";
	String expdate="//input[@label='Expiry (MM/YY)']";
	String cvv="//input[@class='input-element  secure-font']";
	String pay="//button[@class='css-v61n2j e8tshxd0']";
	String creditcard="//button[text()='Secure Card and pay']";
	String PayNow="//button[text()='Pay Now']";
	
}
