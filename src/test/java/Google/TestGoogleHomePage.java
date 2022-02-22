package Google;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DriverFactory.DriverFactory;

public class TestGoogleHomePage extends DriverFactory  {

	@BeforeMethod
	private void launchBrowser() {
		setup();
	}
	
	@AfterMethod
	private void closeBrowser() {
		tearDown();
	}
	
	@Test
	private void checkGooglePage() {
		
		System.out.println("Fetching Google Home Page");
		driver.get("https://www.google.com");
		
		Assert.assertEquals(driver.getTitle(), "Google", "Actual title is not matching with expected one");
		
	}
	
}
