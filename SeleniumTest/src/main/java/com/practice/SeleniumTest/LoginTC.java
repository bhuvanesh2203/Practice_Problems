package com.practice.SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTC {
	WebDriver driver ;
	@BeforeMethod  
	public void before_method() {
		 System.setProperty("webdriver.chrome.driver",
				  "C:\\drivers\\chrome\\chromedriver.exe"); 
		  driver = new
				  ChromeDriver();
				  driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
				  driver.get("https://staging.mylestones.com/");
				  driver.manage().window().maximize(); WebElement
				  registerButtonDriver=driver.findElement(By.xpath(
				  "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[2]/li[3]/a"));
				  registerButtonDriver.click();
	}
	
	
	 @Test 
	  public void TC_Login_validEmail_Valid_password() {
		 driver.findElement(By.id("user_email")).sendKeys("bhuvanesh2203@gmail.com");
		 driver.findElement(By.id("user_password_signin")).sendKeys("123456789");
		 driver.findElement(By.id("sign_up_button")).click();
		 Assert.assertEquals(driver.getTitle(), "MylestonesBook");
		 driver.quit();
		  }
	 @Test 
	  public void TC_Login_validEmail_InValid_password() {
		 driver.findElement(By.id("user_email")).sendKeys("bhuvanesh2203@gmail.com");
		 driver.findElement(By.id("user_password_signin")).sendKeys("16789");
		 driver.findElement(By.id("sign_up_button")).click();
		 Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/p")).getText(), "Error! Email or password is incorrect.");
		 driver.quit();
	 }
	 @Test 
	  public void TC_Login_validEmail_InValidemail() {
		 driver.findElement(By.id("user_email")).sendKeys("bhuvanes3@gmail.com");
		 driver.findElement(By.id("user_password_signin")).sendKeys("123456789");
		 driver.findElement(By.id("sign_up_button")).click();
		 Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/p")).getText(), "Error! Email or password is incorrect.");
		 driver.quit();
	 }

	 
	 
}
