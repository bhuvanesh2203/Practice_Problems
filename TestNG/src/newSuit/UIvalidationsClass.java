package newSuit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class UIvalidationsClass {
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("iphone");
	 WebElement webElement=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		webElement.sendKeys("ddddd");
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("cfgg");
		System.out.println("The texrt is :"+driver.findElement(By.name("username")).getAttribute("value"));
		
		/*
		 * driver.findElement(By.id("email")).sendKeys("bhuvaesng@hm.com");
		 * System.out.println("1st done"); wait(1000000); driver.findElement(By.xpath(
		 * "//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("cfgg");
		 * wait(1000000); System.out.println("2st done");
		 * System.out.println(driver.findElement(By.name("username")).getText());
		 * wait(1000000); driver.findElement(By.xpath(
		 * "//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		 */
		
		driver.quit();
		
	}
	@Test
	public void test2() {
		
		
	}

}