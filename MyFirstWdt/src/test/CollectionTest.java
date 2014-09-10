package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pageObject.ContactPage;
import pageObject.ContactResultPage;

public class CollectionTest extends AbstractWebDriverTest {
	
	@Before
	public void testSetUp(){
		home.navigateToWebapp(); 
	}
	
	@Test
	public void collectionTest(){
		ContactPage contact = home.collectionTest();
		//ContactPage contact = home.clickOnContact();
		ContactResultPage result = contact.fillFormWithData().submitForm(); 
		
		Assert.assertTrue(result.returnConfirmationMessage().contains("Many thanks for your"));
	}
	
}