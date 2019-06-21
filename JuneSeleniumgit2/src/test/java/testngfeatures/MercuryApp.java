package testngfeatures;

import org.testng.annotations.Test;

public class MercuryApp {
	@Test(priority=1)
	public void openBrowser() {
		System.out.println("This is an OpenBrowser");
	}
	@Test(priority=2)
	public void OpenUrl() {
		System.out.println("This is an URL");
	}
	@Test(priority=3)
	public void login() {
		System.out.println("This is an Login");
	}
	@Test(priority=4,enabled=false)
	public void searchFlight() {
		System.out.println("This is SearchFlight");
	}
	@Test(priority=5)
	public void bookFlight() {
		System.out.println("This is BookFlight");
	}
	@Test(priority=6)
	public void logout() {
		System.out.println("This is logout");
	} @Test(priority=7)
	public void closeBrowser() {
		System.out.println("This is an closeBrowser");
	}}