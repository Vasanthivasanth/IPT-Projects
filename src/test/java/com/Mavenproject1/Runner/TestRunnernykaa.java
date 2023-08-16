package com.Mavenproject1.Runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunnernykaa {
	static WebDriver driver;
	static Actions act;
	static Robot r;
	static Select s;

private static void browserLaunch()
	{
WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.nykaa.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
private static void loginPage() throws InterruptedException
{

	WebElement sign=driver.findElement(By.xpath("//button[text()='Sign in']"));
	sign.click();
	 WebElement email=driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
	 email.click();
      WebElement mobileno=driver.findElement(By.xpath("//input[@name='emailMobile']"));
	 mobileno.sendKeys("9524952720");
     WebElement submit=driver.findElement(By.id("submitVerification"));
	 submit.click();
	 Thread.sleep(40000);
	 WebElement verify = driver.findElement(By.xpath("//button[@type='submit']"));
	 verify.click();
 }
private static void productSearch() throws InterruptedException, AWTException
{
	
 act = new Actions(driver);
 Thread.sleep(3000);
WebElement mombabytab= driver.findElement(By.xpath("//a[text()='mom & baby']"));
act.moveToElement(mombabytab).build().perform();
		
 WebElement powderbtn = driver.findElement(By.xpath("//a[text()='Baby Powder']"));
 act.click(powderbtn).build().perform();
Thread.sleep(3000);
r=new Robot();
 r.keyPress(KeyEvent.VK_PAGE_DOWN);
Set<String> windowHandles = driver.getWindowHandles();
for (String str : windowHandles) {
 driver.switchTo().window(str);
  }
Thread.sleep(3000);
				 
 WebElement powder = driver.findElement(By.xpath("//div[text()='Himalaya Baby Powder']"));
act. click(powder).build().perform();
 Thread.sleep(3000);
Set<String> window = driver.getWindowHandles();
 for (String str1 : window) {
driver.switchTo().window(str1);
 }
r.keyPress(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(3000);
 WebElement selectoption=driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
// selectoption.click();
 s=new Select(selectoption);
s.selectByVisibleText("200g");
r.keyPress(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(4000);
WebElement addtobag=driver.findElement(By.xpath("//button[@class=' css-13zjqg6'][1]"));
addtobag.click();

}
	
	
public static void addtoBag() throws AWTException, InterruptedException
	{
	

WebElement cartcount=driver.findElement(By.xpath("//span[@class='cart-count']"));
  cartcount.click();
 driver.switchTo().frame(0);
WebElement quantity=driver.findElement(By.xpath("(//img[@class='css-g7xef ek8d9s80'])[2]"));
quantity.click();

WebElement option=driver.findElement(By.xpath("(//div[@class='css-bfwsku'])[2]"));
option.click();
WebElement proceed=driver.findElement(By.xpath("//span[text()='Proceed']"));
proceed.click();
WebElement deliverhere = driver.findElement(By.xpath("(//button[text()='Deliver here'])[2]"));
deliverhere.click();
//WebElement guest=driver.findElement(By.xpath("//button[text()='Continue as guest']"));
//guest.click();
//Thread.sleep(3000);
//WebElement pincode =driver.findElement(By.xpath("(//input[@class='input-element  '])[1]"));
//pincode.sendKeys("600007");
//Thread.sleep(4000);
//WebElement flat =driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']"));
//flat.click();
//Thread.sleep(3000);
//flat.sendKeys("108");
//WebElement  area=driver.findElement(By.xpath("//textarea[@class='input-element input-area ']"));
//area.click();
//Thread.sleep(3000);
//area.sendKeys("chennai");
//r.keyPress(KeyEvent.VK_PAGE_DOWN);
//Thread.sleep(3000);
//r.keyPress(KeyEvent.VK_TAB);
//Thread.sleep(3000);
//WebElement name=driver.findElement(By.xpath("(//input[@placeholder='Name']"));
////name.click();
//name.sendKeys("vasantha");
//Thread.sleep(3000);
//r.keyPress(KeyEvent.VK_TAB);
//Thread.sleep(3000);
//WebElement phone=driver.findElement(By.xpath("(//input[@placeholder='Phone']"));
////phone.click();
//phone.sendKeys("9524952720");
//Thread.sleep(3000);
//r.keyPress(KeyEvent.VK_TAB);
//Thread.sleep(3000);
//WebElement mailid=driver.findElement(By.xpath("//input[@placeholder='Email ID']"));
//mailid.sendKeys("vasantha");
//Thread.sleep(3000);
//driver.findElement(By.xpath("//button[text()='Ship to this address']")).click();

	}
	public static void payOption() throws Throwable
	{
		WebElement credit=driver.findElement(By.xpath("//p[text()='Credit/Debit Card']"));
		credit.click();
		WebElement cardno=driver.findElement(By.xpath("(//input[@class='input-element  '])[1]"));
		cardno.click();
		cardno.sendKeys("4461 2086 5633 7782");
		WebElement exp=driver.findElement(By.xpath("//input[@label='Expiry (MM/YY)']"));
		exp.click();
		Thread.sleep(2000);
		exp.sendKeys("10/27");
		WebElement cvv=driver.findElement(By.xpath("//input[@class='input-element  secure-font']"));
		cvv.sendKeys("315");
		WebElement pay=driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']"));
		pay.click();
		WebElement creditcard=driver.findElement(By.xpath("//button[text()='Secure Card and pay']"));
		creditcard.click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Mavenproject1\\screenshot\\payment.png");
		FileHandler.copy(src, dest);
		WebElement closebtn=driver.findElement(By.xpath("//button[text()='Close']"));
		closebtn.click();
		}
	private static void removeBag()
	{
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		   js1.executeScript("window.scrollBy(0,1000)");
		   WebElement option =driver.findElement(By.xpath("(//img[@alt='Image'])[22]"));
			option.click();
			WebElement edit =driver.findElement(By.xpath("//p[text()='Edit']"));
			edit.click();
	}
	
		public static void main(String[] args) throws Throwable
		{
			browserLaunch();
			loginPage();
			productSearch();
			addtoBag();
			payOption();
			//removeBag();
			
}
}



