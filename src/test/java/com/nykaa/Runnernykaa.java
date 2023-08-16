package com.nykaa;

import java.util.Set;

import com.Mavenproject1.PageobjectManager;
import com.base.Baseclass;


public class Runnernykaa extends Baseclass {
	static PageobjectManager pom=PageobjectManager.getPom();
	
	public static void browserLaunch()
	{
		browserLaunch(pom.getConfig().getChromeLaunch());
		launchUrl(pom.getConfig().getLaunchUrl());
		
		}
public static void  LoginPage() throws InterruptedException
{
	elementClick(pom.getLog().getSign_btn());
	elementClick(pom.getLog().getEmail_btn());
	Thread.sleep(2000);
	Input(pom.getLog().getMobile_btn(),pom.getConfig().getMobileno());
	elementClick(pom.getLog().getSubmit_btn());
	Thread.sleep(40000);
	elementClick(pom.getLog().getVerify_btn());
}
public static void productSerach() throws Throwable
{
	Thread.sleep(3000);
	actionWebElement(pom.getPro().getMombaby(),"Move to Webelement");
	actionWebElement(pom.getPro().getPowder(),"click WebElement");
	Thread.sleep(3000);
	robotClass("pagedown");
	Set<String> windowHandles = driver.getWindowHandles();//window handles
	for (String str : windowHandles) {
	driver.switchTo().window(str);
	}
	Thread.sleep(3000);
	actionWebElement(pom.getPro().getPowder(),"click WebElement"); 	
	Thread.sleep(3000);
	Set<String> window = driver.getWindowHandles();
	for (String str1 : window) {
	driver.switchTo().window(str1);
 }
	 robotClass("pagedown");
	 Thread.sleep(3000);
	 selectDropdown(pom.getPro().getSelectop(),"value","2");
	 robotClass("pagedown");
	 Thread.sleep(3000);
	 elementClick(pom.getPro().getAddtobag());
	 	 
}

public static void Cart()
{
	
}
	public static void main(String[] args) throws Throwable
	{
		browserLaunch();
		//LoginPage();
		productSerach();
	}
}