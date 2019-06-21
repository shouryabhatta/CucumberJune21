package handsOn;

import org.testng.annotations.Test;

import demoExcel.MyExcelReader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class PaymentOption {
	WebDriver driver;

  @Test(dataProvider = "payments")
  public void f(String username , String password,String bankname,String bankusername,String bankpassword,String transactionpw) throws InterruptedException {

		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.findElement(By.xpath("//a[contains(.,'SignIn')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys(username);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(password);
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("HAND");
		driver.findElement(By.xpath("//input[contains(@value,'FIND DETAILS')]")).click();
		driver.findElement(By.xpath("(//a[@href='#'][contains(.,'Add to cart')])[1]")).click();
		driver.findElement(By.partialLinkText("Cart")).click();
		driver.findElement(By.xpath("//a[contains(.,'Checkout')]")).click();
		driver.findElement(By.xpath("//textarea[@name='ShippingAdd']")).sendKeys("Chennai,TAMIL NADU");
		driver.findElement(By.xpath("//input[contains(@value,'Proceed to Pay')]")).click();
		Thread.sleep(4000);
		 		switch(bankname) {
		case("Andhra Bank"):
		driver.findElement(By.xpath("//label[contains(.,'Andhra Bank')]")).click();
		driver.findElement(By.xpath("//a[contains(@onclick,'radioValue()')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(bankusername);
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys(bankpassword);
		driver.findElement(By.xpath("//input[contains(@value,'LOGIN')]")).click();
		driver.findElement(By.xpath("//input[contains(@value,'PASSWORD')]")).sendKeys(transactionpw);
		driver.findElement(By.xpath("//input[contains(@value,'PayNow')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'SignOut')]")).click();
		break;
		
		case("HDFC Bank"):
			driver.findElement(By.xpath("//div[@class='radio'][contains(.,'HDFC Bank')]")).click();
		driver.findElement(By.xpath("//a[contains(@onclick,'radioValue()')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(bankusername);
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys(bankpassword);
		driver.findElement(By.xpath("//input[contains(@value,'LOGIN')]")).click();
		driver.findElement(By.xpath("//input[contains(@value,'PASSWORD')]")).sendKeys(transactionpw);
		driver.findElement(By.xpath("//input[contains(@value,'PayNow')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'SignOut')]")).click();
		break;
			
		}
		
			
		}
  

  @DataProvider(name="payments")
  public Object[][] dp() throws IOException {
    return MyExcelReader.ReadData();
    
     

  }
  @BeforeClass
  public void beforeClass() 
  {System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe" );
	driver=new ChromeDriver();
	driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
