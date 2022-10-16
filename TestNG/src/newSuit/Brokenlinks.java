package newSuit;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Brokenlinks {
@Test
public void facebook() throws MalformedURLException, IOException
{
	char c=0;
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	List <WebElement> l1= driver.findElements(By.tagName("a"));
	l1.addAll(driver.findElements(By.tagName("img")));
	List<WebElement> l2=new ArrayList<WebElement>();
	System.out.println("l1"+l1.size());
	
	for(int i=0;i<l1.size();i++) {
		if(l1.get(i).getAttribute("href")!=null) {
		l2.add(l1.get(i));
		System.out.println(l1.get(i).getAttribute("href"));
		}
	}
		System.out.println("l2"+l2.size());
		for(int i = 0;i<l2.size();i++) {
			HttpURLConnection sConnection=(HttpURLConnection)new URL(l2.get(i).getAttribute("href")).openConnection();
			String string=sConnection.getResponseMessage();
			System.out.println(l2.get(i).getAttribute("href")+"--->"+string);
		}
	
	driver.quit();
	

}}
