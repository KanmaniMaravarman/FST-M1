package com.ibm.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity6 {
	WebDriver driver;
	 @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        
	        //Open browser
	        driver.get("http://alchemy.hguy.co/orangehrm");
	    }

	 @Test
	    public void DirectoryAddTestCase() throws Exception  {
		 driver.findElement(By.id("txtUsername")).sendKeys("orange");
		 driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		 driver.findElement(By.id("btnLogin")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[contains(text(),'Directory')]")).click();
		 Thread.sleep(4000);
		 WebElement sDir= driver.findElement(By.xpath("//*[contains(text(),'Search Directory')]"));
		 String searchDirectory = sDir.getText();
		 System.out.println("title of the directory : "+searchDirectory);
		 Assert.assertEquals(searchDirectory, "Search Directory");
	 }
	 @AfterTest
	    public void afterMethod() {
	        //Close the browser
	        driver.close();
	    }

}
