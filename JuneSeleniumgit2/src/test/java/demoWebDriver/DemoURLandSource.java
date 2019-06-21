package demoWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoURLandSource {
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe" );
		 
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
	  
  @Test
  public void f() {
	  driver.get("https://en.wikipedia.org/wiki/Main_Page");
	  driver.findElement(By.linkText("History")).click();
	  String url=driver.getCurrentUrl();
	  System.out.println("Current Page URL is :+url");
	  System.out.println("Page source is :"+driver.getPageSource());
  }
}
