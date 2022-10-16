package com.practice.SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTC {
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
				  "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[2]/li[2]/button"));
				  registerButtonDriver.click(); 
				  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	
	  @Test 
	  public void TC_Register_valid_mail_FirstName_LastName() {
	 
	  driver.findElement(By.name("first_name")).sendKeys("bhuvanesh99");
	  driver.findElement(By.name("last_name")).sendKeys("bhuvanesh99");
	  driver.findElement(By.name("user_email")).sendKeys("bhuvanesh2@gmail.com");
	  driver.findElement(By.name("user_password")).sendKeys("123");
	  
	  driver.findElement(By.id("user_sign_up")).click();
	  Assert.assertEquals(driver.getTitle(), "MylestonesBook");
	  
	  driver.quit();
	  
	  }
	  
	  @Test 
	  public void TC_Register_InvalidEmail() {
	 
	  driver.findElement(By.name("first_name")).sendKeys("bhuvanesh99");
	  driver.findElement(By.name("last_name")).sendKeys("99");
	  driver.findElement(By.name("user_email")).sendKeys("bhuvanesh@.com");
	  driver.findElement(By.name("user_password")).sendKeys("123");
	  
	  driver.findElement(By.id("user_sign_up")).click();
	  System.out.println(driver.findElement(By.xpath("//*[@id=\"email_error\"]")).
	  getText());
	  Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"email_error\"]")).
	  getText(), "Invalid Email"); }
	 
	
	  @Test 
	  public void TC_Register_AlreadyexistingEmail() {
	  
	  driver.findElement(By.name("first_name")).sendKeys("bhuvanesh99");
	  driver.findElement(By.name("last_name")).sendKeys("99");
	  driver.findElement(By.name("user_email")).sendKeys("bhuvanesh2203@gmail.com")
	  ; driver.findElement(By.name("user_password")).sendKeys("123");
	  
	  driver.findElement(By.id("user_sign_up")).click();
	  System.out.println(driver.findElement(By.xpath(
	  "/html/body/div[1]/div/div/div/p")).getText());
	  Assert.assertEquals(driver.findElement(By.xpath(
	  "/html/body/div[1]/div/div/div/p")).getText(),
	  "Error! Email already exists."); driver.quit(); }
	 
	
	  @Test 
	  public void TC_Register_InvalidFirstname() {
	 
	  driver.findElement(By.name("first_name")).sendKeys("bhuvanesh 99");
	  driver.findElement(By.name("last_name")).sendKeys("99");
	  driver.findElement(By.name("user_email")).sendKeys("bhuvanesh2203@gmail.com")
	  ; driver.findElement(By.name("user_password")).sendKeys("123");
	  driver.findElement(By.id("user_sign_up")).click();
	  Assert.assertEquals(driver.findElement(By.xpath(
	  "//*[@id=\"first_name_error\"]")).getText(), "First name has space");
	  driver.quit(); }
	 
	
	@Test
	public void TC_Register_InvalidLastname()  {
		
		driver.findElement(By.name("first_name")).sendKeys("bhuvanesh99");
		driver.findElement(By.name("last_name")).sendKeys("9 9");
		driver.findElement(By.name("user_email")).sendKeys("bhuvanesh2203@gmail.com");
		driver.findElement(By.name("user_password")).sendKeys("123");
		driver.findElement(By.id("user_sign_up")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"last_name_error\"]")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"last_name_error\"]")).getText(), "Last name has space");
		driver.quit();
	}
}
