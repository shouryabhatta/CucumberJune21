package testngfeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoExecutionSequence {
	@Test
	public void f() {
		System.out.println("I'm in @Test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I'm in @BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I'm in @AfterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I'm in @BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I'm in @AfterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I'm in @BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I'm in @AfterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I'm in @BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I'm in @AfterSuite");
	}

}
