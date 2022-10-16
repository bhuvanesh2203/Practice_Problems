
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gears {
	@Test(priority = -1)
	public void a() {
		long inital=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://chromedriver.chromium.org/downloads");
		driver.quit();
		long end=System.currentTimeMillis();
		System.out.println("timetaken"+(end-inital));
	}
	@Test(priority = 0, enabled=true)
	public void bh() {
		System.out.println("b");
	}
	@Test(dependsOnMethods ="bh")
	public void c() {
		System.out.println("c");
	}
	@Test
	public void d() {
		System.out.println("d");
	}
}
