package demoWebDriver;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DemoRegisterTest {
	WebDriver driver;
	@Test
	public void f() {
		driver.get("http://newtours.demoaut.com/");
		String homeTitle=driver.getTitle();
		System.out.println("Home page title is :+ homeTitle");
		Assert.assertEquals( homeTitle, "Welcome: Mercury Tours");
		driver.findElement(By.partialLinkText("GISTER")).click();
		//System.out.println("Register Page link:"+driver.getTitle());
		//Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Shourya");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Bhatta");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9880016327");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("shouryabhatta");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Ranchi");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Ranchi");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Jharkhand");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("834002");
		Select objbname=new Select(driver.findElement(By.name("country")));
		objbname.selectByVisibleText("PATAL LOK");
		
		
		driver.findElement(By.xpath("//input[@name='register']")).click();
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
