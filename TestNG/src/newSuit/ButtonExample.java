package newSuit;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonExample {
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		WebElement color =driver.findElement(By.id("color"));
		System.out.println("the colour of the buuton is :"+color.getCssValue("background-color"));
		WebElement size =driver.findElement(By.id("position"));
		System.out.println("height :"+size.getSize().getHeight()+" width :"+size.getSize().getWidth());
		WebElement location =driver.findElement(By.xpath("//*[@id=\"position\"]"));
		System.out.println("x location :"+location.getLocation().getX());
		driver.close();
	} 

}
