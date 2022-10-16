package newSuit;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PageAutoCompleteExample {

	
	
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
        driver.get("http://leafground.com/pages/autoComplete.html");
        driver.findElement(By.xpath("//input[contains(@class,'ui-autocomplete-input')]")).sendKeys("s");
        name(driver, 10, driver.findElement(By.xpath("//*[@id=\\\"tags\\\"]/li")));
       List<WebElement> list=   driver.findElements(By.xpath("//*[@id=\"tags\"]/li"));
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
 
       System.out.println("sizw :"+list.size());
        
       for (WebElement webElement : list) {
    	//  
		if (webElement.getText().equals("Selenium")) {
			webElement.click();
			break;
			
		}
	}
	}
	
	public  void name(WebDriver driver,int timeout,WebElement webElement) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(webElement));
		webElement.click();
}}
