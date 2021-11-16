package com.ibm.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
	WebDriver driver;
	 @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        
	        //Open browser
	        driver.get("http://alchemy.hguy.co/orangehrm");
	    }

	 @Test
	    public void DashboardTestCase() throws Exception  {
		 driver.findElement(By.id("txtUsername")).sendKeys("orange");
		 driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		 driver.findElement(By.id("btnLogin")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[contains(text(),'Dashboard')]")).click();
		 Thread.sleep(4000);
		 Actions act = new Actions(driver);
		 WebElement Applyleave=driver.findElement(By.xpath("//span[contains(text(),'Apply Leave')]"));
		 act.moveToElement(Applyleave).click().perform();
		 Thread.sleep(4000);
		 WebElement leaveType = driver.findElement(By.id("applyleave_txtLeaveType"));
		 Select SelectleaveType= new Select(leaveType);
		 SelectleaveType.selectByIndex(1);
		 WebElement dateBox = driver.findElement(By.id("applyleave_txtFromDate"));
		 dateBox.click();
		 dateBox.sendKeys("2021-06-11");
		 dateBox.sendKeys(Keys.TAB);
		 driver.findElement(By.id("applyBtn")).click();
		 WebElement myleave=driver.findElement(By.xpath("//*[contains(text(),'My Leave')]"));
		 act.moveToElement(myleave).click().perform();	 
	 }
	 @AfterTest
	    public void afterMethod() {
	        //Close the browser
	        driver.close();
	    }
}
