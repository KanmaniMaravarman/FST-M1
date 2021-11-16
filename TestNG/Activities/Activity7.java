package com.ibm.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
	 @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        
	        //Open browser
	        driver.get("http://alchemy.hguy.co/orangehrm");
	    }

	 @Test
	    public void QualificationTestCase() throws Exception  {
		 driver.findElement(By.id("txtUsername")).sendKeys("orange");
		 driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		 driver.findElement(By.id("btnLogin")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[contains(text(),'My Info')]")).click();
		 Thread.sleep(2000);
		 Actions act = new Actions(driver);
		 WebElement Qualifications= driver.findElement(By.xpath("(//*[contains(text(),'Qualifications')])[2]"));
		 //act.moveToElement(Qualifications).perform();
		 Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", Qualifications);
		 act.moveToElement(Qualifications).click().perform();	 
		 Thread.sleep(2000);
		 driver.findElement(By.id("addWorkExperience")).click();
		 driver.findElement(By.id("experience_employer")).sendKeys("IBM");
		 driver.findElement(By.id("experience_jobtitle")).sendKeys("Automation Tester");
		 driver.findElement(By.id("btnWorkExpSave")).click();
		  
	 }
	 
	 @AfterTest
	    public void afterMethod() {
	        //Close the browser
	        driver.close();
	    }


}
