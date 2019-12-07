package flipkart.flipkart;

import org.testng.annotations.Test;

public class ParallelGet2 extends BaseConfig{


	@Test(groups = {"one"})
	public void Main() {
		System.out.println(driver.getTitle());
		System.out.println("This is ParallelGET2222 mehtod 333");
	}

}
