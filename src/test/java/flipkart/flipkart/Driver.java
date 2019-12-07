package flipkart.flipkart;

import org.openqa.selenium.WebDriver;

public class Driver {
	
	public static ThreadLocal<WebDriver> Driver = new ThreadLocal<WebDriver>();
	
	public static void set(WebDriver driver) {
		Driver.set(driver);
	}
	public static WebDriver get() {
		return Driver.get();
	}
}
