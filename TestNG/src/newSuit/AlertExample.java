package newSuit;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertExample {
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");//thhhhh 
		driver.manage().getCookies();

		/*
		 * WebElement alert1= driver.findElement(By.xpath(
		 * "//*[@id=\"contentblock\"]/section/div[1]/div/div/button")); alert1.click();
		 * Alert alertok= driver.switchTo().alert(); alertok.accept();
		 */

		
		/*
		 * WebElement alert2= driver.findElement(By.xpath(
		 * "//*[@id=\"contentblock\"]/section/div[2]/div/div/button")); alert2.click();
		 * Thread.sleep(1000); Alert alertcancel= driver.switchTo().alert();
		 * alertcancel.dismiss();
		 */  
		  
			
			  WebElement alert3= driver.findElement(By.xpath(
			  "//*[@id=\"contentblock\"]/section/div[3]/div/div/button")); 
			  alert3.click();
			  Alert alertsendkeys= driver.switchTo().alert();
			  Thread.sleep(1000);
			  Set<String> set=driver.getWindowHandles();
			  for(String a1:set) {
				  driver.switchTo().window(a1);
				  if(driver.getTitle().equals("String")) {
					  break;
				  }
			  }
			  
			  alertsendkeys.sendKeys("bajreda chita");
			  Thread.sleep(6000);
			  alertsendkeys.accept();
			 
			  
			  // .isSelected() method returns boolean if the radio button is selected or not
		 
		 
	}

}