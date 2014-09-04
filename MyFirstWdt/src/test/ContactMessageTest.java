package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObject.ContactPage;
import pageObject.ContactResultPage;
import pageObject.HomePage;


public class ContactMessageTest {
	WebDriver driver; 

	@Before
	public void testSetup(){
		driver = new FirefoxDriver();
		
	}
	@After
	public void testShutDown(){
		driver.quit();
		
	}
	@Test
	public void shouldSendContactMessage(){
		HomePage home = new HomePage(driver);
		home = home.navigateToWebapp(); 
		ContactPage contact = home.clickOnContact();
		ContactResultPage result = contact.fillFormWithData().submitForm(); 
		
		Assert.assertTrue(result.returnConfirmationMessage().contains("Many thanks for your"));
	}
	
}
