package flipkart.flipkart;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeClass {
	
	@BeforeSuite(alwaysRun = true)
	public static void beforeSuite() {
		System.out.println("before suite Execuite");
	}
	@BeforeTest(alwaysRun = true)
	public static void beforeTest() {
		System.out.println("before Test Execuite");
	}
	@org.testng.annotations.BeforeClass(alwaysRun = true)
	public static void beforeClass() {
		
		System.out.println("before Class Execuite");
	}
	@BeforeMethod(alwaysRun = true)
	public static void beforeMethod() {
		System.out.println("before Method Execuite");
	}
	@AfterMethod(alwaysRun = true)
	public static void Aftermethod() {
		System.out.println("After method Execuite");
	}
	@AfterClass(alwaysRun = true)
	public static void AfterClass() {
		System.out.println("after Class Execuite");
	}
	@AfterTest(alwaysRun = true)
	public static void AfterTest() {
		System.out.println("after test Execuite");
	}
	@AfterSuite(alwaysRun = true)
	public static void AfterSuite() {
		System.out.println("after suite Execuite");
	}

}
