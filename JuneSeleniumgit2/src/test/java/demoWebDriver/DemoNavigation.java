package demoWebDriver;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemoNavigation {
	WebDriver driver;
	@Test
	public void f() throws InterruptedException {
		driver.get("http://www.google.com");
		Thread.sleep(10000);
		driver.navigate().to("https://www.seleniumhq.org/");
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
		String homeTitle=driver.getTitle();
		System.out.println("Home page title is :+ homeTitle");
		Assert.assertEquals(homeTitle, "Google");
		driver.navigate().forward();
		Thread.sleep(10000);
		String homeTitle1=driver.getTitle();
		System.out.println("Home page title is :+ homeTitle1");
		Assert.assertEquals(homeTitle1, "Selenium - Web Browser Automation");
		driver.navigate().refresh();
		System.out.println("Page Refreshed");
	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
	}

}
