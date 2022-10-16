package newSuit;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TimoutandWaitExample {
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.close();
		driver.get("https://www.facebook.com/login.php?skip_api_login=1&api_key=269872980435166&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv3.3%2Fdialog%2Fshare%3Fchannel%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fx%252Fconnect%252Fxd_arbiter%252F%253Fversion%253D46%2523cb%253Df99895943ba59%2526domain%253Dwww.idphotodiy.com%2526origin%253Dhttps%25253A%25252F%25252Fwww.idphotodiy.com%25252Ff365337315733d%2526relation%253Dopener%26redirect_uri%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fx%252Fconnect%252Fxd_arbiter%252F%253Fversion%253D46%2523cb%253Df2b326beab1623c%2526domain%253Dwww.idphotodiy.com%2526origin%253Dhttps%25253A%25252F%25252Fwww.idphotodiy.com%25252Ff365337315733d%2526relation%253Dopener%2526frame%253Df28b72d7e0f533c%2526result%253D%252522xxRESULTTOKENxx%252522%26display%3Dpopup%26href%3Dhttps%253A%252F%252Fwww.idphotodiy.com%252F%26client_id%3D269872980435166%26ret%3Dlogin%26sdk%3Djoey%26fallback_redirect_uri%3Dhttps%253A%252F%252Fwww.idphotodiy.com%252Fselect-single-photo.php&cancel_url=https%3A%2F%2Fstaticxx.facebook.com%2Fx%2Fconnect%2Fxd_arbiter%2F%3Fversion%3D46%23cb%3Df2b326beab1623c%26domain%3Dwww.idphotodiy.com%26origin%3Dhttps%253A%252F%252Fwww.idphotodiy.com%252Ff365337315733d%26relation%3Dopener%26frame%3Df28b72d7e0f533c%26result%3D%257B%2522error_code%2522%253A4201%252C%2522error_message%2522%253A%2522User%2Bcanceled%2Bthe%2BDialog%2Bflow%2522%257D%26error_code%3D4201%26error_message%3DUser%2Bcanceled%2Bthe%2BDialog%2Bflow%26e2e%3D%257B%257D&display=popup&locale=en_GB");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement webElement=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/a"));
		name(driver,10,webElement);
		Thread.sleep(10000);
		driver.quit();
		
		
		
	}

	
	
	public  void name(WebDriver driver,int timeout,WebElement webElement) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(webElement));
		webElement.click();
		
	}
}
