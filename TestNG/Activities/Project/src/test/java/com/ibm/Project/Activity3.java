package com.ibm.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	 @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        
	        //Open browser
	        driver.get("http://alchemy.hguy.co/orangehrm");
	    }

	 @Test
	    public void LoginTestCase() {
		 driver.findElement(By.id("txtUsername")).sendKeys("orange");
		 driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		 driver.findElement(By.id("btnLogin")).click();
		 
	 }
	 @Test
	 public void  HomePageValidation() {
		 WebElement title = driver.findElement(By.xpath("//a/img"));
		 String titleValidation = title.getAttribute("alt");
		 System.out.println("Title of the page :" +titleValidation);
		 Assert.assertEquals("LinkedIn OrangeHRM group", titleValidation);
	 }
	 @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }

}
