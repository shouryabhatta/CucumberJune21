package demoExcel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class EndToEndScenario {
	WebDriver driver;
	@Test
	public void f() throws InterruptedException {

		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.findElement(By.xpath("//a[contains(.,'SignIn')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys("Lalitha");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("HAND");
		driver.findElement(By.xpath("//input[contains(@value,'FIND DETAILS')]")).click();
		driver.findElement(By.xpath("(//a[@href='#'][contains(.,'Add to cart')])[1]")).click();
		driver.findElement(By.partialLinkText("Cart")).click();
		driver.findElement(By.xpath("//a[contains(.,'Checkout')]")).click();
		driver.findElement(By.xpath("//textarea[@name='ShippingAdd']")).sendKeys("Chennai,TAMIL NADU");
		driver.findElement(By.xpath("//input[contains(@value,'Proceed to Pay')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[contains(.,'HDFC Bank')]"));
	driver.findElement(By.xpath("//a[contains(@onclick,'radioValue()')]")).click();
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("123457");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Pass@457");
		
		
	}
	@BeforeTest
	public void beforeTest() {System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe" );
	driver=new ChromeDriver();
	driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
	}

}
