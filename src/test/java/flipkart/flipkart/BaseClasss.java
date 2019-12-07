package flipkart.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClasss {
	public static WebDriver driver;
	@BeforeMethod(alwaysRun = true)
	public static void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.fb.com");
	}
	@AfterMethod(alwaysRun = true)
	public static void aftermethod() {
		driver.close();
		System.out.println("this is colsing the driver");
		driver.quit();
	}

}
