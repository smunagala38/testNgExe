package flipkart.flipkart;

import org.testng.annotations.Test;

public class ExampleClass extends BeforeClass {

	@Test(groups = {"one","two"})
	public static void Get() {
		System.out.println("FitstMethod one 1 execute");
	}
	@Test(groups = {"one"})
	public static void Get2() {
		System.out.println("FitstMethod one2222 execute");
	}
}
