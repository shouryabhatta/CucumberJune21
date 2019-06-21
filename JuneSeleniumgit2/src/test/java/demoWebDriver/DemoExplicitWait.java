package demoWebDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoExplicitWait {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://accounts.google.com/signin/v2/identifier?service=CPanel&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Shourya");
		 driver.findElement(By.xpath("//span[contains(.,'Next')])[2]")).click();
		 WebDriverWait wait=new WebDriverWait(driver,30);
		 WebElement passW=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@type,'password')]")));
		 System.out.println(passW);
		 Assert.assertNotNull(passW);
		 
			 
				 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);}

  

  @AfterTest
  public void afterTest() {
  }

}
