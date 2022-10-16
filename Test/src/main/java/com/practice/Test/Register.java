package com.practice.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Register {
	@Test
	public void test1() {
		  
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS); 
		driver.get("https://staging.mylestones.com/");
		WebElement registerButtonDriver=driver.findElement(By.className("btn btn-danger btn-register register_button_redirect"));
		registerButtonDriver.click();
	}
}
