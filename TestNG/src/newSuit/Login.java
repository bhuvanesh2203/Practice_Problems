package newSuit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement webElement=driver.findElement(By.xpath("//a[text()='Login']"));
		Thread.sleep(1000);
		//webElement.click();
		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].click()", webElement);
		System.out.println("clicked");
		//driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]")).sendKeys("bhuvanesh2203@gmail.com");
		driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- _3mctLh VJZDxU')]")).sendKeys("bhuvan1998");
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd _3AWRsL')]")).click();
		
		
	}
}
