package flipkart.flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseConfig {
	
	protected WebDriver driver;
	
	public void setDriver(WebDriver driver) {
		this.driver =driver;
	}
	public WebDriver getDriver() {
		return driver;
	}
	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod(@Optional String browser) {
		browser = (browser==null)?"chrome":browser;
		switch(browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
			driver = new ChromeDriver();
		break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
			driver = new ChromeDriver();
		break;
		case "ie":
			System.setProperty("webdriver.internetExplorer.driver", "Drivers//IEDriverServer.exe");
			driver = new ChromeDriver();
		break;
		}
		driver.manage().window().maximize();
		
		driver.get("https://www.fb.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		System.out.println("started close");
		driver.close();
		driver.quit();
	}
}
