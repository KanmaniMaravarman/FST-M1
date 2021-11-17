package com.ibm.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
	
	WebDriver driver;
	 @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        
	        //Open browser
	        driver.get("http://alchemy.hguy.co/orangehrm");
	    }
	 @Test(priority=1)
	    public void MyInfoTestCase()throws Exception  {
		 driver.findElement(By.id("txtUsername")).sendKeys("orange");
		 driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		 driver.findElement(By.id("btnLogin")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[contains(text(),'My Info')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("btnSave")).click();
		 WebElement firstName =driver.findElement(By.id("personal_txtEmpFirstName"));
		 firstName.click();
		 Thread.sleep(2000);
		 Actions act = new Actions(driver);
		 act.doubleClick(firstName).perform();
		 Thread.sleep(2000);
		 firstName.sendKeys("Janani");
		 Thread.sleep(2000);
		 driver.findElement(By.id("btnSave")).click(); 
		 
	 }
	 
	 @AfterTest
	    public void afterMethod() {
	        //Close the browser
	        driver.close();
	    }

	 

}
