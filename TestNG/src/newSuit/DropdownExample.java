package newSuit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import org.openqa.selenium.support.ui.Select;



public class DropdownExample {
	
		@Test
		public void test1() {
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Dropdown.html");
			WebElement dropdownElement=driver.findElement(By.id   ("dropdown1"));
			Select dropdown1= new Select(dropdownElement);
			dropdown1.
			dropdown1.selectByIndex(3);
			List<WebElement> list=dropdown1.getOptions();
			System.out.println("list of elements :"+list.size());
			
			
			
		}

}
