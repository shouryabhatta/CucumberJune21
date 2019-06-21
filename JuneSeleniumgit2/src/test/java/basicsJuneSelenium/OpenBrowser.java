package basicsJuneSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver;
      System.setProperty("webdriver.chrome.driver","resources//chromedriver.exe");
      driver=new ChromeDriver(); //open browser
      driver.manage().window().maximize();
      
      driver.get("https://www.accenture.com/");
     Thread.sleep(60000);
     driver.close();
	}

}
