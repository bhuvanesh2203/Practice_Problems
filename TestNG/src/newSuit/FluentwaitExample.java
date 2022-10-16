package newSuit;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FluentwaitExample {
	@Test
	public void test1() {
		
		int a ;
		System.out.println(a);
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\drivers\\chrome\\chromedriver.exe"); WebDriver driver = new
		  ChromeDriver(); driver.manage().window().maximize();
		  driver.get("https://www.amazon.in/"); Wait<WebDriver> waitfluWait=new
		  FluentWait<WebDriver>
		  (driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(
		  10)).ignoring(NoSuchElementException.class);
		  
		  WebElement customer=waitfluWait.until(new Function<WebDriver,WebElement>(){
		  
		  
		  public WebElement apply(WebDriver WebElement) { // TODO Auto-generated method
		   return driver.findElement(By.xpath("/[@id=\"nav-xshop\"]/a[7]")); }
		  
		  });
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  customer.click();
		 System.setProperty("webdriver.chrome.driver",
				  "C:\\drivers\\chrome\\chromedriver.exe"); WebDriver driver = new
				  ChromeDriver();
        	
		WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
     driver.manage().timeouts().implicitlyWait(a, null)   
	}
        	
        
	
	
	}
