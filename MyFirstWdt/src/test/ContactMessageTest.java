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


public class ContactMessageTest extends AbstractWebDriverTest {
	
	@Before
	public void testSetUp(){
		home.navigateToWebapp(); 
	}
	
	@Test
	public void shouldSendContactMessage(){
		ContactPage contact = home.clickOnContact();
		ContactResultPage result = contact.fillFormWithData().submitForm(); 
		
		Assert.assertTrue(result.returnConfirmationMessage().contains("Many thanks for your"));
	}
	
}
