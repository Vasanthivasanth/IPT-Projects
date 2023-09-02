package com.fileupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;

public class Fileupload extends Baseclass {
	static Robot r;
	private static void folder() throws AWTException
	{
	
		browserLaunch("chrome");
		driver.get("https://www.filemail.com/share/upload-file");
		driver.manage().window().maximize();
		WebElement addfolder=driver.findElement(By.id("addFolderBtn"));
		addfolder.click();
		 r =new Robot();
		StringSelection ss= new StringSelection("C:\\Users\\Lenovo\\Desktop");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	private static void notepad()
	{
		
	}
	public static void main(String[] args) throws AWTException
		{
		
			folder();
}
}
