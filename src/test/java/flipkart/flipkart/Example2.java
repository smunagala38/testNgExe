package flipkart.flipkart;

import org.testng.annotations.Test;

public class Example2 extends BeforeClass {

//	@Test(groups = {"one","reg"},enabled = true)
//	public static void Get33() {
//		System.out.println("FitstMethod 33333execute");
//	}
//	@Test(groups = {"name"},enabled = true)
//	public static void Get() {
//		System.out.println("FitstMethod 33333execute");
//	}
//	@Test(alwaysRun = true,dependsOnGroups = "name",dependsOnMethods = "Get33")
//	public static void Get44() {
//		System.out.println("FitstMethod alwaysrun TestCase");
//	}
//	//retryAnlyzer invocationcount threadpoolsize priorty 
	@Test(invocationCount = 8,threadPoolSize = 3)
	public static void Get944() {
		System.out.println("************invocations count alwaysrun TestCase"+Thread.currentThread().getId());
	}
	
	
}
