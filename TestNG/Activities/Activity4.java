package com.ibm.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
	WebDriver driver;
	 @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        
	        //Open browser
	        driver.get("http://alchemy.hguy.co/orangehrm");
	    }

	 @Test
	    public void EmployeeAddTestCase() throws Exception  {
		 driver.findElement(By.id("txtUsername")).sendKeys("orange");
		 driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		 driver.findElement(By.id("btnLogin")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[contains(text(),'PIM')]")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.id("btnAdd")).click();
		 driver.findElement(By.id("firstName")).sendKeys("Jhon");
		 driver.findElement(By.id("lastName")).sendKeys("Christ");
		 driver.findElement(By.id("btnSave")).click();
		 driver.findElement(By.xpath("//*[contains(text(),'Employee List')]")).click();
		 driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Jhon");
		 driver.findElement(By.id("searchBtn")).click();
		 
		 
	 }
	 @AfterTest
	    public void afterMethod() {
	        //Close the browser
	        driver.close();
	    }

	 

}
