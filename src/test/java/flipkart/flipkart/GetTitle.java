package flipkart.flipkart;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTitle extends BaseClasss {
	@Test(groups = {"one","two"})
	public static void GetTitle() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.getTitle();
		System.out.println("dirver title is Title 2"+driver.getTitle());
	}
	@Test(groups = {"one"})
	public static void GetTitle1() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.getTitle();
		System.out.println("dirver title is Title 2"+driver.getTitle());
	}

}
