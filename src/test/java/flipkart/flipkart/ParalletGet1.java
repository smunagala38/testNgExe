package flipkart.flipkart;

import org.testng.annotations.Test;

public class ParalletGet1 extends BaseConfig {
	

	@Test(groups = {"one","two"})
	public void GetTitle() {
		driver.getTitle();
		System.out.println("dirver title is Title 2"+driver.getTitle());
		System.out.println("This is ParallelGET1 mehtod 11111");
	}
	@Test(groups = {"one"})
	public void GetTitle1() {
		driver.getTitle();
		System.out.println("dirver title is Title 2"+driver.getTitle());
		System.out.println("This is ParallelGET1 mehtod222222222");
	}

}
