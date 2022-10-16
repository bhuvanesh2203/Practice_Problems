package newSuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class parallelexecution {
	SoftAssert SoftAssert =new SoftAssert();
	@BeforeSuite
	public void setproperty() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
	}
	@Test
	public void openamazon()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	}
	@Test
	public void openflipkart()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/lenovo-legion-5-ryzen-hexa-core-4600h-8-gb-512-gb-ssd-windows-10-home-4-graphics-nvidia-geforce-gtx-1650-120-hz-15arh05-gaming-laptop/product-questions/itmb78cdb12e2bfc?pid=COMGY8Y5AV5W5YKG");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	}
	@Test
	public void openyoutube()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=TQ3BLcSOrmY");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	}
	 @AfterSuite
	public void after() {
		 System.out.println("last program");
		//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
		SoftAssert.assertEquals("C:\\\\drivers\\\\chrome\\\\chromedriver.exe", "not trur");
		SoftAssert.assertAll();
	}
}
