package basicsJuneSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DynamicWait {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://demo.automationtesting.in/Alerts.html");

  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

  }
  
  @Test
  public void DynamicWait() {
	  driver.get("http://demo.automationtesting.in/Alerts.html");
	  driver.findElement(By.xpath("//a[contains(.,'Alert with textbox')]")).click();
  }
  @AfterTest
  public void afterTest() {
  }

}
