package demoExcel;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class TestMeAppLoginDD {
	WebDriver driver;
	WebDriverWait wait;
	
	
  @Test(dataProvider = "credentials")
  public void f(String username, String password) {
	 driver.get("http://10.232.237.143:443/TestMeApp/");
	 driver.findElement(By.linkText("SignIn")).click();
	 driver.findElement(By.name("userName")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	 driver.findElement(By.name("Login")).click();
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignOut")));
	 driver.findElement(By.linkText("SignOut")).click();
	 
	 
  }

  @DataProvider(name="credentials")
  public Object[][] getData() throws IOException {
    return MyExcelReader.ReadData();
    
    
     
    }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  wait=new WebDriverWait(driver,30);
	  
  }
   @AfterTest
   public void afterTest() {
   }
   }


