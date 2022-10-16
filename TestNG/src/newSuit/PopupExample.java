package newSuit;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupExample {
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		String parentString=driver.getWindowHandle();
		
		driver.findElement(By.id("home")).click();
		Set<String> windowhandleSet=driver.getWindowHandles();
		//driver.manage().window().
		Iterator<String> itrIterator=windowhandleSet.iterator();
		String child=itrIterator.next();
		 driver.switchTo().window(child);
		 Thread.sleep(5000);
		 driver.close();
		 
		 driver.switchTo().window(parentString);
		 Thread.sleep(5000);
		 driver.close();
		
		
		
		
		
	}

}
