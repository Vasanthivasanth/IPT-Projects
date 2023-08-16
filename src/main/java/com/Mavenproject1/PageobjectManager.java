package com.Mavenproject1;

import org.openqa.selenium.support.PageFactory;
import com.base.Baseclass;
import com.utility.ConfigReader;

public class PageobjectManager extends Baseclass
{
private  PageobjectManager()
{
	PageFactory.initElements(driver, this );
}
private static PageobjectManager pom;
private Login2 log;

private Product2 pro;

private Cart2 cart;

private Payment2 paym;


private ConfigReader config;


public static PageobjectManager getPom() {
	if(pom==null) {
	pom=new PageobjectManager();
	}
	return pom;
}

public ConfigReader getConfig() {
	if(config==null) {
		config=new ConfigReader();
		}
	return config;
}

public Login2 getLog() {
	if(log==null) {
log = new Login2();
}
	return log;
}

public Product2 getPro() {
	if(pro==null) {
	pro = new Product2();
}
	return pro;
}
public Cart2 getCart() {
	if(cart==null) {
	cart = new Cart2();
	}
	return cart;
}
public Payment2 getPaym() {
	if(paym==null) {
	paym = new Payment2();
	}
	return paym;
}
}


	
