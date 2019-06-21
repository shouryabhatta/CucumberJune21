package testngfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertion {
	@Test
	public void Test1() {
		System.out.println("Test 1 Started");

		Assert.assertTrue(20>18,"Error Message");
		System.out.println("Test 1 Completed");
	}
	@Test
	public void Test2() {
		System.out.println("Test 2 Started");
		Assert.assertTrue(18>20, "Error Message1");
		System.out.println("Test 2 Completed");
	}
	@Test
	public void Test3() {
		System.out.println("Test 3 Started");
		Assert.assertFalse("Hello".equals("Hii"), "Error-Both messagess are diff.");
		System.out.println("Test 3 Completed");
	}
}
