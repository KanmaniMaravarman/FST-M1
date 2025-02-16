package com.ibm.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
	 @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        
	        //Open browser
	        driver.get("http://alchemy.hguy.co/orangehrm");
	    }
	 @Test
	 public void getTitle() {
		 
		 WebElement img = driver.findElement(By.xpath("//div/img"));
		 String src = img.getAttribute("src");
		 System.out.println("url of the header image :" +src);
		 
	 }
	 @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }
	 

}
