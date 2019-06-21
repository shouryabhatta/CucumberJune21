package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logintest {
	WebDriver driver;



	@Given("User is on home page")
	public void user_is_on_home_page() {
		System.out.println("User is on home page");
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");

	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		LoginOR repository= new LoginOR(driver);
		System.out.println("User enters username and password");
		repository.usern.sendKeys("tomsmith");
		repository.passw.sendKeys("SuperSecretPassword!");
		repository.login.click();

	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
		System.out.println("User logged in successfully");


	}



}
