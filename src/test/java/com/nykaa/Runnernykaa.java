package com.nykaa;

import java.util.Set;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Mavenproject1.PageobjectManager;
import com.base.Baseclass;
import com.retry.Retry;



public class Runnernykaa extends Baseclass {
	static PageobjectManager pom=PageobjectManager.getPom();
	@BeforeSuite
	public static void browserLaunch()
	{
		browserLaunch(pom.getConfig().getChromeLaunch());
		launchUrl(pom.getConfig().getLaunchUrl());
		
		}
	@BeforeTest
	public static void delCookies()
	{
		 if(deleteCookies()) {
			  System.out.println("Cookies Deleted = " +deleteCookies());
		  }
		  else {
			  System.out.println("Cookies not deleted");
		  }
	}
	@Test(priority=0)
public static void  LoginPage() throws InterruptedException
{
	elementClick(pom.getLog().getSign_btn());
	elementClick(pom.getLog().getEmail_btn());
	Thread.sleep(2000);
	Input(pom.getLog().getMobile_btn(),pom.getConfig().getMobileno());
	elementClick(pom.getLog().getSubmit_btn());
	Thread.sleep(50000);
	elementClick(pom.getLog().getVerify_btn());
}
	@Test(priority=1)
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
	Thread.sleep(4000);
	elementClick(pom.getPro().getHimalaya()); 	
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
@Test(priority=2)
public static void Cart() throws InterruptedException
{
	elementClick(pom.getCart().getCartcount_btn());
	 driver.switchTo().frame(0);
	 Thread.sleep(3000);
	 elementClick(pom.getCart().getQuntity_btn());
	 Thread.sleep(3000);
	 elementClick(pom.getCart().getOption_btn());
	 Thread.sleep(3000);
	 elementClick(pom.getCart().getProceed());
	 Thread.sleep(3000);
	 elementClick(pom.getCart().getDeliver());
	 Thread.sleep(3000);
}
@Test(priority=3,retryAnalyzer=Retry.class)
public static void payment() throws InterruptedException
{
	Thread.sleep(4000);
	//elementClick(pom.getPaym().getCredit());
	Thread.sleep(3000);
	elementClick(pom.getPaym().getCardno());
	Thread.sleep(3000);
	Input(pom.getPaym().getCardno(),pom.getConfig().getCardno());
	Thread.sleep(3000);
	elementClick(pom.getPaym().getExpdate());
	Thread.sleep(3000);
	Input(pom.getPaym().getExpdate(),pom.getConfig().getExpdate());
	Thread.sleep(3000);
	elementClick(pom.getPaym().getCvv());
	Thread.sleep(3000);
	Input(pom.getPaym().getCvv(),pom.getConfig().getCvv());
	Thread.sleep(3000);
	elementClick(pom.getPaym().getPay());
	Thread.sleep(3000);
	elementClick(pom.getPaym().getCreditcard());
	Thread.sleep(3000);
	elementClick(pom.getPaym().getPaybtn());
	//takeScreenshot("payment");
	}
@Test(dependsOnMethods="payment")
public static void screenShot()
{
takeScreenshot("payment");
}
	
}

	//public static void main(String[] args) throws Throwable
	//{
	//	browserLaunch();
		//LoginPage();
	//	productSerach();
		//Cart();
		//payment() ;
	//}
